package com.vk.ecomm.reviews.impl.communities.yclients;

import com.vk.ecomm.reviews.impl.communities.yclients.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.k3j;
import xsna.pt;
import xsna.py;
import xsna.qt;

/* compiled from: ConnectYClientsReviewsReducer.kt */
/* loaded from: classes18.dex */
public final class g extends dm50<i, f, k3j> {
    @Override // xsna.dm50
    public final k3j c(k3j k3jVar, f fVar) {
        k3j k3jVar2 = k3jVar;
        f fVar2 = fVar;
        if (fVar2.equals(f.c.b)) {
            return k3j.a(k3jVar2, true, 5);
        }
        if (fVar2.equals(f.a.b)) {
            return k3j.a(k3jVar2, false, 4);
        }
        if (fVar2.equals(f.d.b)) {
            return new k3j(false, false, true);
        }
        if (fVar2.equals(f.b.b)) {
            return new k3j(false, false, false);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final i d() {
        return new i(e(new pt(22)), e(new py(18)), e(new qt(19)));
    }

    @Override // xsna.dm50
    public final void h(k3j k3jVar, i iVar) {
        k3j k3jVar2 = k3jVar;
        i iVar2 = iVar;
        if (k3jVar2.d) {
            f(iVar2.c, k3jVar2);
        } else if (k3jVar2.b) {
            f(iVar2.b, k3jVar2);
        } else {
            f(iVar2.a, k3jVar2);
        }
    }
}
