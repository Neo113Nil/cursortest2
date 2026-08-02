package com.vk.core.compose.component.cell.content;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.cell.content.a1;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import xsna.a2m;
import xsna.alb0;
import xsna.cri;
import xsna.d9c;
import xsna.dt1;
import xsna.frv0;
import xsna.izs;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.ntu0;
import xsna.pqz;
import xsna.q630;
import xsna.q9g;
import xsna.qri;
import xsna.r0x;
import xsna.r9g;
import xsna.rrv0;
import xsna.sp;
import xsna.sy90;
import xsna.tpg0;
import xsna.uq7;
import xsna.us2;
import xsna.wh50;
import xsna.wn20;
import xsna.wuv0;
import xsna.ylu0;
import xsna.zak0;

/* compiled from: SexyMiddleTextImpl.kt */
/* loaded from: classes17.dex */
public final class f1 extends a1.g implements a1.f, a1.c, Cell$Middle.d, Cell$Middle.c, Cell$Middle.b, RichCell$Middle.h, RichCell$Middle.g, RichCell$Middle.c, RichCell$Middle.e {
    public final Map<String, r0x> c;
    public final TextType d;
    public final int e;
    public final int f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;

    public f1() {
        throw null;
    }

    public f1(us2 us2Var, Map map, a1.g.a aVar, a1.g.a aVar2, a1.f.a aVar3, a1.f.a aVar4, SemanticsConfiguration semanticsConfiguration, TextType textType, int i, int i2, izs izsVar) {
        this.c = map;
        this.d = textType;
        this.e = i;
        this.f = i2;
        this.g = androidx.compose.runtime.k.b(us2Var);
        this.h = androidx.compose.runtime.k.b(aVar);
        this.i = androidx.compose.runtime.k.b(aVar2);
        this.j = androidx.compose.runtime.k.b(aVar3);
        this.k = androidx.compose.runtime.k.b(aVar4);
        this.l = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.m = androidx.compose.runtime.k.b(izsVar);
    }

    @Override // com.vk.core.compose.component.cell.content.a1.g, com.vk.core.compose.component.cell.content.a1.f, com.vk.core.compose.component.cell.content.a1.e
    public final void a(q9g q9gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        long j;
        frv0 frv0Var;
        androidx.compose.runtime.a M = aVar.M(-306442909);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-306442909, i2, -1, "com.vk.core.compose.component.cell.content.SexyMiddleTextImpl.Content (SexyMiddleTextImpl.kt:56)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.l).getValue());
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = kqu0.r;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.n), dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            a1.g.a aVar4 = (a1.g.a) ((zak0) this.h).getValue();
            q630.a aVar5 = q630.a.a;
            tpg0 tpg0Var = tpg0.a;
            if (aVar4 == null) {
                M.K(1593435849);
            } else {
                M.K(1593435850);
                aVar4.a(tpg0Var, aVar5, M, 54);
            }
            M.j();
            a1.f.a aVar6 = (a1.f.a) ((zak0) this.j).getValue();
            if (aVar6 == null) {
                M.K(1593489417);
            } else {
                M.K(1593489418);
                aVar6.a(tpg0Var, aVar5, M, 54);
            }
            M.j();
            q630 b2 = tpg0Var.b(1.0f, aVar5, false);
            us2 us2Var = (us2) ((zak0) this.g).getValue();
            sp.l();
            wn20 wn20Var = wn20.a;
            M.K(1113737941);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1113737941, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeRichCellDefaults.textColor (MilkshakeRichCellDefaults.kt:46)");
            }
            int[] iArr = wn20.a.$EnumSwitchMapping$0;
            TextType textType = this.d;
            int i3 = iArr[textType.ordinal()];
            if (i3 == 1 || i3 == 2) {
                M.K(855309984);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().m;
                M.j();
            } else {
                if (i3 != 3 && i3 != 4 && i3 != 5) {
                    throw alb0.c(855307064, M);
                }
                M.K(855314370);
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
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            sp.l();
            ((Boolean) ((zak0) this.a).getValue()).getClass();
            M.K(1386262516);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1386262516, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeRichCellDefaults.textStyle (MilkshakeRichCellDefaults.kt:36)");
            }
            int i4 = iArr[textType.ordinal()];
            if (i4 == 1) {
                M.K(758421912);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.T;
                M.j();
            } else if (i4 == 2) {
                M.K(758423741);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.Y;
                M.j();
            } else {
                if (i4 != 3 && i4 != 4 && i4 != 5) {
                    throw alb0.c(758420038, M);
                }
                M.K(758427995);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var3 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var3.d0;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            izs izsVar = (izs) ((zak0) this.m).getValue();
            if (izsVar == null) {
                M.K(1594013473);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new pqz(25);
                    M.R(x);
                }
                izsVar = (izs) x;
            } else {
                M.K(-364222703);
            }
            M.j();
            ntu0.c(us2Var, b2, frv0Var, j, this.e, false, false, false, null, 0, this.c, this.f, izsVar, M, 0, 0, PDF417Common.MAX_CODEWORDS_IN_BARCODE);
            aVar2 = M;
            a1.g.a aVar7 = (a1.g.a) ((zak0) this.i).getValue();
            if (aVar7 == null) {
                aVar2.K(1594054857);
            } else {
                aVar2.K(1594054858);
                aVar7.a(tpg0Var, aVar5, aVar2, 54);
            }
            aVar2.j();
            a1.f.a aVar8 = (a1.f.a) ((zak0) this.k).getValue();
            if (aVar8 == null) {
                aVar2.K(1594107433);
            } else {
                aVar2.K(1594107434);
                aVar8.a(tpg0Var, aVar5, aVar2, 54);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new uq7(this, q9gVar, q630Var, i, 3);
        }
    }

    @Override // com.vk.core.compose.component.cell.content.RichCell$Middle.h, com.vk.core.compose.component.cell.content.RichCell$Middle.g, com.vk.core.compose.component.cell.content.RichCell$Middle.c, com.vk.core.compose.component.cell.content.RichCell$Middle.e
    public final void b(q9g q9gVar, q630 q630Var, RichCell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(638503272);
        if ((i & 6) == 0) {
            i2 = (M.J(q9gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED) != 1042)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(638503272, i2, -1, "com.vk.core.compose.component.cell.content.SexyMiddleTextImpl.Content (SexyMiddleTextImpl.kt:85)");
            }
            a(q9gVar, q630Var, M, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 >> 3) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a2m(i, 1, this, q9gVar, size, q630Var);
        }
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.d, com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(q630 q630Var, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1766004184);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1766004184, i2, -1, "com.vk.core.compose.component.cell.content.SexyMiddleTextImpl.Content (SexyMiddleTextImpl.kt:90)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            a(r9g.a, q630Var, M, ((i2 << 3) & 112) | 6 | (i2 & 896));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d9c(i, 4, this, q630Var, size, false);
        }
    }
}
