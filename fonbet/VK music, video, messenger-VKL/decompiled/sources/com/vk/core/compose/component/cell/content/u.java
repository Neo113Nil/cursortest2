package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.List;
import xsna.efj;
import xsna.gzs;
import xsna.k18;
import xsna.pco;
import xsna.wow;
import xsna.z190;
import xsna.zak0;

/* compiled from: CommonAvatarImpl.kt */
/* loaded from: classes17.dex */
public final class u {
    public static final t a(efj efjVar, List list, float f, k18 k18Var, z190 z190Var, gzs gzsVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2058289488, i, -1, "com.vk.core.compose.component.cell.content.remember (CommonAvatarImpl.kt:112)");
        }
        int i2 = i >> 3;
        int i3 = (i & 896) | (i2 & 14) | ((i >> 6) & 112) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(768813134, i3, -1, "com.vk.core.compose.component.cell.content.rememberInternal (CommonAvatarImpl.kt:173)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            t tVar = new t(efjVar, f, list, k18Var, z190Var, gzsVar, semanticsConfiguration);
            aVar.R(tVar);
            x = tVar;
        }
        t tVar2 = (t) x;
        ((zak0) tVar2.a).setValue(efjVar);
        ((zak0) tVar2.c).setValue(new pco(f));
        ((zak0) tVar2.d).setValue(new wow(list));
        ((zak0) tVar2.e).setValue(k18Var);
        ((zak0) tVar2.f).setValue(z190Var);
        ((zak0) tVar2.g).setValue(gzsVar);
        ((zak0) tVar2.h).setValue(null);
        ((zak0) tVar2.b).setValue(semanticsConfiguration);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return tVar2;
    }
}
