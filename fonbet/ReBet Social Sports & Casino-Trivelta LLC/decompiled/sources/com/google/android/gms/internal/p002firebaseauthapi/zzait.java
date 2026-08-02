package com.google.android.gms.internal.p002firebaseauthapi;

import K9.r;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzait implements zzaez<zzait> {
    private static final String zza = "zzait";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzait zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject == null) {
                return this;
            }
            this.zzb = r.a(optJSONObject.optString("sessionInfo"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzajk.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
