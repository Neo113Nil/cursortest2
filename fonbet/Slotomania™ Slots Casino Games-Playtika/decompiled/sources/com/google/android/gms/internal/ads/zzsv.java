package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzsv implements zzqz {
    private final Context zza;
    private final zzsu zzb;
    private final float zzc;
    private zzee zzd;
    private zzdo zze;
    private zzqb zzf;
    private zzqh zzg;
    private Looper zzh;
    private Context zzi;
    private final zzsz zzj;

    /* synthetic */ zzsv(zzst zzstVar, byte[] bArr) {
        this.zza = zzstVar.zzd();
        zzsz zzg = zzstVar.zzg();
        zzg.getClass();
        this.zzj = zzg;
        this.zzf = zzstVar.zze();
        this.zzb = zzstVar.zzd() != null ? new zzsu(this, null) : null;
        this.zzc = 8.0f;
        this.zze = zzdo.zza;
    }

    @EnsuresNonNull({"audioCapabilities"})
    private final void zzk(zzqs zzqsVar) {
        Context context;
        zzl();
        zzqh zzqhVar = this.zzg;
        if (zzqhVar == null && (context = this.zza) != null) {
            zzqh zzqhVar2 = new zzqh(context, new zzqg() { // from class: com.google.android.gms.internal.ads.zzss
                @Override // com.google.android.gms.internal.ads.zzqg
                public final /* synthetic */ void zza(zzqb zzqbVar) {
                    zzsv.this.zzh(zzqbVar);
                }
            }, zzqsVar.zzb, zzqsVar.zzc);
            this.zzg = zzqhVar2;
            this.zzf = zzqhVar2.zzd();
        } else if (zzqhVar != null) {
            AudioDeviceInfo audioDeviceInfo = zzqsVar.zzc;
            if (audioDeviceInfo != null) {
                zzqhVar.zzc(audioDeviceInfo);
            }
            this.zzg.zzb(zzqsVar.zzb);
        }
        this.zzf.getClass();
    }

    private final void zzl() {
        if (this.zza == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzh;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        String zzm = zzm(looper);
        String zzm2 = zzm(myLooper);
        if (!z) {
            throw new IllegalStateException(zzgtn.zzd("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", zzm, zzm2));
        }
        this.zzh = myLooper;
    }

    private static String zzm(Looper looper) {
        return looper == null ? AbstractJsonLexerKt.NULL : looper.getThread().getName();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final zzqu zza(zzqs zzqsVar) {
        zzk(zzqsVar);
        zzsz zzszVar = this.zzj;
        zzv zzvVar = zzqsVar.zza;
        zzd zzdVar = zzqsVar.zzb;
        zzqm zza = zzszVar.zza(zzvVar, zzdVar);
        zzqt zzqtVar = new zzqt();
        int i = 0;
        if (!Objects.equals(zzvVar.zzp, MimeTypes.AUDIO_RAW) ? this.zzf.zzf(zzvVar, zzdVar) != null : zzvVar.zzJ == 2) {
            i = 2;
        }
        zzqtVar.zzd(i);
        zzqtVar.zza(zza.zzb);
        zzqtVar.zzb(zza.zzc);
        zzqtVar.zzc(zza.zzd);
        return zzqtVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final zzqy zzb(zzqs zzqsVar) throws zzqq {
        int i;
        int intValue;
        int i2;
        int i3;
        int i4;
        zzk(zzqsVar);
        zzv zzvVar = zzqsVar.zza;
        String str = zzvVar.zzp;
        if (Objects.equals(str, MimeTypes.AUDIO_RAW)) {
            int i5 = zzvVar.zzJ;
            zzgsw.zza(zzfk.zzC(i5));
            i = zzvVar.zzI;
            int i6 = zzvVar.zzH;
            intValue = zzfk.zzD(i6);
            i3 = zzfk.zzF(i5) * i6;
            i4 = i5;
            i2 = 0;
        } else {
            i = zzvVar.zzI;
            zzqm zzqmVar = zzqm.zza;
            Pair zzf = this.zzf.zzf(zzvVar, zzqsVar.zzb);
            if (zzf == null) {
                String valueOf = String.valueOf(zzvVar);
                String.valueOf(valueOf);
                throw new zzqq("Unable to configure passthrough for: ".concat(String.valueOf(valueOf)));
            }
            int intValue2 = ((Integer) zzf.first).intValue();
            intValue = ((Integer) zzf.second).intValue();
            i2 = 2;
            i3 = -1;
            i4 = intValue2;
        }
        int i7 = i;
        int i8 = zzvVar.zzj;
        if (Objects.equals(str, MimeTypes.AUDIO_DTS_EXPRESS) && i8 == -1) {
            i8 = Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
        }
        int i9 = i8;
        int i10 = zzqsVar.zzf;
        if (i10 == -1) {
            int i11 = i3;
            zzgsw.zzi(AudioTrack.getMinBufferSize(i7, intValue, i4) != -2);
            int i12 = i11 == -1 ? 1 : i11;
            i10 = (((Math.max(r8, zztl.zzb(r8, i4, i2, r11, i7, i9)) + i12) - 1) / i12) * i12;
        }
        zzqx zzqxVar = new zzqx();
        zzqxVar.zzb(i7);
        zzqxVar.zzc(intValue);
        zzqxVar.zza(i4);
        zzqxVar.zze(i10);
        zzqxVar.zzg(zzqsVar.zzd);
        zzqxVar.zzf(zzqsVar.zzb);
        zzqxVar.zzd(false);
        zzqxVar.zzh(zzqsVar.zze);
        return new zzqy(zzqxVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zzc(zzqw zzqwVar) {
        zzl();
        if (this.zzd == null) {
            this.zzd = new zzee(Thread.currentThread());
        }
        this.zzd.zzc(zzqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zzd(zzdo zzdoVar) {
        this.zze = zzdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zze() {
        zzee zzeeVar = this.zzd;
        if (zzeeVar != null) {
            zzeeVar.zzg();
        }
        zzqh zzqhVar = this.zzg;
        if (zzqhVar != null) {
            zzqhVar.zze();
        }
    }

    public final zzsq zzf(zzqy zzqyVar) throws zzqv {
        Context context;
        try {
            int i = zzqyVar.zzg;
            int i2 = zzqyVar.zzh;
            Context context2 = null;
            if (i2 != -1 && (context = this.zza) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.zzi;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.zzi = context.createDeviceContext(i2);
                }
                context2 = this.zzi;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzqyVar.zzf.zza()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzqyVar.zzb).setChannelMask(zzqyVar.zzc).setEncoding(zzqyVar.zza).build()).setTransferMode(1).setBufferSizeInBytes(zzqyVar.zze).setSessionId(i);
            if (Build.VERSION.SDK_INT >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (Build.VERSION.SDK_INT >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new zzsq(build, zzqyVar, this.zzb, this.zzc, this.zze);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new zzqv();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzqv(e);
        }
    }

    public final zzqb zzg() {
        return this.zzf;
    }

    final void zzh(zzqb zzqbVar) {
        zzl();
        zzqb zzqbVar2 = this.zzf;
        if (zzqbVar2 == null || zzqbVar.equals(zzqbVar2)) {
            return;
        }
        this.zzf = zzqbVar;
        zzee zzeeVar = this.zzd;
        if (zzeeVar != null) {
            zzeeVar.zze(-1, zzsr.zza);
            zzeeVar.zzf();
        }
    }

    final /* synthetic */ void zzi(zzqb zzqbVar) {
        this.zzf = zzqbVar;
    }

    final /* synthetic */ zzqh zzj() {
        return this.zzg;
    }
}
