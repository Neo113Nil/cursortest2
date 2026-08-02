package t50;

import Jb.e;
import d40.InterfaceC6083a;
import kotlin.jvm.internal.Intrinsics;
import t50.d;
import u50.C9974i;
import u50.InterfaceC9967b;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class c implements e<InterfaceC9967b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f99194a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f99195b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<S80.b> f99196c;

    public c(Pc.a<C10656a> aVar, Pc.a<InterfaceC6083a> aVar2, Pc.a<S80.b> aVar3) {
        this.f99194a = aVar;
        this.f99195b = aVar2;
        this.f99196c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        C10656a cbottomMapper2 = (C10656a) ((d.b) this.f99194a).get();
        InterfaceC6083a exchanger = (InterfaceC6083a) ((d.a) this.f99195b).get();
        S80.b fintechNavigation = (S80.b) ((d.c) this.f99196c).get();
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        return new C9974i(cbottomMapper2, fintechNavigation, exchanger);
    }
}
