package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\bJ\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\bJ\u0006\u0010 \u001a\u00020\bJ\u0006\u0010!\u001a\u00020\bJ\u0006\u0010\"\u001a\u00020\bJ\u0010\u0010#\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\b\u0010$\u001a\u00020\bH\u0002J\b\u0010%\u001a\u00020\bH\u0002J\b\u0010&\u001a\u00020\bH\u0002J\b\u0010'\u001a\u00020\bH\u0002J\u0016\u0010(\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010)\u001a\u00020*H\u0002J\u0016\u0010+\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010,\u001a\u00020*H\u0002J\f\u0010-\u001a\u00020\b*\u00020\bH\u0002J \u0010.\u001a\u00020/*\u00020/2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/appsflyer/internal/util/EventUrlResolver;", "", "idProvider", "Lcom/appsflyer/internal/components/IdProvider;", "serverConfigUrlFormatter", "Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;", "(Lcom/appsflyer/internal/components/IdProvider;Lcom/appsflyer/internal/util/ServerConfigUrlFormatter;)V", "getAdRevenueUrl", "", "getAppsTrackingUrl", "getArsBilling4", "getArsBilling5", "getDdlUrl", "getEventsTrackingUrl", "getFirstLaunchUrl", "getLaunchUrl", "event", "Lcom/appsflyer/internal/model/event/AFEvent;", "getManualValidatePurchaseUrl", "getPlayIntegrityUrl", "getReferrerTrackingUrl", "getRegisterUrl", "getUrlForArs", "billingVersion", "getUrlForDdlEvent", "devKey", "timestamp", "getUrlForEvent", "getUrlForManualPurchaseValidation", "getUrlForPlayIntegrityReporting", "getUrlForPrivacySandbox", "getUrlForRdMonitor", "getUrlForRegister", "getUrlForValidatePurchase", "getUrlForValidatePurchaseWithWebHandler", "getUrlForViap", "getValidatePurchaseUrl", "getValidatePurchaseWithWebHandlerUrl", "getViapBilling4", "getViapBilling5", "appendBuildNumber", "isAdRevenueEvent", "", "appendConfiguredChannel", "isRegisterEvent", "appendPackageName", "appendSigQueryParam", "Landroid/net/Uri$Builder;", k.M, "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AFj1kSDK {
    public static final String AFAdRevenueData;
    public static final String areAllFieldsValid;
    public static final String component1;
    public static final String component2;
    public static final String component3;
    public static final String component4;
    public static final AFa1tSDK getCurrencyIso4217Code = new AFa1tSDK(null);
    public static final String getMediationNetwork;
    public static final String getMonetizationNetwork;
    private static final String toString;
    private final AFc1kSDK copy;
    public final AFj1bSDK getRevenue;

    private AFj1kSDK(AFc1kSDK aFc1kSDK, AFj1bSDK aFj1bSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFj1bSDK, "");
        this.copy = aFc1kSDK;
        this.getRevenue = aFj1bSDK;
    }

    public /* synthetic */ AFj1kSDK(AFc1kSDK aFc1kSDK, AFj1dSDK aFj1dSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1kSDK, (i & 2) != 0 ? new AFj1dSDK() : aFj1dSDK);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, d2 = {"Lcom/appsflyer/internal/AFj1kSDK$AFa1tSDK;", "", "<init>", "()V", "", "toString", "Ljava/lang/String;", "getMediationNetwork", "getMonetizationNetwork", "AFAdRevenueData", "component2", "getRevenue", "component3", "getCurrencyIso4217Code", "component1", "component4", "areAllFieldsValid"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String str = AFa1zSDK.AFAdRevenueData + "/androidevent?app_id=";
        toString = str;
        AFAdRevenueData = "https://%sattr.%s/api/v" + str;
        getMediationNetwork = "https://%sadrevenue.%s/api/v2/generic/v6.16.2/android?app_id=";
        getMonetizationNetwork = "https://%sconversions.%s/api/v" + str;
        component3 = "https://%slaunches.%s/api/v" + str;
        component2 = "https://%sinapps.%s/api/v" + str;
        component4 = "https://%sregister.%s/api/v" + str;
        areAllFieldsValid = "https://%svalidate.%s/api/v" + str;
        component1 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    public final String getCurrencyIso4217Code(String str, String str2) {
        String packageName = this.copy.AFAdRevenueData.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String component12 = this.copy.component1();
        String str3 = component12;
        if (str3 != null && !StringsKt.isBlank(str3)) {
            component12 = "-" + StringsKt.trim((CharSequence) str3).toString();
        }
        if (component12 == null) {
            component12 = "";
        }
        Uri.Builder appendPath = Uri.parse(this.getRevenue.getMediationNetwork("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + StringsKt.trim((CharSequence) component12).toString());
        Intrinsics.checkNotNullExpressionValue(appendPath, "");
        if (str == null || str2 == null) {
            String str4 = str == null ? "devKey" : "timestamp";
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, str4.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str4.concat(" is null")), true, false, false, true);
        } else {
            appendPath.appendQueryParameter("af_sig", AFj1hSDK.AFAdRevenueData(str2 + str, str));
        }
        String obj = appendPath.appendQueryParameter("sdk_version", AFa1zSDK.AFAdRevenueData).build().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static String getMediationNetwork() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }

    public final String getMonetizationNetwork(String str) {
        return str + this.copy.AFAdRevenueData.getMonetizationNetwork.getPackageName();
    }

    public static String getMonetizationNetwork(String str, boolean z) {
        return str + (!z ? "&buildnumber=6.16.2" : "");
    }

    public final String getRevenue(String str, boolean z) {
        if (z) {
            return str;
        }
        String component12 = this.copy.component1();
        String str2 = component12 != null ? "&channel=" + component12 : null;
        if (str2 == null) {
            str2 = "";
        }
        return str + str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1kSDK(AFc1kSDK aFc1kSDK) {
        this(aFc1kSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
    }
}
