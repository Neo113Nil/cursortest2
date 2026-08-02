package b;

/* renamed from: b.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2291T extends AbstractC2298a {
    public C2291T(C2326w c2326w) {
        super(c2326w);
    }

    @Override // b.w0
    public final int a(boolean z10) {
        int i10 = z10 ? 4 : 3;
        int length = this.f24085a.length;
        for (int i11 = 0; i11 < length; i11++) {
            i10 += this.f24085a[i11].d().a(true);
        }
        return i10;
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.g(z10, 49, this.f24085a);
    }
}
