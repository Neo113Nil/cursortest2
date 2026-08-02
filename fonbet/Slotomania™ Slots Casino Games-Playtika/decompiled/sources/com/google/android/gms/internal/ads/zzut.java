package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzut implements zzuz {
    private final Context zza;

    @Deprecated
    public zzut() {
        this.zza = null;
    }

    public zzut(Context context, zzgto zzgtoVar, zzgto zzgtoVar2) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final zzvb zzc(zzuy zzuyVar) throws IOException {
        Context context;
        zzve zzveVar;
        MediaCodec createByCodecName;
        if (Build.VERSION.SDK_INT >= 31 || ((context = this.zza) != null && Build.VERSION.SDK_INT >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int zzf = zzas.zzf(zzuyVar.zzc.zzp);
            zzef.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfk.zzR(zzf)));
            zzul zzulVar = new zzul(zzf);
            zzulVar.zza(true);
            return zzulVar.zzb(zzuyVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzveVar = zzuyVar.zza;
            String str = zzveVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
        } catch (IOException e) {
            e = e;
        } catch (RuntimeException e2) {
            e = e2;
        }
        try {
            Trace.beginSection("configureCodec");
            Surface surface = zzuyVar.zzd;
            int i = 0;
            if (surface == null && zzveVar.zzh && Build.VERSION.SDK_INT >= 35) {
                i = 8;
            }
            createByCodecName.configure(zzuyVar.zzb, surface, (MediaCrypto) null, i);
            Trace.endSection();
            Trace.beginSection("startCodec");
            createByCodecName.start();
            Trace.endSection();
            return new zzvy(createByCodecName, zzuyVar.zzf, null);
        } catch (IOException | RuntimeException e3) {
            e = e3;
            mediaCodec = createByCodecName;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
