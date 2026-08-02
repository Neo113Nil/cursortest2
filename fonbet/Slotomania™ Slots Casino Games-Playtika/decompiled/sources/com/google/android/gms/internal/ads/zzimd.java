package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public class zzimd {
    final LinkedHashMap zza;

    zzimd(int i) {
        this.zza = zzimf.zzc(i);
    }

    final zzimd zza(Object obj, zzimr zzimrVar) {
        zzimq.zza(obj, "key");
        zzimq.zza(zzimrVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zzimrVar);
        return this;
    }
}
