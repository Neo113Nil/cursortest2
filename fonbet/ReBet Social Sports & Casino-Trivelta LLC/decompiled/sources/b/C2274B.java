package b;

/* renamed from: b.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2274B extends F0 {

    /* renamed from: d, reason: collision with root package name */
    public int f24056d;

    public C2274B(InterfaceC2323t interfaceC2323t) {
        super(interfaceC2323t);
        this.f24056d = -1;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        if (this.f24056d < 0) {
            int length = this.f24067a.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.f24067a[i11].d().h().a(true);
            }
            this.f24056d = i10;
        }
        return q0.a(z10, this.f24056d);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.k(z10, 48);
        C2325v b10 = q0Var.b();
        InterfaceC2323t[] interfaceC2323tArr = this.f24067a;
        int length = interfaceC2323tArr.length;
        int i10 = this.f24056d;
        int i11 = 0;
        if (i10 >= 0 || length > 16) {
            if (i10 < 0) {
                int length2 = interfaceC2323tArr.length;
                int i12 = 0;
                for (int i13 = 0; i13 < length2; i13++) {
                    i12 += this.f24067a[i13].d().h().a(true);
                }
                this.f24056d = i12;
            }
            q0Var.c(this.f24056d);
            while (i11 < length) {
                this.f24067a[i11].d().h().b(b10, true);
                i11++;
            }
            return;
        }
        w0[] w0VarArr = new w0[length];
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            w0 h10 = this.f24067a[i15].d().h();
            w0VarArr[i15] = h10;
            i14 += h10.a(true);
        }
        this.f24056d = i14;
        q0Var.c(i14);
        while (i11 < length) {
            w0VarArr[i11].b(b10, true);
            i11++;
        }
    }

    @Override // b.F0
    public final AbstractC2311h n() {
        return new o0(C2327x.k(l()));
    }

    @Override // b.F0
    public final k0 o() {
        int m10 = m();
        k0[] k0VarArr = new k0[m10];
        for (int i10 = 0; i10 < m10; i10++) {
            k0VarArr[i10] = k0.j(this.f24067a[i10]);
        }
        return new C2317n(C2279G.l(k0VarArr));
    }

    public C2274B(C2326w c2326w) {
        super(c2326w);
        this.f24056d = -1;
    }

    public C2274B(InterfaceC2323t[] interfaceC2323tArr) {
        super(interfaceC2323tArr);
        this.f24056d = -1;
    }

    @Override // b.F0, b.w0
    public final w0 h() {
        return this;
    }

    @Override // b.F0, b.w0
    public final w0 i() {
        return this;
    }
}
