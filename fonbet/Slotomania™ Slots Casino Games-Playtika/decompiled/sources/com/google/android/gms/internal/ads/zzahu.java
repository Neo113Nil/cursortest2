package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzahu implements zzahl {
    public final String zza;

    private zzahu(String str) {
        this.zza = str;
    }

    public static zzahu zzb(zzes zzesVar) {
        return new zzahu(zzesVar.zzK(zzesVar.zzd(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final int zza() {
        return AviExtractor.FOURCC_strn;
    }
}
