package com.vk.censoredsettings.presentation.obscenetext;

import com.vk.censoredsettings.presentation.obscenetext.c;
import com.vk.censoredsettings.presentation.obscenetext.e;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.rj60;

/* compiled from: ObsceneTextFilterReducer.kt */
/* loaded from: classes16.dex */
public final class d extends dm50<f, c, e> {
    @Override // xsna.dm50
    public final e c(e eVar, c cVar) {
        c cVar2 = cVar;
        return cVar2 instanceof c.a ? new e.a(((c.a) cVar2).b) : cVar2 instanceof c.b ? new e.a(((c.b) cVar2).b) : eVar;
    }

    @Override // xsna.dm50
    public final f d() {
        return new f(e(new rj60(this, 4)));
    }

    @Override // xsna.dm50
    public final void h(e eVar, f fVar) {
        e eVar2 = eVar;
        f fVar2 = fVar;
        if (eVar2 instanceof e.a) {
            f(fVar2.a, eVar2);
        } else if (!(eVar2 instanceof e.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
