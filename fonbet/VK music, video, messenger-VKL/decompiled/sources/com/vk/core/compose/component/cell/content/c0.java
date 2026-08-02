package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.gzs;
import xsna.s3q0;
import xsna.zak0;

/* compiled from: ExtraCheckImpl.kt */
/* loaded from: classes17.dex */
public final class c0 {
    public static final b0 a(boolean z, gzs<s3q0> gzsVar, boolean z2, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(490933468, i, -1, "com.vk.core.compose.component.cell.content.rememberInternal (ExtraCheckImpl.kt:69)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new b0(z, gzsVar, z2, semanticsConfiguration);
            aVar.R(x);
        }
        b0 b0Var = (b0) x;
        ((zak0) b0Var.a).setValue(Boolean.valueOf(z));
        ((zak0) b0Var.b).setValue(gzsVar);
        ((zak0) b0Var.c).setValue(Boolean.valueOf(z2));
        ((zak0) b0Var.d).setValue(semanticsConfiguration);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b0Var;
    }
}
