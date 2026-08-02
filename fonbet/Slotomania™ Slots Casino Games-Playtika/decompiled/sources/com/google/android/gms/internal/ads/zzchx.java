package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzchx {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzaul zzaulVar;
        zzauk zzaukVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzaug(new zzchw(duplicate), zzcib.zzb).zzc().iterator();
            while (true) {
                zzaulVar = null;
                if (!it.hasNext()) {
                    zzaukVar = null;
                    break;
                }
                zzaui zzauiVar = (zzaui) it.next();
                if (zzauiVar instanceof zzauk) {
                    zzaukVar = (zzauk) zzauiVar;
                    break;
                }
            }
            Iterator it2 = zzaukVar.zzc().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzaui zzauiVar2 = (zzaui) it2.next();
                if (zzauiVar2 instanceof zzaul) {
                    zzaulVar = (zzaul) zzauiVar2;
                    break;
                }
            }
            long zzd = (zzaulVar.zzd() * 1000) / zzaulVar.zzc();
            this.zza = zzd;
            return zzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
