package com.vk.newsfeed.impl.postmodal.reactions.donut;

import com.vk.newsfeed.impl.postmodal.reactions.donut.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dm50;
import xsna.f130;
import xsna.leq;

/* compiled from: ModalPostDonutReducer.kt */
/* loaded from: classes4.dex */
public final class d extends dm50<f, c, f130> {
    @Override // xsna.dm50
    public final f130 c(f130 f130Var, c cVar) {
        f130 f130Var2 = f130Var;
        c cVar2 = cVar;
        if (cVar2.equals(c.C1396c.b)) {
            return new f130(f130Var2.b, true, f130Var2.d);
        }
        if (cVar2 instanceof c.b) {
            return new f130(((c.b) cVar2).b, false, false);
        }
        if (cVar2.equals(c.a.b)) {
            return new f130(EmptyList.b, false, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final f d() {
        return new f(e(new leq(16)));
    }

    @Override // xsna.dm50
    public final void h(f130 f130Var, f fVar) {
        f(fVar.a, f130Var);
    }
}
