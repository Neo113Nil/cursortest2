package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzgg implements Runnable {
    final /* synthetic */ zzgq zza;

    zzgg(zzgq zzgqVar) {
        this.zza = zzgqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        zzhz zzhzVar;
        i11 = this.zza.zzm;
        if (i11 == 2) {
            zzhzVar = this.zza.zzl;
            zzhzVar.zze();
        }
    }
}
