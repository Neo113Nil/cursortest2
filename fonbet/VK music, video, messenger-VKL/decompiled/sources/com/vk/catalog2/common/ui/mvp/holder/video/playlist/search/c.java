package com.vk.catalog2.common.ui.mvp.holder.video.playlist.search;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.dto.common.ImageSize;
import com.vk.movika.sdk.base.ui.m;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ahn;
import xsna.anp;
import xsna.azl;
import xsna.bbk0;
import xsna.bu00;
import xsna.cp10;
import xsna.cri;
import xsna.crx0;
import xsna.d370;
import xsna.dd80;
import xsna.dt1;
import xsna.dtp0;
import xsna.e0a0;
import xsna.e5q;
import xsna.esa0;
import xsna.f0a0;
import xsna.f9t;
import xsna.frv0;
import xsna.fwu0;
import xsna.g0a0;
import xsna.gzs;
import xsna.hg2;
import xsna.hr80;
import xsna.hx9;
import xsna.hxh0;
import xsna.i5;
import xsna.ixh0;
import xsna.iyk0;
import xsna.izs;
import xsna.j5g;
import xsna.ja8;
import xsna.jai;
import xsna.jq2;
import xsna.k9q0;
import xsna.kai;
import xsna.kqu0;
import xsna.l2l0;
import xsna.l5g;
import xsna.l5h;
import xsna.lg90;
import xsna.lye;
import xsna.m200;
import xsna.mm2;
import xsna.mtk0;
import xsna.n34;
import xsna.n9d;
import xsna.nkk;
import xsna.nzu0;
import xsna.o2a0;
import xsna.ojc;
import xsna.os30;
import xsna.pb00;
import xsna.pg90;
import xsna.phu0;
import xsna.plg0;
import xsna.pn00;
import xsna.q1h;
import xsna.q630;
import xsna.qri;
import xsna.r0v0;
import xsna.r0x;
import xsna.r18;
import xsna.r9g;
import xsna.ra8;
import xsna.rg50;
import xsna.rnu0;
import xsna.rpp;
import xsna.rrv0;
import xsna.rte0;
import xsna.s0x;
import xsna.s200;
import xsna.s3q0;
import xsna.sua;
import xsna.sv1;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.ty6;
import xsna.uog0;
import xsna.ur;
import xsna.us2;
import xsna.uvi;
import xsna.ux6;
import xsna.vog;
import xsna.vog0;
import xsna.vy90;
import xsna.wh50;
import xsna.wlb0;
import xsna.wow;
import xsna.wp80;
import xsna.wzs;
import xsna.xpy;
import xsna.xvy;
import xsna.ylu0;
import xsna.yqv0;
import xsna.yzs;
import xsna.z85;
import xsna.zrt;
import xsna.zvy;

/* compiled from: SearchPlaylistCard.kt */
/* loaded from: classes16.dex */
public final class c {
    public static final void a(final int i, final String str, final gzs<s3q0> gzsVar, final gzs<Float> gzsVar2, final gzs<Float> gzsVar3, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1971708146);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.y(gzsVar3) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1971708146, i3, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.ExpandButton (SearchPlaylistCard.kt:421)");
            }
            q630 E = ahn.E(ojc.c(rte0.d(txj0.f(q630.a.a, 1.0f), vog0.b(10)), false, null, new plg0(0), gzsVar, 11), "expandable_playlist_card_expand_toggle_button");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phu0.a(E, null, ylu0Var.getBackground().x, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1546777338, new q1h(gzsVar3, gzsVar2, str, i), M), aVar2, 1572864, 58);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mxh0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.c.a(i, str, gzsVar, gzsVar2, gzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final ArrayList arrayList, final int i, final izs izsVar, final izs izsVar2, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a M = aVar.M(-1523941417);
        int i3 = i2 | (M.J(arrayList) ? 32 : 16) | (M.o(i) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | (M.y(izsVar2) ? 16384 : 8192) | (M.l(false) ? 131072 : 65536);
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1523941417, i3, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.ExpandableVideos (SearchPlaylistCard.kt:337)");
            }
            Object[] objArr = new Object[0];
            boolean z = (458752 & i3) == 131072;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new o2a0(7);
                M.R(x);
            }
            wh50 wh50Var = (wh50) crx0.A(objArr, (gzs) x, M, 0);
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = jq2.d(300, 0, new nkk(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f), 2);
                M.R(x2);
            }
            dtp0 dtp0Var = (dtp0) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = jq2.d(300, 0, new nkk(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f), 2);
                M.R(x3);
            }
            dtp0 dtp0Var2 = (dtp0) x3;
            mtk0 b = hg2.b(((Boolean) wh50Var.getValue()).booleanValue() ? 180.0f : 0.0f, dtp0Var, null, null, M, 48, 28);
            mtk0 b2 = hg2.b(((Boolean) wh50Var.getValue()).booleanValue() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f, dtp0Var, null, null, M, 48, 28);
            xvy a = zvy.a(0, 3, M);
            boolean z2 = (i3 & 112) == 32;
            Object x4 = M.x();
            if (z2 || x4 == obj) {
                x4 = wp80.h(new jai(-161730501, new n9d(a, arrayList, izsVar), true));
                M.R(x4);
            }
            wzs wzsVar = (wzs) x4;
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            rpp b3 = anp.e(dtp0Var, 2).b(anp.d(dtp0Var2, null, null, 14));
            e5q b4 = anp.f(dtp0Var, 2).b(anp.k(dtp0Var2, null, 14));
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = new ux6(6);
                M.R(x5);
            }
            mm2.b(r9g.a, booleanValue, dd80.i(q630.a.a, (yzs) x5), b3, b4, null, kai.c(2099626159, new vog(wzsVar, 2), M), M, 1600518, 16);
            d.c cVar = (d.c) j5g.a0(new wow(arrayList));
            String str = cVar != null ? cVar.c : null;
            boolean J = M.J(wh50Var) | ((i3 & 57344) == 16384);
            Object x6 = M.x();
            if (J || x6 == obj) {
                x6 = new m(21, izsVar2, wh50Var);
                M.R(x6);
            }
            gzs gzsVar = (gzs) x6;
            boolean J2 = M.J(b2);
            Object x7 = M.x();
            if (J2 || x7 == obj) {
                x7 = new ixh0(b2, 0);
                M.R(x7);
            }
            gzs gzsVar2 = (gzs) x7;
            boolean J3 = M.J(b);
            Object x8 = M.x();
            if (J3 || x8 == obj) {
                x8 = new os30(b, 20);
                M.R(x8);
            }
            a(i, str, gzsVar, gzsVar2, (gzs) x8, M, (i3 >> 6) & 14);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs(arrayList, i, izsVar, izsVar2, i2) { // from class: xsna.jxh0
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ int c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ izs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(7);
                    com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.c.b(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final String str, final long j, final String str2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1830455725);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.J(str2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1830455725, i2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.PlaylistCover (SearchPlaylistCard.kt:162)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean d2 = l5g.d(j, l5g.j);
            q630.a aVar3 = q630.a.a;
            if (d2) {
                M.K(1711056169);
            } else {
                M.K(1717898830);
                q630 F = s200.F(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(txj0.h(aVar3, (float) 6.2d), 1.0f));
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new l5h(j, 1);
                    M.R(x);
                }
                f9t.e(bu00.e(F, (izs) x), M, 0);
            }
            M.j();
            lg90 l = fwu0.l(str, null, null, null, M, i2 & 14, 62);
            float f = 8;
            q630 d3 = rte0.d(sua.d(1.7777778f, s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), false), vog0.b(f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d3, ylu0Var.getImage().a, e.a);
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            r0v0.a(l, r18.a(f2, ylu0Var2.getImage().a, m, vog0.b(f)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 8, 252);
            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Medium;
            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
            ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Overlay;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(954817474, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ListPlayOutline12> (VkSdkIcons.kt:2076)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_list_play_outline_12, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rnu0.c(contentBadgeSize, contentBadgeMode, design, ra8.a.b(s200.D(aVar3, kqu0.t), dt1.a.j), a, null, str2, null, null, null, false, null, false, null, M, 33206 | (3670016 & (i2 << 12)), 0, 16288);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs(str, j, str2, q630Var, i) { // from class: xsna.kxh0
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ String d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3073);
                    com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.c.c(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(d.b bVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(24162912);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(24162912, i2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.PlaylistInfo (SearchPlaylistCard.kt:249)");
            }
            IntrinsicSize intrinsicSize = IntrinsicSize.Max;
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(m200.u(aVar2, intrinsicSize), 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            dt1.a.getClass();
            k a = j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            d.a aVar4 = bVar.b;
            lg90 l = fwu0.l(aVar4.b, null, null, null, M, 0, 62);
            q630 q = txj0.q(aVar2, 40);
            long j = wlb0.h(M).getImage().a;
            uog0 uog0Var = vog0.a;
            r0v0.a(l, ojc.c(rte0.d(hr80.m(q, j, uog0Var), uog0Var), false, null, null, gzsVar, 15), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 8, 252);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(kqu0.r), dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, xpyVar);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            yqv0.c(bVar.a, aVar2, wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(M).h0, M, 100663344, 48, 5880);
            us2.b bVar3 = new us2.b();
            bVar3.g(aVar4.a);
            if (aVar4.c != null) {
                s0x.a(bVar3, "verified", "�");
            }
            bVar3.g(" · " + bVar.c);
            us2 n = bVar3.n();
            Pair[] pairArr = {new Pair("verified", new r0x(new esa0(l2l0.l(16), l2l0.l(16), 6), kai.c(612619024, new hx9(bVar, 3), M)))};
            f0a0 f0a0Var = f0a0.e;
            f0a0Var.getClass();
            g0a0 g0a0Var = new g0a0(f0a0Var);
            pn00.r(g0a0Var, pairArr);
            vy90 d = g0a0Var.e.d();
            f0a0 f0a0Var2 = g0a0Var.b;
            vy90 vy90Var = f0a0Var2.d;
            f0a0 f0a0Var3 = f0a0Var2;
            if (d != vy90Var) {
                f0a0Var3 = new f0a0(g0a0Var.c, g0a0Var.d, d);
            }
            f0a0 f0a0Var4 = f0a0Var3;
            g0a0Var.b = f0a0Var4;
            yqv0.d(n, aVar2, wlb0.h(M).getText().p, 0, null, 2, false, 2, null, f0a0Var4, wlb0.l(M).s0, M, 100663344, 6, 2808);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-836118916, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical16> (VkSdkIcons.kt:2658)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_more_vertical_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar2, a3, d370.N(R.string.common_actions, 0, M), txj0.q(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 1, aVar2), 24), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, wlb0.h(M).getIcon().j, false, null, false, null, null, M, ((i2 >> 6) & 14) | 64, 2000);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new lye(i, 3, bVar, gzsVar, gzsVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(d.c cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-440475440);
        int i2 = i | (M.J(cVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-440475440, i2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.PlaylistVideoItem (SearchPlaylistCard.kt:488)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj = x;
            if (x == c0012a) {
                Pair[] pairArr = {new Pair("verified", new r0x(new esa0(l2l0.l(20), l2l0.l(16), 6), new jai(324215589, new zrt(cVar, 2), true)))};
                f0a0 f0a0Var = f0a0.e;
                f0a0Var.getClass();
                g0a0 g0a0Var = new g0a0(f0a0Var);
                pn00.r(g0a0Var, pairArr);
                vy90 d = g0a0Var.e.d();
                f0a0 f0a0Var2 = g0a0Var.b;
                vy90 vy90Var = f0a0Var2.d;
                f0a0 f0a0Var3 = f0a0Var2;
                if (d != vy90Var) {
                    f0a0Var3 = new f0a0(g0a0Var.c, g0a0Var.d, d);
                }
                f0a0 f0a0Var4 = f0a0Var3;
                g0a0Var.b = f0a0Var4;
                M.R(f0a0Var4);
                obj = f0a0Var4;
            }
            e0a0 e0a0Var = (e0a0) obj;
            q630 G = m200.G(q630Var, IntrinsicSize.Min);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
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
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c2 = qri.c(M, aVar4);
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
            k9q0.w(M, d2, cVar2);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f = 80;
            azl azlVar = (azl) M.r(uvi.h);
            Object x2 = M.x();
            if (x2 == c0012a) {
                ImageSize Cb = cVar.b.Cb(azlVar.r0(f * 1.7777778f), true, false);
                x2 = androidx.compose.runtime.k.b(Cb != null ? Cb.d.d : null);
                M.R(x2);
            }
            float f2 = 8;
            r0v0.a(fwu0.l((String) ((wh50) x2).getValue(), null, null, null, M, 0, 62), r18.a((float) 0.5d, wlb0.h(M).getImage().a, hr80.m(rte0.d(sua.d(1.7777778f, txj0.h(aVar4, f), false), vog0.b(f2)), wlb0.h(M).getImage().a, e.a), vog0.b(f2)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 8, 252);
            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Medium;
            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
            ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Overlay;
            String str = cVar.d;
            d.a aVar5 = cVar.e;
            float f3 = kqu0.t;
            rnu0.c(contentBadgeSize, contentBadgeMode, design, ra8.a.b(s200.D(aVar4, f3), dt1.a.j), null, null, str, null, null, null, false, null, false, null, M, 438, 0, 16304);
            M.G();
            f9t.e(txj0.h(aVar4, f3), M, 0);
            yqv0.c(cVar.c, aVar4, wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(M).d0, M, 100663344, 48, 5880);
            f9t.e(txj0.h(aVar4, kqu0.r), M, 0);
            frv0 frv0Var = wlb0.l(M).s0;
            long j = wlb0.h(M).getText().p;
            us2.b bVar2 = new us2.b();
            bVar2.g(aVar5.a);
            if (aVar5.c != null) {
                s0x.a(bVar2, "verified", "�");
            }
            yqv0.d(bVar2.n(), aVar4, j, 0, null, 2, false, 1, null, e0a0Var, frv0Var, M, 100663344, 390, 2808);
            androidx.compose.runtime.a aVar6 = M;
            aVar6.G();
            aVar2 = aVar6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                aVar2 = aVar6;
            }
        } else {
            M.h();
            aVar2 = M;
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new z85(cVar, q630Var, i, 10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if ((r29 & 4) != 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final d dVar, final hxh0 hxh0Var, float f, androidx.compose.runtime.a aVar, final int i, final int i2) {
        float f2;
        int i3;
        int i4;
        androidx.compose.runtime.a aVar2;
        final float f3;
        f s;
        d.b bVar = dVar.a;
        androidx.compose.runtime.a M = aVar.M(-1611910935);
        int i5 = i | (M.J(dVar) ? 4 : 2) | (M.J(hxh0Var) ? 32 : 16);
        if ((i2 & 4) == 0) {
            f2 = f;
            if (M.n(f2)) {
                i3 = 256;
                i4 = i5 | i3;
                if (M.t(i4 & 1, (i4 & 147) == 146)) {
                    aVar2 = M;
                    aVar2.h();
                    f3 = f2;
                } else {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        if ((i2 & 4) != 0) {
                            f2 = kqu0.x;
                            i4 &= -897;
                        }
                        float f4 = f2;
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1611910935, i4, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.SearchPlaylistCard (SearchPlaylistCard.kt:104)");
                        }
                        gzs<s3q0> gzsVar = hxh0Var.a;
                        q630.a aVar3 = q630.a.a;
                        q630 c = ojc.c(aVar3, false, null, null, gzsVar, 15);
                        float f5 = kqu0.w;
                        q630 E = ahn.E(s200.H(c, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, f4, 2), "expandable_playlist_card");
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        ty6.a aVar4 = dt1.a.n;
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
                        int hashCode = Long.hashCode(n34.n(M));
                        sy90 D = M.D();
                        q630 c2 = qri.c(M, E);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar5);
                        } else {
                            M.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(M, a, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(M, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar2 = cri.a.g;
                        k9q0.w(M, valueOf, bVar2);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(M, c2678a);
                        cri.a.d dVar2 = cri.a.d;
                        k9q0.w(M, c2, dVar2);
                        float f6 = kqu0.t;
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f6), aVar4, M, 0);
                        int hashCode2 = Long.hashCode(n34.n(M));
                        sy90 D2 = M.D();
                        q630 c3 = qri.c(M, aVar3);
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar5);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, a2, cVar);
                        k9q0.w(M, D2, eVar);
                        ur.d(hashCode2, M, bVar2, M, c2678a);
                        k9q0.w(M, c3, dVar2);
                        Object x = M.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x == c0012a) {
                            x = i.a(0);
                            M.R(x);
                        }
                        rg50 rg50Var = (rg50) x;
                        boolean J = M.J(dVar.b) | M.o(rg50Var.getIntValue());
                        Object x2 = M.x();
                        if (J || x2 == c0012a) {
                            x2 = bbk0.b(new i5(18, dVar, rg50Var));
                            M.R(x2);
                        }
                        String str = (String) ((mtk0) x2).getValue();
                        long j = dVar.c;
                        String str2 = dVar.e;
                        Object x3 = M.x();
                        if (x3 == c0012a) {
                            x3 = new pb00(rg50Var, 23);
                            M.R(x3);
                        }
                        c(str, j, str2, sv1.z(aVar3, (izs) x3), M, 3072);
                        M.K(-2115092821);
                        d(bVar, hxh0Var.d, hxh0Var.b, M, 0);
                        s3q0 s3q0Var = s3q0.a;
                        M.j();
                        M.G();
                        M.K(1485377511);
                        f9t.e(txj0.h(aVar3, f6), M, 0);
                        M.j();
                        b(dVar.f, dVar.d, hxh0Var.c, hxh0Var.e, M, 6);
                        aVar2 = M;
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        f3 = f4;
                    } else {
                        M.h();
                    }
                }
                s = aVar2.s();
                if (s == null) {
                    s.d = new wzs(hxh0Var, f3, i, i2) { // from class: xsna.nxh0
                        public final /* synthetic */ hxh0 c;
                        public final /* synthetic */ float d;
                        public final /* synthetic */ int e;

                        {
                            this.e = i2;
                        }

                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(1);
                            com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.c.f(com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d.this, this.c, this.d, (androidx.compose.runtime.a) obj, I, this.e);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            f2 = f;
        }
        i3 = 128;
        i4 = i5 | i3;
        if (M.t(i4 & 1, (i4 & 147) == 146)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
