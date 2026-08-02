package com.vk.ecomm.design.compose.product_info;

import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a6;
import xsna.ahn;
import xsna.bap;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.e43;
import xsna.f9t;
import xsna.fwu0;
import xsna.gp;
import xsna.gzs;
import xsna.iah0;
import xsna.ixj0;
import xsna.ja8;
import xsna.k9q0;
import xsna.kqu0;
import xsna.kr;
import xsna.l5g;
import xsna.lg90;
import xsna.n34;
import xsna.ojc;
import xsna.or;
import xsna.pfo;
import xsna.pg90;
import xsna.pzu0;
import xsna.q630;
import xsna.qri;
import xsna.r0v0;
import xsna.r18;
import xsna.r5j0;
import xsna.rte0;
import xsna.rxe0;
import xsna.s200;
import xsna.s3q0;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.ty6;
import xsna.uog0;
import xsna.ur;
import xsna.uxe0;
import xsna.vog0;
import xsna.wlb0;
import xsna.wow;
import xsna.wzs;
import xsna.xcc;
import xsna.xpy;
import xsna.y70;
import xsna.yqv0;
import xsna.yu50;

/* compiled from: MarketProductCardMainInfoRichRating.kt */
/* loaded from: classes18.dex */
public final class e {
    public static final void a(final MarketProductCardMainInfo.b bVar, final List list, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1187826795);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.J(list) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024) | (M.y(gzsVar3) ? 16384 : 8192) | 196608;
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1187826795, i2, -1, "com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfoRichRating (MarketProductCardMainInfoRichRating.kt:53)");
            }
            q630Var2 = q630.a.a;
            q630 f = txj0.f(q630Var2, 1.0f);
            dt1.a.getClass();
            k a = j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 >> 3;
            d(bVar, gzsVar, new xpy(1.0f, true), M, (i2 & 14) | (i3 & 112));
            e(list, gzsVar2, M, (i3 & 14) | ((i2 >> 6) & 112));
            M.G();
            s3q0 s3q0Var = s3q0.a;
            boolean z = (i2 & 57344) == 16384;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new d(gzsVar3, null);
                M.R(x);
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(list, gzsVar, gzsVar2, gzsVar3, q630Var3, i) { // from class: xsna.bb10
                public final /* synthetic */ List c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.ecomm.design.compose.product_info.e.a(MarketProductCardMainInfo.b.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, q630 q630Var, boolean z) {
        androidx.compose.runtime.a M = aVar.M(1816672044);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1816672044, i2, -1, "com.vk.ecomm.design.compose.product_info.Photo (MarketProductCardMainInfoRichRating.kt:180)");
            }
            lg90 l = fwu0.l(str, null, null, null, M, i2 & 14, 62);
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = z ? vog0.b(12) : new xcc(2, 20, xcc.a.e.a, vog0.b(12));
                M.R(x);
            }
            r0v0.a(l, rte0.d(txj0.s(q630Var, 40, 56), (r5j0) x), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 8, 252);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pfo(str, z, q630Var, i);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, List list, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1615886369);
        int i2 = (M.J(list) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1615886369, i2, -1, "com.vk.ecomm.design.compose.product_info.PhotoStack (MarketProductCardMainInfoRichRating.kt:167)");
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
            Iterator a = yu50.a(M, c, cri.a.d, -366050498, list);
            int i3 = 0;
            while (a.hasNext()) {
                Object next = a.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                b(0, M, (String) next, s200.H(q630.a.a, 20 * i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), i3 == list.size() - 1);
                i3 = i4;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a6(list, q630Var, i, 6);
        }
    }

    public static final void d(MarketProductCardMainInfo.b bVar, final gzs gzsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final MarketProductCardMainInfo.b bVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-443163131);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-443163131, i2, -1, "com.vk.ecomm.design.compose.product_info.RatingInfo (MarketProductCardMainInfoRichRating.kt:79)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = vog0.b(12);
                M.R(x);
            }
            uog0 uog0Var = (uog0) x;
            q630 c = ojc.c(r18.a((float) 0.5d, l5g.c(14, wlb0.h(M).m().g, 0.12f), rte0.d(txj0.h(q630Var, 58), uog0Var), uog0Var), false, null, null, gzsVar, 15);
            dt1.a.getClass();
            ty6.b bVar3 = dt1.a.l;
            k a = j.a(androidx.compose.foundation.layout.a.g, bVar3, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            cri.a.b bVar4 = cri.a.g;
            k9q0.w(M, valueOf, bVar4);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            k a2 = j.a(androidx.compose.foundation.layout.a.a, bVar3, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c3 = qri.c(M, aVar4);
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
            ur.d(hashCode2, M, bVar4, M, c2678a);
            k9q0.w(M, c3, dVar);
            String format = String.format("%.1f", Arrays.copyOf(new Object[]{bVar.a}, 1));
            q630 E = ahn.E(aVar4, "main_info_rating_value");
            float f = kqu0.v;
            yqv0.c(format, s200.D(E, f), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).d, M, 0, 0, 8184);
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar4);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, F);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar4, M, c2678a);
            k9q0.w(M, c4, dVar);
            bVar2 = bVar;
            Float f3 = bVar2.a;
            if (f3 != null) {
                f2 = f3.floatValue();
            }
            q630 H = s200.H(ahn.E(aVar4, "main_info_rating_stars"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.p, 7);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(171813404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite16> (VkSdkIcons.kt:840)");
            }
            lg90 b = or.b(M, -1107727797, R.drawable.vk_icon_favorite_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rxe0.c(f2, b, H, false, uxe0.a(uxe0.a.b(M), 0L, wlb0.h(M).getIcon().j, 15), null, M, 64, 40);
            androidx.compose.runtime.a aVar5 = M;
            String str = bVar2.c;
            if (str == null) {
                aVar5.K(474380169);
            } else {
                aVar5.K(474380170);
                yqv0.c(str, ahn.E(aVar4, "main_info_reviews_count"), wlb0.h(aVar5).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar5).l0, aVar5, 48, 0, 8184);
                aVar5 = aVar5;
                s3q0 s3q0Var = s3q0.a;
            }
            aVar5.j();
            if (kr.f(aVar5)) {
                androidx.compose.runtime.b.f(-2338790, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron24> (VkSdkIcons.kt:412)");
            }
            lg90 a4 = pg90.a(R.drawable.vk_icon_chevron_24, 0, aVar5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(a4, null, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), wlb0.h(aVar5).getIcon().n, aVar5, 56, 0);
            aVar2 = aVar5;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            bVar2 = bVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.cb10
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    com.vk.ecomm.design.compose.product_info.e.d(MarketProductCardMainInfo.b.this, gzsVar, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(List list, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(378643781);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(378643781, i2, -1, "com.vk.ecomm.design.compose.product_info.ReviewPhotos (MarketProductCardMainInfoRichRating.kt:144)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                int a = iah0.a(40);
                int a2 = iah0.a(56);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ImageSize imageSize = (ImageSize) ixj0.c(((Image) it.next()).b, a, a2);
                    String str = imageSize != null ? imageSize.d.d : null;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                x = new wow(arrayList);
                M.R(x);
            }
            List<T> list2 = ((wow) x).b;
            if (list2.isEmpty()) {
                M.K(1587681437);
            } else {
                M.K(1593209791);
                q630.a aVar2 = q630.a.a;
                f9t.e(txj0.v(aVar2, 8), M, 6);
                c(0, M, list2, ojc.c(rte0.d(aVar2, vog0.b(12)), false, null, null, gzsVar, 15));
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y70(list, gzsVar, i, 1);
        }
    }
}
