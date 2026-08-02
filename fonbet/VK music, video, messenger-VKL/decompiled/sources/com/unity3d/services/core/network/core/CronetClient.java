package com.unity3d.services.core.network.core;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import ru.ok.android.commons.http.Http;
import xsna.arm0;
import xsna.drm0;
import xsna.emb;
import xsna.izs;
import xsna.kq9;
import xsna.lq9;
import xsna.myc0;
import xsna.qu5;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.zcl;

/* compiled from: CronetClient.kt */
/* loaded from: classes14.dex */
public final class CronetClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    private static final String NETWORK_CLIENT_CRONET = "cronet";
    private final ISDKDispatchers dispatchers;
    private final CronetEngine engine;

    /* compiled from: CronetClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public CronetClient(CronetEngine cronetEngine, ISDKDispatchers iSDKDispatchers) {
        this.engine = cronetEngine;
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(HttpRequest httpRequest) {
        return drm0.W(drm0.q0(httpRequest.getBaseURL(), '/') + '/' + drm0.q0(httpRequest.getPath(), '/'), DomExceptionUtils.SEPARATOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(UrlResponseInfo urlResponseInfo) {
        String str;
        Long n;
        List<String> list = urlResponseInfo.getAllHeaders().get(Http.Header.CONTENT_LENGTH);
        if (list == null || (str = list.get(0)) == null || (n = arm0.n(str)) == null) {
            return -1L;
        }
        return n.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int i) {
        if (i == 0) {
            return 4;
        }
        if (i != 1) {
            return i != 2 ? 1 : 2;
        }
        return 3;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, final boolean z, spj<? super HttpResponse> spjVar) {
        final PipedOutputStream pipedOutputStream = z ? new PipedOutputStream() : null;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        UrlRequest.Builder newUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), new UnityAdsUrlRequestCallback() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // org.chromium.net.UrlRequest.Callback
            public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
                super.onCanceled(urlRequest, urlResponseInfo);
                PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Network request timed out", null, null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, null, "cronet", 38, null);
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                lq9Var.resumeWith(new Result.Failure(networkTimeoutException));
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
                PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                NetworkException networkException = cronetException instanceof NetworkException ? (NetworkException) cronetException : null;
                UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, urlResponseInfo != null ? Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null);
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                lq9Var.resumeWith(new Result.Failure(unityAdsNetworkException));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
                long contentSize;
                if (pipedOutputStream == null) {
                    super.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
                    return;
                }
                if (!atomicBoolean.getAndSet(true)) {
                    kq9<HttpResponse> kq9Var = lq9Var;
                    int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                    Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                    String url = urlResponseInfo.getUrl();
                    PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
                    String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
                    contentSize = this.getContentSize(urlResponseInfo);
                    kq9Var.resumeWith(new HttpResponse(pipedInputStream, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize));
                }
                byteBuffer.flip();
                try {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    pipedOutputStream.write(bArr);
                } catch (IOException e) {
                    DeviceLog.info("IOException during ByteBuffer read. Details: ", e);
                }
                byteBuffer.clear();
                urlRequest.read(byteBuffer);
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr) {
                long contentSize;
                PipedOutputStream pipedOutputStream2;
                if (z && (pipedOutputStream2 = pipedOutputStream) != null) {
                    pipedOutputStream2.close();
                }
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                kq9<HttpResponse> kq9Var = lq9Var;
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                String url = urlResponseInfo.getUrl();
                String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
                contentSize = this.getContentSize(urlResponseInfo);
                kq9Var.resumeWith(new HttpResponse(bArr, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize));
            }
        }, qu5.a(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                newUrlRequestBuilder.addHeader(key, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            newUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(body instanceof byte[] ? (byte[]) httpRequest.getBody() : body instanceof String ? ((String) httpRequest.getBody()).getBytes(emb.b) : new byte[0]), qu5.a(this.dispatchers.getIo()));
        }
        final UrlRequest build = newUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        lq9Var.r(new izs<Throwable, s3q0>() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$2
            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
                invoke2(th);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                UrlRequest.this.cancel();
            }
        });
        build.start();
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        return (HttpResponse) myc0.i(this.dispatchers.getIo(), new CronetClient$executeBlocking$1(this, httpRequest, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
    }
}
