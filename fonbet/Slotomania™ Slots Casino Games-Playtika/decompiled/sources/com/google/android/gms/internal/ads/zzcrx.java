package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcrx implements zzcrh {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzh().zzo();

    public zzcrx(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean parseBoolean = Boolean.parseBoolean(str);
        zzgVar.zzw(parseBoolean);
        if (parseBoolean) {
            com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
        }
    }
}
