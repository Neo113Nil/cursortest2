package com.google.android.gms.internal.mlkit_vision_common;

import java.io.IOException;
import java.util.HashMap;
import xsna.f7r;
import xsna.mp70;
import xsna.np70;
import xsna.sq;
import xsna.zyk0;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes12.dex */
final class zzgu implements mp70 {
    static final zzgu zza = new zzgu();
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
        zzai b = zyk0.b(1);
        HashMap hashMap = new HashMap();
        hashMap.put(b.annotationType(), b);
        zzb = new f7r("appId", sq.a(hashMap));
        zzai b2 = zyk0.b(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(b2.annotationType(), b2);
        zzc = new f7r("appVersion", sq.a(hashMap2));
        zzai b3 = zyk0.b(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(b3.annotationType(), b3);
        zzd = new f7r("firebaseProjectId", sq.a(hashMap3));
        zzai b4 = zyk0.b(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(b4.annotationType(), b4);
        zze = new f7r("mlSdkVersion", sq.a(hashMap4));
        zzai b5 = zyk0.b(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(b5.annotationType(), b5);
        zzf = new f7r("tfliteSchemaVersion", sq.a(hashMap5));
        zzai b6 = zyk0.b(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(b6.annotationType(), b6);
        zzg = new f7r("gcmSenderId", sq.a(hashMap6));
        zzai b7 = zyk0.b(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(b7.annotationType(), b7);
        zzh = new f7r("apiKey", sq.a(hashMap7));
        zzai b8 = zyk0.b(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(b8.annotationType(), b8);
        zzi = new f7r("languages", sq.a(hashMap8));
        zzai b9 = zyk0.b(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(b9.annotationType(), b9);
        zzj = new f7r("mlSdkInstanceId", sq.a(hashMap9));
        zzai b10 = zyk0.b(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(b10.annotationType(), b10);
        zzk = new f7r("isClearcutClient", sq.a(hashMap10));
        zzai b11 = zyk0.b(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(b11.annotationType(), b11);
        zzl = new f7r("isStandaloneMlkit", sq.a(hashMap11));
        zzai b12 = zyk0.b(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(b12.annotationType(), b12);
        zzm = new f7r("isJsonLogging", sq.a(hashMap12));
        zzai b13 = zyk0.b(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(b13.annotationType(), b13);
        zzn = new f7r("buildLevel", sq.a(hashMap13));
        zzai b14 = zyk0.b(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(b14.annotationType(), b14);
        zzo = new f7r("optionalModuleVersion", sq.a(hashMap14));
    }

    private zzgu() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        zzla zzlaVar = (zzla) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(zzb, zzlaVar.zzg());
        np70Var2.add(zzc, zzlaVar.zzh());
        np70Var2.add(zzd, (Object) null);
        np70Var2.add(zze, zzlaVar.zzj());
        np70Var2.add(zzf, zzlaVar.zzk());
        np70Var2.add(zzg, (Object) null);
        np70Var2.add(zzh, (Object) null);
        np70Var2.add(zzi, zzlaVar.zza());
        np70Var2.add(zzj, zzlaVar.zzi());
        np70Var2.add(zzk, zzlaVar.zzb());
        np70Var2.add(zzl, zzlaVar.zzd());
        np70Var2.add(zzm, zzlaVar.zzc());
        np70Var2.add(zzn, zzlaVar.zze());
        np70Var2.add(zzo, zzlaVar.zzf());
    }
}
