package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.ehz;
import xsna.ouf0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzbo implements ouf0, zzcs {
    final /* synthetic */ zzbp zza;
    private final zzbn zzb;
    private ehz zzc;
    private boolean zzd = true;

    public zzbo(zzbp zzbpVar, ehz ehzVar, zzbn zzbnVar) {
        this.zza = zzbpVar;
        this.zzc = ehzVar;
        this.zzb = zzbnVar;
    }

    @Override // xsna.ouf0
    public final void accept(Object obj, Object obj2) throws RemoteException {
        ehz.a aVar;
        boolean z;
        zzda zzdaVar = (zzda) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            aVar = this.zzc.b;
            z = this.zzd;
            this.zzc.b = null;
        }
        if (aVar == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            this.zzb.zza(zzdaVar, aVar, z, taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized ehz zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
        ehz.a<?> aVar;
        synchronized (this) {
            this.zzd = false;
            aVar = this.zzc.b;
        }
        if (aVar != null) {
            this.zza.doUnregisterEventListener(aVar, 2441);
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized void zzc(ehz ehzVar) {
        ehz ehzVar2 = this.zzc;
        if (ehzVar2 != ehzVar) {
            ehzVar2.b = null;
            this.zzc = ehzVar;
        }
    }
}
