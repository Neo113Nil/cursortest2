package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzacf {
    private final ByteBuffer zza = ByteBuffer.allocateDirect(500);
    private zzgs zzb;

    private final void zzd(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((zzgr) list.get(i)).zza == 1) {
                this.zzb = zzgs.zza((zzgr) list.get(i));
            }
        }
    }

    private final void zze() {
        ByteBuffer byteBuffer = this.zza;
        byteBuffer.position(byteBuffer.limit());
    }

    public final int zza(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.hasRemaining()) {
            zzd(zzgt.zza(byteBuffer2));
            zze();
        }
        List zza = zzgt.zza(byteBuffer);
        zzd(zza);
        int size = zza.size() - 1;
        int i = 0;
        while (size >= 0) {
            zzgr zzgrVar = (zzgr) zza.get(size);
            int i2 = zzgrVar.zza;
            if (i2 != 2 && i2 != 15) {
                if (i2 == 3) {
                    if (!z) {
                        break;
                    }
                    i2 = 3;
                }
                if (i2 != 6) {
                    if (i2 != 3) {
                        break;
                    }
                }
                zzgs zzgsVar = this.zzb;
                if (zzgsVar == null) {
                    break;
                }
                zzgp zzb = zzgp.zzb(zzgsVar, zzgrVar);
                if (zzb == null) {
                    break;
                }
                if (zzb.zza()) {
                    break;
                }
            }
            if (((zzgr) zza.get(size)).zza == 6 || ((zzgr) zza.get(size)).zza == 3) {
                i++;
            }
            size--;
        }
        return (i > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? ((zzgr) zza.get(size)).zzb.limit() : byteBuffer.position();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, position + 500));
        ByteBuffer byteBuffer2 = this.zza;
        byteBuffer2.clear();
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        byteBuffer.position(position);
        byteBuffer.limit(limit);
    }

    public final void zzc() {
        this.zzb = null;
        zze();
    }
}
