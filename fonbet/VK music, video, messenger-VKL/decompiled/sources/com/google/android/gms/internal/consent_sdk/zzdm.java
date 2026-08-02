package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes12.dex */
public final class zzdm implements zzdq {
    private static final Object zza = new Object();
    private volatile zzdq zzb;
    private volatile Object zzc = zza;

    private zzdm(zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public static zzdq zzb(zzdq zzdqVar) {
        return zzdqVar instanceof zzdm ? zzdqVar : new zzdm(zzdqVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        Object obj;
        Object obj2 = this.zzc;
        Object obj3 = zza;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.zzc;
                if (obj == obj3) {
                    obj = this.zzb.zza();
                    Object obj4 = this.zzc;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
