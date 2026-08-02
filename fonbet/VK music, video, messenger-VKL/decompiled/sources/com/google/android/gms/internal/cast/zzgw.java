package com.google.android.gms.internal.cast;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzgw {
    private static final ThreadLocal zza = new zzgq();

    public static zzgw zzb() {
        return (zzgw) zza.get();
    }

    public abstract void zza(zzgt zzgtVar);
}
