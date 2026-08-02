package com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.b;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.movika.sdk.base.logic.interactor.c;
import com.vk.movika.sdk.base.ui.r;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.ad2;
import xsna.bhu0;
import xsna.bu00;
import xsna.c4r;
import xsna.cri;
import xsna.dd80;
import xsna.dt1;
import xsna.f9t;
import xsna.fwu0;
import xsna.gp;
import xsna.gzs;
import xsna.hg2;
import xsna.hr80;
import xsna.izs;
import xsna.jgh0;
import xsna.jmi;
import xsna.k9q0;
import xsna.kqu0;
import xsna.m200;
import xsna.mtk0;
import xsna.n34;
import xsna.ojc;
import xsna.p490;
import xsna.q630;
import xsna.qri;
import xsna.r0v0;
import xsna.r8a0;
import xsna.rdu;
import xsna.rte0;
import xsna.s200;
import xsna.s3q0;
import xsna.sua;
import xsna.sy90;
import xsna.txj0;
import xsna.ty6;
import xsna.ur;
import xsna.vog0;
import xsna.wlb0;
import xsna.yqv0;
import xsna.yu70;
import xsna.yzs;

/* compiled from: SectionNavigationLinksCard.kt */
/* loaded from: classes16.dex */
public final class a {
    public static final void a(ArrayList arrayList, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1206685877);
        if ((i & 6) == 0) {
            i2 = (M.J(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1206685877, i4, -1, "com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.LinksList (SectionNavigationLinksCard.kt:111)");
            }
            jgh0 x = p490.x(M);
            mtk0 b = hg2.b(x.e() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 0, 30);
            Object x2 = M.x();
            Object obj = a.C0011a.a;
            if (x2 == obj) {
                x2 = new jmi(2);
                M.R(x2);
            }
            q630.a aVar2 = q630.a.a;
            q630 i5 = dd80.i(aVar2, (yzs) x2);
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = new c4r(29);
                M.R(x3);
            }
            q630 a = rdu.a(i5, (izs) x3);
            boolean J = M.J(b);
            Object x4 = M.x();
            if (J || x4 == obj) {
                x4 = new r8a0(b, 16);
                M.R(x4);
            }
            q630 r = p490.r(bu00.f(a, (izs) x4), x, 14);
            float f = kqu0.t;
            q630 H = s200.H(r, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.w + kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            k a2 = j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            M.K(390571040);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b.a aVar4 = (b.a) it.next();
                q630 G = m200.G(aVar2, IntrinsicSize.Max);
                ButtonSize buttonSize = ButtonSize.Small;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                q630.a aVar5 = aVar2;
                ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                String str = aVar4.a;
                boolean J2 = ((i4 & 112) == i3) | M.J(aVar4);
                Object x5 = M.x();
                if (J2 || x5 == obj) {
                    x5 = new c(23, izsVar, aVar4);
                    M.R(x5);
                }
                androidx.compose.runtime.a aVar6 = M;
                bhu0.e((gzs) x5, buttonSize, buttonStyle, buttonAppearance, G, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, aVar6, 28080, 0, 0, 4190176);
                M = aVar6;
                obj = obj;
                aVar2 = aVar5;
                i3 = 32;
                i4 = i4;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ad2(arrayList, izsVar, i, 4);
        }
    }

    public static final void b(b bVar, izs<? super b.a, s3q0> izsVar, izs<? super b.a, s3q0> izsVar2, androidx.compose.runtime.a aVar, int i) {
        izs<? super b.a, s3q0> izsVar3 = izsVar2;
        androidx.compose.runtime.a M = aVar.M(-1072047038);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar3) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1072047038, i2, -1, "com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.SectionNavigationLinksCard (SectionNavigationLinksCard.kt:50)");
            }
            long j = wlb0.h(M).getBackground().z;
            e.a aVar2 = e.a;
            q630.a aVar3 = q630.a.a;
            q630 m = hr80.m(aVar3, j, aVar2);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new r(15, izsVar, bVar);
                M.R(x);
            }
            q630 c = ojc.c(m, false, null, null, (gzs) x, 15);
            float f = kqu0.v;
            q630 u = m200.u(s200.E(c, kqu0.w, f), IntrinsicSize.Min);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, u);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
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
            k9q0.w(M, c2, dVar);
            r0v0.a(fwu0.l(null, bVar.c, null, null, M, 0, 61), sua.d(1.0f, txj0.c(rte0.d(aVar3, vog0.b(10)), 1.0f), false), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 8, 252);
            f9t.e(txj0.v(aVar3, f), M, 0);
            q630 c3 = txj0.c(aVar3, 1.0f);
            a.h hVar = androidx.compose.foundation.layout.a.g;
            ty6.a aVar5 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(hVar, aVar5, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c4 = qri.c(M, c3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c4, dVar);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar5, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c5 = qri.c(M, aVar3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar2, M, c2678a);
            k9q0.w(M, c5, dVar);
            yqv0.c(bVar.a, null, wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).p, M, 100663296, 48, 5882);
            f9t.e(txj0.h(aVar3, kqu0.q), M, 0);
            yqv0.c(bVar.b, null, wlb0.h(M).getText().r, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).s0, M, 100663296, 48, 5882);
            M = M;
            M.G();
            f9t.e(txj0.h(aVar3, f), M, 0);
            izsVar3 = izsVar2;
            a(bVar.e, izsVar3, M, (i2 >> 3) & 112);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new yu70(bVar, izsVar, izsVar3, i, 1);
        }
    }
}
