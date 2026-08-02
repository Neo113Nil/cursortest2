package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3191o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzahj implements zzafa {
    private String zza = zzahh.REFRESH_TOKEN.toString();
    private String zzb;

    public zzahj(String str) {
        this.zzb = AbstractC3191o.g(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
