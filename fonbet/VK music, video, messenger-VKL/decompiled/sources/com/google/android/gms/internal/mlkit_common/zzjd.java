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
final class zzjd implements mp70 {
    static final zzjd zza = new zzjd();
    private static final f7r zzb;
    private static final f7r zzc;

    static {
        zzbo b = yil0.b(1);
        HashMap hashMap = new HashMap();
        hashMap.put(b.annotationType(), b);
        zzb = new f7r("sourceLanguage", sq.a(hashMap));
        zzbo b2 = yil0.b(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(b2.annotationType(), b2);
        zzc = new f7r("targetLanguage", sq.a(hashMap2));
    }

    private zzjd() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        throw null;
    }
}
