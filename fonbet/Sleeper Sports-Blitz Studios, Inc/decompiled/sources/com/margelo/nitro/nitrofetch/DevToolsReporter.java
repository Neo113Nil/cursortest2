package com.margelo.nitro.nitrofetch;

import com.facebook.internal.AnalyticsEvents;
import com.facebook.soloader.SoLoader;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.sentry.SentryEnvelopeItemHeader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DevToolsReporter.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010&\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJB\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J:\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0018\u001a\u00020\u0014J\u0016\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0017J\u0016\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\bJ\u001e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\bJ\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u0010\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\rJ'\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00112\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%¢\u0006\u0002\u0010'J,\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00112\u0018\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0+0*R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/margelo/nitro/nitrofetch/DevToolsReporter;", "", "<init>", "()V", "impl", "Lcom/margelo/nitro/nitrofetch/DevToolsReporter$Impl;", "resolve", "isSoLoaderInitialized", "", "isDebuggingEnabled", "reportRequestStart", "", "requestId", "", "url", "method", "headers", "", "body", "encodedDataLength", "", "reportResponseStart", "statusCode", "", "expectedDataLength", "reportDataReceived", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "reportResponseEnd", "reportRequestFailed", AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "storeResponseBody", "base64Encoded", "storeResponseBodyIncremental", "data", "isTextualContentType", "contentType", "headersArrayToMap", "", "Lcom/margelo/nitro/nitrofetch/NitroHeader;", "([Lcom/margelo/nitro/nitrofetch/NitroHeader;)Ljava/util/Map;", "headersListToMap", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "Impl", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DevToolsReporter {
    public static final DevToolsReporter INSTANCE = new DevToolsReporter();
    private static volatile Impl impl;

    /* compiled from: DevToolsReporter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&J<\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH&J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H&J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003H&J \u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0003H&J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H&¨\u0006\u001c"}, d2 = {"Lcom/margelo/nitro/nitrofetch/DevToolsReporter$Impl;", "", "isDebuggingEnabled", "", "reportRequestStart", "", "requestId", "", "url", "method", "headers", "", "body", "encodedDataLength", "", "reportResponseStart", "statusCode", "", "expectedDataLength", "reportDataReceived", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "reportResponseEnd", "reportRequestFailed", AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "storeResponseBody", "base64Encoded", "storeResponseBodyIncremental", "data", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Impl {
        boolean isDebuggingEnabled();

        void reportDataReceived(String requestId, int length);

        void reportRequestFailed(String requestId, boolean cancelled);

        void reportRequestStart(String requestId, String url, String method, Map<String, String> headers, String body, long encodedDataLength);

        void reportResponseEnd(String requestId, long encodedDataLength);

        void reportResponseStart(String requestId, String url, int statusCode, Map<String, String> headers, long expectedDataLength);

        void storeResponseBody(String requestId, String body, boolean base64Encoded);

        void storeResponseBodyIncremental(String requestId, String data);
    }

    private DevToolsReporter() {
    }

    private final Impl resolve() {
        Impl impl2 = impl;
        if (impl2 != null) {
            return impl2;
        }
        if (!isSoLoaderInitialized()) {
            return null;
        }
        try {
            Object newInstance = Class.forName("com.margelo.nitro.nitrofetch.DevToolsReporterImpl").getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.margelo.nitro.nitrofetch.DevToolsReporter.Impl");
            Impl impl3 = (Impl) newInstance;
            impl = impl3;
            return impl3;
        } catch (Throwable unused) {
            return null;
        }
    }

    private final boolean isSoLoaderInitialized() {
        try {
            return SoLoader.isInitialized();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean isDebuggingEnabled() {
        Impl resolve = resolve();
        if (resolve != null) {
            return resolve.isDebuggingEnabled();
        }
        return false;
    }

    public final void reportRequestStart(String requestId, String url, String method, Map<String, String> headers, String body, long encodedDataLength) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Impl impl2 = impl;
        if (impl2 != null) {
            impl2.reportRequestStart(requestId, url, method, headers, body, encodedDataLength);
        }
    }

    public final void reportResponseStart(String requestId, String url, int statusCode, Map<String, String> headers, long expectedDataLength) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Impl impl2 = impl;
        if (impl2 != null) {
            impl2.reportResponseStart(requestId, url, statusCode, headers, expectedDataLength);
        }
    }

    public final void reportDataReceived(String requestId, int length) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Impl impl2 = impl;
        if (impl2 != null) {
            impl2.reportDataReceived(requestId, length);
        }
    }

    public final void reportResponseEnd(String requestId, long encodedDataLength) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Impl impl2 = impl;
        if (impl2 != null) {
            impl2.reportResponseEnd(requestId, encodedDataLength);
        }
    }

    public final void reportRequestFailed(String requestId, boolean cancelled) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Impl impl2 = impl;
        if (impl2 != null) {
            impl2.reportRequestFailed(requestId, cancelled);
        }
    }

    public final void storeResponseBody(String requestId, String body, boolean base64Encoded) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(body, "body");
        Impl impl2 = impl;
        if (impl2 != null) {
            impl2.storeResponseBody(requestId, body, base64Encoded);
        }
    }

    public final void storeResponseBodyIncremental(String requestId, String data) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(data, "data");
        Impl impl2 = impl;
        if (impl2 != null) {
            impl2.storeResponseBodyIncremental(requestId, data);
        }
    }

    public final boolean isTextualContentType(String contentType) {
        if (contentType == null) {
            return false;
        }
        String lowerCase = contentType.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.startsWith$default(lowerCase, "text/", false, 2, (Object) null)) {
            return true;
        }
        String str = lowerCase;
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "application/json", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "application/xml", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "application/javascript", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "+json", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "+xml", false, 2, (Object) null);
    }

    public final Map<String, String> headersArrayToMap(NitroHeader[] headers) {
        if (headers == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(headers.length);
        Iterator it = ArrayIteratorKt.iterator(headers);
        while (it.hasNext()) {
            NitroHeader nitroHeader = (NitroHeader) it.next();
            linkedHashMap.put(nitroHeader.getKey(), nitroHeader.getValue());
        }
        return linkedHashMap;
    }

    public final Map<String, String> headersListToMap(List<? extends Map.Entry<String, String>> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        LinkedHashMap linkedHashMap = new LinkedHashMap(entries.size());
        for (Map.Entry<String, String> entry : entries) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
