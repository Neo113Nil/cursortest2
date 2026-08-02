package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzace {
    private final Spatializer zza;
    private final boolean zzb;
    private final Handler zzc;
    private final Spatializer.OnSpatializerStateChangedListener zzd;

    public final boolean zza() {
        return this.zza != null && this.zzb && zzc() && zzd();
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        Spatializer spatializer = this.zza;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean zzd() {
        Spatializer spatializer = this.zza;
        return spatializer != null && spatializer.isEnabled();
    }

    public final boolean zze(zzd zzdVar, zzv zzvVar) {
        int i;
        if (!zza()) {
            return false;
        }
        String str = zzvVar.zzp;
        if (Objects.equals(str, MimeTypes.AUDIO_E_AC3_JOC)) {
            i = zzvVar.zzH;
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i = zzvVar.zzH;
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, MimeTypes.AUDIO_AC4)) {
            i = zzvVar.zzH;
            if (i == 18 || i == 21) {
                i = 24;
            }
        } else {
            i = zzvVar.zzH;
        }
        int zzD = zzfk.zzD(i);
        if (zzD == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzD);
        int i2 = zzvVar.zzI;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return spatializer.canBeSpatialized(zzdVar.zza(), channelMask.build());
    }

    public final List zzf() {
        if (!zza()) {
            return zzgvz.zzi();
        }
        if (Build.VERSION.SDK_INT < 36) {
            return zzgvz.zzj(252);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final void zzg() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (onSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }

    public zzace(Context context, Runnable runnable, Boolean bool) {
        AudioManager zza = context == null ? null : zzcj.zza(context);
        if (zza == null || (bool != null && bool.booleanValue())) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        Spatializer spatializer = zza.getSpatializer();
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        final Handler handler = new Handler(myLooper);
        this.zzc = handler;
        zzacc zzaccVar = new zzacc(this, runnable);
        this.zzd = zzaccVar;
        Objects.requireNonNull(handler);
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzacd
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable2) {
                handler.post(runnable2);
            }
        }, zzaccVar);
    }
}
