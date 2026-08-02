package Ng;

import Ph.A;
import Ph.C0;
import Ph.F0;
import Ph.P;
import Ph.Q;
import Qg.g;
import Tg.C1694a;
import Tg.i;
import Tg.l;
import Tg.m;
import Tg.o;
import Tg.q;
import Tg.t;
import Wg.f;
import Wg.h;
import ch.AbstractC2927d;
import ch.C2924a;
import ch.InterfaceC2925b;
import gh.AbstractC4384e;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements P, Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8048n = AtomicIntegerFieldUpdater.newUpdater(a.class, "closed");

    /* renamed from: a, reason: collision with root package name */
    public final Qg.b f8049a;

    /* renamed from: b, reason: collision with root package name */
    public final Ng.b f8050b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8051c;

    @NotNull
    private volatile /* synthetic */ int closed;

    /* renamed from: d, reason: collision with root package name */
    public final A f8052d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f8053e;

    /* renamed from: f, reason: collision with root package name */
    public final f f8054f;

    /* renamed from: g, reason: collision with root package name */
    public final Xg.f f8055g;

    /* renamed from: h, reason: collision with root package name */
    public final h f8056h;

    /* renamed from: i, reason: collision with root package name */
    public final Xg.b f8057i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2925b f8058j;

    /* renamed from: k, reason: collision with root package name */
    public final g f8059k;

    /* renamed from: l, reason: collision with root package name */
    public final Zg.b f8060l;

    /* renamed from: m, reason: collision with root package name */
    public final Ng.b f8061m;

    /* renamed from: Ng.a$a, reason: collision with other inner class name */
    public static final class C0164a extends Lambda implements Function1 {
        public C0164a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            if (th2 != null) {
                Q.f(a.this.J(), null, 1, null);
            }
        }
    }

    public static final class b extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f8063n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f8064o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f8065p;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4384e abstractC4384e, Object obj, Continuation continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f8064o = abstractC4384e;
            bVar.f8065p = obj;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
        
            if (r3.e(r1, r8) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            AbstractC4384e abstractC4384e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f8063n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC4384e abstractC4384e2 = (AbstractC4384e) this.f8064o;
                obj2 = this.f8065p;
                if (!(obj2 instanceof Og.b)) {
                    throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + Reflection.getOrCreateKotlinClass(obj2.getClass()) + ").").toString());
                }
                Xg.b w02 = a.this.w0();
                Unit unit = Unit.INSTANCE;
                Xg.c f10 = ((Og.b) obj2).f();
                this.f8064o = abstractC4384e2;
                this.f8065p = obj2;
                this.f8063n = 1;
                Object d10 = w02.d(unit, f10, this);
                if (d10 != coroutine_suspended) {
                    abstractC4384e = abstractC4384e2;
                    obj = d10;
                }
                return coroutine_suspended;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            obj2 = this.f8065p;
            abstractC4384e = (AbstractC4384e) this.f8064o;
            ResultKt.throwOnFailure(obj);
            ((Og.b) obj2).k((Xg.c) obj);
            this.f8064o = null;
            this.f8065p = null;
            this.f8063n = 2;
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f8067d = new c();

        public c() {
            super(1);
        }

        public final void a(a install) {
            Intrinsics.checkNotNullParameter(install, "$this$install");
            Tg.g.b(install);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f8068n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f8069o;

        public d(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4384e abstractC4384e, Xg.d dVar, Continuation continuation) {
            d dVar2 = a.this.new d(continuation);
            dVar2.f8069o = abstractC4384e;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC4384e abstractC4384e;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f8068n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC4384e abstractC4384e2 = (AbstractC4384e) this.f8069o;
                try {
                    this.f8069o = abstractC4384e2;
                    this.f8068n = 1;
                    if (abstractC4384e2.c(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th3) {
                    abstractC4384e = abstractC4384e2;
                    th2 = th3;
                    a.this.U().a(Yg.b.d(), new Yg.g(((Og.b) abstractC4384e.b()).f(), th2));
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC4384e = (AbstractC4384e) this.f8069o;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    a.this.U().a(Yg.b.d(), new Yg.g(((Og.b) abstractC4384e.b()).f(), th2));
                    throw th2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f8071n;

        /* renamed from: p, reason: collision with root package name */
        public int f8073p;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8071n = obj;
            this.f8073p |= Integer.MIN_VALUE;
            return a.this.k(null, this);
        }
    }

    public a(Qg.b engine, Ng.b userConfig) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.f8049a = engine;
        this.f8050b = userConfig;
        this.closed = 0;
        A a10 = F0.a((C0) engine.getCoroutineContext().get(C0.f9001U2));
        this.f8052d = a10;
        this.f8053e = engine.getCoroutineContext().plus(a10);
        this.f8054f = new f(userConfig.b());
        Xg.f fVar = new Xg.f(userConfig.b());
        this.f8055g = fVar;
        h hVar = new h(userConfig.b());
        this.f8056h = hVar;
        this.f8057i = new Xg.b(userConfig.b());
        this.f8058j = AbstractC2927d.a(true);
        this.f8059k = engine.N();
        this.f8060l = new Zg.b();
        Ng.b bVar = new Ng.b();
        this.f8061m = bVar;
        if (this.f8051c) {
            a10.invokeOnCompletion(new C0164a());
        }
        engine.k0(this);
        hVar.l(h.f13274g.b(), new b(null));
        Ng.b.j(bVar, q.f11939a, null, 2, null);
        Ng.b.j(bVar, C1694a.f11797a, null, 2, null);
        if (userConfig.f()) {
            bVar.i("DefaultTransformers", c.f8067d);
        }
        Ng.b.j(bVar, t.f11947c, null, 2, null);
        Ng.b.j(bVar, i.f11854d, null, 2, null);
        if (userConfig.e()) {
            Ng.b.j(bVar, o.f11912c, null, 2, null);
        }
        bVar.k(userConfig);
        if (userConfig.f()) {
            Ng.b.j(bVar, m.f11894d, null, 2, null);
        }
        Tg.f.c(bVar);
        bVar.g(this);
        fVar.l(Xg.f.f13844g.b(), new d(null));
    }

    public final Xg.f A0() {
        return this.f8055g;
    }

    public final Ng.b B() {
        return this.f8061m;
    }

    public final h D0() {
        return this.f8056h;
    }

    public final Qg.b J() {
        return this.f8049a;
    }

    public final Zg.b U() {
        return this.f8060l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f8048n.compareAndSet(this, 0, 1)) {
            InterfaceC2925b interfaceC2925b = (InterfaceC2925b) this.f8058j.g(l.a());
            for (C2924a c2924a : interfaceC2925b.a()) {
                Intrinsics.checkNotNull(c2924a, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object g10 = interfaceC2925b.g(c2924a);
                if (g10 instanceof Closeable) {
                    ((Closeable) g10).close();
                }
            }
            this.f8052d.y1();
            if (this.f8051c) {
                this.f8049a.close();
            }
        }
    }

    public final InterfaceC2925b getAttributes() {
        return this.f8058j;
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f8053e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Wg.c cVar, Continuation continuation) {
        e eVar;
        int i10;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f8073p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f8073p = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f8071n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar.f8073p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f8060l.a(Yg.b.a(), cVar);
                    f fVar = this.f8054f;
                    Object d10 = cVar.d();
                    eVar.f8073p = 1;
                    obj = fVar.d(cVar, d10, eVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
                return (Og.b) obj;
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f8071n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar.f8073p;
        if (i10 != 0) {
        }
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (Og.b) obj2;
    }

    public String toString() {
        return "HttpClient[" + this.f8049a + ']';
    }

    public final Xg.b w0() {
        return this.f8057i;
    }

    public final f z0() {
        return this.f8054f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Qg.b engine, Ng.b userConfig, boolean z10) {
        this(engine, userConfig);
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.f8051c = z10;
    }
}
