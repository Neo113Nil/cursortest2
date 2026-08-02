package io.intercom.android.nexus;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
class NexusSocket {
    private static final WebSocket CLOSED_SOCKET = new WebSocket() { // from class: io.intercom.android.nexus.NexusSocket.4
        @Override // okhttp3.WebSocket
        public void cancel() {
        }

        @Override // okhttp3.WebSocket
        public boolean close(int i, String str) {
            return false;
        }

        @Override // okhttp3.WebSocket
        public long queueSize() {
            return 0L;
        }

        @Override // okhttp3.WebSocket
        public boolean send(String str) {
            return false;
        }

        @Override // okhttp3.WebSocket
        public boolean send(ByteString byteString) {
            return false;
        }

        @Override // okhttp3.WebSocket
        /* renamed from: request */
        public Request getOriginalRequest() {
            throw new NullPointerException("ClosedSocket has no request");
        }
    };
    private static final String HEADER = "?X-Nexus-Version=android.1.3.0";
    private static final int MAX_RECONNECT_TIME_SECONDS = 900;
    private static final int N_TIMEOUT_DISCONNECT = 4001;
    private static final int OK_CLIENT_DISCONNECT = 4000;
    private final OkHttpClient client;
    private final long connectionTimeoutSeconds;
    private final NexusListener listener;
    private ScheduledFuture reconnectFuture;
    private final boolean shouldSendPing;
    private final ScheduledExecutorService timeoutExecutor;
    private ScheduledFuture timeoutFuture;
    private final NexusTopicProvider topicProvider;
    private final Twig twig;
    private final String url;
    private WebSocket socket = CLOSED_SOCKET;
    private final Runnable timeoutRunnable = new Runnable() { // from class: io.intercom.android.nexus.NexusSocket.1
        @Override // java.lang.Runnable
        public void run() {
            NexusSocket.this.timedOut();
        }
    };
    private long lastReconnectAt = 0;
    private int reconnectAttempts = 0;
    private final WebSocketListener webSocketListener = new WebSocketListener() { // from class: io.intercom.android.nexus.NexusSocket.3
        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            NexusSocket.this.twig.internal("onOpen: " + response.message());
            NexusSocket.this.socket = webSocket;
            NexusSocket.this.resetTimeout();
            List<String> topics = NexusSocket.this.topicProvider.getTopics();
            if (!topics.isEmpty()) {
                NexusSocket.this.fire(NexusEvent.getSubscribeEvent(topics).toStringEncodedJsonObject());
            }
            if (NexusSocket.this.shouldSendPing) {
                NexusSocket.this.fire(NexusEvent.getPingEvent().toStringEncodedJsonObject());
            }
            NexusSocket.this.listener.onConnect();
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            NexusSocket.this.resetTimeout();
            parseJsonString(str);
        }

        private void parseJsonString(String str) {
            if (str.isEmpty() || str.equals(" ") || str.endsWith("|")) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("eventName");
                if (!optString.isEmpty() && !optString.equals("ACK")) {
                    NexusSocket.this.twig.internal("onMessage TEXT: " + str);
                    NexusSocket.this.listener.notifyEvent(new NexusEvent(jSONObject));
                    return;
                }
                NexusSocket.this.twig.internal("onMessage ACK: " + str);
            } catch (JSONException e) {
                NexusSocket.this.twig.internal("onMessage: json parse exception for message: '" + str + " " + e);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, ByteString byteString) {
            NexusSocket.this.twig.internal("Received bytes message " + byteString + ", resetting timeout");
            NexusSocket.this.resetTimeout();
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i, String str) {
            NexusSocket.this.twig.internal("Server requested close:  " + i + " - '" + str + "'");
            webSocket.close(i, str);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i, String str) {
            if (i != NexusSocket.OK_CLIENT_DISCONNECT) {
                NexusSocket.this.scheduleReconnect();
            } else {
                NexusSocket.this.shutdown();
            }
            NexusSocket.this.twig.internal("onClose code: " + i + " reason: " + str);
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            if (NexusSocket.shouldReconnectFromFailure(th, response)) {
                NexusSocket.this.scheduleReconnect();
            } else {
                NexusSocket.this.shutdown();
            }
            NexusSocket.this.twig.internal("onFailure: " + th.getMessage());
            NexusSocket.this.listener.onConnectFailed();
        }
    };

    NexusSocket(String str, int i, boolean z, Twig twig, ScheduledExecutorService scheduledExecutorService, OkHttpClient okHttpClient, NexusListener nexusListener, NexusTopicProvider nexusTopicProvider) {
        this.url = str;
        this.connectionTimeoutSeconds = i;
        this.shouldSendPing = z;
        this.twig = twig;
        this.listener = nexusListener;
        this.topicProvider = nexusTopicProvider;
        this.client = okHttpClient;
        this.timeoutExecutor = scheduledExecutorService;
    }

    void connect() {
        this.twig.d("connecting to a socket...", new Object[0]);
        this.client.newWebSocket(new Request.Builder().url(this.url + HEADER).build(), this.webSocketListener);
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    void fire(String str) {
        if (str.isEmpty()) {
            return;
        }
        try {
            this.twig.internal("firing: " + str);
            this.socket.send(str);
        } catch (IllegalStateException e) {
            this.twig.internal("Error when firing '" + str + "': " + e);
        }
    }

    void disconnect() {
        disconnect(OK_CLIENT_DISCONNECT, "Disconnect called by client");
    }

    boolean isConnected() {
        return this.socket != CLOSED_SOCKET;
    }

    private void disconnect(int i, String str) {
        if (this.socket.close(i, str)) {
            return;
        }
        this.twig.internal("Could not close socket while disconnecting, it may be already closed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void timedOut() {
        if (this.socket == CLOSED_SOCKET) {
            scheduleReconnect();
        } else {
            disconnect(4001, "Socket timed out");
        }
        this.listener.onConnectFailed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetTimeout() {
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleReconnect() {
        if (this.reconnectFuture != null) {
            return;
        }
        modifyReconnectAttempts();
        long calculateReconnectTimerInSeconds = calculateReconnectTimerInSeconds(this.reconnectAttempts);
        this.twig.internal("Scheduling reconnect in: " + calculateReconnectTimerInSeconds + " for attempt: " + this.reconnectAttempts);
        this.reconnectFuture = this.timeoutExecutor.schedule(new Runnable() { // from class: io.intercom.android.nexus.NexusSocket.2
            @Override // java.lang.Runnable
            public void run() {
                NexusSocket.this.connect();
                NexusSocket.this.reconnectFuture = null;
            }
        }, calculateReconnectTimerInSeconds, TimeUnit.SECONDS);
    }

    private void modifyReconnectAttempts() {
        if (System.currentTimeMillis() - this.lastReconnectAt > TimeUnit.SECONDS.toMillis(900L) * 2) {
            this.twig.d("resetting reconnection attempts", new Object[0]);
            this.reconnectAttempts = 1;
        } else {
            this.twig.d("incrementing reconnection attempts", new Object[0]);
            this.reconnectAttempts++;
        }
        this.lastReconnectAt = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdown() {
        this.socket = CLOSED_SOCKET;
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.listener.onShutdown();
    }

    static long calculateReconnectTimerInSeconds(int i) {
        int min = (int) Math.min(Math.pow(2.0d, i), 900.0d);
        return min + new Random().nextInt(min + 1);
    }

    static boolean shouldReconnectFromFailure(Throwable th, Response response) {
        if (response == null && th != null && isAndroidLifecycleException(th)) {
            return false;
        }
        if (response == null) {
            return true;
        }
        int code = response.code();
        return code >= 500 && code <= 599;
    }

    private static boolean isAndroidLifecycleException(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        if (th instanceof SocketTimeoutException) {
            return message.contains("Read timed out") && message.length() < 50;
        }
        if (th instanceof ConnectException) {
            return message.contains("Connection refused") || message.contains("Network unreachable");
        }
        if (th instanceof SocketException) {
            return message.contains("Software caused connection abort") || message.contains("Connection reset by peer") || message.contains("Connection reset") || message.contains("Broken pipe") || message.contains("Socket closed");
        }
        if (th instanceof IllegalStateException) {
            return message.contains("WebSocket is closed") || message.contains(MetricTracker.Action.CLOSED);
        }
        if (th instanceof UnknownHostException) {
            return message.contains("Unable to resolve host") || message.contains("No address associated with hostname");
        }
        if (th instanceof IOException) {
            return message.contains("Unexpected end of stream") || message.contains("Stream was reset") || message.contains("Connection closed");
        }
        return false;
    }
}
