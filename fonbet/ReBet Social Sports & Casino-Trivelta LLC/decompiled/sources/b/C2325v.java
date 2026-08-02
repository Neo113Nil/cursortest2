package b;

import java.io.OutputStream;

/* renamed from: b.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2325v extends m0 {
    public C2325v(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // b.m0, b.q0
    public final void e(w0 w0Var) {
        w0Var.h().b(this, true);
    }

    @Override // b.m0, b.q0
    public final void h(InterfaceC2323t[] interfaceC2323tArr) {
        for (InterfaceC2323t interfaceC2323t : interfaceC2323tArr) {
            interfaceC2323t.d().h().b(this, true);
        }
    }

    @Override // b.m0, b.q0
    public final void i(w0[] w0VarArr) {
        for (w0 w0Var : w0VarArr) {
            w0Var.h().b(this, true);
        }
    }

    @Override // b.q0
    public final C2325v b() {
        return this;
    }
}
