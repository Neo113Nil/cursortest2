package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.twilio.voice.EventKeys;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzajg implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzajg() {
    }

    public static zzajg zza(String str, String str2, boolean z10) {
        zzajg zzajgVar = new zzajg();
        zzajgVar.zzb = AbstractC3191o.g(str);
        zzajgVar.zzc = AbstractC3191o.g(str2);
        zzajgVar.zzf = z10;
        return zzajgVar;
    }

    public static zzajg zzb(String str, String str2, boolean z10) {
        zzajg zzajgVar = new zzajg();
        zzajgVar.zza = AbstractC3191o.g(str);
        zzajgVar.zzd = AbstractC3191o.g(str2);
        zzajgVar.zzf = z10;
        return zzajgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put(EventKeys.ERROR_CODE, this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
