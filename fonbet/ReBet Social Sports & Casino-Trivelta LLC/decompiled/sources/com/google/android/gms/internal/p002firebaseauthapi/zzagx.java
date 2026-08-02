package com.google.android.gms.internal.p002firebaseauthapi;

import G9.a;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.EmailAuthCredential;
import kb.C5220e;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzagx implements zzafa {
    private static final String zza = "zzagx";
    private final String zzb;
    private final String zzc;
    private final EmailAuthCredential zzd;
    private final String zze;
    private final String zzf;

    static {
        new a(zzagx.class.getSimpleName(), new String[0]);
    }

    public zzagx(EmailAuthCredential emailAuthCredential, String str, String str2) {
        this.zzd = (EmailAuthCredential) AbstractC3191o.m(emailAuthCredential);
        this.zzb = AbstractC3191o.g(emailAuthCredential.zzc());
        this.zzc = AbstractC3191o.g(emailAuthCredential.zze());
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() {
        C5220e c10 = C5220e.c(this.zzc);
        String a10 = c10 != null ? c10.a() : null;
        String d10 = c10 != null ? c10.d() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (a10 != null) {
            jSONObject.put("oobCode", a10);
        }
        if (d10 != null) {
            jSONObject.put("tenantId", d10);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzajk.zza(jSONObject, "captchaResp", str2);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final EmailAuthCredential zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
