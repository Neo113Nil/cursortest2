package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC0518u1;
import io.appmetrica.analytics.impl.C0493t1;
import io.appmetrica.analytics.impl.K0;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AppMetrica {
    public static void activate(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        AbstractC0518u1.f14693a.a(context, appMetricaConfig);
    }

    public static void activateReporter(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        AbstractC0518u1.f14693a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC0518u1.f14693a.a();
    }

    public static void enableActivityAutoTracking(@NonNull Application application) {
        AbstractC0518u1.f14693a.a(application);
    }

    public static String getDeviceId(@NonNull Context context) {
        return AbstractC0518u1.f14693a.b();
    }

    public static int getLibraryApiLevel() {
        return BuildConfig.API_LEVEL;
    }

    @NonNull
    public static String getLibraryVersion() {
        return "8.0.0";
    }

    @NonNull
    public static AppMetricaPlugins getPluginExtension() {
        return K0.f12454a;
    }

    @NonNull
    public static IReporter getReporter(@NonNull Context context, @NonNull String str) {
        return AbstractC0518u1.f14693a.a(context, str);
    }

    public static String getUuid(@NonNull Context context) {
        return AbstractC0518u1.f14693a.a(context).f15009id;
    }

    public static void initWebViewReporting(@NonNull WebView webView) {
        AbstractC0518u1.f14693a.a(webView);
    }

    public static void pauseSession(Activity activity) {
        AbstractC0518u1.f14693a.a(activity);
    }

    public static void putAppEnvironmentValue(@NonNull String str, String str2) {
        AbstractC0518u1.f14693a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(@NonNull String str, String str2) {
        AbstractC0518u1.f14693a.b(str, str2);
    }

    public static void registerAnrListener(@NonNull AnrListener anrListener) {
        AbstractC0518u1.f14693a.a(anrListener);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        AbstractC0518u1.f14693a.a(adRevenue);
    }

    public static void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        AbstractC0518u1.f14693a.a(map);
    }

    public static void reportAppOpen(@NonNull Activity activity) {
        AbstractC0518u1.f14693a.b(activity);
    }

    public static void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        AbstractC0518u1.f14693a.a(eCommerceEvent);
    }

    public static void reportError(@NonNull String str, String str2) {
        AbstractC0518u1.f14693a.a(str, str2, (Throwable) null);
    }

    public static void reportEvent(@NonNull String str) {
        AbstractC0518u1.f14693a.b(str);
    }

    public static void reportExternalAdRevenue(@NonNull Object... objArr) {
        AbstractC0518u1.f14693a.b(objArr);
    }

    public static void reportExternalAttribution(@NonNull ExternalAttribution externalAttribution) {
        AbstractC0518u1.f14693a.a(externalAttribution);
    }

    public static void reportRevenue(@NonNull Revenue revenue) {
        AbstractC0518u1.f14693a.a(revenue);
    }

    public static void reportUnhandledException(@NonNull Throwable th2) {
        AbstractC0518u1.f14693a.a(th2);
    }

    public static void reportUserProfile(@NonNull UserProfile userProfile) {
        AbstractC0518u1.f14693a.a(userProfile);
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC0518u1.f14693a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC0518u1.f14693a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        C0493t1 c0493t1 = AbstractC0518u1.f14693a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c0493t1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(Activity activity) {
        AbstractC0518u1.f14693a.c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC0518u1.f14693a.f();
    }

    public static void setAdvIdentifiersTracking(boolean z5) {
        AbstractC0518u1.f14693a.a(z5);
    }

    public static void setDataSendingEnabled(boolean z5) {
        AbstractC0518u1.f14693a.b(z5);
    }

    public static void setLocation(Location location) {
        AbstractC0518u1.f14693a.a(location);
    }

    public static void setLocationTracking(boolean z5) {
        AbstractC0518u1.f14693a.c(z5);
    }

    public static void setUserProfileID(String str) {
        AbstractC0518u1.f14693a.d(str);
    }

    public static void reportAppOpen(@NonNull Intent intent) {
        AbstractC0518u1.f14693a.a(intent);
    }

    public static void reportError(@NonNull String str, String str2, Throwable th2) {
        AbstractC0518u1.f14693a.a(str, str2, th2);
    }

    public static void reportEvent(@NonNull String str, String str2) {
        AbstractC0518u1.f14693a.c(str, str2);
    }

    public static void reportAppOpen(@NonNull String str) {
        AbstractC0518u1.f14693a.a(str);
    }

    public static void reportError(@NonNull String str, Throwable th2) {
        AbstractC0518u1.f14693a.a(str, th2);
    }

    public static void reportEvent(@NonNull String str, Map<String, Object> map) {
        AbstractC0518u1.f14693a.a(str, map);
    }
}
