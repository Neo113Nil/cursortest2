package Ph;

/* renamed from: Ph.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1480v extends H0 implements InterfaceC1478u {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1482w f9134e;

    public C1480v(InterfaceC1482w interfaceC1482w) {
        this.f9134e = interfaceC1482w;
    }

    @Override // Ph.InterfaceC1478u
    public boolean a(Throwable th2) {
        return t().H(th2);
    }

    @Override // Ph.InterfaceC1478u
    public C0 getParent() {
        return t();
    }

    @Override // Ph.H0
    public boolean u() {
        return true;
    }

    @Override // Ph.H0
    public void v(Throwable th2) {
        this.f9134e.m1(t());
    }
}
