package com.vk.biometrics.lock.impl.presentation.base.mvi.settings;

import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.db;
import xsna.dm50;
import xsna.i47;
import xsna.k97;
import xsna.x87;

/* compiled from: BiometricsLockSettingsReducer.kt */
/* loaded from: classes15.dex */
public final class d extends dm50<k97, c, x87> {
    @Override // xsna.dm50
    public final x87 c(x87 x87Var, c cVar) {
        x87 x87Var2 = x87Var;
        c cVar2 = cVar;
        if (cVar2 instanceof c.C0434c) {
            c.C0434c c0434c = (c.C0434c) cVar2;
            return x87.a(x87Var2, c0434c.b, c0434c.c, c0434c.d, null, 8);
        }
        if (cVar2 instanceof c.e) {
            return x87.a(x87Var2, ((c.e) cVar2).b, false, null, null, 14);
        }
        if (cVar2 instanceof c.b) {
            return x87.a(x87Var2, false, false, null, i47.a(x87Var2.e, 6), 7);
        }
        if (!(cVar2 instanceof c.a)) {
            if (cVar2 instanceof c.d) {
                return x87.a(x87Var2, false, false, ((c.d) cVar2).b, null, 11);
            }
            throw new NoWhenBranchMatchedException();
        }
        c.a aVar = (c.a) cVar2;
        if (aVar instanceof c.a.b) {
            return x87.a(x87Var2, false, false, null, i47.a(x87Var2.e, 5), 7);
        }
        if (aVar instanceof c.a.C0433c) {
            return x87.a(x87Var2, false, false, null, i47.a(x87Var2.e, 3), 7);
        }
        if (!(aVar instanceof c.a.C0432a)) {
            throw new NoWhenBranchMatchedException();
        }
        x87Var2.e.getClass();
        return x87.a(x87Var2, false, false, null, new i47(false, false, false), 7);
    }

    @Override // xsna.dm50
    public final k97 d() {
        return new k97(e(new db(13)));
    }

    @Override // xsna.dm50
    public final void h(x87 x87Var, k97 k97Var) {
        f(k97Var.a, x87Var);
    }
}
