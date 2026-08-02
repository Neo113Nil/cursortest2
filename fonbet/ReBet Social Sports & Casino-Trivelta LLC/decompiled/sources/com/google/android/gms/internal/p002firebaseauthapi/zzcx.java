package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzcx implements zzpz<zzba, zzba> {
    private static final zzcx zza = new zzcx();
    private static final zzps<zzof, zzba> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzda
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzia.zza((zzof) zzbiVar);
        }
    }, zzof.class, zzba.class);

    public static void zzc() {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzba> zza() {
        return zzba.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzba> zzb() {
        return zzba.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final /* synthetic */ zzba zza(zzob zzobVar, zzok zzokVar, zzqc<zzba> zzqcVar) {
        zzoo zzooVar;
        zzoo zzooVar2;
        zzaaj zzc;
        zzpn zzpnVar = new zzpn();
        for (int i10 = 0; i10 < zzobVar.zza(); i10++) {
            zzoa zza2 = zzobVar.zza(i10);
            if (zza2.zzc().equals(zzbk.zza)) {
                zzbi zzb2 = zza2.zzb();
                if (zzb2 instanceof zzcw) {
                    zzc = ((zzcw) zzb2).zzd();
                } else {
                    if (!(zzb2 instanceof zzof)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzb2.getClass().getName() + " with parameters " + String.valueOf(zzb2.zza()));
                    }
                    zzc = ((zzof) zzb2).zzc();
                }
                zzpnVar.zza(zzc, new zzcz(zzqcVar.zza(zza2), zza2.zza()));
            }
        }
        if (zzokVar.zza()) {
            zzooVar = zzon.zza;
            zzooVar2 = zzooVar;
        } else {
            zzol zza3 = zzow.zzb().zza();
            zzoo zza4 = zza3.zza(zzobVar, zzokVar, "aead", "encrypt");
            zzooVar2 = zza3.zza(zzobVar, zzokVar, "aead", "decrypt");
            zzooVar = zza4;
        }
        return new zzdc(new zzcz(zzqcVar.zza(zzobVar.zzc()), zzobVar.zzc().zza()), zzpnVar.zza(), zzooVar, zzooVar2);
    }

    public static void zza(zzpy zzpyVar) {
        zzpyVar.zza(zza);
    }
}
