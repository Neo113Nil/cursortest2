package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzabg {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzabh zzabhVar) {
        zzb(zzabhVar);
        this.zza.add(new zzabf(handler, zzabhVar));
    }

    public final void zzb(zzabh zzabhVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zza;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzabf zzabfVar = (zzabf) it.next();
            if (zzabfVar.zzc() == zzabhVar) {
                zzabfVar.zza();
                copyOnWriteArrayList.remove(zzabfVar);
            }
        }
    }

    public final void zzc(final int i, final long j, final long j2) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzabf zzabfVar = (zzabf) it.next();
            if (!zzabfVar.zzd()) {
                zzabfVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzabf.this.zzc().zzX(i, j, j2);
                    }
                });
            }
        }
    }
}
