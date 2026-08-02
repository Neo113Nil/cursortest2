package com.vk.catalog.mvi.block.video.impl.p002short.draft;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.DraftShortVideoListView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cg1;
import xsna.cp10;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.gzs;
import xsna.izs;
import xsna.ja8;
import xsna.k9q0;
import xsna.ldv0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.sy90;
import xsna.vl20;
import xsna.wra0;
import xsna.y2c;
import xsna.zra0;

/* compiled from: PlaceholderView.kt */
/* loaded from: classes16.dex */
public final class h {
    public static final void a(DraftShortVideoListView.d.c cVar, izs izsVar, q630 q630Var, a aVar, int i) {
        int i2;
        a aVar2;
        a M = aVar.M(-73798728);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
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
            if (b.d()) {
                b.f(-73798728, i2, -1, "com.vk.catalog.mvi.block.video.impl.short.draft.DraftPlaceholderCardView (PlaceholderView.kt:20)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            vl20 a = zra0.a.a(d370.N(R.string.clips_drafts_placeholder_title, 0, M), null, d370.N(R.string.clips_drafts_placeholder_text, 0, M), null, M, 196608, 26);
            String N = d370.N(R.string.clips_drafts_placeholder_button_title, 0, M);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new cg1(20, izsVar, cVar);
                M.R(x);
            }
            aVar2 = M;
            ldv0.d(null, null, a, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x, null, null, null, false, null, null, null, null, null, null, false, false, null, null, aVar2, 0, 12582912, 131068), null, null, aVar2, 14), null, null, false, aVar2, 0, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            aVar2.G();
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new y2c(i, 4, cVar, izsVar, q630Var);
        }
    }
}
