package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzieo {
    zzieo() {
    }

    public static final List zza(Object obj, long j) {
        zzied zziedVar = (zzied) zzigo.zzn(obj, j);
        if (zziedVar.zza()) {
            return zziedVar;
        }
        int size = zziedVar.size();
        zzied zzh = zziedVar.zzh(size == 0 ? 10 : size + size);
        zzigo.zzo(obj, j, zzh);
        return zzh;
    }
}
