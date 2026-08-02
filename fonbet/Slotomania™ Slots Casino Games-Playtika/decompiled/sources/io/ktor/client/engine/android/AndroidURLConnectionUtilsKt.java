package io.ktor.client.engine.android;

import io.ktor.client.plugins.HttpTimeoutCapability;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.ReadingKt;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.YieldKt;

/* compiled from: AndroidURLConnectionUtils.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a6\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\fH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljava/net/HttpURLConnection;", "Lio/ktor/client/request/HttpRequestData;", "requestData", "", "setupTimeoutAttributes", "(Ljava/net/HttpURLConnection;Lio/ktor/client/request/HttpRequestData;)V", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "timeoutAttributes", "setupRequestTimeoutAttributes", "(Ljava/net/HttpURLConnection;Lio/ktor/client/plugins/HttpTimeoutConfig;)V", "T", "request", "Lkotlin/Function1;", "block", "timeoutAwareConnection", "(Ljava/net/HttpURLConnection;Lio/ktor/client/request/HttpRequestData;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "status", "Lkotlin/coroutines/CoroutineContext;", "callContext", "Lio/ktor/utils/io/ByteReadChannel;", "content", "(Ljava/net/HttpURLConnection;ILkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteReadChannel;", "", "", "isTimeoutException", "(Ljava/lang/Throwable;)Z", "ktor-client-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidURLConnectionUtilsKt {
    public static final void setupTimeoutAttributes(HttpURLConnection httpURLConnection, HttpRequestData requestData) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) requestData.getCapabilityOrNull(HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig != null) {
            Long l = httpTimeoutConfig.get_connectTimeoutMillis();
            if (l != null) {
                httpURLConnection.setConnectTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(l.longValue()));
            }
            Long l2 = httpTimeoutConfig.get_socketTimeoutMillis();
            if (l2 != null) {
                httpURLConnection.setReadTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(l2.longValue()));
            }
            setupRequestTimeoutAttributes(httpURLConnection, httpTimeoutConfig);
        }
    }

    private static final void setupRequestTimeoutAttributes(HttpURLConnection httpURLConnection, HttpTimeoutConfig httpTimeoutConfig) {
        Long l = httpTimeoutConfig.get_requestTimeoutMillis();
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != Long.MAX_VALUE) {
                if (httpURLConnection.getConnectTimeout() == 0 || httpURLConnection.getConnectTimeout() > longValue) {
                    httpURLConnection.setConnectTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(longValue));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object timeoutAwareConnection(HttpURLConnection httpURLConnection, HttpRequestData httpRequestData, Function1<? super HttpURLConnection, ? extends T> function1, Continuation<? super T> continuation) {
        AndroidURLConnectionUtilsKt$timeoutAwareConnection$1 androidURLConnectionUtilsKt$timeoutAwareConnection$1;
        int i;
        if (continuation instanceof AndroidURLConnectionUtilsKt$timeoutAwareConnection$1) {
            androidURLConnectionUtilsKt$timeoutAwareConnection$1 = (AndroidURLConnectionUtilsKt$timeoutAwareConnection$1) continuation;
            if ((androidURLConnectionUtilsKt$timeoutAwareConnection$1.label & Integer.MIN_VALUE) != 0) {
                androidURLConnectionUtilsKt$timeoutAwareConnection$1.label -= Integer.MIN_VALUE;
                Object obj = androidURLConnectionUtilsKt$timeoutAwareConnection$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidURLConnectionUtilsKt$timeoutAwareConnection$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        return function1.invoke(httpURLConnection);
                    } catch (Throwable th) {
                        th = th;
                        androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$0 = httpRequestData;
                        androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$1 = th;
                        androidURLConnectionUtilsKt$timeoutAwareConnection$1.label = 1;
                        if (YieldKt.yield(androidURLConnectionUtilsKt$timeoutAwareConnection$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$1;
                    httpRequestData = (HttpRequestData) androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!isTimeoutException(th)) {
                    throw HttpTimeoutKt.ConnectTimeoutException(httpRequestData, th);
                }
                throw th;
            }
        }
        androidURLConnectionUtilsKt$timeoutAwareConnection$1 = new AndroidURLConnectionUtilsKt$timeoutAwareConnection$1(continuation);
        Object obj2 = androidURLConnectionUtilsKt$timeoutAwareConnection$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidURLConnectionUtilsKt$timeoutAwareConnection$1.label;
        if (i != 0) {
        }
        if (!isTimeoutException(th)) {
        }
    }

    public static final ByteReadChannel content(HttpURLConnection httpURLConnection, int i, CoroutineContext callContext) {
        ByteReadChannel byteReadChannel;
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        if (CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(HttpStatusCode.INSTANCE.getNotModified().getValue()), Integer.valueOf(HttpStatusCode.INSTANCE.getNoContent().getValue())}).contains(Integer.valueOf(i))) {
            return ByteReadChannel.INSTANCE.getEmpty();
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            r0 = inputStream != null ? inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192) : null;
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                r0 = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
            }
        }
        return (r0 == null || (byteReadChannel = ReadingKt.toByteReadChannel(r0, callContext, ByteBufferPoolKt.getKtorDefaultPool())) == null) ? ByteReadChannel.INSTANCE.getEmpty() : byteReadChannel;
    }

    private static final boolean isTimeoutException(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return true;
        }
        if (th instanceof ConnectException) {
            String message = th.getMessage();
            if (message != null ? StringsKt.contains$default((CharSequence) message, (CharSequence) "timed out", false, 2, (Object) null) : false) {
                return true;
            }
        }
        return false;
    }
}
