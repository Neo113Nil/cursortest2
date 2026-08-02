package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import defpackage.a0p;
import defpackage.awf;
import defpackage.djh;
import defpackage.hv9;
import defpackage.vvf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzof {
    public static final vvf a = hv9.B("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(zzabw zzabwVar, awf awfVar, awf awfVar2, djh djhVar, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        a0p a0pVar;
        char c;
        int c2 = c(zzabwVar);
        if (c2 > 0 && (i2 != 1 || i != 1)) {
            cArr[c2] = '2';
        }
        if (g(zzabwVar, awfVar2) == zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && djhVar.d.equals(str)) {
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = '1';
                }
                return true;
            }
            if (awfVar.containsKey(zzabwVar) && (a0pVar = (a0p) awfVar.get(zzabwVar)) != null) {
                int ordinal = a0pVar.ordinal();
                zzabx zzabxVar = zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    zzabx zzabxVar2 = zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return g(zzabwVar, awfVar2) == zzabxVar ? f(zzabwVar, cArr, str3, z2) : e(zzabwVar, cArr, str2, z);
                        }
                        if (ordinal == 3) {
                            return g(zzabwVar, awfVar2) == zzabxVar2 ? e(zzabwVar, cArr, str2, z) : f(zzabwVar, cArr, str3, z2);
                        }
                    } else if (g(zzabwVar, awfVar2) != zzabxVar2) {
                        return f(zzabwVar, cArr, str3, z2);
                    }
                } else if (g(zzabwVar, awfVar2) != zzabxVar) {
                    return e(zzabwVar, cArr, str2, z);
                }
                c = '8';
            }
            c = '0';
        }
        if (c2 <= 0 || cArr[c2] == '2') {
            return false;
        }
        cArr[c2] = c;
        return false;
    }

    public static final int c(zzabw zzabwVar) {
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzabwVar == zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(zzabw zzabwVar, String str, String str2) {
        String str3 = "0";
        String valueOf = (TextUtils.isEmpty(str) || str.length() < zzabwVar.zza()) ? "0" : String.valueOf(str.charAt(zzabwVar.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= zzabwVar.zza()) {
            str3 = String.valueOf(str2.charAt(zzabwVar.zza() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str3));
    }

    public static final boolean e(zzabw zzabwVar, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(zzabwVar);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= zzabwVar.zza()) {
                char charAt = str.charAt(zzabwVar.zza() - 1);
                boolean z2 = charAt == '1';
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = charAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final boolean f(zzabw zzabwVar, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(zzabwVar);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= zzabwVar.zza()) {
                char charAt = str.charAt(zzabwVar.zza() - 1);
                boolean z2 = charAt == '1';
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = charAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final zzabx g(zzabw zzabwVar, awf awfVar) {
        Object obj = awfVar.get(zzabwVar);
        if (obj == null) {
            obj = zzabx.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (zzabx) obj;
    }
}
