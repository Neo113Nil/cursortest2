package com.google.android.gms.measurement.internal;

import N3.C3661l;
import T7.E;
import U7.C4056a;
import android.os.Bundle;
import androidx.collection.C5132a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzgk zzgkVar) {
        super(zzgkVar);
        this.zzb = new C5132a();
        this.zza = new C5132a();
    }

    static /* synthetic */ void zza(zzd zzdVar, String str, long j11) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j11;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            C4056a.a(zzdVar.zzs, "Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j11));
        }
    }

    static /* synthetic */ void zzb(zzd zzdVar, String str, long j11) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num == null) {
            zzdVar.zzs.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zziw zzj = zzdVar.zzs.zzs().zzj(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            zzdVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzb.remove(str);
        Long l11 = (Long) zzdVar.zza.get(str);
        if (l11 == null) {
            C3661l.b(zzdVar.zzs, "First ad unit exposure time was never set");
        } else {
            long longValue = l11.longValue();
            zzdVar.zza.remove(str);
            zzdVar.zzi(str, j11 - longValue, zzj);
        }
        if (zzdVar.zzb.isEmpty()) {
            long j12 = zzdVar.zzc;
            if (j12 == 0) {
                C3661l.b(zzdVar.zzs, "First ad exposure time was never set");
            } else {
                zzdVar.zzh(j11 - j12, zzj);
                zzdVar.zzc = 0L;
            }
        }
    }

    private final void zzh(long j11, zziw zziwVar) {
        if (zziwVar == null) {
            E.g(this.zzs, "Not logging ad exposure. No active activity");
            return;
        }
        if (j11 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j11));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j11);
        zzlt.zzK(zziwVar, bundle, true);
        this.zzs.zzq().zzH("am", "_xa", bundle);
    }

    private final void zzi(String str, long j11, zziw zziwVar) {
        if (zziwVar == null) {
            E.g(this.zzs, "Not logging ad unit exposure. No active activity");
            return;
        }
        if (j11 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j11));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j11);
        zzlt.zzK(zziwVar, bundle, true);
        this.zzs.zzq().zzH("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j11) {
        Iterator it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put((String) it.next(), Long.valueOf(j11));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j11;
    }

    public final void zzd(String str, long j11) {
        if (str == null || str.length() == 0) {
            C3661l.b(this.zzs, "Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaz().zzp(new zza(this, str, j11));
        }
    }

    public final void zze(String str, long j11) {
        if (str == null || str.length() == 0) {
            C3661l.b(this.zzs, "Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaz().zzp(new zzb(this, str, j11));
        }
    }

    public final void zzf(long j11) {
        zziw zzj = this.zzs.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j11 - ((Long) this.zza.get(str)).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j11 - this.zzc, zzj);
        }
        zzj(j11);
    }
}
