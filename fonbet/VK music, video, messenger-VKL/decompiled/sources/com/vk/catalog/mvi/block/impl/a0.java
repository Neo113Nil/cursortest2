package com.vk.catalog.mvi.block.impl;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.hr80;
import xsna.ja8;
import xsna.k9q0;
import xsna.l5g;
import xsna.lg90;
import xsna.n34;
import xsna.n5h;
import xsna.pzu0;
import xsna.q630;
import xsna.qri;
import xsna.rrv0;
import xsna.sy90;
import xsna.txj0;
import xsna.wh50;
import xsna.ylu0;
import xsna.z190;
import xsna.zak0;
import xsna.zy60;

/* compiled from: LinksSmallListVideoLibrary.kt */
/* loaded from: classes16.dex */
public final class a0 implements z190 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);

    /* compiled from: LinksSmallListVideoLibrary.kt */
    public static final class a {
        public static a0 a(lg90 lg90Var, long j, androidx.compose.runtime.a aVar) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(302365921, 3080, -1, "com.vk.catalog.mvi.block.impl.SecondaryOverlay.Companion.invoke (LinksSmallListVideoLibrary.kt:172)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new a0(lg90Var, j);
                aVar.R(x);
            }
            a0 a0Var = (a0) x;
            ((zak0) a0Var.a).setValue(lg90Var);
            ((zak0) a0Var.b).setValue(new l5g(j));
            ((zak0) a0Var.c).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return a0Var;
        }
    }

    public a0(lg90 lg90Var, long j) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
    }

    @Override // xsna.z190
    public final void a(int i, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-247219166);
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
                androidx.compose.runtime.b.f(-247219166, i2, -1, "com.vk.catalog.mvi.block.impl.SecondaryOverlay.invoke (LinksSmallListVideoLibrary.kt:152)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630Var, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, c, cri.a.d);
            pzu0.b((lg90) ((zak0) this.a).getValue(), null, txj0.q(q630.a.a, 24), ((l5g) ((zak0) this.b).getValue()).a, M, 440, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n5h(this, j, q630Var, i, 1);
        }
    }
}
