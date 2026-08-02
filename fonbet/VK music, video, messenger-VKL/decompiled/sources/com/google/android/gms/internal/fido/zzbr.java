package com.google.android.gms.internal.fido;

import xsna.zr;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
final class zzbr implements zzbp {
    private static final zzbp zza = new zzbp() { // from class: com.google.android.gms.internal.fido.zzbq
        @Override // com.google.android.gms.internal.fido.zzbp
        public final Object zza() {
            throw null;
        }
    };
    private volatile zzbp zzb;

    public zzbr(zzbp zzbpVar) {
        this.zzb = zzbpVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned null>";
        }
        return zr.a("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    @Override // com.google.android.gms.internal.fido.zzbp
    public final Object zza() {
        throw null;
    }
}
