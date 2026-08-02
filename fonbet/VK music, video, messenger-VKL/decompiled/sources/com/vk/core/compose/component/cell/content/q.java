package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import xsna.gzs;
import xsna.zak0;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class q {
    public static v0 a(String str, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        Cell$Right$ExtraAction$Dropdown$Mode cell$Right$ExtraAction$Dropdown$Mode = Cell$Right$ExtraAction$Dropdown$Mode.Secondary;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-461913670, i, -1, "com.vk.core.compose.component.cell.content.Cell.Right.ExtraAction.Dropdown.Companion.invoke (Cell.kt:676)");
        }
        int i2 = i << 3;
        int i3 = (i2 & 896) | (i2 & 112) | 6;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(621089785, i3, -1, "com.vk.core.compose.component.cell.content.remember (RightExtraActionDropdownImpl.kt:80)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new v0(str, gzsVar, cell$Right$ExtraAction$Dropdown$Mode);
            aVar.R(x);
        }
        v0 v0Var = (v0) x;
        ((zak0) v0Var.a).setValue(str);
        ((zak0) v0Var.c).setValue(gzsVar);
        ((zak0) v0Var.b).setValue(cell$Right$ExtraAction$Dropdown$Mode);
        ((zak0) v0Var.d).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return v0Var;
    }
}
