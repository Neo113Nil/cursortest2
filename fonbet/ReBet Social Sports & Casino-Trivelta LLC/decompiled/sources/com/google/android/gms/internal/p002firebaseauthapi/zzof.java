package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzof extends zzbi {
    private final zzqb zza;

    public static class zza extends zzcb {
        private final String zza;
        private final zzxz zzb;

        public final String toString() {
            String str = this.zza;
            int i10 = zzoe.zza[this.zzb.ordinal()];
            return String.format("(typeUrl=%s, outputPrefixType=%s)", str, i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
        public final boolean zza() {
            return this.zzb != zzxz.RAW;
        }

        private zza(String str, zzxz zzxzVar) {
            this.zza = str;
            this.zzb = zzxzVar;
        }
    }

    public zzof(zzqb zzqbVar, zzch zzchVar) {
        zza(zzqbVar, zzchVar);
        this.zza = zzqbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final zzcb zza() {
        return new zza(this.zza.zzf(), this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzaaj zzc() {
        zzqb zzqbVar = this.zza;
        if (zzqbVar.zzb().equals(zzxz.RAW)) {
            return zzaaj.zza(new byte[0]);
        }
        if (zzqbVar.zzb().equals(zzxz.TINK)) {
            return zzpe.zzb(zzqbVar.zze().intValue());
        }
        if (zzqbVar.zzb().equals(zzxz.LEGACY) || zzqbVar.zzb().equals(zzxz.CRUNCHY)) {
            return zzpe.zza(zzqbVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    public final zzqb zza(zzch zzchVar) {
        zza(this.zza, zzchVar);
        return this.zza;
    }

    private static void zza(zzqb zzqbVar, zzch zzchVar) {
        int i10 = zzoe.zzb[zzqbVar.zza().ordinal()];
        if (i10 == 1 || i10 == 2) {
            zzch.zza(zzchVar);
        }
    }
}
