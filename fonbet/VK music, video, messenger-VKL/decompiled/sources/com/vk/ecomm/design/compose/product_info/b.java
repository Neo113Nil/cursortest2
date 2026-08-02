package com.vk.ecomm.design.compose.product_info;

import android.util.TypedValue;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import java.util.Iterator;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.ahn;
import xsna.cri;
import xsna.dhr0;
import xsna.dt1;
import xsna.ely;
import xsna.epx;
import xsna.f870;
import xsna.fwu0;
import xsna.gp;
import xsna.gzs;
import xsna.ir;
import xsna.izs;
import xsna.k9q0;
import xsna.kqu0;
import xsna.krv0;
import xsna.l5g;
import xsna.lg90;
import xsna.n34;
import xsna.ojc;
import xsna.p490;
import xsna.pco;
import xsna.pg90;
import xsna.q630;
import xsna.qri;
import xsna.rnu0;
import xsna.s200;
import xsna.sg50;
import xsna.sy90;
import xsna.uh3;
import xsna.wh50;
import xsna.wzs;
import xsna.yu50;

/* compiled from: MarketProductCardLabelsRow.kt */
/* loaded from: classes18.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, final List list, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        int i2;
        MarketProductCardMainInfo.a aVar3;
        lg90 l;
        lg90 lg90Var;
        Object obj;
        lg90 lg90Var2;
        l5g l5gVar;
        q630.a aVar4 = q630.a.a;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        androidx.compose.runtime.a M = aVar.M(-1999350591);
        int i3 = i | (M.l(z) ? 4 : 2) | (M.J(list) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | 3072;
        int i4 = 0;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1999350591, i3, -1, "com.vk.ecomm.design.compose.product_info.ProductCardLabelsRow (MarketProductCardLabelsRow.kt:34)");
            }
            Object x = M.x();
            Object obj2 = x;
            if (x == c0012a) {
                TypedValue typedValue = krv0.a;
                wh50 b = k.b(Boolean.valueOf(epx.f(krv0.i(krv0.b != null ? dhr0.E() : null), Boolean.FALSE)));
                M.R(b);
                obj2 = b;
            }
            wh50 wh50Var = (wh50) obj2;
            q630 E = ahn.E(aVar4, "main_info_labels_list");
            float f = kqu0.s;
            q630 r = p490.r(s200.H(E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), p490.x(M), 14);
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, r);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a2 = yu50.a(M, c, cri.a.d, 142388128, list);
            androidx.compose.runtime.a aVar6 = M;
            while (a2.hasNext()) {
                MarketProductCardMainInfo.a aVar7 = (MarketProductCardMainInfo.a) a2.next();
                Object x2 = aVar6.x();
                Object obj3 = x2;
                if (x2 == c0012a) {
                    obj3 = ir.h(aVar6);
                }
                sg50 sg50Var = (sg50) obj3;
                ely elyVar = aVar7.c;
                if (elyVar == null) {
                    aVar6.K(12025783);
                    aVar6.j();
                    aVar3 = aVar7;
                    i2 = i4;
                    l = null;
                } else {
                    aVar6.K(12025784);
                    i2 = i4;
                    aVar3 = aVar7;
                    l = fwu0.l(((Boolean) wh50Var.getValue()).booleanValue() ? elyVar.a : elyVar.b, null, null, null, aVar6, 0, 62);
                    aVar6.j();
                }
                if (l == null) {
                    aVar6.K(12178087);
                    Integer num = aVar3.b;
                    if (num == null) {
                        aVar6.K(12178086);
                        aVar6.j();
                        l = null;
                    } else {
                        aVar6.K(12178087);
                        l = pg90.a(num.intValue(), i2, aVar6);
                        aVar6.j();
                    }
                    aVar6.j();
                } else {
                    aVar6.K(1662955433);
                    aVar6.j();
                }
                if (aVar3.f != null) {
                    aVar6.K(1662964099);
                    lg90Var = pg90.a(aVar3.f.intValue(), i2, aVar6);
                    aVar6.j();
                } else {
                    aVar6.K(12319229);
                    aVar6.j();
                    lg90Var = null;
                }
                q630 E2 = ahn.E(aVar4, "main_info_label_badge");
                int i5 = ((i3 & 896) == 256 ? 1 : i2) | (aVar6.J(aVar3) ? 1 : 0);
                Object x3 = aVar6.x();
                if (i5 != 0 || x3 == c0012a) {
                    uh3 uh3Var = new uh3(16, izsVar, aVar3);
                    aVar6.R(uh3Var);
                    obj = uh3Var;
                } else {
                    obj = x3;
                }
                q630 b2 = ojc.b(E2, sg50Var, null, false, null, (gzs) obj, 28);
                String str = aVar3.g;
                ContentBadgeAppearance.Design design = z ? ContentBadgeAppearance.Design.Neutral : ContentBadgeAppearance.Design.Accent;
                lg90 lg90Var3 = lg90Var;
                ContentBadgeMode contentBadgeMode = ContentBadgeMode.Secondary;
                androidx.compose.runtime.a aVar8 = aVar6;
                lg90 lg90Var4 = l;
                ContentBadgeSize contentBadgeSize = ContentBadgeSize.Large;
                if (aVar3.d) {
                    Integer num2 = aVar3.e;
                    if (num2 != null) {
                        lg90Var2 = lg90Var4;
                        l5gVar = new l5g(f870.c(krv0.l(num2.intValue())));
                    } else {
                        lg90Var2 = lg90Var4;
                        l5gVar = null;
                    }
                } else {
                    lg90Var2 = lg90Var4;
                    l5gVar = new l5g(l5g.k);
                }
                rnu0.c(contentBadgeSize, contentBadgeMode, design, b2, lg90Var2, l5gVar, str, null, lg90Var3, null, false, new pco(12), true, null, aVar8, 134250550, Tensorflow.FRAME_WIDTH, 9856);
                aVar6 = aVar8;
                i3 = i3;
                i4 = i2;
            }
            if (gp.d(aVar6)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
            aVar2 = aVar6;
        } else {
            M.h();
            q630Var2 = q630Var;
            aVar2 = M;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(z, list, izsVar, q630Var2, i) { // from class: xsna.za10
                public final /* synthetic */ boolean b;
                public final /* synthetic */ List c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int I = ne7.I(1);
                    com.vk.ecomm.design.compose.product_info.b.a(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj4, I);
                    return s3q0.a;
                }
            };
        }
    }
}
