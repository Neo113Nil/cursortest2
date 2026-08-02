package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import xsna.zak0;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class l {
    public static r0 a(int i, CounterAppearance.Design design, androidx.compose.runtime.a aVar, int i2) {
        CounterMode counterMode = CounterMode.Primary;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(429540110, i2, -1, "com.vk.core.compose.component.cell.content.Cell.Right.Action.Counter.Companion.invoke (Cell.kt:566)");
        }
        int i3 = ((i2 << 3) & 112) | 390;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1762419193, i3, -1, "com.vk.core.compose.component.cell.content.remember (RightActionCounterImpl.kt:61)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new r0(i, design, counterMode);
            aVar.R(x);
        }
        r0 r0Var = (r0) x;
        ((zak0) r0Var.a).setValue(Integer.valueOf(i));
        ((zak0) r0Var.b).setValue(design);
        ((zak0) r0Var.c).setValue(counterMode);
        ((zak0) r0Var.d).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return r0Var;
    }
}
