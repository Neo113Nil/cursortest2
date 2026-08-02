package com.google.android.gms.internal.mlkit_common;

import java.io.IOException;
import java.util.HashMap;
import xsna.f7r;
import xsna.mp70;
import xsna.np70;
import xsna.sq;
import xsna.yil0;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
final class zzgg implements mp70 {
    static final zzgg zza = new zzgg();
    private static final f7r zzb;

    static {
        zzbo b = yil0.b(1);
        HashMap hashMap = new HashMap();
        hashMap.put(b.annotationType(), b);
        zzb = new f7r("api", sq.a(hashMap));
    }

    private zzgg() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        np70Var.add(zzb, ((zzlb) obj).zza());
    }
}
