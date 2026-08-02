package com.vk.ecomm.reviews.impl.communities.yclients;

import com.vk.ecomm.reviews.impl.communities.yclients.i;
import xsna.ao50;
import xsna.fm50;
import xsna.i3j;
import xsna.i6v0;
import xsna.ijk;
import xsna.izs;
import xsna.jq2;
import xsna.kai;
import xsna.mt;
import xsna.n0u0;
import xsna.q630;
import xsna.s3q0;
import xsna.txj0;
import xsna.xp2;

/* compiled from: ConnectYClientsReviewsContent.kt */
/* loaded from: classes18.dex */
public final class b extends i6v0<i, a> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((i) ao50Var, izsVar, aVar, 512);
    }

    public final void h(i iVar, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(873377465);
        int i2 = (M.J(iVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(873377465, i2, -1, "com.vk.ecomm.reviews.impl.communities.yclients.ConnectYClientsReviewsContent.ThemedContent (ConnectYClientsReviewsContent.kt:23)");
            }
            ijk.a((fm50) d(i.b.a, new n0u0[]{iVar.a, iVar.b, iVar.c}, M, (i2 & 896) | 518).getValue(), xp2.a(txj0.z(txj0.f(q630.a.a, 1.0f), null, 3), null, 3), jq2.d(150, 0, null, 6), "StateChange", kai.c(-126281050, new i3j(izsVar, 0), M), M, 28032, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mt(i, 2, this, iVar, izsVar);
        }
    }
}
