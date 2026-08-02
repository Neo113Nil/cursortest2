package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3191o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzagm {
    private final String zza;

    public zzagm(String str) {
        this.zza = AbstractC3191o.g(str);
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
