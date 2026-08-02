package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes9.dex */
final class zzhn implements zzim {
    final /* synthetic */ zzhp zza;

    zzhn(zzhp zzhpVar) {
        this.zza = zzhpVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzim
    public final void zza(zzgz zzgzVar) {
        this.zza.zzo(zzgzVar.zzb());
        long zzb = zzgzVar.zzb();
        StringBuilder sb2 = new StringBuilder(57);
        sb2.append("Permanent failure dispatching hitId: ");
        sb2.append(zzb);
        zzhl.zzd(sb2.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzim
    public final void zzb(zzgz zzgzVar) {
        Clock clock;
        Clock clock2;
        long zza = zzgzVar.zza();
        if (zza == 0) {
            zzhp zzhpVar = this.zza;
            long zzb = zzgzVar.zzb();
            clock2 = this.zza.zzj;
            zzhp.zzl(zzhpVar, zzb, clock2.currentTimeMillis());
            return;
        }
        long j11 = zza + 14400000;
        clock = this.zza.zzj;
        if (j11 < clock.currentTimeMillis()) {
            this.zza.zzo(zzgzVar.zzb());
            long zzb2 = zzgzVar.zzb();
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("Giving up on failed hitId: ");
            sb2.append(zzb2);
            zzhl.zzd(sb2.toString());
        }
    }
}
