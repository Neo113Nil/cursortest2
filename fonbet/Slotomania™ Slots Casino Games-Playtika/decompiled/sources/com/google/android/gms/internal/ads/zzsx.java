package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import com.google.android.exoplayer2.C;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzsx {
    private boolean zzA;
    private long zzB;
    private final zzsw zza;
    private final zzdo zzb;
    private final long[] zzc;
    private final AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final zzry zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzsx(zzsw zzswVar, zzdo zzdoVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.zza = zzswVar;
        this.zzb = zzdoVar;
        this.zzd = audioTrack;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = C.TIME_UNSET;
        this.zzy = C.TIME_UNSET;
        this.zzh = new zzry(audioTrack, zzswVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zzC = zzfk.zzC(i);
        this.zzg = zzC;
        this.zzf = zzC ? zzfk.zzt(i3 / i2, sampleRate) : -9223372036854775807L;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = C.TIME_UNSET;
        this.zzv = C.TIME_UNSET;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = C.TIME_UNSET;
    }

    private final void zzg(long j) {
        long j2 = this.zzj;
        if (j2 == C.TIME_UNSET || j < j2) {
            return;
        }
        long zzy = zzfk.zzy(j - j2, this.zzi);
        zzdo zzdoVar = this.zzb;
        long zza = zzdoVar.zza() - zzfk.zzr(zzy);
        this.zzj = C.TIME_UNSET;
        this.zza.zzb(zza);
    }

    private final long zzh(long j) {
        long max = Math.max(0L, (this.zzt == 0 ? this.zzu != C.TIME_UNSET ? zzfk.zzt(zzl(), this.zze) : zzj() : zzfk.zzx(j + this.zzk, this.zzi)) - this.zzn);
        return this.zzu != C.TIME_UNSET ? Math.min(zzfk.zzt(this.zzx, this.zze), max) : max;
    }

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = C.TIME_UNSET;
        this.zzz = C.TIME_UNSET;
    }

    private final long zzj() {
        return zzfk.zzt(zzk(), this.zze);
    }

    private final long zzk() {
        if (this.zzu != C.TIME_UNSET) {
            return Math.min(this.zzx, zzl());
        }
        long zzb = this.zzb.zzb();
        if (zzb - this.zzp >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.zzq <= 0 || playState != 3) {
                        this.zzv = C.TIME_UNSET;
                    } else if (this.zzv == C.TIME_UNSET) {
                        this.zzv = zzb;
                    }
                }
                if (this.zzq > playbackHeadPosition) {
                    this.zzr++;
                }
                this.zzq = playbackHeadPosition;
            }
            this.zzp = zzb;
        }
        return this.zzq + this.zzB + (this.zzr << 32);
    }

    private final long zzl() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + zzfk.zzu(zzfk.zzx(zzfk.zzs(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza() {
        long j;
        int playState;
        Method method;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        long j2 = 1000;
        if (audioTrack.getPlayState() == 3) {
            long zzc = this.zzb.zzc() / 1000;
            if (zzc - this.zzl >= 30000) {
                long zzj = zzj();
                if (zzj != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzs] = zzfk.zzy(zzj, this.zzi) - zzc;
                    this.zzs = (this.zzs + 1) % 10;
                    int i = this.zzt;
                    if (i < 10) {
                        this.zzt = i + 1;
                    }
                    this.zzl = zzc;
                    this.zzk = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.zzt;
                        if (i2 >= i3) {
                            break;
                        }
                        this.zzk += jArr[i2] / i3;
                        i2++;
                        j2 = j2;
                    }
                }
            }
            j = j2;
            long j3 = this.zzn;
            if (this.zzg && (method = this.zzm) != null && zzc - this.zzo >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                    String str = zzfk.zza;
                    Integer num2 = num;
                    long intValue = (num.intValue() * j) - this.zzf;
                    this.zzn = intValue;
                    long max = Math.max(intValue, 0L);
                    this.zzn = max;
                    if (max > 10000000) {
                        this.zza.zza(max);
                        this.zzn = 0L;
                    }
                } catch (Exception unused) {
                    this.zzm = null;
                }
                this.zzo = zzc;
            }
            this.zzh.zza(zzc, this.zzi, zzh(zzc), j3 != this.zzn);
            long zzc2 = this.zzb.zzc() / j;
            zzry zzryVar = this.zzh;
            boolean zzb = zzryVar.zzb();
            long zze = !zzb ? zzryVar.zze(zzc2, this.zzi) : zzh(zzc2);
            playState = audioTrack.getPlayState();
            if (playState != 3) {
                if (zzb || !zzryVar.zzc()) {
                    zzg(zze);
                }
                long j4 = this.zzz;
                if (j4 != C.TIME_UNSET) {
                    long j5 = zze - this.zzy;
                    long zzx = zzfk.zzx(zzc2 - j4, this.zzi);
                    long j6 = this.zzy + zzx;
                    long abs = Math.abs(j6 - zze);
                    if (j5 != 0 && abs < 1000000) {
                        long j7 = (zzx * 10) / 100;
                        zze = Math.max(j6 - j7, Math.min(zze, j6 + j7));
                    }
                }
                this.zzz = zzc2;
                this.zzy = zze;
            } else if (playState == 1) {
                zzg(zze);
                return zze;
            }
            return zze;
        }
        j = 1000;
        long zzc22 = this.zzb.zzc() / j;
        zzry zzryVar2 = this.zzh;
        boolean zzb2 = zzryVar2.zzb();
        if (!zzb2) {
        }
        playState = audioTrack.getPlayState();
        if (playState != 3) {
        }
        return zze;
    }

    public final void zzb() {
        if (this.zzu != C.TIME_UNSET) {
            this.zzu = zzfk.zzs(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j) {
        return this.zzv != C.TIME_UNSET && j > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public final void zze(long j) {
        this.zzw = zzk();
        this.zzu = zzfk.zzs(this.zzb.zzb());
        this.zzx = j;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == C.TIME_UNSET) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}
