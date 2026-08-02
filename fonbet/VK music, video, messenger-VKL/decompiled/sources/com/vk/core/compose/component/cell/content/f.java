package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.cell.content.Cell$Left;
import xsna.byc0;
import xsna.fvr;
import xsna.l5g;
import xsna.lg90;
import xsna.uco;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class f {
    public static x a(lg90 lg90Var, Cell$Left.Main.Size size, long j, String str, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
        long j2 = (i2 & 4) != 0 ? l5g.k : j;
        String str2 = (i2 & 8) != 0 ? null : str;
        com.vk.core.compose.component.semantics.a aVar3 = (i2 & 16) != 0 ? null : aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1998294440, i, -1, "com.vk.core.compose.component.cell.content.Cell.Left.Main.Icon.Companion.invoke (Cell.kt:67)");
        }
        fvr.n();
        float c = com.vk.core.compose.component.defaults.c.a.c(size, aVar2, (i >> 3) & 14);
        long b = byc0.b(c, c);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1987254924, 70, -1, "com.vk.core.compose.component.cell.content.remember (CommonIconImpl.kt:98)");
        }
        x a = y.a(lg90Var, j2, new uco(b), null, str2, null, aVar3, aVar2, 8, 88);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
