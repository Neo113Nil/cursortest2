package com.google.android.gms.internal.playcore_age_signals;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:age-signals@@0.0.3 */
/* loaded from: classes8.dex */
final class zzi extends zze {
    final /* synthetic */ zzo zza;

    zzi(zzo zzoVar) {
        Objects.requireNonNull(zzoVar);
        this.zza = zzoVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        zzd zzdVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        zzd zzdVar2;
        zzo zzoVar = this.zza;
        obj = zzoVar.zzg;
        synchronized (obj) {
            atomicInteger = zzoVar.zzl;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = zzoVar.zzl;
                if (atomicInteger2.decrementAndGet() > 0) {
                    zzdVar2 = zzoVar.zzc;
                    zzdVar2.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            iInterface = zzoVar.zzn;
            if (iInterface != null) {
                zzdVar = zzoVar.zzc;
                zzdVar.zzc("Unbind from service.", new Object[0]);
                context = zzoVar.zzb;
                serviceConnection = zzoVar.zzm;
                context.unbindService(serviceConnection);
                zzoVar.zzh = false;
                zzoVar.zzn = null;
                zzoVar.zzm = null;
            }
            zzoVar.zzw();
        }
    }
}
