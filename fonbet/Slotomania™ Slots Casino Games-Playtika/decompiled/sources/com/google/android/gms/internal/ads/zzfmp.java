package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfmp {
    private final HashMap zza = new HashMap();

    public final zzfmo zza(zzfmf zzfmfVar, Context context, zzflx zzflxVar, zzfmu zzfmuVar) {
        HashMap hashMap = this.zza;
        zzfmo zzfmoVar = (zzfmo) hashMap.get(zzfmfVar);
        if (zzfmoVar != null) {
            return zzfmoVar;
        }
        zzfmc zzfmcVar = new zzfmc(zzfmi.zza(zzfmfVar, context));
        zzfmo zzfmoVar2 = new zzfmo(zzfmcVar, new zzfmx(zzfmcVar, zzflxVar, zzfmuVar));
        hashMap.put(zzfmfVar, zzfmoVar2);
        return zzfmoVar2;
    }
}
