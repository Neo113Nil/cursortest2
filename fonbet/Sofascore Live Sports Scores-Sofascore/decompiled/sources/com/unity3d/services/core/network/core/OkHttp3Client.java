package com.unity3d.services.core.network.core;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import defpackage.a70;
import defpackage.ah2;
import defpackage.d2g;
import defpackage.i2g;
import defpackage.iod;
import defpackage.jod;
import defpackage.kj2;
import defpackage.lj2;
import defpackage.ljg;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.pof;
import defpackage.q89;
import defpackage.qh2;
import defpackage.qzf;
import defpackage.rq3;
import defpackage.td4;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import defpackage.yol;
import defpackage.z9a;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Ljod;", "client", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Ljod;)V", "Lcom/unity3d/services/core/network/model/HttpRequest;", "request", "Lcom/unity3d/services/core/network/model/HttpResponse;", "executeBlocking", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lcom/unity3d/services/core/network/model/HttpResponse;", "", "withInputStream", "execute", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLrq3;)Ljava/lang/Object;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Ljod;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OkHttp3Client implements HttpClient {

    @NotNull
    public static final String MSG_CONNECTION_FAILED = "Network request failed";

    @NotNull
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";

    @NotNull
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";

    @NotNull
    private final jod client;

    @NotNull
    private final ISDKDispatchers dispatchers;

    public OkHttp3Client(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull jod jodVar) {
        iSDKDispatchers.getClass();
        jodVar.getClass();
        this.dispatchers = iSDKDispatchers;
        this.client = jodVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull HttpRequest httpRequest, final boolean z, @NotNull rq3<? super HttpResponse> rq3Var) {
        OkHttp3Client$execute$1 okHttp3Client$execute$1;
        int i;
        try {
            if (rq3Var instanceof OkHttp3Client$execute$1) {
                okHttp3Client$execute$1 = (OkHttp3Client$execute$1) rq3Var;
                int i2 = okHttp3Client$execute$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    okHttp3Client$execute$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = okHttp3Client$execute$1.result;
                    lu3 lu3Var = lu3.a;
                    i = okHttp3Client$execute$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        return obj;
                    }
                    y6a.M(obj);
                    qzf okHttpProtoRequest = HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest);
                    iod a = this.client.a();
                    long connectTimeout = httpRequest.getConnectTimeout();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    a.c(connectTimeout, timeUnit);
                    a.d(httpRequest.getReadTimeout(), timeUnit);
                    a.A = yol.b("timeout", httpRequest.getWriteTimeout(), timeUnit);
                    jod jodVar = new jod(a);
                    okHttp3Client$execute$1.L$0 = httpRequest;
                    okHttp3Client$execute$1.L$1 = okHttpProtoRequest;
                    okHttp3Client$execute$1.L$2 = jodVar;
                    okHttp3Client$execute$1.Z$0 = z;
                    okHttp3Client$execute$1.label = 1;
                    final lj2 lj2Var = new lj2(1, z9a.b(okHttp3Client$execute$1));
                    lj2Var.t();
                    final pof b = jodVar.b(okHttpProtoRequest);
                    lj2Var.v(new Function1<Throwable, Unit>() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((Throwable) obj2);
                            return Unit.a;
                        }

                        public final void invoke(Throwable th) {
                            ((pof) ah2.this).cancel();
                        }
                    });
                    FirebasePerfOkHttpClient.enqueue(b, new qh2() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2
                        @Override // defpackage.qh2
                        public void onFailure(ah2 call, IOException e) {
                            call.getClass();
                            e.getClass();
                            kj2 kj2Var = kj2.this;
                            p2g p2gVar = w2g.b;
                            kj2Var.resumeWith(new u2g(e));
                        }

                        @Override // defpackage.qh2
                        public void onResponse(ah2 call, d2g response) {
                            Object bytes;
                            Long k0;
                            call.getClass();
                            response.getClass();
                            q89 q89Var = response.f;
                            i2g i2gVar = response.g;
                            int i3 = response.d;
                            if (i2gVar == null) {
                                kj2 kj2Var = kj2.this;
                                p2g p2gVar = w2g.b;
                                kj2Var.resumeWith(new u2g(new UnityAdsNetworkException("Empty response", null, Integer.valueOf(i3), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null)));
                                return;
                            }
                            if (!response.q) {
                                i2gVar.close();
                                kj2 kj2Var2 = kj2.this;
                                p2g p2gVar2 = w2g.b;
                                kj2Var2.resumeWith(new u2g(new UnityAdsNetworkException(ljg.j(i3, "Network request failed with code "), null, Integer.valueOf(i3), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null)));
                                return;
                            }
                            try {
                                if (z) {
                                    bytes = i2gVar.byteStream();
                                    bytes.getClass();
                                } else {
                                    bytes = i2gVar.bytes();
                                }
                                Object obj2 = bytes;
                                kj2 kj2Var3 = kj2.this;
                                int i4 = response.d;
                                TreeMap c = q89Var.c();
                                String str = response.a.a.i;
                                obj2.getClass();
                                String str2 = response.b.a;
                                String a2 = q89Var.a("Content-Length");
                                if (a2 == null) {
                                    a2 = null;
                                }
                                HttpResponse httpResponse = new HttpResponse(obj2, i4, c, str, str2, OkHttp3Client.NETWORK_CLIENT_OKHTTP, (a2 == null || (k0 = StringsKt.k0(a2)) == null) ? -1L : k0.longValue());
                                p2g p2gVar3 = w2g.b;
                                kj2Var3.resumeWith(httpResponse);
                            } catch (Exception e) {
                                i2gVar.close();
                                kj2 kj2Var4 = kj2.this;
                                p2g p2gVar4 = w2g.b;
                                kj2Var4.resumeWith(new u2g(e));
                            }
                        }
                    });
                    Object q = lj2Var.q();
                    return q == lu3Var ? lu3Var : q;
                }
            }
            if (i == 0) {
            }
        } catch (SocketTimeoutException unused) {
            throw new NetworkTimeoutException(MSG_CONNECTION_TIMEOUT, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        } catch (IOException unused2) {
            throw new UnityAdsNetworkException(MSG_CONNECTION_FAILED, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        }
        okHttp3Client$execute$1 = new OkHttp3Client$execute$1(this, rq3Var);
        Object obj2 = okHttp3Client$execute$1.result;
        lu3 lu3Var2 = lu3.a;
        i = okHttp3Client$execute$1.label;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @NotNull
    public HttpResponse executeBlocking(@NotNull HttpRequest request) {
        request.getClass();
        return (HttpResponse) td4.t0(this.dispatchers.getIo(), new OkHttp3Client$executeBlocking$1(this, request, null));
    }
}
