package b;

/* renamed from: b.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2283K extends AbstractC2312i {
    public C2283K(int i10, int i11, int i12, InterfaceC2323t interfaceC2323t) {
        super(i10, i11, i12, interfaceC2323t);
    }

    @Override // b.w0
    public final int a(boolean z10) {
        int i10;
        w0 h10 = this.f24118h.d().h();
        boolean m10 = m();
        int a10 = h10.a(m10);
        int i11 = 2;
        int i12 = 1;
        if (m10) {
            if (a10 >= 128) {
                int i13 = a10;
                i10 = 2;
                while (true) {
                    i13 >>>= 8;
                    if (i13 == 0) {
                        break;
                    }
                    i10++;
                }
            } else {
                i10 = 1;
            }
            a10 += i10;
        }
        if (z10) {
            int i14 = this.f24117g;
            if (i14 >= 31) {
                while (true) {
                    i14 >>>= 7;
                    if (i14 == 0) {
                        break;
                    }
                    i11++;
                }
                i12 = i11;
            }
        } else {
            i12 = 0;
        }
        return a10 + i12;
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        w0 h10 = this.f24118h.d().h();
        boolean m10 = m();
        if (z10) {
            int i10 = this.f24116f;
            if (m10 || h10.f()) {
                i10 |= 32;
            }
            q0Var.d(i10, this.f24117g);
        }
        if (m10) {
            q0Var.c(h10.a(true));
        }
        h10.b(q0Var.b(), m10);
    }

    @Override // b.w0
    public final boolean f() {
        return m() || this.f24118h.d().h().f();
    }

    @Override // b.AbstractC2312i
    public final F0 j(w0 w0Var) {
        return new C2274B(w0Var);
    }

    public C2283K(boolean z10, int i10, w0 w0Var) {
        super(z10, i10, w0Var);
    }

    @Override // b.AbstractC2312i, b.w0
    public final w0 h() {
        return this;
    }

    @Override // b.AbstractC2312i, b.w0
    public final w0 i() {
        return this;
    }
}
