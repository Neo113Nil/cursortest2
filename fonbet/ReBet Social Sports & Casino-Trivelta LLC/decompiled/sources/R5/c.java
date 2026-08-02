package R5;

import I5.i;
import I5.p;
import Ph.AbstractC1459k;
import Ph.P;
import Q5.TraceParentInHeaderConfig;
import Q5.b;
import Q5.r;
import a5.C1919a;
import a5.C1920b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p5.C6046a;
import r5.C6208b;
import r5.InterfaceC6207a;
import rh.InterfaceC6290h;
import s5.C6339a;
import sh.C6367a;
import uh.InterfaceC6579c;
import wh.InterfaceC6756a;

/* loaded from: classes2.dex */
public abstract class c implements Interceptor {
    private final boolean autoAttached;

    @NotNull
    private final InterfaceC6207a clock = new C6208b();

    @NotNull
    private final P interceptorScope = C6339a.f64787a.a();

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f10079n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C1919a f10080o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f10081p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C1920b f10082q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6290h f10083r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1919a c1919a, long j10, C1920b c1920b, InterfaceC6290h interfaceC6290h, Continuation continuation) {
            super(2, continuation);
            this.f10080o = c1919a;
            this.f10081p = j10;
            this.f10082q = c1920b;
            this.f10083r = interfaceC6290h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f10080o, this.f10081p, this.f10082q, this.f10083r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f10079n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C1919a c1919a = this.f10080o;
                long j10 = this.f10081p;
                C1920b c1920b = this.f10082q;
                InterfaceC6290h interfaceC6290h = this.f10083r;
                this.f10079n = 1;
                if (c1919a.c(j10, c1920b, interfaceC6290h, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f10084n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C1919a f10085o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f10086p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C1920b f10087q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6290h f10088r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1919a c1919a, long j10, C1920b c1920b, InterfaceC6290h interfaceC6290h, Continuation continuation) {
            super(2, continuation);
            this.f10085o = c1919a;
            this.f10086p = j10;
            this.f10087q = c1920b;
            this.f10088r = interfaceC6290h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f10085o, this.f10086p, this.f10087q, this.f10088r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f10084n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C1919a c1919a = this.f10085o;
                long j10 = this.f10086p;
                C1920b c1920b = this.f10087q;
                InterfaceC6290h interfaceC6290h = this.f10088r;
                this.f10084n = 1;
                if (c1919a.c(j10, c1920b, interfaceC6290h, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public c(boolean z10) {
        this.autoAttached = z10;
    }

    public static final void c(Request.Builder builder, String str, String str2) {
        if (builder != null) {
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNull(str2);
            builder.addHeader(str, str2);
        }
    }

    public final Request.Builder b(InterfaceC6290h interfaceC6290h, Request.Builder builder, String str) {
        M5.a d10 = H5.b.f4801a.d();
        if (d10 != null && d10.k().c().s().getEnabled() && g(str)) {
            C6367a.a().b(InterfaceC6579c.current().i(interfaceC6290h), builder, new InterfaceC6756a() { // from class: R5.b
                @Override // wh.InterfaceC6756a
                public final void a(Object obj, String str2, String str3) {
                    c.c((Request.Builder) obj, str2, str3);
                }
            });
        }
        return builder;
    }

    public final Response d(Interceptor.Chain chain, Request request) {
        Map map;
        C1920b a10;
        Response proceed;
        String e10;
        Map map2;
        int code;
        String message;
        long nanoTime;
        ResponseBody body;
        C1920b a11;
        List d10;
        MediaType mediaType;
        List c10;
        MediaType mediaType2;
        E5.b bVar = E5.b.f3006a;
        bVar.f("request to url " + chain.request().url() + " intercepted");
        C1919a c1919a = (C1919a) S4.c.f10591a.g(i.k.f5429b);
        if (c1919a == null) {
            return chain.proceed(request);
        }
        bVar.f("dispatching network instrumentation event for url: " + request.url());
        if (f(request.url().getUrl())) {
            bVar.a("url ignored, proceeding normally with the request");
            return chain.proceed(request);
        }
        bVar.a("reporting network request to url " + request.url());
        long a12 = this.clock.a();
        InterfaceC6290h f10 = c1919a.f(new C6046a(b.f.f9377b, Long.valueOf(a12), null, null, this.autoAttached, 12, null));
        Request.Builder newBuilder = request.newBuilder();
        b(f10, newBuilder, request.url().getUrl());
        Request build = newBuilder.build();
        r e11 = e(build.url().getUrl());
        if (e11 != null) {
            bVar.a("Network capture rule matched for " + build.url());
        }
        RequestBody body2 = build.body();
        Map map3 = null;
        Pair a13 = (e11 == null || !e11.a()) ? TuplesKt.to(null, build) : P5.b.f8813a.a(build, (body2 == null || (mediaType2 = body2.get$mediaType()) == null) ? null : mediaType2.getMediaType());
        String str = (String) a13.component1();
        Request request2 = (Request) a13.component2();
        if (e11 == null || (c10 = e11.c()) == null) {
            map = null;
        } else {
            Map b10 = P5.b.f8813a.b(MapsKt.toMap(request2.headers()), c10);
            if (b10.isEmpty()) {
                b10 = null;
            }
            map = b10;
        }
        C1920b c1920b = new C1920b(null, null, request2.method(), 0, request2.url().getUrl(), request2.url().encodedPath(), request2.url().host(), request2.url().scheme(), null, 0L, 0L, null, map, null, str, null, 44811, null);
        long nanoTime2 = System.nanoTime();
        try {
            proceed = chain.proceed(request2);
            ResponseBody body3 = proceed.body();
            e10 = (e11 == null || !e11.b()) ? null : P5.b.f8813a.e(proceed, (body3 == null || (mediaType = body3.get$contentType()) == null) ? null : mediaType.getMediaType());
            if (e11 != null && (d10 = e11.d()) != null) {
                Map b11 = P5.b.f8813a.b(MapsKt.toMap(proceed.headers()), d10);
                if (!b11.isEmpty()) {
                    map3 = b11;
                }
            }
            map2 = map3;
            code = proceed.code();
            message = proceed.message();
            nanoTime = System.nanoTime() - nanoTime2;
            body = proceed.body();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            a11 = c1920b.a((r36 & 1) != 0 ? c1920b.f15069a : null, (r36 & 2) != 0 ? c1920b.f15070b : null, (r36 & 4) != 0 ? c1920b.f15071c : null, (r36 & 8) != 0 ? c1920b.f15072d : code, (r36 & 16) != 0 ? c1920b.f15073e : null, (r36 & 32) != 0 ? c1920b.f15074f : null, (r36 & 64) != 0 ? c1920b.f15075g : null, (r36 & 128) != 0 ? c1920b.f15076h : null, (r36 & 256) != 0 ? c1920b.f15077i : message, (r36 & 512) != 0 ? c1920b.f15078j : nanoTime, (r36 & 1024) != 0 ? c1920b.f15079k : body != null ? body.getContentLength() : 0L, (r36 & 2048) != 0 ? c1920b.f15080l : null, (r36 & 4096) != 0 ? c1920b.f15081m : null, (r36 & 8192) != 0 ? c1920b.f15082n : map2, (r36 & 16384) != 0 ? c1920b.f15083o : null, (r36 & 32768) != 0 ? c1920b.f15084p : e10);
            AbstractC1459k.d(this.interceptorScope, null, null, new a(c1919a, a12, a11, f10, null), 3, null);
            return proceed;
        } catch (Throwable th3) {
            th = th3;
            c1920b = c1920b;
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = "Unknown error";
            }
            a10 = r28.a((r36 & 1) != 0 ? r28.f15069a : null, (r36 & 2) != 0 ? r28.f15070b : null, (r36 & 4) != 0 ? r28.f15071c : null, (r36 & 8) != 0 ? r28.f15072d : 0, (r36 & 16) != 0 ? r28.f15073e : null, (r36 & 32) != 0 ? r28.f15074f : null, (r36 & 64) != 0 ? r28.f15075g : null, (r36 & 128) != 0 ? r28.f15076h : null, (r36 & 256) != 0 ? r28.f15077i : null, (r36 & 512) != 0 ? r28.f15078j : 0L, (r36 & 1024) != 0 ? r28.f15079k : 0L, (r36 & 2048) != 0 ? r28.f15080l : message2, (r36 & 4096) != 0 ? r28.f15081m : null, (r36 & 8192) != 0 ? r28.f15082n : null, (r36 & 16384) != 0 ? r28.f15083o : null, (r36 & 32768) != 0 ? c1920b.f15084p : null);
            AbstractC1459k.d(this.interceptorScope, null, null, new b(c1919a, a12, a10, f10, null), 3, null);
            throw th;
        }
    }

    public final r e(String str) {
        p k10;
        Q5.c c10;
        List o10;
        M5.a d10 = H5.b.f4801a.d();
        if (d10 == null || (k10 = d10.k()) == null || (c10 = k10.c()) == null || (o10 = c10.o()) == null) {
            return null;
        }
        return P5.b.f8813a.d(str, o10);
    }

    public final boolean f(String str) {
        List emptyList;
        Object m147constructorimpl;
        p k10;
        Q5.c c10;
        M5.a d10 = H5.b.f4801a.d();
        if (d10 == null || (k10 = d10.k()) == null || (c10 = k10.c()) == null || (emptyList = c10.k()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List<String> list = emptyList;
        boolean z10 = list instanceof Collection;
        if (!z10 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((String) it.next(), str)) {
                    return true;
                }
            }
        }
        if (z10 && list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(new Regex(str2, RegexOption.IGNORE_CASE));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            Regex regex = (Regex) m147constructorimpl;
            if (regex != null && regex.matches(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(String str) {
        p k10;
        Q5.c c10;
        TraceParentInHeaderConfig s10;
        Object m147constructorimpl;
        M5.a d10 = H5.b.f4801a.d();
        if (d10 == null || (k10 = d10.k()) == null || (c10 = k10.c()) == null || (s10 = c10.s()) == null) {
            return false;
        }
        List allowedTracingUrls = s10.getOptions().getAllowedTracingUrls();
        if (allowedTracingUrls.isEmpty()) {
            return true;
        }
        List<String> list = allowedTracingUrls;
        boolean z10 = list instanceof Collection;
        if (!z10 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((String) it.next(), str)) {
                    return true;
                }
            }
        }
        if (z10 && list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(new Regex(str2, RegexOption.IGNORE_CASE));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            Regex regex = (Regex) m147constructorimpl;
            if (regex != null && regex.matches(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        return Intrinsics.areEqual(request.header("X-Coralogix-Internal"), "1") ? chain.proceed(request) : Intrinsics.areEqual(request.header("X-Coralogix-Attached"), "1") ? chain.proceed(request) : d(chain, request.newBuilder().header("X-Coralogix-Attached", "1").build());
    }
}
