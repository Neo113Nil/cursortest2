package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.byc0;
import xsna.efd0;
import xsna.fvr;
import xsna.g4j0;
import xsna.gzs;
import xsna.l5g;
import xsna.nof0;
import xsna.nzu0;
import xsna.pzu0;
import xsna.q630;
import xsna.spg0;
import xsna.wh50;
import xsna.zak0;
import xsna.zy60;

/* compiled from: RightChevronImpl.kt */
/* loaded from: classes17.dex */
public final class u0 implements g4j0, o.b {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public u0() {
        throw null;
    }

    public u0(long j, SemanticsConfiguration semanticsConfiguration, String str, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.d = zy60.d(j);
        this.e = androidx.compose.runtime.k.b(true);
    }

    @Override // xsna.g4j0, com.vk.core.compose.component.cell.content.Cell$Left.b, com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(864464139);
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
                androidx.compose.runtime.b.f(864464139, i2, -1, "com.vk.core.compose.component.cell.content.RightChevronImpl.Content (RightChevronImpl.kt:33)");
            }
            wh50 wh50Var = this.b;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            wh50 wh50Var2 = this.a;
            wh50 wh50Var3 = this.d;
            wh50 wh50Var4 = this.c;
            if (gzsVar != null) {
                M.K(627367255);
                gzs gzsVar2 = (gzs) ((zak0) wh50Var).getValue();
                if (gzsVar2 == null) {
                    M.K(627418901);
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        x = new nof0(1);
                        M.R(x);
                    }
                    gzsVar2 = (gzs) x;
                } else {
                    M.K(1821354296);
                }
                M.j();
                q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) wh50Var4).getValue());
                fvr.n();
                com.vk.core.compose.component.defaults.c cVar = com.vk.core.compose.component.defaults.c.a;
                M.K(1072580113);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1072580113, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.chevronSize (VkCellDefaults.kt:78)");
                }
                long b2 = byc0.b(16, 24);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                fvr.n();
                nzu0.b(gzsVar2, cVar.b(M), b2, (String) ((zak0) wh50Var2).getValue(), b, ((l5g) ((zak0) wh50Var3).getValue()).a, false, null, ((Boolean) ((zak0) this.e).getValue()).booleanValue(), null, null, M, 64, 0, 1728);
                M = M;
                M.j();
            } else {
                M.K(627781477);
                q630 b3 = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) wh50Var4).getValue());
                fvr.n();
                pzu0.b(com.vk.core.compose.component.defaults.c.a.b(M), (String) ((zak0) wh50Var2).getValue(), b3, ((l5g) ((zak0) wh50Var3).getValue()).a, M, 8, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new efd0(this, spg0Var, q630Var, i, 1);
        }
    }
}
