package com.vk.ecomm.design.compose.product_info;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ahn;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.egi0;
import xsna.f870;
import xsna.f9t;
import xsna.frv0;
import xsna.gzs;
import xsna.ir;
import xsna.izs;
import xsna.k9q0;
import xsna.kqu0;
import xsna.l5g;
import xsna.lg90;
import xsna.mq;
import xsna.n34;
import xsna.ojc;
import xsna.pdo0;
import xsna.pg90;
import xsna.pzu0;
import xsna.q630;
import xsna.qri;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.sg50;
import xsna.sw00;
import xsna.sy90;
import xsna.tks;
import xsna.txj0;
import xsna.wuv0;
import xsna.wzs;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zq;

/* compiled from: MarketProductInfoBlockPrice.kt */
/* loaded from: classes18.dex */
public final class h {
    public static final void a(final gzs<s3q0> gzsVar, final String str, final l5g l5gVar, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        gzs<s3q0> gzsVar2;
        int i2;
        String str2;
        frv0 frv0Var;
        long j;
        int i3;
        int i4;
        lg90 a;
        long j2;
        int i5;
        androidx.compose.runtime.a M = aVar.M(1975359816);
        if ((i & 6) == 0) {
            gzsVar2 = gzsVar;
            i2 = (M.y(gzsVar2) ? 4 : 2) | i;
        } else {
            gzsVar2 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(l5gVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1975359816, i2, -1, "com.vk.ecomm.design.compose.product_info.LoyaltyPriceHint (MarketProductInfoBlockPrice.kt:141)");
            }
            dt1.a.getClass();
            k a2 = j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            if (str == null) {
                str2 = zq.a(M, -321121143, R.string.good_price_with_ozon_card, M, 0);
            } else {
                M.K(-321121391);
                M.j();
                str2 = str;
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = ir.h(M);
            }
            q630 b = ojc.b(aVar2, (sg50) x, null, false, null, gzsVar2, 28);
            if (z) {
                M.K(-321110499);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.R;
            } else {
                M.K(-321109158);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.l0;
            }
            M.j();
            frv0 frv0Var2 = frv0Var;
            if (l5gVar == null) {
                M.K(-321107080);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().l;
                M.j();
            } else {
                M.K(-321107979);
                M.j();
                j = l5gVar.a;
            }
            yqv0.c(str2, b, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, M, 0, 0, 8184);
            M = M;
            if (z) {
                M.K(-1364329086);
                mq.d(aVar2, 2, M, 6);
            } else {
                M.K(-1364271550);
                mq.d(aVar2, 4, M, 6);
            }
            if (z) {
                M.K(-321099467);
                if (androidx.compose.runtime.b.d()) {
                    i3 = -1;
                    i5 = 0;
                    androidx.compose.runtime.b.f(-2112191392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron16> (VkSdkIcons.kt:408)");
                } else {
                    i3 = -1;
                    i5 = 0;
                }
                a = pg90.a(R.drawable.vk_icon_chevron_16, i5, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                i3 = -1;
                M.K(-321098635);
                if (androidx.compose.runtime.b.d()) {
                    i4 = 0;
                    androidx.compose.runtime.b.f(1891761752, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron12> (VkSdkIcons.kt:404)");
                } else {
                    i4 = 0;
                }
                a = pg90.a(R.drawable.vk_icon_chevron_12, i4, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            M.j();
            lg90 lg90Var = a;
            if (l5gVar == null) {
                M.K(-321096744);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var2.getText().l;
                M.j();
            } else {
                M.K(-321097643);
                M.j();
                j2 = l5gVar.a;
            }
            pzu0.b(lg90Var, null, null, j2, M, 56, 4);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.bc10
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    com.vk.ecomm.design.compose.product_info.h.a(gzs.this, str, l5gVar, z, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final String str, final boolean z, final int i, final boolean z2, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        frv0 frv0Var;
        q630.a aVar2;
        long j;
        androidx.compose.runtime.a M = aVar.M(160699261);
        if ((i2 & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.l(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.l(z2) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(160699261, i3, -1, "com.vk.ecomm.design.compose.product_info.OldPriceWithDiscount (MarketProductInfoBlockPrice.kt:96)");
            }
            float f = z2 ? 6 : 8;
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.v(aVar3, f), M, 0);
            if (z2) {
                M.K(-186820788);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.P;
            } else {
                M.K(-186819515);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.i0;
            }
            M.j();
            frv0 frv0Var2 = frv0Var;
            if (z2) {
                M.K(-186817303);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = aVar3;
                j = ylu0Var.getText().s;
                M.j();
            } else {
                aVar2 = aVar3;
                M.K(-186816086);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().p;
                M.j();
            }
            float f2 = f;
            q630.a aVar4 = aVar2;
            int i4 = i3;
            yqv0.c(str, aVar4, j, pdo0.d, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, M, (i3 & 14) | 3120, 0, 8176);
            M = M;
            if (z) {
                M.K(-1496200486);
                f9t.e(txj0.v(aVar4, f2), M, 0);
                if (z2) {
                    M.K(-1496138765);
                    String O = d370.O(R.string.ecomm_design_product_discount_temp_new, new Object[]{Integer.valueOf(Math.abs(i))}, M);
                    String O2 = d370.O(R.string.ecomm_design_product_discount_content_description, new Object[]{Integer.valueOf(Math.abs(i))}, M);
                    boolean J = M.J(O2);
                    Object x = M.x();
                    if (J || x == a.C0011a.a) {
                        x = new tks(O2, 1);
                        M.R(x);
                    }
                    q630 b = egi0.b(aVar4, false, (izs) x);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var3.getText().k;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var3 = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(O, b, j2, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var3.P, M, 100663296, 48, 5880);
                    M = M;
                    M.j();
                } else {
                    M.K(-1495434755);
                    sw00.a(i, aVar4, null, M, ((i4 >> 6) & 14) | 48, 4);
                    M.j();
                }
            } else {
                M.K(-1499998203);
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
            s.d = new wzs() { // from class: xsna.cc10
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    com.vk.ecomm.design.compose.product_info.h.b(str, z, i, z2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final MarketProductCardMainInfo.Price price, final l5g l5gVar, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        long j;
        frv0 frv0Var;
        androidx.compose.runtime.a M = aVar.M(-1559365837);
        if ((i & 6) == 0) {
            i2 = (M.J(price) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(l5gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1559365837, i2, -1, "com.vk.ecomm.design.compose.product_info.PriceRow (MarketProductInfoBlockPrice.kt:67)");
            }
            int i3 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(384818693, i3, -1, "com.vk.ecomm.design.compose.product_info.resolvePriceColor (MarketProductInfoBlockPrice.kt:169)");
            }
            if (l5gVar != null) {
                M.K(443581294);
                M.j();
                j = l5gVar.a;
            } else {
                MarketProductCardMainInfo.Price.Type type = price.f;
                if (type == MarketProductCardMainInfo.Price.Type.Loyalty) {
                    M.K(443584625);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getText().l;
                    M.j();
                } else if (type == MarketProductCardMainInfo.Price.Type.Regular) {
                    M.K(443588048);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.getText().m;
                    M.j();
                } else {
                    M.K(443589584);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var3.getText().m;
                    M.j();
                }
            }
            long j2 = j;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            dt1.a.getClass();
            k a = j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 E = ahn.E(aVar2, "main_info_price");
            String str = price.a;
            if (z) {
                M.K(-508887808);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.c;
            } else {
                M.K(-508886475);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.z;
            }
            M.j();
            yqv0.c(str, E, j2, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8184);
            String str2 = price.c;
            if (str2 == null) {
                M.K(1404487629);
            } else {
                M.K(1404487630);
                b(str2, price.d, price.e, z, M, (i2 << 3) & 7168);
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
            s.d = new wzs() { // from class: xsna.ac10
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    com.vk.ecomm.design.compose.product_info.h.c(MarketProductCardMainInfo.Price.this, l5gVar, z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final MarketProductCardMainInfo.Price price, final gzs gzsVar, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(589489090);
        int i2 = i | (M.J(price) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(589489090, i2, -1, "com.vk.ecomm.design.compose.product_info.ProductCardPrice (MarketProductInfoBlockPrice.kt:37)");
            }
            q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 7);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            Integer num = price.h;
            l5g l5gVar = num != null ? new l5g(f870.c(num.intValue())) : null;
            c(price, l5gVar, z, M, i2 & 910);
            if (price.b) {
                M.K(1271775219);
                a(gzsVar, price.g, l5gVar, z, M, ((i2 >> 3) & 14) | ((i2 << 3) & 7168));
            } else {
                M.K(1269814314);
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
            s.d = new wzs(gzsVar, z, q630Var, i) { // from class: xsna.zb10
                public final /* synthetic */ gzs c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.ecomm.design.compose.product_info.h.d(MarketProductCardMainInfo.Price.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
