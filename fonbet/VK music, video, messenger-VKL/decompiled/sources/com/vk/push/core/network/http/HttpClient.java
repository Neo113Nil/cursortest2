package com.vk.push.core.network.http;

import android.content.Context;
import com.ironsource.adapters.fyber.FyberConstants;
import com.vk.push.common.EmptyLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.BuildConfig;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.http.HttpOpenConnectionDelegate;
import com.vk.push.core.network.http.ssl.SSLConfigurator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import xsna.a0a;
import xsna.b6l;
import xsna.bpn0;
import xsna.f4k;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.spj;
import xsna.zcl;

/* compiled from: HttpClient.kt */
/* loaded from: classes.dex */
public final class HttpClient {

    @Deprecated
    public static final int DEFAULT_TIMEOUT_IN_MILLIS = 60000;
    public final int a;
    public final int b;
    public final BaseHttpHeadersHolder c;
    public final List<URLConnectionInterceptor> d;
    public final HttpOpenConnectionDelegate e;
    public final Context f;
    public final boolean g;
    public final boolean h;
    public final CrashReporterRepository i;
    public final Logger j;
    public final bpn0 k;
    public final bpn0 l;

    /* compiled from: HttpClient.kt */
    @b6l(c = "com.vk.push.core.network.http.HttpClient", f = "HttpClient.kt", l = {46}, m = "executeRequest-0E7RQCE")
    /* loaded from: classes5.dex */
    public static final class a<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object m108executeRequest0E7RQCE = HttpClient.this.m108executeRequest0E7RQCE(null, null, this);
            return m108executeRequest0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED ? m108executeRequest0E7RQCE : new Result(m108executeRequest0E7RQCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: HttpClient.kt */
    /* loaded from: classes5.dex */
    public static final class b<T> extends Lambda implements gzs<Result<? extends T>> {
        final /* synthetic */ HttpRequest $request;
        final /* synthetic */ izs<Result<HttpResponse>, Result<T>> $responseParser;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(HttpRequest httpRequest, izs<? super Result<HttpResponse>, ? extends Result<? extends T>> izsVar) {
            super(0);
            this.$request = httpRequest;
            this.$responseParser = izsVar;
        }

        @Override // xsna.gzs
        public final Object invoke() {
            Object failure;
            try {
                failure = HttpClient.this.executeRequestUnsafe(this.$request);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            return new Result(this.$responseParser.invoke(new Result<>(failure)).d());
        }
    }

    /* compiled from: HttpClient.kt */
    @b6l(c = "com.vk.push.core.network.http.HttpClient", f = "HttpClient.kt", l = {60}, m = "executeRequest-gIAlu-s")
    /* loaded from: classes5.dex */
    public static final class c extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public c(spj<? super c> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object m109executeRequestgIAlus = HttpClient.this.m109executeRequestgIAlus(null, this);
            return m109executeRequestgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m109executeRequestgIAlus : new Result(m109executeRequestgIAlus);
        }
    }

    /* compiled from: HttpClient.kt */
    /* loaded from: classes5.dex */
    public static final class d extends Lambda implements izs<Result<? extends HttpResponse>, Result<? extends HttpResponse>> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Result<? extends HttpResponse> invoke(Result<? extends HttpResponse> result) {
            return new Result<>(result.d());
        }
    }

    /* compiled from: HttpClient.kt */
    public static final class e extends Lambda implements gzs<NetworkRequestRetryComponent> {
        final /* synthetic */ Logger $logger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Logger logger) {
            super(0);
            this.$logger = logger;
        }

        @Override // xsna.gzs
        public final NetworkRequestRetryComponent invoke() {
            return new NetworkRequestRetryComponent(this.$logger, null, 2, null);
        }
    }

    /* compiled from: HttpClient.kt */
    @b6l(c = "com.vk.push.core.network.http.HttpClient", f = "HttpClient.kt", l = {64}, m = "retryOnFailureIfNeeded-gIAlu-s")
    /* loaded from: classes5.dex */
    public static final class f<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public f(spj<? super f> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object c = HttpClient.this.c(null, this);
            return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: HttpClient.kt */
    @b6l(c = "com.vk.push.core.network.http.HttpClient$retryOnFailureIfNeeded$2", f = "HttpClient.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class g<T> extends SuspendLambda implements izs<spj<? super Result<? extends T>>, Object> {
        final /* synthetic */ gzs<Result<T>> $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(gzs<? extends Result<? extends T>> gzsVar, spj<? super g> spjVar) {
            super(1, spjVar);
            this.$request = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new g(this.$request, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return ((g) create((spj) obj)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return this.$request.invoke();
        }
    }

    /* compiled from: HttpClient.kt */
    public static final class h extends Lambda implements gzs<SSLConfigurator> {
        final /* synthetic */ Logger $logger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Logger logger) {
            super(0);
            this.$logger = logger;
        }

        @Override // xsna.gzs
        public final SSLConfigurator invoke() {
            return new SSLConfigurator(HttpClient.this.f, HttpClient.this.i, this.$logger);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpClient(int i, int i2, BaseHttpHeadersHolder baseHttpHeadersHolder, List<? extends URLConnectionInterceptor> list, HttpOpenConnectionDelegate httpOpenConnectionDelegate, Context context, boolean z, boolean z2, CrashReporterRepository crashReporterRepository, Logger logger) {
        this.a = i;
        this.b = i2;
        this.c = baseHttpHeadersHolder;
        this.d = list;
        this.e = httpOpenConnectionDelegate;
        this.f = context;
        this.g = z;
        this.h = z2;
        this.i = crashReporterRepository;
        this.j = logger.createLogger("HttpLogging");
        this.k = new bpn0(new e(logger));
        this.l = new bpn0(new h(logger));
    }

    public final void a(HttpURLConnection httpURLConnection, HttpRequest httpRequest) {
        httpURLConnection.setConnectTimeout(this.a);
        httpURLConnection.setReadTimeout(this.b);
        httpURLConnection.setRequestMethod(httpRequest.getMethod().toUpperCase(Locale.ROOT));
        for (Map.Entry<String, String> entry : this.c.get().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((URLConnectionInterceptor) it.next()).intercept(httpURLConnection, httpRequest);
            } catch (Exception e2) {
                this.j.error("Interceptor execution failed", e2);
            }
        }
    }

    public final HttpResponse b(HttpURLConnection httpURLConnection) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream(), StandardCharsets.UTF_8));
            try {
                String b2 = a0a.b(bufferedReader);
                bufferedReader.close();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                if (responseMessage == null) {
                    responseMessage = FyberConstants.Logs.UNKNOWN_ERROR;
                }
                return new HttpResponse(b2, responseCode, responseMessage);
            } finally {
            }
        } catch (Exception e2) {
            this.j.error("Failed to read response body", e2);
            throw new VkpnsRequestException(httpURLConnection.getResponseMessage(), httpURLConnection.getResponseCode());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object c(gzs<? extends Result<? extends T>> gzsVar, spj<? super Result<? extends T>> spjVar) {
        f fVar;
        int i;
        if (spjVar instanceof f) {
            fVar = (f) spjVar;
            int i2 = fVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.label = i2 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                if (!this.h) {
                    return gzsVar.invoke().d();
                }
                NetworkRequestRetryComponent networkRequestRetryComponent = (NetworkRequestRetryComponent) this.k.getValue();
                g gVar = new g(gzsVar, null);
                fVar.label = 1;
                Object m110invokegIAlus = networkRequestRetryComponent.m110invokegIAlus(gVar, fVar);
                return m110invokegIAlus == coroutineSingletons ? coroutineSingletons : m110invokegIAlus;
            }
        }
        fVar = new f(spjVar);
        Object obj2 = fVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fVar.label;
        if (i == 0) {
        }
    }

    public final void d(HttpURLConnection httpURLConnection, HttpRequest httpRequest) {
        String body = httpRequest.getBody();
        if (body == null) {
            return;
        }
        try {
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(body.getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
                s3q0 s3q0Var = s3q0.a;
                outputStream.close();
            } finally {
            }
        } catch (Exception e2) {
            this.j.error("Failed to send request body", e2);
            throw new IllegalStateException("Failed to send request body", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: executeRequest-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object m108executeRequest0E7RQCE(HttpRequest httpRequest, izs<? super Result<HttpResponse>, ? extends Result<? extends T>> izsVar, spj<? super Result<? extends T>> spjVar) {
        a aVar;
        int i;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                b bVar = new b(httpRequest, izsVar);
                aVar.label = 1;
                Object c2 = c(bVar, aVar);
                return c2 == obj2 ? obj2 : c2;
            }
        }
        aVar = new a(spjVar);
        Object obj3 = aVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: executeRequest-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m109executeRequestgIAlus(HttpRequest httpRequest, spj<? super Result<HttpResponse>> spjVar) {
        c cVar;
        int i;
        if (spjVar instanceof c) {
            cVar = (c) spjVar;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                cVar.label = 1;
                Object m108executeRequest0E7RQCE = m108executeRequest0E7RQCE(httpRequest, d.i, cVar);
                return m108executeRequest0E7RQCE == coroutineSingletons ? coroutineSingletons : m108executeRequest0E7RQCE;
            }
        }
        cVar = new c(spjVar);
        Object obj2 = cVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.label;
        if (i == 0) {
        }
    }

    public final HttpResponse executeRequestUnsafe(HttpRequest httpRequest) {
        try {
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection invoke = this.e.invoke(new URL(httpRequest.getUrl()));
                if (invoke == null) {
                    throw new IllegalStateException("Only HTTPS protocol is supported");
                }
                try {
                    if (this.g) {
                        ((SSLConfigurator) this.l.getValue()).configureSSL$core_release(invoke);
                    }
                    a(invoke, httpRequest);
                    d(invoke, httpRequest);
                    HttpResponse b2 = b(invoke);
                    invoke.disconnect();
                    return b2;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = invoke;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid URL: " + httpRequest.getUrl(), e2);
        }
    }

    public HttpClient(int i, int i2, BaseHttpHeadersHolder baseHttpHeadersHolder, List list, HttpOpenConnectionDelegate httpOpenConnectionDelegate, Context context, boolean z, boolean z2, CrashReporterRepository crashReporterRepository, Logger logger, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? 60000 : i, (i3 & 2) != 0 ? 60000 : i2, (i3 & 4) != 0 ? new BaseHttpHeadersHolder("7.4.0-rc01", BuildConfig.LIBRARY_PACKAGE_NAME, null, 4, null) : baseHttpHeadersHolder, (i3 & 8) != 0 ? EmptyList.b : list, (i3 & 16) != 0 ? new HttpOpenConnectionDelegate.Https() : httpOpenConnectionDelegate, context, (i3 & 64) != 0 ? true : z, (i3 & 128) != 0 ? true : z2, (i3 & 256) != 0 ? new f4k() : crashReporterRepository, (i3 & 512) != 0 ? new EmptyLogger() : logger);
    }
}
