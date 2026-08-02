package com.asterinet.react.tcpsocket;

import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class TcpEventListener {
    private final DeviceEventManagerModule.RCTDeviceEventEmitter rctEvtEmitter;

    public TcpEventListener(ReactContext reactContext) {
        this.rctEvtEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    public void onConnection(int i, int i2, Socket socket) {
        onSocketConnection("connection", i, i2, socket);
    }

    public void onSecureConnection(int i, int i2, Socket socket) {
        onSocketConnection("secureConnection", i, i2, socket);
    }

    private void onSocketConnection(String str, int i, int i2, Socket socket) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i2);
        WritableMap createMap3 = Arguments.createMap();
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
        createMap3.putString("localAddress", socket.getLocalAddress().getHostAddress());
        createMap3.putInt("localPort", socket.getLocalPort());
        createMap3.putString("remoteAddress", inetSocketAddress.getAddress().getHostAddress());
        createMap3.putInt("remotePort", socket.getPort());
        createMap3.putString("remoteFamily", inetSocketAddress.getAddress() instanceof Inet6Address ? "IPv6" : "IPv4");
        createMap2.putMap("connection", createMap3);
        createMap.putMap("info", createMap2);
        sendEvent(str, createMap);
    }

    public void onConnect(int i, TcpSocketClient tcpSocketClient) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        WritableMap createMap2 = Arguments.createMap();
        Socket socket = tcpSocketClient.getSocket();
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
        createMap2.putString("localAddress", socket.getLocalAddress().getHostAddress());
        createMap2.putInt("localPort", socket.getLocalPort());
        createMap2.putString("remoteAddress", inetSocketAddress.getAddress().getHostAddress());
        createMap2.putInt("remotePort", socket.getPort());
        createMap2.putString("remoteFamily", inetSocketAddress.getAddress() instanceof Inet6Address ? "IPv6" : "IPv4");
        createMap.putMap("connection", createMap2);
        sendEvent("connect", createMap);
    }

    public void onListen(int i, TcpSocketServer tcpSocketServer) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        WritableMap createMap2 = Arguments.createMap();
        ServerSocket serverSocket = tcpSocketServer.getServerSocket();
        InetAddress inetAddress = serverSocket.getInetAddress();
        createMap2.putString("localAddress", serverSocket.getInetAddress().getHostAddress());
        createMap2.putInt("localPort", serverSocket.getLocalPort());
        createMap2.putString("localFamily", inetAddress instanceof Inet6Address ? "IPv6" : "IPv4");
        createMap.putMap("connection", createMap2);
        sendEvent("listening", createMap);
    }

    public void onData(int i, byte[] bArr) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("data", Base64.encodeToString(bArr, 2));
        sendEvent("data", createMap);
    }

    public void onWritten(int i, int i2, @Nullable Exception exc) {
        String str;
        if (exc != null) {
            Log.e(TcpSocketModule.TAG, "Exception on socket " + i, exc);
            str = exc.getMessage();
        } else {
            str = null;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putInt("msgId", i2);
        createMap.putString(NotificationCompat.CATEGORY_ERROR, str);
        sendEvent("written", createMap);
    }

    public void onClose(int i, Exception exc) {
        if (exc != null) {
            onError(i, exc);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putBoolean("hadError", exc != null);
        sendEvent(AnalyticsConstantsKt.CLOSE_BUTTON, createMap);
    }

    public void onError(int i, Exception exc) {
        Log.e(TcpSocketModule.TAG, "Exception on socket " + i, exc);
        String message = exc.getMessage();
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("error", message);
        sendEvent("error", createMap);
    }

    private void sendEvent(String str, WritableMap writableMap) {
        this.rctEvtEmitter.emit(str, writableMap);
    }
}
