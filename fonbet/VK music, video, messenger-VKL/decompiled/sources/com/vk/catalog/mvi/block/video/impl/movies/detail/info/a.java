package com.vk.catalog.mvi.block.video.impl.movies.detail.info;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.b;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.group.header.a;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.group.header.g;
import com.vungle.ads.internal.protos.Sdk;
import xsna.a8a;
import xsna.ahn;
import xsna.cri;
import xsna.de30;
import xsna.dt1;
import xsna.ee30;
import xsna.ie30;
import xsna.izs;
import xsna.k2o;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.q2a;
import xsna.q630;
import xsna.qri;
import xsna.s200;
import xsna.s3q0;
import xsna.sy90;

/* compiled from: MovieInfoView.kt */
/* loaded from: classes.dex */
public final class a extends q2a<ee30, de30> {
    @Override // xsna.q2a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(a8a a8aVar, ee30 ee30Var, izs<? super de30, s3q0> izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(3536826);
        if ((i & 48) == 0) {
            i2 = (M.J(ee30Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (b.d()) {
                b.f(3536826, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.info.MovieInfoView.MovieInfoBlockView.ContentImpl (MovieInfoView.kt:120)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.d(), M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a b = cri.a.b();
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(b);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.d());
            k9q0.w(M, D, cri.a.f());
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.c());
            k9q0.t(M, cri.a.a());
            k9q0.w(M, c, cri.a.e());
            b.c cVar = b.c.a;
            f a2 = f.a.a(ee30Var.c.a(0, M), null, null, null, null, null, null, null, false, M, 805306368, 510);
            M = M;
            g.a(a.C0748a.a(a2, M), null, cVar, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            ie30.a(ee30Var, izsVar, s200.E(ahn.E(q630Var, "movie_info_root"), kqu0.w, kqu0.t), M, (i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new k2o(this, a8aVar, ee30Var, izsVar, q630Var, i));
        }
    }
}
