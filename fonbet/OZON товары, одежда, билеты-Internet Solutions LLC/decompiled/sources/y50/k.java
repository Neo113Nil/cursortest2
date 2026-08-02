package y50;

import kotlin.jvm.internal.Intrinsics;
import x40.C10656a;
import y50.n;
import z50.C10991e;
import z50.InterfaceC10990d;

/* loaded from: classes3.dex */
public final class k implements Jb.e<InterfaceC10990d> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f106018a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f106019b;

    public k(Pc.a<C10656a> aVar, Pc.a<S80.b> aVar2) {
        this.f106018a = aVar;
        this.f106019b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        C10656a cbottomMapper2 = (C10656a) ((n.e) this.f106018a).get();
        S80.b fintechNavigation = (S80.b) ((n.f) this.f106019b).get();
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        return new C10991e(cbottomMapper2, fintechNavigation);
    }
}
