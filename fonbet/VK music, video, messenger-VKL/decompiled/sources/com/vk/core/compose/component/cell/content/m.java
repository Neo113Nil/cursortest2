package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.zak0;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class m {
    public static s0 a(String str, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            semanticsConfiguration = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1551330767, i, -1, "com.vk.core.compose.component.cell.content.Cell.Right.Action.Detail.Companion.invoke (Cell.kt:542)");
        }
        int i3 = (i >> 6) & 14;
        int i4 = i << 3;
        int i5 = (i4 & 896) | i3 | (i4 & 112);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1270848482, i5, -1, "com.vk.core.compose.component.cell.content.remember (RightActionDetailImpl.kt:56)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new s0(str, semanticsConfiguration);
            aVar.R(x);
        }
        s0 s0Var = (s0) x;
        ((zak0) s0Var.a).setValue(str);
        ((zak0) s0Var.b).setValue(semanticsConfiguration);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return s0Var;
    }
}
