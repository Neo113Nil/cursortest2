package y50;

import kotlin.jvm.internal.Intrinsics;
import x40.C10656a;
import y50.m;
import z50.C10988b;
import z50.InterfaceC10987a;

/* renamed from: y50.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10843e implements Jb.e<InterfaceC10987a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f106014a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f106015b;

    public C10843e(Pc.a<C10656a> aVar, Pc.a<S80.b> aVar2) {
        this.f106014a = aVar;
        this.f106015b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        C10656a cbottomMapper2 = (C10656a) ((m.c) this.f106014a).get();
        S80.b fintechNavigation = (S80.b) ((m.d) this.f106015b).get();
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        return new C10988b(cbottomMapper2, fintechNavigation);
    }
}
