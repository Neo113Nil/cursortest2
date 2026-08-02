package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.SessionState;
import java.util.Objects;
import xsna.pxi0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzx extends pxi0 {
    final /* synthetic */ zzy zza;

    public zzx(zzy zzyVar) {
        Objects.requireNonNull(zzyVar);
        this.zza = zzyVar;
    }

    @Override // xsna.pxi0
    public final void onTransferFailed(int i, int i2) {
        zzcr zzcrVar = new zzcr(11);
        zzcrVar.zza(Integer.valueOf(i2));
        zzy zzyVar = this.zza;
        zzcrVar.zzb(Boolean.valueOf(zzyVar.zzd().zze()));
        zzyVar.zza(new zzcs(zzcrVar));
    }

    @Override // xsna.pxi0
    public final void onTransferring(int i) {
        zzcr zzcrVar = new zzcr(10);
        zzy zzyVar = this.zza;
        zzcrVar.zzb(Boolean.valueOf(zzyVar.zzd().zze()));
        zzyVar.zza(new zzcs(zzcrVar));
        zzyVar.zzb().zzc(new zzac(new zzab(i)));
    }

    @Override // xsna.pxi0
    public final void onTransferred(int i, SessionState sessionState) {
    }
}
