package z30;

import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import r.n;
import z30.j;

/* loaded from: classes3.dex */
public final class d implements Jb.e<B30.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<n> f107207a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f107208b;

    public d(Pc.a<n> aVar, Pc.a<InterfaceC6618a> aVar2) {
        this.f107207a = aVar;
        this.f107208b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        n biometricManager = this.f107207a.get();
        InterfaceC6618a fintechAnalyticInteractor = (InterfaceC6618a) ((j.b) this.f107208b).get();
        Intrinsics.checkNotNullParameter(biometricManager, "biometricManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        return new B30.e(biometricManager, fintechAnalyticInteractor);
    }
}
