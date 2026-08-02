package b;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public abstract class w0 implements InterfaceC2323t {
    public abstract int a(boolean z10);

    public abstract void b(q0 q0Var, boolean z10);

    public abstract boolean c(w0 w0Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC2323t) && c(((InterfaceC2323t) obj).d());
    }

    public abstract boolean f();

    public final byte[] g() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C2325v(byteArrayOutputStream).e(this);
        return byteArrayOutputStream.toByteArray();
    }

    public abstract int hashCode();

    @Override // b.InterfaceC2323t
    public final w0 d() {
        return this;
    }

    public w0 h() {
        return this;
    }

    public w0 i() {
        return this;
    }
}
