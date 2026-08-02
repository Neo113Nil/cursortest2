package d5;

import A5.H;
import I5.a;
import Ph.P;
import Q5.ViewContext;
import Q5.b;
import Q5.x;
import Q5.z;
import android.app.Application;
import android.view.View;
import d5.AbstractC4007c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import p5.C6047b;
import p5.C6048c;
import r5.C6208b;
import r5.InterfaceC6207a;
import rh.InterfaceC6290h;
import rh.InterfaceC6300r;
import s5.C6339a;
import u5.C6523d;
import u5.InterfaceC6524e;
import y5.C6854a;

/* loaded from: classes2.dex */
public final class h implements b5.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f44977a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f44978b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f44979c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6207a f44980d;

    /* renamed from: e, reason: collision with root package name */
    public final C6048c f44981e;

    /* renamed from: f, reason: collision with root package name */
    public final P f44982f;

    /* renamed from: g, reason: collision with root package name */
    public final O5.a f44983g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC6524e f44984h;

    /* renamed from: i, reason: collision with root package name */
    public final C4006b f44985i;

    /* renamed from: j, reason: collision with root package name */
    public y5.e f44986j;

    /* renamed from: k, reason: collision with root package name */
    public final b5.d f44987k;

    /* renamed from: l, reason: collision with root package name */
    public final i f44988l;

    public h(InterfaceC6300r tracer, Application application, N5.a configurationsManager, InterfaceC6207a clock, C6048c spanFactory, P scope, O5.a snapshotManager, InterfaceC6524e display) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanFactory, "spanFactory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        Intrinsics.checkNotNullParameter(display, "display");
        this.f44977a = tracer;
        this.f44978b = application;
        this.f44979c = configurationsManager;
        this.f44980d = clock;
        this.f44981e = spanFactory;
        this.f44982f = scope;
        this.f44983g = snapshotManager;
        this.f44984h = display;
        this.f44985i = new C4006b();
        b5.d dVar = new b5.d() { // from class: d5.d
            @Override // b5.d
            public final void a(Object obj) {
                h.Y1(h.this, (AbstractC4007c) obj);
            }
        };
        this.f44987k = dVar;
        this.f44988l = new i(dVar, w0());
    }

    public static final boolean D0(y5.d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!(model instanceof H)) {
            return false;
        }
        View d10 = ((H) model).d();
        return d10.canScrollVertically(1) || d10.canScrollVertically(-1) || d10.canScrollHorizontally(1) || d10.canScrollHorizontally(-1);
    }

    public static final boolean T1(y5.d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return (model instanceof H) && ((H) model).g();
    }

    public static final void Y1(h hVar, AbstractC4007c userInteraction) {
        Intrinsics.checkNotNullParameter(userInteraction, "userInteraction");
        hVar.Z1(userInteraction);
    }

    public static final boolean n1(y5.d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return model instanceof H;
    }

    public final void A0(AbstractC4007c.a aVar) {
        String substringAfterLast$default;
        this.f44983g.d();
        y5.d b10 = this.f44984h.a().b(aVar.c(), new Function1() { // from class: d5.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean D02;
                D02 = h.D0((y5.d) obj);
                return Boolean.valueOf(D02);
            }
        });
        if (b10 == null) {
            return;
        }
        C6047b c6047b = new C6047b(a.k.f5361c.a(), b.f.f9377b, aVar.d(), Long.valueOf(U().a()), null, null, null, 112, null);
        H h10 = b10 instanceof H ? (H) b10 : null;
        z u10 = w0().k().c().u();
        if (h10 == null || (substringAfterLast$default = (String) u10.c().invoke(h10.d())) == null) {
            substringAfterLast$default = StringsKt.substringAfterLast$default(b10.b(), '.', (String) null, 2, (Object) null);
        }
        InterfaceC6290h a10 = z0().a(c6047b);
        a10.h("user-interaction-type", aVar.a());
        a10.h("user-interaction-target-id", b10.a());
        a10.h("user-interaction-element-classes", b10.b());
        a10.h("user-interaction-target-element", substringAfterLast$default);
        a10.h("user-interaction-direction", aVar.b().b());
        a10.end();
    }

    public final void J(x details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f44983g.d();
        InterfaceC6290h a10 = z0().a(new C6047b(a.k.f5361c.a(), b.f.f9377b, w0().k().c().w(), Long.valueOf(U().a()), null, null, null, 112, null));
        a10.h("user-interaction-type", details.f());
        String e10 = details.e();
        if (e10 != null) {
            a10.h("user-interaction-target-id", e10);
        }
        String b10 = details.b();
        if (b10 != null) {
            a10.h("user-interaction-element-classes", b10);
        }
        String d10 = details.d();
        if (d10 != null) {
            a10.h("user-interaction-target-element", d10);
        }
        String a11 = details.a();
        if (a11 != null) {
            a10.h("user-interaction-direction", a11);
        }
        String c10 = details.c();
        if (c10 != null) {
            a10.h("user-interaction-inner-text", c10);
        }
        if (details.g() != null && details.h() != null) {
            a10.h("user-interaction-x", details.g().toString());
            a10.h("user-interaction-y", details.h().toString());
        }
        a10.end();
    }

    public InterfaceC6207a U() {
        return this.f44980d;
    }

    public final void Z1(AbstractC4007c abstractC4007c) {
        E5.b bVar = E5.b.f3006a;
        bVar.a("user interaction: " + abstractC4007c);
        if (abstractC4007c instanceof AbstractC4007c.AbstractC0652c.b) {
            this.f44986j = this.f44984h.a();
            ViewContext c10 = ((AbstractC4007c.AbstractC0652c.b) abstractC4007c).c();
            bVar.a("user tapped down, caching viewContext: " + c10);
            this.f44985i.b(TuplesKt.to(c10, Long.valueOf(U().a())));
            return;
        }
        if (abstractC4007c instanceof AbstractC4007c.AbstractC0652c.a) {
            y1((AbstractC4007c.AbstractC0652c) abstractC4007c);
        } else if (abstractC4007c instanceof AbstractC4007c.a) {
            A0((AbstractC4007c.a) abstractC4007c);
        } else {
            if (!(abstractC4007c instanceof AbstractC4007c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m1((AbstractC4007c.b) abstractC4007c);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44988l.h();
        Unit unit = Unit.INSTANCE;
        E5.b.f3006a.f("User interaction instrumentation stopped");
    }

    public final void m1(AbstractC4007c.b bVar) {
        String substringAfterLast$default;
        this.f44983g.d();
        y5.d b10 = this.f44984h.a().b(bVar.c(), new Function1() { // from class: d5.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean n12;
                n12 = h.n1((y5.d) obj);
                return Boolean.valueOf(n12);
            }
        });
        if (b10 == null) {
            return;
        }
        C6047b c6047b = new C6047b(a.k.f5361c.a(), b.f.f9377b, bVar.d(), Long.valueOf(U().a()), null, null, null, 112, null);
        H h10 = b10 instanceof H ? (H) b10 : null;
        z u10 = w0().k().c().u();
        if (h10 == null || (substringAfterLast$default = (String) u10.c().invoke(h10.d())) == null) {
            substringAfterLast$default = StringsKt.substringAfterLast$default(b10.b(), '.', (String) null, 2, (Object) null);
        }
        InterfaceC6290h a10 = z0().a(c6047b);
        a10.h("user-interaction-type", bVar.a());
        a10.h("user-interaction-target-id", b10.a());
        a10.h("user-interaction-element-classes", b10.b());
        a10.h("user-interaction-target-element", substringAfterLast$default);
        a10.h("user-interaction-direction", bVar.b().b());
        a10.end();
    }

    @Override // b5.c
    public void r0() {
        if (!H5.a.f4799a.c()) {
            E5.b.f3006a.f("User interaction native monitoring skipped — hybrid platform detected");
        } else {
            this.f44988l.g();
            E5.b.f3006a.f("User interaction instrumentation started");
        }
    }

    public N5.a w0() {
        return this.f44979c;
    }

    public final void y1(AbstractC4007c.AbstractC0652c abstractC0652c) {
        String substringAfterLast$default;
        String e10;
        this.f44983g.d();
        Function1 function1 = new Function1() { // from class: d5.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean T12;
                T12 = h.T1((y5.d) obj);
                return Boolean.valueOf(T12);
            }
        };
        C6854a b10 = abstractC0652c.b();
        Pair a10 = this.f44985i.a();
        ViewContext viewContext = a10 != null ? (ViewContext) a10.getFirst() : null;
        Pair a11 = this.f44985i.a();
        long longValue = a11 != null ? ((Number) a11.getSecond()).longValue() : U().a();
        y5.e eVar = this.f44986j;
        if (eVar == null) {
            eVar = this.f44984h.a();
        }
        y5.d b11 = eVar.b(b10, function1);
        if (b11 == null) {
            return;
        }
        C6047b c6047b = new C6047b(a.k.f5361c.a(), b.f.f9377b, viewContext, Long.valueOf(longValue), null, null, null, 112, null);
        H h10 = b11 instanceof H ? (H) b11 : null;
        z u10 = w0().k().c().u();
        if (h10 == null || (substringAfterLast$default = (String) u10.c().invoke(h10.d())) == null) {
            substringAfterLast$default = StringsKt.substringAfterLast$default(b11.b(), '.', (String) null, 2, (Object) null);
        }
        double roundToInt = MathKt.roundToInt(b10.a() * 100.0d) / 100.0d;
        double roundToInt2 = MathKt.roundToInt(b10.b() * 100.0d) / 100.0d;
        InterfaceC6290h a12 = z0().a(c6047b);
        a12.h("user-interaction-type", abstractC0652c.a());
        a12.h("user-interaction-target-id", b11.a());
        a12.h("user-interaction-element-classes", b11.b());
        a12.h("user-interaction-target-element", substringAfterLast$default);
        a12.h("user-interaction-x", String.valueOf(roundToInt));
        a12.h("user-interaction-y", String.valueOf(roundToInt2));
        if (h10 != null && (e10 = h10.e()) != null) {
            if (!((Boolean) u10.d().invoke(h10.d(), e10)).booleanValue()) {
                e10 = "***";
            }
            a12.h("user-interaction-inner-text", e10);
        }
        a12.end();
        this.f44986j = null;
    }

    public C6048c z0() {
        return this.f44981e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ h(InterfaceC6300r interfaceC6300r, Application application, N5.a aVar, InterfaceC6207a interfaceC6207a, C6048c c6048c, P p10, O5.a aVar2, InterfaceC6524e interfaceC6524e, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6300r, application, aVar, r4, (i10 & 16) != 0 ? new C6048c(interfaceC6300r, r4, aVar) : c6048c, (i10 & 32) != 0 ? C6339a.f64787a.a() : p10, (i10 & 64) != 0 ? O5.b.f8334a : aVar2, (i10 & 128) != 0 ? C6523d.f66138a : interfaceC6524e);
        InterfaceC6207a c6208b = (i10 & 8) != 0 ? new C6208b() : interfaceC6207a;
    }
}
