package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzbor implements zzbpe {
    zzbor() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcki zzckiVar = (zzcki) obj;
        if (map.containsKey(TtmlNode.START)) {
            zzckiVar.zzP().zzr();
        } else if (map.containsKey("stop")) {
            zzckiVar.zzP().zzs();
        } else if (map.containsKey("cancel")) {
            zzckiVar.zzP().zzt();
        }
    }
}
