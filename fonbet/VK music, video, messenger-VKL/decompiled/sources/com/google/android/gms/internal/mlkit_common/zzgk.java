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
final class zzgk implements mp70 {
    static final zzgk zza = new zzgk();
    private static final f7r zzb;
    private static final f7r zzc;
    private static final f7r zzd;
    private static final f7r zze;

    static {
        zzbo b = yil0.b(1);
        HashMap hashMap = new HashMap();
        hashMap.put(b.annotationType(), b);
        zzb = new f7r("modelInfo", sq.a(hashMap));
        zzbo b2 = yil0.b(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(b2.annotationType(), b2);
        zzc = new f7r("initialDownloadConditions", sq.a(hashMap2));
        zzbo b3 = yil0.b(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(b3.annotationType(), b3);
        zzd = new f7r("updateDownloadConditions", sq.a(hashMap3));
        zzbo b4 = yil0.b(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(b4.annotationType(), b4);
        zze = new f7r("isModelUpdateEnabled", sq.a(hashMap4));
    }

    private zzgk() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        np70 np70Var2 = np70Var;
        np70Var2.add(zzb, ((zzlt) obj).zza());
        np70Var2.add(zzc, (Object) null);
        np70Var2.add(zzd, (Object) null);
        np70Var2.add(zze, (Object) null);
    }
}
