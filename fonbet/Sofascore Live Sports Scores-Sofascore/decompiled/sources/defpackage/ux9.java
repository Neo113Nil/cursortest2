package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.sdk.InMobiSdk;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ux9 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00e4, code lost:
    
        if (r6.equals("BELOW_18") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0137, code lost:
    
        if (r6.equals("EDUCATION_HIGHSCHOOLORLESS") == false) goto L91;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String str = "";
        String str2 = str;
        String str3 = str2;
        for (String str4 : bundle.keySet()) {
            String string = bundle.getString(str4);
            if (str4.equals("AREA_CODE")) {
                if (!"".equals(string)) {
                    InMobiSdk.setAreaCode(string);
                }
            } else if (str4.equals("AGE")) {
                try {
                    if (!"".equals(string)) {
                        InMobiSdk.setAge(Integer.parseInt(string));
                    }
                } catch (NumberFormatException unused) {
                }
            } else if (str4.equals("POSTAL_CODE")) {
                if (!"".equals(string)) {
                    InMobiSdk.setPostalCode(string);
                }
            } else if (str4.equals("LANGUAGE")) {
                if (!"".equals(string)) {
                    InMobiSdk.setLanguage(string);
                }
            } else if (str4.equals("CITY")) {
                str = string;
            } else if (str4.equals("STATE")) {
                str2 = string;
            } else if (str4.equals("COUNTRY")) {
                str3 = string;
            } else {
                char c = 2;
                InMobiSdk.AgeGroup ageGroup = null;
                InMobiSdk.Education education = null;
                if (str4.equals("AGE_GROUP")) {
                    if (string != null) {
                        switch (string.hashCode()) {
                            case -2144603857:
                                if (string.equals("BETWEEN_55_AND_65")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1892470079:
                                if (string.equals("ABOVE_65")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1873932011:
                                break;
                            case -1017207884:
                                if (string.equals("BETWEEN_25_AND_29")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -337149426:
                                if (string.equals("BETWEEN_45_AND_54")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1346187892:
                                if (string.equals("BETWEEN_30_AND_34")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1470305006:
                                if (string.equals("BETWEEN_35_AND_44")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1723710283:
                                if (string.equals("BETWEEN_18_AND_24")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                ageGroup = InMobiSdk.AgeGroup.BETWEEN_55_AND_65;
                                break;
                            case 1:
                                ageGroup = InMobiSdk.AgeGroup.ABOVE_65;
                                break;
                            case 2:
                                ageGroup = InMobiSdk.AgeGroup.BELOW_18;
                                break;
                            case 3:
                                ageGroup = InMobiSdk.AgeGroup.BETWEEN_25_AND_29;
                                break;
                            case 4:
                                ageGroup = InMobiSdk.AgeGroup.BETWEEN_45_AND_54;
                                break;
                            case 5:
                                ageGroup = InMobiSdk.AgeGroup.BETWEEN_30_AND_34;
                                break;
                            case 6:
                                ageGroup = InMobiSdk.AgeGroup.BETWEEN_35_AND_44;
                                break;
                            case 7:
                                ageGroup = InMobiSdk.AgeGroup.BETWEEN_18_AND_24;
                                break;
                        }
                        if (ageGroup != null) {
                            InMobiSdk.setAgeGroup(ageGroup);
                        }
                    }
                } else if (str4.equals("EDUCATION")) {
                    if (string != null) {
                        switch (string.hashCode()) {
                            case -2023680018:
                                if (string.equals("EDUCATION_COLLEGEORGRADUATE")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1302797304:
                                if (string.equals("EDUCATION_POSTGRADUATEORABOVE")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1522352361:
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                education = InMobiSdk.Education.COLLEGE_OR_GRADUATE;
                                break;
                            case 1:
                                education = InMobiSdk.Education.POST_GRADUATE_OR_ABOVE;
                                break;
                            case 2:
                                education = InMobiSdk.Education.HIGH_SCHOOL_OR_LESS;
                                break;
                        }
                        if (education != null) {
                            InMobiSdk.setEducation(education);
                        }
                    }
                } else if (str4.equals("LOGLEVEL")) {
                    if (string != null) {
                        InMobiSdk.setLogLevel(string.equals("LOGLEVEL_DEBUG") ? InMobiSdk.LogLevel.DEBUG : string.equals("LOGLEVEL_ERROR") ? InMobiSdk.LogLevel.ERROR : InMobiSdk.LogLevel.NONE);
                    } else {
                        InMobiSdk.setLogLevel(InMobiSdk.LogLevel.NONE);
                    }
                } else if (str4.equals("INTERESTS")) {
                    InMobiSdk.setInterests(string);
                }
            }
        }
        if (Objects.equals(str, "") || Objects.equals(str2, "") || Objects.equals(str3, "")) {
            return;
        }
        InMobiSdk.setLocationWithCityStateCountry(str, str2, str3);
    }

    public static AdSize b(Context context, AdSize adSize, jec jecVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50));
        arrayList.add(new AdSize(300, 250));
        arrayList.add(new AdSize(728, 90));
        jecVar.getClass();
        context.getClass();
        adSize.getClass();
        return MediationUtils.findClosestSize(context, adSize, arrayList);
    }

    public static int c(InMobiAdRequestStatus inMobiAdRequestStatus) {
        switch (tx9.a[inMobiAdRequestStatus.getStatusCode().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            default:
                return 99;
        }
    }

    public static long d(Bundle bundle) {
        String string = bundle.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static void e() {
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        boolean z = n9e.I() && requestConfiguration.getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD;
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1 || z) {
            InMobiSdk.setIsAgeRestricted(true);
        } else if (requestConfiguration.getTagForChildDirectedTreatment() == 0 || requestConfiguration.getTagForUnderAgeOfConsent() == 0) {
            InMobiSdk.setIsAgeRestricted(false);
        }
    }

    public static AdError f(long j, String str) {
        if (!TextUtils.isEmpty(str) && j > 0) {
            return null;
        }
        AdError u = yso.u(100, "Missing or invalid Account ID or Placement ID for this ad source instance in the AdMob or Ad Manager UI.");
        u.toString();
        return u;
    }
}
