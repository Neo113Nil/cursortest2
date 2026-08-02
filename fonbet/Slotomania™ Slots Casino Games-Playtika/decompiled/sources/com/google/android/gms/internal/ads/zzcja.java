package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.DefaultLoadControl;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcja implements zzls {
    private final zzabj zza = new zzabj(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcja() {
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zza(zzpz zzpzVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzb(zzlr zzlrVar, zzzf zzzfVar, zzaas[] zzaasVarArr) {
        int i;
        this.zzf = 0;
        for (zzaas zzaasVar : zzaasVarArr) {
            if (zzaasVar != null) {
                int i2 = this.zzf;
                int i3 = zzaasVar.zza().zzc;
                if (i3 == 0) {
                    i = DefaultLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
                }
                this.zzf = i2 + i;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzc(zzpz zzpzVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzd(zzpz zzpzVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final zzabd zze(zzpz zzpzVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zzf(zzpz zzpzVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzg(zzpz zzpzVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzh(zzlr zzlrVar) {
        long j = zzlrVar.zze;
        boolean z = true;
        char c = j > this.zzc ? (char) 0 : j < this.zzb ? (char) 2 : (char) 1;
        int zzg = this.zza.zzg();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zzg >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzi(zzlr zzlrVar) {
        long j = zzlrVar.zzg ? this.zze : this.zzd;
        return j <= 0 || zzlrVar.zze >= j;
    }

    public final synchronized void zzk(int i) {
        this.zzb = i * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzc = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zze = i * 1000;
    }

    final void zzo(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }
}
