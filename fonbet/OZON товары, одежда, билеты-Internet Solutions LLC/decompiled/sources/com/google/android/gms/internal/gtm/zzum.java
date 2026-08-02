package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzum {
    private static final zzuk<?> zza = new zzul();
    private static final zzuk<?> zzb;

    static {
        zzuk<?> zzukVar;
        try {
            zzukVar = (zzuk) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzukVar = null;
        }
        zzb = zzukVar;
    }

    static zzuk<?> zza() {
        zzuk<?> zzukVar = zzb;
        if (zzukVar != null) {
            return zzukVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzuk<?> zzb() {
        return zza;
    }
}
