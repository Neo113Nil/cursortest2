package com.vk.video.ad;

import com.vk.video.ad.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.d220;
import xsna.dm50;
import xsna.vzr0;

/* compiled from: VideoAdReducer.kt */
/* loaded from: classes5.dex */
public final class d extends dm50<g, c, vzr0> {
    @Override // xsna.dm50
    public final vzr0 c(vzr0 vzr0Var, c cVar) {
        c cVar2 = cVar;
        if (cVar2 instanceof c.a) {
            return new vzr0(((c.a) cVar2).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final g d() {
        return new g(e(new d220(25)));
    }

    @Override // xsna.dm50
    public final void h(vzr0 vzr0Var, g gVar) {
        f(gVar.a, vzr0Var);
    }
}
