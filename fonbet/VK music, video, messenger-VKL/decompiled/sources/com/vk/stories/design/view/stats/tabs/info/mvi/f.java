package com.vk.stories.design.view.stats.tabs.info.mvi;

import com.vk.stories.design.view.stats.tabs.info.mvi.d;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.hfm0;
import xsna.ifm0;
import xsna.izi0;

/* compiled from: StoryStatisticsInfoReducer.kt */
/* loaded from: classes6.dex */
public final class f extends dm50<g, d, ifm0> {
    @Override // xsna.dm50
    public final ifm0 c(ifm0 ifm0Var, d dVar) {
        ifm0 ifm0Var2 = ifm0Var;
        d dVar2 = dVar;
        if (dVar2 instanceof d.e) {
            return ifm0.a(ifm0Var2, ((d.e) dVar2).b, false, null, null, null, 30);
        }
        if (dVar2 instanceof d.C1809d) {
            return ifm0.a(ifm0Var2, null, true, null, null, null, 21);
        }
        if (dVar2 instanceof d.b) {
            return ifm0.a(ifm0Var2, null, false, ((d.b) dVar2).b, null, null, 17);
        }
        if (dVar2 instanceof d.c) {
            return ifm0.a(ifm0Var2, null, false, null, ((d.c) dVar2).b, null, 17);
        }
        if (dVar2 instanceof d.a) {
            return ifm0.a(ifm0Var2, null, false, null, null, izi0.k(ifm0Var2.f, Integer.valueOf(((d.a) dVar2).b)), 15);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final g d() {
        return new g(e(new hfm0(this, 0)));
    }

    @Override // xsna.dm50
    public final void h(ifm0 ifm0Var, g gVar) {
        f(gVar.a, ifm0Var);
    }
}
