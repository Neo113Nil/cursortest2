package com.unity3d.ads.core.domain;

import android.content.Context;
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
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;
import okhttp3.o;
import org.chromium.net.CronetEngine;
import xsna.bay;
import xsna.drm0;
import xsna.dt;
import xsna.jvo0;
import xsna.k830;
import xsna.lq9;
import xsna.oxo0;
import xsna.qu5;
import xsna.s7s0;
import xsna.spj;
import xsna.ui50;
import xsna.xek;
import xsna.zno;

/* compiled from: AndroidHttpClientProvider.kt */
/* loaded from: classes14.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private HttpClient cachedClient;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final ui50 mutex = bay.a();
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidHttpClientProvider(ISDKDispatchers iSDKDispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory, MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        this.dispatchers = iSDKDispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, final HttpClientSelection httpClientSelection, spj<? super HttpClient> spjVar) {
        final lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        xek.a(context).addOnCompleteListener(qu5.a(iSDKDispatchers.getIo()), new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> task) {
                String str;
                SendDiagnosticEvent sendDiagnosticEvent;
                CronetEngineBuilderFactory cronetEngineBuilderFactory;
                SendDiagnosticEvent sendDiagnosticEvent2;
                String message;
                str = "Errored without message.";
                if (!task.isSuccessful()) {
                    sendDiagnosticEvent2 = AndroidHttpClientProvider.this.sendDiagnosticEvent;
                    Exception exception = task.getException();
                    if (exception != null && (message = exception.getMessage()) != null) {
                        str = message;
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_install_error", (Double) null, dt.b("reason", str), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                    lq9Var.resumeWith(AndroidHttpClientProvider.this.getOkHttp3Client());
                    return;
                }
                try {
                    cronetEngineBuilderFactory = AndroidHttpClientProvider.this.cronetEngineBuilderFactory;
                    CronetEngine.Builder createCronetEngineBuilder = cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                    if (httpClientSelection == HttpClientSelection.CRONET_WITH_QUIC) {
                        createCronetEngineBuilder.enableQuic(true);
                        createCronetEngineBuilder.addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443);
                        createCronetEngineBuilder.addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                    }
                    lq9Var.resumeWith(new CronetClient(createCronetEngineBuilder.build(), iSDKDispatchers));
                } catch (Throwable th) {
                    sendDiagnosticEvent = AndroidHttpClientProvider.this.sendDiagnosticEvent;
                    String message2 = th.getMessage();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_engine_error", (Double) null, dt.b("reason", message2 != null ? message2 : "Errored without message."), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                    lq9Var.resumeWith(AndroidHttpClientProvider.this.getOkHttp3Client());
                }
            }
        });
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createHttpClient(spj<? super HttpClient> spjVar) {
        AndroidHttpClientProvider$createHttpClient$1 androidHttpClientProvider$createHttpClient$1;
        int i;
        Object failure;
        HttpClientSelection httpClientSelection;
        HttpClientSelection httpClientSelection2;
        long j;
        if (spjVar instanceof AndroidHttpClientProvider$createHttpClient$1) {
            androidHttpClientProvider$createHttpClient$1 = (AndroidHttpClientProvider$createHttpClient$1) spjVar;
            int i2 = androidHttpClientProvider$createHttpClient$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHttpClientProvider$createHttpClient$1.label = i2 - Integer.MIN_VALUE;
                AndroidHttpClientProvider$createHttpClient$1 androidHttpClientProvider$createHttpClient$12 = androidHttpClientProvider$createHttpClient$1;
                Object obj = androidHttpClientProvider$createHttpClient$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidHttpClientProvider$createHttpClient$12.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    String stringTrait = this.mediationTraitsMetadataReader.getStringTrait(MediationTraitsMetadataReader.USE_HTTP_CLIENT);
                    if (stringTrait != null) {
                        try {
                            failure = HttpClientSelection.valueOf(stringTrait.toUpperCase(Locale.ROOT));
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        httpClientSelection = (HttpClientSelection) failure;
                    }
                    httpClientSelection = HttpClientSelection.CRONET_WITHOUT_QUIC;
                    long b = k830.b();
                    AndroidHttpClientProvider$createHttpClient$client$1 androidHttpClientProvider$createHttpClient$client$1 = new AndroidHttpClientProvider$createHttpClient$client$1(httpClientSelection, this, null);
                    androidHttpClientProvider$createHttpClient$12.L$0 = httpClientSelection;
                    androidHttpClientProvider$createHttpClient$12.J$0 = b;
                    androidHttpClientProvider$createHttpClient$12.label = 1;
                    Object c = oxo0.c(500L, androidHttpClientProvider$createHttpClient$client$1, androidHttpClientProvider$createHttpClient$12);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    HttpClientSelection httpClientSelection3 = httpClientSelection;
                    obj = c;
                    httpClientSelection2 = httpClientSelection3;
                    j = b;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = androidHttpClientProvider$createHttpClient$12.J$0;
                    httpClientSelection2 = (HttpClientSelection) androidHttpClientProvider$createHttpClient$12.L$0;
                    kotlin.a.a(obj);
                }
                HttpClient httpClient = (HttpClient) obj;
                double k = zno.k(jvo0.a.b(j), DurationUnit.MILLISECONDS);
                if (drm0.D(httpClientSelection2.name(), "CRONET", false)) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, httpClient == null ? "native_cronet_timeout" : httpClient instanceof CronetClient ? "native_cronet_success_time" : "native_cronet_failure_time", new Double(k), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                }
                return httpClient != null ? getOkHttp3Client() : httpClient;
            }
        }
        androidHttpClientProvider$createHttpClient$1 = new AndroidHttpClientProvider$createHttpClient$1(this, spjVar);
        AndroidHttpClientProvider$createHttpClient$1 androidHttpClientProvider$createHttpClient$122 = androidHttpClientProvider$createHttpClient$1;
        Object obj2 = androidHttpClientProvider$createHttpClient$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidHttpClientProvider$createHttpClient$122.label;
        if (i != 0) {
        }
        HttpClient httpClient2 = (HttpClient) obj2;
        double k2 = zno.k(jvo0.a.b(j), DurationUnit.MILLISECONDS);
        if (drm0.D(httpClientSelection2.name(), "CRONET", false)) {
        }
        if (httpClient2 != null) {
        }
    }

    public final OkHttp3Client getOkHttp3Client() {
        return new OkHttp3Client(this.dispatchers, new o());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        if (r8.b(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:25:0x0052, B:29:0x005a), top: B:24:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(spj<? super HttpClient> spjVar) {
        AndroidHttpClientProvider$invoke$1 androidHttpClientProvider$invoke$1;
        int i;
        ui50 ui50Var;
        ui50 ui50Var2;
        Throwable th;
        HttpClient httpClient;
        try {
            if (spjVar instanceof AndroidHttpClientProvider$invoke$1) {
                androidHttpClientProvider$invoke$1 = (AndroidHttpClientProvider$invoke$1) spjVar;
                int i2 = androidHttpClientProvider$invoke$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidHttpClientProvider$invoke$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidHttpClientProvider$invoke$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = androidHttpClientProvider$invoke$1.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ui50Var = this.mutex;
                        androidHttpClientProvider$invoke$1.L$0 = ui50Var;
                        androidHttpClientProvider$invoke$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ui50Var2 = (ui50) androidHttpClientProvider$invoke$1.L$0;
                            try {
                                kotlin.a.a(obj);
                                HttpClient httpClient2 = (HttpClient) obj;
                                this.cachedClient = httpClient2;
                                ui50Var2.c(null);
                                return httpClient2;
                            } catch (Throwable th2) {
                                th = th2;
                                ui50Var2.c(null);
                                throw th;
                            }
                        }
                        ui50 ui50Var3 = (ui50) androidHttpClientProvider$invoke$1.L$0;
                        kotlin.a.a(obj);
                        ui50Var = ui50Var3;
                    }
                    httpClient = this.cachedClient;
                    if (httpClient == null) {
                        ui50Var.c(null);
                        return httpClient;
                    }
                    androidHttpClientProvider$invoke$1.L$0 = ui50Var;
                    androidHttpClientProvider$invoke$1.label = 2;
                    Object createHttpClient = createHttpClient(androidHttpClientProvider$invoke$1);
                    if (createHttpClient != obj2) {
                        ui50Var2 = ui50Var;
                        obj = createHttpClient;
                        HttpClient httpClient22 = (HttpClient) obj;
                        this.cachedClient = httpClient22;
                        ui50Var2.c(null);
                        return httpClient22;
                    }
                    return obj2;
                }
            }
            httpClient = this.cachedClient;
            if (httpClient == null) {
            }
        } catch (Throwable th3) {
            ui50Var2 = ui50Var;
            th = th3;
            ui50Var2.c(null);
            throw th;
        }
        androidHttpClientProvider$invoke$1 = new AndroidHttpClientProvider$invoke$1(this, spjVar);
        Object obj3 = androidHttpClientProvider$invoke$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidHttpClientProvider$invoke$1.label;
        if (i != 0) {
        }
    }
}
