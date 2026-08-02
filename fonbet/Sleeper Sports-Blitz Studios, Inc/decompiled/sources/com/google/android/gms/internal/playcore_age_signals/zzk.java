package com.google.android.gms.internal.playcore_age_signals;

import android.os.IBinder;
import com.google.android.play.agesignals.protocol.IAgeSignalsService;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.play:age-signals@@0.0.3 */
/* loaded from: classes7.dex */
final class zzk extends zze {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzm zzb;

    zzk(zzm zzmVar, IBinder iBinder) {
        this.zza = iBinder;
        Objects.requireNonNull(zzmVar);
        this.zzb = zzmVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        List list;
        List list2;
        IAgeSignalsService asInterface = IAgeSignalsService.Stub.asInterface(this.zza);
        zzo zzoVar = this.zzb.zza;
        zzoVar.zzn = asInterface;
        zzo.zzr(zzoVar);
        zzoVar.zzh = false;
        list = zzoVar.zze;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = zzoVar.zze;
        list2.clear();
    }
}
