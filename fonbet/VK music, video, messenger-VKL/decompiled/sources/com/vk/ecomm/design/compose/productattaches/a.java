package com.vk.ecomm.design.compose.productattaches;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.a0t;
import xsna.ahn;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.fwu0;
import xsna.hr80;
import xsna.ixj0;
import xsna.iyk0;
import xsna.ja8;
import xsna.jwx;
import xsna.k1p;
import xsna.k9q0;
import xsna.kai;
import xsna.lg90;
import xsna.n34;
import xsna.or;
import xsna.pzu0;
import xsna.q630;
import xsna.qow;
import xsna.qri;
import xsna.r18;
import xsna.ra8;
import xsna.rrv0;
import xsna.rte0;
import xsna.s3q0;
import xsna.sy90;
import xsna.txj0;
import xsna.ty6;
import xsna.uxn;
import xsna.vog0;
import xsna.wh50;
import xsna.wkj;
import xsna.y61;
import xsna.ylu0;
import xsna.zak0;

/* compiled from: ImageContent.kt */
/* loaded from: classes18.dex */
public final class a {
    public final wh50 a;
    public final wh50 b;
    public final q630 c;

    public a(Image image, boolean z) {
        this.a = k.b(image != null ? new ProductVideoAttach.b(image) : null);
        this.b = k.b(Boolean.valueOf(z));
        this.c = ahn.E(q630.a.a, "image");
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        a aVar2;
        androidx.compose.runtime.a M = aVar.M(114834495);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(114834495, i2, -1, "com.vk.ecomm.design.compose.productattaches.ImageContent.Content (ImageContent.kt:49)");
            }
            float f = 8;
            q630 d = rte0.d(txj0.q(q630Var, 56), vog0.b(f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getImage().b, e.a);
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 a = r18.a(f2, ylu0Var2.getImage().a, m, vog0.b(f));
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            s3q0 s3q0Var = null;
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ProductVideoAttach.b bVar = (ProductVideoAttach.b) ((zak0) this.a).getValue();
            Image image = bVar != null ? bVar.a : null;
            if (image == null) {
                image = null;
            }
            q630.a aVar4 = q630.a.a;
            ra8 ra8Var = ra8.a;
            if (image == null) {
                M.K(-571665400);
                M.j();
                aVar2 = this;
            } else {
                ArrayList arrayList = image.b;
                M.K(-571665399);
                wh50 wh50Var = this.b;
                String n = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue() ? ixj0.n(arrayList) : ixj0.h(arrayList);
                if (arrayList.isEmpty() || n == null || n.length() == 0) {
                    aVar2 = this;
                    M.K(-17830153);
                    b(ra8Var.b(aVar4, ty6Var), M, i2 & 112);
                    M.j();
                } else {
                    M.K(-552641958);
                    boolean booleanValue = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
                    aVar2 = this;
                    aVar2.c((i2 << 6) & 7168, M, n, this.c, booleanValue);
                    M.j();
                }
                M.j();
                s3q0Var = s3q0.a;
            }
            if (s3q0Var == null) {
                M.K(-571268134);
                b(ra8Var.b(aVar4, ty6Var).g(aVar2.c), M, i2 & 112);
                M.j();
            } else {
                M.K(397200910);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new y61(this, q630Var, i, 6);
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(759541841);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(759541841, i2, -1, "com.vk.ecomm.design.compose.productattaches.ImageContent.EmptyImageContent (ImageContent.kt:79)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2102857096, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MarketOutline28> (VkSdkIcons.kt:2496)");
            }
            lg90 b = or.b(M, 177409129, R.drawable.vk_icon_market_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var;
            pzu0.b(b, null, q630Var2, ylu0Var.getIcon().n, M, 56 | ((i2 << 6) & 896), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new uxn(this, q630Var2, i, 1);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar, String str, q630 q630Var, final boolean z) {
        int i2;
        q630 q630Var2;
        qow qowVar;
        androidx.compose.runtime.a M = aVar.M(-1266496877);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 32 : 16;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1266496877, i2, -1, "com.vk.ecomm.design.compose.productattaches.ImageContent.ProductImage (ImageContent.kt:93)");
            }
            if (z) {
                M.K(1079432791);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    qow qowVar2 = new qow(new jwx(2, 8));
                    M.R(qowVar2);
                    x = qowVar2;
                }
                T t = ((qow) x).a;
                M.j();
                qowVar = new qow(t);
            } else {
                M.K(1079523434);
                M.j();
                qowVar = null;
            }
            fwu0.c(q630Var2, str, null, null, null, null, qowVar, kai.c(926223908, new a0t() { // from class: xsna.nhw
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    qa8 qa8Var = (qa8) obj;
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar2.J(qa8Var) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 384) == 0) {
                        i3 |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 1155) != 1154)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(926223908, i3, -1, "com.vk.ecomm.design.compose.productattaches.ImageContent.ProductImage.<anonymous> (ImageContent.kt:103)");
                        }
                        Object x2 = aVar2.x();
                        if (x2 == a.C0011a.a) {
                            Context context = e43.a;
                            if (context == null) {
                                context = null;
                            }
                            x2 = l52.a(new PorterDuffColorFilter(context.getColor(R.color.vk_black_alpha05), PorterDuff.Mode.SRC_OVER));
                            aVar2.R(x2);
                        }
                        dt1.a.getClass();
                        ty6 ty6Var = dt1.a.f;
                        q630.a aVar3 = q630.a.a;
                        vjw.a(lg90Var, null, qa8Var.b(aVar3, ty6Var), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (d6g) x2, aVar2, 1597496 | ((i3 >> 6) & 14), 40);
                        if (z) {
                            aVar2.K(-2027833193);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1573898770, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-HideOutlineShadowMedium48> (VkSdkIcons.kt:1062)");
                            }
                            lg90 a = pg90.a(R.drawable.vk_icon_hide_outline_shadow_medium_48, 0, aVar2);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            pzu0.b(a, null, qa8Var.b(txj0.q(aVar3, 48), ty6Var), ylu0Var.getIcon().c, aVar2, 56, 0);
                        } else {
                            aVar2.K(-2032110914);
                        }
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 3) & 14) | 100663296 | ((i2 << 3) & 112), 188);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new k1p(this, str, q630Var, z, i);
        }
    }
}
