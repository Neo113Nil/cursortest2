package com.google.android.gms.internal.p002firebaseauthapi;

import K9.r;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzajh implements zzaez<zzajh> {
    private static final String zza = "zzajh";
    private String zzb;
    private String zzc;
    private long zzd;
    private List<zzahy> zze;
    private String zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzajh zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            r.a(jSONObject.optString("localId", null));
            r.a(jSONObject.optString("email", null));
            r.a(jSONObject.optString("displayName", null));
            this.zzb = r.a(jSONObject.optString("idToken", null));
            r.a(jSONObject.optString("photoUrl", null));
            this.zzc = r.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = zzahy.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzf = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzajk.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }

    @NonNull
    public final String zzd() {
        return this.zzc;
    }

    public final List<zzahy> zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzf);
    }

    @NonNull
    public final String zzb() {
        return this.zzb;
    }
}
