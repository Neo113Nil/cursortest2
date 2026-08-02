package Ph;

import Sh.AbstractC1576n;

/* loaded from: classes5.dex */
public abstract class M0 extends L {
    @Override // Ph.L
    public L c2(int i10, String str) {
        AbstractC1576n.a(i10);
        return AbstractC1576n.b(this, str);
    }

    public abstract M0 e2();

    public final String f2() {
        M0 m02;
        M0 c10 = C1452g0.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            m02 = c10.e2();
        } catch (UnsupportedOperationException unused) {
            m02 = null;
        }
        if (this == m02) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // Ph.L
    public String toString() {
        String f22 = f2();
        if (f22 != null) {
            return f22;
        }
        return U.a(this) + '@' + U.b(this);
    }
}
