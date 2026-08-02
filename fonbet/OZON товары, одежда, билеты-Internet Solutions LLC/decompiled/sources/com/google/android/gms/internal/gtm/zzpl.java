package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzpl {

    @VisibleForTesting
    final Map<String, zzpk<zzqg>> zza;
    private final Context zzb;
    private final zzpx zzc;
    private final Clock zzd;
    private final Map<String, zzqd> zze;

    public zzpl(Context context) {
        HashMap hashMap = new HashMap();
        zzpx zzpxVar = new zzpx(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zza = new HashMap();
        this.zzb = context.getApplicationContext();
        this.zzd = defaultClock;
        this.zzc = zzpxVar;
        this.zze = hashMap;
    }

    @VisibleForTesting
    final void zzb(zzpq zzpqVar, List<Integer> list, int i11, zzpi zzpiVar, zzgs zzgsVar) {
        if (i11 == 0) {
            zzhl.zzd("Starting to fetch a new resource");
            i11 = 0;
        }
        int i12 = i11;
        if (i12 >= list.size()) {
            String valueOf = String.valueOf(zzpqVar.zza().zzb());
            String concat = valueOf.length() != 0 ? "There is no valid resource for the container: ".concat(valueOf) : new String("There is no valid resource for the container: ");
            zzhl.zzd(concat);
            zzpiVar.zza(new zzps(new Status(16, concat), list.get(i12 - 1).intValue(), null, null));
            return;
        }
        int intValue = list.get(i12).intValue();
        if (intValue == 0) {
            zzpe zza = zzpqVar.zza();
            zzpk<zzqg> zzpkVar = this.zza.get(zza.zzb());
            if (!zzpqVar.zza().zzg()) {
                if ((zzpkVar != null ? zzpkVar.zza() : this.zzc.zza(zza.zzb())) + 900000 >= this.zzd.currentTimeMillis()) {
                    zzb(zzpqVar, list, i12 + 1, zzpiVar, zzgsVar);
                    return;
                }
            }
            zzqd zzqdVar = this.zze.get(zzpqVar.zzc());
            if (zzqdVar == null) {
                zzqdVar = new zzqd();
                this.zze.put(zzpqVar.zzc(), zzqdVar);
            }
            String zzb = zza.zzb();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 43);
            sb2.append("Attempting to fetch container ");
            sb2.append(zzb);
            sb2.append(" from network");
            zzhl.zzd(sb2.toString());
            zzqdVar.zza(this.zzb, zzpqVar, 0L, new zzpj(this, 0, zzpqVar, zzpp.zza, list, i12, zzpiVar, zzgsVar));
            return;
        }
        if (intValue == 1) {
            zzpe zza2 = zzpqVar.zza();
            String zzb2 = zza2.zzb();
            StringBuilder sb3 = new StringBuilder(String.valueOf(zzb2).length() + 52);
            sb3.append("Attempting to fetch container ");
            sb3.append(zzb2);
            sb3.append(" from a saved resource");
            zzhl.zzd(sb3.toString());
            this.zzc.zze(zza2.zzd(), new zzpj(this, 1, zzpqVar, zzpp.zza, list, i12, zzpiVar, null));
            return;
        }
        if (intValue != 2) {
            StringBuilder sb4 = new StringBuilder(36);
            sb4.append("Unknown fetching source: ");
            sb4.append(i12);
            throw new UnsupportedOperationException(sb4.toString());
        }
        zzpe zza3 = zzpqVar.zza();
        String zzb3 = zza3.zzb();
        StringBuilder sb5 = new StringBuilder(String.valueOf(zzb3).length() + 56);
        sb5.append("Attempting to fetch container ");
        sb5.append(zzb3);
        sb5.append(" from the default resource");
        zzhl.zzd(sb5.toString());
        this.zzc.zzc(zza3.zzd(), zza3.zzc(), new zzpj(this, 2, zzpqVar, zzpp.zza, list, i12, zzpiVar, null));
    }

    public final void zzc(String str, String str2, String str3, List<Integer> list, zzpi zzpiVar, zzgs zzgsVar) {
        Preconditions.checkArgument(!list.isEmpty());
        zzpq zzpqVar = new zzpq();
        zzhs zza = zzhs.zza();
        zzpqVar.zzb(new zzpe(str, str2, str3, zza.zzd() && str.equals(zza.zzc()), zzhs.zza().zzb(), ""));
        zzb(zzpqVar, Collections.unmodifiableList(list), 0, zzpiVar, zzgsVar);
    }

    @VisibleForTesting
    final void zzd(Status status, zzpr zzprVar) {
        String zzb = zzprVar.zzb().zzb();
        zzqg zzc = zzprVar.zzc();
        if (!this.zza.containsKey(zzb)) {
            this.zza.put(zzb, new zzpk<>(status, zzc, this.zzd.currentTimeMillis()));
            return;
        }
        zzpk<zzqg> zzpkVar = this.zza.get(zzb);
        zzpkVar.zzc(this.zzd.currentTimeMillis());
        if (status == Status.RESULT_SUCCESS) {
            zzpkVar.zzd(status);
            zzpkVar.zzb(zzc);
        }
    }
}
