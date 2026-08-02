package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;

@ShowFirstParty
/* loaded from: classes9.dex */
public final class zzbc extends com.google.android.gms.analytics.zzj<zzbc> {
    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("category", null);
        hashMap.put("action", null);
        hashMap.put("label", null);
        hashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
        return com.google.android.gms.analytics.zzj.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(zzbc zzbcVar) {
        TextUtils.isEmpty(null);
        TextUtils.isEmpty(null);
        TextUtils.isEmpty(null);
    }
}
