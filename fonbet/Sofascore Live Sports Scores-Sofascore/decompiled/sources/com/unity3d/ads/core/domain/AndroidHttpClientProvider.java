package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.be5;
import defpackage.fz8;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.jod;
import defpackage.kj2;
import defpackage.lj2;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.wba;
import defpackage.whj;
import defpackage.wv8;
import defpackage.xd5;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import defpackage.z9a;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.chromium.net.CronetEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0015\u0010\u0010J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHttpClientProvider;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Landroid/content/Context;", "context", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "cronetEngineBuilderFactory", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "mediationTraitsMetadataReader", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Landroid/content/Context;Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;)V", "Lcom/unity3d/services/core/network/core/HttpClient;", "createHttpClient", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/HttpClientSelection;", "selectedHttpClient", "buildNetworkClient", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/HttpClientSelection;Lrq3;)Ljava/lang/Object;", "invoke", "Lcom/unity3d/services/core/network/core/OkHttp3Client;", "getOkHttp3Client", "()Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Landroid/content/Context;", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "Lh2d;", "mutex", "Lh2d;", "cachedClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {

    @Nullable
    private HttpClient cachedClient;

    @NotNull
    private final Context context;

    @NotNull
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;

    @NotNull
    private final h2d mutex;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidHttpClientProvider(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Context context, @NotNull CronetEngineBuilderFactory cronetEngineBuilderFactory, @NotNull MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        iSDKDispatchers.getClass();
        sendDiagnosticEvent.getClass();
        context.getClass();
        cronetEngineBuilderFactory.getClass();
        mediationTraitsMetadataReader.getClass();
        this.dispatchers = iSDKDispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.mutex = new j2d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, final HttpClientSelection httpClientSelection, rq3<? super HttpClient> rq3Var) {
        final lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        CronetProviderInstaller.a(context).addOnCompleteListener(fz8.B(iSDKDispatchers.getIo()), new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> task) {
                String str;
                SendDiagnosticEvent sendDiagnosticEvent;
                CronetEngineBuilderFactory cronetEngineBuilderFactory;
                SendDiagnosticEvent sendDiagnosticEvent2;
                String message;
                task.getClass();
                boolean isSuccessful = task.isSuccessful();
                AndroidHttpClientProvider androidHttpClientProvider = AndroidHttpClientProvider.this;
                str = "Errored without message.";
                if (!isSuccessful) {
                    sendDiagnosticEvent2 = androidHttpClientProvider.sendDiagnosticEvent;
                    Exception exception = task.getException();
                    if (exception != null && (message = exception.getMessage()) != null) {
                        str = message;
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_install_error", (Double) null, wv8.o("reason", str), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                    kj2 kj2Var = lj2Var;
                    p2g p2gVar = w2g.b;
                    kj2Var.resumeWith(AndroidHttpClientProvider.this.getOkHttp3Client());
                    return;
                }
                try {
                    cronetEngineBuilderFactory = androidHttpClientProvider.cronetEngineBuilderFactory;
                    CronetEngine.Builder createCronetEngineBuilder = cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                    if (httpClientSelection == HttpClientSelection.CRONET_WITH_QUIC) {
                        createCronetEngineBuilder.enableQuic(true);
                        createCronetEngineBuilder.addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443);
                        createCronetEngineBuilder.addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                    }
                    CronetEngine build = createCronetEngineBuilder.build();
                    kj2 kj2Var2 = lj2Var;
                    p2g p2gVar2 = w2g.b;
                    build.getClass();
                    kj2Var2.resumeWith(new CronetClient(build, iSDKDispatchers));
                } catch (Throwable th) {
                    sendDiagnosticEvent = AndroidHttpClientProvider.this.sendDiagnosticEvent;
                    String message2 = th.getMessage();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_engine_error", (Double) null, wv8.o("reason", message2 != null ? message2 : "Errored without message."), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                    kj2 kj2Var3 = lj2Var;
                    p2g p2gVar3 = w2g.b;
                    kj2Var3.resumeWith(AndroidHttpClientProvider.this.getOkHttp3Client());
                }
            }
        });
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0064, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createHttpClient(rq3<? super HttpClient> rq3Var) {
        AndroidHttpClientProvider$createHttpClient$1 androidHttpClientProvider$createHttpClient$1;
        int i;
        Object u2gVar;
        HttpClientSelection httpClientSelection;
        HttpClientSelection httpClientSelection2;
        long j;
        if (rq3Var instanceof AndroidHttpClientProvider$createHttpClient$1) {
            androidHttpClientProvider$createHttpClient$1 = (AndroidHttpClientProvider$createHttpClient$1) rq3Var;
            int i2 = androidHttpClientProvider$createHttpClient$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHttpClientProvider$createHttpClient$1.label = i2 - Integer.MIN_VALUE;
                AndroidHttpClientProvider$createHttpClient$1 androidHttpClientProvider$createHttpClient$12 = androidHttpClientProvider$createHttpClient$1;
                Object obj = androidHttpClientProvider$createHttpClient$12.result;
                lu3 lu3Var = lu3.a;
                i = androidHttpClientProvider$createHttpClient$12.label;
                if (i != 0) {
                    y6a.M(obj);
                    String stringTrait = this.mediationTraitsMetadataReader.getStringTrait(MediationTraitsMetadataReader.USE_HTTP_CLIENT);
                    if (stringTrait != null) {
                        try {
                            p2g p2gVar = w2g.b;
                            String upperCase = stringTrait.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            u2gVar = HttpClientSelection.valueOf(upperCase);
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                        }
                        if (u2gVar instanceof u2g) {
                            u2gVar = null;
                        }
                        httpClientSelection = (HttpClientSelection) u2gVar;
                    }
                    httpClientSelection = HttpClientSelection.CRONET_WITHOUT_QUIC;
                    xhj.a.getClass();
                    xuc.a.getClass();
                    long b = xuc.b();
                    AndroidHttpClientProvider$createHttpClient$client$1 androidHttpClientProvider$createHttpClient$client$1 = new AndroidHttpClientProvider$createHttpClient$client$1(httpClientSelection, this, null);
                    androidHttpClientProvider$createHttpClient$12.L$0 = httpClientSelection;
                    androidHttpClientProvider$createHttpClient$12.J$0 = b;
                    androidHttpClientProvider$createHttpClient$12.label = 1;
                    Object V = wba.V(500L, androidHttpClientProvider$createHttpClient$client$1, androidHttpClientProvider$createHttpClient$12);
                    if (V == lu3Var) {
                        return lu3Var;
                    }
                    HttpClientSelection httpClientSelection3 = httpClientSelection;
                    obj = V;
                    httpClientSelection2 = httpClientSelection3;
                    j = b;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = androidHttpClientProvider$createHttpClient$12.J$0;
                    httpClientSelection2 = (HttpClientSelection) androidHttpClientProvider$createHttpClient$12.L$0;
                    y6a.M(obj);
                }
                HttpClient httpClient = (HttpClient) obj;
                long b2 = whj.b(j);
                be5 be5Var = be5.NANOSECONDS;
                double j2 = xd5.j(b2);
                if (StringsKt.J(httpClientSelection2.name(), "CRONET", false)) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, httpClient == null ? "native_cronet_timeout" : httpClient instanceof CronetClient ? "native_cronet_success_time" : "native_cronet_failure_time", new Double(j2), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                }
                return httpClient != null ? getOkHttp3Client() : httpClient;
            }
        }
        androidHttpClientProvider$createHttpClient$1 = new AndroidHttpClientProvider$createHttpClient$1(this, rq3Var);
        AndroidHttpClientProvider$createHttpClient$1 androidHttpClientProvider$createHttpClient$122 = androidHttpClientProvider$createHttpClient$1;
        Object obj2 = androidHttpClientProvider$createHttpClient$122.result;
        lu3 lu3Var2 = lu3.a;
        i = androidHttpClientProvider$createHttpClient$122.label;
        if (i != 0) {
        }
        HttpClient httpClient2 = (HttpClient) obj2;
        long b22 = whj.b(j);
        be5 be5Var2 = be5.NANOSECONDS;
        double j22 = xd5.j(b22);
        if (StringsKt.J(httpClientSelection2.name(), "CRONET", false)) {
        }
        if (httpClient2 != null) {
        }
    }

    @NotNull
    public final OkHttp3Client getOkHttp3Client() {
        return new OkHttp3Client(this.dispatchers, new jod());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004d, code lost:
    
        if (r8.e(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058 A[Catch: all -> 0x006e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x006e, blocks: (B:25:0x0050, B:29:0x0058), top: B:24:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull rq3<? super HttpClient> rq3Var) {
        AndroidHttpClientProvider$invoke$1 androidHttpClientProvider$invoke$1;
        int i;
        h2d h2dVar;
        h2d h2dVar2;
        HttpClient httpClient;
        try {
            if (rq3Var instanceof AndroidHttpClientProvider$invoke$1) {
                androidHttpClientProvider$invoke$1 = (AndroidHttpClientProvider$invoke$1) rq3Var;
                int i2 = androidHttpClientProvider$invoke$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidHttpClientProvider$invoke$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidHttpClientProvider$invoke$1.result;
                    Object obj2 = lu3.a;
                    i = androidHttpClientProvider$invoke$1.label;
                    if (i != 0) {
                        y6a.M(obj);
                        h2dVar = this.mutex;
                        androidHttpClientProvider$invoke$1.L$0 = h2dVar;
                        androidHttpClientProvider$invoke$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2dVar2 = (h2d) androidHttpClientProvider$invoke$1.L$0;
                            try {
                                y6a.M(obj);
                                HttpClient httpClient2 = (HttpClient) obj;
                                this.cachedClient = httpClient2;
                                h2dVar2.f(null);
                                return httpClient2;
                            } catch (Throwable th) {
                                th = th;
                                h2dVar2.f(null);
                                throw th;
                            }
                        }
                        h2d h2dVar3 = (h2d) androidHttpClientProvider$invoke$1.L$0;
                        y6a.M(obj);
                        h2dVar = h2dVar3;
                    }
                    httpClient = this.cachedClient;
                    if (httpClient == null) {
                        h2dVar.f(null);
                        return httpClient;
                    }
                    androidHttpClientProvider$invoke$1.L$0 = h2dVar;
                    androidHttpClientProvider$invoke$1.label = 2;
                    Object createHttpClient = createHttpClient(androidHttpClientProvider$invoke$1);
                    if (createHttpClient != obj2) {
                        h2dVar2 = h2dVar;
                        obj = createHttpClient;
                        HttpClient httpClient22 = (HttpClient) obj;
                        this.cachedClient = httpClient22;
                        h2dVar2.f(null);
                        return httpClient22;
                    }
                    return obj2;
                }
            }
            httpClient = this.cachedClient;
            if (httpClient == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            h2dVar2 = h2dVar;
            h2dVar2.f(null);
            throw th;
        }
        androidHttpClientProvider$invoke$1 = new AndroidHttpClientProvider$invoke$1(this, rq3Var);
        Object obj3 = androidHttpClientProvider$invoke$1.result;
        Object obj22 = lu3.a;
        i = androidHttpClientProvider$invoke$1.label;
        if (i != 0) {
        }
    }
}
