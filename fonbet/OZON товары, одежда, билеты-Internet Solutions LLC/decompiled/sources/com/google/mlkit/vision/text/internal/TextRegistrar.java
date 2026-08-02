package com.google.mlkit.vision.text.internal;

import G10.a;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.C5948d;
import com.google.mlkit.common.sdkinternal.h;
import d9.p;
import d9.q;
import d9.t;
import java.util.List;
import n8.C8451a;
import n8.n;

@KeepForSdk
/* loaded from: classes.dex */
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        C8451a.C1292a a11 = C8451a.a(q.class);
        a11.b(n.i(h.class));
        a11.f(new a());
        C8451a d11 = a11.d();
        C8451a.C1292a a12 = C8451a.a(p.class);
        a12.b(n.i(q.class));
        a12.b(n.i(C5948d.class));
        a12.f(new t());
        return zzbk.zzi(d11, a12.d());
    }
}
