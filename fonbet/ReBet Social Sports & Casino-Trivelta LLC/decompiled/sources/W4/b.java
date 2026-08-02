package W4;

import D5.f;
import I5.a;
import Ph.P;
import Q5.b;
import android.app.Application;
import b5.d;
import com.plaid.internal.EnumC3631g;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p5.C6047b;
import p5.C6048c;
import r5.C6208b;
import r5.InterfaceC6207a;
import rh.InterfaceC6290h;
import rh.InterfaceC6300r;
import s5.C6339a;

/* loaded from: classes2.dex */
public final class b implements b5.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f12976a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f12977b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f12978c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6207a f12979d;

    /* renamed from: e, reason: collision with root package name */
    public final C6048c f12980e;

    /* renamed from: f, reason: collision with root package name */
    public final P f12981f;

    /* renamed from: g, reason: collision with root package name */
    public final d f12982g;

    /* renamed from: h, reason: collision with root package name */
    public final c f12983h;

    public b(InterfaceC6300r tracer, Application application, N5.a configurationsManager, InterfaceC6207a clock, C6048c spanFactory, P scope) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanFactory, "spanFactory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f12976a = tracer;
        this.f12977b = application;
        this.f12978c = configurationsManager;
        this.f12979d = clock;
        this.f12980e = spanFactory;
        this.f12981f = scope;
        d dVar = new d() { // from class: W4.a
            @Override // b5.d
            public final void a(Object obj) {
                b.r(b.this, (f) obj);
            }
        };
        this.f12982g = dVar;
        this.f12983h = new c(dVar);
    }

    public static final void r(b bVar, f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        bVar.B(event);
    }

    public final void B(f fVar) {
        E5.b.f3006a.a("reporting lifecycle event: " + fVar.a());
        InterfaceC6290h a10 = k().a(new C6047b(a.d.f5354c.a(), b.f.f9377b, null, null, null, null, null, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
        a10.h("lifecycle_event", fVar.a());
        a10.h("event_view_name", fVar.b());
        a10.end();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12983h.d();
        Unit unit = Unit.INSTANCE;
        E5.b.f3006a.f("lifecycle instrumentation stopped");
    }

    public C6048c k() {
        return this.f12980e;
    }

    @Override // b5.c
    public void r0() {
        this.f12983h.b();
        Unit unit = Unit.INSTANCE;
        E5.b.f3006a.f("lifecycle instrumentation started");
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
