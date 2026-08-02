package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324m6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0585wi f14231a;

    /* renamed from: b, reason: collision with root package name */
    public final Fh f14232b;

    public C0324m6(Bf bf2, D8 d82, C0585wi c0585wi, AppMetricaConfig appMetricaConfig) {
        this.f14231a = c0585wi;
        this.f14232b = new Fh(bf2, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), d82, appMetricaConfig.userProfileID);
    }

    public final Fh a() {
        return this.f14232b;
    }
}
