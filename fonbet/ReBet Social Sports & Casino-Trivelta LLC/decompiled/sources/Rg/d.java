package Rg;

import Ph.A;
import Ph.AbstractC1455i;
import Ph.C0;
import Ph.C1452g0;
import Ph.C1483w0;
import Ph.InterfaceC1484x;
import Ph.L;
import Ph.P;
import Ph.S;
import Qg.m;
import Tg.u;
import ah.v;
import ch.o;
import eh.AbstractC4206a;
import eh.C4207b;
import java.io.Closeable;
import java.net.Proxy;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.WebSocket;

/* loaded from: classes3.dex */
public final class d extends Qg.c {

    /* renamed from: j, reason: collision with root package name */
    public static final c f10237j = new c(null);

    /* renamed from: k, reason: collision with root package name */
    public static final Lazy f10238k = LazyKt.lazy(b.f10247d);

    /* renamed from: d, reason: collision with root package name */
    public final Rg.c f10239d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f10240e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f10241f;

    /* renamed from: g, reason: collision with root package name */
    public final CoroutineContext f10242g;

    /* renamed from: h, reason: collision with root package name */
    public final CoroutineContext f10243h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f10244i;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f10245n;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f10245n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext.Element element = d.this.f10242g.get(C0.f9001U2);
                    Intrinsics.checkNotNull(element);
                    this.f10245n = 1;
                    if (((C0) element).join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    OkHttpClient okHttpClient = (OkHttpClient) ((Map.Entry) it.next()).getValue();
                    okHttpClient.connectionPool().evictAll();
                    okHttpClient.dispatcher().executorService().shutdown();
                }
                CoroutineContext.Element R12 = d.this.R1();
                Intrinsics.checkNotNull(R12, "null cannot be cast to non-null type java.io.Closeable");
                ((Closeable) R12).close();
                return Unit.INSTANCE;
            } finally {
                it = d.this.f10244i.entrySet().iterator();
                while (it.hasNext()) {
                    OkHttpClient okHttpClient2 = (OkHttpClient) ((Map.Entry) it.next()).getValue();
                    okHttpClient2.connectionPool().evictAll();
                    okHttpClient2.dispatcher().executorService().shutdown();
                }
                CoroutineContext.Element R13 = d.this.R1();
                Intrinsics.checkNotNull(R13, "null cannot be cast to non-null type java.io.Closeable");
                ((Closeable) R13).close();
            }
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f10247d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            return new OkHttpClient.Builder().build();
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OkHttpClient a() {
            return (OkHttpClient) d.f10238k.getValue();
        }

        public c() {
        }
    }

    /* renamed from: Rg.d$d, reason: collision with other inner class name */
    public /* synthetic */ class C0200d extends FunctionReferenceImpl implements Function1 {
        public C0200d(Object obj) {
            super(1, obj, d.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke(u.a aVar) {
            return ((d) this.receiver).m1(aVar);
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f10248d = new e();

        public e() {
            super(1);
        }

        public final void a(OkHttpClient it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OkHttpClient) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L invoke() {
            return Yg.c.a(C1452g0.f9088a, d.this.N().b(), "ktor-okhttp-dispatcher");
        }
    }

    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f10250n;

        /* renamed from: o, reason: collision with root package name */
        public Object f10251o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f10252p;

        /* renamed from: r, reason: collision with root package name */
        public int f10254r;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10252p = obj;
            this.f10254r |= Integer.MIN_VALUE;
            return d.this.Q1(null, this);
        }
    }

    public static final class h extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f10255n;

        /* renamed from: o, reason: collision with root package name */
        public Object f10256o;

        /* renamed from: p, reason: collision with root package name */
        public Object f10257p;

        /* renamed from: q, reason: collision with root package name */
        public Object f10258q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f10259r;

        /* renamed from: t, reason: collision with root package name */
        public int f10261t;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10259r = obj;
            this.f10261t |= Integer.MIN_VALUE;
            return d.this.n1(null, null, null, null, this);
        }
    }

    public static final class i extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ResponseBody f10262d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ResponseBody responseBody) {
            super(1);
            this.f10262d = responseBody;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            ResponseBody responseBody = this.f10262d;
            if (responseBody != null) {
                responseBody.close();
            }
        }
    }

    public static final class j extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f10263n;

        /* renamed from: o, reason: collision with root package name */
        public Object f10264o;

        /* renamed from: p, reason: collision with root package name */
        public Object f10265p;

        /* renamed from: q, reason: collision with root package name */
        public Object f10266q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f10267r;

        /* renamed from: t, reason: collision with root package name */
        public int f10269t;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10267r = obj;
            this.f10269t |= Integer.MIN_VALUE;
            return d.this.y1(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Rg.c config) {
        super("ktor-okhttp");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f10239d = config;
        this.f10240e = LazyKt.lazy(new f());
        this.f10241f = SetsKt.setOf((Object[]) new Qg.e[]{u.f11967d, Vg.a.f12893a});
        this.f10244i = ch.h.a(new C0200d(this), e.f10248d, N().c());
        CoroutineContext.Element element = super.getCoroutineContext().get(C0.f9001U2);
        Intrinsics.checkNotNull(element);
        CoroutineContext a10 = o.a((C0) element);
        this.f10242g = a10;
        this.f10243h = super.getCoroutineContext().plus(a10);
        AbstractC1455i.c(C1483w0.f9135a, super.getCoroutineContext(), S.f9049c, new a(null));
    }

    public final Wg.g D0(Response response, C4207b c4207b, Object obj, CoroutineContext coroutineContext) {
        return new Wg.g(new v(response.code(), response.message()), c4207b, Rg.h.c(response.headers()), Rg.h.d(response.protocol()), obj, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // Qg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Q1(Wg.d dVar, Continuation continuation) {
        g gVar;
        int i10;
        d dVar2;
        Request f10;
        OkHttpClient okHttpClient;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f10254r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f10254r = i11 - Integer.MIN_VALUE;
                g gVar2 = gVar;
                Object obj = gVar2.f10252p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar2.f10254r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    gVar2.f10250n = this;
                    gVar2.f10251o = dVar;
                    gVar2.f10254r = 1;
                    obj = m.b(gVar2);
                    if (obj != coroutine_suspended) {
                        dVar2 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                dVar = (Wg.d) gVar2.f10251o;
                dVar2 = (d) gVar2.f10250n;
                ResultKt.throwOnFailure(obj);
                Wg.d dVar3 = dVar;
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                f10 = Rg.e.f(dVar3, coroutineContext);
                okHttpClient = (OkHttpClient) dVar2.f10244i.get(dVar3.c(u.f11967d));
                if (okHttpClient != null) {
                    throw new IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
                }
                if (Wg.e.b(dVar3)) {
                    gVar2.f10250n = null;
                    gVar2.f10251o = null;
                    gVar2.f10254r = 2;
                    Object y12 = dVar2.y1(okHttpClient, f10, coroutineContext, gVar2);
                    if (y12 != coroutine_suspended) {
                        return y12;
                    }
                } else {
                    gVar2.f10250n = null;
                    gVar2.f10251o = null;
                    gVar2.f10254r = 3;
                    Object n12 = dVar2.n1(okHttpClient, f10, coroutineContext, dVar3, gVar2);
                    if (n12 != coroutine_suspended) {
                        return n12;
                    }
                }
                return coroutine_suspended;
            }
        }
        gVar = new g(continuation);
        g gVar22 = gVar;
        Object obj2 = gVar22.f10252p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar22.f10254r;
        if (i10 != 0) {
        }
        Wg.d dVar32 = dVar;
        CoroutineContext coroutineContext2 = (CoroutineContext) obj2;
        f10 = Rg.e.f(dVar32, coroutineContext2);
        okHttpClient = (OkHttpClient) dVar2.f10244i.get(dVar32.c(u.f11967d));
        if (okHttpClient != null) {
        }
    }

    @Override // Qg.b
    public L R1() {
        return (L) this.f10240e.getValue();
    }

    @Override // Qg.b
    /* renamed from: T1, reason: merged with bridge method [inline-methods] */
    public Rg.c N() {
        return this.f10239d;
    }

    @Override // Qg.c, Qg.b
    public Set Z0() {
        return this.f10241f;
    }

    @Override // Qg.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        CoroutineContext.Element element = this.f10242g.get(C0.f9001U2);
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((A) element).y1();
    }

    @Override // Qg.c, Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f10243h;
    }

    public final OkHttpClient m1(u.a aVar) {
        OkHttpClient e10 = N().e();
        if (e10 == null) {
            e10 = f10237j.a();
        }
        OkHttpClient.Builder newBuilder = e10.newBuilder();
        newBuilder.dispatcher(new Dispatcher());
        N().d().invoke(newBuilder);
        Proxy a10 = N().a();
        if (a10 != null) {
            newBuilder.proxy(a10);
        }
        if (aVar != null) {
            Rg.e.h(newBuilder, aVar);
        }
        return newBuilder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        r8 = Rg.e.i(r0, r7, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n1(OkHttpClient okHttpClient, Request request, CoroutineContext coroutineContext, Wg.d dVar, Continuation continuation) {
        h hVar;
        int i10;
        C4207b c4207b;
        d dVar2;
        ResponseBody body;
        io.ktor.utils.io.f a10;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f10261t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f10261t = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f10259r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = hVar.f10261t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4207b b10 = AbstractC4206a.b(null, 1, null);
                    hVar.f10255n = this;
                    hVar.f10256o = coroutineContext;
                    hVar.f10257p = dVar;
                    hVar.f10258q = b10;
                    hVar.f10261t = 1;
                    Object b11 = Rg.h.b(okHttpClient, request, dVar, hVar);
                    if (b11 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = b11;
                    c4207b = b10;
                    dVar2 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4207b = (C4207b) hVar.f10258q;
                    dVar = (Wg.d) hVar.f10257p;
                    coroutineContext = (CoroutineContext) hVar.f10256o;
                    dVar2 = (d) hVar.f10255n;
                    ResultKt.throwOnFailure(obj);
                }
                Response response = (Response) obj;
                body = response.body();
                CoroutineContext.Element element = coroutineContext.get(C0.f9001U2);
                Intrinsics.checkNotNull(element);
                ((C0) element).invokeOnCompletion(new i(body));
                if (body != null || (r0 = body.getSource()) == null || a10 == null) {
                    a10 = io.ktor.utils.io.f.f49437a.a();
                }
                return dVar2.D0(response, c4207b, a10, coroutineContext);
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f10259r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = hVar.f10261t;
        if (i10 != 0) {
        }
        Response response2 = (Response) obj2;
        body = response2.body();
        CoroutineContext.Element element2 = coroutineContext.get(C0.f9001U2);
        Intrinsics.checkNotNull(element2);
        ((C0) element2).invokeOnCompletion(new i(body));
        if (body != null) {
        }
        a10 = io.ktor.utils.io.f.f49437a.a();
        return dVar2.D0(response2, c4207b, a10, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y1(OkHttpClient okHttpClient, Request request, CoroutineContext coroutineContext, Continuation continuation) {
        j jVar;
        int i10;
        d dVar;
        C4207b c4207b;
        Rg.f fVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f10269t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f10269t = i11 - Integer.MIN_VALUE;
                Object obj = jVar.f10267r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = jVar.f10269t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4207b b10 = AbstractC4206a.b(null, 1, null);
                    WebSocket.Factory f10 = N().f();
                    if (f10 == null) {
                        f10 = okHttpClient;
                    }
                    Rg.f fVar2 = new Rg.f(okHttpClient, f10, request, coroutineContext);
                    fVar2.f();
                    InterfaceC1484x c10 = fVar2.c();
                    jVar.f10263n = this;
                    jVar.f10264o = coroutineContext;
                    jVar.f10265p = b10;
                    jVar.f10266q = fVar2;
                    jVar.f10269t = 1;
                    Object await = c10.await(jVar);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dVar = this;
                    c4207b = b10;
                    obj = await;
                    fVar = fVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (Rg.f) jVar.f10266q;
                    c4207b = (C4207b) jVar.f10265p;
                    coroutineContext = (CoroutineContext) jVar.f10264o;
                    dVar = (d) jVar.f10263n;
                    ResultKt.throwOnFailure(obj);
                }
                return dVar.D0((Response) obj, c4207b, fVar, coroutineContext);
            }
        }
        jVar = new j(continuation);
        Object obj2 = jVar.f10267r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = jVar.f10269t;
        if (i10 != 0) {
        }
        return dVar.D0((Response) obj2, c4207b, fVar, coroutineContext);
    }
}
