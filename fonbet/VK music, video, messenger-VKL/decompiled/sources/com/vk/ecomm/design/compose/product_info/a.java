package com.vk.ecomm.design.compose.product_info;

import android.util.TypedValue;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.ahn;
import xsna.cri;
import xsna.dhr0;
import xsna.dt1;
import xsna.e43;
import xsna.ely;
import xsna.epx;
import xsna.f870;
import xsna.fwu0;
import xsna.ge0;
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
import xsna.wh50;
import xsna.wzs;
import xsna.xa10;

/* compiled from: MarketProductCardLabelsRedesignTwoRow.kt */
/* loaded from: classes18.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b7, code lost:
    
        if (r11 == r27) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ArrayList arrayList, final izs izsVar, final boolean z, final String str, androidx.compose.runtime.a aVar, final int i) {
        ArrayList arrayList2;
        int i2;
        androidx.compose.runtime.a aVar2;
        Integer num;
        MarketProductCardMainInfo.a aVar3;
        a.C0011a.C0012a c0012a;
        lg90 l;
        lg90 lg90Var;
        Object obj;
        q630.a aVar4;
        l5g l5gVar;
        androidx.compose.runtime.a M = aVar.M(1744444747);
        if ((i & 6) == 0) {
            arrayList2 = arrayList;
            i2 = (M.J(arrayList2) ? 4 : 2) | i;
        } else {
            arrayList2 = arrayList;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(str) ? 2048 : 1024;
        }
        int i3 = i2;
        int i4 = 0;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1744444747, i3, -1, "com.vk.ecomm.design.compose.product_info.LabelsRow (MarketProductCardLabelsRedesignTwoRow.kt:83)");
            }
            q630.a aVar5 = q630.a.a;
            q630 r = p490.r(ahn.E(aVar5, str), p490.x(M), 14);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.s);
            dt1.a.getClass();
            k a = j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, r);
            cri.h7.getClass();
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(1286508619);
            Iterator it = arrayList2.iterator();
            androidx.compose.runtime.a aVar7 = M;
            while (it.hasNext()) {
                MarketProductCardMainInfo.a aVar8 = (MarketProductCardMainInfo.a) it.next();
                Object x = aVar7.x();
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                Object obj2 = x;
                if (x == c0012a2) {
                    obj2 = ir.h(aVar7);
                }
                sg50 sg50Var = (sg50) obj2;
                ely elyVar = aVar8.c;
                Integer num2 = aVar8.f;
                if (elyVar == null) {
                    aVar7.K(1968918348);
                    aVar7.j();
                    aVar3 = aVar8;
                    c0012a = c0012a2;
                    num = num2;
                    l = null;
                } else {
                    aVar7.K(1968918349);
                    num = num2;
                    aVar3 = aVar8;
                    c0012a = c0012a2;
                    l = fwu0.l(z ? elyVar.a : elyVar.b, null, null, null, aVar7, 0, 62);
                    aVar7.j();
                }
                if (l == null) {
                    aVar7.K(1969071613);
                    Integer num3 = aVar3.b;
                    if (num3 == null) {
                        aVar7.K(1969071612);
                        aVar7.j();
                        l = null;
                    } else {
                        aVar7.K(1969071613);
                        l = pg90.a(num3.intValue(), i4, aVar7);
                        aVar7.j();
                    }
                    aVar7.j();
                } else {
                    aVar7.K(2141722996);
                    aVar7.j();
                }
                if (num != null) {
                    aVar7.K(2141731693);
                    lg90Var = pg90.a(num.intValue(), i4, aVar7);
                    aVar7.j();
                } else {
                    aVar7.K(1969212755);
                    aVar7.j();
                    lg90Var = null;
                }
                q630 E = ahn.E(aVar5, "main_info_label_badge");
                int i5 = ((i3 & 112) == 32 ? 1 : i4) | (aVar7.J(aVar3) ? 1 : 0);
                Object x2 = aVar7.x();
                if (i5 == 0) {
                    obj = x2;
                }
                ge0 ge0Var = new ge0(10, izsVar, aVar3);
                aVar7.R(ge0Var);
                obj = ge0Var;
                q630 b = ojc.b(E, sg50Var, null, false, null, (gzs) obj, 28);
                String str2 = aVar3.g;
                ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Neutral;
                int i6 = i3;
                lg90 lg90Var2 = lg90Var;
                ContentBadgeMode contentBadgeMode = ContentBadgeMode.Secondary;
                androidx.compose.runtime.a aVar9 = aVar7;
                lg90 lg90Var3 = l;
                ContentBadgeSize contentBadgeSize = ContentBadgeSize.Large;
                if (aVar3.d) {
                    Integer num4 = aVar3.e;
                    if (num4 != null) {
                        aVar4 = aVar5;
                        l5gVar = new l5g(f870.c(krv0.l(num4.intValue())));
                    } else {
                        aVar4 = aVar5;
                        l5gVar = null;
                    }
                } else {
                    aVar4 = aVar5;
                    l5gVar = new l5g(l5g.k);
                }
                rnu0.c(contentBadgeSize, contentBadgeMode, design, b, lg90Var3, l5gVar, str2, null, lg90Var2, null, false, new pco(12), true, null, aVar9, 134250934, Tensorflow.FRAME_WIDTH, 9856);
                i3 = i6;
                aVar7 = aVar9;
                aVar5 = aVar4;
                i4 = i4;
            }
            boolean d = gp.d(aVar7);
            aVar2 = aVar7;
            if (d) {
                androidx.compose.runtime.b.e();
                aVar2 = aVar7;
            }
        } else {
            M.h();
            aVar2 = M;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ya10
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    com.vk.ecomm.design.compose.product_info.a.a(arrayList, izsVar, z, str, (androidx.compose.runtime.a) obj3, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(682137195);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            q630Var2 = q630.a.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(682137195, i2, -1, "com.vk.ecomm.design.compose.product_info.ProductCardLabelsRedesignTwoRow (MarketProductCardLabelsRedesignTwoRow.kt:39)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                TypedValue typedValue = krv0.a;
                x = androidx.compose.runtime.k.b(Boolean.valueOf(epx.f(krv0.i(krv0.b != null ? dhr0.E() : null), Boolean.FALSE)));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                if (i3 % 2 == 0) {
                    arrayList.add(obj);
                }
                i3 = i4;
            }
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            for (Object obj2 : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    e43.t();
                    throw null;
                }
                if (i5 % 2 == 1) {
                    arrayList2.add(obj2);
                }
                i5 = i6;
            }
            q630 E = ahn.E(q630Var2, "main_info_labels_list");
            float f = kqu0.s;
            q630 H = s200.H(E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
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
            if (arrayList.isEmpty()) {
                M.K(-458286099);
            } else {
                M.K(-455877461);
                a(arrayList, izsVar, ((Boolean) wh50Var.getValue()).booleanValue(), "main_info_labels_list_even_row", M, (i2 & 112) | 3072);
            }
            M.j();
            if (arrayList2.isEmpty()) {
                M.K(-458286099);
            } else {
                M.K(-455529269);
                a(arrayList2, izsVar, ((Boolean) wh50Var.getValue()).booleanValue(), "main_info_labels_list_odd_row", M, (i2 & 112) | 3072);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xa10(list, izsVar, q630Var2, i, 0);
        }
    }
}
