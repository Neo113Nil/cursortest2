package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzux {
    private final HashSet zza;
    private LoudnessCodecController zzb;

    public zzux() {
        throw null;
    }

    public zzux(zzuw zzuwVar) {
        this.zza = new HashSet();
    }

    public final void zza(int i) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.zzb = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i, zzhbz.zza(), new zzuu(this));
        this.zzb = create;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public final void zzb(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            zzgsw.zzi(this.zza.add(mediaCodec));
        }
    }

    public final void zzc(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.zza.remove(mediaCodec) || (loudnessCodecController = this.zzb) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void zzd() {
        this.zza.clear();
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
