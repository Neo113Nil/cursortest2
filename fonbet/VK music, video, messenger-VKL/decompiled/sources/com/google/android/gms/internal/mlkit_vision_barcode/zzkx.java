package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import java.util.HashMap;
import xsna.f7r;
import xsna.mp70;
import xsna.np70;
import xsna.pft0;
import xsna.sq;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
final class zzkx implements mp70 {
    static final zzkx zza = new zzkx();
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
        zzdk a = pft0.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(a.annotationType(), a);
        zzb = new f7r("appId", sq.a(hashMap));
        zzdk a2 = pft0.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(a2.annotationType(), a2);
        zzc = new f7r("appVersion", sq.a(hashMap2));
        zzdk a3 = pft0.a(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(a3.annotationType(), a3);
        zzd = new f7r("firebaseProjectId", sq.a(hashMap3));
        zzdk a4 = pft0.a(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(a4.annotationType(), a4);
        zze = new f7r("mlSdkVersion", sq.a(hashMap4));
        zzdk a5 = pft0.a(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(a5.annotationType(), a5);
        zzf = new f7r("tfliteSchemaVersion", sq.a(hashMap5));
        zzdk a6 = pft0.a(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(a6.annotationType(), a6);
        zzg = new f7r("gcmSenderId", sq.a(hashMap6));
        zzdk a7 = pft0.a(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(a7.annotationType(), a7);
        zzh = new f7r("apiKey", sq.a(hashMap7));
        zzdk a8 = pft0.a(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(a8.annotationType(), a8);
        zzi = new f7r("languages", sq.a(hashMap8));
        zzdk a9 = pft0.a(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(a9.annotationType(), a9);
        zzj = new f7r("mlSdkInstanceId", sq.a(hashMap9));
        zzdk a10 = pft0.a(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(a10.annotationType(), a10);
        zzk = new f7r("isClearcutClient", sq.a(hashMap10));
        zzdk a11 = pft0.a(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(a11.annotationType(), a11);
        zzl = new f7r("isStandaloneMlkit", sq.a(hashMap11));
        zzdk a12 = pft0.a(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(a12.annotationType(), a12);
        zzm = new f7r("isJsonLogging", sq.a(hashMap12));
        zzdk a13 = pft0.a(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(a13.annotationType(), a13);
        zzn = new f7r("buildLevel", sq.a(hashMap13));
        zzdk a14 = pft0.a(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(a14.annotationType(), a14);
        zzo = new f7r("optionalModuleVersion", sq.a(hashMap14));
    }

    private zzkx() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        zzpz zzpzVar = (zzpz) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(zzb, zzpzVar.zzg());
        np70Var2.add(zzc, zzpzVar.zzh());
        np70Var2.add(zzd, (Object) null);
        np70Var2.add(zze, zzpzVar.zzj());
        np70Var2.add(zzf, zzpzVar.zzk());
        np70Var2.add(zzg, (Object) null);
        np70Var2.add(zzh, (Object) null);
        np70Var2.add(zzi, zzpzVar.zza());
        np70Var2.add(zzj, zzpzVar.zzi());
        np70Var2.add(zzk, zzpzVar.zzb());
        np70Var2.add(zzl, zzpzVar.zzd());
        np70Var2.add(zzm, zzpzVar.zzc());
        np70Var2.add(zzn, zzpzVar.zze());
        np70Var2.add(zzo, zzpzVar.zzf());
    }
}
