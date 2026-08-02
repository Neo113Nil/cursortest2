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
final class zzfk implements mp70 {
    static final zzfk zza = new zzfk();
    private static final f7r zzb;
    private static final f7r zzc;
    private static final f7r zzd;

    static {
        zzbo b = yil0.b(1);
        HashMap hashMap = new HashMap();
        hashMap.put(b.annotationType(), b);
        zzb = new f7r("modelType", sq.a(hashMap));
        zzbo b2 = yil0.b(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(b2.annotationType(), b2);
        zzc = new f7r("isSuccessful", sq.a(hashMap2));
        zzbo b3 = yil0.b(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(b3.annotationType(), b3);
        zzd = new f7r("modelName", sq.a(hashMap3));
    }

    private zzfk() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        zzke zzkeVar = (zzke) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(zzb, zzkeVar.zza());
        np70Var2.add(zzc, zzkeVar.zzb());
        np70Var2.add(zzd, (Object) null);
    }
}
