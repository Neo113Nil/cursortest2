package com.margelo.nitro.nitrofetch;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.AnalyticsEvents;
import com.margelo.nitro.nitrofetch.DevToolsReporter;
import io.sentry.SentryEnvelopeItemHeader;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevToolsReporterImpl.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016JD\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J<\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001c2\u0006\u0010#\u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010%\u001a\u00020\"H\u0016J\u0018\u0010&\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010'\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0015H\u0016J \u0010)\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0015H\u0016J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/margelo/nitro/nitrofetch/DevToolsReporterImpl;", "Lcom/margelo/nitro/nitrofetch/DevToolsReporter$Impl;", "<init>", "()V", "cls", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", CmcdData.OBJECT_TYPE_MANIFEST, "Ljava/lang/reflect/Method;", "name", "", "mIsDebuggingEnabled", "mReportRequestStart", "mReportConnectionTiming", "mReportResponseStart", "mReportDataReceivedImpl", "mReportResponseEnd", "mReportRequestFailed", "mMaybeStoreResponseBody", "mMaybeStoreResponseBodyIncremental", "isDebuggingEnabled", "", "reportRequestStart", "", "requestId", "url", "method", "headers", "", "body", "encodedDataLength", "", "reportResponseStart", "statusCode", "", "expectedDataLength", "reportDataReceived", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "reportResponseEnd", "reportRequestFailed", AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "storeResponseBody", "base64Encoded", "storeResponseBodyIncremental", "data", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DevToolsReporterImpl implements DevToolsReporter.Impl {
    private final Class<?> cls = Class.forName("com.facebook.react.modules.network.InspectorNetworkReporter");
    private final Method mIsDebuggingEnabled = m("isDebuggingEnabled");
    private final Method mReportRequestStart = m("reportRequestStart");
    private final Method mReportConnectionTiming = m("reportConnectionTiming");
    private final Method mReportResponseStart = m("reportResponseStart");
    private final Method mReportDataReceivedImpl = m("reportDataReceivedImpl");
    private final Method mReportResponseEnd = m("reportResponseEnd");
    private final Method mReportRequestFailed = m("reportRequestFailed");
    private final Method mMaybeStoreResponseBody = m("maybeStoreResponseBody");
    private final Method mMaybeStoreResponseBodyIncremental = m("maybeStoreResponseBodyIncremental");

    private final Method m(String name) {
        Method[] methods = this.cls.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
        for (Method method : methods) {
            Method method2 = method;
            if (Intrinsics.areEqual(method2.getName(), name)) {
                Intrinsics.checkNotNullExpressionValue(method, "first(...)");
                return method2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.margelo.nitro.nitrofetch.DevToolsReporter.Impl
    public boolean isDebuggingEnabled() {
        Object invoke = this.mIsDebuggingEnabled.invoke(null, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) invoke).booleanValue();
    }

    @Override // com.margelo.nitro.nitrofetch.DevToolsReporter.Impl
    public void reportRequestStart(String requestId, String url, String method, Map<String, String> headers, String body, long encodedDataLength) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.mReportRequestStart.invoke(null, requestId, url, method, headers, body, Long.valueOf(encodedDataLength));
        this.mReportConnectionTiming.invoke(null, requestId, headers);
    }

    @Override // com.margelo.nitro.nitrofetch.DevToolsReporter.Impl
    public void reportResponseStart(String requestId, String url, int statusCode, Map<String, String> headers, long expectedDataLength) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.mReportResponseStart.invoke(null, requestId, url, Integer.valueOf(statusCode), headers, Long.valueOf(expectedDataLength));
    }

    @Override // com.margelo.nitro.nitrofetch.DevToolsReporter.Impl
    public void reportDataReceived(String requestId, int length) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.mReportDataReceivedImpl.invoke(null, requestId, Integer.valueOf(length));
    }

    @Override // com.margelo.nitro.nitrofetch.DevToolsReporter.Impl
    public void reportResponseEnd(String requestId, long encodedDataLength) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.mReportResponseEnd.invoke(null, requestId, Long.valueOf(encodedDataLength));
    }

    @Override // com.margelo.nitro.nitrofetch.DevToolsReporter.Impl
    public void reportRequestFailed(String requestId, boolean cancelled) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.mReportRequestFailed.invoke(null, requestId, Boolean.valueOf(cancelled));
    }

    @Override // com.margelo.nitro.nitrofetch.DevToolsReporter.Impl
    public void storeResponseBody(String requestId, String body, boolean base64Encoded) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(body, "body");
        this.mMaybeStoreResponseBody.invoke(null, requestId, body, Boolean.valueOf(base64Encoded));
    }

    @Override // com.margelo.nitro.nitrofetch.DevToolsReporter.Impl
    public void storeResponseBodyIncremental(String requestId, String data) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(data, "data");
        this.mMaybeStoreResponseBodyIncremental.invoke(null, requestId, data);
    }
}
