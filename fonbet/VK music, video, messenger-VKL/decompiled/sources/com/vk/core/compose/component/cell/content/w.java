package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.gzs;
import xsna.l5g;
import xsna.lg90;
import xsna.zak0;

/* compiled from: CommonButtonImpl.kt */
/* loaded from: classes17.dex */
public final class w {
    public static final v a(ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, ButtonSize buttonSize, String str, String str2, lg90 lg90Var, l5g l5gVar, lg90 lg90Var2, boolean z, SemanticsConfiguration semanticsConfiguration, gzs gzsVar, androidx.compose.runtime.a aVar, int i, int i2, int i3) {
        boolean z2 = (i3 & 8192) != 0 ? true : z;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-850764047, i, i2, "com.vk.core.compose.component.cell.content.rememberInternal (CommonButtonImpl.kt:246)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new v(str, str2, buttonStyle, buttonAppearance, buttonSize, lg90Var, l5gVar, lg90Var2, z2, semanticsConfiguration, gzsVar);
            aVar.R(x);
        }
        v vVar = (v) x;
        ((zak0) vVar.a).setValue(str);
        ((zak0) vVar.b).setValue(Boolean.FALSE);
        ((zak0) vVar.e).setValue(str);
        ((zak0) vVar.g).setValue(buttonStyle);
        ((zak0) vVar.f).setValue(buttonSize);
        ((zak0) vVar.h).setValue(buttonAppearance);
        ((zak0) vVar.i).setValue(lg90Var);
        ((zak0) vVar.j).setValue(l5gVar);
        ((zak0) vVar.k).setValue(null);
        ((zak0) vVar.l).setValue(null);
        ((zak0) vVar.m).setValue(lg90Var2);
        ((zak0) vVar.n).setValue(null);
        ((zak0) vVar.o).setValue(null);
        ((zak0) vVar.c).setValue(semanticsConfiguration);
        ((zak0) vVar.d).setValue(gzsVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return vVar;
    }
}
