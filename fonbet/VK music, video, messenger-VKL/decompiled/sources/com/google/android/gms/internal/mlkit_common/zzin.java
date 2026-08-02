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
final class zzin implements mp70 {
    static final zzin zza = new zzin();
    private static final f7r zzb;
    private static final f7r zzc;
    private static final f7r zzd;

    static {
        zzbo b = yil0.b(3);
        HashMap hashMap = new HashMap();
        hashMap.put(b.annotationType(), b);
        zzb = new f7r("languageOption", sq.a(hashMap));
        zzbo b2 = yil0.b(4);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(b2.annotationType(), b2);
        zzc = new f7r("isUsingLegacyApi", sq.a(hashMap2));
        zzbo b3 = yil0.b(5);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(b3.annotationType(), b3);
        zzd = new f7r("sdkVersion", sq.a(hashMap3));
    }

    private zzin() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        throw null;
    }
}
