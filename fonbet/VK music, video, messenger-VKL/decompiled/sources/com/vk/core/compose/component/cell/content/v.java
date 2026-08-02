package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.cell.content.a1;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.bhu0;
import xsna.g4j0;
import xsna.gzs;
import xsna.l5g;
import xsna.lg90;
import xsna.pco;
import xsna.q630;
import xsna.spg0;
import xsna.uhg;
import xsna.wh50;
import xsna.zak0;

/* compiled from: CommonButtonImpl.kt */
/* loaded from: classes17.dex */
public final class v implements g4j0, a1.a, o.a, RichCell$Middle.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;

    public v() {
        throw null;
    }

    public v(String str, String str2, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, ButtonSize buttonSize, lg90 lg90Var, l5g l5gVar, lg90 lg90Var2, boolean z, SemanticsConfiguration semanticsConfiguration, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.c = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.d = androidx.compose.runtime.k.b(gzsVar);
        this.e = androidx.compose.runtime.k.b(str2);
        this.f = androidx.compose.runtime.k.b(buttonSize);
        this.g = androidx.compose.runtime.k.b(buttonStyle);
        this.h = androidx.compose.runtime.k.b(buttonAppearance);
        this.i = androidx.compose.runtime.k.b(lg90Var);
        this.j = androidx.compose.runtime.k.b(l5gVar);
        this.k = androidx.compose.runtime.k.b(null);
        this.l = androidx.compose.runtime.k.b(null);
        this.m = androidx.compose.runtime.k.b(lg90Var2);
        this.n = androidx.compose.runtime.k.b(null);
        this.o = androidx.compose.runtime.k.b(null);
        this.p = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // xsna.g4j0, com.vk.core.compose.component.cell.content.Cell$Left.b, com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1105757771);
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
                androidx.compose.runtime.b.f(1105757771, i2, -1, "com.vk.core.compose.component.cell.content.CommonButtonImpl.Content (CommonButtonImpl.kt:59)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.c).getValue());
            String str = (String) ((zak0) this.a).getValue();
            String str2 = (String) ((zak0) this.e).getValue();
            aVar2 = M;
            bhu0.e((gzs) ((zak0) this.d).getValue(), (ButtonSize) ((zak0) this.f).getValue(), (ButtonStyle) ((zak0) this.g).getValue(), (ButtonAppearance) ((zak0) this.h).getValue(), b, null, ((Boolean) ((zak0) this.b).getValue()).booleanValue(), false, (lg90) ((zak0) this.i).getValue(), (l5g) ((zak0) this.j).getValue(), (pco) ((zak0) this.k).getValue(), str, (Integer) ((zak0) this.l).getValue(), (lg90) ((zak0) this.m).getValue(), (l5g) ((zak0) this.n).getValue(), (pco) ((zak0) this.o).getValue(), ((Boolean) ((zak0) this.p).getValue()).booleanValue(), null, str2, null, aVar2, 1073741824, 32768, 0, 3408224);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new uhg(i, 0, this, spg0Var, q630Var);
        }
    }
}
