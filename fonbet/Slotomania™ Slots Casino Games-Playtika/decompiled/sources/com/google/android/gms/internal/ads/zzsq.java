package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzsq implements zzqp {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private final AudioTrack zzd;
    private final zzqy zze;
    private final float zzf;
    private zzsh zzg;
    private final zzsx zzh;
    private final boolean zzi;
    private final int zzj;
    private final zzsp zzk;
    private final zzee zzl = new zzee(Thread.currentThread());
    private boolean zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private final zzsu zzs;

    /* JADX WARN: Multi-variable type inference failed */
    public zzsq(AudioTrack audioTrack, zzqy zzqyVar, zzsu zzsuVar, float f, zzdo zzdoVar) {
        this.zzd = audioTrack;
        this.zze = zzqyVar;
        this.zzf = f;
        this.zzs = zzsuVar;
        boolean zzC = zzfk.zzC(zzqyVar.zza);
        this.zzi = zzC;
        if (zzC) {
            this.zzj = zzfk.zzF(zzqyVar.zza) * Integer.bitCount(zzqyVar.zzc);
        } else {
            this.zzj = -1;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.zzh = new zzsx(new zzsj(this, null), zzdoVar, audioTrack, zzqyVar.zza, this.zzj, zzqyVar.zze);
        if (zzsuVar != null) {
            this.zzg = new zzsh(audioTrack, zzsuVar, objArr2 == true ? 1 : 0);
        }
        this.zzk = zzg() ? new zzsp(this, objArr == true ? 1 : 0) : null;
    }

    static /* synthetic */ void zzp(AudioTrack audioTrack, Handler handler, final zzee zzeeVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzsq.zzw(zzee.this);
                    }
                });
            }
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    ScheduledExecutorService scheduledExecutorService = zzb;
                    if (scheduledExecutorService == null) {
                        throw null;
                    }
                    ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                    scheduledExecutorService.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzsq.zzw(zzee.this);
                    }
                });
            }
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    ScheduledExecutorService scheduledExecutorService3 = zzb;
                    if (scheduledExecutorService3 == null) {
                        throw null;
                    }
                    ScheduledExecutorService scheduledExecutorService4 = scheduledExecutorService3;
                    scheduledExecutorService3.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final long zzs() {
        if (!this.zzi) {
            return this.zzo;
        }
        long j = this.zzn;
        int i = this.zzj;
        String str = zzfk.zza;
        return ((j + r2) - 1) / i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzw(zzee zzeeVar) {
        if (zzeeVar.zzb()) {
            zzeeVar.zze(-1, zzrz.zza);
            zzeeVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final void zza() {
        this.zzh.zzb();
        if (!this.zzm || zzg()) {
            this.zzd.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final void zzb() {
        this.zzh.zzf();
        if (!this.zzm || zzg()) {
            this.zzd.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final boolean zzc(ByteBuffer byteBuffer, int i, long j) throws zzqo {
        zzsu zzsuVar;
        boolean z = this.zzi;
        if (!z && this.zzp == 0) {
            this.zzp = zztj.zzE(this.zze.zza, byteBuffer);
        }
        zzee zzeeVar = this.zzl;
        if (zzeeVar.zzb()) {
            zzs();
            int underrunCount = this.zzd.getUnderrunCount();
            int i2 = this.zzq;
            this.zzq = underrunCount;
            if (underrunCount > i2) {
                zzeeVar.zze(-1, zzsa.zza);
                zzeeVar.zzf();
            }
        }
        int remaining = byteBuffer.remaining();
        int write = this.zzd.write(byteBuffer, byteBuffer.remaining(), 1);
        if (write >= 0) {
            r2 = write == remaining;
            if (z) {
                this.zzn += write;
                return r2;
            }
            if (r2) {
                this.zzo += this.zzp * i;
            }
            return r2;
        }
        if (write != -6 && write != -32) {
            r2 = false;
        }
        if (r2 && (zzsuVar = this.zzs) != null) {
            zzsv zzsvVar = zzsuVar.zza;
            if (zzsvVar.zzj() != null) {
                zzqb zzqbVar = zzqb.zza;
                zzsvVar.zzi(zzqbVar);
                zzsvVar.zzj().zza(zzqbVar);
            }
        }
        throw new zzqo(write, r2);
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final void zzd() {
        if (this.zzm) {
            return;
        }
        this.zzm = true;
        this.zzh.zze(zzs());
        this.zzd.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final void zze() {
        if (this.zzh.zzc()) {
            this.zzd.pause();
        }
        if (Build.VERSION.SDK_INT >= 29 && zzg()) {
            zzsp zzspVar = this.zzk;
            zzspVar.getClass();
            zzspVar.zza();
        }
        zzsh zzshVar = this.zzg;
        if (zzshVar != null) {
            zzshVar.zzd();
            this.zzg = null;
        }
        final AudioTrack audioTrack = this.zzd;
        final zzee zzeeVar = this.zzl;
        final Handler zzd = zzfk.zzd(null);
        synchronized (zza) {
            if (zzb == null) {
                zzb = zzfk.zzh("ExoPlayer:AudioTrackReleaseThread");
            }
            zzc++;
            zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzsq.zzp(audioTrack, zzd, zzeeVar);
                }
            }, 20L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final void zzf(float f) {
        this.zzd.setVolume(f);
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final boolean zzg() {
        return Build.VERSION.SDK_INT >= 29 && this.zzd.isOffloadedPlayback();
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final int zzh() {
        return this.zzd.getAudioSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final int zzi() {
        return this.zzd.getSampleRate();
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final long zzj() {
        return this.zzd.getBufferSizeInFrames();
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final long zzk() {
        return this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final boolean zzl() {
        return this.zzh.zzd(zzs());
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final void zzm(zzqn zzqnVar) {
        this.zzl.zzc(zzqnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final void zzn(zzpz zzpzVar) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId zza2 = zzpzVar.zza();
        if (zza2.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.zzd.setLogSessionId(zza2);
    }

    @Override // com.google.android.gms.internal.ads.zzqp
    public final void zzo(AudioDeviceInfo audioDeviceInfo) {
        this.zzd.setPreferredDevice(audioDeviceInfo);
    }

    final /* synthetic */ AudioTrack zzt() {
        return this.zzd;
    }

    final /* synthetic */ zzee zzu() {
        return this.zzl;
    }
}
