package com.google.android.gms.internal.measurement;

/* loaded from: classes9.dex */
final class zzlp {
    private static final zzlo zza;
    private static final zzlo zzb;

    static {
        zzlo zzloVar;
        try {
            zzloVar = (zzlo) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzloVar = null;
        }
        zza = zzloVar;
        zzb = new zzlo();
    }

    static zzlo zza() {
        return zza;
    }

    static zzlo zzb() {
        return zzb;
    }
}
