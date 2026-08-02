package Y4;

import I5.a;
import Ph.P;
import Q5.b;
import android.app.Application;
import b5.InterfaceC2398a;
import com.plaid.internal.EnumC3631g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
public final class b implements InterfaceC2398a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f14062a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f14063b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f14064c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6207a f14065d;

    /* renamed from: e, reason: collision with root package name */
    public final C6048c f14066e;

    /* renamed from: f, reason: collision with root package name */
    public final P f14067f;

    public b(InterfaceC6300r tracer, Application application, N5.a configurationsManager, InterfaceC6207a clock, C6048c spanFactory, P scope) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanFactory, "spanFactory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f14062a = tracer;
        this.f14063b = application;
        this.f14064c = configurationsManager;
        this.f14065d = clock;
        this.f14066e = spanFactory;
        this.f14067f = scope;
    }

    public Object a(a aVar, Continuation continuation) {
        E5.b.f3006a.f("dispatching custom measurement event, details: " + aVar);
        InterfaceC6290h a10 = b().a(new C6047b(a.f.f5356c.a(), b.f.f9377b, null, null, null, null, null, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
        a10.h("measurement", aVar.a());
        a10.k("measurement-value", aVar.b());
        a10.end();
        return Unit.INSTANCE;
    }

    public C6048c b() {
        return this.f14066e;
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
