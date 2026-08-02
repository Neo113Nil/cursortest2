package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.gzs;
import xsna.l5g;
import xsna.lg90;
import xsna.uco;
import xsna.zak0;

/* compiled from: CommonIconImpl.kt */
/* loaded from: classes17.dex */
public final class y {
    public static final x a(lg90 lg90Var, long j, uco ucoVar, AlongIconType alongIconType, String str, gzs gzsVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
        uco ucoVar2 = (i2 & 4) != 0 ? null : ucoVar;
        boolean z = (i2 & 8) == 0;
        AlongIconType alongIconType2 = (i2 & 16) != 0 ? AlongIconType.AlongTitle : alongIconType;
        gzs gzsVar2 = (i2 & 64) != 0 ? null : gzsVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1575927518, i, -1, "com.vk.core.compose.component.cell.content.rememberInternal (CommonIconImpl.kt:275)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x xVar = new x(lg90Var, j, ucoVar2, str, gzsVar2, semanticsConfiguration, z, alongIconType2);
            aVar.R(xVar);
            x = xVar;
        }
        x xVar2 = (x) x;
        ((zak0) xVar2.e).setValue(lg90Var);
        ((zak0) xVar2.f).setValue(new l5g(j));
        ((zak0) xVar2.g).setValue(ucoVar2);
        ((zak0) xVar2.i).setValue(str);
        ((zak0) xVar2.j).setValue(semanticsConfiguration);
        ((zak0) xVar2.h).setValue(gzsVar2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return xVar2;
    }
}
