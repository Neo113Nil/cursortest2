package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.g4j0;
import xsna.gzs;
import xsna.izs;
import xsna.l54;
import xsna.q630;
import xsna.s3q0;
import xsna.spg0;
import xsna.wh50;
import xsna.yjg0;
import xsna.zak0;
import xsna.zov0;

/* compiled from: RightActionSwitchImpl.kt */
/* loaded from: classes17.dex */
public final class t0 implements g4j0, o.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public t0(boolean z, gzs<s3q0> gzsVar, boolean z2, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.d = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.g4j0, com.vk.core.compose.component.cell.content.Cell$Left.b, com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        izs izsVar;
        androidx.compose.runtime.a M = aVar.M(-213793059);
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
                androidx.compose.runtime.b.f(-213793059, i2, -1, "com.vk.core.compose.component.cell.content.RightActionSwitchImpl.Content (RightActionSwitchImpl.kt:27)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue());
            boolean booleanValue = ((Boolean) ((zak0) this.a).getValue()).booleanValue();
            gzs gzsVar = (gzs) ((zak0) this.b).getValue();
            if (gzsVar == null) {
                M.K(327705972);
                M.j();
                izsVar = null;
            } else {
                M.K(327705973);
                boolean J = M.J(gzsVar);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new yjg0(0, gzsVar);
                    M.R(x);
                }
                izsVar = (izs) x;
                M.j();
            }
            zov0.a(booleanValue, izsVar, b, ((Boolean) ((zak0) this.c).getValue()).booleanValue(), null, M, 0, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l54(i, 4, this, spg0Var, q630Var);
        }
    }
}
