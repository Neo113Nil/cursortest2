package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bo2 extends ao2 {
    public final jo2 u;
    public final f7a v;

    public bo2(jo2 jo2Var, f7a f7aVar) {
        this.u = jo2Var;
        z1a.y(f7aVar, "time");
        this.v = f7aVar;
    }

    public static Level L(int i) {
        int C = wt3.C(i);
        return C != 1 ? (C == 2 || C == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    @Override // defpackage.ao2
    public final void D(int i, String str) {
        jo2 jo2Var = this.u;
        f8a f8aVar = jo2Var.b;
        Level L = L(i);
        if (jo2.c.isLoggable(L)) {
            jo2.a(f8aVar, L, str);
        }
        if (!K(i) || i == 1) {
            return;
        }
        int C = wt3.C(i);
        z7a z7aVar = C != 2 ? C != 3 ? z7a.a : z7a.c : z7a.b;
        long l = this.v.l();
        z1a.y(str, "description");
        new a8a(str, z7aVar, l, null);
        synchronized (jo2Var.a) {
        }
    }

    @Override // defpackage.ao2
    public final void E(String str, int i, Object... objArr) {
        D(i, (K(i) || jo2.c.isLoggable(L(i))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean K(int i) {
        if (i == 1) {
            return false;
        }
        synchronized (this.u.a) {
        }
        return false;
    }
}
