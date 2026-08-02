package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.BleDevice;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzda extends zzk {
    final /* synthetic */ BleDevice zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdf zzdfVar, c cVar, BleDevice bleDevice) {
        super(cVar);
        this.zza = bleDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final void doExecute(a.b bVar) throws RemoteException {
        zzfb zzfbVar = new zzfb(this);
        zzcd zzcdVar = (zzcd) ((zzm) bVar).getService();
        BleDevice bleDevice = this.zza;
        zzcdVar.zzd(new com.google.android.gms.fitness.request.zzf(bleDevice.b, bleDevice, (zzcw) zzfbVar));
    }
}
