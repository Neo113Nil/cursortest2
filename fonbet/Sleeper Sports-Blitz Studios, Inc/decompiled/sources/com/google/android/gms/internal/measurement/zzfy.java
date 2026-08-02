package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzfy {
    private static zzfx zza;

    public static synchronized zzfx zza() {
        zzfx zzfxVar;
        synchronized (zzfy.class) {
            if (zza == null) {
                zza(new zzga());
            }
            zzfxVar = zza;
        }
        return zzfxVar;
    }

    private static synchronized void zza(zzfx zzfxVar) {
        synchronized (zzfy.class) {
            if (zza != null) {
                throw new IllegalStateException("init() already called");
            }
            zza = zzfxVar;
        }
    }
}
