package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbcc extends zzbcy {
    private final long zzh;

    public zzbcc(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, long j, int i, int i2) {
        super(zzbblVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", zzaxfVar, i, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        zzaxf zzaxfVar = this.zzd;
        synchronized (zzaxfVar) {
            zzaxfVar.zzac(longValue);
            long j = this.zzh;
            if (j != 0) {
                zzaxfVar.zzk(longValue - j);
                zzaxfVar.zzn(j);
            }
        }
    }
}
