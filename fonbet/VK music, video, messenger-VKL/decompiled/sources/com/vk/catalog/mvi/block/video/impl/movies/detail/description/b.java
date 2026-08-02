package com.vk.catalog.mvi.block.video.impl.movies.detail.description;

import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import xsna.ahn;
import xsna.cg1;
import xsna.gzs;
import xsna.izs;
import xsna.md30;
import xsna.nh3;
import xsna.psu0;
import xsna.q630;
import xsna.us2;
import xsna.y2c;

/* compiled from: MovieDescriptionView.kt */
/* loaded from: classes16.dex */
public final class b {
    public static final void a(md30 md30Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-382143764);
        if ((i & 6) == 0) {
            i2 = (M.J(md30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-382143764, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.description.MovieDescription (MovieDescriptionView.kt:126)");
            }
            us2 c = md30Var.c.c(M);
            boolean z = md30Var.d;
            q630 E = ahn.E(q630Var, "movie_description_root");
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new nh3(18, izsVar, md30Var);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z3 = (i3 == 32) | (i4 == 4);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new cg1(19, izsVar, md30Var);
                M.R(x2);
            }
            aVar2 = M;
            psu0.e(c, z, gzsVar, E, 0L, null, null, 0L, 4, 0, null, null, 0L, null, true, (gzs) x2, aVar2, 100663296, 24576, 16112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new y2c(i, 3, md30Var, izsVar, q630Var);
        }
    }
}
