package com.google.mlkit.vision.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import java.util.List;
import xsna.ey2;
import xsna.gzl;
import xsna.i8i;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        i8i.a a = i8i.a(a.class);
        a.a(new gzl(2, 0, a.C0149a.class));
        a.f = ey2.e;
        return zzp.zzi(a.b());
    }
}
