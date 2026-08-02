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
final class zzkn implements mp70 {
    static final zzkn zza = new zzkn();
    private static final f7r zzb;
    private static final f7r zzc;
    private static final f7r zzd;

    static {
        zzdk a = pft0.a(3);
        HashMap hashMap = new HashMap();
        hashMap.put(a.annotationType(), a);
        zzb = new f7r("languageOption", sq.a(hashMap));
        zzdk a2 = pft0.a(4);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(a2.annotationType(), a2);
        zzc = new f7r("isUsingLegacyApi", sq.a(hashMap2));
        zzdk a3 = pft0.a(5);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(a3.annotationType(), a3);
        zzd = new f7r("sdkVersion", sq.a(hashMap3));
    }

    private zzkn() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        throw null;
    }
}
