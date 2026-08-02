package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3191o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzaji implements zzafa {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzaji(String str, String str2, String str3) {
        this.zza = AbstractC3191o.g(str);
        this.zzb = AbstractC3191o.g(str2);
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaEnrollmentId", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
