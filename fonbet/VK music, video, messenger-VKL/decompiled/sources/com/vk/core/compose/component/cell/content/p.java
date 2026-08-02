package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.gzs;
import xsna.l5g;
import xsna.lg90;
import xsna.uco;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class p {
    public static x a(lg90 lg90Var, long j, long j2, String str, gzs gzsVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
        long j3 = (i2 & 2) != 0 ? l5g.k : j;
        long j4 = (i2 & 4) != 0 ? 9205357640488583168L : j2;
        String str2 = (i2 & 8) != 0 ? null : str;
        gzs gzsVar2 = (i2 & 16) != 0 ? null : gzsVar;
        SemanticsConfiguration semanticsConfiguration2 = (i2 & 32) != 0 ? null : semanticsConfiguration;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1374829136, i, -1, "com.vk.core.compose.component.cell.content.Cell.Right.Extra.Icon.Companion.invoke (Cell.kt:637)");
        }
        int i3 = i << 3;
        int i4 = (i3 & 3670016) | ((i >> 18) & 14) | 64 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-195816872, i4, -1, "com.vk.core.compose.component.cell.content.remember (CommonIconImpl.kt:134)");
        }
        uco ucoVar = new uco(j4);
        int i5 = i4 >> 3;
        int i6 = i4 << 3;
        x a = y.a(lg90Var, j3, ucoVar, null, str2, gzsVar2, semanticsConfiguration2, aVar, (i5 & 896) | (i5 & 14) | 3080 | (i5 & 112) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 16);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
