package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzevw implements zzfby {
    private final zzhbs zza;
    private final Context zzb;

    public zzevw(zzhbs zzhbsVar, Context context) {
        this.zza = zzhbsVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzevw.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 13;
    }

    final /* synthetic */ zzevx zzc() {
        int i;
        int i2;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        float zzb = com.google.android.gms.ads.internal.zzt.zzi().zzb();
        boolean zzd = com.google.android.gms.ads.internal.zzt.zzi().zzd();
        if (audioManager == null) {
            return new zzevx(-1, false, false, -1, -1, -1, -1, -1, zzb, zzd, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmr)).booleanValue()) {
            int zzk = com.google.android.gms.ads.internal.zzt.zzf().zzk(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
            i = zzk;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzevx(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzb, zzd, false);
    }
}
