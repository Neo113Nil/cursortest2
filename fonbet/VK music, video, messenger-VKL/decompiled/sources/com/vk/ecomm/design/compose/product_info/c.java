package com.vk.ecomm.design.compose.product_info;

import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.ahn;
import xsna.cri;
import xsna.dt1;
import xsna.epx;
import xsna.frv0;
import xsna.gzs;
import xsna.ir;
import xsna.k9q0;
import xsna.kqu0;
import xsna.lg90;
import xsna.n34;
import xsna.ojc;
import xsna.or;
import xsna.q630;
import xsna.qri;
import xsna.rrv0;
import xsna.rxe0;
import xsna.s200;
import xsna.sg50;
import xsna.sy90;
import xsna.txj0;
import xsna.uxe0;
import xsna.wuv0;
import xsna.wzs;
import xsna.ylu0;
import xsna.yqv0;

/* compiled from: MarketProductCardMainInfoRating.kt */
/* loaded from: classes18.dex */
public final class c {
    public static final void a(final MarketProductCardMainInfo.b bVar, final gzs gzsVar, final boolean z, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        Float f;
        String str;
        int i2;
        int i3;
        float f2;
        String str2;
        Float f3 = bVar.a;
        androidx.compose.runtime.a M = aVar.M(2050762273);
        int i4 = i | (M.J(bVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | 3072;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2050762273, i4, -1, "com.vk.ecomm.design.compose.product_info.ProductCardMainInfoRating (MarketProductCardMainInfoRating.kt:26)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = ir.h(M);
            }
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.q, 1, txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 25, 1, s200.H(ojc.b(aVar3, (sg50) x, null, z, null, gzsVar, 24), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13))), "main_info_rating");
            dt1.a.getClass();
            k a = j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (epx.d(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || bVar.b == null) {
                f = f3;
                str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                i2 = -1;
                i3 = 0;
                f2 = 0.0f;
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                M.K(46107325);
            } else {
                M.K(47875224);
                String format = String.format("%.1f", Arrays.copyOf(new Object[]{f3}, 1));
                q630 H = s200.H(ahn.E(aVar3, "main_info_rating_value"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().m;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                f2 = 0.0f;
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i3 = 0;
                f = f3;
                i2 = -1;
                yqv0.c(format, H, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.l0, M, 0, 0, 8184);
                M = M;
            }
            M.j();
            float floatValue = f != null ? f.floatValue() : f2;
            q630 E2 = ahn.E(aVar3, "main_info_rating_stars");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(171813404, i3, i2, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite16> (VkSdkIcons.kt:840)");
            }
            lg90 b = or.b(M, -1107727797, R.drawable.vk_icon_favorite_16, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rxe0.c(floatValue, b, E2, false, uxe0.a.b(M), null, M, 448, 40);
            String str3 = bVar.c;
            if (str3 == null) {
                M.K(48566771);
                M.j();
                aVar2 = M;
            } else {
                M.K(48566772);
                q630 H2 = s200.H(ahn.E(aVar3, "main_info_reviews_count"), kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, i3, i2, str);
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var2.i0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i3, i2, str2);
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.c(str3, H2, ylu0Var2.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8184);
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(gzsVar, z, q630Var2, i) { // from class: xsna.ab10
                public final /* synthetic */ gzs c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.ecomm.design.compose.product_info.c.a(MarketProductCardMainInfo.b.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
