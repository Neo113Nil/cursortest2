package M5;

import D5.a;
import D5.f;
import I5.i;
import I5.p;
import M5.a;
import Ph.AbstractC1459k;
import Ph.P;
import Ph.Q;
import Q5.UserContext;
import Q5.ViewContext;
import b5.d;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import q5.C6118a;
import r5.C6208b;
import r5.InterfaceC6207a;
import s5.C6339a;

/* loaded from: classes2.dex */
public final class c implements M5.a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f7497h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6207a f7498a;

    /* renamed from: b, reason: collision with root package name */
    public p f7499b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f7500c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7501d;

    /* renamed from: e, reason: collision with root package name */
    public long f7502e;

    /* renamed from: f, reason: collision with root package name */
    public P f7503f;

    /* renamed from: g, reason: collision with root package name */
    public final d f7504g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            return uuid;
        }

        public a() {
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f7505n;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f7507a;

            public a(c cVar) {
                this.f7507a = cVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C5.b bVar, Continuation continuation) {
                this.f7507a.r();
                return Unit.INSTANCE;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f7505n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f s10 = C5.d.f1144a.s();
                a aVar = new a(c.this);
                this.f7505n = 1;
                if (s10.collect(aVar, this) == coroutine_suspended) {
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

    public c(Q5.c options, InterfaceC6207a clock, p currentConfigurations) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(currentConfigurations, "currentConfigurations");
        this.f7498a = clock;
        this.f7499b = currentConfigurations;
        this.f7500c = new AtomicBoolean(false);
        this.f7501d = new Object();
        this.f7502e = a().a();
        this.f7504g = new d() { // from class: M5.b
            @Override // b5.d
            public final void a(Object obj) {
                c.o(c.this, (f) obj);
            }
        };
    }

    public static final void o(c cVar, f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.d) {
            E5.b.f3006a.a("activity resumed, updating late user activity detected");
            cVar.r();
        }
    }

    @Override // M5.a
    public InterfaceC6207a a() {
        return this.f7498a;
    }

    @Override // M5.a
    public void b(long j10) {
        this.f7502e = j10;
    }

    @Override // N5.a
    public void c(String appName, String appVersion) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        E5.b.f3006a.a("setting application context: appName - " + appName + ", appVersion - " + appVersion);
        q(p.b(k(), null, null, 0L, Q5.c.b(k().c(), appName, null, null, appVersion, null, null, null, null, null, null, null, null, false, 0, null, false, null, null, null, null, null, 2097142, null), 7, null));
    }

    @Override // N5.a
    public void d(UserContext userContext) {
        Intrinsics.checkNotNullParameter(userContext, "userContext");
        E5.b.f3006a.a("setting user context: " + userContext);
        q(p.b(k(), null, null, 0L, Q5.c.b(k().c(), null, null, null, null, null, null, userContext, null, null, null, null, null, false, 0, null, false, null, null, null, null, null, 2097087, null), 7, null));
    }

    @Override // M5.a
    public long e() {
        return this.f7502e;
    }

    @Override // N5.a
    public String f() {
        E5.b.f3006a.a("getting session id");
        return k().e();
    }

    @Override // N5.a
    public UserContext g() {
        E5.b.f3006a.a("getting user context");
        return k().c().t();
    }

    @Override // N5.a
    public void h(Map labels) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        E5.b.f3006a.a("setting labels: " + labels);
        q(p.b(k(), null, null, 0L, Q5.c.b(k().c(), null, null, null, null, labels, null, null, null, null, null, null, null, false, 0, null, false, null, null, null, null, null, 2097135, null), 7, null));
    }

    @Override // M5.a
    public boolean i() {
        return a.C0150a.b(this);
    }

    @Override // M5.a
    public boolean isIdle() {
        return a.C0150a.a(this);
    }

    @Override // N5.a
    public void j(ViewContext viewContext) {
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        if (Intrinsics.areEqual(k().c().w(), viewContext)) {
            E5.b.f3006a.a("view context is already set to " + viewContext);
            return;
        }
        E5.b.f3006a.a("setting view context: " + viewContext);
        O5.b.f8334a.i(viewContext.getViewName());
        q(p.b(k(), null, null, 0L, Q5.c.b(k().c(), null, null, null, null, null, null, null, viewContext, null, null, null, null, false, 0, null, false, null, null, null, null, null, 2097023, null), 7, null));
        Z4.b bVar = (Z4.b) S4.c.f10591a.g(i.j.f5428b);
        if (bVar != null) {
            bVar.U(viewContext);
        }
    }

    @Override // N5.a
    public p k() {
        return this.f7499b;
    }

    @Override // M5.a
    public void l() {
        C6118a.f63407a.a();
        p();
        O5.b.f8334a.j();
        U5.f.f12066a.C();
    }

    public void n() {
        synchronized (this.f7501d) {
            try {
                if (!this.f7500c.getAndSet(true)) {
                    this.f7503f = C6339a.f64787a.a();
                    D5.c.f2548a.b(this.f7504g);
                    P p10 = this.f7503f;
                    if (p10 != null) {
                        AbstractC1459k.d(p10, null, null, new b(null), 3, null);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void p() {
        q(p.b(k(), null, f7497h.b(), a().a(), null, 9, null));
    }

    public void q(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.f7499b = pVar;
    }

    public void r() {
        a.C0150a.c(this);
    }

    @Override // M5.a
    public void shutdown() {
        synchronized (this.f7501d) {
            try {
                if (this.f7500c.getAndSet(false)) {
                    D5.c.f2548a.f(this.f7504g);
                    P p10 = this.f7503f;
                    if (p10 != null) {
                        Q.f(p10, null, 1, null);
                    }
                    this.f7503f = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c(Q5.c cVar, InterfaceC6207a interfaceC6207a, p pVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r5, interfaceC6207a, pVar);
        Q5.c cVar2;
        interfaceC6207a = (i10 & 2) != 0 ? new C6208b() : interfaceC6207a;
        if ((i10 & 4) != 0) {
            cVar2 = cVar;
            pVar = new p(null, f7497h.b(), 0L, cVar2, 5, null);
        } else {
            cVar2 = cVar;
        }
    }
}
