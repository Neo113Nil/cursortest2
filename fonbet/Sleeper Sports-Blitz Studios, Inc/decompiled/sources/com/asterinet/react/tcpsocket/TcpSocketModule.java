package com.asterinet.react.tcpsocket;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.util.Base64;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class TcpSocketModule extends ReactContextBaseJavaModule {
    private static final int N_THREADS = 2;
    public static final String TAG = "TcpSockets";
    private final CurrentNetwork currentNetwork;
    private final ExecutorService executorService;
    private final ConcurrentHashMap<String, Network> mNetworkMap;
    private final ReactApplicationContext mReactContext;
    private final ConcurrentHashMap<Integer, ReadableMap> pendingTLS;
    private final ConcurrentHashMap<Integer, TcpSocket> socketMap;
    private TcpEventListener tcpEvtListener;

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public TcpSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.socketMap = new ConcurrentHashMap<>();
        this.pendingTLS = new ConcurrentHashMap<>();
        this.mNetworkMap = new ConcurrentHashMap<>();
        this.currentNetwork = new CurrentNetwork();
        this.executorService = Executors.newFixedThreadPool(2);
        this.mReactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.tcpEvtListener = new TcpEventListener(this.mReactContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void connect(final Integer num, final String str, final Integer num2, final ReadableMap readableMap) {
        this.executorService.execute(new Runnable() { // from class: com.asterinet.react.tcpsocket.TcpSocketModule.1
            @Override // java.lang.Runnable
            public void run() {
                if (TcpSocketModule.this.socketMap.get(num) != null) {
                    TcpSocketModule.this.tcpEvtListener.onError(num.intValue(), new Exception("connect() called twice with the same id."));
                    return;
                }
                try {
                    TcpSocketModule.this.selectNetwork(readableMap.hasKey("interface") ? readableMap.getString("interface") : null, readableMap.hasKey("localAddress") ? readableMap.getString("localAddress") : null);
                    TcpSocketClient tcpSocketClient = new TcpSocketClient(TcpSocketModule.this.tcpEvtListener, num, null);
                    TcpSocketModule.this.socketMap.put(num, tcpSocketClient);
                    tcpSocketClient.connect(TcpSocketModule.this.mReactContext, str, num2, readableMap, TcpSocketModule.this.currentNetwork.getNetwork(), (ReadableMap) TcpSocketModule.this.pendingTLS.get(num));
                    TcpSocketModule.this.tcpEvtListener.onConnect(num.intValue(), tcpSocketClient);
                } catch (Exception e) {
                    TcpSocketModule.this.tcpEvtListener.onError(num.intValue(), e);
                }
            }
        });
    }

    @ReactMethod
    public void startTLS(int i, ReadableMap readableMap) {
        TcpSocketClient tcpSocketClient = (TcpSocketClient) this.socketMap.get(Integer.valueOf(i));
        if (tcpSocketClient == null) {
            this.pendingTLS.put(Integer.valueOf(i), readableMap);
            return;
        }
        try {
            tcpSocketClient.startTLS(this.mReactContext, readableMap);
        } catch (Exception e) {
            this.tcpEvtListener.onError(i, e);
        }
    }

    @ReactMethod
    public void write(int i, String str, int i2) {
        getTcpClient(i).write(i2, Base64.decode(str, 2));
    }

    @ReactMethod
    public void end(final Integer num) {
        this.executorService.execute(new Runnable() { // from class: com.asterinet.react.tcpsocket.TcpSocketModule.2
            @Override // java.lang.Runnable
            public void run() {
                TcpSocketModule.this.getTcpClient(num.intValue()).destroy();
            }
        });
    }

    @ReactMethod
    public void destroy(Integer num) {
        end(num);
    }

    @ReactMethod
    public void close(final Integer num) {
        this.executorService.execute(new Runnable() { // from class: com.asterinet.react.tcpsocket.TcpSocketModule.3
            @Override // java.lang.Runnable
            public void run() {
                TcpSocketModule.this.getTcpServer(num.intValue()).close();
                TcpSocketModule.this.socketMap.remove(num);
            }
        });
    }

    @ReactMethod
    public void listen(final Integer num, final ReadableMap readableMap) {
        this.executorService.execute(new Runnable() { // from class: com.asterinet.react.tcpsocket.TcpSocketModule.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TcpSocketServer tcpSocketServer = new TcpSocketServer(TcpSocketModule.this.mReactContext, TcpSocketModule.this.socketMap, TcpSocketModule.this.tcpEvtListener, num, readableMap);
                    TcpSocketModule.this.socketMap.put(num, tcpSocketServer);
                    TcpSocketModule.this.tcpEvtListener.onListen(num.intValue(), tcpSocketServer);
                } catch (Exception e) {
                    TcpSocketModule.this.tcpEvtListener.onError(num.intValue(), e);
                }
            }
        });
    }

    @ReactMethod
    public void setNoDelay(Integer num, boolean z) {
        try {
            getTcpClient(num.intValue()).setNoDelay(z);
        } catch (IOException e) {
            this.tcpEvtListener.onError(num.intValue(), e);
        }
    }

    @ReactMethod
    public void setKeepAlive(Integer num, boolean z, int i) {
        try {
            getTcpClient(num.intValue()).setKeepAlive(z, i);
        } catch (IOException e) {
            this.tcpEvtListener.onError(num.intValue(), e);
        }
    }

    @ReactMethod
    public void pause(int i) {
        getTcpClient(i).pause();
    }

    @ReactMethod
    public void resume(int i) {
        getTcpClient(i).resume();
    }

    private void requestNetwork(int i) throws InterruptedException {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(i);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ((ConnectivityManager) this.mReactContext.getSystemService("connectivity")).requestNetwork(builder.build(), new ConnectivityManager.NetworkCallback() { // from class: com.asterinet.react.tcpsocket.TcpSocketModule.5
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                TcpSocketModule.this.currentNetwork.setNetwork(network);
                countDownLatch.countDown();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                countDownLatch.countDown();
            }
        });
        new ScheduledThreadPoolExecutor(1).schedule(new Runnable() { // from class: com.asterinet.react.tcpsocket.TcpSocketModule.6
            @Override // java.lang.Runnable
            public void run() {
                countDownLatch.countDown();
            }
        }, 5L, TimeUnit.SECONDS);
        countDownLatch.await();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectNetwork(String str, String str2) throws InterruptedException, IOException {
        this.currentNetwork.setNetwork(null);
        if (str == null) {
            return;
        }
        if (str2 != null) {
            Network network = this.mNetworkMap.get(str + str2);
            if (network != null) {
                this.currentNetwork.setNetwork(network);
                return;
            }
        }
        str.hashCode();
        switch (str) {
            case "ethernet":
                requestNetwork(3);
                break;
            case "cellular":
                requestNetwork(0);
                break;
            case "wifi":
                requestNetwork(1);
                break;
        }
        if (this.currentNetwork.getNetwork() == null) {
            throw new IOException("Interface " + str + " unreachable");
        }
        if (str2 == null || str2.equals("0.0.0.0")) {
            return;
        }
        this.mNetworkMap.put(str + str2, this.currentNetwork.getNetwork());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TcpSocketClient getTcpClient(int i) {
        TcpSocket tcpSocket = this.socketMap.get(Integer.valueOf(i));
        if (tcpSocket == null) {
            throw new IllegalArgumentException("No socket with id " + i);
        }
        if (!(tcpSocket instanceof TcpSocketClient)) {
            throw new IllegalArgumentException("Socket with id " + i + " is not a client");
        }
        return (TcpSocketClient) tcpSocket;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TcpSocketServer getTcpServer(int i) {
        TcpSocket tcpSocket = this.socketMap.get(Integer.valueOf(i));
        if (tcpSocket == null) {
            throw new IllegalArgumentException("No server socket with id " + i);
        }
        if (!(tcpSocket instanceof TcpSocketServer)) {
            throw new IllegalArgumentException("Server socket with id " + i + " is not a server");
        }
        return (TcpSocketServer) tcpSocket;
    }

    private static class CurrentNetwork {
        Network network;

        private CurrentNetwork() {
            this.network = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Network getNetwork() {
            return this.network;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetwork(Network network) {
            this.network = network;
        }
    }
}
