package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.UserStackSize;
import xsna.byv0;
import xsna.gzs;
import xsna.izs;
import xsna.sp;
import xsna.us2;
import xsna.wn20;
import xsna.ws2;
import xsna.xcc;
import xsna.zak0;

/* compiled from: RichCell.kt */
/* loaded from: classes17.dex */
public final class m0 {
    public static p0 a(izs izsVar, String str, UserStackSize userStackSize, xcc.a.f fVar, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
        us2 us2Var = null;
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            userStackSize = UserStackSize.Medium;
        }
        UserStackSize userStackSize2 = userStackSize;
        if ((i2 & 8) != 0) {
            sp.l();
            wn20 wn20Var = wn20.a;
            aVar2.K(17925290);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(17925290, 0, -1, "com.vk.core.compose.component.defaults.RichCellDefaults.userStackPosition (RichCellDefaults.kt:39)");
            }
            fVar = byv0.c();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2.j();
        }
        xcc.a.f fVar2 = fVar;
        gzs gzsVar2 = (i2 & 16) != 0 ? null : gzsVar;
        com.vk.core.compose.component.semantics.a aVar3 = (i2 & 32) != 0 ? null : aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-85643089, i, -1, "com.vk.core.compose.component.cell.content.RichCell.Middle.Slot.UserStack.Companion.invoke (RichCell.kt:265)");
        }
        if (str == null) {
            aVar2.K(-182060809);
        } else {
            aVar2.K(-698609590);
            us2Var = ws2.b(str, aVar2, (i >> 3) & 14);
        }
        aVar2.j();
        us2 us2Var2 = us2Var;
        int i3 = i >> 3;
        int i4 = (i & 14) | (i3 & 112) | (i3 & 896) | (57344 & i) | (458752 & i);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1767039895, i4, -1, "com.vk.core.compose.component.cell.content.remember (RichUserStack.kt:68)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            p0 p0Var = new p0(izsVar, userStackSize2, fVar2, us2Var2, gzsVar2, aVar3);
            aVar2.R(p0Var);
            x = p0Var;
        }
        p0 p0Var2 = (p0) x;
        ((zak0) p0Var2.a).setValue(izsVar);
        ((zak0) p0Var2.b).setValue(userStackSize2);
        ((zak0) p0Var2.c).setValue(fVar2);
        ((zak0) p0Var2.d).setValue(us2Var2);
        ((zak0) p0Var2.e).setValue(gzsVar2);
        ((zak0) p0Var2.f).setValue(aVar3);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return p0Var2;
    }
}
