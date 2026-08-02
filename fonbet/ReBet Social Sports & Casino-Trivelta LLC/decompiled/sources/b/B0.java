package b;

/* loaded from: classes.dex */
public final class B0 extends AbstractC2312i {
    public B0(int i10, int i11, int i12, InterfaceC2323t interfaceC2323t) {
        super(i10, i11, i12, interfaceC2323t);
    }

    @Override // b.w0
    public final int a(boolean z10) {
        int i10;
        w0 i11 = this.f24118h.d().i();
        boolean m10 = m();
        int a10 = i11.a(m10);
        int i12 = 2;
        int i13 = 1;
        if (m10) {
            if (a10 >= 128) {
                int i14 = a10;
                i10 = 2;
                while (true) {
                    i14 >>>= 8;
                    if (i14 == 0) {
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
            int i15 = this.f24117g;
            if (i15 >= 31) {
                while (true) {
                    i15 >>>= 7;
                    if (i15 == 0) {
                        break;
                    }
                    i12++;
                }
                i13 = i12;
            }
        } else {
            i13 = 0;
        }
        return a10 + i13;
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        w0 i10 = this.f24118h.d().i();
        boolean m10 = m();
        if (z10) {
            int i11 = this.f24116f;
            if (m10 || i10.f()) {
                i11 |= 32;
            }
            q0Var.d(i11, this.f24117g);
        }
        if (m10) {
            q0Var.c(i10.a(true));
        }
        i10.b(q0Var.j(), m10);
    }

    @Override // b.w0
    public final boolean f() {
        return m() || this.f24118h.d().i().f();
    }

    @Override // b.AbstractC2312i
    public final F0 j(w0 w0Var) {
        return new p0(w0Var);
    }

    public B0(boolean z10, int i10, w0 w0Var) {
        super(z10, i10, w0Var);
    }

    @Override // b.AbstractC2312i, b.w0
    public final w0 i() {
        return this;
    }
}
