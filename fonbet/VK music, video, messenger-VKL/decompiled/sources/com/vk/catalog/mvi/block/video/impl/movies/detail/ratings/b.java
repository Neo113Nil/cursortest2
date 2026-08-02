package com.vk.catalog.mvi.block.video.impl.movies.detail.ratings;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a;
import xsna.a86;
import xsna.ahn;
import xsna.b6s;
import xsna.cri;
import xsna.dt1;
import xsna.f9t;
import xsna.fno0;
import xsna.hik0;
import xsna.jqh;
import xsna.k9q0;
import xsna.kai;
import xsna.kqu0;
import xsna.l2l0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.s3q0;
import xsna.sy90;
import xsna.txj0;
import xsna.u4s;
import xsna.us2;
import xsna.wlb0;
import xsna.wuv0;
import xsna.x95;
import xsna.ylu0;
import xsna.yqv0;

/* compiled from: MovieRatingsView.kt */
/* loaded from: classes16.dex */
public final class b {
    public static final void a(a.C0461a c0461a, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1699809978);
        int i2 = (M.J(c0461a) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1699809978, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.MovieRating (MovieRatingsView.kt:159)");
            }
            ylu0 h = wlb0.h(M);
            wuv0 l = wlb0.l(M);
            float f = c0461a.b;
            boolean n = M.n(f);
            Object x = M.x();
            if (n || x == a.C0011a.a) {
                long j = ((double) f) >= 7.0d ? h.getText().l : h.getText().p;
                long l2 = l2l0.l(32);
                b6s b6sVar = b6s.j;
                long j2 = l2l0.j(0.2d);
                l2l0.g(j2);
                hik0 hik0Var = new hik0(j, l2, b6sVar, null, null, u4s.c, null, l2l0.n(-fno0.d(j2), 1095216660480L & j2), null, null, null, 0L, null, null, 65368);
                hik0 a = hik0.a(l.d0.a.a, h.getText().p, 65534);
                us2.b bVar = new us2.b();
                int m = bVar.m(hik0Var);
                try {
                    bVar.g(String.valueOf(f));
                    s3q0 s3q0Var = s3q0.a;
                    bVar.k(m);
                    m = bVar.m(a);
                    try {
                        bVar.g(" /10");
                        bVar.k(m);
                        x = bVar.n();
                        M.R(x);
                    } finally {
                    }
                } finally {
                }
            }
            us2 us2Var = (us2) x;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c(c0461a.a.a(0, M), null, wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 0, 0, 8186);
            M = M;
            f9t.e(txj0.h(aVar2, kqu0.s), M, 0);
            yqv0.d(us2Var, null, 0L, 0, null, 0, false, 0, null, null, null, M, 0, 0, 16382);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new a86(c0461a, i, 10);
        }
    }

    public static final void b(a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-1143283931);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1143283931, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.MovieRatings (MovieRatingsView.kt:146)");
            }
            e.a(ahn.E(q630Var, "movie_ratings_root"), androidx.compose.foundation.layout.a.g(32), androidx.compose.foundation.layout.a.g(kqu0.y), null, 0, 0, kai.c(1265728970, new x95(aVar, 3), M), M, 1572912, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new jqh(aVar, q630Var, i, 4);
        }
    }
}
