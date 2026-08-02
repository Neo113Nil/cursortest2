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
final class zzhw implements mp70 {
    static final zzhw zza = new zzhw();
    private static final f7r zzb;
    private static final f7r zzc;
    private static final f7r zzd;
    private static final f7r zze;

    static {
        zzdk a = pft0.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(a.annotationType(), a);
        zzb = new f7r("imageFormat", sq.a(hashMap));
        zzdk a2 = pft0.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(a2.annotationType(), a2);
        zzc = new f7r("originalImageSize", sq.a(hashMap2));
        zzdk a3 = pft0.a(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(a3.annotationType(), a3);
        zzd = new f7r("compressedImageSize", sq.a(hashMap3));
        zzdk a4 = pft0.a(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(a4.annotationType(), a4);
        zze = new f7r("isOdmlImage", sq.a(hashMap4));
    }

    private zzhw() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        zzmq zzmqVar = (zzmq) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(zzb, zzmqVar.zza());
        np70Var2.add(zzc, zzmqVar.zzb());
        np70Var2.add(zzd, (Object) null);
        np70Var2.add(zze, (Object) null);
    }
}
