package b;

/* renamed from: b.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2297Z extends AbstractC2312i {
    public C2297Z(int i10, int i11, int i12, InterfaceC2323t interfaceC2323t) {
        super(i10, i11, i12, interfaceC2323t);
    }

    @Override // b.w0
    public final int a(boolean z10) {
        int i10;
        w0 d10 = this.f24118h.d();
        boolean m10 = m();
        int a10 = d10.a(m10);
        if (m10) {
            a10 += 3;
        }
        if (z10) {
            int i11 = this.f24117g;
            if (i11 < 31) {
                i10 = 1;
            } else {
                int i12 = 2;
                while (true) {
                    i11 >>>= 7;
                    if (i11 == 0) {
                        break;
                    }
                    i12++;
                }
                i10 = i12;
            }
        } else {
            i10 = 0;
        }
        return a10 + i10;
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        w0 d10 = this.f24118h.d();
        boolean m10 = m();
        if (z10) {
            int i10 = this.f24116f;
            if (m10 || d10.f()) {
                i10 |= 32;
            }
            q0Var.d(i10, this.f24117g);
        }
        if (!m10) {
            d10.b(q0Var, false);
            return;
        }
        q0Var.f24140a.write(128);
        d10.b(q0Var, true);
        q0Var.f24140a.write(0);
        q0Var.f24140a.write(0);
    }

    @Override // b.w0
    public final boolean f() {
        return m() || this.f24118h.d().f();
    }

    @Override // b.AbstractC2312i
    public final F0 j(w0 w0Var) {
        return new C2285M(w0Var);
    }
}
