package com.vk.core.compose.component.cell.content;

import xsna.gzs;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class b {
    public static b0 a(boolean z, gzs gzsVar, boolean z2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
        if ((i2 & 2) != 0) {
            gzsVar = null;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            aVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(728939743, i, -1, "com.vk.core.compose.component.cell.content.Cell.Left.Extra.Check.Companion.invoke (Cell.kt:291)");
        }
        int i3 = (i >> 12) & 14;
        int i4 = i << 3;
        int i5 = (i4 & 57344) | i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-728098465, i5, -1, "com.vk.core.compose.component.cell.content.remember (ExtraCheckImpl.kt:52)");
        }
        b0 a = c0.a(z, gzsVar, z2, aVar, aVar2, (i5 >> 3) & 8190);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
