package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
final class zzgd {
    private static final zzgc zza;
    private static final zzgc zzb;

    static {
        zzgc zzgcVar = null;
        try {
            zzgcVar = (zzgc) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzgcVar;
        zzb = new zzgc();
    }

    public static zzgc zza() {
        return zza;
    }

    public static zzgc zzb() {
        return zzb;
    }
}
