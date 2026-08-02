package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.cell.content.Cell$Left;
import java.util.Collections;
import java.util.List;
import xsna.efj;
import xsna.fvr;
import xsna.gzs;
import xsna.iy5;
import xsna.k18;
import xsna.phw;
import xsna.rep;
import xsna.tgp;
import xsna.wep;
import xsna.z190;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class e {
    public static t a(efj efjVar, Cell$Left.Main.Size size, iy5 iy5Var, k18 k18Var, com.vk.catalog.mvi.block.impl.a0 a0Var, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
        if ((i2 & 4) != 0) {
            iy5Var = rep.a;
        }
        k18 k18Var2 = (i2 & 8) != 0 ? wep.a : k18Var;
        z190 z190Var = (i2 & 16) != 0 ? tgp.a : a0Var;
        gzs gzsVar2 = (i2 & 32) != 0 ? null : gzsVar;
        com.vk.core.compose.component.semantics.a aVar3 = (i2 & 128) != 0 ? null : aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-723408514, i, -1, "com.vk.core.compose.component.cell.content.Cell.Left.Main.Avatar.Companion.invoke (Cell.kt:89)");
        }
        List singletonList = Collections.singletonList(iy5Var);
        fvr.n();
        t a = u.a(efjVar, singletonList, com.vk.core.compose.component.defaults.c.a.a(size, aVar2, (i >> 3) & 14), k18Var2, z190Var, gzsVar2, aVar3, aVar2, 6);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public static t b(phw phwVar, float f, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
        rep repVar = rep.a;
        if ((i2 & 128) != 0) {
            aVar = null;
        }
        com.vk.core.compose.component.semantics.a aVar3 = aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1547795181, i, -1, "com.vk.core.compose.component.cell.content.Cell.Left.Main.Avatar.Companion.invoke (Cell.kt:110)");
        }
        int i3 = i << 3;
        t a = u.a(phwVar, Collections.singletonList(repVar), f, wep.a, tgp.a, null, aVar3, aVar2, ((i >> 24) & 14) | (i3 & 112) | ((i << 6) & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
