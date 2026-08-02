package m0;

import m0.D0;

/* loaded from: classes8.dex */
public final class K0 implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D0 f73551a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0.a f73552b;

    public K0(D0 d02, D0.a aVar) {
        this.f73551a = d02;
        this.f73552b = aVar;
    }

    @Override // S0.M
    public final void dispose() {
        D0.d b11;
        D0 d02 = this.f73551a;
        d02.getClass();
        D0.a.C1247a b12 = this.f73552b.b();
        if (b12 == null || (b11 = b12.b()) == null) {
            return;
        }
        d02.u(b11);
    }
}
