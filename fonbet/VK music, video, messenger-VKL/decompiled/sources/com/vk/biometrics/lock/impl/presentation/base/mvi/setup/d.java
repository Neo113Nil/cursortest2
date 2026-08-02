package com.vk.biometrics.lock.impl.presentation.base.mvi.setup;

import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.am0;
import xsna.dm50;
import xsna.h87;
import xsna.p87;

/* compiled from: BiometricsLockSecuritySetupReducer.kt */
/* loaded from: classes15.dex */
public final class d extends dm50<p87, c, h87> {
    @Override // xsna.dm50
    public final h87 c(h87 h87Var, c cVar) {
        h87 h87Var2 = h87Var;
        c cVar2 = cVar;
        if (cVar2 instanceof c.C0437c) {
            return h87Var2;
        }
        if (cVar2 instanceof c.a) {
            ((c.a) cVar2).getClass();
            boolean z = h87Var2.c;
            h87Var2.getClass();
            return new h87(true, z);
        }
        if (!(cVar2 instanceof c.d)) {
            if (cVar2 instanceof c.b) {
                return new h87(false, false);
            }
            throw new NoWhenBranchMatchedException();
        }
        ((c.d) cVar2).getClass();
        boolean z2 = h87Var2.b;
        h87Var2.getClass();
        return new h87(z2, true);
    }

    @Override // xsna.dm50
    public final p87 d() {
        return new p87(e(new am0(10)));
    }

    @Override // xsna.dm50
    public final void h(h87 h87Var, p87 p87Var) {
        f(p87Var.a, h87Var);
    }
}
