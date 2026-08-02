package com.vk.posting.presentation.video.search;

import com.vk.posting.presentation.video.search.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.epx;
import xsna.j6e0;
import xsna.tzh0;

/* compiled from: SearchVideoPickerReducer.kt */
/* loaded from: classes5.dex */
public final class d extends dm50<h, c, tzh0> {
    @Override // xsna.dm50
    public final tzh0 c(tzh0 tzh0Var, c cVar) {
        tzh0 tzh0Var2 = tzh0Var;
        c cVar2 = cVar;
        if (!(cVar2 instanceof c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        c.a aVar = (c.a) cVar2;
        if (epx.f(aVar, c.a.b.b)) {
            return tzh0.a(tzh0Var2, null, true, null, 19);
        }
        if (aVar instanceof c.a.C1547a) {
            return tzh0.a(tzh0Var2, null, false, ((c.a.C1547a) aVar).b, 19);
        }
        if (aVar instanceof c.a.C1548c) {
            return tzh0.a(tzh0Var2, ((c.a.C1548c) aVar).b, false, null, 17);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final h d() {
        return new h(e(new j6e0(7)));
    }

    @Override // xsna.dm50
    public final void h(tzh0 tzh0Var, h hVar) {
        f(hVar.a, tzh0Var);
    }
}
