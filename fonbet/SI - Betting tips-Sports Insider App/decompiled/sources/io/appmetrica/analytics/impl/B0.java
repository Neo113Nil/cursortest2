package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class B0 implements InterfaceC0579wc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f12017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f12018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f12019c;

    public B0(C0 c02, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f12017a = c02;
        this.f12018b = appMetricaConfig;
        this.f12019c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0579wc
    @NotNull
    public final C0203hc a() {
        C0 c02 = this.f12017a;
        C0260ji c0260ji = c02.f12091g;
        AppMetricaConfig appMetricaConfig = this.f12018b;
        PublicLogger publicLogger = this.f12019c;
        D7 d72 = c02.f12093i;
        return c0260ji.b(appMetricaConfig, publicLogger, new C0293l0(d72.j, d72.f12132h));
    }
}
