package com.google.mlkit.vision.barcode.internal;

import B1.C2548q;
import Z8.c;
import Z8.f;
import Z8.h;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.C5948d;
import java.util.List;
import n8.C8451a;
import n8.n;

@KeepForSdk
/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        C8451a.C1292a a11 = C8451a.a(h.class);
        a11.b(n.i(com.google.mlkit.common.sdkinternal.h.class));
        a11.f(new C2548q());
        C8451a d11 = a11.d();
        C8451a.C1292a a12 = C8451a.a(f.class);
        a12.b(n.i(h.class));
        a12.b(n.i(C5948d.class));
        a12.b(n.i(com.google.mlkit.common.sdkinternal.h.class));
        a12.f(new c());
        return zzcs.zzh(d11, a12.d());
    }
}
