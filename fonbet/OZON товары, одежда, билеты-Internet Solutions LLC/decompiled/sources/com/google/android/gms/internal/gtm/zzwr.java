package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzwr {
    private static final zzwq zza;
    private static final zzwq zzb;

    static {
        zzwq zzwqVar;
        try {
            zzwqVar = (zzwq) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzwqVar = null;
        }
        zza = zzwqVar;
        zzb = new zzwq();
    }

    static zzwq zza() {
        return zza;
    }

    static zzwq zzb() {
        return zzb;
    }
}
