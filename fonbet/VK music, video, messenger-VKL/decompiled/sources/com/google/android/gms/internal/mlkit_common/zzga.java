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
final class zzga implements mp70 {
    static final zzga zza = new zzga();
    private static final f7r zzb;
    private static final f7r zzc;
    private static final f7r zzd;
    private static final f7r zze;
    private static final f7r zzf;
    private static final f7r zzg;
    private static final f7r zzh;
    private static final f7r zzi;
    private static final f7r zzj;
    private static final f7r zzk;

    static {
        zzbo b = yil0.b(1);
        HashMap hashMap = new HashMap();
        hashMap.put(b.annotationType(), b);
        zzb = new f7r("durationMs", sq.a(hashMap));
        zzbo b2 = yil0.b(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(b2.annotationType(), b2);
        zzc = new f7r("errorCode", sq.a(hashMap2));
        zzbo b3 = yil0.b(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(b3.annotationType(), b3);
        zzd = new f7r("isColdCall", sq.a(hashMap3));
        zzbo b4 = yil0.b(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(b4.annotationType(), b4);
        zze = new f7r("autoManageModelOnBackground", sq.a(hashMap4));
        zzbo b5 = yil0.b(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(b5.annotationType(), b5);
        zzf = new f7r("autoManageModelOnLowMemory", sq.a(hashMap5));
        zzbo b6 = yil0.b(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(b6.annotationType(), b6);
        zzg = new f7r("isNnApiEnabled", sq.a(hashMap6));
        zzbo b7 = yil0.b(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(b7.annotationType(), b7);
        zzh = new f7r("eventsCount", sq.a(hashMap7));
        zzbo b8 = yil0.b(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(b8.annotationType(), b8);
        zzi = new f7r("otherErrors", sq.a(hashMap8));
        zzbo b9 = yil0.b(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(b9.annotationType(), b9);
        zzj = new f7r("remoteConfigValueForAcceleration", sq.a(hashMap9));
        zzbo b10 = yil0.b(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(b10.annotationType(), b10);
        zzk = new f7r("isAccelerated", sq.a(hashMap10));
    }

    private zzga() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        throw null;
    }
}
