package Z4;

import I5.a;
import Ph.P;
import Q5.ViewContext;
import Q5.b;
import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p5.C6047b;
import p5.C6048c;
import r5.C6208b;
import r5.InterfaceC6207a;
import rh.InterfaceC6300r;
import s5.C6339a;

/* loaded from: classes2.dex */
public final class b implements b5.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f14623a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f14624b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f14625c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6207a f14626d;

    /* renamed from: e, reason: collision with root package name */
    public final C6048c f14627e;

    /* renamed from: f, reason: collision with root package name */
    public final P f14628f;

    /* renamed from: g, reason: collision with root package name */
    public final b5.d f14629g;

    /* renamed from: h, reason: collision with root package name */
    public final e f14630h;

    public b(InterfaceC6300r tracer, Application application, N5.a configurationsManager, InterfaceC6207a clock, C6048c spanFactory, P scope) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanFactory, "spanFactory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f14623a = tracer;
        this.f14624b = application;
        this.f14625c = configurationsManager;
        this.f14626d = clock;
        this.f14627e = spanFactory;
        this.f14628f = scope;
        b5.d dVar = new b5.d() { // from class: Z4.a
            @Override // b5.d
            public final void a(Object obj) {
                b.J(b.this, (ViewContext) obj);
            }
        };
        this.f14629g = dVar;
        this.f14630h = new e(dVar);
    }

    public static final void J(b bVar, ViewContext event) {
        Intrinsics.checkNotNullParameter(event, "event");
        bVar.U(event);
    }

    public C6048c B() {
        return this.f14627e;
    }

    public final void U(ViewContext viewContext) {
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        E5.b.f3006a.a("reporting view context change to " + viewContext.getViewName());
        r().j(viewContext);
        B().a(new C6047b(a.h.f5358c.a(), b.f.f9377b, null, Long.valueOf(k().a()), null, null, null, 116, null)).end();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14630h.t();
        Unit unit = Unit.INSTANCE;
        E5.b.f3006a.f("navigation instrumentation stopped");
    }

    public InterfaceC6207a k() {
        return this.f14626d;
    }

    public N5.a r() {
        return this.f14625c;
    }

    @Override // b5.c
    public void r0() {
        this.f14630h.r();
        Unit unit = Unit.INSTANCE;
        E5.b.f3006a.f("navigation instrumentation started");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b(InterfaceC6300r interfaceC6300r, Application application, N5.a aVar, InterfaceC6207a interfaceC6207a, C6048c c6048c, P p10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6300r, application, aVar, r4, (i10 & 16) != 0 ? new C6048c(interfaceC6300r, r4, aVar) : c6048c, (i10 & 32) != 0 ? C6339a.f64787a.a() : p10);
        InterfaceC6207a c6208b = (i10 & 8) != 0 ? new C6208b() : interfaceC6207a;
    }
}
