package s7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.p4;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final f8.l f22811a;

    static {
        f8.b bVar = f8.e.f9502b;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        u6.h.f(24, objArr);
        f22811a = f8.e.f(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(o4 o4Var, f8.q qVar, f8.q qVar2, f8.s sVar, char[] cArr, int i5, int i10, int i11, String str, String str2, String str3, boolean z5, boolean z7) {
        h3 h3Var;
        char c2;
        int c8 = c(o4Var);
        if (c8 > 0 && (i10 != 1 || i5 != 1)) {
            cArr[c8] = '2';
        }
        if (g(o4Var, qVar2) == p4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c2 = '3';
        } else {
            if (o4Var == o4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i11 == 1 && sVar.f9538d.equals(str)) {
                if (c8 > 0 && cArr[c8] != '2') {
                    cArr[c8] = '1';
                }
                return true;
            }
            if (qVar.containsKey(o4Var) && (h3Var = (h3) qVar.get(o4Var)) != null) {
                int ordinal = h3Var.ordinal();
                p4 p4Var = p4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    p4 p4Var2 = p4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return g(o4Var, qVar2) == p4Var ? f(o4Var, cArr, str3, z7) : e(o4Var, cArr, str2, z5);
                        }
                        if (ordinal == 3) {
                            return g(o4Var, qVar2) == p4Var2 ? e(o4Var, cArr, str2, z5) : f(o4Var, cArr, str3, z7);
                        }
                    } else if (g(o4Var, qVar2) != p4Var2) {
                        return f(o4Var, cArr, str3, z7);
                    }
                } else if (g(o4Var, qVar2) != p4Var) {
                    return e(o4Var, cArr, str2, z5);
                }
                c2 = '8';
            }
            c2 = '0';
        }
        if (c8 <= 0 || cArr[c8] == '2') {
            return false;
        }
        cArr[c8] = c2;
        return false;
    }

    public static final int c(o4 o4Var) {
        if (o4Var == o4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (o4Var == o4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (o4Var == o4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return o4Var == o4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(o4 o4Var, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str3 = CommonUrlParts.Values.FALSE_INTEGER;
        String valueOf = (isEmpty || str.length() < o4Var.a()) ? CommonUrlParts.Values.FALSE_INTEGER : String.valueOf(str.charAt(o4Var.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= o4Var.a()) {
            str3 = String.valueOf(str2.charAt(o4Var.a() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str3));
    }

    public static final boolean e(o4 o4Var, char[] cArr, String str, boolean z5) {
        char c2;
        int c8 = c(o4Var);
        if (!z5) {
            c2 = '4';
        } else {
            if (str.length() >= o4Var.a()) {
                char charAt = str.charAt(o4Var.a() - 1);
                boolean z7 = charAt == '1';
                if (c8 > 0 && cArr[c8] != '2') {
                    cArr[c8] = charAt != '1' ? '6' : '1';
                }
                return z7;
            }
            c2 = '0';
        }
        if (c8 > 0 && cArr[c8] != '2') {
            cArr[c8] = c2;
        }
        return false;
    }

    public static final boolean f(o4 o4Var, char[] cArr, String str, boolean z5) {
        char c2;
        int c8 = c(o4Var);
        if (!z5) {
            c2 = '5';
        } else {
            if (str.length() >= o4Var.a()) {
                char charAt = str.charAt(o4Var.a() - 1);
                boolean z7 = charAt == '1';
                if (c8 > 0 && cArr[c8] != '2') {
                    cArr[c8] = charAt != '1' ? '7' : '1';
                }
                return z7;
            }
            c2 = '0';
        }
        if (c8 > 0 && cArr[c8] != '2') {
            cArr[c8] = c2;
        }
        return false;
    }

    public static final p4 g(o4 o4Var, f8.q qVar) {
        Object obj = qVar.get(o4Var);
        if (obj == null) {
            obj = p4.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (p4) obj;
    }
}
