package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcd;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import xsna.b6m;
import xsna.gzl;
import xsna.i8i;
import xsna.m3q;
import xsna.qa01;
import xsna.qt20;
import xsna.w801;
import xsna.y501;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        i8i.a a = i8i.a(qa01.class);
        a.a(gzl.b(qt20.class));
        a.f = y501.b;
        i8i b = a.b();
        i8i.a a2 = i8i.a(w801.class);
        a2.a(gzl.b(qa01.class));
        a2.a(gzl.b(m3q.class));
        a2.f = b6m.b;
        return zzcd.zzh(b, a2.b());
    }
}
