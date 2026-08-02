package com.google.android.gms.internal.p002firebaseauthapi;

import K9.r;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzaif implements zzaez<zzaif> {
    private static final String zza = "zzaif";
    private String zzb;
    private String zzc;
    private String zzd;
    private zzahy zze;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r2.equals("REVERT_SECOND_FACTOR_ADDITION") != false) goto L40;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaif zza(String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = r.a(jSONObject.optString("email"));
            this.zzc = r.a(jSONObject.optString("newEmail"));
            int optInt = jSONObject.optInt("reqType");
            String str3 = null;
            if (optInt != 1) {
                switch (optInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.zzd = str2;
            if (TextUtils.isEmpty(str2)) {
                String optString = jSONObject.optString("requestType");
                switch (optString.hashCode()) {
                    case -1874510116:
                        break;
                    case -1452371317:
                        if (optString.equals("PASSWORD_RESET")) {
                            str3 = optString;
                            break;
                        }
                        break;
                    case -1341836234:
                        if (optString.equals("VERIFY_EMAIL")) {
                            str3 = optString;
                            break;
                        }
                        break;
                    case -1099157829:
                        if (optString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            str3 = optString;
                            break;
                        }
                        break;
                    case 870738373:
                        if (optString.equals("EMAIL_SIGNIN")) {
                            str3 = optString;
                            break;
                        }
                        break;
                    case 970484929:
                        if (optString.equals("RECOVER_EMAIL")) {
                            str3 = optString;
                            break;
                        }
                        break;
                }
                this.zzd = str3;
            }
            if (jSONObject.has("mfaInfo")) {
                this.zze = zzahy.zza(jSONObject.optJSONObject("mfaInfo"));
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

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zzb != null;
    }

    public final boolean zzf() {
        return this.zze != null;
    }

    public final boolean zzg() {
        return this.zzc != null;
    }

    public final boolean zzh() {
        return this.zzd != null;
    }

    public final zzahy zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
