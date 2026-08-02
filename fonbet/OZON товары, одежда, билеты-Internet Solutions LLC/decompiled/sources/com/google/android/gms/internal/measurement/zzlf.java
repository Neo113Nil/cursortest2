package com.google.android.gms.internal.measurement;

/* loaded from: classes9.dex */
final class zzlf {
    private static final zzle zza;
    private static final zzle zzb;

    static {
        zzle zzleVar;
        try {
            zzleVar = (zzle) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzleVar = null;
        }
        zza = zzleVar;
        zzb = new zzle();
    }

    static zzle zza() {
        return zza;
    }

    static zzle zzb() {
        return zzb;
    }
}
