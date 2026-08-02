package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes9.dex */
public abstract class zzph {
    protected final zzpq zza;
    protected final zzpm zzb;
    protected final Clock zzc;
    protected final zzgs zzd;
    private final int zze;

    @VisibleForTesting
    public zzph(int i11, zzpq zzpqVar, zzpm zzpmVar, zzgs zzgsVar, Clock clock) {
        this.zza = (zzpq) Preconditions.checkNotNull(zzpqVar);
        Preconditions.checkNotNull(zzpqVar.zza());
        this.zze = i11;
        this.zzb = (zzpm) Preconditions.checkNotNull(zzpmVar);
        this.zzc = (Clock) Preconditions.checkNotNull(clock);
        this.zzd = zzgsVar;
    }

    protected abstract void zza(zzps zzpsVar);

    public final void zzb(int i11, int i12) {
        zzgs zzgsVar = this.zzd;
        if (zzgsVar != null && i12 == 0 && i11 == 3) {
            zzgsVar.zzd();
        }
        String zzb = this.zza.zza().zzb();
        String str = i11 != 0 ? i11 != 1 ? i11 != 2 ? "Unknown reason" : "Server error" : "IOError" : "Resource not available";
        StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 61 + str.length());
        sb2.append("Failed to fetch the container resource for the container \"");
        sb2.append(zzb);
        sb2.append("\": ");
        sb2.append(str);
        zzhl.zzd(sb2.toString());
        zza(new zzps(Status.RESULT_INTERNAL_ERROR, i12, null, null));
    }

    public final void zzc(byte[] bArr) {
        zzps zzpsVar;
        zzps zzpsVar2;
        try {
            zzpsVar = this.zzb.zza(bArr);
        } catch (zzpf unused) {
            zzhl.zzc("Resource data is corrupted");
            zzpsVar = null;
        }
        zzgs zzgsVar = this.zzd;
        if (zzgsVar != null && this.zze == 0) {
            zzgsVar.zze();
        }
        if (zzpsVar != null) {
            Status status = zzpsVar.getStatus();
            Status status2 = Status.RESULT_SUCCESS;
            if (status == status2) {
                zzpsVar2 = new zzps(status2, this.zze, new zzpr(this.zza.zza(), bArr, zzpsVar.zzb().zzc(), this.zzc.currentTimeMillis()), zzpsVar.zzc());
                zza(zzpsVar2);
            }
        }
        zzpsVar2 = new zzps(Status.RESULT_INTERNAL_ERROR, this.zze, null, null);
        zza(zzpsVar2);
    }
}
