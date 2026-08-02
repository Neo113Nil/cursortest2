package V4;

import I5.a;
import Ph.P;
import Q5.UserContext;
import Q5.ViewContext;
import Q5.b;
import Q5.m;
import Q5.q;
import android.app.Application;
import b5.InterfaceC2398a;
import com.plaid.internal.EnumC3631g;
import ei.AbstractC4212b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import p5.C6047b;
import p5.C6048c;
import r5.C6208b;
import r5.InterfaceC6207a;
import rh.InterfaceC6290h;
import rh.InterfaceC6300r;
import s5.C6339a;

/* loaded from: classes2.dex */
public final class d implements InterfaceC2398a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6300r f12508a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f12509b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f12510c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6207a f12511d;

    /* renamed from: e, reason: collision with root package name */
    public final C6048c f12512e;

    /* renamed from: f, reason: collision with root package name */
    public final P f12513f;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f12504c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(InterfaceC6300r tracer, Application application, N5.a configurationsManager, InterfaceC6207a clock, C6048c spanFactory, P scope) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanFactory, "spanFactory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f12508a = tracer;
        this.f12509b = application;
        this.f12510c = configurationsManager;
        this.f12511d = clock;
        this.f12512e = spanFactory;
        this.f12513f = scope;
    }

    public Object a(c cVar, Continuation continuation) {
        if (a.$EnumSwitchMapping$0[cVar.a().ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        d();
        return Unit.INSTANCE;
    }

    public N5.a b() {
        return this.f12510c;
    }

    public C6048c c() {
        return this.f12512e;
    }

    public final void d() {
        InternalEventInitData e10 = e(b().k().c());
        AbstractC4212b b10 = F5.b.b();
        b10.a();
        String b11 = b10.b(InternalEventInitData.INSTANCE.serializer(), e10);
        InterfaceC6290h a10 = c().a(new C6047b(a.c.f5353c.a(), b.f.f9377b, null, null, null, null, null, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
        a10.h("internal_event_type", b.f12504c.c());
        a10.h("internal_event_data", b11);
        a10.end();
    }

    public final InternalEventInitData e(Q5.c cVar) {
        String c10 = cVar.c();
        JsonElement e10 = F5.b.e(cVar.m());
        String i10 = cVar.i();
        String v10 = cVar.v();
        UserContext t10 = cVar.t();
        ViewContext w10 = cVar.w();
        Map l10 = cVar.l();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(l10.size()));
        for (Map.Entry entry : l10.entrySet()) {
            linkedHashMap.put(((m) entry.getKey()).a(), entry.getValue());
        }
        Map n10 = cVar.n();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(n10.size()));
        for (Map.Entry entry2 : n10.entrySet()) {
            linkedHashMap2.put(((q) entry2.getKey()).name(), entry2.getValue());
        }
        return new InternalEventInitData(c10, e10, i10, v10, t10, w10, linkedHashMap, linkedHashMap2, cVar.k(), cVar.j(), cVar.f(), cVar.r(), cVar.s(), cVar.h(), cVar.p(), cVar.d() != null ? "exists" : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ d(InterfaceC6300r interfaceC6300r, Application application, N5.a aVar, InterfaceC6207a interfaceC6207a, C6048c c6048c, P p10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6300r, application, aVar, r4, (i10 & 16) != 0 ? new C6048c(interfaceC6300r, r4, aVar) : c6048c, (i10 & 32) != 0 ? C6339a.f64787a.a() : p10);
        InterfaceC6207a c6208b = (i10 & 8) != 0 ? new C6208b() : interfaceC6207a;
    }
}
