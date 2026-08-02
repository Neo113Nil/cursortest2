package com.vk.feed.settings.impl.presentation.filtered.tab;

import com.vk.feed.settings.impl.presentation.filtered.tab.d;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.f330;
import xsna.mi10;
import xsna.ti60;

/* compiled from: NewsfeedFilterListReducer.kt */
/* loaded from: classes18.dex */
public final class e extends dm50<g, d, ti60> {
    @Override // xsna.dm50
    public final ti60 c(ti60 ti60Var, d dVar) {
        ti60 ti60Var2 = ti60Var;
        d dVar2 = dVar;
        if (dVar2 instanceof d.b) {
            return ti60Var2;
        }
        if (dVar2 instanceof d.C1063d) {
            d.C1063d c1063d = (d.C1063d) dVar2;
            return new ti60(c1063d.c, false, c1063d.b, false);
        }
        if (dVar2.equals(d.c.b)) {
            return ti60.a(ti60Var2, true, false);
        }
        if (dVar2.equals(d.a.b)) {
            return ti60.a(ti60Var2, false, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final g d() {
        return new g(e(new mi10(new f330(), 10)));
    }

    @Override // xsna.dm50
    public final void h(ti60 ti60Var, g gVar) {
        f(gVar.a, ti60Var);
    }
}
