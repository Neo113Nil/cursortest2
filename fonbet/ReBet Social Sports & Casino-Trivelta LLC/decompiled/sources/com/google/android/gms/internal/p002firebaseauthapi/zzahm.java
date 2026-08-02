package com.google.android.gms.internal.p002firebaseauthapi;

import android.annotation.SuppressLint;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.ActionCodeSettings;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzahm implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private ActionCodeSettings zze;
    private String zzf;
    private String zzg;

    public zzahm(int i10) {
        this.zza = zza(i10);
    }

    public static zzahm zza(ActionCodeSettings actionCodeSettings, String str, String str2) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(actionCodeSettings);
        return new zzahm(7, actionCodeSettings, null, str2, str, null, null);
    }

    public final ActionCodeSettings zzb() {
        return this.zze;
    }

    public final zzahm zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzahm zzd(String str) {
        this.zzd = AbstractC3191o.g(str);
        return this;
    }

    public final zzahm zzb(String str) {
        this.zzb = AbstractC3191o.g(str);
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    private zzahm(int i10, ActionCodeSettings actionCodeSettings, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (ActionCodeSettings) AbstractC3191o.m(actionCodeSettings);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzahm zza(ActionCodeSettings actionCodeSettings) {
        this.zze = (ActionCodeSettings) AbstractC3191o.m(actionCodeSettings);
        return this;
    }

    public final zzahm zza(String str) {
        this.zzg = str;
        return this;
    }

    @SuppressLint({"SwitchIntDef"})
    private static String zza(int i10) {
        if (i10 == 1) {
            return "PASSWORD_RESET";
        }
        if (i10 == 4) {
            return "VERIFY_EMAIL";
        }
        if (i10 == 6) {
            return "EMAIL_SIGNIN";
        }
        if (i10 != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
        return "VERIFY_AND_CHANGE_EMAIL";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() {
        int i10;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.getClass();
        i10 = 1;
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i10 = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i10 = 7;
                break;
            case "EMAIL_SIGNIN":
                i10 = 6;
                break;
            default:
                i10 = 0;
                break;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        ActionCodeSettings actionCodeSettings = this.zze;
        if (actionCodeSettings != null) {
            jSONObject.put("androidInstallApp", actionCodeSettings.h());
            jSONObject.put("canHandleCodeInApp", this.zze.g());
            if (this.zze.m() != null) {
                jSONObject.put("continueUrl", this.zze.m());
            }
            if (this.zze.k() != null) {
                jSONObject.put("iosBundleId", this.zze.k());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.j() != null) {
                jSONObject.put("androidPackageName", this.zze.j());
            }
            if (this.zze.i() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.i());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
            if (this.zze.l() != null) {
                jSONObject.put("linkDomain", this.zze.l());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzajk.zza(jSONObject, "captchaResp", str6);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
