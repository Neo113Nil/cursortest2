package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.wt3;
import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class ErrorBuilder {
    private static IronSourceError a() {
        return buildGenericError("Mediation - wrong configuration");
    }

    public static IronSourceError adContainerIsNull(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, dmi.y(str, " banner container is null"));
    }

    public static IronSourceError buildCappedPerPlacementError(String str) {
        return new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
    }

    public static IronSourceError buildCappedPerSessionError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CAPPED_PER_SESSION, dmi.y(str, " Show Fail - Networks have reached their cap per session"));
    }

    public static IronSourceError buildGenericError(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new IronSourceError(510, str);
    }

    public static IronSourceError buildInitFailedError(String str) {
        StringBuilder sb = new StringBuilder("Init failed - ");
        if (TextUtils.isEmpty(str)) {
            str = "unknown error";
        }
        sb.append(str);
        return new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, sb.toString());
    }

    public static IronSourceError buildInvalidConfigurationError(String str) {
        return new IronSourceError(501, lnb.o("", str, " Init Fail - Configurations from the server are not valid"));
    }

    public static IronSourceError buildInvalidCredentialsError(String str, String str2, String str3) {
        StringBuilder s = mz1.s("Init Fail - ", str, " value ", str2, " is not valid");
        s.append(!TextUtils.isEmpty(str3) ? dmi.q(" - ", str3) : "");
        return new IronSourceError(506, s.toString());
    }

    public static IronSourceError buildInvalidKeyValueError(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        StringBuilder q = wt3.q("Mediation - ", str, " value is not valid ");
        q.append(!TextUtils.isEmpty(str2) ? dmi.q(" - ", str2) : "");
        return new IronSourceError(506, q.toString());
    }

    public static IronSourceError buildKeyNotSetError(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return a();
        }
        return new IronSourceError(505, str3 + " Mediation - " + str + " is not set for " + str2);
    }

    public static IronSourceError buildLoadFailedError(String str, String str2, String str3) {
        String o = mz1.o(wt3.q("", str, " Load Fail"), TextUtils.isEmpty(str2) ? "" : dmi.q(" ", str2), " - ");
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown error";
        }
        return new IronSourceError(510, dmi.q(o, str3));
    }

    public static IronSourceError buildNoAdsToShowError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, dmi.y(str, " Show Fail - No ads to show"));
    }

    public static IronSourceError buildNoConfigurationAvailableError(String str) {
        return new IronSourceError(501, lnb.o("", str, " Init Fail - Unable to retrieve configurations from the server"));
    }

    public static IronSourceError buildNoInternetConnectionInitFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, lnb.o("", str, " Init Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionLoadFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, lnb.o("", str, " Load Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionShowFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, lnb.o("", str, " Show Fail - No Internet connection"));
    }

    public static IronSourceError buildNonExistentInstanceError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, dmi.y(str, " The requested instance does not exist"));
    }

    public static IronSourceError buildShowFailedError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, wv8.i(str, " Show Fail - ", str2));
    }

    public static IronSourceError buildUsingCachedConfigurationError(String str, String str2) {
        return new IronSourceError(502, fc6.n("Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:", str, " and userId:", str2));
    }

    public static IronSourceError unsupportedBannerSize(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, dmi.y(str, " unsupported banner size"));
    }

    public static IronSourceError buildInitFailedError(String str, String str2) {
        String i;
        if (TextUtils.isEmpty(str)) {
            i = dmi.y(str2, " init failed due to an unknown error");
        } else {
            i = wv8.i(str2, " - ", str);
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, i);
    }

    public static IronSourceError buildLoadFailedError(String str) {
        return new IronSourceError(510, TextUtils.isEmpty(str) ? "Load failed due to an unknown error" : dmi.q("Load failed - ", str));
    }
}
