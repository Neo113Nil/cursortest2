package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class D7 implements Hc {

    /* renamed from: a, reason: collision with root package name */
    public Location f12125a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f12126b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f12127c;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f12129e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12132h;

    /* renamed from: i, reason: collision with root package name */
    public String f12133i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12134k;

    /* renamed from: l, reason: collision with root package name */
    public C0585wi f12135l;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f12128d = Boolean.FALSE;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f12130f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f12131g = new LinkedHashMap();

    @NonNull
    public List<String> j = new ArrayList();

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(boolean z5) {
        Boolean valueOf = Boolean.valueOf(z5);
        this.f12126b = valueOf;
        C0585wi c0585wi = this.f12135l;
        if (c0585wi != null) {
            c0585wi.a(valueOf, this.f12129e, this.f12127c, this.f12128d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void clearAppEnvironment() {
        this.f12132h = true;
        this.f12130f.clear();
    }

    public final C0293l0 j() {
        return new C0293l0(this.j, this.f12132h);
    }

    public final Location k() {
        return this.f12125a;
    }

    public final Boolean l() {
        return this.f12127c;
    }

    public final Boolean m() {
        return this.f12129e;
    }

    public final Boolean n() {
        return this.f12126b;
    }

    public final boolean o() {
        return this.f12132h;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f12130f.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void setDataSendingEnabled(boolean z5) {
        Boolean valueOf = Boolean.valueOf(z5);
        this.f12129e = valueOf;
        C0585wi c0585wi = this.f12135l;
        if (c0585wi != null) {
            c0585wi.a(this.f12126b, valueOf, this.f12127c, this.f12128d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void setUserProfileID(String str) {
        this.f12133i = str;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(boolean z5, boolean z7) {
        boolean z10 = this.f12127c == null;
        boolean booleanValue = this.f12128d.booleanValue();
        if (z7 || z10 || !booleanValue) {
            this.f12127c = Boolean.valueOf(z5);
            Boolean valueOf = Boolean.valueOf(z7);
            this.f12128d = valueOf;
            C0585wi c0585wi = this.f12135l;
            if (c0585wi != null) {
                c0585wi.a(this.f12126b, this.f12129e, this.f12127c, valueOf);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(Location location) {
        this.f12125a = location;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(String str, String str2) {
        this.f12131g.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f12134k) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        newConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        newConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        newConfigBuilder.withLocation(appMetricaConfig.location);
        if (lo.a(appMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (lo.a(appMetricaConfig.dispatchPeriodSeconds)) {
            newConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (lo.a(appMetricaConfig.appBuildNumber)) {
            newConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (lo.a(appMetricaConfig.maxReportsCount)) {
            newConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (lo.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (lo.a(appMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (lo.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (lo.a(appMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (lo.a(appMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (lo.a(appMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (lo.a(appMetricaConfig.advIdentifiersTracking)) {
            newConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (lo.a(appMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (lo.a(appMetricaConfig.dataSendingEnabled)) {
            newConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (lo.a(appMetricaConfig.anrMonitoring)) {
            newConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (lo.a(appMetricaConfig.anrMonitoringTimeout)) {
            newConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (lo.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (lo.a(appMetricaConfig.crashTransformer)) {
            newConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (lo.a(appMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (lo.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (lo.a(appMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (lo.a((Object) appMetricaConfig.customHosts)) {
            newConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f12130f;
        if (!lo.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!lo.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f12131g;
        if (!lo.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!lo.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!lo.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                newConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f12126b;
        if (appMetricaConfig.locationTracking == null && lo.a(bool)) {
            newConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f12125a;
        if (appMetricaConfig.location == null && lo.a(location)) {
            newConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f12129e;
        if (appMetricaConfig.dataSendingEnabled == null && lo.a(bool2)) {
            newConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!lo.a(appMetricaConfig.userProfileID) && lo.a(this.f12133i)) {
            newConfigBuilder.withUserProfileID(this.f12133i);
        }
        Boolean bool3 = this.f12127c;
        if (appMetricaConfig.advIdentifiersTracking == null && lo.a(bool3)) {
            newConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f12134k = true;
        this.f12125a = null;
        this.f12126b = null;
        this.f12127c = null;
        this.f12128d = Boolean.FALSE;
        this.f12129e = null;
        this.f12130f.clear();
        this.f12131g.clear();
        this.f12132h = false;
        this.f12133i = null;
        return newConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(@NonNull String str) {
        this.j.add(str);
    }

    public final void a(C0585wi c0585wi) {
        Boolean bool = this.f12126b;
        if (bool != null || this.f12129e != null || this.f12127c != null) {
            c0585wi.a(bool, this.f12129e, this.f12127c, this.f12128d);
        }
        this.f12135l = c0585wi;
    }
}
