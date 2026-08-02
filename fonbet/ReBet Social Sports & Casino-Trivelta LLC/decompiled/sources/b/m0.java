package b;

import java.io.OutputStream;

/* loaded from: classes.dex */
public class m0 extends q0 {
    public m0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // b.q0
    public void e(w0 w0Var) {
        w0Var.i().b(this, true);
    }

    @Override // b.q0
    public void h(InterfaceC2323t[] interfaceC2323tArr) {
        for (InterfaceC2323t interfaceC2323t : interfaceC2323tArr) {
            interfaceC2323t.d().i().b(this, true);
        }
    }

    @Override // b.q0
    public void i(w0[] w0VarArr) {
        for (w0 w0Var : w0VarArr) {
            w0Var.i().b(this, true);
        }
    }

    @Override // b.q0
    public final m0 j() {
        return this;
    }
}
