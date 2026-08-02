package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzatk implements zzasw {
    private final Map zza = new HashMap();
    private final zzasj zzb;
    private final BlockingQueue zzc;
    private final zzaso zzd;

    zzatk(zzasj zzasjVar, BlockingQueue blockingQueue, zzaso zzasoVar) {
        this.zzd = zzasoVar;
        this.zzb = zzasjVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void zza(zzasx zzasxVar, zzatd zzatdVar) {
        List list;
        zzasg zzasgVar = zzatdVar.zzb;
        if (zzasgVar == null || zzasgVar.zza(System.currentTimeMillis())) {
            zzb(zzasxVar);
            return;
        }
        String zzi = zzasxVar.zzi();
        synchronized (this) {
            list = (List) this.zza.remove(zzi);
        }
        if (list != null) {
            if (zzatj.zzb) {
                zzatj.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzi);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zza((zzasx) it.next(), zzatdVar, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void zzb(zzasx zzasxVar) {
        Map map = this.zza;
        String zzi = zzasxVar.zzi();
        List list = (List) map.remove(zzi);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzatj.zzb) {
            zzatj.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzi);
        }
        zzasx zzasxVar2 = (zzasx) list.remove(0);
        map.put(zzi, list);
        zzasxVar2.zzu(this);
        try {
            this.zzc.put(zzasxVar2);
        } catch (InterruptedException e) {
            zzatj.zzc("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zza();
        }
    }

    final synchronized boolean zzc(zzasx zzasxVar) {
        Map map = this.zza;
        String zzi = zzasxVar.zzi();
        if (!map.containsKey(zzi)) {
            map.put(zzi, null);
            zzasxVar.zzu(this);
            if (zzatj.zzb) {
                zzatj.zzb("new request, sending to network %s", zzi);
            }
            return false;
        }
        List list = (List) map.get(zzi);
        if (list == null) {
            list = new ArrayList();
        }
        zzasxVar.zzc("waiting-for-response");
        list.add(zzasxVar);
        map.put(zzi, list);
        if (zzatj.zzb) {
            zzatj.zzb("Request for cacheKey=%s is in flight, putting on hold.", zzi);
        }
        return true;
    }
}
