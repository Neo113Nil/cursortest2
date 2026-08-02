package com.google.android.gms.internal.p002firebaseauthapi;

import K9.r;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzaha implements zzaez<zzaha> {
    private static final String zza = "zzaha";
    private String zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaha zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = r.a(jSONObject.optString("idToken"));
            this.zzc = r.a(jSONObject.optString("refreshToken"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzajk.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
