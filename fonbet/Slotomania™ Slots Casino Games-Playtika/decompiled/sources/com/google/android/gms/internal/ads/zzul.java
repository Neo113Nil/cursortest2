package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzul implements zzuz {
    private final zzgto zza;
    private final zzgto zzb;
    private boolean zzc;

    public zzul(final int i) {
        zzgto zzgtoVar = new zzgto() { // from class: com.google.android.gms.internal.ads.zzuk
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                String zzw;
                zzw = zzum.zzw(i, "ExoPlayer:MediaCodecAsyncAdapter:");
                return new HandlerThread(zzw);
            }
        };
        zzgto zzgtoVar2 = new zzgto() { // from class: com.google.android.gms.internal.ads.zzuj
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                String zzw;
                zzw = zzum.zzw(i, "ExoPlayer:MediaCodecQueueingThread:");
                return new HandlerThread(zzw);
            }
        };
        this.zza = zzgtoVar;
        this.zzb = zzgtoVar2;
        this.zzc = true;
    }

    public final void zza(boolean z) {
        this.zzc = true;
    }

    public final zzum zzb(zzuy zzuyVar) throws IOException {
        Exception exc;
        MediaCodec mediaCodec;
        zzvc zzvzVar;
        int i;
        zzum zzumVar;
        Surface surface;
        zzve zzveVar = zzuyVar.zza;
        String str = zzveVar.zza;
        zzum zzumVar2 = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                try {
                    if (this.zzc && Build.VERSION.SDK_INT >= 36) {
                        zzvzVar = new zzvz(mediaCodec);
                        i = 4;
                        zzumVar = new zzum(mediaCodec, (HandlerThread) this.zza.zza(), zzvzVar, zzuyVar.zzf, null);
                        Trace.endSection();
                        surface = zzuyVar.zzd;
                        if (surface == null && zzveVar.zzh && Build.VERSION.SDK_INT >= 35) {
                            i |= 8;
                        }
                        zzumVar.zzt(zzuyVar.zzb, surface, null, i);
                        return zzumVar;
                    }
                    Trace.endSection();
                    surface = zzuyVar.zzd;
                    if (surface == null) {
                        i |= 8;
                    }
                    zzumVar.zzt(zzuyVar.zzb, surface, null, i);
                    return zzumVar;
                } catch (Exception e) {
                    exc = e;
                    zzumVar2 = zzumVar;
                    if (zzumVar2 != null) {
                        zzumVar2.zzl();
                        throw exc;
                    }
                    if (mediaCodec == null) {
                        throw exc;
                    }
                    mediaCodec.release();
                    throw exc;
                }
                zzvzVar = new zzup(mediaCodec, (HandlerThread) this.zzb.zza());
                i = 0;
                zzumVar = new zzum(mediaCodec, (HandlerThread) this.zza.zza(), zzvzVar, zzuyVar.zzf, null);
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Exception e3) {
            exc = e3;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final /* bridge */ /* synthetic */ zzvb zzc(zzuy zzuyVar) throws IOException {
        throw null;
    }
}
