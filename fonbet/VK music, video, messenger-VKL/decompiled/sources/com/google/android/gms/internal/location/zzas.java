package com.google.android.gms.internal.location;

import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzas implements zzcs {
    private ehz zza;

    public zzas(ehz ehzVar) {
        this.zza = ehzVar;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized ehz zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized void zzc(ehz ehzVar) {
        ehz ehzVar2 = this.zza;
        if (ehzVar2 != ehzVar) {
            ehzVar2.b = null;
            this.zza = ehzVar;
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
    }
}
