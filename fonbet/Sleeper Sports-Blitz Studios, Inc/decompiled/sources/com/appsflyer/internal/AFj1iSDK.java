package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0013\u0010\u000b\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFj1iSDK;", "", "Lcom/appsflyer/internal/AFd1rSDK;", "p0", "Lcom/appsflyer/internal/AFj1dSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1rSDK;Lcom/appsflyer/internal/AFj1dSDK;)V", "", "getMediationNetwork", "()Ljava/lang/String;", "getMonetizationNetwork", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFh1hSDK;", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1hSDK;)Ljava/lang/String;", "", "(Ljava/lang/String;Z)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFd1rSDK;", "Lcom/appsflyer/internal/AFj1dSDK;", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFj1iSDK {
    public static String areAllFieldsValid;
    private static final String component1;
    public static final String component2;
    public static final String component3;
    public static final String component4;
    public static final String getCurrencyIso4217Code;
    public static final String getMediationNetwork;
    public static final String getRevenue;
    public final AFd1rSDK AFAdRevenueData;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public final AFj1dSDK getMediationNetwork;

    private AFj1iSDK(AFd1rSDK aFd1rSDK, AFj1dSDK aFj1dSDK) {
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        Intrinsics.checkNotNullParameter(aFj1dSDK, "");
        this.AFAdRevenueData = aFd1rSDK;
        this.getMediationNetwork = aFj1dSDK;
    }

    public /* synthetic */ AFj1iSDK(AFd1rSDK aFd1rSDK, AFj1eSDK aFj1eSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1rSDK, (i & 2) != 0 ? new AFj1eSDK() : aFj1eSDK);
    }

    static {
        String str = AFb1rSDK.getCurrencyIso4217Code + "/androidevent?app_id=";
        component1 = str;
        getCurrencyIso4217Code = "https://%sattr.%s/api/v" + str;
        getRevenue = "https://%sadrevenue.%s/api/v2/generic/v6.15.1/android?app_id=";
        getMediationNetwork = "https://%sconversions.%s/api/v" + str;
        component3 = "https://%slaunches.%s/api/v" + str;
        component2 = "https://%sinapps.%s/api/v" + str;
        component4 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        areAllFieldsValid = "https://%svalidate.%s/api/v" + AFb1rSDK.getCurrencyIso4217Code + "/androidevent?buildnumber=6.15.1&app_id=";
    }

    public final String getMonetizationNetwork(String p0, String p1) {
        String packageName = this.AFAdRevenueData.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String areAllFieldsValid2 = this.AFAdRevenueData.areAllFieldsValid();
        String str = areAllFieldsValid2;
        if (str != null && !StringsKt.isBlank(str)) {
            areAllFieldsValid2 = "-" + StringsKt.trim((CharSequence) str).toString();
        }
        if (areAllFieldsValid2 == null) {
            areAllFieldsValid2 = "";
        }
        String obj = StringsKt.trim((CharSequence) areAllFieldsValid2).toString();
        Uri.Builder appendPath = Uri.parse(this.getMediationNetwork.getMediationNetwork("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + obj);
        Intrinsics.checkNotNullExpressionValue(appendPath, "");
        if (p0 == null || p1 == null) {
            String str2 = p0 == null ? "devKey" : "timestamp";
            AFLogger.afErrorLog(str2.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str2.concat(" is null")));
        } else {
            appendPath.appendQueryParameter("af_sig", AFb1kSDK.getCurrencyIso4217Code(p1 + p0, p0));
        }
        String obj2 = appendPath.appendQueryParameter("sdk_version", AFb1rSDK.getCurrencyIso4217Code).build().toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public final String AFAdRevenueData(AFh1hSDK p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!(p0 instanceof AFh1iSDK)) {
            if (!(p0 instanceof AFi1zSDK)) {
                throw new UnsupportedOperationException();
            }
            return this.getMediationNetwork.getMediationNetwork(areAllFieldsValid) + this.AFAdRevenueData.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName();
        }
        return this.getMediationNetwork.getMediationNetwork("https://%ssdk-services.%s/validate-android-signature");
    }

    public final String getCurrencyIso4217Code(String str) {
        return str + this.AFAdRevenueData.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName();
    }

    public static String AFAdRevenueData(String str, boolean z) {
        return str + (!z ? "&buildnumber=6.15.1" : "");
    }

    public final String getMonetizationNetwork(String str) {
        String str2;
        String areAllFieldsValid2 = this.AFAdRevenueData.areAllFieldsValid();
        if (areAllFieldsValid2 != null) {
            str2 = "&channel=" + areAllFieldsValid2;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return str + str2;
    }

    public static String getMediationNetwork() {
        return "https://aps-webhandler.appsflyer.com/api/trigger";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1iSDK(AFd1rSDK aFd1rSDK) {
        this(aFd1rSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
    }
}
