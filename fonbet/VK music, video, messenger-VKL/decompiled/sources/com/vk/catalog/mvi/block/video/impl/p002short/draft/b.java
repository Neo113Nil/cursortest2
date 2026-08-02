package com.vk.catalog.mvi.block.video.impl.p002short.draft;

import android.view.View;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.DraftShortVideoListView;
import com.vkontakte.android.R;
import xsna.ahn;
import xsna.cp10;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.fwu0;
import xsna.gzs;
import xsna.hr80;
import xsna.ir;
import xsna.izs;
import xsna.ja8;
import xsna.k9q0;
import xsna.lg90;
import xsna.mlg0;
import xsna.n34;
import xsna.ojc;
import xsna.or;
import xsna.p2b;
import xsna.pg90;
import xsna.pzu0;
import xsna.q630;
import xsna.qer0;
import xsna.qri;
import xsna.ra8;
import xsna.s200;
import xsna.s3q0;
import xsna.sg50;
import xsna.sy90;
import xsna.txj0;
import xsna.ty6;
import xsna.ur;
import xsna.wlb0;
import xsna.wzs;
import xsna.yqv0;

/* compiled from: DraftShortVideoCardView.kt */
/* loaded from: classes16.dex */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(DraftShortVideoListView.d.a aVar, izs<? super DraftShortVideoListView.c, s3q0> izsVar, q630 q630Var, a aVar2, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        izs<? super DraftShortVideoListView.c, s3q0> izsVar2;
        DraftShortVideoListView.d.a aVar3;
        final q630 q630Var3;
        f s;
        int i4;
        a M = aVar2.M(-2101459734);
        if ((i & 6) == 0) {
            i3 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if (M.t(i3 & 1, (i3 & 147) == 146)) {
                izsVar2 = izsVar;
                aVar3 = aVar;
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630.a aVar4 = q630.a.a;
                q630 q630Var4 = i5 != 0 ? aVar4 : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2101459734, i3, -1, "com.vk.catalog.mvi.block.video.impl.short.draft.DraftShortVideoCardView (DraftShortVideoCardView.kt:37)");
                }
                long j = wlb0.h(M).getImage().b;
                e.a aVar5 = e.a;
                q630 m = hr80.m(q630Var4, j, aVar5);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, m);
                cri.h7.getClass();
                q630 q630Var5 = q630Var4;
                LayoutNode.a aVar6 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar6);
                } else {
                    M.f();
                }
                cri.a.c cVar = cri.a.f;
                k9q0.w(M, d, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar = cri.a.g;
                k9q0.w(M, valueOf, bVar);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                int i6 = i3;
                fwu0.c(txj0.d(aVar4, 1.0f), null, aVar.c, null, null, null, null, a.a, M, 100663302, 250);
                ja8.a(hr80.m(txj0.d(aVar4, 1.0f), wlb0.h(M).j().a, aVar5), M, 0);
                ty6 ty6Var = dt1.a.f;
                ra8 ra8Var = ra8.a;
                q630 b = ra8Var.b(aVar4, ty6Var);
                c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, b);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar6);
                } else {
                    M.f();
                }
                k9q0.w(M, a, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar);
                if (androidx.compose.runtime.b.d()) {
                    i4 = -1;
                    androidx.compose.runtime.b.f(-1948538462, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Write24> (VkSdkIcons.kt:3824)");
                } else {
                    i4 = -1;
                }
                lg90 b2 = or.b(M, 1868818696, R.drawable.vk_icon_write_24, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(b2, null, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 7), wlb0.h(M).getText().d, M, 440, 0);
                int i7 = i4;
                yqv0.c(d370.N(R.string.catalog_short_video_list_item_template, 0, M), null, wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).s0, M, 0, 0, 8186);
                M = M;
                M.G();
                View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(864001564, 0, i7, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical24> (VkSdkIcons.kt:2666)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_24, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = wlb0.h(M).getText().d;
                q630 D3 = s200.D(ra8Var.b(aVar4, dt1.a.d), 8);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(M);
                }
                sg50 sg50Var = (sg50) x;
                mlg0 a3 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true);
                boolean y = ((i6 & 112) == 32) | ((i6 & 14) == 4) | M.y(view);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    aVar3 = aVar;
                    izsVar2 = izsVar;
                    x2 = new p2b(izsVar2, aVar3, view, 1);
                    M.R(x2);
                } else {
                    aVar3 = aVar;
                    izsVar2 = izsVar;
                }
                pzu0.b(a2, null, ahn.E(ojc.b(D3, sg50Var, a3, false, null, (gzs) x2, 28), "mvi_catalog_short_video_card_menu_test_tag"), j2, M, 56, 0);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
            }
            s = M.s();
            if (s == null) {
                final DraftShortVideoListView.d.a aVar7 = aVar3;
                final izs<? super DraftShortVideoListView.c, s3q0> izsVar3 = izsVar2;
                s.d = new wzs() { // from class: xsna.kdo
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        com.vk.catalog.mvi.block.video.impl.p002short.draft.b.a(DraftShortVideoListView.d.a.this, izsVar3, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 147) == 146)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
