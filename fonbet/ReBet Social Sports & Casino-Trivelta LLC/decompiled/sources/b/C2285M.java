package b;

/* renamed from: b.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2285M extends F0 {
    public C2285M() {
    }

    @Override // b.w0
    public final int a(boolean z10) {
        int i10 = z10 ? 4 : 3;
        int length = this.f24067a.length;
        for (int i11 = 0; i11 < length; i11++) {
            i10 += this.f24067a[i11].d().a(true);
        }
        return i10;
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.g(z10, 48, this.f24067a);
    }

    @Override // b.F0
    public final AbstractC2311h n() {
        return new C2327x(l());
    }

    @Override // b.F0
    public final k0 o() {
        int m10 = m();
        k0[] k0VarArr = new k0[m10];
        for (int i10 = 0; i10 < m10; i10++) {
            k0VarArr[i10] = k0.j(this.f24067a[i10]);
        }
        return new C2279G(C2279G.l(k0VarArr), k0VarArr);
    }

    public C2285M(InterfaceC2323t interfaceC2323t) {
        super(interfaceC2323t);
    }

    public C2285M(C2326w c2326w) {
        super(c2326w);
    }
}
