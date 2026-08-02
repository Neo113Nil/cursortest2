package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdzc implements zzfoz {
    private final zzdyu zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdzc(zzdyu zzdyuVar, Set set, Clock clock) {
        this.zzb = zzdyuVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdzb zzdzbVar = (zzdzb) it.next();
            this.zzd.put(zzdzbVar.zzc(), zzdzbVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfos zzfosVar, boolean z) {
        zzdzb zzdzbVar = (zzdzb) this.zzd.get(zzfosVar);
        if (zzdzbVar == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        Map map = this.zza;
        zzfos zzb = zzdzbVar.zzb();
        if (map.containsKey(zzb)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzb)).longValue();
            zzdyu zzdyuVar = this.zzb;
            String zza = zzdzbVar.zza();
            Map zzc = zzdyuVar.zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(elapsedRealtime);
            zzc.put("label.".concat(zza), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdL(zzfos zzfosVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdM(zzfos zzfosVar, String str) {
        this.zza.put(zzfosVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdN(zzfos zzfosVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfosVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfosVar)).longValue();
            Map zzc = this.zzb.zzc();
            String.valueOf(str);
            String valueOf = String.valueOf(str);
            String l = Long.toString(elapsedRealtime);
            String.valueOf(l);
            zzc.put("task.".concat(valueOf), "f.".concat(String.valueOf(l)));
        }
        if (this.zzd.containsKey(zzfosVar)) {
            zze(zzfosVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdO(zzfos zzfosVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfosVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfosVar)).longValue();
            Map zzc = this.zzb.zzc();
            String.valueOf(str);
            String valueOf = String.valueOf(str);
            String l = Long.toString(elapsedRealtime);
            String.valueOf(l);
            zzc.put("task.".concat(valueOf), "s.".concat(String.valueOf(l)));
        }
        if (this.zzd.containsKey(zzfosVar)) {
            zze(zzfosVar, true);
        }
    }
}
