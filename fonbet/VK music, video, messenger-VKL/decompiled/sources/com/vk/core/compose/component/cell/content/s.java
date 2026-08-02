package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.defaults.PictureRadius;
import java.util.Collections;
import java.util.List;
import xsna.fvr;
import xsna.gzs;
import xsna.phw;
import xsna.rep;
import xsna.tgp;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class s {
    public static z a(phw phwVar, float f, PictureRadius pictureRadius, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
        if ((i2 & 2) != 0) {
            fvr.n();
            f = com.vk.core.compose.component.defaults.c.c;
        }
        float f2 = f;
        rep repVar = rep.a;
        if ((i2 & 16) != 0) {
            pictureRadius = PictureRadius.Medium;
        }
        PictureRadius pictureRadius2 = pictureRadius;
        gzs gzsVar2 = (i2 & 32) != 0 ? null : gzsVar;
        com.vk.core.compose.component.semantics.a aVar3 = (i2 & 64) != 0 ? null : aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-227288078, i, -1, "com.vk.core.compose.component.cell.content.Cell.Right.ExtraAction.Picture.Companion.invoke (Cell.kt:723)");
        }
        List singletonList = Collections.singletonList(repVar);
        int i3 = ((i << 3) & 458752) | 6 | ((i << 6) & 7168);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1902063283, i3, -1, "com.vk.core.compose.component.cell.content.remember (CommonPictureImpl.kt:104)");
        }
        z b = a0.b(phwVar, f2, 0, singletonList, tgp.a, pictureRadius2, gzsVar2, aVar3, aVar2, ((i3 >> 6) & 112) | 384 | (i3 & 458752));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b;
    }
}
