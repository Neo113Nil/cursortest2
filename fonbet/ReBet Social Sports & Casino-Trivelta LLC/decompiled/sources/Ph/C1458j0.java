package Ph;

/* renamed from: Ph.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1458j0 implements InterfaceC1463m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1456i0 f9100a;

    public C1458j0(InterfaceC1456i0 interfaceC1456i0) {
        this.f9100a = interfaceC1456i0;
    }

    @Override // Ph.InterfaceC1463m
    public void b(Throwable th2) {
        this.f9100a.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f9100a + ']';
    }
}
