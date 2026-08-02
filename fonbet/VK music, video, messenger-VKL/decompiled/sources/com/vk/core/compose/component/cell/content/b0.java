package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.g4j0;
import xsna.gzs;
import xsna.q630;
import xsna.s3q0;
import xsna.se0;
import xsna.spg0;
import xsna.uju0;
import xsna.wh50;
import xsna.wzs;
import xsna.zak0;

/* compiled from: ExtraCheckImpl.kt */
/* loaded from: classes17.dex */
public final class b0 implements g4j0, Cell$Left.b, o.e.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public b0(boolean z, gzs<s3q0> gzsVar, boolean z2, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.d = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.g4j0, com.vk.core.compose.component.cell.content.Cell$Left.b, com.vk.core.compose.component.cell.content.o
    public final void a(final spg0 spg0Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-188520149);
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
                androidx.compose.runtime.b.f(-188520149, i2, -1, "com.vk.core.compose.component.cell.content.ExtraCheckImpl.Content (ExtraCheckImpl.kt:28)");
            }
            gzs gzsVar = (gzs) ((zak0) this.b).getValue();
            if (gzsVar == null) {
                M.K(1613587381);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new se0(18);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(-779233128);
            }
            M.j();
            uju0.a(gzsVar, com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue()), ((Boolean) ((zak0) this.a).getValue()).booleanValue(), ((Boolean) ((zak0) this.c).getValue()).booleanValue(), null, null, M, 0, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ggq
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    com.vk.core.compose.component.cell.content.b0.this.a(spg0Var, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
