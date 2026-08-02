package io.ably.lib.transport;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.Ac3Util;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.network.EngineType;
import io.ably.lib.network.NotConnectedException;
import io.ably.lib.network.WebSocketClient;
import io.ably.lib.network.WebSocketEngine;
import io.ably.lib.network.WebSocketEngineConfig;
import io.ably.lib.network.WebSocketEngineFactory;
import io.ably.lib.network.WebSocketListener;
import io.ably.lib.transport.ITransport;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.ProtocolSerializer;
import io.ably.lib.util.ClientOptionsUtils;
import io.ably.lib.util.Log;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.ssl.SSLContext;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public class WebSocketTransport implements ITransport {
    private static final int ABNORMAL_CLOSE = 1006;
    private static final int BUGGYCLOSE = -2;
    private static final int CLOSE_NORMAL = 1000;
    private static final int CLOSE_PROTOCOL_ERROR = 1002;
    private static final int EXTENSION = 1010;
    private static final int GOING_AWAY = 1001;
    private static final int NEVER_CONNECTED = -1;
    private static final int NO_UTF8 = 1007;
    private static final int POLICY_VALIDATION = 1008;
    private static final int REFUSE = 1003;
    private static final String TAG = "io.ably.lib.transport.WebSocketTransport";
    private static final int TLS_ERROR = 1015;
    private static final int TOOBIG = 1009;
    private static final int UNEXPECTED_CONDITION = 1011;
    private final boolean channelBinaryMode;
    private ITransport.ConnectListener connectListener;
    private final ConnectionManager connectionManager;
    private final ITransport.TransportParams params;
    private WebSocketClient webSocketClient;
    private final WebSocketEngine webSocketEngine;
    private WebSocketHandler webSocketHandler;
    private String wsUri;
    private boolean activityCheckTurnedOff = false;
    private boolean connectHasBeenCalled = false;

    interface WebSocketReceiver {
        void onMessage(ProtocolMessage protocolMessage) throws AblyException;
    }

    protected void preProcessReceivedMessage(ProtocolMessage protocolMessage) {
    }

    protected WebSocketTransport(ITransport.TransportParams transportParams, ConnectionManager connectionManager) {
        this.params = transportParams;
        this.connectionManager = connectionManager;
        this.channelBinaryMode = transportParams.options.useBinaryProtocol;
        this.webSocketEngine = createWebSocketEngine(transportParams);
        transportParams.heartbeats = !r3.isPingListenerSupported();
    }

    private static WebSocketEngine createWebSocketEngine(ITransport.TransportParams transportParams) {
        WebSocketEngineFactory firstAvailable = WebSocketEngineFactory.getFirstAvailable();
        Log.v(TAG, String.format("Using %s WebSocket Engine", firstAvailable.getEngineType().name()));
        WebSocketEngineConfig.WebSocketEngineConfigBuilder builder = WebSocketEngineConfig.builder();
        builder.tls(transportParams.options.tls).host(transportParams.host).proxy(ClientOptionsUtils.convertToProxyConfig(transportParams.getClientOptions()));
        if (transportParams.options.tls && firstAvailable.getEngineType() != EngineType.OKHTTP) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                builder.sslSocketFactory(new SafeSSLSocketFactory(sSLContext.getSocketFactory()));
            } catch (KeyManagementException | NoSuchAlgorithmException e) {
                throw new IllegalStateException("Can't get safe tls algorithms", e);
            }
        }
        return firstAvailable.create(builder.build());
    }

    @Override // io.ably.lib.transport.ITransport
    public void connect(ITransport.ConnectListener connectListener) {
        ensureConnectCalledOnce();
        this.connectListener = connectListener;
        try {
            this.wsUri = (this.params.options.tls ? "wss://" : "ws://") + this.params.host + AbstractJsonLexerKt.COLON + this.params.port + "/";
            Param[] connectParams = this.params.getConnectParams(this.connectionManager.getAuthParams());
            if (connectParams.length > 0) {
                this.wsUri = HttpUtils.encodeParams(this.wsUri, connectParams);
            }
            Log.d(TAG, "connect(); wsUri = " + this.wsUri);
            WebSocketHandler webSocketHandler = new WebSocketHandler(new WebSocketReceiver() { // from class: io.ably.lib.transport.WebSocketTransport$$ExternalSyntheticLambda0
                @Override // io.ably.lib.transport.WebSocketTransport.WebSocketReceiver
                public final void onMessage(ProtocolMessage protocolMessage) {
                    WebSocketTransport.this.receive(protocolMessage);
                }
            });
            this.webSocketHandler = webSocketHandler;
            WebSocketClient create = this.webSocketEngine.create(this.wsUri, webSocketHandler);
            this.webSocketClient = create;
            create.connect();
        } catch (AblyException e) {
            Log.e(TAG, "Unexpected exception attempting connection; wsUri = " + this.wsUri, e);
            connectListener.onTransportUnavailable(this, e.errorInfo);
        } catch (Throwable th) {
            Log.e(TAG, "Unexpected exception attempting connection; wsUri = " + this.wsUri, th);
            connectListener.onTransportUnavailable(this, AblyException.fromThrowable(th).errorInfo);
        }
    }

    private synchronized void ensureConnectCalledOnce() {
        if (this.connectHasBeenCalled) {
            throw new IllegalStateException("WebSocketTransport is already initialized");
        }
        this.connectHasBeenCalled = true;
    }

    @Override // io.ably.lib.transport.ITransport
    public void close() {
        String str = TAG;
        Log.d(str, "close()");
        WebSocketClient webSocketClient = this.webSocketClient;
        WebSocketHandler webSocketHandler = this.webSocketHandler;
        if (webSocketClient == null || webSocketHandler == null) {
            Log.w(str, "close() called on uninitialized or already closed transport");
        } else {
            webSocketHandler.flagActivity();
            webSocketClient.close();
        }
    }

    @Override // io.ably.lib.transport.ITransport
    public void receive(ProtocolMessage protocolMessage) throws AblyException {
        this.connectionManager.onMessage(this, protocolMessage);
    }

    @Override // io.ably.lib.transport.ITransport
    public void send(ProtocolMessage protocolMessage) throws AblyException {
        String str = TAG;
        Log.d(str, "send(); action = " + protocolMessage.action);
        try {
            if (this.channelBinaryMode) {
                byte[] writeMsgpack = ProtocolSerializer.writeMsgpack(protocolMessage);
                if (Log.level <= 2) {
                    ProtocolMessage readMsgpack = ProtocolSerializer.readMsgpack(writeMsgpack);
                    Log.v(str, "send(): " + readMsgpack.action + ": " + new String(ProtocolSerializer.writeJSON(readMsgpack)));
                }
                this.webSocketClient.send(writeMsgpack);
                return;
            }
            if (Log.level <= 2) {
                Log.v(str, "send(): ".concat(new String(ProtocolSerializer.writeJSON(protocolMessage))));
            }
            this.webSocketClient.send(ProtocolSerializer.writeJSON(protocolMessage));
        } catch (NotConnectedException e) {
            ITransport.ConnectListener connectListener = this.connectListener;
            if (connectListener != null) {
                connectListener.onTransportUnavailable(this, AblyException.fromThrowable(e).errorInfo);
                return;
            }
            throw AblyException.fromThrowable(e);
        } catch (Exception e2) {
            throw AblyException.fromThrowable(e2);
        }
    }

    @Override // io.ably.lib.transport.ITransport
    public String getHost() {
        return this.params.host;
    }

    protected void turnOffActivityCheckIfPingListenerIsNotSupported() {
        if (this.webSocketEngine.isPingListenerSupported()) {
            return;
        }
        this.activityCheckTurnedOff = true;
    }

    public String toString() {
        return WebSocketTransport.class.getName() + " {" + getURL() + "}";
    }

    @Override // io.ably.lib.transport.ITransport
    public String getURL() {
        return this.wsUri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isActiveTransport() {
        return this.connectionManager.isActiveTransport(this);
    }

    public static class Factory implements ITransport.Factory {
        @Override // io.ably.lib.transport.ITransport.Factory
        public WebSocketTransport getTransport(ITransport.TransportParams transportParams, ConnectionManager connectionManager) {
            return new WebSocketTransport(transportParams, connectionManager);
        }
    }

    class WebSocketHandler implements WebSocketListener {
        private volatile long lastActivityTime;
        private final WebSocketReceiver receiver;
        private final Timer timer = new Timer();
        private volatile TimerTask activityTimerTask = null;
        private final Object activityTimerMonitor = new Object();

        WebSocketHandler(WebSocketReceiver webSocketReceiver) {
            this.receiver = webSocketReceiver;
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onOpen() {
            Log.d(WebSocketTransport.TAG, "onOpen()");
            WebSocketTransport.this.connectListener.onTransportAvailable(WebSocketTransport.this);
            flagActivity();
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onMessage(ByteBuffer byteBuffer) {
            try {
                ProtocolMessage readMsgpack = ProtocolSerializer.readMsgpack(byteBuffer.array());
                Log.d(WebSocketTransport.TAG, "onMessage(): msg (binary) = " + readMsgpack);
                WebSocketTransport.this.preProcessReceivedMessage(readMsgpack);
                this.receiver.onMessage(readMsgpack);
            } catch (AblyException e) {
                Log.e(WebSocketTransport.TAG, "Unexpected exception processing received binary message", e);
            }
            flagActivity();
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onMessage(String str) {
            try {
                ProtocolMessage fromJSON = ProtocolSerializer.fromJSON(str);
                Log.d(WebSocketTransport.TAG, "onMessage(): msg (text) = " + fromJSON);
                WebSocketTransport.this.preProcessReceivedMessage(fromJSON);
                this.receiver.onMessage(fromJSON);
            } catch (AblyException e) {
                Log.e(WebSocketTransport.TAG, "Unexpected exception processing received text message", e);
            }
            flagActivity();
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onWebsocketPing() {
            Log.d(WebSocketTransport.TAG, "onWebsocketPing()");
            flagActivity();
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onClose(int i, String str) {
            ErrorInfo errorInfo;
            Log.d(WebSocketTransport.TAG, "onClose(): wsCode = " + i + "; wsReason = " + str + "; remote = false");
            if (i != -2 && i != -1 && i != 1000 && i != 1001) {
                if (i != 1003) {
                    if (i != 1006) {
                        if (i != 1008) {
                            if (i == 1009) {
                                errorInfo = ConnectionManager.REASON_TOO_BIG;
                            } else {
                                errorInfo = ConnectionManager.REASON_FAILED;
                            }
                            WebSocketTransport.this.connectListener.onTransportUnavailable(WebSocketTransport.this, errorInfo);
                            dispose();
                        }
                    }
                }
                errorInfo = ConnectionManager.REASON_REFUSED;
                WebSocketTransport.this.connectListener.onTransportUnavailable(WebSocketTransport.this, errorInfo);
                dispose();
            }
            errorInfo = ConnectionManager.REASON_DISCONNECTED;
            WebSocketTransport.this.connectListener.onTransportUnavailable(WebSocketTransport.this, errorInfo);
            dispose();
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onError(Throwable th) {
            Log.e(WebSocketTransport.TAG, "Connection error ", th);
            WebSocketTransport.this.connectListener.onTransportUnavailable(WebSocketTransport.this, new ErrorInfo(th.getMessage(), TypedValues.PositionType.TYPE_PERCENT_WIDTH, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND));
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onOldJavaVersionDetected(Throwable th) {
            Log.w(WebSocketTransport.TAG, "Error when trying to set SSL parameters, most likely due to an old Java API version", th);
        }

        private void dispose() {
            this.timer.cancel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void flagActivity() {
            if (WebSocketTransport.this.isActiveTransport()) {
                this.lastActivityTime = System.currentTimeMillis();
                WebSocketTransport.this.connectionManager.setLastActivity(this.lastActivityTime);
            }
            if (WebSocketTransport.this.connectionManager.maxIdleInterval == 0) {
                Log.v(WebSocketTransport.TAG, "checkActivity: turned off because maxIdleInterval is 0");
            } else if (WebSocketTransport.this.activityCheckTurnedOff) {
                Log.v(WebSocketTransport.TAG, "checkActivity: turned off for test purpose");
            } else {
                checkActivity();
            }
        }

        private void checkActivity() {
            long activityTimeout = getActivityTimeout();
            if (activityTimeout == 0) {
                Log.v(WebSocketTransport.TAG, "checkActivity: infinite timeout");
            } else {
                if (this.activityTimerTask != null) {
                    return;
                }
                synchronized (this.activityTimerMonitor) {
                    if (this.activityTimerTask == null) {
                        startActivityTimer(activityTimeout + 100);
                    }
                }
            }
        }

        private void startActivityTimer(long j) {
            this.activityTimerTask = new TimerTask() { // from class: io.ably.lib.transport.WebSocketTransport.WebSocketHandler.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    try {
                        WebSocketHandler.this.onActivityTimerExpiry();
                    } catch (Exception e) {
                        Log.e(WebSocketTransport.TAG, "Unexpected exception in activity timer handler", e);
                        WebSocketTransport.this.webSocketClient.cancel(1006, "Activity timer closed unexpectedly");
                    }
                }
            };
            schedule(this.activityTimerTask, j);
        }

        private void schedule(TimerTask timerTask, long j) {
            try {
                this.timer.schedule(timerTask, j);
            } catch (IllegalStateException e) {
                Log.w(WebSocketTransport.TAG, "Timer has already has been canceled", e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onActivityTimerExpiry() {
            long activityTimeout = getActivityTimeout() - (System.currentTimeMillis() - this.lastActivityTime);
            if (activityTimeout <= 0) {
                Log.e(WebSocketTransport.TAG, "No activity for " + getActivityTimeout() + "ms, closing connection");
                WebSocketTransport.this.webSocketClient.cancel(1006, "timed out");
                return;
            }
            synchronized (this.activityTimerMonitor) {
                this.activityTimerTask = null;
                Log.v(WebSocketTransport.TAG, "onActivityTimerExpiry: ok");
                startActivityTimer(activityTimeout + 100);
            }
        }

        private long getActivityTimeout() {
            return WebSocketTransport.this.connectionManager.maxIdleInterval + WebSocketTransport.this.params.options.realtimeRequestTimeout;
        }
    }
}
