package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import xsna.gzs;
import xsna.l5g;
import xsna.rrv0;
import xsna.ylu0;
import xsna.zak0;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class r {
    public static w0 a(String str, gzs gzsVar, long j, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
        String str2 = (i2 & 1) != 0 ? null : str;
        gzs gzsVar2 = (i2 & 2) != 0 ? null : gzsVar;
        if ((i2 & 4) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getIcon().l;
        }
        long j2 = j;
        com.vk.core.compose.component.semantics.a aVar3 = (i2 & 8) != 0 ? null : aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(553443712, i, -1, "com.vk.core.compose.component.cell.content.Cell.Right.ExtraAction.More.Companion.invoke (Cell.kt:708)");
        }
        int i3 = ((i << 3) & 896) | 6;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-310764559, i3, -1, "com.vk.core.compose.component.cell.content.remember (RightExtraActionMoreImpl.kt:74)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            w0 w0Var = new w0(j2, aVar3, str2, gzsVar2);
            aVar2.R(w0Var);
            x = w0Var;
        }
        w0 w0Var2 = (w0) x;
        ((zak0) w0Var2.b).setValue(new l5g(j2));
        ((zak0) w0Var2.a).setValue(str2);
        ((zak0) w0Var2.c).setValue(gzsVar2);
        ((zak0) w0Var2.d).setValue(aVar3);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return w0Var2;
    }
}
