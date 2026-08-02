package Ph;

/* renamed from: Ph.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1462l0 implements InterfaceC1487y0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9105a;

    public C1462l0(boolean z10) {
        this.f9105a = z10;
    }

    @Override // Ph.InterfaceC1487y0
    public N0 b() {
        return null;
    }

    @Override // Ph.InterfaceC1487y0
    public boolean isActive() {
        return this.f9105a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
