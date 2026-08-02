package com.vk.ecomm.reviews.impl.communities.yclients;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.communities.yclients.ConnectYClientsReviewsResult;
import com.vk.ecomm.reviews.impl.communities.yclients.a;
import com.vk.ecomm.reviews.impl.communities.yclients.d;
import com.vk.ecomm.reviews.impl.communities.yclients.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.b5h;
import xsna.f4z;
import xsna.fkq0;
import xsna.k3j;
import xsna.oce;
import xsna.pzh;
import xsna.wk50;

/* compiled from: ConnectYClientsReviewsFeature.kt */
/* loaded from: classes18.dex */
public final class e extends wk50<i, k3j, a, f> {
    public final pzh f;
    public final UserId g;
    public final f4z h;

    public e(g gVar, pzh pzhVar, UserId userId) {
        super(a.b.b, gVar);
        this.f = pzhVar;
        this.g = userId;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(k3j k3jVar, a aVar) {
        a aVar2 = aVar;
        boolean z = k3jVar.d;
        if (aVar2.equals(a.b.b)) {
            T(f.b.b);
            return;
        }
        boolean equals = aVar2.equals(a.C1019a.b);
        f4z f4zVar = this.h;
        if (equals) {
            f4zVar.b(new d.a(z ? ConnectYClientsReviewsResult.Success.b : null));
            return;
        }
        if (!(aVar2 instanceof a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            f4zVar.b(new d.a(ConnectYClientsReviewsResult.Success.b));
        } else {
            T(f.c.b);
            a7f0.a.f(this, this.f.f(fkq0.a(this.g)), new b5h(this, 4), new oce(this, 11), 1);
        }
    }
}
