package io.ably.lib.transport;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.Ac3Util;
import io.ably.lib.debug.DebugOptions;
import io.ably.lib.http.HttpHelpers;
import io.ably.lib.objects.LiveObjectsPlugin;
import io.ably.lib.realtime.AblyRealtime;
import io.ably.lib.realtime.Channel;
import io.ably.lib.realtime.ChannelState;
import io.ably.lib.realtime.CompletionListener;
import io.ably.lib.realtime.Connection;
import io.ably.lib.realtime.ConnectionState;
import io.ably.lib.realtime.ConnectionStateListener;
import io.ably.lib.rest.Auth;
import io.ably.lib.transport.ITransport;
import io.ably.lib.transport.NetworkConnectivity;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ConnectionDetails;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.ProtocolSerializer;
import io.ably.lib.util.Log;
import io.ably.lib.util.PlatformAgentProvider;
import io.ably.lib.util.ReconnectionStrategy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public class ConnectionManager implements ITransport.ConnectListener {
    private static final long HEARTBEAT_TIMEOUT = 5000;
    private static final String INTERNET_CHECK_OK = "yes";
    private static final String INTERNET_CHECK_URL = "https://internet-up.ably-realtime.com/is-the-internet-up.txt";
    private static final String TAG = "io.ably.lib.transport.ConnectionManager";
    final AblyRealtime ably;
    private final Channels channels;
    private final Connection connection;
    private long connectionStateTtl;
    private CMConnectivityListener connectivityListener;
    private State currentState;
    private int disconnectedRetryAttempt;
    private Thread handlerThread;
    private final Hosts hosts;
    private long lastActivity;
    private String lastUsedHost;
    private final LiveObjectsPlugin liveObjectsPlugin;
    long maxIdleInterval;
    public int maxMessageSize;
    public long msgSerial;
    private ConnectParams pendingConnect;
    private final PlatformAgentProvider platformAgentProvider;
    private final DebugOptions.RawProtocolListener protocolListener;
    private ErrorInfo stateError;
    private final Map<ConnectionState, State> states;
    private boolean suppressRetry;
    private long suspendTime;
    private volatile ITransport transport;
    private final ITransport.Factory transportFactory;
    static ErrorInfo REASON_CLOSED = new ErrorInfo("Can't attach when not in an active state", 200, 10000);
    static ErrorInfo REASON_DISCONNECTED = new ErrorInfo("Connection temporarily unavailable", TypedValues.PositionType.TYPE_PERCENT_WIDTH, 80003);
    static ErrorInfo REASON_SUSPENDED = new ErrorInfo("Connection unavailable", TypedValues.PositionType.TYPE_PERCENT_WIDTH, 80002);
    static ErrorInfo REASON_FAILED = new ErrorInfo("Connection failed", 400, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND);
    static ErrorInfo REASON_REFUSED = new ErrorInfo("Access refused", TypedValues.CycleType.TYPE_CURVE_FIT, 40100);
    static ErrorInfo REASON_TOO_BIG = new ErrorInfo("Connection closed; message too large", 400, 40000);
    final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    private boolean cleaningUpAfterEnteringTerminalState = false;
    private volatile boolean closeRequested = false;
    private final List<QueuedMessage> queuedMessages = new ArrayList();
    private final PendingMessageQueue pendingMessages = new PendingMessageQueue(0 == true ? 1 : 0);
    private final HashSet<Object> heartbeatWaiters = new HashSet<>();
    private final ActionQueue actionQueue = new ActionQueue(0 == true ? 1 : 0);

    private interface Action extends Runnable {
    }

    public interface Channels {
        void onMessage(ProtocolMessage protocolMessage);

        void suspendAll(ErrorInfo errorInfo, boolean z);

        void transferToChannelQueue(List<QueuedMessage> list);

        Iterable<Channel> values();
    }

    public static class StateIndication {
        final String currentHost;
        final String fallback;
        final ErrorInfo reason;
        final ConnectionState state;

        StateIndication(ConnectionState connectionState) {
            this(connectionState, null);
        }

        public StateIndication(ConnectionState connectionState, ErrorInfo errorInfo) {
            this(connectionState, errorInfo, null, null);
        }

        StateIndication(ConnectionState connectionState, ErrorInfo errorInfo, String str, String str2) {
            this.state = connectionState;
            this.reason = errorInfo;
            this.fallback = str;
            this.currentHost = str2;
        }
    }

    public abstract class State {
        public final ErrorInfo defaultErrorInfo;
        public final boolean queueEvents;
        public final boolean sendEvents;
        public final ConnectionState state;
        final boolean terminal;
        public long timeout;

        void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
        }

        StateIndication onTimeout() {
            return null;
        }

        abstract StateIndication validateTransition(StateIndication stateIndication);

        State(ConnectionState connectionState, boolean z, boolean z2, boolean z3, long j, ErrorInfo errorInfo) {
            this.state = connectionState;
            this.queueEvents = z;
            this.sendEvents = z2;
            this.terminal = z3;
            this.timeout = j;
            this.defaultErrorInfo = errorInfo;
        }

        void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            if (connectionStateChange != null) {
                if (this.sendEvents) {
                    ConnectionManager.this.sendQueuedMessages();
                } else if (!this.queueEvents) {
                    ConnectionManager.this.failQueuedMessages(stateIndication.reason);
                }
                Iterator<Channel> it = ConnectionManager.this.channels.values().iterator();
                while (it.hasNext()) {
                    enactForChannel(stateIndication, connectionStateChange, it.next());
                }
            }
        }
    }

    class Initialized extends State {
        Initialized() {
            super(ConnectionState.initialized, true, false, false, 0L, null);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication validateTransition(StateIndication stateIndication) {
            if (stateIndication.state == this.state) {
                return null;
            }
            return stateIndication;
        }
    }

    class Connecting extends State {
        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication validateTransition(StateIndication stateIndication) {
            return stateIndication;
        }

        Connecting() {
            super(ConnectionState.connecting, true, false, false, Defaults.TIMEOUT_CONNECT, null);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication onTimeout() {
            return ConnectionManager.this.checkSuspended(null);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            super.enact(stateIndication, connectionStateChange);
            if (ConnectionManager.this.hasConnectBeenInvokeOnClosedOrFailedState(connectionStateChange)) {
                ConnectionManager.this.cleanMsgSerialAndErrorReason();
            }
            ConnectionManager.this.connectImpl(stateIndication);
        }
    }

    class Connected extends State {
        Connected() {
            super(ConnectionState.connected, false, true, false, 0L, null);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication validateTransition(StateIndication stateIndication) {
            if (stateIndication.state != this.state) {
                return stateIndication;
            }
            ConnectionManager.this.addAction(ConnectionManager.this.new UpdateAction(null));
            return null;
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
            channel.setConnected();
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            super.enact(stateIndication, connectionStateChange);
            ConnectionManager.this.pendingConnect = null;
        }
    }

    class Disconnected extends State {
        @Override // io.ably.lib.transport.ConnectionManager.State
        void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
        }

        Disconnected() {
            super(ConnectionState.disconnected, true, false, false, ConnectionManager.this.ably.options.disconnectedRetryTimeout, ConnectionManager.REASON_DISCONNECTED);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication validateTransition(StateIndication stateIndication) {
            if (stateIndication.state == this.state) {
                return null;
            }
            return stateIndication.state == ConnectionState.closing ? new StateIndication(ConnectionState.closed) : stateIndication;
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication onTimeout() {
            return new StateIndication(ConnectionState.connecting);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            super.enact(stateIndication, connectionStateChange);
            ConnectionManager.this.clearTransport();
            if (connectionStateChange.previous == ConnectionState.connected) {
                ConnectionManager.this.setSuspendTime();
                if (ConnectionManager.this.suppressRetry) {
                    return;
                }
                Log.v(ConnectionManager.TAG, "Was previously connected, retrying immediately");
                ConnectionManager.this.requestState(ConnectionState.connecting);
            }
        }
    }

    class Suspended extends State {
        Suspended() {
            super(ConnectionState.suspended, false, false, false, ConnectionManager.this.ably.options.suspendedRetryTimeout, ConnectionManager.REASON_SUSPENDED);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication validateTransition(StateIndication stateIndication) {
            if (stateIndication.state == this.state) {
                return null;
            }
            return stateIndication.state == ConnectionState.closing ? new StateIndication(ConnectionState.closed) : stateIndication;
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication onTimeout() {
            return new StateIndication(ConnectionState.connecting);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
            channel.setSuspended(this.defaultErrorInfo, true);
        }
    }

    class Closing extends State {
        Closing() {
            super(ConnectionState.closing, false, false, false, Defaults.TIMEOUT_CONNECT, ConnectionManager.REASON_CLOSED);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication validateTransition(StateIndication stateIndication) {
            if (stateIndication.state == this.state) {
                return null;
            }
            return (stateIndication.state == ConnectionState.disconnected || stateIndication.state == ConnectionState.suspended) ? new StateIndication(ConnectionState.closed) : stateIndication;
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication onTimeout() {
            return new StateIndication(ConnectionState.closed);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            super.enact(stateIndication, connectionStateChange);
            if (ConnectionManager.this.closeImpl(connectionStateChange.previous == ConnectionState.connecting)) {
                ConnectionManager.this.addAction(ConnectionManager.this.new AsynchronousStateChangeAction(ConnectionState.closed));
            }
        }
    }

    class Closed extends State {
        Closed() {
            super(ConnectionState.closed, false, false, true, 0L, ConnectionManager.REASON_CLOSED);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication validateTransition(StateIndication stateIndication) {
            if (stateIndication.state == ConnectionState.connecting) {
                return stateIndication;
            }
            return null;
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
            channel.setConnectionClosed(ConnectionManager.REASON_CLOSED);
        }
    }

    class Failed extends State {
        Failed() {
            super(ConnectionState.failed, false, false, true, 0L, ConnectionManager.REASON_FAILED);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        StateIndication validateTransition(StateIndication stateIndication) {
            if (stateIndication.state == ConnectionState.connecting) {
                return stateIndication;
            }
            return null;
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
            channel.setConnectionFailed(stateIndication.reason);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            super.enact(stateIndication, connectionStateChange);
            ConnectionManager.this.clearTransport();
        }
    }

    public ErrorInfo getStateErrorInfo() {
        ErrorInfo errorInfo = this.stateError;
        return errorInfo != null ? errorInfo : this.currentState.defaultErrorInfo;
    }

    public boolean isActive() {
        return this.currentState.queueEvents || this.currentState.sendEvents;
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ConnectionWaiter implements ConnectionStateListener {
        private ConnectionStateListener.ConnectionStateChange change;
        private boolean closed;

        /* synthetic */ ConnectionWaiter(ConnectionManager connectionManager, AnonymousClass1 anonymousClass1) {
            this();
        }

        private ConnectionWaiter() {
            this.closed = false;
            ConnectionManager.this.connection.on(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized ErrorInfo waitForChange() {
            ErrorInfo errorInfo;
            if (!this.closed) {
                Log.d(ConnectionManager.TAG, "ConnectionWaiter.waitFor()");
                if (this.change == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                Log.d(ConnectionManager.TAG, "ConnectionWaiter.waitFor done: currentState=" + ConnectionManager.this.currentState + ")");
                errorInfo = this.change.reason;
                this.change = null;
            } else {
                throw new IllegalStateException("Already closed.");
            }
            return errorInfo;
        }

        @Override // io.ably.lib.realtime.ConnectionStateListener
        public synchronized void onConnectionStateChanged(ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            this.change = connectionStateChange;
            notify();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ConnectionManager.this.connection.off(this);
        }
    }

    private abstract class StateChangeAction {
        protected ConnectionStateListener.ConnectionStateChange change;
        protected final StateIndication stateIndication;
        protected final ITransport transport;

        StateChangeAction(ITransport iTransport, StateIndication stateIndication) {
            this.transport = iTransport;
            this.stateIndication = stateIndication;
        }

        protected void setState() {
            this.change = ConnectionManager.this.setState(this.transport, this.stateIndication);
        }

        protected void enactState() {
            ConnectionStateListener.ConnectionStateChange connectionStateChange = this.change;
            if (connectionStateChange != null) {
                if (connectionStateChange.current != this.change.previous) {
                    ConnectionManager.this.connection.onConnectionStateChange(this.change);
                }
                ((State) ConnectionManager.this.states.get(this.stateIndication.state)).enact(this.stateIndication, this.change);
                if (ConnectionManager.this.currentState.terminal) {
                    ConnectionManager.this.clearTransport();
                }
            }
        }
    }

    private class SynchronousStateChangeAction extends StateChangeAction implements Action {
        SynchronousStateChangeAction(ITransport iTransport, StateIndication stateIndication) {
            super(iTransport, stateIndication);
            setState();
        }

        @Override // java.lang.Runnable
        public void run() {
            enactState();
        }
    }

    private class AsynchronousStateChangeAction extends StateChangeAction implements Action {
        AsynchronousStateChangeAction(ConnectionState connectionState) {
            super(null, new StateIndication(connectionState, null));
        }

        AsynchronousStateChangeAction(ITransport iTransport, StateIndication stateIndication) {
            super(iTransport, stateIndication);
        }

        @Override // java.lang.Runnable
        public void run() {
            setState();
            enactState();
        }
    }

    private class ReauthAction implements Action {
        private ReauthAction() {
        }

        /* synthetic */ ReauthAction(ConnectionManager connectionManager, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            ConnectionManager.this.handleReauth();
        }
    }

    private class UpdateAction implements Action {
        private final ErrorInfo reason;

        UpdateAction(ErrorInfo errorInfo) {
            this.reason = errorInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConnectionManager.this.connection.emitUpdate(this.reason);
        }
    }

    private static class ActionQueue extends ArrayDeque<Action> {
        private ActionQueue() {
        }

        /* synthetic */ ActionQueue(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        public synchronized boolean add(Action action) {
            return super.add((ActionQueue) action);
        }

        @Override // java.util.ArrayDeque, java.util.Deque, java.util.Queue
        public synchronized Action poll() {
            return (Action) super.poll();
        }

        @Override // java.util.ArrayDeque, java.util.Deque, java.util.Queue
        public synchronized Action peek() {
            return (Action) super.peek();
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
        public synchronized int size() {
            return super.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void addAction(Action action) {
        this.actionQueue.add(action);
        notifyAll();
    }

    class ActionHandler implements Runnable {
        ActionHandler() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StateIndication onTimeout;
            while (true) {
                synchronized (ConnectionManager.this) {
                    while (true) {
                        if (ConnectionManager.this.actionQueue.size() != 0) {
                            break;
                        }
                        if (ConnectionManager.this.currentState.terminal) {
                            ConnectionManager.this.handlerThread = null;
                            ConnectionManager.this.stopConnectivityListener();
                            ConnectionManager.this.cleaningUpAfterEnteringTerminalState = false;
                            ConnectionManager.this.notifyAll();
                            return;
                        }
                        ConnectionManager connectionManager = ConnectionManager.this;
                        connectionManager.tryWait(connectionManager.currentState.timeout);
                        Action peek = ConnectionManager.this.actionQueue.peek();
                        if (peek != null) {
                            Log.d(ConnectionManager.TAG, "Wait ended by action: " + peek.toString());
                            break;
                        }
                        if (!ConnectionManager.this.suppressRetry && (onTimeout = ConnectionManager.this.currentState.onTimeout()) != null) {
                            ConnectionManager.this.requestState(onTimeout);
                        }
                    }
                }
                while (true) {
                    Action poll = ConnectionManager.this.actionQueue.poll();
                    if (poll != null) {
                        try {
                            poll.run();
                        } catch (Exception e) {
                            Log.e(ConnectionManager.TAG, "Action invocation failed with exception: action = " + poll.toString(), e);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionManager(AblyRealtime ablyRealtime, Connection connection, Channels channels, PlatformAgentProvider platformAgentProvider, LiveObjectsPlugin liveObjectsPlugin) throws AblyException {
        ITransport.Factory factory;
        DebugOptions.RawProtocolListener rawProtocolListener = null;
        HashMap hashMap = new HashMap();
        this.states = hashMap;
        this.connectionStateTtl = Defaults.connectionStateTtl;
        this.maxMessageSize = Defaults.maxMessageSize;
        this.maxIdleInterval = Defaults.maxIdleInterval;
        this.disconnectedRetryAttempt = 0;
        this.ably = ablyRealtime;
        this.connection = connection;
        this.channels = channels;
        this.platformAgentProvider = platformAgentProvider;
        this.liveObjectsPlugin = liveObjectsPlugin;
        ClientOptions clientOptions = ablyRealtime.options;
        this.hosts = new Hosts(clientOptions.realtimeHost, Defaults.HOST_REALTIME, clientOptions);
        if (clientOptions instanceof DebugOptions) {
            DebugOptions debugOptions = (DebugOptions) clientOptions;
            rawProtocolListener = debugOptions.protocolListener;
            factory = debugOptions.transportFactory;
        } else {
            factory = null;
        }
        this.protocolListener = rawProtocolListener;
        this.transportFactory = factory == null ? Defaults.TRANSPORT : factory;
        hashMap.put(ConnectionState.initialized, new Initialized());
        hashMap.put(ConnectionState.connecting, new Connecting());
        hashMap.put(ConnectionState.connected, new Connected());
        hashMap.put(ConnectionState.disconnected, new Disconnected());
        hashMap.put(ConnectionState.suspended, new Suspended());
        hashMap.put(ConnectionState.closing, new Closing());
        hashMap.put(ConnectionState.closed, new Closed());
        hashMap.put(ConnectionState.failed, new Failed());
        this.currentState = (State) hashMap.get(ConnectionState.initialized);
        setSuspendTime();
    }

    public String getHost() {
        return this.lastUsedHost;
    }

    public synchronized State getConnectionState() {
        return this.currentState;
    }

    public synchronized void connect() {
        if (this.currentState.terminal || this.currentState.state == ConnectionState.initialized) {
            try {
                startup();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Log.e(TAG, "Failed to start up connection", e);
                return;
            }
        }
        if (this.closeRequested || this.currentState.terminal) {
            reinitializeChannelsAfterReconnect();
            this.closeRequested = false;
        }
        requestState(ConnectionState.connecting);
    }

    public void close() {
        this.closeRequested = true;
        requestState(ConnectionState.closing);
    }

    public void requestState(ConnectionState connectionState) {
        requestState(new StateIndication(connectionState, null));
    }

    public void requestState(StateIndication stateIndication) {
        requestState(null, stateIndication);
    }

    Param[] getAuthParams() throws AblyException {
        return this.ably.auth.getAuthParams();
    }

    boolean isActiveTransport(WebSocketTransport webSocketTransport) {
        return webSocketTransport == this.transport;
    }

    private synchronized void requestState(ITransport iTransport, StateIndication stateIndication) {
        Log.v(TAG, "requestState(): requesting " + stateIndication.state + "; id = " + this.connection.id);
        addAction(new AsynchronousStateChangeAction(iTransport, stateIndication));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized ConnectionStateListener.ConnectionStateChange setState(ITransport iTransport, StateIndication stateIndication) {
        if (iTransport != null) {
            if (iTransport != this.transport) {
                Log.v(TAG, "setState: action received for superseded transport; discarding");
                return null;
            }
        }
        StateIndication validateTransition = this.currentState.validateTransition(stateIndication);
        if (validateTransition == null) {
            Log.v(TAG, "setState(): not transitioning; not a valid transition " + stateIndication.state);
            return null;
        }
        if (stateIndication.state == ConnectionState.connected || stateIndication.state == ConnectionState.suspended) {
            this.disconnectedRetryAttempt = 0;
        }
        if (stateIndication.state == ConnectionState.disconnected) {
            State state = this.states.get(ConnectionState.disconnected);
            long j = this.ably.options.disconnectedRetryTimeout;
            this.disconnectedRetryAttempt = this.disconnectedRetryAttempt + 1;
            state.timeout = ReconnectionStrategy.getRetryTime(j, r5);
        }
        if (stateIndication.state == ConnectionState.closing || stateIndication.state == ConnectionState.closed || stateIndication.state == ConnectionState.suspended || stateIndication.state == ConnectionState.failed) {
            this.connection.id = null;
            this.connection.key = null;
        }
        ConnectionState connectionState = validateTransition.state;
        State state2 = this.states.get(connectionState);
        ErrorInfo errorInfo = validateTransition.reason;
        if (errorInfo == null) {
            errorInfo = state2.defaultErrorInfo;
        }
        ErrorInfo errorInfo2 = errorInfo;
        Log.v(TAG, "setState(): setting " + state2.state + "; reason " + errorInfo2);
        ConnectionStateListener.ConnectionStateChange connectionStateChange = new ConnectionStateListener.ConnectionStateChange(this.currentState.state, connectionState, state2.timeout, errorInfo2);
        this.currentState = state2;
        this.cleaningUpAfterEnteringTerminalState = state2.terminal;
        this.stateError = errorInfo2;
        return connectionStateChange;
    }

    public void ping(CompletionListener completionListener) {
        HeartbeatWaiter heartbeatWaiter = new HeartbeatWaiter(completionListener);
        if (this.currentState.state == ConnectionState.connected) {
            synchronized (this.heartbeatWaiters) {
                this.heartbeatWaiters.add(heartbeatWaiter);
                heartbeatWaiter.start();
            }
            try {
                send(new ProtocolMessage(ProtocolMessage.Action.heartbeat), false, null);
                return;
            } catch (AblyException e) {
                heartbeatWaiter.onError(e.errorInfo);
                return;
            }
        }
        heartbeatWaiter.onError(new ErrorInfo("Unable to ping service; not connected", 40000, 400));
    }

    private class HeartbeatWaiter extends Thread {
        private final CompletionListener listener;

        HeartbeatWaiter(CompletionListener completionListener) {
            this.listener = completionListener;
        }

        private void onSuccess() {
            clear();
            CompletionListener completionListener = this.listener;
            if (completionListener != null) {
                completionListener.onSuccess();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onError(ErrorInfo errorInfo) {
            clear();
            CompletionListener completionListener = this.listener;
            if (completionListener != null) {
                completionListener.onError(errorInfo);
            }
        }

        private boolean clear() {
            boolean remove = ConnectionManager.this.heartbeatWaiters.remove(this);
            if (remove) {
                interrupt();
            }
            return remove;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean clear;
            synchronized (ConnectionManager.this.heartbeatWaiters) {
                try {
                    ConnectionManager.this.heartbeatWaiters.wait(5000L);
                } catch (InterruptedException unused) {
                }
                clear = clear();
            }
            if (clear) {
                onError(new ErrorInfo("Timed out waiting for heartbeat response", 50000, 500));
            } else {
                onSuccess();
            }
        }
    }

    public void onAuthUpdated(String str, boolean z) throws AblyException {
        ConnectionWaiter connectionWaiter = new ConnectionWaiter(this, null);
        try {
            int i = AnonymousClass1.$SwitchMap$io$ably$lib$realtime$ConnectionState[this.currentState.state.ordinal()];
            if (i == 1) {
                try {
                    ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.auth);
                    protocolMessage.auth = new ProtocolMessage.AuthDetails(str);
                    send(protocolMessage, false, null);
                } catch (AblyException unused) {
                    Log.v(TAG, "onAuthUpdated: closing transport after send failure");
                    this.transport.close();
                }
            } else if (i == 2) {
                Log.v(TAG, "onAuthUpdated: closing connecting transport");
                requestState(new StateIndication(ConnectionState.disconnected, new ErrorInfo("Aborting incomplete connection with superseded auth params", TypedValues.PositionType.TYPE_PERCENT_WIDTH, 80003), null, null));
                connect();
            } else {
                connect();
            }
            if (z) {
                boolean z2 = true;
                while (z2) {
                    ErrorInfo waitForChange = connectionWaiter.waitForChange();
                    ConnectionState connectionState = this.currentState.state;
                    int i2 = AnonymousClass1.$SwitchMap$io$ably$lib$realtime$ConnectionState[connectionState.ordinal()];
                    if (i2 == 1) {
                        Log.v(TAG, "onAuthUpdated: got connected");
                        z2 = false;
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            Log.v(TAG, "onAuthUpdated: throwing exception");
                            throw AblyException.fromErrorInfo(waitForChange);
                        }
                        Log.v(TAG, "onAuthUpdated: " + connectionState);
                    }
                }
            }
        } finally {
            connectionWaiter.close();
        }
    }

    public void onAuthUpdatedAsync(String str, final Auth.AuthUpdateResult authUpdateResult) {
        final ConnectionWaiter connectionWaiter = new ConnectionWaiter(this, null);
        int i = AnonymousClass1.$SwitchMap$io$ably$lib$realtime$ConnectionState[this.currentState.state.ordinal()];
        if (i == 1) {
            try {
                ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.auth);
                protocolMessage.auth = new ProtocolMessage.AuthDetails(str);
                send(protocolMessage, false, null);
            } catch (AblyException unused) {
                Log.v(TAG, "onAuthUpdated: closing transport after send failure");
                this.transport.close();
            }
        } else if (i == 2) {
            Log.v(TAG, "onAuthUpdated: closing connecting transport");
            requestState(new StateIndication(ConnectionState.disconnected, new ErrorInfo("Aborting incomplete connection with superseded auth params", TypedValues.PositionType.TYPE_PERCENT_WIDTH, 80003), null, null));
            connect();
        } else {
            connect();
        }
        this.singleThreadExecutor.execute(new Runnable() { // from class: io.ably.lib.transport.ConnectionManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ConnectionManager.this.m11983xb0c777b8(connectionWaiter, authUpdateResult);
            }
        });
    }

    /* renamed from: lambda$onAuthUpdatedAsync$0$io-ably-lib-transport-ConnectionManager, reason: not valid java name */
    /* synthetic */ void m11983xb0c777b8(ConnectionWaiter connectionWaiter, Auth.AuthUpdateResult authUpdateResult) {
        boolean z = true;
        while (z) {
            ErrorInfo waitForChange = connectionWaiter.waitForChange();
            ConnectionState connectionState = this.currentState.state;
            int i = AnonymousClass1.$SwitchMap$io$ably$lib$realtime$ConnectionState[connectionState.ordinal()];
            if (i == 1) {
                authUpdateResult.onUpdate(true, null);
                Log.v(TAG, "onAuthUpdated: got connected");
            } else if (i == 2 || i == 3) {
                Log.v(TAG, "onAuthUpdated: " + connectionState);
            } else {
                Log.v(TAG, "onAuthUpdated: throwing exception");
                authUpdateResult.onUpdate(false, waitForChange);
            }
            z = false;
        }
        connectionWaiter.close();
    }

    public void onAuthError(ErrorInfo errorInfo) {
        Log.i(TAG, String.format(Locale.ROOT, "onAuthError: (%d) %s", Integer.valueOf(errorInfo.code), errorInfo.message));
        if (errorInfo.statusCode == 403) {
            this.connection.onConnectionStateChange(new ConnectionStateListener.ConnectionStateChange(this.connection.state, ConnectionState.failed, 0L, errorInfo));
            return;
        }
        int i = AnonymousClass1.$SwitchMap$io$ably$lib$realtime$ConnectionState[this.currentState.state.ordinal()];
        if (i != 1) {
            if (i == 2 && this.transport != null) {
                requestState(new StateIndication(ConnectionState.disconnected, errorInfo));
                return;
            }
            return;
        }
        addAction(new UpdateAction(errorInfo));
    }

    public void onMessage(ITransport iTransport, ProtocolMessage protocolMessage) throws AblyException {
        if (iTransport == null || this.transport == iTransport) {
            if (Log.level <= 2) {
                Log.v(TAG, "onMessage() (transport = " + iTransport + "): " + protocolMessage.action + ": " + new String(ProtocolSerializer.writeJSON(protocolMessage)));
            }
            try {
                DebugOptions.RawProtocolListener rawProtocolListener = this.protocolListener;
                if (rawProtocolListener != null) {
                    rawProtocolListener.onRawMessageRecv(protocolMessage);
                }
                switch (AnonymousClass1.$SwitchMap$io$ably$lib$types$ProtocolMessage$Action[protocolMessage.action.ordinal()]) {
                    case 1:
                        onHeartbeat(protocolMessage);
                        return;
                    case 2:
                        ErrorInfo errorInfo = protocolMessage.error;
                        if (errorInfo == null) {
                            Log.e(TAG, "onMessage(): ERROR message received (no error detail)");
                        } else {
                            Log.e(TAG, "onMessage(): ERROR message received; message = " + errorInfo.message + "; code = " + errorInfo.code);
                        }
                        if (protocolMessage.channel != null) {
                            onChannelMessage(protocolMessage);
                            return;
                        } else {
                            onError(protocolMessage);
                            return;
                        }
                    case 3:
                        if (this.currentState.state == ConnectionState.closing) {
                            if (trySendCloseProtocolMessage()) {
                                return;
                            }
                            requestState(ConnectionState.closed);
                            return;
                        }
                        onConnected(protocolMessage);
                        return;
                    case 4:
                    case 5:
                        onDisconnected(protocolMessage);
                        return;
                    case 6:
                        onClosed(protocolMessage);
                        return;
                    case 7:
                        onAck(protocolMessage);
                        return;
                    case 8:
                        onNack(protocolMessage);
                        return;
                    case 9:
                        addAction(new ReauthAction(this, null));
                        return;
                    case 10:
                    case 11:
                        LiveObjectsPlugin liveObjectsPlugin = this.liveObjectsPlugin;
                        if (liveObjectsPlugin != null) {
                            try {
                                liveObjectsPlugin.handle(protocolMessage);
                                return;
                            } catch (Throwable th) {
                                Log.e(TAG, "objectsPlugin threw while handling message", th);
                                return;
                            }
                        }
                        return;
                    default:
                        onChannelMessage(protocolMessage);
                        return;
                }
            } catch (Exception e) {
                throw AblyException.fromThrowable(e);
            }
            throw AblyException.fromThrowable(e);
        }
    }

    /* renamed from: io.ably.lib.transport.ConnectionManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$realtime$ConnectionState;
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$types$ProtocolMessage$Action;

        static {
            int[] iArr = new int[ProtocolMessage.Action.values().length];
            $SwitchMap$io$ably$lib$types$ProtocolMessage$Action = iArr;
            try {
                iArr[ProtocolMessage.Action.heartbeat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.connected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.disconnect.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.disconnected.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.closed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.ack.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.nack.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.auth.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.object.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.object_sync.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[ConnectionState.values().length];
            $SwitchMap$io$ably$lib$realtime$ConnectionState = iArr2;
            try {
                iArr2[ConnectionState.connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ConnectionState[ConnectionState.connecting.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ConnectionState[ConnectionState.disconnected.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private void onChannelMessage(ProtocolMessage protocolMessage) {
        this.channels.onMessage(protocolMessage);
        Connection connection = this.connection;
        connection.recoveryKey = connection.createRecoveryKey();
    }

    private synchronized void onConnected(ProtocolMessage protocolMessage) {
        this.ably.options.recover = null;
        this.connection.reason = protocolMessage.error;
        if (this.connection.id != null) {
            String str = TAG;
            Log.d(str, "There was a connection resume");
            if (protocolMessage.connectionId.equals(this.connection.id)) {
                if (protocolMessage.error == null) {
                    Log.d(str, "connection has reconnected and resumed successfully");
                } else {
                    Log.d(str, "connection resume success with non-fatal error: " + protocolMessage.error.message);
                }
                addPendingMessagesToQueuedMessages(false);
            } else {
                if (protocolMessage.error != null) {
                    Log.d(str, "connection resume failed with error: " + protocolMessage.error.message);
                } else {
                    Log.d(str, "connection resume failed without error");
                }
                addPendingMessagesToQueuedMessages(true);
                this.channels.transferToChannelQueue(extractConnectionQueuePresenceMessages());
            }
        } else {
            this.msgSerial = 0L;
        }
        this.connection.id = protocolMessage.connectionId;
        ConnectionDetails connectionDetails = protocolMessage.connectionDetails;
        this.connection.key = connectionDetails.connectionKey;
        this.maxIdleInterval = connectionDetails.maxIdleInterval.longValue();
        this.connectionStateTtl = connectionDetails.connectionStateTtl.longValue();
        this.maxMessageSize = connectionDetails.maxMessageSize;
        try {
            this.ably.auth.setClientId(connectionDetails.clientId);
            Connection connection = this.connection;
            connection.recoveryKey = connection.createRecoveryKey();
            requestState(new StateIndication(ConnectionState.connected, protocolMessage.error, null, null));
        } catch (AblyException e) {
            requestState(this.transport, new StateIndication(ConnectionState.failed, e.errorInfo));
        }
    }

    private synchronized List<QueuedMessage> extractConnectionQueuePresenceMessages() {
        ArrayList arrayList;
        Iterator<QueuedMessage> it = this.queuedMessages.iterator();
        arrayList = new ArrayList();
        while (it.hasNext()) {
            QueuedMessage next = it.next();
            if (next.msg.presence != null) {
                arrayList.add(next);
                it.remove();
            }
        }
        return arrayList;
    }

    private void addPendingMessagesToQueuedMessages(boolean z) {
        synchronized (this) {
            List<QueuedMessage> popAll = this.pendingMessages.popAll();
            if (z) {
                this.msgSerial = 0L;
            } else if (!popAll.isEmpty()) {
                this.msgSerial = popAll.get(0).msg.msgSerial.longValue();
            }
            this.queuedMessages.addAll(0, popAll);
        }
    }

    public List<QueuedMessage> getPendingMessages() {
        return this.pendingMessages.queue;
    }

    private synchronized void onDisconnected(ProtocolMessage protocolMessage) {
        ErrorInfo errorInfo = protocolMessage.error;
        if (errorInfo != null && isTokenError(errorInfo)) {
            this.ably.auth.onAuthError(errorInfo);
        }
        requestState(new StateIndication(ConnectionState.disconnected, errorInfo));
    }

    private synchronized void onClosed(ProtocolMessage protocolMessage) {
        if (protocolMessage.error != null) {
            onError(protocolMessage);
        } else {
            this.connection.key = null;
            requestState(new StateIndication(ConnectionState.closed, null));
        }
    }

    private synchronized void onError(ProtocolMessage protocolMessage) {
        this.connection.key = null;
        ErrorInfo errorInfo = protocolMessage.error;
        if (isTokenError(errorInfo)) {
            this.ably.auth.onAuthError(errorInfo);
        }
        requestState(this.transport, new StateIndication(isFatalError(errorInfo) ? ConnectionState.failed : ConnectionState.disconnected, errorInfo));
    }

    private void onAck(ProtocolMessage protocolMessage) {
        this.pendingMessages.ack(protocolMessage.msgSerial.longValue(), protocolMessage.count, protocolMessage.error);
    }

    private void onNack(ProtocolMessage protocolMessage) {
        this.pendingMessages.nack(protocolMessage.msgSerial.longValue(), protocolMessage.count, protocolMessage.error);
    }

    private void onHeartbeat(ProtocolMessage protocolMessage) {
        synchronized (this.heartbeatWaiters) {
            this.heartbeatWaiters.clear();
            this.heartbeatWaiters.notifyAll();
        }
    }

    private synchronized void startup() throws InterruptedException {
        while (this.cleaningUpAfterEnteringTerminalState) {
            Log.v(TAG, "Waiting for termination action to clean up handler thread");
            wait();
        }
        if (this.handlerThread == null) {
            Thread thread = new Thread(new ActionHandler());
            this.handlerThread = thread;
            thread.start();
            startConnectivityListener();
        } else {
            Log.v(TAG, "`connect()` has been called twice on uninitialized or terminal state");
        }
    }

    private boolean checkConnectionStale() {
        if (this.lastActivity == 0 || System.currentTimeMillis() - this.lastActivity <= this.maxIdleInterval + this.connectionStateTtl) {
            return false;
        }
        if (this.connection.key == null) {
            return true;
        }
        Log.v(TAG, "Clearing stale connection key to suppress resume");
        this.connection.key = null;
        this.connection.recoveryKey = null;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setSuspendTime() {
        this.suspendTime = System.currentTimeMillis() + this.connectionStateTtl;
    }

    private StateIndication checkFallback(ErrorInfo errorInfo) {
        String fallback;
        if (this.pendingConnect != null && ((errorInfo == null || errorInfo.statusCode >= 500) && checkConnectivity() && (fallback = this.hosts.getFallback(this.pendingConnect.host)) != null)) {
            Log.v(TAG, "checkFallback: fallback to " + fallback);
            return new StateIndication(ConnectionState.connecting, null, fallback, this.pendingConnect.host);
        }
        this.pendingConnect = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized StateIndication checkSuspended(ErrorInfo errorInfo) {
        boolean z;
        long currentTimeMillis = this.suspendTime - System.currentTimeMillis();
        z = currentTimeMillis <= 0;
        Log.v(TAG, "checkSuspended: timeToSuspend = " + currentTimeMillis + "ms; suspendMode = " + z);
        return new StateIndication(z ? ConnectionState.suspended : ConnectionState.disconnected, errorInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryWait(long j) {
        try {
            if (j == 0) {
                wait();
            } else {
                wait(j);
            }
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleReauth() {
        ErrorInfo errorInfo;
        if (this.currentState.state == ConnectionState.connected) {
            Log.v(TAG, "Server initiated reauth");
            try {
                this.ably.auth.renew();
                errorInfo = null;
            } catch (AblyException e) {
                errorInfo = e.errorInfo;
            }
            if (this.currentState.state == ConnectionState.connected) {
                this.connection.emitUpdate(errorInfo);
            }
        }
    }

    @Override // io.ably.lib.transport.ITransport.ConnectListener
    public synchronized void onTransportAvailable(ITransport iTransport) {
        if (this.transport != iTransport) {
            Log.v(TAG, "onTransportAvailable: ignoring connection event from superseded transport");
            return;
        }
        DebugOptions.RawProtocolListener rawProtocolListener = this.protocolListener;
        if (rawProtocolListener != null) {
            rawProtocolListener.onRawConnect(iTransport.getURL());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000e, B:10:0x0015, B:12:0x001d, B:13:0x0020, B:15:0x0028, B:18:0x002f, B:20:0x0035, B:24:0x003c, B:26:0x0042, B:28:0x006b, B:29:0x006f, B:32:0x005b, B:34:0x0061), top: B:3:0x0003 }] */
    @Override // io.ably.lib.transport.ITransport.ConnectListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void onTransportUnavailable(ITransport iTransport, ErrorInfo errorInfo) {
        StateIndication stateIndication;
        String str = TAG;
        Log.v(str, "onTransportUnavailable()");
        if (this.transport != iTransport) {
            Log.v(str, "onTransportUnavailable: ignoring disconnection event from superseded transport");
            return;
        }
        if (this.currentState.state == ConnectionState.connected) {
            setSuspendTime();
        }
        if (this.currentState.state == ConnectionState.closing) {
            requestState(ConnectionState.closed);
            return;
        }
        StateIndication checkFallback = checkFallback(errorInfo);
        if (checkFallback != null) {
            requestState(checkFallback);
            return;
        }
        if (errorInfo != null) {
            if (isFatalError(errorInfo)) {
                Log.e(str, "onTransportUnavailable: unexpected transport error: " + errorInfo.message);
                stateIndication = new StateIndication(ConnectionState.failed, errorInfo);
                if (stateIndication == null) {
                    stateIndication = checkSuspended(errorInfo);
                }
                addAction(new SynchronousStateChangeAction(iTransport, stateIndication));
            }
            if (isTokenError(errorInfo)) {
                this.ably.auth.onAuthError(errorInfo);
            }
        }
        stateIndication = null;
        if (stateIndication == null) {
        }
        addAction(new SynchronousStateChangeAction(iTransport, stateIndication));
    }

    private class ConnectParams extends ITransport.TransportParams {
        ConnectParams(ClientOptions clientOptions, PlatformAgentProvider platformAgentProvider) {
            super(clientOptions, platformAgentProvider);
            this.connectionKey = ConnectionManager.this.connection.key;
            this.port = Defaults.getPort(clientOptions);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectImpl(StateIndication stateIndication) {
        ITransport iTransport;
        String str = stateIndication.fallback;
        if (str == null) {
            str = this.hosts.getPreferredHost();
        }
        checkConnectionStale();
        ConnectParams connectParams = new ConnectParams(this.ably.options, this.platformAgentProvider);
        this.pendingConnect = connectParams;
        connectParams.host = str;
        this.lastUsedHost = str;
        try {
            ITransport transport = this.transportFactory.getTransport(this.pendingConnect, this);
            synchronized (this) {
                iTransport = this.transport;
                this.transport = transport;
            }
            if (iTransport != null) {
                iTransport.close();
            }
            transport.connect(this);
            DebugOptions.RawProtocolListener rawProtocolListener = this.protocolListener;
            if (rawProtocolListener != null) {
                rawProtocolListener.onRawConnectRequested(transport.getURL());
            }
        } catch (Exception e) {
            Log.e(getClass().getName(), "Unable to instance transport class", e);
            throw new RuntimeException("Unable to instance transport class", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanMsgSerialAndErrorReason() {
        this.msgSerial = 0L;
        this.connection.reason = null;
    }

    private void reinitializeChannelsAfterReconnect() {
        for (Channel channel : this.channels.values()) {
            if (channel.state == ChannelState.attached || channel.state == ChannelState.attaching) {
                channel.setConnectionClosed(REASON_CLOSED);
            }
            channel.setReinitialized();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasConnectBeenInvokeOnClosedOrFailedState(ConnectionStateListener.ConnectionStateChange connectionStateChange) {
        return connectionStateChange.previous == ConnectionState.failed || connectionStateChange.previous == ConnectionState.closed || connectionStateChange.previous == ConnectionState.closing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean closeImpl(boolean z) {
        if (this.transport == null) {
            return true;
        }
        if (z) {
            return false;
        }
        return !trySendCloseProtocolMessage();
    }

    private boolean trySendCloseProtocolMessage() {
        try {
            Log.v(TAG, "Requesting connection close");
            this.transport.send(new ProtocolMessage(ProtocolMessage.Action.close));
            return true;
        } catch (AblyException unused) {
            Log.v(TAG, "Closing incomplete transport");
            clearTransport();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransport() {
        if (this.transport != null) {
            this.transport.close();
            this.transport = null;
        }
    }

    protected boolean checkConnectivity() {
        try {
            return HttpHelpers.getUrlString(this.ably.httpCore, INTERNET_CHECK_URL).contains(INTERNET_CHECK_OK);
        } catch (AblyException e) {
            Log.d(TAG, "Exception whilst checking connectivity", e);
            return false;
        }
    }

    protected void setLastActivity(long j) {
        this.lastActivity = j;
    }

    public static class QueuedMessage {
        public final CompletionListener listener;
        public final ProtocolMessage msg;

        public QueuedMessage(ProtocolMessage protocolMessage, CompletionListener completionListener) {
            this.msg = protocolMessage;
            this.listener = completionListener;
        }
    }

    public void send(ProtocolMessage protocolMessage, boolean z, CompletionListener completionListener) throws AblyException {
        synchronized (this) {
            State state = this.currentState;
            if (state.sendEvents) {
                sendImpl(protocolMessage, completionListener);
            } else {
                if (state.queueEvents && z) {
                    this.queuedMessages.add(new QueuedMessage(protocolMessage, completionListener));
                    return;
                }
                throw AblyException.fromErrorInfo(state.defaultErrorInfo);
            }
        }
    }

    private void sendImpl(ProtocolMessage protocolMessage, CompletionListener completionListener) throws AblyException {
        if (this.transport == null) {
            Log.v(TAG, "sendImpl(): Discarding message; transport unavailable");
            return;
        }
        if (ProtocolMessage.ackRequired(protocolMessage)) {
            long j = this.msgSerial;
            this.msgSerial = 1 + j;
            protocolMessage.msgSerial = Long.valueOf(j);
            this.pendingMessages.push(new QueuedMessage(protocolMessage, completionListener));
        }
        DebugOptions.RawProtocolListener rawProtocolListener = this.protocolListener;
        if (rawProtocolListener != null) {
            rawProtocolListener.onRawMessageSend(protocolMessage);
        }
        this.transport.send(protocolMessage);
    }

    private void sendImpl(QueuedMessage queuedMessage) throws AblyException {
        if (this.transport == null) {
            Log.v(TAG, "sendImpl(): Discarding message; transport unavailable");
            return;
        }
        ProtocolMessage protocolMessage = queuedMessage.msg;
        if (ProtocolMessage.ackRequired(protocolMessage)) {
            long j = this.msgSerial;
            this.msgSerial = 1 + j;
            protocolMessage.msgSerial = Long.valueOf(j);
            this.pendingMessages.push(queuedMessage);
        }
        DebugOptions.RawProtocolListener rawProtocolListener = this.protocolListener;
        if (rawProtocolListener != null) {
            rawProtocolListener.onRawMessageSend(protocolMessage);
        }
        this.transport.send(protocolMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendQueuedMessages() {
        synchronized (this) {
            while (!this.queuedMessages.isEmpty()) {
                try {
                    try {
                        QueuedMessage queuedMessage = this.queuedMessages.get(0);
                        if (queuedMessage.msg.action != ProtocolMessage.Action.attach) {
                            sendImpl(queuedMessage);
                        }
                    } catch (AblyException e) {
                        Log.e(TAG, "sendQueuedMessages(): Unexpected error sending queued messages", e);
                    }
                } finally {
                    this.queuedMessages.remove(0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failQueuedMessages(ErrorInfo errorInfo) {
        synchronized (this) {
            for (QueuedMessage queuedMessage : this.queuedMessages) {
                if (queuedMessage.listener != null) {
                    try {
                        queuedMessage.listener.onError(errorInfo);
                    } catch (Throwable th) {
                        Log.e(TAG, "failQueuedMessages(): Unexpected error calling listener", th);
                    }
                }
            }
            this.queuedMessages.clear();
            this.pendingMessages.fail(errorInfo);
        }
    }

    private static class PendingMessageQueue {
        private final List<QueuedMessage> queue;

        private PendingMessageQueue() {
            this.queue = new ArrayList();
        }

        /* synthetic */ PendingMessageQueue(AnonymousClass1 anonymousClass1) {
            this();
        }

        public synchronized void push(QueuedMessage queuedMessage) {
            this.queue.add(queuedMessage);
        }

        public void ack(long j, int i, ErrorInfo errorInfo) {
            QueuedMessage[] queuedMessageArr;
            synchronized (this) {
                if (this.queue.isEmpty()) {
                    return;
                }
                long longValue = this.queue.get(0).msg.msgSerial.longValue();
                if (j < longValue) {
                    i -= (int) (longValue - j);
                    if (i < 0) {
                        i = 0;
                    }
                    j = longValue;
                }
                QueuedMessage[] queuedMessageArr2 = null;
                if (j > longValue) {
                    int i2 = (int) (j - longValue);
                    List<QueuedMessage> subList = this.queue.subList(0, i2);
                    queuedMessageArr = (QueuedMessage[]) subList.toArray(new QueuedMessage[i2]);
                    subList.clear();
                    longValue = j;
                } else {
                    queuedMessageArr = null;
                }
                if (j == longValue) {
                    List<QueuedMessage> subList2 = this.queue.subList(0, i);
                    queuedMessageArr2 = (QueuedMessage[]) subList2.toArray(new QueuedMessage[i]);
                    subList2.clear();
                }
                if (queuedMessageArr != null) {
                    if (errorInfo == null) {
                        errorInfo = new ErrorInfo("Unknown error", 500, 50000);
                    }
                    for (QueuedMessage queuedMessage : queuedMessageArr) {
                        try {
                            if (queuedMessage.listener != null) {
                                queuedMessage.listener.onError(errorInfo);
                            }
                        } catch (Throwable th) {
                            Log.e(ConnectionManager.TAG, "ack(): listener exception", th);
                        }
                    }
                }
                if (queuedMessageArr2 != null) {
                    for (QueuedMessage queuedMessage2 : queuedMessageArr2) {
                        try {
                            if (queuedMessage2.listener != null) {
                                queuedMessage2.listener.onSuccess();
                            }
                        } catch (Throwable th2) {
                            Log.e(ConnectionManager.TAG, "ack(): listener exception", th2);
                        }
                    }
                }
            }
        }

        public synchronized void nack(long j, int i, ErrorInfo errorInfo) {
            synchronized (this) {
                if (this.queue.isEmpty()) {
                    return;
                }
                long longValue = this.queue.get(0).msg.msgSerial.longValue();
                if (j != longValue) {
                    i -= (int) (longValue - j);
                }
                List<QueuedMessage> subList = this.queue.subList(0, i);
                QueuedMessage[] queuedMessageArr = (QueuedMessage[]) subList.toArray(new QueuedMessage[i]);
                subList.clear();
                if (queuedMessageArr != null) {
                    if (errorInfo == null) {
                        errorInfo = new ErrorInfo("Unknown error", 500, 50000);
                    }
                    for (QueuedMessage queuedMessage : queuedMessageArr) {
                        try {
                            if (queuedMessage.listener != null) {
                                queuedMessage.listener.onError(errorInfo);
                            }
                        } catch (Throwable th) {
                            Log.e(ConnectionManager.TAG, "nack(): listener exception", th);
                        }
                    }
                }
            }
        }

        synchronized List<QueuedMessage> popAll() {
            ArrayList arrayList;
            arrayList = new ArrayList(this.queue);
            this.queue.clear();
            return arrayList;
        }

        synchronized void fail(ErrorInfo errorInfo) {
            for (QueuedMessage queuedMessage : this.queue) {
                if (queuedMessage.listener != null) {
                    queuedMessage.listener.onError(errorInfo);
                }
            }
            this.queue.clear();
        }
    }

    private class CMConnectivityListener implements NetworkConnectivity.NetworkConnectivityListener {
        private CMConnectivityListener() {
        }

        /* synthetic */ CMConnectivityListener(ConnectionManager connectionManager, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // io.ably.lib.transport.NetworkConnectivity.NetworkConnectivityListener
        public void onNetworkAvailable() {
            ConnectionManager connectionManager = ConnectionManager.this;
            ConnectionState connectionState = connectionManager.getConnectionState().state;
            Log.i(ConnectionManager.TAG, "onNetworkAvailable(): currentState = " + connectionState.name());
            if (connectionState == ConnectionState.disconnected || connectionState == ConnectionState.suspended) {
                Log.i(ConnectionManager.TAG, "onNetworkAvailable(): initiating reconnect");
                connectionManager.connect();
            }
        }

        @Override // io.ably.lib.transport.NetworkConnectivity.NetworkConnectivityListener
        public void onNetworkUnavailable(ErrorInfo errorInfo) {
            ConnectionManager connectionManager = ConnectionManager.this;
            ConnectionState connectionState = connectionManager.getConnectionState().state;
            Log.i(ConnectionManager.TAG, "onNetworkUnavailable(); currentState = " + connectionState.name() + "; reason = " + errorInfo.toString());
            if (connectionState == ConnectionState.connected || connectionState == ConnectionState.connecting) {
                Log.i(ConnectionManager.TAG, "onNetworkUnavailable(): closing connected transport");
                connectionManager.requestState(new StateIndication(ConnectionState.disconnected, errorInfo));
            }
        }
    }

    private void startConnectivityListener() {
        this.connectivityListener = new CMConnectivityListener(this, null);
        this.ably.platform.getNetworkConnectivity().addListener(this.connectivityListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopConnectivityListener() {
        this.ably.platform.getNetworkConnectivity().removeListener(this.connectivityListener);
        this.connectivityListener = null;
    }

    void disconnectAndSuppressRetries() {
        if (this.transport != null) {
            this.transport.close();
        }
        this.suppressRetry = true;
    }

    private boolean isTokenError(ErrorInfo errorInfo) {
        if (errorInfo.code < 40140 || errorInfo.code >= 40150) {
            return errorInfo.code == 80019 && errorInfo.statusCode == 401;
        }
        return true;
    }

    private boolean isFatalError(ErrorInfo errorInfo) {
        if (errorInfo.code != 0) {
            if (isTokenError(errorInfo)) {
                return false;
            }
            if (errorInfo.code >= 40000 && errorInfo.code < 50000) {
                return true;
            }
        }
        return errorInfo.statusCode != 0 && errorInfo.statusCode < 500;
    }
}
