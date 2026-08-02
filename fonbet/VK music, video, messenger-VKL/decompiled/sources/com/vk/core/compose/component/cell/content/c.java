package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import xsna.gzs;
import xsna.zak0;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class c {
    public static h0 a(gzs gzsVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
        if ((i2 & 1) != 0) {
            gzsVar = null;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1328087014, i, -1, "com.vk.core.compose.component.cell.content.Cell.Left.Extra.Close.Companion.invoke (Cell.kt:274)");
        }
        int i3 = (i >> 9) & 14;
        int i4 = i << 3;
        int i5 = (i4 & 7168) | i3 | (i4 & 112) | (i4 & 896);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1981325581, i5, -1, "com.vk.core.compose.component.cell.content.remember (LeftExtraCloseImpl.kt:46)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            x = new h0(gzsVar, aVar);
            aVar2.R(x);
        }
        h0 h0Var = (h0) x;
        ((zak0) h0Var.a).setValue(null);
        ((zak0) h0Var.b).setValue(gzsVar);
        ((zak0) h0Var.c).setValue(aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return h0Var;
    }
}
