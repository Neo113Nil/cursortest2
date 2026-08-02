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
final class zzix implements mp70 {
    static final zzix zza = new zzix();
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
    private static final f7r zzl;
    private static final f7r zzm;
    private static final f7r zzn;
    private static final f7r zzo;

    static {
        zzbo b = yil0.b(1);
        HashMap hashMap = new HashMap();
        hashMap.put(b.annotationType(), b);
        zzb = new f7r("appId", sq.a(hashMap));
        zzbo b2 = yil0.b(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(b2.annotationType(), b2);
        zzc = new f7r("appVersion", sq.a(hashMap2));
        zzbo b3 = yil0.b(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(b3.annotationType(), b3);
        zzd = new f7r("firebaseProjectId", sq.a(hashMap3));
        zzbo b4 = yil0.b(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(b4.annotationType(), b4);
        zze = new f7r("mlSdkVersion", sq.a(hashMap4));
        zzbo b5 = yil0.b(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(b5.annotationType(), b5);
        zzf = new f7r("tfliteSchemaVersion", sq.a(hashMap5));
        zzbo b6 = yil0.b(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(b6.annotationType(), b6);
        zzg = new f7r("gcmSenderId", sq.a(hashMap6));
        zzbo b7 = yil0.b(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(b7.annotationType(), b7);
        zzh = new f7r("apiKey", sq.a(hashMap7));
        zzbo b8 = yil0.b(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(b8.annotationType(), b8);
        zzi = new f7r("languages", sq.a(hashMap8));
        zzbo b9 = yil0.b(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(b9.annotationType(), b9);
        zzj = new f7r("mlSdkInstanceId", sq.a(hashMap9));
        zzbo b10 = yil0.b(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(b10.annotationType(), b10);
        zzk = new f7r("isClearcutClient", sq.a(hashMap10));
        zzbo b11 = yil0.b(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(b11.annotationType(), b11);
        zzl = new f7r("isStandaloneMlkit", sq.a(hashMap11));
        zzbo b12 = yil0.b(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(b12.annotationType(), b12);
        zzm = new f7r("isJsonLogging", sq.a(hashMap12));
        zzbo b13 = yil0.b(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(b13.annotationType(), b13);
        zzn = new f7r("buildLevel", sq.a(hashMap13));
        zzbo b14 = yil0.b(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(b14.annotationType(), b14);
        zzo = new f7r("optionalModuleVersion", sq.a(hashMap14));
    }

    private zzix() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        zzob zzobVar = (zzob) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(zzb, zzobVar.zzg());
        np70Var2.add(zzc, zzobVar.zzh());
        np70Var2.add(zzd, (Object) null);
        np70Var2.add(zze, zzobVar.zzj());
        np70Var2.add(zzf, zzobVar.zzk());
        np70Var2.add(zzg, (Object) null);
        np70Var2.add(zzh, (Object) null);
        np70Var2.add(zzi, zzobVar.zza());
        np70Var2.add(zzj, zzobVar.zzi());
        np70Var2.add(zzk, zzobVar.zzb());
        np70Var2.add(zzl, zzobVar.zzd());
        np70Var2.add(zzm, zzobVar.zzc());
        np70Var2.add(zzn, zzobVar.zze());
        np70Var2.add(zzo, zzobVar.zzf());
    }
}
