package com.vk.profile.community.details.impl.name_history;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.details.impl.name_history.a;
import com.vk.profile.community.details.impl.name_history.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.aud;
import xsna.bl;
import xsna.dsc;
import xsna.eqd;
import xsna.jr3;
import xsna.jt;
import xsna.rsg0;
import xsna.tt0;
import xsna.ug8;
import xsna.vah;
import xsna.w24;
import xsna.wah;
import xsna.wg8;
import xsna.wk50;
import xsna.yfb;
import xsna.zqu;

/* compiled from: CommunityNameHistoryFeature.kt */
/* loaded from: classes5.dex */
public final class b extends wk50<e, wah, a, c> {
    public final aud f;

    public b(aud audVar) {
        super(a.C1555a.b, new d(new wah(0)));
        this.f = audVar;
    }

    @Override // xsna.wk50
    public final void N(wah wahVar, a aVar) {
        a aVar2 = aVar;
        boolean equals = aVar2.equals(a.C1555a.b);
        aud audVar = this.f;
        if (equals) {
            T(c.a.b.b);
            a7f0.a.e(this, rsg0.y0(yfb.x(((zqu) audVar.a).a((UserId) audVar.b)), null, null, 3).U(new w24(vah.b, 1)).U(new tt0(new jt(18), 14)), null, new ug8(1, this, b.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 5), new eqd(this, 6), null, 9);
        } else {
            if (aVar2.equals(a.b.b)) {
                return;
            }
            if (!aVar2.equals(a.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            T(c.AbstractC1560c.b.b);
            a7f0.a.e(this, rsg0.y0(yfb.x(((zqu) audVar.a).a((UserId) audVar.b)), null, null, 3).U(new w24(vah.b, 1)).U(new bl(new jr3(8), 17)), null, new wg8(1, this, b.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 4), new dsc(this, 12), null, 9);
        }
    }
}
