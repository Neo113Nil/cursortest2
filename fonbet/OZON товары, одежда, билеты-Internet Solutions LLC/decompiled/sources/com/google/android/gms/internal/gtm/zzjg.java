package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzjg implements Runnable {
    final /* synthetic */ zzgx zza;
    final /* synthetic */ zzji zzb;

    zzjg(zzji zzjiVar, zzgx zzgxVar) {
        this.zzb = zzjiVar;
        this.zza = zzgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        map = this.zzb.zza;
        if (map.isEmpty()) {
            zzhl.zza("TagManagerBackend emit called without loaded container.");
            return;
        }
        map2 = this.zzb.zza;
        Iterator it = map2.values().iterator();
        while (it.hasNext()) {
            ((zzgq) it.next()).zzt(this.zza);
        }
    }
}
