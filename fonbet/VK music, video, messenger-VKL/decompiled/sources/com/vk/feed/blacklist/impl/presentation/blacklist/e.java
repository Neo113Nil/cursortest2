package com.vk.feed.blacklist.impl.presentation.blacklist;

import com.vk.dto.common.id.UserId;
import com.vk.feed.blacklist.impl.presentation.blacklist.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.ke7;
import xsna.r9;

/* compiled from: BlacklistReducer.kt */
/* loaded from: classes18.dex */
public final class e extends dm50<g, d, ke7> {
    @Override // xsna.dm50
    public final ke7 c(ke7 ke7Var, d dVar) {
        ke7 ke7Var2 = ke7Var;
        d dVar2 = dVar;
        if (dVar2 instanceof d.a) {
            return ke7Var2;
        }
        if (!(dVar2 instanceof d.b)) {
            throw new NoWhenBranchMatchedException();
        }
        d.b bVar = (d.b) dVar2;
        int i = bVar.e;
        int i2 = bVar.f;
        List<UserId> list = bVar.b;
        return new ke7(i, i2, list, bVar.c, bVar.d, Boolean.valueOf(list.isEmpty()));
    }

    @Override // xsna.dm50
    public final g d() {
        return new g(e(new r9(this, 6)));
    }

    @Override // xsna.dm50
    public final void h(ke7 ke7Var, g gVar) {
        f(gVar.a, ke7Var);
    }
}
