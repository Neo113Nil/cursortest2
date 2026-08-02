package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzhkp {
    final zzhkq zza;
    final long[] zzb;

    zzhkp() {
        this(new zzhkq(), new long[10]);
    }

    zzhkp(zzhkq zzhkqVar, long[] jArr) {
        this.zza = zzhkqVar;
        this.zzb = jArr;
    }

    zzhkp(zzhkp zzhkpVar) {
        this.zza = new zzhkq(zzhkpVar.zza);
        this.zzb = Arrays.copyOf(zzhkpVar.zzb, 10);
    }
}
