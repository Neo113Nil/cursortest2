package com.vk.core.compose.component.cell.content;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.Map;
import xsna.alb0;
import xsna.bna;
import xsna.cri;
import xsna.dt1;
import xsna.frv0;
import xsna.fvr;
import xsna.izs;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.o19;
import xsna.o37;
import xsna.q630;
import xsna.qri;
import xsna.r0x;
import xsna.rrv0;
import xsna.sy90;
import xsna.tpg0;
import xsna.us2;
import xsna.wh50;
import xsna.wuv0;
import xsna.ye40;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zak0;

/* compiled from: TextImpl.kt */
/* loaded from: classes17.dex */
public final class h1 implements Cell$Middle.c, Cell$Middle.d, Cell$Middle.b {
    public final Map<String, r0x> a;
    public final CellTextType b;
    public final int c;
    public final int d;
    public final Float e;
    public final Float f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;

    public h1() {
        throw null;
    }

    public h1(us2 us2Var, Map map, Cell$Middle.c.a aVar, Cell$Middle.d.a aVar2, Cell$Middle.c.a aVar3, Cell$Middle.d.a aVar4, SemanticsConfiguration semanticsConfiguration, CellTextType cellTextType, int i, int i2, Float f, Float f2, izs izsVar, int i3) {
        aVar = (i3 & 4) != 0 ? null : aVar;
        aVar2 = (i3 & 8) != 0 ? null : aVar2;
        aVar3 = (i3 & 16) != 0 ? null : aVar3;
        aVar4 = (i3 & 32) != 0 ? null : aVar4;
        Float f3 = (i3 & 2048) != 0 ? null : f2;
        izs izsVar2 = (i3 & 4096) == 0 ? izsVar : null;
        this.a = map;
        this.b = cellTextType;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = f3;
        this.g = androidx.compose.runtime.k.b(us2Var);
        this.h = androidx.compose.runtime.k.b(aVar);
        this.i = androidx.compose.runtime.k.b(aVar2);
        this.j = androidx.compose.runtime.k.b(aVar3);
        this.k = androidx.compose.runtime.k.b(aVar4);
        this.l = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.m = androidx.compose.runtime.k.b(izsVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22, types: [xsna.q630] */
    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(q630 q630Var, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630.a aVar2;
        long j;
        frv0 frv0Var;
        tpg0 tpg0Var;
        q630.a aVar3;
        q630.a aVar4;
        tpg0 tpg0Var2;
        ?? b;
        q630 g;
        androidx.compose.runtime.a M = aVar.M(-1391651240);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1391651240, i2, -1, "com.vk.core.compose.component.cell.content.TextImpl.Content (TextImpl.kt:49)");
            }
            q630 b2 = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.l).getValue());
            q630.a aVar5 = q630.a.a;
            Float f = this.f;
            if (f != null && (g = b2.g(o19.a(aVar5, f.floatValue()))) != null) {
                b2 = g;
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f2 = kqu0.r;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f2, dt1.a.n), dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b2);
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
            Cell$Middle.c.a aVar7 = (Cell$Middle.c.a) ((zak0) this.h).getValue();
            tpg0 tpg0Var3 = tpg0.a;
            if (aVar7 == null) {
                M.K(2121558470);
            } else {
                M.K(2121558471);
                aVar7.c(tpg0Var3, aVar5, size, M, 54 | ((i2 << 3) & 896));
            }
            M.j();
            Cell$Middle.d.a aVar8 = (Cell$Middle.d.a) ((zak0) this.i).getValue();
            if (aVar8 == null) {
                M.K(2121615014);
                M.j();
                aVar2 = aVar5;
            } else {
                M.K(2121615015);
                aVar8.c(tpg0Var3, aVar5, size, M, 54 | ((i2 << 3) & 896));
                aVar2 = aVar5;
                M.j();
            }
            us2 us2Var = (us2) ((zak0) this.g).getValue();
            fvr.n();
            com.vk.core.compose.component.defaults.c cVar = com.vk.core.compose.component.defaults.c.a;
            M.K(504008015);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(504008015, 0, -1, "com.vk.core.compose.component.defaults.CellDefaults.textColor (VkCellDefaults.kt:144)");
            }
            int[] iArr = bna.$EnumSwitchMapping$0;
            CellTextType cellTextType = this.b;
            int i3 = iArr[cellTextType.ordinal()];
            if (i3 == 1) {
                M.K(-979597414);
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
                if (i3 != 2 && i3 != 3) {
                    throw alb0.c(-979599525, M);
                }
                M.K(-979593924);
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
            fvr.n();
            M.K(-1226046287);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1226046287, 0, -1, "com.vk.core.compose.component.defaults.CellDefaults.textStyle (VkCellDefaults.kt:136)");
            }
            int i4 = iArr[cellTextType.ordinal()];
            if (i4 == 1) {
                M.K(-1409437963);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.T;
                M.j();
            } else {
                if (i4 != 2 && i4 != 3) {
                    throw alb0.c(-1409440018, M);
                }
                M.K(-1409434727);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.i0;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Float f3 = this.e;
            if (f3 == null || (b = tpg0Var3.b(f3.floatValue(), aVar2, false)) == 0) {
                tpg0Var = tpg0Var3;
                aVar3 = aVar2;
            } else {
                tpg0Var = tpg0Var3;
                aVar3 = b;
            }
            izs izsVar = (izs) ((zak0) this.m).getValue();
            if (izsVar == null) {
                M.K(2122109124);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new ye40(20);
                    M.R(x);
                }
                izsVar = (izs) x;
            } else {
                M.K(1176833294);
            }
            M.j();
            q630.a aVar9 = aVar2;
            tpg0 tpg0Var4 = tpg0Var;
            yqv0.d(us2Var, aVar3, j, 0, null, this.d, false, this.c, izsVar, this.a, frv0Var, M, 0, 0, 760);
            M = M;
            Cell$Middle.c.a aVar10 = (Cell$Middle.c.a) ((zak0) this.j).getValue();
            if (aVar10 == null) {
                M.K(2122153670);
                M.j();
                aVar4 = aVar9;
                tpg0Var2 = tpg0Var4;
            } else {
                M.K(2122153671);
                aVar4 = aVar9;
                tpg0Var2 = tpg0Var4;
                aVar10.c(tpg0Var2, aVar4, size, M, 54 | ((i2 << 3) & 896));
                M.j();
            }
            Cell$Middle.d.a aVar11 = (Cell$Middle.d.a) ((zak0) this.k).getValue();
            if (aVar11 == null) {
                M.K(2122209222);
            } else {
                M.K(2122209223);
                aVar11.c(tpg0Var2, aVar4, size, M, 54 | ((i2 << 3) & 896));
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
            s.d = new o37(i, 2, this, q630Var, size);
        }
    }
}
