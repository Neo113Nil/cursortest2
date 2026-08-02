package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzadt {
    private final Context zzb;
    private zzadp zzc;
    private boolean zzd;
    private Surface zze;
    private float zzg;
    private float zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private final zzacp zza = new zzacp();
    private float zzf = -1.0f;
    private float zzi = 1.0f;
    private int zzj = 0;

    public zzadt(Context context) {
        this.zzb = context;
    }

    private final void zzj() {
        this.zzm = 0L;
        this.zzq = -1L;
        this.zzn = -1L;
        this.zzk = 0L;
        this.zzl = 0L;
    }

    private final void zzk() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzacp zzacpVar = this.zza;
        float zzg = zzacpVar.zzc() ? zzacpVar.zzg() : this.zzf;
        float f = this.zzg;
        if (zzg != f) {
            if (zzg != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (zzacpVar.zzc() && zzacpVar.zze() >= 5000000000L) {
                    f2 = 0.1f;
                }
                if (Math.abs(zzg - this.zzg) < f2) {
                    return;
                }
            } else if (zzg == -1.0f && zzacpVar.zzd() < 30) {
                return;
            }
            this.zzg = zzg;
            zzl(false);
        }
    }

    private final void zzl(boolean z) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzado.zza(this.zze, f);
        }
    }

    private final void zzm() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzh = 0.0f;
        zzado.zza(this.zze, 0.0f);
    }

    public final void zza(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzl(true);
    }

    public final void zzb() {
        this.zzd = true;
        zzj();
        int i = zzadp.zze;
        DisplayManager displayManager = (DisplayManager) this.zzb.getSystemService("display");
        zzadp zzadpVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzadpVar = Build.VERSION.SDK_INT >= 33 ? new zzads(choreographer, displayManager, null) : new zzadq(choreographer, displayManager, null);
            } catch (RuntimeException e) {
                zzef.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        this.zzc = zzadpVar;
        if (zzadpVar != null) {
            zzadpVar.zza();
        }
        zzl(false);
    }

    public final void zzc(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzm();
        this.zze = surface;
        zzl(true);
    }

    public final void zzd() {
        zzj();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl(false);
    }

    public final void zzf(float f) {
        this.zzf = f;
        this.zza.zza();
        zzk();
    }

    public final void zzg(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzq = j2;
            this.zzr = this.zzo;
            this.zzs = this.zzp;
            this.zzk = this.zzl;
        }
        this.zzm++;
        this.zza.zzb(j * 1000);
        zzk();
    }

    public final void zzh() {
        this.zzd = false;
        zzadp zzadpVar = this.zzc;
        if (zzadpVar != null) {
            zzadpVar.zzb();
        }
        zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzi(long j, long j2) {
        long j3;
        zzadp zzadpVar;
        long j4;
        long j5;
        float f;
        long j6;
        if (this.zzq != -1) {
            zzacp zzacpVar = this.zza;
            if (zzacpVar.zzc()) {
                j6 = zzacpVar.zzf() * (this.zzm - this.zzq);
                f = this.zzi;
            } else {
                long j7 = j2 - this.zzs;
                f = this.zzi;
                j6 = j7 * 1000;
            }
            j3 = this.zzr + ((long) (j6 / f));
            if (Math.abs(j - j3) > 20000000) {
                zzj();
            }
            this.zzn = this.zzm;
            this.zzo = j3;
            this.zzp = j2;
            zzadpVar = this.zzc;
            if (zzadpVar != null) {
                long j8 = zzadpVar.zzc;
                long j9 = this.zzc.zzd;
                if (j8 != C.TIME_UNSET && j9 != C.TIME_UNSET) {
                    long j10 = j8 + (((j3 - j8) / j9) * j9);
                    if (j3 <= j10) {
                        j4 = j10 - j9;
                    } else {
                        j4 = j10;
                        j10 += j9;
                    }
                    long j11 = j9 / 2;
                    long j12 = j10 - j3;
                    long j13 = j3 - j4;
                    long abs = Math.abs(j12 - j13);
                    if (abs < j11) {
                        long j14 = j9 / 4;
                        if (abs < j14) {
                            j5 = this.zzk;
                            if (j5 == 0) {
                                if (j12 < j13) {
                                    j14 = -j14;
                                }
                            }
                        } else {
                            j14 = 0;
                        }
                        this.zzl = j14;
                        j5 = j14;
                        if (j12 + j5 >= j13) {
                            j10 = j4;
                        }
                        return j10 - ((j9 * 80) / 100);
                    }
                    j5 = this.zzk;
                    this.zzl = j5;
                    if (j12 + j5 >= j13) {
                    }
                    return j10 - ((j9 * 80) / 100);
                }
            }
            return j3;
        }
        j3 = j;
        this.zzn = this.zzm;
        this.zzo = j3;
        this.zzp = j2;
        zzadpVar = this.zzc;
        if (zzadpVar != null) {
        }
        return j3;
    }
}
