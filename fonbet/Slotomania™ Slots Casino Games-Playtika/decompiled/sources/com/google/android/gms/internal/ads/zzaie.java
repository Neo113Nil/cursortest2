package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzaie implements zzafp {
    private zzafs zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaic zzo;
    private zzaii zzp;
    private final zzes zza = new zzes(4);
    private final zzes zzb = new zzes(9);
    private final zzes zzc = new zzes(11);
    private final zzes zzd = new zzes();
    private final zzaif zze = new zzaif();
    private int zzg = 1;

    static {
        int i = zzaid.zza;
    }

    private final zzes zzh(zzafq zzafqVar) throws IOException {
        zzes zzesVar = this.zzd;
        if (this.zzl > zzesVar.zzj()) {
            int zzj = zzesVar.zzj();
            zzesVar.zzb(new byte[Math.max(zzj + zzj, this.zzl)], 0);
        } else {
            zzesVar.zzh(0);
        }
        zzesVar.zzf(this.zzl);
        zzafqVar.zzc(zzesVar.zzi(), 0, this.zzl);
        return zzesVar;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzagr(C.TIME_UNSET, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        zzes zzesVar = this.zza;
        zzafg zzafgVar = (zzafg) zzafqVar;
        zzafgVar.zzh(zzesVar.zzi(), 0, 3, false);
        zzesVar.zzh(0);
        if (zzesVar.zzx() != 4607062) {
            return false;
        }
        zzafgVar.zzh(zzesVar.zzi(), 0, 2, false);
        zzesVar.zzh(0);
        if ((zzesVar.zzt() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzafgVar.zzh(zzesVar.zzi(), 0, 4, false);
        zzesVar.zzh(0);
        int zzB = zzesVar.zzB();
        zzafqVar.zzl();
        zzafgVar.zzj(zzB, false);
        zzafgVar.zzh(zzesVar.zzi(), 0, 4, false);
        zzesVar.zzh(0);
        return zzesVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzf = zzafsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzafp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        boolean zzf;
        boolean z;
        this.zzf.getClass();
        while (true) {
            int i = this.zzg;
            int i2 = 8;
            if (i == 1) {
                zzes zzesVar = this.zzb;
                if (!zzafqVar.zzb(zzesVar.zzi(), 0, 9, true)) {
                    return -1;
                }
                zzesVar.zzh(0);
                zzesVar.zzk(4);
                int zzs = zzesVar.zzs();
                int i3 = zzs & 4;
                int i4 = zzs & 1;
                if (i3 != 0 && this.zzo == null) {
                    this.zzo = new zzaic(this.zzf.zzu(8, 1));
                }
                if (i4 != 0 && this.zzp == null) {
                    this.zzp = new zzaii(this.zzf.zzu(9, 2));
                }
                this.zzf.zzv();
                this.zzj = zzesVar.zzB() - 5;
                this.zzg = 2;
            } else if (i == 2) {
                zzafqVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i == 3) {
                zzes zzesVar2 = this.zzc;
                if (!zzafqVar.zzb(zzesVar2.zzi(), 0, 11, true)) {
                    return -1;
                }
                zzesVar2.zzh(0);
                this.zzk = zzesVar2.zzs();
                this.zzl = zzesVar2.zzx();
                this.zzm = zzesVar2.zzx();
                this.zzm = ((zzesVar2.zzs() << 24) | this.zzm) * 1000;
                zzesVar2.zzk(3);
                this.zzg = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                long j = this.zzh ? this.zzi + this.zzm : this.zze.zzc() == C.TIME_UNSET ? 0L : this.zzm;
                int i5 = this.zzk;
                if (i5 != 8) {
                    i2 = i5;
                } else if (this.zzo != null) {
                    zzi();
                    zzf = this.zzo.zzf(zzh(zzafqVar), j);
                    z = true;
                    if (!this.zzh && zzf) {
                        this.zzh = true;
                        this.zzi = this.zze.zzc() != C.TIME_UNSET ? -this.zzm : 0L;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (!z) {
                        return 0;
                    }
                }
                if (i2 == 9) {
                    if (this.zzp != null) {
                        zzi();
                        zzf = this.zzp.zzf(zzh(zzafqVar), j);
                        z = true;
                    }
                    zzafqVar.zzf(this.zzl);
                    zzf = false;
                    z = false;
                } else {
                    if (i2 == 18 && !this.zzn) {
                        zzaif zzaifVar = this.zze;
                        zzf = zzaifVar.zzf(zzh(zzafqVar), j);
                        long zzc = zzaifVar.zzc();
                        if (zzc != C.TIME_UNSET) {
                            this.zzf.zzw(new zzagl(zzaifVar.zze(), zzaifVar.zzd(), zzc));
                            this.zzn = true;
                        }
                        z = true;
                    }
                    zzafqVar.zzf(this.zzl);
                    zzf = false;
                    z = false;
                }
                if (!this.zzh) {
                    this.zzh = true;
                    this.zzi = this.zze.zzc() != C.TIME_UNSET ? -this.zzm : 0L;
                }
                this.zzj = 4;
                this.zzg = 2;
                if (!z) {
                }
            }
        }
    }
}
