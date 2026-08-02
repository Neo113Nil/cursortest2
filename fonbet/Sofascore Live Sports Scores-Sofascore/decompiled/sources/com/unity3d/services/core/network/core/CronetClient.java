package com.unity3d.services.core.network.core;

import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import defpackage.fz8;
import defpackage.kj2;
import defpackage.lj2;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.td4;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.z9a;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006#"}, d2 = {"Lcom/unity3d/services/core/network/core/CronetClient;", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lorg/chromium/net/CronetEngine;", "engine", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "<init>", "(Lorg/chromium/net/CronetEngine;Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "getPriority", "(I)I", "Lcom/unity3d/services/core/network/model/HttpRequest;", "request", "", "buildUrl", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Ljava/lang/String;", "Lorg/chromium/net/UrlResponseInfo;", "info", "", "getContentSize", "(Lorg/chromium/net/UrlResponseInfo;)J", "", "shutdown", "()V", "Lcom/unity3d/services/core/network/model/HttpResponse;", "executeBlocking", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lcom/unity3d/services/core/network/model/HttpResponse;", "", "withInputStream", "execute", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLrq3;)Ljava/lang/Object;", "Lorg/chromium/net/CronetEngine;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetClient implements HttpClient {

    @NotNull
    private static final String MSG_CONNECTION_FAILED = "Network request failed";

    @NotNull
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";

    @NotNull
    private static final String NETWORK_CLIENT_CRONET = "cronet";

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final CronetEngine engine;

    public CronetClient(@NotNull CronetEngine cronetEngine, @NotNull ISDKDispatchers iSDKDispatchers) {
        cronetEngine.getClass();
        iSDKDispatchers.getClass();
        this.engine = cronetEngine;
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(HttpRequest request) {
        return StringsKt.W(StringsKt.m0(request.getBaseURL(), '/') + '/' + StringsKt.m0(request.getPath(), '/'), "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(UrlResponseInfo info) {
        String str;
        Long k0;
        List<String> list = info.getAllHeaders().get("Content-Length");
        if (list == null || (str = list.get(0)) == null || (k0 = StringsKt.k0(str)) == null) {
            return -1L;
        }
        return k0.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int priority) {
        if (priority == 0) {
            return 4;
        }
        if (priority != 1) {
            return priority != 2 ? 1 : 2;
        }
        return 3;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @Nullable
    public Object execute(@NotNull HttpRequest httpRequest, final boolean z, @NotNull rq3<? super HttpResponse> rq3Var) {
        byte[] bArr;
        final PipedOutputStream pipedOutputStream = z ? new PipedOutputStream() : null;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        UrlRequest.Builder newUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), new UnityAdsUrlRequestCallback() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // org.chromium.net.UrlRequest.Callback
            public void onCanceled(UrlRequest request, UrlResponseInfo info) {
                super.onCanceled(request, info);
                PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Network request timed out", null, null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, null, "cronet", 38, null);
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                kj2 kj2Var = lj2Var;
                p2g p2gVar = w2g.b;
                kj2Var.resumeWith(new u2g(networkTimeoutException));
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onFailed(UrlRequest request, UrlResponseInfo info, CronetException error) {
                PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                NetworkException networkException = error instanceof NetworkException ? (NetworkException) error : null;
                UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, info != null ? Integer.valueOf(info.getHttpStatusCode()) : null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null);
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                kj2 kj2Var = lj2Var;
                p2g p2gVar = w2g.b;
                kj2Var.resumeWith(new u2g(unityAdsNetworkException));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) {
                long contentSize;
                request.getClass();
                info.getClass();
                byteBuffer.getClass();
                if (pipedOutputStream == null) {
                    super.onReadCompleted(request, info, byteBuffer);
                    return;
                }
                if (!atomicBoolean.getAndSet(true)) {
                    kj2 kj2Var = lj2Var;
                    int httpStatusCode = info.getHttpStatusCode();
                    Map<String, List<String>> allHeaders = info.getAllHeaders();
                    allHeaders.getClass();
                    String url = info.getUrl();
                    url.getClass();
                    PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
                    String negotiatedProtocol = info.getNegotiatedProtocol();
                    negotiatedProtocol.getClass();
                    contentSize = this.getContentSize(info);
                    HttpResponse httpResponse = new HttpResponse(pipedInputStream, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize);
                    p2g p2gVar = w2g.b;
                    kj2Var.resumeWith(httpResponse);
                }
                byteBuffer.flip();
                try {
                    byte[] bArr2 = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr2);
                    pipedOutputStream.write(bArr2);
                } catch (IOException e) {
                    DeviceLog.info("IOException during ByteBuffer read. Details: ", e);
                }
                byteBuffer.clear();
                request.read(byteBuffer);
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(UrlRequest request, UrlResponseInfo info, byte[] bodyBytes) {
                long contentSize;
                PipedOutputStream pipedOutputStream2;
                request.getClass();
                info.getClass();
                bodyBytes.getClass();
                if (z && (pipedOutputStream2 = pipedOutputStream) != null) {
                    pipedOutputStream2.close();
                }
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                kj2 kj2Var = lj2Var;
                int httpStatusCode = info.getHttpStatusCode();
                Map<String, List<String>> allHeaders = info.getAllHeaders();
                allHeaders.getClass();
                String url = info.getUrl();
                url.getClass();
                String negotiatedProtocol = info.getNegotiatedProtocol();
                negotiatedProtocol.getClass();
                contentSize = this.getContentSize(info);
                HttpResponse httpResponse = new HttpResponse(bodyBytes, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize);
                p2g p2gVar = w2g.b;
                kj2Var.resumeWith(httpResponse);
            }
        }, fz8.B(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                newUrlRequestBuilder.addHeader(key, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bArr = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bArr = ((String) httpRequest.getBody()).getBytes(Charsets.UTF_8);
                bArr.getClass();
            } else {
                bArr = new byte[0];
            }
            newUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bArr), fz8.B(this.dispatchers.getIo()));
        }
        final UrlRequest build = newUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        lj2Var.v(new Function1<Throwable, Unit>() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.a;
            }

            public final void invoke(Throwable th) {
                UrlRequest.this.cancel();
            }
        });
        build.start();
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @NotNull
    public HttpResponse executeBlocking(@NotNull HttpRequest request) {
        request.getClass();
        return (HttpResponse) td4.t0(this.dispatchers.getIo(), new CronetClient$executeBlocking$1(this, request, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
    }
}
