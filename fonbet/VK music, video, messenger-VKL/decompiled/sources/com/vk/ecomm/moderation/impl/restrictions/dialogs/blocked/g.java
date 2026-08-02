package com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked;

import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.e430;
import xsna.vd1;

/* compiled from: ModerationBlockedItemReducer.kt */
/* loaded from: classes18.dex */
public final class g extends dm50<i, f, e430> {
    @Override // xsna.dm50
    public final e430 c(e430 e430Var, f fVar) {
        e430 e430Var2 = e430Var;
        f fVar2 = fVar;
        if (fVar2 instanceof f.a) {
            f.a aVar = (f.a) fVar2;
            return e430.a(e430Var2, aVar.d, aVar.b, aVar.c, false, 8);
        }
        if (fVar2 instanceof f.c) {
            return e430.a(e430Var2, null, null, null, false, 7);
        }
        if (fVar2 instanceof f.b) {
            return e430.a(e430Var2, null, null, null, true, 7);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final i d() {
        return new i(e(new vd1(27)));
    }

    @Override // xsna.dm50
    public final void h(e430 e430Var, i iVar) {
        f(iVar.a, e430Var);
    }
}
