package com.vk.ecomm.design.compose.product_info;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ahn;
import xsna.cc1;
import xsna.cf4;
import xsna.cri;
import xsna.db10;
import xsna.ddn;
import xsna.dt1;
import xsna.f9t;
import xsna.gzs;
import xsna.ir;
import xsna.izs;
import xsna.k9q0;
import xsna.kqu0;
import xsna.lb6;
import xsna.lg90;
import xsna.mlg0;
import xsna.mse;
import xsna.n34;
import xsna.nhf;
import xsna.ojc;
import xsna.pg90;
import xsna.pzu0;
import xsna.q630;
import xsna.qer0;
import xsna.qri;
import xsna.qzu0;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.sg50;
import xsna.sy90;
import xsna.szw;
import xsna.th2;
import xsna.txj0;
import xsna.ubh;
import xsna.ur;
import xsna.wow;
import xsna.wuv0;
import xsna.wzs;
import xsna.xmd;
import xsna.xpy;
import xsna.y310;
import xsna.ybr;
import xsna.ylu0;
import xsna.zq;

/* compiled from: MarketProductInfoBlock.kt */
/* loaded from: classes18.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(MarketProductCardMainInfo marketProductCardMainInfo, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        MarketProductCardMainInfo.b bVar;
        int i4;
        int i5;
        a.C0011a.C0012a c0012a;
        Integer num;
        List list = marketProductCardMainInfo.g;
        MarketProductCardMainInfo.b bVar2 = marketProductCardMainInfo.d;
        boolean z = marketProductCardMainInfo.h;
        androidx.compose.runtime.a M = aVar.M(110465899);
        int i6 = (M.J(marketProductCardMainInfo) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i6 & 1, (i6 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(110465899, i6, -1, "com.vk.ecomm.design.compose.product_info.MarketProductInfoBlock (MarketProductInfoBlock.kt:34)");
            }
            float f = kqu0.w;
            q630 E = s200.E(q630Var, f, f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630.a aVar3 = q630.a.a;
            q630 f2 = txj0.f(aVar3, 1.0f);
            k a2 = j.a(androidx.compose.foundation.layout.a.g, dt1.a.l, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar3, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean z2 = marketProductCardMainInfo.h;
            MarketProductCardMainInfo.Price price = marketProductCardMainInfo.a;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            int i7 = i6 & 112;
            boolean z3 = i7 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z3 || x == c0012a2) {
                x = new th2(izsVar, 3);
                M.R(x);
            }
            h.d(price, (gzs) x, z2, xpyVar, M, 0);
            androidx.compose.runtime.a aVar4 = M;
            boolean z4 = marketProductCardMainInfo.e;
            boolean z5 = i7 == 32;
            Object x2 = aVar4.x();
            if (z5 || x2 == c0012a2) {
                x2 = new mse(izsVar, 3);
                aVar4.R(x2);
            }
            b(z4, (gzs) x2, aVar4, 0);
            aVar4.G();
            wow wowVar = list != null ? new wow(list) : null;
            if (wowVar == null || wowVar.b.isEmpty()) {
                i2 = 1716256557;
                aVar4.K(1716256557);
            } else {
                aVar4.K(1718672356);
                if (marketProductCardMainInfo.j) {
                    aVar4.K(1718706983);
                    boolean z6 = i7 == 32;
                    Object x3 = aVar4.x();
                    if (z6 || x3 == c0012a2) {
                        x3 = new ybr(izsVar, 1);
                        aVar4.R(x3);
                    }
                    a.b(0, aVar4, list, (izs) x3, null);
                    aVar4.j();
                    i2 = 1716256557;
                } else {
                    aVar4.K(1718974761);
                    boolean z7 = marketProductCardMainInfo.h;
                    List list2 = marketProductCardMainInfo.g;
                    boolean z8 = i7 == 32;
                    Object x4 = aVar4.x();
                    if (z8 || x4 == c0012a2) {
                        x4 = new y310(izsVar, 1);
                        aVar4.R(x4);
                    }
                    i2 = 1716256557;
                    b.a(z7, list2, (izs) x4, null, aVar4, 0);
                    aVar4 = aVar4;
                    aVar4.j();
                }
            }
            aVar4.j();
            if (z) {
                aVar4.K(i2);
            } else {
                aVar4.K(1719353984);
                String str = marketProductCardMainInfo.b;
                String str2 = marketProductCardMainInfo.c;
                q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.a aVar5 = aVar4;
                db10.a(str, str2, wuv0Var.I, H, aVar5, 0);
                aVar4 = aVar5;
            }
            aVar4.j();
            if (z) {
                i3 = 0;
                M = aVar4;
                bVar = bVar2;
                i4 = 4;
                i5 = 1;
                c0012a = c0012a2;
                M.K(i2);
            } else {
                aVar4.K(-1745640045);
                if (bVar2 == null) {
                    aVar4.K(1719768701);
                    aVar4.j();
                    i3 = 0;
                    M = aVar4;
                    bVar = bVar2;
                    i4 = 4;
                    i5 = 1;
                    c0012a = c0012a2;
                } else {
                    aVar4.K(1719768702);
                    boolean z9 = i7 == 32;
                    Object x5 = aVar4.x();
                    if (z9 || x5 == c0012a2) {
                        x5 = new cc1(izsVar, 5);
                        aVar4.R(x5);
                    }
                    i3 = 0;
                    M = aVar4;
                    i4 = 4;
                    i5 = 1;
                    c0012a = c0012a2;
                    bVar = bVar2;
                    c.a(bVar, (gzs) x5, marketProductCardMainInfo.f, null, M, 0);
                    s3q0 s3q0Var = s3q0.a;
                    M.j();
                }
            }
            M.j();
            int i8 = (i6 & 14) == i4 ? i5 : i3;
            Object x6 = M.x();
            if (i8 != 0 || x6 == c0012a) {
                x6 = Boolean.valueOf((z && marketProductCardMainInfo.i.equals(Boolean.FALSE) && (((bVar == null || (num = bVar.b) == null) ? i3 : num.intValue()) > 0 ? i5 : i3) != 0) ? i5 : i3);
                M.R(x6);
            }
            if (((Boolean) x6).booleanValue()) {
                M.K(1720224278);
                c(marketProductCardMainInfo, izsVar, M, i6 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            } else {
                M.K(i2);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xmd(marketProductCardMainInfo, izsVar, q630Var, i);
        }
    }

    public static final void b(final boolean z, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i) {
        lg90 a;
        androidx.compose.runtime.a M = aVar.M(1865245888);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1865245888, i2, -1, "com.vk.ecomm.design.compose.product_info.ProductCardBookmarkButton (MarketProductInfoBlock.kt:147)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            if (z) {
                M.K(1499942639);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(823590454, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BookmarkCheck28> (VkIcons.kt:768)");
                }
                a = pg90.a(R.drawable.vk_icon_bookmark_check_28, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.K(1499943572);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1017860738, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BookmarkAddOutline28> (VkIcons.kt:764)");
                }
                a = pg90.a(R.drawable.vk_icon_bookmark_add_outline_28, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            M.j();
            String a2 = z ? zq.a(M, -746324298, R.string.market_remove_from_faves, M, 0) : zq.a(M, -746243109, R.string.market_add_to_faves, M, 0);
            mlg0 a3 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, false);
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new cf4(2, gzsVar);
                M.R(x2);
            }
            q630 E = ahn.E(ojc.b(q630.a.a, sg50Var, a3, false, null, (gzs) x2, 28), "main_info_fave_button");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(a, a2, E, ylu0Var.getIcon().b, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, gzsVar, z) { // from class: xsna.yb10
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gzs c;

                {
                    this.b = z;
                    this.c = gzsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.ecomm.design.compose.product_info.g.b(this.b, this.c, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(MarketProductCardMainInfo marketProductCardMainInfo, izs<? super f, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1417026096);
        if ((i & 6) == 0) {
            i2 = (M.J(marketProductCardMainInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1417026096, i2, -1, "com.vk.ecomm.design.compose.product_info.RichRatingBlock (MarketProductInfoBlock.kt:116)");
            }
            f9t.e(txj0.h(q630.a.a, kqu0.w), M, 0);
            MarketProductCardMainInfo.b bVar = marketProductCardMainInfo.d;
            List<Image> list = marketProductCardMainInfo.l;
            if (bVar == null) {
                M.K(609351230);
            } else {
                M.K(609351231);
                boolean J = M.J(list);
                Object x = M.x();
                Object obj = a.C0011a.a;
                if (J || x == obj) {
                    x = new wow(list);
                    M.R(x);
                }
                List<T> list2 = ((wow) x).b;
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object x2 = M.x();
                if (z || x2 == obj) {
                    x2 = new ddn(izsVar, 3);
                    M.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                boolean z2 = ((i2 & 14) == 4) | (i3 == 32);
                Object x3 = M.x();
                if (z2 || x3 == obj) {
                    x3 = new lb6(16, izsVar, marketProductCardMainInfo);
                    M.R(x3);
                }
                gzs gzsVar2 = (gzs) x3;
                boolean z3 = i3 == 32;
                Object x4 = M.x();
                if (z3 || x4 == obj) {
                    x4 = new nhf(izsVar, 4);
                    M.R(x4);
                }
                e.a(bVar, list2, gzsVar, gzsVar2, (gzs) x4, null, M, 0);
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
            s.d = new ubh(marketProductCardMainInfo, izsVar, i, 4);
        }
    }
}
