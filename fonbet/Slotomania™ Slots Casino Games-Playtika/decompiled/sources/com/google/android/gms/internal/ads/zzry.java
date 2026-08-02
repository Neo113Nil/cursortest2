package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzry {
    private final zzrx zza;
    private final int zzb;
    private final zzsw zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzry(AudioTrack audioTrack, zzsw zzswVar) {
        this.zza = new zzrx(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzswVar;
        zzf(0);
    }

    private final void zzf(int i) {
        this.zzd = i;
        long j = 10000;
        if (i == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = C.TIME_UNSET;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.zzf = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzf = j;
    }

    private final long zzg(long j, float f) {
        zzrx zzrxVar = this.zza;
        return zzh(zzrxVar.zzc(), zzrxVar.zzb(), j, f);
    }

    private final long zzh(long j, long j2, long j3, float f) {
        return zzfk.zzt(j, this.zzb) + zzfk.zzx(j3 - j2, f);
    }

    public final void zza(long j, float f, long j2, boolean z) {
        boolean z2;
        int i;
        if (z || j - this.zzg >= this.zzf) {
            this.zzg = j;
            zzrx zzrxVar = this.zza;
            boolean zza = zzrxVar.zza();
            if (zza) {
                long zzb = zzrxVar.zzb();
                long zzg = zzg(j, f);
                i = 2;
                if (Math.abs(zzb - j) > 5000000) {
                    zzsw zzswVar = this.zzc;
                    long zzc = zzrxVar.zzc();
                    long zzs = ((zzsj) zzswVar).zza.zzs();
                    int length = String.valueOf(zzc).length();
                    int length2 = String.valueOf(zzb).length();
                    int length3 = String.valueOf(j).length();
                    StringBuilder sb = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j2).length() + 2 + String.valueOf(zzs).length());
                    sb.append("Spurious audio timestamp (system clock mismatch): ");
                    sb.append(zzc);
                    sb.append(", ");
                    sb.append(zzb);
                    sb.append(", ");
                    sb.append(j);
                    sb.append(", ");
                    sb.append(j2);
                    sb.append(", ");
                    sb.append(zzs);
                    zzef.zzc("AudioTrackAudioOutput", sb.toString());
                    zzf(4);
                    z2 = zza;
                } else if (Math.abs(zzg - j2) > 5000000) {
                    zzsw zzswVar2 = this.zzc;
                    long zzc2 = zzrxVar.zzc();
                    long zzs2 = ((zzsj) zzswVar2).zza.zzs();
                    int length4 = String.valueOf(zzc2).length();
                    int length5 = String.valueOf(zzb).length();
                    int length6 = String.valueOf(j).length();
                    int length7 = length4 + 54 + length5 + 2 + length6 + 2 + String.valueOf(j2).length() + 2;
                    z2 = zza;
                    StringBuilder sb2 = new StringBuilder(length7 + String.valueOf(zzs2).length());
                    sb2.append("Spurious audio timestamp (frame position mismatch): ");
                    sb2.append(zzc2);
                    sb2.append(", ");
                    sb2.append(zzb);
                    sb2.append(", ");
                    sb2.append(j);
                    sb2.append(", ");
                    sb2.append(j2);
                    sb2.append(", ");
                    sb2.append(zzs2);
                    zzef.zzc("AudioTrackAudioOutput", sb2.toString());
                    zzf(4);
                } else {
                    z2 = zza;
                    if (this.zzd == 4) {
                        zzf(0);
                    }
                }
            } else {
                z2 = zza;
                i = 2;
            }
            int i2 = this.zzd;
            if (i2 == 0) {
                if (!z2) {
                    if (j - this.zze > 500000) {
                        zzf(3);
                        return;
                    }
                    return;
                } else {
                    if (zzrxVar.zzb() >= this.zze) {
                        this.zzh = zzrxVar.zzc();
                        this.zzi = zzrxVar.zzb();
                        zzf(1);
                        return;
                    }
                    return;
                }
            }
            if (i2 != 1) {
                if (i2 == i) {
                    if (z2) {
                        return;
                    }
                    zzf(0);
                    return;
                } else {
                    if (i2 == 3 && z2) {
                        zzf(0);
                        return;
                    }
                    return;
                }
            }
            if (!z2) {
                zzf(0);
                return;
            }
            long zzc3 = zzrxVar.zzc();
            long j3 = this.zzh;
            if (zzc3 > j3) {
                if (Math.abs(zzg(j, f) - zzh(j3, this.zzi, j, f)) < 1000) {
                    zzf(2);
                    return;
                }
            }
            if (j - this.zze > 2000000) {
                zzf(3);
            } else {
                this.zzh = zzrxVar.zzc();
                this.zzi = zzrxVar.zzb();
            }
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i = this.zzd;
        return i == 0 || i == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j, float f) {
        return zzg(j, f);
    }
}
