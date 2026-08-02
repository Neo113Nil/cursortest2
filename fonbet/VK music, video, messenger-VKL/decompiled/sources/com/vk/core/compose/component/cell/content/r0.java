package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.g4j0;
import xsna.lys;
import xsna.nou0;
import xsna.q630;
import xsna.spg0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: RightActionCounterImpl.kt */
/* loaded from: classes17.dex */
public final class r0 implements g4j0, o.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);

    public r0(int i, CounterAppearance counterAppearance, CounterMode counterMode) {
        this.a = androidx.compose.runtime.k.b(Integer.valueOf(i));
        this.b = androidx.compose.runtime.k.b(counterAppearance);
        this.c = androidx.compose.runtime.k.b(counterMode);
    }

    @Override // xsna.g4j0, com.vk.core.compose.component.cell.content.Cell$Left.b, com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(232532331);
        if ((i & 384) == 0) {
            i2 = (M.J(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(232532331, i2, -1, "com.vk.core.compose.component.cell.content.RightActionCounterImpl.Content (RightActionCounterImpl.kt:31)");
            }
            nou0.a(((Number) ((zak0) this.a).getValue()).intValue(), CounterSize.Medium, (CounterAppearance) ((zak0) this.b).getValue(), com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.d).getValue()), (CounterMode) ((zak0) this.c).getValue(), false, M, 48, 32);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lys(this, spg0Var, q630Var, i, 5);
        }
    }
}
