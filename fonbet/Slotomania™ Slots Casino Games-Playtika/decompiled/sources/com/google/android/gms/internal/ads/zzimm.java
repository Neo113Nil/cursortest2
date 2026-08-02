package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzimm extends zzime {
    static {
        zzimj.zza(Collections.emptyMap());
    }

    /* synthetic */ zzimm(Map map, zzimk zzimkVar) {
        super(map);
    }

    public static zziml zzc(int i) {
        return new zziml(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzc = zzimf.zzc(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzc.put(entry.getKey(), ((zzimr) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzc);
    }
}
