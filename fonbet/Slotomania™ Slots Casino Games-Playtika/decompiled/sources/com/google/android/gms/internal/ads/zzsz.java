package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzsz {
    private final Context zza;
    private Boolean zzb;

    public zzsz() {
        this(null);
    }

    public zzsz(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }

    public final zzqm zza(zzv zzvVar, zzd zzdVar) {
        int i;
        boolean booleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        if (Build.VERSION.SDK_INT < 29 || (i = zzvVar.zzI) == -1) {
            return zzqm.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = false;
            }
            booleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzp;
        str.getClass();
        int zzg = zzas.zzg(str, zzvVar.zzk);
        if (zzg == 0 || Build.VERSION.SDK_INT < zzfk.zzE(zzg)) {
            return zzqm.zza;
        }
        int zzD = zzfk.zzD(zzvVar.zzH);
        if (zzD == 0) {
            return zzqm.zza;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(zzD).setEncoding(zzg).build();
            if (Build.VERSION.SDK_INT >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, zzdVar.zza());
                if ((directPlaybackSupport & 1) == 0) {
                    return zzqm.zza;
                }
                r3 = (directPlaybackSupport & 3) == 3;
                zzql zzqlVar = new zzql();
                zzqlVar.zza(true);
                zzqlVar.zzb(r3);
                zzqlVar.zzc(booleanValue);
                return zzqlVar.zzd();
            }
            if (Build.VERSION.SDK_INT < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, zzdVar.zza())) {
                    return zzqm.zza;
                }
                zzql zzqlVar2 = new zzql();
                zzqlVar2.zza(true);
                zzqlVar2.zzc(booleanValue);
                return zzqlVar2.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, zzdVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzqm.zza;
            }
            zzql zzqlVar3 = new zzql();
            if (Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2) {
                r3 = true;
            }
            zzqlVar3.zza(true);
            zzqlVar3.zzb(r3);
            zzqlVar3.zzc(booleanValue);
            return zzqlVar3.zzd();
        } catch (IllegalArgumentException unused) {
            return zzqm.zza;
        }
    }
}
