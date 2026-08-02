package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzgsn;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final /* synthetic */ class zzal implements zzgsn {
    static final /* synthetic */ zzal zza = new zzal();

    private /* synthetic */ zzal() {
    }

    @Override // com.google.android.gms.internal.ads.zzgsn
    public final /* synthetic */ Object apply(Object obj) {
        int i = zzap.zze;
        return ((JSONObject) obj).optString("nas");
    }
}
