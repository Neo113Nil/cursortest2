package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import xsna.zak0;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class j {
    public static q0 a(BadgeAppearance.Design design, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-142014613, 390, -1, "com.vk.core.compose.component.cell.content.Cell.Right.Action.Badge.Companion.invoke (Cell.kt:576)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1543811370, 54, -1, "com.vk.core.compose.component.cell.content.remember (RightActionBadgeImpl.kt:47)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new q0(design);
            aVar.R(x);
        }
        q0 q0Var = (q0) x;
        ((zak0) q0Var.a).setValue(design);
        ((zak0) q0Var.b).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return q0Var;
    }
}
