package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.List;
import xsna.efj;
import xsna.fvr;
import xsna.gzs;
import xsna.kqu0;
import xsna.pco;
import xsna.wow;
import xsna.z190;
import xsna.zak0;

/* compiled from: CommonPictureImpl.kt */
/* loaded from: classes17.dex */
public final class a0 {
    public static final z a(efj efjVar, List list, float f, z190 z190Var, PictureRadius pictureRadius, gzs gzsVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1902063283, i, -1, "com.vk.core.compose.component.cell.content.remember (CommonPictureImpl.kt:83)");
        }
        fvr.n();
        com.vk.core.compose.component.defaults.c.a.d(aVar);
        z b = b(efjVar, f, kqu0.s, list, z190Var, pictureRadius, gzsVar, semanticsConfiguration, aVar, ((i >> 3) & 14) | ((i >> 6) & 112) | ((i << 3) & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (i & 29360128));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b;
    }

    public static final z b(efj efjVar, float f, float f2, List list, z190 z190Var, PictureRadius pictureRadius, gzs gzsVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(19801029, i, -1, "com.vk.core.compose.component.cell.content.rememberInternal (CommonPictureImpl.kt:146)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            z zVar = new z(efjVar, f, f2, list, z190Var, pictureRadius, gzsVar, semanticsConfiguration);
            aVar.R(zVar);
            x = zVar;
        }
        z zVar2 = (z) x;
        ((zak0) zVar2.a).setValue(efjVar);
        ((zak0) zVar2.c).setValue(new pco(f));
        ((zak0) zVar2.d).setValue(new pco(f2));
        ((zak0) zVar2.e).setValue(new wow(list));
        ((zak0) zVar2.f).setValue(z190Var);
        ((zak0) zVar2.g).setValue(pictureRadius);
        ((zak0) zVar2.h).setValue(gzsVar);
        ((zak0) zVar2.b).setValue(semanticsConfiguration);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return zVar2;
    }
}
