package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import xsna.i8i;
import xsna.v2z;

/* compiled from: Logging.kt */
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<i8i<?>> getComponents() {
        return Collections.singletonList(v2z.a("fire-core-ktx", "21.0.0"));
    }
}
