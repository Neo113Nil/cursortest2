package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzjh implements Runnable {
    final /* synthetic */ zzji zza;

    zzjh(zzji zzjiVar) {
        this.zza = zzjiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        map = this.zza.zza;
        if (map.isEmpty()) {
            zzhl.zze("TagManagerBackend dispatch called without loaded container.");
            return;
        }
        map2 = this.zza.zza;
        Iterator it = map2.values().iterator();
        while (it.hasNext()) {
            ((zzgq) it.next()).zzs();
        }
    }
}
