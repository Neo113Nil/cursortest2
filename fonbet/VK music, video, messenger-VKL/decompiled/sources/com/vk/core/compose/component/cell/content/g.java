package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.defaults.PictureRadius;
import java.util.Collections;
import java.util.List;
import xsna.ab50;
import xsna.efj;
import xsna.fvr;
import xsna.gzs;
import xsna.rep;
import xsna.tgp;
import xsna.z190;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class g {
    public static z a(efj efjVar, Cell$Left.Main.Size size, ab50 ab50Var, PictureRadius pictureRadius, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
        rep repVar = rep.a;
        z190 z190Var = ab50Var;
        if ((i2 & 8) != 0) {
            z190Var = tgp.a;
        }
        z190 z190Var2 = z190Var;
        if ((i2 & 16) != 0) {
            pictureRadius = PictureRadius.Medium;
        }
        PictureRadius pictureRadius2 = pictureRadius;
        com.vk.core.compose.component.semantics.a aVar3 = (i2 & 64) != 0 ? null : aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1135200909, i, -1, "com.vk.core.compose.component.cell.content.Cell.Left.Main.Picture.Companion.invoke (Cell.kt:178)");
        }
        List singletonList = Collections.singletonList(repVar);
        fvr.n();
        int i3 = i << 3;
        z a = a0.a(efjVar, singletonList, com.vk.core.compose.component.defaults.c.a.e(size, aVar2, (i >> 3) & 14), z190Var2, pictureRadius2, null, aVar3, aVar2, ((i >> 21) & 14) | (i3 & 112) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public static z b(efj efjVar, float f, z190 z190Var, PictureRadius pictureRadius, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i) {
        rep repVar = rep.a;
        if ((i & 8) != 0) {
            z190Var = tgp.a;
        }
        z190 z190Var2 = z190Var;
        gzs gzsVar2 = (i & 32) != 0 ? null : gzsVar;
        com.vk.core.compose.component.semantics.a aVar3 = (i & 64) != 0 ? null : aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(223679294, 12607536, -1, "com.vk.core.compose.component.cell.content.Cell.Left.Main.Picture.Companion.invoke (Cell.kt:216)");
        }
        z a = a0.a(efjVar, Collections.singletonList(repVar), f, z190Var2, pictureRadius, gzsVar2, aVar3, aVar2, 199686);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
