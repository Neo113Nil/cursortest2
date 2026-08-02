package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public class zzafb {
    protected final zzaev zza;
    protected final zzafa zzb;
    protected zzaex zzc;
    private final int zzd;

    protected zzafb(zzaey zzaeyVar, zzafa zzafaVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzafaVar;
        this.zzd = i;
        this.zza = new zzaev(zzaeyVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzafq zzafqVar, long j, zzagp zzagpVar) {
        if (j == zzafqVar.zzn()) {
            return 0;
        }
        zzagpVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzafq zzafqVar, long j) throws IOException {
        long zzn = j - zzafqVar.zzn();
        if (zzn < 0 || zzn > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        zzafqVar.zzf((int) zzn);
        return true;
    }

    public final zzags zza() {
        return this.zza;
    }

    public final void zzb(long j) {
        zzaex zzaexVar = this.zzc;
        if (zzaexVar == null || zzaexVar.zze() != j) {
            zzaev zzaevVar = this.zza;
            this.zzc = new zzaex(j, zzaevVar.zzd(j), 0L, zzaevVar.zze(), zzaevVar.zzf(), zzaevVar.zzg(), zzaevVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        while (true) {
            zzaex zzaexVar = this.zzc;
            zzaexVar.getClass();
            long zzb = zzaexVar.zzb();
            long zzc = zzaexVar.zzc();
            long zzh = zzaexVar.zzh();
            if (zzc - zzb <= this.zzd) {
                zze(false, zzb);
                return zzf(zzafqVar, zzb, zzagpVar);
            }
            if (!zzg(zzafqVar, zzh)) {
                return zzf(zzafqVar, zzh, zzagpVar);
            }
            zzafqVar.zzl();
            zzaez zza = this.zzb.zza(zzafqVar, zzaexVar.zzd());
            int zzd = zza.zzd();
            if (zzd == -3) {
                zze(false, zzh);
                return zzf(zzafqVar, zzh, zzagpVar);
            }
            if (zzd == -2) {
                zzaexVar.zzf(zza.zze(), zza.zzf());
            } else {
                if (zzd != -1) {
                    zzg(zzafqVar, zza.zzf());
                    zze(true, zza.zzf());
                    return zzf(zzafqVar, zza.zzf(), zzagpVar);
                }
                zzaexVar.zzg(zza.zze(), zza.zzf());
            }
        }
    }

    protected final void zze(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
