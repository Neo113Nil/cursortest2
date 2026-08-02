package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final /* synthetic */ class zzbts implements zzbto {
    static final /* synthetic */ zzbts zza = new zzbts();

    private /* synthetic */ zzbts() {
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final /* synthetic */ Object zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }
}
