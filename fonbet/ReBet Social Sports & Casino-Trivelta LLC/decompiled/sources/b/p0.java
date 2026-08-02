package b;

/* loaded from: classes.dex */
public final class p0 extends F0 {

    /* renamed from: d, reason: collision with root package name */
    public int f24138d;

    public p0() {
        this.f24138d = -1;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        if (this.f24138d < 0) {
            int length = this.f24067a.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.f24067a[i11].d().i().a(true);
            }
            this.f24138d = i10;
        }
        return q0.a(z10, this.f24138d);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.k(z10, 48);
        m0 j10 = q0Var.j();
        InterfaceC2323t[] interfaceC2323tArr = this.f24067a;
        int length = interfaceC2323tArr.length;
        int i10 = this.f24138d;
        int i11 = 0;
        if (i10 >= 0 || length > 16) {
            if (i10 < 0) {
                int length2 = interfaceC2323tArr.length;
                int i12 = 0;
                for (int i13 = 0; i13 < length2; i13++) {
                    i12 += this.f24067a[i13].d().i().a(true);
                }
                this.f24138d = i12;
            }
            q0Var.c(this.f24138d);
            while (i11 < length) {
                j10.e(this.f24067a[i11].d());
                i11++;
            }
            return;
        }
        w0[] w0VarArr = new w0[length];
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            w0 i16 = this.f24067a[i15].d().i();
            w0VarArr[i15] = i16;
            i14 += i16.a(true);
        }
        this.f24138d = i14;
        q0Var.c(i14);
        while (i11 < length) {
            j10.e(w0VarArr[i11]);
            i11++;
        }
    }

    @Override // b.F0
    public final AbstractC2311h n() {
        return new C2299a0(C2327x.k(l()));
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

    public p0(InterfaceC2323t interfaceC2323t) {
        super(interfaceC2323t);
        this.f24138d = -1;
    }

    public p0(C2326w c2326w) {
        super(c2326w);
        this.f24138d = -1;
    }

    public p0(InterfaceC2323t[] interfaceC2323tArr) {
        super(interfaceC2323tArr);
        this.f24138d = -1;
    }

    @Override // b.F0, b.w0
    public final w0 i() {
        return this;
    }
}
