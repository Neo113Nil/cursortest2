package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzkq;
import com.google.common.collect.AbstractC3445z;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.u6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3372u6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3445z f34326a = AbstractC3445z.C("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static final boolean c(zzkp zzkpVar, com.google.common.collect.B b10, com.google.common.collect.B b11, com.google.common.collect.E e10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        com.google.common.collect.E e11;
        String str4;
        EnumC3364t6 enumC3364t6;
        char c10;
        int e12 = e(zzkpVar, b10, b11, e10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (e12 > 0) {
            i16 = i12;
            if (i16 == 1) {
                i15 = i11;
                if (i15 != 1) {
                    i16 = 1;
                } else {
                    i15 = 1;
                    i16 = 1;
                }
            } else {
                i15 = i11;
            }
            cArr[e12] = '2';
        } else {
            i15 = i11;
            i16 = i12;
        }
        if (i(zzkpVar, b10, b11, e10, cArr, i10, i15, i16, i13, i14, str, str2, str3, z10, z11, true) == zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            int i17 = i14;
            if (zzkpVar == zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                e11 = e10;
                str4 = str;
                if (i17 == 1) {
                    if (e11.contains(str4)) {
                        if (e12 > 0 && cArr[e12] != '2') {
                            cArr[e12] = '1';
                        }
                        return true;
                    }
                    i17 = 1;
                }
            } else {
                e11 = e10;
                str4 = str;
            }
            if (b10.containsKey(zzkpVar) && (enumC3364t6 = (EnumC3364t6) b10.get(zzkpVar)) != null) {
                int ordinal = enumC3364t6.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return i(zzkpVar, b10, b11, e10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) == zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(zzkpVar, b10, b11, e10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : g(zzkpVar, b10, b11, e10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        if (ordinal == 3) {
                            return i(zzkpVar, b10, b11, e11, cArr, i10, i15, i16, i13, i17, str4, str2, str3, z10, z11, true) == zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(zzkpVar, b10, b11, e10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : h(zzkpVar, b10, b11, e10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                    } else if (i(zzkpVar, b10, b11, e10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return h(zzkpVar, b10, b11, e10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                    }
                } else if (i(zzkpVar, b10, b11, e10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return g(zzkpVar, b10, b11, e10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                }
                c10 = '8';
            }
            c10 = '0';
        }
        if (e12 <= 0 || cArr[e12] == '2') {
            return false;
        }
        cArr[e12] = c10;
        return false;
    }

    public static final Map d(com.google.common.collect.B b10, com.google.common.collect.B b11, com.google.common.collect.E e10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return com.google.common.collect.B.m();
        }
        zzkp zzkpVar = zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        zzkq zzkqVar = (zzkq) b11.get(zzkpVar);
        zzkp zzkpVar2 = zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        zzkq zzkqVar2 = (zzkq) b11.get(zzkpVar2);
        zzkp zzkpVar3 = zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        zzkq zzkqVar3 = (zzkq) b11.get(zzkpVar3);
        zzkp zzkpVar4 = zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        zzkq zzkqVar4 = (zzkq) b11.get(zzkpVar4);
        return com.google.common.collect.B.a().f("Version", "2").f("VendorConsent", true != z10 ? "0" : "1").f("VendorLegitimateInterest", true != z11 ? "0" : "1").f("gdprApplies", i12 != 1 ? "0" : "1").f("EnableAdvertiserConsentMode", i11 != 1 ? "0" : "1").f("PolicyVersion", String.valueOf(i13)).f("CmpSdkID", String.valueOf(i10)).f("PurposeOneTreatment", i14 != 1 ? "0" : "1").f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(zzkqVar != null ? zzkqVar.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions3", String.valueOf(zzkqVar2 != null ? zzkqVar2.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions4", String.valueOf(zzkqVar3 != null ? zzkqVar3.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions7", String.valueOf(zzkqVar4 != null ? zzkqVar4.zza() : zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).i(com.google.common.collect.B.n("Purpose1", f(zzkpVar, b10, b11, e10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose3", f(zzkpVar2, b10, b11, e10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose4", f(zzkpVar3, b10, b11, e10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose7", f(zzkpVar4, b10, b11, e10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true))).i(com.google.common.collect.B.o("AuthorizePurpose1", true != c(zzkpVar, b10, b11, e10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose3", true != c(zzkpVar2, b10, b11, e10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose4", true != c(zzkpVar3, b10, b11, e10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose7", true != c(zzkpVar4, b10, b11, e10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).c();
    }

    public static final int e(zzkp zzkpVar, com.google.common.collect.B b10, com.google.common.collect.B b11, com.google.common.collect.E e10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkpVar == zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkpVar == zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String f(zzkp zzkpVar, com.google.common.collect.B b10, com.google.common.collect.B b11, com.google.common.collect.E e10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        String str4 = "0";
        String valueOf = (TextUtils.isEmpty(str2) || str2.length() < zzkpVar.zza()) ? "0" : String.valueOf(str2.charAt(zzkpVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkpVar.zza()) {
            str4 = String.valueOf(str3.charAt(zzkpVar.zza() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str4));
    }

    public static final boolean g(zzkp zzkpVar, com.google.common.collect.B b10, com.google.common.collect.B b11, com.google.common.collect.E e10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int e11 = e(zzkpVar, b10, b11, e10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z10) {
            c10 = '4';
        } else {
            if (str2.length() >= zzkpVar.zza()) {
                char charAt = str2.charAt(zzkpVar.zza() - 1);
                boolean z13 = charAt == '1';
                if (e11 > 0 && cArr[e11] != '2') {
                    cArr[e11] = charAt != '1' ? '6' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (e11 > 0 && cArr[e11] != '2') {
            cArr[e11] = c10;
        }
        return false;
    }

    public static final boolean h(zzkp zzkpVar, com.google.common.collect.B b10, com.google.common.collect.B b11, com.google.common.collect.E e10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int e11 = e(zzkpVar, b10, b11, e10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z11) {
            c10 = '5';
        } else {
            if (str3.length() >= zzkpVar.zza()) {
                char charAt = str3.charAt(zzkpVar.zza() - 1);
                boolean z13 = charAt == '1';
                if (e11 > 0 && cArr[e11] != '2') {
                    cArr[e11] = charAt != '1' ? '7' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (e11 > 0 && cArr[e11] != '2') {
            cArr[e11] = c10;
        }
        return false;
    }

    public static final zzkq i(zzkp zzkpVar, com.google.common.collect.B b10, com.google.common.collect.B b11, com.google.common.collect.E e10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return (zzkq) b11.getOrDefault(zzkpVar, zzkq.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
