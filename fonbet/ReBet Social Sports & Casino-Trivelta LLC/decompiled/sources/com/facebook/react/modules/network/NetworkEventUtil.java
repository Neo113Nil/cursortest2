package com.facebook.react.modules.network;

import android.os.Bundle;
import android.util.Base64;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.twilio.voice.EventKeys;
import java.net.SocketTimeoutException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J*\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0007J<\u0010\u0018\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0007J*\u0010\u001a\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0007J4\u0010\u001b\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0007J2\u0010\u001b\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J6\u0010 \u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010#H\u0007J*\u0010$\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J4\u0010%\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010&\u001a\u00020'H\u0007J>\u0010%\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010\u001d2\b\u0010*\u001a\u0004\u0018\u00010\u0007H\u0007J\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010)\u001a\u00020,H\u0002¨\u0006-"}, d2 = {"Lcom/facebook/react/modules/network/NetworkEventUtil;", "", "<init>", "()V", "onCreateRequest", "", "devToolsRequestId", "", "request", "Lokhttp3/Request;", "requestUrl", "requestMethod", "requestHeaders", "", "requestBody", "encodedDataLength", "", "onDataSend", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "requestId", "", ReactProgressBarViewManager.PROP_PROGRESS, "total", "onIncrementalDataReceived", EventKeys.DATA, "onDataReceivedProgress", "onDataReceived", "responseType", "Lcom/facebook/react/bridge/WritableMap;", "rawData", "", "onRequestError", "error", e.f29601m, "", "onRequestSuccess", "onResponseReceived", "response", "Lokhttp3/Response;", "statusCode", "headers", EventKeys.URL, "okHttpHeadersToMap", "Lokhttp3/Headers;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkEventUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkEventUtil.kt\ncom/facebook/react/modules/network/NetworkEventUtil\n+ 2 ReadableArrayBuilder.kt\ncom/facebook/react/bridge/ReadableArrayBuilderKt\n*L\n1#1,310:1\n24#2,3:311\n24#2,3:314\n24#2,3:317\n24#2,3:320\n24#2,3:323\n24#2,3:326\n*S KotlinDebug\n*F\n+ 1 NetworkEventUtil.kt\ncom/facebook/react/modules/network/NetworkEventUtil\n*L\n87#1:311,3\n110#1:314,3\n128#1:317,3\n153#1:320,3\n197#1:323,3\n219#1:326,3\n*E\n"})
/* loaded from: classes2.dex */
public final class NetworkEventUtil {

    @NotNull
    public static final NetworkEventUtil INSTANCE = new NetworkEventUtil();

    private NetworkEventUtil() {
    }

    private final Map<String, String> okHttpHeadersToMap(Headers headers) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m1667deprecated_size = headers.m1667deprecated_size();
        for (int i10 = 0; i10 < m1667deprecated_size; i10++) {
            String name = headers.name(i10);
            if (linkedHashMap.containsKey(name)) {
                linkedHashMap.put(name, linkedHashMap.get(name) + ", " + headers.value(i10));
            } else {
                linkedHashMap.put(name, headers.value(i10));
            }
        }
        return linkedHashMap;
    }

    @JvmStatic
    public static final void onCreateRequest(@NotNull String devToolsRequestId, @NotNull Request request) {
        String bodyPreview;
        Intrinsics.checkNotNullParameter(devToolsRequestId, "devToolsRequestId");
        Intrinsics.checkNotNullParameter(request, "request");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            Map<String, String> okHttpHeadersToMap = INSTANCE.okHttpHeadersToMap(request.getHeaders());
            String str = "";
            if (ReactBuildConfig.DEBUG) {
                RequestBody body = request.getBody();
                ProgressRequestBody progressRequestBody = body instanceof ProgressRequestBody ? (ProgressRequestBody) body : null;
                if (progressRequestBody == null || (bodyPreview = progressRequestBody.getBodyPreview()) == null) {
                    RequestBody body2 = request.getBody();
                    String obj = body2 != null ? body2.toString() : null;
                    if (obj != null) {
                        str = obj;
                    }
                } else {
                    str = bodyPreview;
                }
            }
            String str2 = str;
            String url = request.getUrl().getUrl();
            String method = request.getMethod();
            RequestBody body3 = request.getBody();
            InspectorNetworkReporter.reportRequestStart(devToolsRequestId, url, method, okHttpHeadersToMap, str2, body3 != null ? body3.contentLength() : 0L);
            InspectorNetworkReporter.reportConnectionTiming(devToolsRequestId, okHttpHeadersToMap);
        }
    }

    @JvmStatic
    public static final void onDataReceived(@Nullable ReactApplicationContext reactContext, int requestId, @NotNull String devToolsRequestId, @Nullable String data, @NotNull String responseType) {
        Intrinsics.checkNotNullParameter(devToolsRequestId, "devToolsRequestId");
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            InspectorNetworkReporter.maybeStoreResponseBody(devToolsRequestId, data == null ? "" : data, Intrinsics.areEqual(responseType, "base64"));
        }
        if (reactContext != null) {
            WritableArray createArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(createArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add(data);
            Unit unit = Unit.INSTANCE;
            reactContext.emitDeviceEvent("didReceiveNetworkData", createArray);
        }
    }

    @JvmStatic
    public static final void onDataReceivedProgress(@Nullable ReactApplicationContext reactContext, int requestId, long progress, long total) {
        if (reactContext != null) {
            WritableArray createArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(createArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add((int) progress);
            readableArrayBuilder.add((int) total);
            Unit unit = Unit.INSTANCE;
            reactContext.emitDeviceEvent("didReceiveNetworkDataProgress", createArray);
        }
    }

    @JvmStatic
    public static final void onDataSend(@Nullable ReactApplicationContext reactContext, int requestId, long progress, long total) {
        if (reactContext != null) {
            WritableArray createArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(createArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add((int) progress);
            readableArrayBuilder.add((int) total);
            Unit unit = Unit.INSTANCE;
            reactContext.emitDeviceEvent("didSendNetworkData", createArray);
        }
    }

    @JvmStatic
    public static final void onIncrementalDataReceived(@Nullable ReactApplicationContext reactContext, int requestId, @NotNull String devToolsRequestId, @Nullable String data, long progress, long total) {
        Intrinsics.checkNotNullParameter(devToolsRequestId, "devToolsRequestId");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting() && data != null) {
            InspectorNetworkReporter.reportDataReceived(devToolsRequestId, data);
            InspectorNetworkReporter.maybeStoreResponseBodyIncremental(devToolsRequestId, data);
        }
        if (reactContext != null) {
            WritableArray createArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(createArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add(data);
            readableArrayBuilder.add((int) progress);
            readableArrayBuilder.add((int) total);
            Unit unit = Unit.INSTANCE;
            reactContext.emitDeviceEvent("didReceiveNetworkIncrementalData", createArray);
        }
    }

    @JvmStatic
    public static final void onRequestError(@Nullable ReactApplicationContext reactContext, int requestId, @NotNull String devToolsRequestId, @Nullable String error, @Nullable Throwable e10) {
        Intrinsics.checkNotNullParameter(devToolsRequestId, "devToolsRequestId");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            InspectorNetworkReporter.reportRequestFailed(devToolsRequestId, false);
        }
        if (reactContext != null) {
            WritableArray createArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(createArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.add(error);
            if (Intrinsics.areEqual(e10 != null ? e10.getClass() : null, SocketTimeoutException.class)) {
                readableArrayBuilder.add(true);
            }
            Unit unit = Unit.INSTANCE;
            reactContext.emitDeviceEvent("didCompleteNetworkResponse", createArray);
        }
    }

    @JvmStatic
    public static final void onRequestSuccess(@Nullable ReactApplicationContext reactContext, int requestId, @NotNull String devToolsRequestId, long encodedDataLength) {
        Intrinsics.checkNotNullParameter(devToolsRequestId, "devToolsRequestId");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            InspectorNetworkReporter.reportResponseEnd(devToolsRequestId, encodedDataLength);
        }
        if (reactContext != null) {
            WritableArray createArray = Arguments.createArray();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(createArray);
            readableArrayBuilder.add(requestId);
            readableArrayBuilder.addNull();
            Unit unit = Unit.INSTANCE;
            reactContext.emitDeviceEvent("didCompleteNetworkResponse", createArray);
        }
    }

    @JvmStatic
    public static final void onResponseReceived(@Nullable ReactApplicationContext reactContext, int requestId, @NotNull String devToolsRequestId, @Nullable String requestUrl, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(devToolsRequestId, "devToolsRequestId");
        Intrinsics.checkNotNullParameter(response, "response");
        Map<String, String> okHttpHeadersToMap = INSTANCE.okHttpHeadersToMap(response.getHeaders());
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : okHttpHeadersToMap.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            String str = requestUrl == null ? "" : requestUrl;
            int code = response.getCode();
            ResponseBody body = response.getBody();
            InspectorNetworkReporter.reportResponseStart(devToolsRequestId, str, code, okHttpHeadersToMap, body != null ? body.getContentLength() : 0L);
        }
        if (reactContext != null) {
            WritableArray createArray = Arguments.createArray();
            createArray.pushInt(requestId);
            createArray.pushInt(response.getCode());
            createArray.pushMap(Arguments.fromBundle(bundle));
            createArray.pushString(requestUrl);
            Unit unit = Unit.INSTANCE;
            reactContext.emitDeviceEvent("didReceiveNetworkResponse", createArray);
        }
    }

    @Deprecated(message = "Compatibility overload")
    @JvmStatic
    public static final void onCreateRequest(@NotNull String devToolsRequestId, @NotNull String requestUrl, @NotNull String requestMethod, @NotNull Map<String, String> requestHeaders, @NotNull String requestBody, long encodedDataLength) {
        Intrinsics.checkNotNullParameter(devToolsRequestId, "devToolsRequestId");
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            InspectorNetworkReporter.reportRequestStart(devToolsRequestId, requestUrl, requestMethod, requestHeaders, requestBody, encodedDataLength);
            InspectorNetworkReporter.reportConnectionTiming(devToolsRequestId, requestHeaders);
        }
    }

    @JvmStatic
    public static final void onDataReceived(@Nullable ReactApplicationContext reactContext, int requestId, @NotNull String devToolsRequestId, @NotNull WritableMap data, @NotNull byte[] rawData) {
        Intrinsics.checkNotNullParameter(devToolsRequestId, "devToolsRequestId");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        if (ReactNativeFeatureFlags.enableNetworkEventReporting()) {
            String encodeToString = Base64.encodeToString(rawData, 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
            InspectorNetworkReporter.maybeStoreResponseBody(devToolsRequestId, encodeToString, true);
        }
        if (reactContext != null) {
            WritableArray createArray = Arguments.createArray();
            createArray.pushInt(requestId);
            createArray.pushMap(data);
            Unit unit = Unit.INSTANCE;
            reactContext.emitDeviceEvent("didReceiveNetworkData", createArray);
        }
    }

    @Deprecated(message = "Compatibility overload")
    @JvmStatic
    public static final void onResponseReceived(@Nullable ReactApplicationContext reactContext, int requestId, @NotNull String devToolsRequestId, int statusCode, @Nullable WritableMap headers, @Nullable String url) {
        Intrinsics.checkNotNullParameter(devToolsRequestId, "devToolsRequestId");
        Headers.Builder builder = new Headers.Builder();
        if (headers != null) {
            ReadableMapKeySetIterator keySetIterator = headers.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                String string = headers.getString(nextKey);
                if (string != null) {
                    builder.add(nextKey, string);
                }
            }
        }
        onResponseReceived(reactContext, requestId, devToolsRequestId, url, new Response.Builder().protocol(Protocol.HTTP_1_1).request(new Request.Builder().url(url == null ? "" : url).build()).headers(builder.build()).code(statusCode).message("").build());
    }
}
