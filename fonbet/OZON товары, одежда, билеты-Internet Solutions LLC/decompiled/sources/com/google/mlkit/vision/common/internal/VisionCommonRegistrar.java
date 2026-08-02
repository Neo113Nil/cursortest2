package com.google.mlkit.vision.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import java.util.List;
import n8.C8451a;
import n8.n;

@KeepForSdk
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        C8451a.C1292a a11 = C8451a.a(a.class);
        a11.b(n.l(a.C0914a.class));
        a11.f(b.f60080a);
        return zzp.zzi(a11.d());
    }
}
