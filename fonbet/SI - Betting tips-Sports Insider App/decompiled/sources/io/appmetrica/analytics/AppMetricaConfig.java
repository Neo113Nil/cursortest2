package io.appmetrica.analytics;

import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C0191h0;
import io.appmetrica.analytics.impl.C0348n5;
import io.appmetrica.analytics.impl.C7;
import io.appmetrica.analytics.impl.En;
import io.appmetrica.analytics.impl.G3;
import io.appmetrica.analytics.impl.lo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AppMetricaConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;
    public final Boolean advIdentifiersTracking;
    public final Boolean anrMonitoring;
    public final Integer anrMonitoringTimeout;

    @NonNull
    public final String apiKey;
    public final Integer appBuildNumber;
    public final Map<String, String> appEnvironment;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final ICrashTransformer crashTransformer;
    public final List<String> customHosts;
    public final Boolean dataSendingEnabled;
    public final String deviceType;
    public final Integer dispatchPeriodSeconds;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final String userProfileID;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Builder {
        private static final En D = new En(new C0191h0());
        private Integer A;
        private List B;
        private final HashMap C;

        /* renamed from: a, reason: collision with root package name */
        private final C0348n5 f11307a;

        /* renamed from: b, reason: collision with root package name */
        private final String f11308b;

        /* renamed from: c, reason: collision with root package name */
        private String f11309c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f11310d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f11311e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f11312f;

        /* renamed from: g, reason: collision with root package name */
        private Location f11313g;

        /* renamed from: h, reason: collision with root package name */
        private Boolean f11314h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f11315i;
        private Boolean j;

        /* renamed from: k, reason: collision with root package name */
        private PreloadInfo f11316k;

        /* renamed from: l, reason: collision with root package name */
        private Boolean f11317l;

        /* renamed from: m, reason: collision with root package name */
        private Boolean f11318m;

        /* renamed from: n, reason: collision with root package name */
        private Integer f11319n;

        /* renamed from: o, reason: collision with root package name */
        private final LinkedHashMap f11320o;

        /* renamed from: p, reason: collision with root package name */
        private String f11321p;
        private Boolean q;

        /* renamed from: r, reason: collision with root package name */
        private Boolean f11322r;

        /* renamed from: s, reason: collision with root package name */
        private Boolean f11323s;

        /* renamed from: t, reason: collision with root package name */
        private String f11324t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f11325u;

        /* renamed from: v, reason: collision with root package name */
        private Integer f11326v;

        /* renamed from: w, reason: collision with root package name */
        private Integer f11327w;

        /* renamed from: x, reason: collision with root package name */
        private final LinkedHashMap f11328x;

        /* renamed from: y, reason: collision with root package name */
        private ICrashTransformer f11329y;

        /* renamed from: z, reason: collision with root package name */
        private Boolean f11330z;

        public /* synthetic */ Builder(String str, int i5) {
            this(str);
        }

        @NonNull
        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        @NonNull
        public Builder handleFirstActivationAsUpdate(boolean z5) {
            this.f11317l = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, Object obj) {
            this.C.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAdvIdentifiersTracking(boolean z5) {
            this.f11315i = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoring(boolean z5) {
            this.f11330z = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoringTimeout(int i5) {
            this.A = Integer.valueOf(i5);
            return this;
        }

        @NonNull
        public Builder withAppBuildNumber(int i5) {
            if (i5 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f11325u = Integer.valueOf(i5);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(@NonNull String str, String str2) {
            this.f11328x.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withAppOpenTrackingEnabled(boolean z5) {
            this.f11323s = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withAppVersion(String str) {
            this.f11309c = str;
            return this;
        }

        @NonNull
        public Builder withCrashReporting(boolean z5) {
            this.f11311e = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withCrashTransformer(ICrashTransformer iCrashTransformer) {
            this.f11329y = iCrashTransformer;
            return this;
        }

        @NonNull
        public Builder withCustomHosts(@NonNull List<String> list) {
            this.B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z5) {
            this.f11318m = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withDeviceType(String str) {
            this.f11324t = str;
            if (!PredefinedDeviceTypes.ALL_VALUES.contains(str)) {
                PublicLogger.getAnonymousInstance().info("PredefinedDeviceTypes does not contain value for `deviceType = %s`. It may cause events to not appear in AppMetrica reports.", str);
            }
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i5) {
            this.f11326v = Integer.valueOf(i5);
            return this;
        }

        @NonNull
        public Builder withErrorEnvironmentValue(@NonNull String str, String str2) {
            this.f11320o.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withLocation(Location location) {
            this.f11313g = location;
            return this;
        }

        @NonNull
        public Builder withLocationTracking(boolean z5) {
            this.f11314h = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.j = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i5) {
            this.f11327w = Integer.valueOf(i5);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i5) {
            this.f11319n = Integer.valueOf(this.f11307a.a(i5));
            return this;
        }

        @NonNull
        public Builder withNativeCrashReporting(boolean z5) {
            this.f11312f = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f11316k = preloadInfo;
            return this;
        }

        @NonNull
        public Builder withRevenueAutoTrackingEnabled(boolean z5) {
            this.q = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i5) {
            this.f11310d = Integer.valueOf(i5);
            return this;
        }

        @NonNull
        public Builder withSessionsAutoTrackingEnabled(boolean z5) {
            this.f11322r = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(String str) {
            this.f11321p = str;
            return this;
        }

        private Builder(String str) {
            this.f11320o = new LinkedHashMap();
            this.f11328x = new LinkedHashMap();
            this.C = new HashMap();
            D.a(str);
            this.f11307a = new C0348n5(str);
            this.f11308b = str;
        }
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int i5) {
        this(builder);
    }

    public static AppMetricaConfig fromJson(String str) {
        Builder a7 = new G3().a(str);
        if (a7 == null) {
            return null;
        }
        return a7.build();
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3 A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toJson() {
        String jSONObject;
        List<String> list;
        new C7();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apikey", this.apiKey);
            jSONObject2.put("app_version", this.appVersion);
            jSONObject2.put("session_timeout", this.sessionTimeout);
            jSONObject2.put("location", G3.a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONArray jSONArray = null;
            if (preloadInfo != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject3.put("params", additionalParams == null ? null : new JSONObject(additionalParams));
                    jSONObject = jSONObject3.toString();
                } catch (Throwable unused) {
                }
                jSONObject2.put("preload_info", jSONObject);
                jSONObject2.put("logs", this.logs);
                jSONObject2.put("crash_enabled", this.crashReporting);
                jSONObject2.put("crash_native_enabled", this.nativeCrashReporting);
                jSONObject2.put("location_enabled", this.locationTracking);
                jSONObject2.put("adv_identifiers_tracking", this.advIdentifiersTracking);
                jSONObject2.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
                Map<String, String> map = this.errorEnvironment;
                jSONObject2.put("error_environment", map != null ? null : new JSONObject(map));
                jSONObject2.put("first_activation_as_update", this.firstActivationAsUpdate);
                jSONObject2.put("data_sending_enabled", this.dataSendingEnabled);
                jSONObject2.put("user_profile_id", this.userProfileID);
                jSONObject2.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
                jSONObject2.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
                jSONObject2.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
                jSONObject2.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
                jSONObject2.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
                jSONObject2.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
                jSONObject2.put("max_reports_count", this.maxReportsCount);
                Map<String, String> map2 = this.appEnvironment;
                jSONObject2.put("app_environment", map2 != null ? null : new JSONObject(map2));
                jSONObject2.put("anr_monitoring", this.anrMonitoring);
                jSONObject2.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
                list = this.customHosts;
                if (list != null) {
                    if (!lo.a((Collection) list)) {
                        jSONArray = new JSONArray((Collection) list);
                    }
                    jSONObject2.put("customHosts", jSONArray);
                }
                jSONObject2.put("additional_config", new JSONObject());
                return jSONObject2.toString();
            }
            jSONObject = null;
            jSONObject2.put("preload_info", jSONObject);
            jSONObject2.put("logs", this.logs);
            jSONObject2.put("crash_enabled", this.crashReporting);
            jSONObject2.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject2.put("location_enabled", this.locationTracking);
            jSONObject2.put("adv_identifiers_tracking", this.advIdentifiersTracking);
            jSONObject2.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            Map<String, String> map3 = this.errorEnvironment;
            jSONObject2.put("error_environment", map3 != null ? null : new JSONObject(map3));
            jSONObject2.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject2.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject2.put("user_profile_id", this.userProfileID);
            jSONObject2.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject2.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject2.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject2.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject2.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject2.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject2.put("max_reports_count", this.maxReportsCount);
            Map<String, String> map22 = this.appEnvironment;
            jSONObject2.put("app_environment", map22 != null ? null : new JSONObject(map22));
            jSONObject2.put("anr_monitoring", this.anrMonitoring);
            jSONObject2.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            list = this.customHosts;
            if (list != null) {
            }
            jSONObject2.put("additional_config", new JSONObject());
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f11308b;
        this.appVersion = builder.f11309c;
        this.sessionTimeout = builder.f11310d;
        this.crashReporting = builder.f11311e;
        this.nativeCrashReporting = builder.f11312f;
        this.location = builder.f11313g;
        this.locationTracking = builder.f11314h;
        this.advIdentifiersTracking = builder.f11315i;
        this.logs = builder.j;
        this.preloadInfo = builder.f11316k;
        this.firstActivationAsUpdate = builder.f11317l;
        this.dataSendingEnabled = builder.f11318m;
        this.maxReportsInDatabaseCount = builder.f11319n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f11320o);
        this.userProfileID = builder.f11321p;
        this.revenueAutoTrackingEnabled = builder.q;
        this.sessionsAutoTrackingEnabled = builder.f11322r;
        this.appOpenTrackingEnabled = builder.f11323s;
        this.deviceType = builder.f11324t;
        this.appBuildNumber = builder.f11325u;
        this.dispatchPeriodSeconds = builder.f11326v;
        this.maxReportsCount = builder.f11327w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f11328x);
        this.crashTransformer = builder.f11329y;
        this.anrMonitoring = builder.f11330z;
        this.anrMonitoringTimeout = builder.A;
        this.customHosts = builder.B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.C);
    }

    public AppMetricaConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
