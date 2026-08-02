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
final class zzgf implements mp70 {
    static final zzgf zza = new zzgf();
    private static final f7r zzb;
    private static final f7r zzc;
    private static final f7r zzd;

    static {
        zzai b = zyk0.b(1);
        HashMap hashMap = new HashMap();
        hashMap.put(b.annotationType(), b);
        zzb = new f7r("detectorMode", sq.a(hashMap));
        zzai b2 = zyk0.b(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(b2.annotationType(), b2);
        zzc = new f7r("streamModeSmoothingRatio", sq.a(hashMap2));
        zzai b3 = zyk0.b(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(b3.annotationType(), b3);
        zzd = new f7r("rawSizeMaskEnabled", sq.a(hashMap3));
    }

    private zzgf() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        throw null;
    }
}
