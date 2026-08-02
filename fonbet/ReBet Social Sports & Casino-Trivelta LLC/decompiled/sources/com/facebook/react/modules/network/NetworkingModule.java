package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.twilio.voice.EventKeys;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ti.AbstractC6473c;
import ti.k;
import ti.q;

@ReactModule(name = "Networking")
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 c2\u00020\u0001:\u0005_`abcB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000fB!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\u0011J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0015\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001dH\u0000¢\u0006\u0002\b'J\u0015\u0010(\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001bH\u0000¢\u0006\u0002\b)J\u0015\u0010*\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001fH\u0000¢\u0006\u0002\b+J\u0015\u0010,\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001dH\u0000¢\u0006\u0002\b-J\u0015\u0010.\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001bH\u0000¢\u0006\u0002\b/J\u0015\u00100\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001fH\u0000¢\u0006\u0002\b1J\u0012\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u000104H\u0002JT\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u0002092\u0006\u0010?\u001a\u00020!H\u0016JV\u0010@\u001a\u00020#2\u0006\u00106\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00052\u0006\u0010A\u001a\u00020\u00182\b\u0010:\u001a\u0004\u0018\u00010;2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020!2\u0006\u0010B\u001a\u00020\u00182\u0006\u0010?\u001a\u00020!H\u0007J^\u0010C\u001a\u00020#2\u0006\u00106\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00052\u0006\u0010A\u001a\u00020\u00182\b\u0010:\u001a\u0004\u0018\u00010;2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020!2\u0006\u0010B\u001a\u00020\u00182\u0006\u0010?\u001a\u00020!2\u0006\u0010D\u001a\u00020\u0005H\u0002J\u001c\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010A\u001a\u00020\u0018H\u0002J \u0010H\u001a\u00020#2\u0006\u0010A\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u00052\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020#2\u0006\u0010A\u001a\u00020\u0018H\u0002J\u0010\u0010L\u001a\u00020#2\u0006\u0010A\u001a\u00020\u0018H\u0002J\b\u0010M\u001a\u00020#H\u0002J\u0010\u0010N\u001a\u00020#2\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010O\u001a\u00020#2\u0006\u0010A\u001a\u00020\u0018H\u0002J\u0010\u0010P\u001a\u00020#2\u0006\u0010Q\u001a\u00020RH\u0017J\u0012\u0010S\u001a\u00020#2\b\u0010T\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010U\u001a\u00020#2\u0006\u0010V\u001a\u000209H\u0016J*\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010Y\u001a\u00020;2\u0006\u0010Z\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u0005H\u0002J\u001e\u0010[\u001a\u0004\u0018\u00010\\2\b\u0010]\u001a\u0004\u0018\u00010;2\b\u0010^\u001a\u0004\u0018\u000104H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule;", "Lcom/facebook/fbreact/specs/NativeNetworkingAndroidSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "defaultUserAgent", "", "client", "Lokhttp3/OkHttpClient;", "networkInterceptorCreators", "", "Lcom/facebook/react/modules/network/NetworkInterceptorCreator;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Lokhttp3/OkHttpClient;Ljava/util/List;)V", "context", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Lokhttp3/OkHttpClient;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V", "cookieHandler", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "cookieJarContainer", "Lcom/facebook/react/modules/network/CookieJarContainer;", "requestIds", "", "", "requestBodyHandlers", "", "Lcom/facebook/react/modules/network/NetworkingModule$RequestBodyHandler;", "uriHandlers", "Lcom/facebook/react/modules/network/NetworkingModule$UriHandler;", "responseHandlers", "Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;", "shuttingDown", "", "initialize", "", "invalidate", "addUriHandler", "handler", "addUriHandler$ReactAndroid_release", "addRequestBodyHandler", "addRequestBodyHandler$ReactAndroid_release", "addResponseHandler", "addResponseHandler$ReactAndroid_release", "removeUriHandler", "removeUriHandler$ReactAndroid_release", "removeRequestBodyHandler", "removeRequestBodyHandler$ReactAndroid_release", "removeResponseHandler", "removeResponseHandler$ReactAndroid_release", "extractOrGenerateDevToolsRequestId", EventKeys.DATA, "Lcom/facebook/react/bridge/ReadableMap;", "sendRequest", "method", EventKeys.URL, "requestIdAsDouble", "", "headers", "Lcom/facebook/react/bridge/ReadableArray;", "responseType", "useIncrementalUpdates", "timeoutAsDouble", "withCredentials", "sendRequestInternal", "requestId", "timeout", "sendRequestInternalReal", NetworkingModule.REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID, "wrapRequestBodyWithProgressEmitter", "Lokhttp3/RequestBody;", "requestBody", "readWithProgress", "responseBody", "Lokhttp3/ResponseBody;", "addRequest", "removeRequest", "cancelAllRequests", "abortRequest", "cancelRequest", "clearCookies", "callback", "Lcom/facebook/react/bridge/Callback;", "addListener", "eventName", "removeListeners", "count", "constructMultipartBody", "Lokhttp3/MultipartBody$Builder;", "body", "contentType", "extractHeaders", "Lokhttp3/Headers;", "headersArray", "requestData", "UriHandler", "RequestBodyHandler", "ResponseHandler", "CustomClientBuilder", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkingModule.kt\ncom/facebook/react/modules/network/NetworkingModule\n+ 2 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1068:1\n578#2:1069\n1#3:1070\n*S KotlinDebug\n*F\n+ 1 NetworkingModule.kt\ncom/facebook/react/modules/network/NetworkingModule\n*L\n385#1:1069\n*E\n"})
/* loaded from: classes2.dex */
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;

    @NotNull
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";

    @NotNull
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;

    @NotNull
    public static final String NAME = "Networking";

    @NotNull
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";

    @NotNull
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";

    @NotNull
    private static final String REQUEST_BODY_KEY_STRING = "string";

    @NotNull
    private static final String REQUEST_BODY_KEY_URI = "uri";

    @NotNull
    private static final String REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID = "devToolsRequestId";

    @NotNull
    private static final String TAG = "Networking";

    @NotNull
    private static final String USER_AGENT_HEADER_NAME = "user-agent";

    @Nullable
    private static com.facebook.react.modules.network.CustomClientBuilder customClientBuilder;

    @NotNull
    private final OkHttpClient client;

    @NotNull
    private final ForwardingCookieHandler cookieHandler;

    @Nullable
    private CookieJarContainer cookieJarContainer;

    @Nullable
    private final String defaultUserAgent;

    @NotNull
    private final List<RequestBodyHandler> requestBodyHandlers;

    @NotNull
    private final Set<Integer> requestIds;

    @NotNull
    private final List<ResponseHandler> responseHandlers;
    private boolean shuttingDown;

    @NotNull
    private final List<UriHandler> uriHandlers;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0007J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$Companion;", "", "<init>", "()V", "NAME", "", "TAG", "CONTENT_ENCODING_HEADER_NAME", "CONTENT_TYPE_HEADER_NAME", "REQUEST_BODY_KEY_STRING", "REQUEST_BODY_KEY_URI", "REQUEST_BODY_KEY_FORMDATA", "REQUEST_BODY_KEY_BASE64", "REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID", "USER_AGENT_HEADER_NAME", "CHUNK_TIMEOUT_NS", "", "MAX_CHUNK_SIZE_BETWEEN_FLUSHES", "customClientBuilder", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "setCustomClientBuilder", "", "ccb", "applyCustomBuilder", "builder", "Lokhttp3/OkHttpClient$Builder;", "shouldDispatch", "", "now", "", "last", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void applyCustomBuilder(OkHttpClient.Builder builder) {
            com.facebook.react.modules.network.CustomClientBuilder customClientBuilder = NetworkingModule.customClientBuilder;
            if (customClientBuilder != null) {
                customClientBuilder.apply(builder);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldDispatch(long now, long last) {
            return last + ((long) NetworkingModule.CHUNK_TIMEOUT_NS) < now;
        }

        @JvmStatic
        public final void setCustomClientBuilder(@Nullable com.facebook.react.modules.network.CustomClientBuilder ccb) {
            NetworkingModule.customClientBuilder = ccb;
        }

        private Companion() {
        }
    }

    @Deprecated(message = "To be removed in a future release. See\n        https://github.com/facebook/react-native/pull/37798#pullrequestreview-1518338914")
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$CustomClientBuilder;", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CustomClientBuilder extends com.facebook.react.modules.network.CustomClientBuilder {
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$RequestBodyHandler;", "", "supports", "", "map", "Lcom/facebook/react/bridge/ReadableMap;", "toRequestBody", "Lokhttp3/RequestBody;", "contentType", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RequestBodyHandler {
        boolean supports(@NotNull ReadableMap map);

        @Nullable
        RequestBody toRequestBody(@NotNull ReadableMap map, @Nullable String contentType);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;", "", "supports", "", "responseType", "", "toResponseData", "Lcom/facebook/react/bridge/WritableMap;", EventKeys.DATA, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ResponseHandler {
        boolean supports(@NotNull String responseType);

        @NotNull
        WritableMap toResponseData(@NotNull byte[] data);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/network/NetworkingModule$UriHandler;", "", "supports", "", NetworkingModule.REQUEST_BODY_KEY_URI, "Landroid/net/Uri;", "responseType", "", "fetch", "Lkotlin/Pair;", "Lcom/facebook/react/bridge/WritableMap;", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface UriHandler {
        @NotNull
        Pair<WritableMap, byte[]> fetch(@NotNull Uri uri);

        boolean supports(@NotNull Uri uri, @NotNull String responseType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkingModule(@NotNull ReactApplicationContext reactContext, @Nullable String str, @NotNull OkHttpClient client, @Nullable List<? extends NetworkInterceptorCreator> list) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(client, "client");
        this.cookieHandler = new ForwardingCookieHandler();
        this.requestIds = new HashSet();
        this.requestBodyHandlers = new ArrayList();
        this.uriHandlers = new ArrayList();
        this.responseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder newBuilder = client.newBuilder();
            Iterator<? extends NetworkInterceptorCreator> it = list.iterator();
            while (it.hasNext()) {
                newBuilder.addNetworkInterceptor(it.next().create());
            }
            client = newBuilder.build();
        }
        this.client = client;
        CookieJar cookieJar = client.getCookieJar();
        this.cookieJarContainer = cookieJar instanceof CookieJarContainer ? (CookieJarContainer) cookieJar : null;
        this.defaultUserAgent = str;
    }

    private final synchronized void addRequest(int requestId) {
        this.requestIds.add(Integer.valueOf(requestId));
    }

    private final synchronized void cancelAllRequests() {
        try {
            Iterator<Integer> it = this.requestIds.iterator();
            while (it.hasNext()) {
                cancelRequest(it.next().intValue());
            }
            this.requestIds.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void cancelRequest(int requestId) {
        OkHttpCallUtil.cancelTag(this.client, Integer.valueOf(requestId));
    }

    private final MultipartBody.Builder constructMultipartBody(ReadableArray body, String contentType, int requestId, String devToolsRequestId) {
        MediaType mediaType;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        MultipartBody.Builder builder = new MultipartBody.Builder(null, 1, null);
        MediaType m1696deprecated_parse = MediaType.INSTANCE.m1696deprecated_parse(contentType);
        if (m1696deprecated_parse == null) {
            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Invalid media type.", null);
            return null;
        }
        builder.setType(m1696deprecated_parse);
        int size = body.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = body.getMap(i10);
            if (map == null) {
                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Unrecognized FormData part.", null);
                return null;
            }
            Headers extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String str = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
            if (str != null) {
                mediaType = MediaType.INSTANCE.m1696deprecated_parse(str);
                extractHeaders = extractHeaders.newBuilder().removeAll(CONTENT_TYPE_HEADER_NAME).build();
            } else {
                mediaType = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING) && map.getString(REQUEST_BODY_KEY_STRING) != null) {
                String string = map.getString(REQUEST_BODY_KEY_STRING);
                if (string == null) {
                    string = "";
                }
                builder.addPart(extractHeaders, RequestBody.INSTANCE.create(mediaType, string));
            } else if (!map.hasKey(REQUEST_BODY_KEY_URI) || map.getString(REQUEST_BODY_KEY_URI) == null) {
                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Unrecognized FormData part.", null);
                Unit unit = Unit.INSTANCE;
            } else {
                if (mediaType == null) {
                    NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Binary FormData part needs a content-type header.", null);
                    return null;
                }
                String string2 = map.getString(REQUEST_BODY_KEY_URI);
                if (string2 == null) {
                    NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Body must have a valid file uri", null);
                    return null;
                }
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
                InputStream fileInputStream = RequestBodyUtil.getFileInputStream(reactApplicationContext, string2);
                if (fileInputStream == null) {
                    NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Could not retrieve file for uri " + string2, null);
                    return null;
                }
                builder.addPart(extractHeaders, RequestBodyUtil.create(mediaType, fileInputStream));
            }
        }
        return builder;
    }

    private final Headers extractHeaders(ReadableArray headersArray, ReadableMap requestData) {
        String str;
        if (headersArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headersArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableArray array = headersArray.getArray(i10);
            if (array != null && array.size() == 2) {
                String string = array.getString(0);
                if (string != null) {
                    string = HeaderUtil.INSTANCE.stripHeaderName(string);
                }
                String string2 = array.getString(1);
                if (string != null && string2 != null) {
                    builder.addUnsafeNonAscii(string, string2);
                }
            }
            return null;
        }
        if (builder.get(USER_AGENT_HEADER_NAME) == null && (str = this.defaultUserAgent) != null) {
            builder.add(USER_AGENT_HEADER_NAME, str);
        }
        if (requestData == null || !requestData.hasKey(REQUEST_BODY_KEY_STRING)) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    private final String extractOrGenerateDevToolsRequestId(ReadableMap data) {
        String string = (data != null && data.hasKey(REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID) && data.getType(REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID) == ReadableType.String) ? data.getString(REQUEST_DATA_KEY_DEVTOOLS_REQUEST_ID) : null;
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return uuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readWithProgress(int requestId, String devToolsRequestId, ResponseBody responseBody) {
        long j10;
        Charset charset;
        long j11 = -1;
        try {
            Intrinsics.checkNotNull(responseBody, "null cannot be cast to non-null type com.facebook.react.modules.network.ProgressResponseBody");
            ProgressResponseBody progressResponseBody = (ProgressResponseBody) responseBody;
            j10 = progressResponseBody.getTotalBytesRead();
            try {
                j11 = progressResponseBody.getContentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j10 = -1;
        }
        long j12 = j11;
        long j13 = j10;
        if (responseBody.get$contentType() == null) {
            charset = StandardCharsets.UTF_8;
        } else {
            MediaType mediaType = responseBody.get$contentType();
            charset = mediaType != null ? mediaType.charset(StandardCharsets.UTF_8) : null;
            if (charset == null) {
                throw new IllegalStateException(("Null character set for Content-Type: " + responseBody.get$contentType()).toString());
            }
        }
        Intrinsics.checkNotNull(charset);
        ProgressiveStringDecoder progressiveStringDecoder = new ProgressiveStringDecoder(charset);
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[8192];
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            while (true) {
                int read = byteStream.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    NetworkEventUtil.onIncrementalDataReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, progressiveStringDecoder.decodeNext(bArr, read), j13, j12);
                }
            }
        } finally {
            byteStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void removeRequest(int requestId) {
        this.requestIds.remove(Integer.valueOf(requestId));
    }

    private final void sendRequestInternalReal(String method, String url, final int requestId, ReadableArray headers, ReadableMap data, final String responseType, final boolean useIncrementalUpdates, int timeout, boolean withCredentials, final String devToolsRequestId) {
        String str;
        RequestBodyHandler requestBodyHandler;
        RequestBody emptyBody;
        Charset charset;
        UriHandler next;
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        try {
            Uri parse = Uri.parse(url);
            Iterator<UriHandler> it = this.uriHandlers.iterator();
            do {
                str = "";
                if (!it.hasNext()) {
                    try {
                        Request.Builder builder = new Request.Builder();
                        if (url != null) {
                            str = url;
                        }
                        Request.Builder url2 = builder.url(str);
                        if (requestId != 0) {
                            url2.tag(Integer.valueOf(requestId));
                        }
                        OkHttpClient.Builder newBuilder = this.client.newBuilder();
                        INSTANCE.applyCustomBuilder(newBuilder);
                        if (!withCredentials) {
                            newBuilder.cookieJar(CookieJar.NO_COOKIES);
                        }
                        if (useIncrementalUpdates) {
                            newBuilder.addNetworkInterceptor(new Interceptor() { // from class: com.facebook.react.modules.network.NetworkingModule$sendRequestInternalReal$$inlined$-addNetworkInterceptor$1
                                @Override // okhttp3.Interceptor
                                @NotNull
                                public final Response intercept(@NotNull Interceptor.Chain chain) {
                                    Intrinsics.checkNotNullParameter(chain, "chain");
                                    Response proceed = chain.proceed(chain.request());
                                    ResponseBody body = proceed.getBody();
                                    if (body == null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    final String str2 = responseType;
                                    final ReactApplicationContext reactApplicationContext = reactApplicationContextIfActiveOrWarn;
                                    final int i10 = requestId;
                                    return proceed.newBuilder().body(new ProgressResponseBody(body, new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule$sendRequestInternalReal$1$responseBody$1
                                        private long last = System.nanoTime();

                                        public final long getLast() {
                                            return this.last;
                                        }

                                        @Override // com.facebook.react.modules.network.ProgressListener
                                        public void onProgress(long bytesWritten, long contentLength, boolean done) {
                                            boolean shouldDispatch;
                                            long nanoTime = System.nanoTime();
                                            if (!done) {
                                                shouldDispatch = NetworkingModule.INSTANCE.shouldDispatch(nanoTime, this.last);
                                                if (!shouldDispatch) {
                                                    return;
                                                }
                                            }
                                            if (Intrinsics.areEqual(str2, "text")) {
                                                return;
                                            }
                                            NetworkEventUtil.onDataReceivedProgress(reactApplicationContext, i10, bytesWritten, contentLength);
                                            this.last = nanoTime;
                                        }

                                        public final void setLast(long j10) {
                                            this.last = j10;
                                        }
                                    })).build();
                                }
                            });
                        }
                        if (timeout != this.client.getCallTimeoutMillis()) {
                            newBuilder.callTimeout(timeout, TimeUnit.MILLISECONDS);
                        }
                        OkHttpClient build = newBuilder.build();
                        Headers extractHeaders = extractHeaders(headers, data);
                        if (extractHeaders == null) {
                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Unrecognized headers format", null);
                            return;
                        }
                        String str2 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                        String str3 = extractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
                        url2.headers(extractHeaders);
                        if (data != null) {
                            Iterator<RequestBodyHandler> it2 = this.requestBodyHandlers.iterator();
                            while (it2.hasNext()) {
                                requestBodyHandler = it2.next();
                                if (requestBodyHandler.supports(data)) {
                                    break;
                                }
                            }
                        }
                        requestBodyHandler = null;
                        if (data != null) {
                            Locale locale = Locale.ROOT;
                            String lowerCase = method.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (!Intrinsics.areEqual(lowerCase, "get")) {
                                String lowerCase2 = method.toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                if (!Intrinsics.areEqual(lowerCase2, "head")) {
                                    if (requestBodyHandler != null) {
                                        emptyBody = requestBodyHandler.toRequestBody(data, str2);
                                    } else if (data.hasKey(REQUEST_BODY_KEY_STRING)) {
                                        if (str2 == null) {
                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Payload is set but no content-type header specified", null);
                                            return;
                                        }
                                        String string = data.getString(REQUEST_BODY_KEY_STRING);
                                        MediaType m1696deprecated_parse = MediaType.INSTANCE.m1696deprecated_parse(str2);
                                        if (RequestBodyUtil.isGzipEncoding(str3)) {
                                            emptyBody = (m1696deprecated_parse == null || string == null) ? null : RequestBodyUtil.createGzip(m1696deprecated_parse, string);
                                            if (emptyBody == null) {
                                                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Failed to gzip request body", null);
                                                return;
                                            }
                                        } else {
                                            if (m1696deprecated_parse == null) {
                                                charset = StandardCharsets.UTF_8;
                                            } else {
                                                charset = m1696deprecated_parse.charset(StandardCharsets.UTF_8);
                                                if (charset == null) {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            }
                                            if (string == null) {
                                                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Received request but body was empty", null);
                                                return;
                                            }
                                            RequestBody.Companion companion = RequestBody.INSTANCE;
                                            Intrinsics.checkNotNull(charset);
                                            byte[] bytes = string.getBytes(charset);
                                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                                            emptyBody = RequestBody.Companion.create$default(companion, m1696deprecated_parse, bytes, 0, 0, 12, (Object) null);
                                        }
                                    } else if (data.hasKey(REQUEST_BODY_KEY_BASE64)) {
                                        if (str2 == null) {
                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Payload is set but no content-type header specified", null);
                                            return;
                                        }
                                        String string2 = data.getString(REQUEST_BODY_KEY_BASE64);
                                        if (string2 == null) {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                        MediaType m1696deprecated_parse2 = MediaType.INSTANCE.m1696deprecated_parse(str2);
                                        if (m1696deprecated_parse2 == null) {
                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Invalid content type specified: " + str2, null);
                                            return;
                                        }
                                        k a10 = k.f65867c.a(string2);
                                        if (a10 == null) {
                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Request body base64 string was invalid", null);
                                            return;
                                        }
                                        emptyBody = RequestBody.INSTANCE.create(m1696deprecated_parse2, a10);
                                    } else if (data.hasKey(REQUEST_BODY_KEY_URI)) {
                                        if (str2 == null) {
                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Payload is set but no content-type header specified", null);
                                            return;
                                        }
                                        String string3 = data.getString(REQUEST_BODY_KEY_URI);
                                        if (string3 == null) {
                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Request body URI field was set but null", null);
                                            return;
                                        }
                                        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                                        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
                                        InputStream fileInputStream = RequestBodyUtil.getFileInputStream(reactApplicationContext, string3);
                                        if (fileInputStream == null) {
                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Could not retrieve file for uri " + string3, null);
                                            return;
                                        }
                                        emptyBody = RequestBodyUtil.create(MediaType.INSTANCE.m1696deprecated_parse(str2), fileInputStream);
                                    } else if (data.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                                        if (str2 == null) {
                                            str2 = "multipart/form-data";
                                        }
                                        ReadableArray array = data.getArray(REQUEST_BODY_KEY_FORMDATA);
                                        if (array == null) {
                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Received request but form data was empty", null);
                                            return;
                                        }
                                        MultipartBody.Builder constructMultipartBody = constructMultipartBody(array, str2, requestId, devToolsRequestId);
                                        if (constructMultipartBody == null) {
                                            return;
                                        } else {
                                            emptyBody = constructMultipartBody.build();
                                        }
                                    } else {
                                        emptyBody = RequestBodyUtil.getEmptyBody(method);
                                    }
                                    url2.method(method, wrapRequestBodyWithProgressEmitter(emptyBody, requestId));
                                    addRequest(requestId);
                                    Request build2 = url2.build();
                                    NetworkEventUtil.onCreateRequest(devToolsRequestId, build2);
                                    build.newCall(build2).enqueue(new Callback() { // from class: com.facebook.react.modules.network.NetworkingModule$sendRequestInternalReal$2
                                        @Override // okhttp3.Callback
                                        public void onFailure(Call call, IOException e10) {
                                            boolean z10;
                                            Intrinsics.checkNotNullParameter(call, "call");
                                            Intrinsics.checkNotNullParameter(e10, "e");
                                            z10 = NetworkingModule.this.shuttingDown;
                                            if (z10) {
                                                return;
                                            }
                                            NetworkingModule.this.removeRequest(requestId);
                                            String message = e10.getMessage();
                                            if (message == null) {
                                                message = "Error while executing request: " + e10.getClass().getSimpleName();
                                            }
                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, message, e10);
                                        }

                                        @Override // okhttp3.Callback
                                        public void onResponse(Call call, Response response) {
                                            boolean z10;
                                            List<NetworkingModule.ResponseHandler> list;
                                            Intrinsics.checkNotNullParameter(call, "call");
                                            Intrinsics.checkNotNullParameter(response, "response");
                                            z10 = NetworkingModule.this.shuttingDown;
                                            if (z10) {
                                                return;
                                            }
                                            NetworkingModule.this.removeRequest(requestId);
                                            NetworkEventUtil.onResponseReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, response.getRequest().getUrl().getUrl(), response);
                                            try {
                                                ResponseBody body = response.getBody();
                                                if (body == null) {
                                                    NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Response body is null", null);
                                                    return;
                                                }
                                                if (StringsKt.equals("gzip", Response.header$default(response, "Content-Encoding", null, 2, null), true)) {
                                                    q qVar = new q(body.getSource());
                                                    String header$default = Response.header$default(response, "Content-Type", null, 2, null);
                                                    body = ResponseBody.INSTANCE.create(header$default != null ? MediaType.INSTANCE.m1696deprecated_parse(header$default) : null, -1L, AbstractC6473c.a().b(qVar));
                                                }
                                                if (body == null) {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                                list = NetworkingModule.this.responseHandlers;
                                                for (NetworkingModule.ResponseHandler responseHandler : list) {
                                                    if (responseHandler.supports(responseType)) {
                                                        byte[] bytes2 = body.bytes();
                                                        NetworkEventUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, responseHandler.toResponseData(bytes2), bytes2);
                                                        NetworkEventUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, body.getContentLength());
                                                        return;
                                                    }
                                                }
                                                if (useIncrementalUpdates && Intrinsics.areEqual(responseType, "text")) {
                                                    NetworkingModule.this.readWithProgress(requestId, devToolsRequestId, body);
                                                    NetworkEventUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, body.getContentLength());
                                                    return;
                                                }
                                                String str4 = "";
                                                if (Intrinsics.areEqual(responseType, "text")) {
                                                    try {
                                                        str4 = body.string();
                                                    } catch (IOException e10) {
                                                        if (!StringsKt.equals(response.getRequest().getMethod(), "HEAD", true)) {
                                                            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, e10.getMessage(), e10);
                                                        }
                                                    }
                                                } else if (Intrinsics.areEqual(responseType, "base64")) {
                                                    str4 = Base64.encodeToString(body.bytes(), 2);
                                                }
                                                NetworkEventUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, str4, responseType);
                                                NetworkEventUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, body.getContentLength());
                                            } catch (IOException e11) {
                                                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, e11.getMessage(), e11);
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                        emptyBody = RequestBodyUtil.getEmptyBody(method);
                        url2.method(method, wrapRequestBodyWithProgressEmitter(emptyBody, requestId));
                        addRequest(requestId);
                        Request build22 = url2.build();
                        NetworkEventUtil.onCreateRequest(devToolsRequestId, build22);
                        build.newCall(build22).enqueue(new Callback() { // from class: com.facebook.react.modules.network.NetworkingModule$sendRequestInternalReal$2
                            @Override // okhttp3.Callback
                            public void onFailure(Call call, IOException e10) {
                                boolean z10;
                                Intrinsics.checkNotNullParameter(call, "call");
                                Intrinsics.checkNotNullParameter(e10, "e");
                                z10 = NetworkingModule.this.shuttingDown;
                                if (z10) {
                                    return;
                                }
                                NetworkingModule.this.removeRequest(requestId);
                                String message = e10.getMessage();
                                if (message == null) {
                                    message = "Error while executing request: " + e10.getClass().getSimpleName();
                                }
                                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, message, e10);
                            }

                            @Override // okhttp3.Callback
                            public void onResponse(Call call, Response response) {
                                boolean z10;
                                List<NetworkingModule.ResponseHandler> list;
                                Intrinsics.checkNotNullParameter(call, "call");
                                Intrinsics.checkNotNullParameter(response, "response");
                                z10 = NetworkingModule.this.shuttingDown;
                                if (z10) {
                                    return;
                                }
                                NetworkingModule.this.removeRequest(requestId);
                                NetworkEventUtil.onResponseReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, response.getRequest().getUrl().getUrl(), response);
                                try {
                                    ResponseBody body = response.getBody();
                                    if (body == null) {
                                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, "Response body is null", null);
                                        return;
                                    }
                                    if (StringsKt.equals("gzip", Response.header$default(response, "Content-Encoding", null, 2, null), true)) {
                                        q qVar = new q(body.getSource());
                                        String header$default = Response.header$default(response, "Content-Type", null, 2, null);
                                        body = ResponseBody.INSTANCE.create(header$default != null ? MediaType.INSTANCE.m1696deprecated_parse(header$default) : null, -1L, AbstractC6473c.a().b(qVar));
                                    }
                                    if (body == null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    list = NetworkingModule.this.responseHandlers;
                                    for (NetworkingModule.ResponseHandler responseHandler : list) {
                                        if (responseHandler.supports(responseType)) {
                                            byte[] bytes2 = body.bytes();
                                            NetworkEventUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, responseHandler.toResponseData(bytes2), bytes2);
                                            NetworkEventUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, body.getContentLength());
                                            return;
                                        }
                                    }
                                    if (useIncrementalUpdates && Intrinsics.areEqual(responseType, "text")) {
                                        NetworkingModule.this.readWithProgress(requestId, devToolsRequestId, body);
                                        NetworkEventUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, body.getContentLength());
                                        return;
                                    }
                                    String str4 = "";
                                    if (Intrinsics.areEqual(responseType, "text")) {
                                        try {
                                            str4 = body.string();
                                        } catch (IOException e10) {
                                            if (!StringsKt.equals(response.getRequest().getMethod(), "HEAD", true)) {
                                                NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, e10.getMessage(), e10);
                                            }
                                        }
                                    } else if (Intrinsics.areEqual(responseType, "base64")) {
                                        str4 = Base64.encodeToString(body.bytes(), 2);
                                    }
                                    NetworkEventUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, str4, responseType);
                                    NetworkEventUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, body.getContentLength());
                                } catch (IOException e11) {
                                    NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, e11.getMessage(), e11);
                                }
                            }
                        });
                        return;
                    } catch (Exception e10) {
                        NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, e10.getMessage(), e10);
                        return;
                    }
                }
                next = it.next();
                Intrinsics.checkNotNull(parse);
            } while (!next.supports(parse, responseType));
            Pair<WritableMap, byte[]> fetch = next.fetch(parse);
            WritableMap component1 = fetch.component1();
            byte[] component2 = fetch.component2();
            byte[] bytes2 = component1.toString().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            int length = bytes2.length;
            Response.Builder protocol = new Response.Builder().protocol(Protocol.HTTP_1_1);
            Request.Builder builder2 = new Request.Builder();
            if (url != null) {
                str = url;
            }
            NetworkEventUtil.onResponseReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, url, protocol.request(builder2.url(str).build()).code(200).message("OK").build());
            NetworkEventUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, component1, component2);
            NetworkEventUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, length);
        } catch (IOException e11) {
            NetworkEventUtil.onRequestError(reactApplicationContextIfActiveOrWarn, requestId, devToolsRequestId, e11.getMessage(), e11);
        }
    }

    @JvmStatic
    public static final void setCustomClientBuilder(@Nullable com.facebook.react.modules.network.CustomClientBuilder customClientBuilder2) {
        INSTANCE.setCustomClientBuilder(customClientBuilder2);
    }

    private final RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, final int requestId) {
        if (requestBody == null) {
            return null;
        }
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        return RequestBodyUtil.createProgressRequest(requestBody, new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule$wrapRequestBodyWithProgressEmitter$1
            private long last = System.nanoTime();

            public final long getLast() {
                return this.last;
            }

            @Override // com.facebook.react.modules.network.ProgressListener
            public void onProgress(long bytesWritten, long contentLength, boolean done) {
                boolean shouldDispatch;
                long nanoTime = System.nanoTime();
                if (!done) {
                    shouldDispatch = NetworkingModule.INSTANCE.shouldDispatch(nanoTime, this.last);
                    if (!shouldDispatch) {
                        return;
                    }
                }
                NetworkEventUtil.onDataSend(ReactApplicationContext.this, requestId, bytesWritten, contentLength);
                this.last = nanoTime;
            }

            public final void setLast(long j10) {
                this.last = j10;
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double requestIdAsDouble) {
        int i10 = (int) requestIdAsDouble;
        cancelRequest(i10);
        removeRequest(i10);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(@Nullable String eventName) {
    }

    public final void addRequestBodyHandler$ReactAndroid_release(@NotNull RequestBodyHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.requestBodyHandlers.add(handler);
    }

    public final void addResponseHandler$ReactAndroid_release(@NotNull ResponseHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.responseHandlers.add(handler);
    }

    public final void addUriHandler$ReactAndroid_release(@NotNull UriHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.uriHandlers.add(handler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(@NotNull com.facebook.react.bridge.Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.cookieHandler.clearCookies(callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        CookieJarContainer cookieJarContainer = this.cookieJarContainer;
        if (cookieJarContainer != null) {
            cookieJarContainer.setCookieJar(new JavaNetCookieJar(this.cookieHandler));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.shuttingDown = true;
        cancelAllRequests();
        this.cookieHandler.destroy();
        CookieJarContainer cookieJarContainer = this.cookieJarContainer;
        if (cookieJarContainer != null) {
            cookieJarContainer.removeCookieJar();
        }
        this.requestBodyHandlers.clear();
        this.responseHandlers.clear();
        this.uriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double count) {
    }

    public final void removeRequestBodyHandler$ReactAndroid_release(@NotNull RequestBodyHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.requestBodyHandlers.remove(handler);
    }

    public final void removeResponseHandler$ReactAndroid_release(@NotNull ResponseHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.responseHandlers.remove(handler);
    }

    public final void removeUriHandler$ReactAndroid_release(@NotNull UriHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.uriHandlers.remove(handler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(@NotNull String method, @NotNull String url, double requestIdAsDouble, @Nullable ReadableArray headers, @Nullable ReadableMap data, @NotNull String responseType, boolean useIncrementalUpdates, double timeoutAsDouble, boolean withCredentials) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        int i10 = (int) requestIdAsDouble;
        int i11 = (int) timeoutAsDouble;
        String extractOrGenerateDevToolsRequestId = extractOrGenerateDevToolsRequestId(data);
        try {
            sendRequestInternalReal(method, url, i10, headers, data, responseType, useIncrementalUpdates, i11, withCredentials, extractOrGenerateDevToolsRequestId);
        } catch (Throwable th2) {
            E6.a.n("Networking", "Failed to send url request: " + url, th2);
            NetworkEventUtil.onRequestError(getReactApplicationContextIfActiveOrWarn(), i10, extractOrGenerateDevToolsRequestId, th2.getMessage(), th2);
        }
    }

    @Deprecated(message = "sendRequestInternal is internal and will be made private in a future release.")
    public final void sendRequestInternal(@NotNull String method, @Nullable String url, int requestId, @Nullable ReadableArray headers, @Nullable ReadableMap data, @NotNull String responseType, boolean useIncrementalUpdates, int timeout, boolean withCredentials) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        sendRequestInternalReal(method, url, requestId, headers, data, responseType, useIncrementalUpdates, timeout, withCredentials, extractOrGenerateDevToolsRequestId(data));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetworkingModule(@NotNull ReactApplicationContext context, @Nullable String str, @NotNull OkHttpClient client) {
        this(context, str, client, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(client, "client");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NetworkingModule(@NotNull ReactApplicationContext context) {
        this(context, null, OkHttpClientProvider.createClient(r0), null);
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NetworkingModule(@NotNull ReactApplicationContext context, @Nullable List<? extends NetworkInterceptorCreator> list) {
        this(context, null, OkHttpClientProvider.createClient(r0), list);
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NetworkingModule(@NotNull ReactApplicationContext context, @Nullable String str) {
        this(context, str, OkHttpClientProvider.createClient(r0), null);
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }
}
