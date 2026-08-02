package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzahp implements zzahl {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzahp(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzahp zzb(zzes zzesVar) {
        int zzC = zzesVar.zzC();
        zzesVar.zzk(8);
        int zzC2 = zzesVar.zzC();
        int zzC3 = zzesVar.zzC();
        zzesVar.zzk(4);
        int zzC4 = zzesVar.zzC();
        zzesVar.zzk(12);
        return new zzahp(zzC, zzC2, zzC3, zzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final int zza() {
        return AviExtractor.FOURCC_avih;
    }
}
