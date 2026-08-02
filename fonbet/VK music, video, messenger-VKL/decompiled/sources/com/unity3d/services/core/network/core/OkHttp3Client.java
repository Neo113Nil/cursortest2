package com.unity3d.services.core.network.core;

import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import okhttp3.d;
import okhttp3.k;
import okhttp3.o;
import okhttp3.p;
import okhttp3.u;
import okhttp3.v;
import ru.ok.android.commons.http.Http;
import xsna.arm0;
import xsna.f8f0;
import xsna.izs;
import xsna.kq9;
import xsna.lb9;
import xsna.lhg;
import xsna.lq9;
import xsna.myc0;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.zcl;

/* compiled from: OkHttp3Client.kt */
/* loaded from: classes14.dex */
public final class OkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";
    private final o client;
    private final ISDKDispatchers dispatchers;

    /* compiled from: OkHttp3Client.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public OkHttp3Client(ISDKDispatchers iSDKDispatchers, o oVar) {
        this.dispatchers = iSDKDispatchers;
        this.client = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(HttpRequest httpRequest, final boolean z, spj<? super HttpResponse> spjVar) {
        OkHttp3Client$execute$1 okHttp3Client$execute$1;
        int i;
        try {
            if (spjVar instanceof OkHttp3Client$execute$1) {
                okHttp3Client$execute$1 = (OkHttp3Client$execute$1) spjVar;
                int i2 = okHttp3Client$execute$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    okHttp3Client$execute$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = okHttp3Client$execute$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = okHttp3Client$execute$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                        return obj;
                    }
                    a.a(obj);
                    p okHttpProtoRequest = HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest);
                    o.a e = this.client.e();
                    long connectTimeout = httpRequest.getConnectTimeout();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    e.c(connectTimeout, timeUnit);
                    e.e(httpRequest.getReadTimeout(), timeUnit);
                    e.g(httpRequest.getWriteTimeout(), timeUnit);
                    o oVar = new o(e);
                    okHttp3Client$execute$1.L$0 = httpRequest;
                    okHttp3Client$execute$1.L$1 = okHttpProtoRequest;
                    okHttp3Client$execute$1.L$2 = oVar;
                    okHttp3Client$execute$1.Z$0 = z;
                    okHttp3Client$execute$1.label = 1;
                    final lq9 lq9Var = new lq9(1, s7s0.c(okHttp3Client$execute$1));
                    lq9Var.o();
                    final d a = oVar.a(okHttpProtoRequest);
                    lq9Var.r(new izs<Throwable, s3q0>() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1
                        @Override // xsna.izs
                        public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
                            invoke2(th);
                            return s3q0.a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable th) {
                            d.this.cancel();
                        }
                    });
                    ((f8f0) a).f9(new lb9() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2
                        @Override // xsna.lb9
                        public void onFailure(d dVar, IOException iOException) {
                            lq9Var.resumeWith(new Result.Failure(iOException));
                        }

                        @Override // xsna.lb9
                        public void onResponse(d dVar, u uVar) {
                            Long n;
                            int i3 = uVar.e;
                            k kVar = uVar.g;
                            v vVar = uVar.h;
                            if (vVar == null) {
                                lq9Var.resumeWith(new Result.Failure(new UnityAdsNetworkException("Empty response", null, Integer.valueOf(i3), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null)));
                                return;
                            }
                            if (!uVar.t()) {
                                vVar.close();
                                lq9Var.resumeWith(new Result.Failure(new UnityAdsNetworkException(lhg.a(i3, "Network request failed with code "), null, Integer.valueOf(i3), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null)));
                                return;
                            }
                            try {
                                Object byteStream = z ? vVar.byteStream() : vVar.bytes();
                                kq9<HttpResponse> kq9Var = lq9Var;
                                int i4 = uVar.e;
                                TreeMap e2 = kVar.e();
                                String str = uVar.b.a.i;
                                String protocol = uVar.c.toString();
                                String a2 = kVar.a(Http.Header.CONTENT_LENGTH);
                                if (a2 == null) {
                                    a2 = null;
                                }
                                kq9Var.resumeWith(new HttpResponse(byteStream, i4, e2, str, protocol, OkHttp3Client.NETWORK_CLIENT_OKHTTP, (a2 == null || (n = arm0.n(a2)) == null) ? -1L : n.longValue()));
                            } catch (Exception e3) {
                                vVar.close();
                                lq9Var.resumeWith(new Result.Failure(e3));
                            }
                        }
                    });
                    Object n = lq9Var.n();
                    return n == coroutineSingletons ? coroutineSingletons : n;
                }
            }
            if (i == 0) {
            }
        } catch (SocketTimeoutException unused) {
            throw new NetworkTimeoutException(MSG_CONNECTION_TIMEOUT, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        } catch (IOException unused2) {
            throw new UnityAdsNetworkException(MSG_CONNECTION_FAILED, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        }
        okHttp3Client$execute$1 = new OkHttp3Client$execute$1(this, spjVar);
        Object obj2 = okHttp3Client$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = okHttp3Client$execute$1.label;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        return (HttpResponse) myc0.i(this.dispatchers.getIo(), new OkHttp3Client$executeBlocking$1(this, httpRequest, null));
    }
}
