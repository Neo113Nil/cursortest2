package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import xsna.gzs;
import xsna.zak0;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class n {
    public static t0 a(boolean z, gzs gzsVar, boolean z2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
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
            androidx.compose.runtime.b.f(771471380, i, -1, "com.vk.core.compose.component.cell.content.Cell.Right.Action.Switch.Companion.invoke (Cell.kt:554)");
        }
        int i3 = (i >> 12) & 14;
        int i4 = i << 3;
        int i5 = (i4 & 57344) | i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(300790131, i5, -1, "com.vk.core.compose.component.cell.content.remember (RightActionSwitchImpl.kt:58)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            x = new t0(z, gzsVar, z2, aVar);
            aVar2.R(x);
        }
        t0 t0Var = (t0) x;
        ((zak0) t0Var.a).setValue(Boolean.valueOf(z));
        ((zak0) t0Var.b).setValue(gzsVar);
        ((zak0) t0Var.c).setValue(Boolean.valueOf(z2));
        ((zak0) t0Var.d).setValue(aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return t0Var;
    }
}
