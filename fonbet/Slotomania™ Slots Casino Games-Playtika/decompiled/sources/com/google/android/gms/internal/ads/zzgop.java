package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgop {
    private final Set zza;
    private final zzgpg zzb;

    zzgop(zzgpg zzgpgVar, Set set) {
        this.zza = set;
        this.zzb = zzgpgVar;
    }

    public final void zza(List list) {
        this.zzb.zza(list);
    }

    public final Map zzb() {
        HashMap hashMap = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgor) it.next()).zzb(hashMap);
        }
        return hashMap;
    }

    public final Map zzc(Context context, View view) {
        HashMap hashMap = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgor) it.next()).zzc(hashMap, context, view);
        }
        return hashMap;
    }

    public final Map zzd() {
        HashMap hashMap = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgor) it.next()).zzd(hashMap);
        }
        return hashMap;
    }
}
