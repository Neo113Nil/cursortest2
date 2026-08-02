package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xl extends fkf {
    @Override // defpackage.fkf
    public final void A(n33 n33Var, Set set) {
        synchronized (n33Var) {
            try {
                if (n33Var.h == null) {
                    n33Var.h = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fkf
    public final int C(n33 n33Var) {
        int i;
        synchronized (n33Var) {
            i = n33Var.i - 1;
            n33Var.i = i;
        }
        return i;
    }
}
