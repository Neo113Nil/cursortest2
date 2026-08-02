package o50;

import kotlin.jvm.internal.Intrinsics;
import o50.g;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class e implements Jb.e<p50.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f77757a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f77758b;

    public e(Pc.a<C10656a> aVar, Pc.a<S80.b> aVar2) {
        this.f77757a = aVar;
        this.f77758b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        C10656a cbottomMapper2 = (C10656a) ((g.c) this.f77757a).get();
        S80.b fintechNavigation = (S80.b) ((g.d) this.f77758b).get();
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        return new p50.b(cbottomMapper2, fintechNavigation);
    }
}
