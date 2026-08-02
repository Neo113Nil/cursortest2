package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzehl implements zzfny {
    static final /* synthetic */ zzehl zza = new zzehl();

    private /* synthetic */ zzehl() {
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
        com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
        return jSONObject;
    }
}
