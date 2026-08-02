package com.google.android.gms.internal.p002firebaseauthapi;

import K9.r;
import com.google.android.gms.common.internal.AbstractC3191o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzahs implements zzaez<zzahs> {
    private static final String zza = "zzahs";
    private String zzb;
    private zzah<zzaid> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahs zza(String str) {
        zzah<zzaid> zzg;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = r.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzak zzf = zzah.zzf();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        zzf.zza(jSONObject2 == null ? zzaid.zza(null, null) : zzaid.zza(r.a(jSONObject2.optString("provider")), r.a(jSONObject2.optString("enforcementState"))));
                    }
                    zzg = zzf.zza();
                    this.zzc = zzg;
                }
                zzg = zzah.zzg();
                this.zzc = zzg;
            }
            return this;
        } catch (NullPointerException e10) {
            e = e10;
            throw zzajk.zza(e, zza, str);
        } catch (JSONException e11) {
            e = e11;
            throw zzajk.zza(e, zza, str);
        }
    }

    public final String zzb(String str) {
        AbstractC3191o.g(str);
        zzah<zzaid> zzahVar = this.zzc;
        if (zzahVar != null && !zzahVar.isEmpty()) {
            zzah<zzaid> zzahVar2 = this.zzc;
            int size = zzahVar2.size();
            int i10 = 0;
            while (i10 < size) {
                zzaid zzaidVar = zzahVar2.get(i10);
                i10++;
                zzaid zzaidVar2 = zzaidVar;
                String zza2 = zzaidVar2.zza();
                String zzb = zzaidVar2.zzb();
                if (zza2 != null && zzb != null && zzb.equals(str)) {
                    return zzaidVar2.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        return zzb.equals("ENFORCE") || zzb.equals("AUDIT");
    }

    public final String zza() {
        return this.zzb;
    }
}
