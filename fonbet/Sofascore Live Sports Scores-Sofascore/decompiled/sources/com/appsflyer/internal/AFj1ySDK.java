package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fc6;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u000f*\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0013J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0013J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0013J#\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b \u0010\u001fJ\u001d\u0010#\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010%\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\nJ\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u0013J\u000f\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\u0013J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\u0013J\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\u0013J\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\u0013J\u000f\u0010.\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010\u0013J\u000f\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u0013J\u000f\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u0010\u0013J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0013J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0013J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\u0013J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0013J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106¨\u00068"}, d2 = {"Lcom/appsflyer/internal/util/EventUrlResolver;", "", "Lcom/appsflyer/internal/components/IdProvider;", "idProvider", "<init>", "(Lcom/appsflyer/internal/components/IdProvider;)V", "Lcom/appsflyer/internal/model/event/AFEvent;", "event", "", "getUrlForEvent", "(Lcom/appsflyer/internal/model/event/AFEvent;)Ljava/lang/String;", "devKey", "timestamp", "getUrlForDdlEvent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri$Builder;", "appendSigQueryParam", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "getUrlForViap", "()Ljava/lang/String;", "getUrlForArs", "getUrlForRegister", "getUrlForManualOneTimePurchaseValidation", "getUrlForManualSubscriptionPurchaseValidation", "getUrlForRdMonitor", "getUrlForPlayIntegrityReporting", "onelinkId", "shortLinkId", "getOnelinkUrl", "channelPostfix", "getGcdURL", "(Ljava/lang/String;)Ljava/lang/String;", "appendPackageName", "", "isAdRevenueEvent", "appendBuildNumber", "(Ljava/lang/String;Z)Ljava/lang/String;", "isRegisterEvent", "appendConfiguredChannel", "getLaunchUrl", "getReferrerTrackingUrl", "getAdRevenueUrl", "getFirstLaunchUrl", "getAppsTrackingUrl", "getEventsTrackingUrl", "getArsBilling5", "getViapBilling5", "getDdlUrl", "getManualValidateOneTimePurchaseUrl", "getManualValidateSubscriptionPurchaseUrl", "getRegisterUrl", "getPlayIntegrityUrl", "getOneLinkBaseUrl", "getGcdBaseUrl", "Lcom/appsflyer/internal/components/IdProvider;", "Companion", "sdk_main_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFj1ySDK {

    @NotNull
    public static String AFKeystoreWrapper;

    @NotNull
    public static String AFLogger;

    @NotNull
    private static final String AFLoggerLogLevel;

    @NotNull
    public static String d;

    @NotNull
    public static String e;

    @NotNull
    public static String force;

    @NotNull
    public static final AFa1ySDK registerClient = new AFa1ySDK(null);

    @NotNull
    public static String unregisterClient;

    @NotNull
    public static final String v;

    @NotNull
    public static String w;

    @NotNull
    private final AFc1hSDK i;

    static {
        String y = dmi.y(AFa1zSDK.d, "/androidevent?app_id=");
        AFLoggerLogLevel = y;
        AFLogger = "https://%sattr.%s/api/v".concat(y);
        AFKeystoreWrapper = "https://%sadrevenue.%s/api/v2/generic/v7.0.0/android?app_id=";
        d = dmi.q("https://%sconversions.%s/api/v", y);
        unregisterClient = dmi.q("https://%slaunches.%s/api/v", y);
        force = dmi.q("https://%sinapps.%s/api/v", y);
        e = dmi.q("https://%sregister.%s/api/v", y);
        w = "https://%smonitorsdk.%s/remote-debug/exception-manager";
        v = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    public AFj1ySDK(@NotNull AFc1hSDK aFc1hSDK) {
        aFc1hSDK.getClass();
        this.i = aFc1hSDK;
    }

    @NotNull
    public static String AFKeystoreWrapper(@NotNull String str, @Nullable String str2) {
        str.getClass();
        Locale locale = Locale.US;
        return fc6.n(bf3.k("https://", AppsFlyerLib.getInstance().getHostPrefix(), "onelink.", AFa1zSDK.d().getHostName(), "/shortlink-sdk/v2"), "/", str, str2 != null ? "?id=".concat(str2) : "");
    }

    public static String afDebugLog() {
        Locale locale = Locale.US;
        return bf3.k("https://", AppsFlyerLib.getInstance().getHostPrefix(), "pia.", AFa1zSDK.d().getHostName(), "/api/v1.0/pia-android-event?app_id=");
    }

    public static String e() {
        Locale locale = Locale.US;
        return bf3.k("https://", AppsFlyerLib.getInstance().getHostPrefix(), "viap.", AFa1zSDK.d().getHostName(), "/api/v1/android/validate_purchase_v2?app_id=");
    }

    public static String force() {
        Locale locale = Locale.US;
        return bf3.k("https://", AppsFlyerLib.getInstance().getHostPrefix(), "ars.", AFa1zSDK.d().getHostName(), "/api/v2/android/validate_subscription_v2?app_id=");
    }

    public static String i() {
        Locale locale = Locale.US;
        return bf3.k("https://", AppsFlyerLib.getInstance().getHostPrefix(), "validate-and-log.", AFa1zSDK.d().getHostName(), "/api/v4.0/android/one_time_purchase/validateAndLog?app_id=");
    }

    public static String registerClient() {
        return String.format(Locale.US, AFLogger, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.d().getHostName());
    }

    public static String unregisterClient() {
        return String.format(Locale.US, unregisterClient, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.d().getHostName());
    }

    public static String v() {
        Locale locale = Locale.US;
        return bf3.k("https://", AppsFlyerLib.getInstance().getHostPrefix(), "validate-and-log.", AFa1zSDK.d().getHostName(), "/api/v4.0/android/subscription/validateAndLog?app_id=");
    }

    public static String w() {
        return String.format(Locale.US, e, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.d().getHostName());
    }

    @NotNull
    public final String AFLogger(@Nullable String str, @Nullable String str2) {
        String packageName = this.i.registerClient.d.getPackageName();
        packageName.getClass();
        String AFLogger2 = this.i.AFLogger("CHANNEL");
        if (AFLogger2 != null && AFLogger2.equals("")) {
            AFLogger2 = null;
        }
        if (AFLogger2 != null && !StringsKt.R(AFLogger2)) {
            AFLogger2 = dmi.q("-", StringsKt.l0(AFLogger2).toString());
        }
        String obj = StringsKt.l0(AFLogger2 != null ? AFLogger2 : "").toString();
        Locale locale = Locale.US;
        Uri.Builder buildUpon = Uri.parse("https://" + AppsFlyerLib.getInstance().getHostPrefix() + "dlsdk." + AFa1zSDK.d().getHostName() + "/v1.0/android/").buildUpon();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(obj);
        Uri.Builder appendPath = buildUpon.appendPath(sb.toString());
        appendPath.getClass();
        if (str == null || str2 == null) {
            String str3 = str == null ? "devKey" : "timestamp";
            AFLogger.INSTANCE.e(LogTag.GENERAL, str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")), true, false, false, true);
        } else {
            appendPath.appendQueryParameter("af_sig", AFj1xSDK.d(str2.concat(str), str));
        }
        String obj2 = appendPath.appendQueryParameter("sdk_version", AFa1zSDK.d).build().toString();
        obj2.getClass();
        return obj2;
    }

    @NotNull
    public final String d(@NotNull String str) {
        str.getClass();
        Locale locale = Locale.US;
        return bf3.k(bf3.k("https://", AppsFlyerLib.getInstance().getHostPrefix(), "gcdsdk.", AFa1zSDK.d().getHostName(), "/install_data/v5.0/"), this.i.registerClient.d.getPackageName(), str, "?device_id=", AFb1mSDK.unregisterClient(this.i.AFKeystoreWrapper));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0016\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, d2 = {"Lcom/appsflyer/internal/AFj1ySDK$AFa1ySDK;", "", "<init>", "()V", "", "AFLoggerLogLevel", "Ljava/lang/String;", "registerClient", "AFLogger", "AFKeystoreWrapper", "d", "unregisterClient", "force", com.mbridge.msdk.setting.i.a, "e", "w", "v"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static String registerClient(String str, boolean z) {
        return dmi.y(str, !z ? "&buildnumber=7.0.0" : "");
    }

    public final String unregisterClient(String str) {
        return dmi.y(str, this.i.registerClient.d.getPackageName());
    }

    public static String AFKeystoreWrapper() {
        return String.format(Locale.US, d, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.d().getHostName());
    }

    public final String d(String str, boolean z) {
        if (z) {
            return str;
        }
        String AFLogger2 = this.i.AFLogger("CHANNEL");
        if (AFLogger2 != null && AFLogger2.equals("")) {
            AFLogger2 = null;
        }
        String concat = AFLogger2 != null ? "&channel=".concat(AFLogger2) : null;
        return dmi.y(str, concat != null ? concat : "");
    }

    public static String d() {
        return String.format(Locale.US, force, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.d().getHostName());
    }

    public static String AFLogger() {
        return String.format(Locale.US, AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.d().getHostName());
    }
}
