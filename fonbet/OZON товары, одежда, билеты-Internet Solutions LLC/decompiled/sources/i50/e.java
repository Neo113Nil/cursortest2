package i50;

import i50.g;
import j50.C7286b;
import j50.InterfaceC7285a;
import kotlin.jvm.internal.Intrinsics;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class e implements Jb.e<InterfaceC7285a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f65862a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f65863b;

    public e(Pc.a<C10656a> aVar, Pc.a<S80.b> aVar2) {
        this.f65862a = aVar;
        this.f65863b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        C10656a cbottomMapper2 = (C10656a) ((g.b) this.f65862a).get();
        S80.b fintechNavigation = (S80.b) ((g.c) this.f65863b).get();
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        return new C7286b(cbottomMapper2, fintechNavigation);
    }
}
