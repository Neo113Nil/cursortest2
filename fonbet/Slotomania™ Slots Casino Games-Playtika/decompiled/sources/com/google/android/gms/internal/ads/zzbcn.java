package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbcn extends zzbcy {
    public zzbcn(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2) {
        super(zzbblVar, "sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", zzaxfVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzaxf zzaxfVar = this.zzd;
            int i = 1;
            if (true == booleanValue) {
                i = 2;
            }
            zzaxfVar.zzah(i);
        } catch (InvocationTargetException unused) {
            this.zzd.zzah(3);
        }
    }
}
