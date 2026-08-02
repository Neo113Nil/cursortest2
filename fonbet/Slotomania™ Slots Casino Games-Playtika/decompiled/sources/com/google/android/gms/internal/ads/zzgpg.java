package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.safedk.android.analytics.brandsafety.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgpg implements zzgor {
    private final List zza = new ArrayList();

    zzgpg() {
    }

    public final synchronized void zza(List list) {
        List list2 = this.zza;
        list2.clear();
        list2.addAll(list);
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzb(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final synchronized void zzc(Map map, Context context, View view) {
        List list = this.zza;
        map.put(m.B, new ArrayList(list));
        list.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzd(Map map) {
    }
}
