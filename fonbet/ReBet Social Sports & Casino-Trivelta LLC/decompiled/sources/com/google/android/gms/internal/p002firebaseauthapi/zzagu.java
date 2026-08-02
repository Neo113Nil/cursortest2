package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3191o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzagu implements zzafa {
    private String zza;

    public zzagu(String str) {
        this.zza = AbstractC3191o.g(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        return jSONObject.toString();
    }
}
