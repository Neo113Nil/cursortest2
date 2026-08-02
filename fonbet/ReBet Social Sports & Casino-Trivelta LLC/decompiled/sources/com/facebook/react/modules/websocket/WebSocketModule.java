package com.facebook.react.modules.websocket;

import E6.a;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.CustomClientBuilder;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.twilio.voice.EventKeys;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ti.k;

@ReactModule(name = "WebSocketModule")
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 <2\u00020\u0001:\u0002=<B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b*\u0010(J\u001d\u0010*\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b*\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020\u001fH\u0016¢\u0006\u0004\b3\u0010/R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule;", "Lcom/facebook/fbreact/specs/NativeWebSocketModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "eventName", "Lcom/facebook/react/bridge/ReadableMap;", "params", "", "sendEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "", StackTraceHelper.ID_KEY, "message", "notifyWebSocketFailed", "(ILjava/lang/String;)V", "uri", "getCookie", "(Ljava/lang/String;)Ljava/lang/String;", "invalidate", "()V", "Lcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;", "contentHandler", "setContentHandler", "(ILcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;)V", EventKeys.URL, "Lcom/facebook/react/bridge/ReadableArray;", "protocols", "options", "", "socketID", "connect", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;D)V", EventKeys.ERROR_CODE, EventKeys.REASON, "close", "(DLjava/lang/String;D)V", "send", "(Ljava/lang/String;D)V", "base64String", "sendBinary", "Lti/k;", "byteString", "(Lti/k;I)V", "ping", "(D)V", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "", "Lokhttp3/WebSocket;", "webSocketConnections", "Ljava/util/Map;", "contentHandlers", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "cookieHandler", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "Companion", "ContentHandler", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebSocketModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketModule.kt\ncom/facebook/react/modules/websocket/WebSocketModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n*L\n1#1,411:1\n1#2:412\n30#3,3:413\n30#3,3:416\n30#3,3:419\n30#3,3:422\n30#3,3:425\n30#3,3:428\n30#3,3:431\n30#3,3:434\n30#3,3:437\n*S KotlinDebug\n*F\n+ 1 WebSocketModule.kt\ncom/facebook/react/modules/websocket/WebSocketModule\n*L\n228#1:413,3\n233#1:416,3\n255#1:419,3\n260#1:422,3\n282#1:425,3\n287#1:428,3\n309#1:431,3\n314#1:434,3\n332#1:437,3\n*E\n"})
/* loaded from: classes2.dex */
public final class WebSocketModule extends NativeWebSocketModuleSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NAME = "WebSocketModule";

    @Nullable
    private static CustomClientBuilder customClientBuilder;

    @NotNull
    private final Map<Integer, ContentHandler> contentHandlers;

    @NotNull
    private final ForwardingCookieHandler cookieHandler;

    @NotNull
    private final Map<Integer, WebSocket> webSocketConnections;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule$Companion;", "", "<init>", "()V", "NAME", "", "customClientBuilder", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "setCustomClientBuilder", "", "ccb", "applyCustomBuilder", "builder", "Lokhttp3/OkHttpClient$Builder;", "getDefaultOrigin", "uri", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void applyCustomBuilder(OkHttpClient.Builder builder) {
            CustomClientBuilder customClientBuilder = WebSocketModule.customClientBuilder;
            if (customClientBuilder != null) {
                customClientBuilder.apply(builder);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
        
            if (r1.equals("ws") == false) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[Catch: URISyntaxException -> 0x0092, TRY_ENTER, TryCatch #0 {URISyntaxException -> 0x0092, blocks: (B:2:0x0000, B:4:0x000b, B:13:0x0027, B:16:0x0035, B:17:0x004f, B:20:0x0058, B:23:0x0079, B:25:0x002e, B:28:0x003a, B:32:0x0045), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: URISyntaxException -> 0x0092, TRY_LEAVE, TryCatch #0 {URISyntaxException -> 0x0092, blocks: (B:2:0x0000, B:4:0x000b, B:13:0x0027, B:16:0x0035, B:17:0x004f, B:20:0x0058, B:23:0x0079, B:25:0x002e, B:28:0x003a, B:32:0x0045), top: B:1:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String getDefaultOrigin(String uri) {
            String str;
            try {
                URI uri2 = new URI(uri);
                String scheme = uri2.getScheme();
                if (scheme != null) {
                    int hashCode = scheme.hashCode();
                    str = "http";
                    if (hashCode != 3804) {
                        if (hashCode != 118039) {
                            if (hashCode == 3213448) {
                                if (!scheme.equals("http")) {
                                }
                                str = uri2.getScheme();
                            } else if (hashCode == 99617003) {
                                if (!scheme.equals("https")) {
                                }
                                str = uri2.getScheme();
                            }
                        } else if (scheme.equals("wss")) {
                            str = "https";
                        }
                    }
                    if (uri2.getPort() == -1) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("%s://%s:%s", Arrays.copyOf(new Object[]{str, uri2.getHost(), Integer.valueOf(uri2.getPort())}, 3));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        return format;
                    }
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format("%s://%s", Arrays.copyOf(new Object[]{str, uri2.getHost()}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                    return format2;
                }
                str = "";
                if (uri2.getPort() == -1) {
                }
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("Unable to set " + uri + " as default origin header");
            }
        }

        @JvmStatic
        public final void setCustomClientBuilder(@Nullable CustomClientBuilder ccb) {
            WebSocketModule.customClientBuilder = ccb;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;", "", "", "text", "Lcom/facebook/react/bridge/WritableMap;", "params", "", "onMessage", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lti/k;", "byteString", "(Lti/k;Lcom/facebook/react/bridge/WritableMap;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ContentHandler {
        void onMessage(@NotNull String text, @NotNull WritableMap params);

        void onMessage(@NotNull k byteString, @NotNull WritableMap params);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketModule(@NotNull ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.webSocketConnections = new ConcurrentHashMap();
        this.contentHandlers = new ConcurrentHashMap();
        this.cookieHandler = new ForwardingCookieHandler();
    }

    private final String getCookie(String uri) {
        try {
            List<String> list = this.cookieHandler.get(new URI(INSTANCE.getDefaultOrigin(uri)), new HashMap()).get("Cookie");
            List<String> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + uri);
        } catch (URISyntaxException unused2) {
            throw new IllegalArgumentException("Unable to get cookie from " + uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyWebSocketFailed(int id2, String message) {
        WritableMap createMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
        readableMapBuilder.put(StackTraceHelper.ID_KEY, id2);
        readableMapBuilder.put("message", message);
        sendEvent("websocketFailed", createMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String eventName, ReadableMap params) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(eventName, params);
        }
    }

    @JvmStatic
    public static final void setCustomClientBuilder(@Nullable CustomClientBuilder customClientBuilder2) {
        INSTANCE.setCustomClientBuilder(customClientBuilder2);
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double code, @Nullable String reason, double socketID) {
        int i10 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i10));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close((int) code, reason);
            this.webSocketConnections.remove(Integer.valueOf(i10));
            this.contentHandlers.remove(Integer.valueOf(i10));
        } catch (Exception e10) {
            a.n(ReactConstants.TAG, "Could not close WebSocket connection for id " + i10, e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(@NotNull String url, @Nullable ReadableArray protocols, @Nullable ReadableMap options, double socketID) {
        boolean z10;
        Intrinsics.checkNotNullParameter(url, "url");
        final int i10 = (int) socketID;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder readTimeout = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES);
        INSTANCE.applyCustomBuilder(readTimeout);
        OkHttpClient build = readTimeout.build();
        Request.Builder url2 = new Request.Builder().tag(Integer.valueOf(i10)).url(url);
        String cookie = getCookie(url);
        if (cookie != null) {
            url2.addHeader("Cookie", cookie);
        }
        if (options != null && options.hasKey("headers") && options.getType("headers") == ReadableType.Map) {
            ReadableMap map = options.getMap("headers");
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            z10 = false;
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (ReadableType.String == map.getType(nextKey)) {
                    if (StringsKt.equals(nextKey, "origin", true)) {
                        z10 = true;
                    }
                    String string = map.getString(nextKey);
                    if (string == null) {
                        throw new IllegalStateException(("value for name " + nextKey + " == null").toString());
                    }
                    url2.addHeader(nextKey, string);
                } else {
                    a.K(ReactConstants.TAG, "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            url2.addHeader("origin", INSTANCE.getDefaultOrigin(url));
        }
        if (protocols != null && protocols.size() > 0) {
            StringBuilder sb2 = new StringBuilder("");
            int size = protocols.size();
            for (int i11 = 0; i11 < size; i11++) {
                String string2 = protocols.getString(i11);
                String obj = string2 != null ? StringsKt.trim((CharSequence) string2).toString() : null;
                if (!(obj == null || obj.length() == 0) && !StringsKt.contains$default((CharSequence) obj, (CharSequence) ",", false, 2, (Object) null)) {
                    sb2.append(obj);
                    sb2.append(",");
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), "");
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                url2.addHeader("Sec-WebSocket-Protocol", sb3);
            }
        }
        build.newWebSocket(url2.build(), new WebSocketListener() { // from class: com.facebook.react.modules.websocket.WebSocketModule$connect$2
            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int code, String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                int i12 = i10;
                WritableMap createMap = Arguments.createMap();
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
                readableMapBuilder.put(StackTraceHelper.ID_KEY, i12);
                readableMapBuilder.put(EventKeys.ERROR_CODE, code);
                readableMapBuilder.put(EventKeys.REASON, reason);
                WebSocketModule.this.sendEvent("websocketClosed", createMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(WebSocket websocket, int code, String reason) {
                Intrinsics.checkNotNullParameter(websocket, "websocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                websocket.close(code, reason);
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable t10, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(t10, "t");
                WebSocketModule.this.notifyWebSocketFailed(i10, t10.getMessage());
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String text) {
                Map map2;
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(text, "text");
                WritableMap createMap = Arguments.createMap();
                createMap.putInt(StackTraceHelper.ID_KEY, i10);
                createMap.putString("type", "text");
                map2 = WebSocketModule.this.contentHandlers;
                WebSocketModule.ContentHandler contentHandler = (WebSocketModule.ContentHandler) map2.get(Integer.valueOf(i10));
                if (contentHandler != null) {
                    contentHandler.onMessage(text, createMap);
                } else {
                    createMap.putString(EventKeys.DATA, text);
                }
                WebSocketModule.this.sendEvent("websocketMessage", createMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                Map map2;
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(response, "response");
                map2 = WebSocketModule.this.webSocketConnections;
                map2.put(Integer.valueOf(i10), webSocket);
                int i12 = i10;
                WritableMap createMap = Arguments.createMap();
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
                readableMapBuilder.put(StackTraceHelper.ID_KEY, i12);
                readableMapBuilder.put(EventKeys.PROTOCOL, response.header("Sec-WebSocket-Protocol", ""));
                WebSocketModule.this.sendEvent("websocketOpen", createMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, k bytes) {
                Map map2;
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                WritableMap createMap = Arguments.createMap();
                createMap.putInt(StackTraceHelper.ID_KEY, i10);
                createMap.putString("type", "binary");
                map2 = WebSocketModule.this.contentHandlers;
                WebSocketModule.ContentHandler contentHandler = (WebSocketModule.ContentHandler) map2.get(Integer.valueOf(i10));
                if (contentHandler != null) {
                    contentHandler.onMessage(bytes, createMap);
                } else {
                    createMap.putString(EventKeys.DATA, bytes.b());
                }
                WebSocketModule.this.sendEvent("websocketMessage", createMap);
            }
        });
        build.getDispatcher().m1658deprecated_executorService().shutdown();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        Iterator<WebSocket> it = this.webSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().close(1001, null);
        }
        this.webSocketConnections.clear();
        this.contentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double socketID) {
        int i10 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i10));
        if (webSocket != null) {
            try {
                webSocket.send(k.f65868d);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
        readableMapBuilder.put(StackTraceHelper.ID_KEY, i10);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(createMap2);
        readableMapBuilder2.put(StackTraceHelper.ID_KEY, i10);
        readableMapBuilder2.put(EventKeys.ERROR_CODE, 0);
        readableMapBuilder2.put(EventKeys.REASON, "client is null");
        sendEvent("websocketClosed", createMap2);
        this.webSocketConnections.remove(Integer.valueOf(i10));
        this.contentHandlers.remove(Integer.valueOf(i10));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(@NotNull String message, double socketID) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i10 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i10));
        if (webSocket != null) {
            try {
                webSocket.send(message);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
        readableMapBuilder.put(StackTraceHelper.ID_KEY, i10);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(createMap2);
        readableMapBuilder2.put(StackTraceHelper.ID_KEY, i10);
        readableMapBuilder2.put(EventKeys.ERROR_CODE, 0);
        readableMapBuilder2.put(EventKeys.REASON, "client is null");
        sendEvent("websocketClosed", createMap2);
        this.webSocketConnections.remove(Integer.valueOf(i10));
        this.contentHandlers.remove(Integer.valueOf(i10));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(@NotNull String base64String, double socketID) {
        Intrinsics.checkNotNullParameter(base64String, "base64String");
        int i10 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i10));
        if (webSocket != null) {
            try {
                k a10 = k.f65867c.a(base64String);
                if (a10 == null) {
                    throw new IllegalStateException("bytes == null");
                }
                webSocket.send(a10);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
        readableMapBuilder.put(StackTraceHelper.ID_KEY, i10);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(createMap2);
        readableMapBuilder2.put(StackTraceHelper.ID_KEY, i10);
        readableMapBuilder2.put(EventKeys.ERROR_CODE, 0);
        readableMapBuilder2.put(EventKeys.REASON, "client is null");
        sendEvent("websocketClosed", createMap2);
        this.webSocketConnections.remove(Integer.valueOf(i10));
        this.contentHandlers.remove(Integer.valueOf(i10));
    }

    public final void setContentHandler(int id2, @Nullable ContentHandler contentHandler) {
        if (contentHandler == null) {
            this.contentHandlers.remove(Integer.valueOf(id2));
        } else {
            this.contentHandlers.put(Integer.valueOf(id2), contentHandler);
        }
    }

    public final void sendBinary(@NotNull k byteString, int id2) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(id2));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
            readableMapBuilder.put(StackTraceHelper.ID_KEY, id2);
            readableMapBuilder.put("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(createMap2);
            readableMapBuilder2.put(StackTraceHelper.ID_KEY, id2);
            readableMapBuilder2.put(EventKeys.ERROR_CODE, 0);
            readableMapBuilder2.put(EventKeys.REASON, "client is null");
            sendEvent("websocketClosed", createMap2);
            this.webSocketConnections.remove(Integer.valueOf(id2));
            this.contentHandlers.remove(Integer.valueOf(id2));
            return;
        }
        try {
            webSocket.send(byteString);
        } catch (Exception e10) {
            notifyWebSocketFailed(id2, e10.getMessage());
        }
    }
}
