package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286ki implements Sa {
    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Ta
    @NonNull
    public final Sa a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    @NonNull
    public final Ia b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C0293l0 c0293l0) {
        return new C0604xc();
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Sa
    @NonNull
    public final Ra b(@NonNull ReporterConfig reporterConfig) {
        return new C0209hi();
    }

    @Override // io.appmetrica.analytics.impl.Sa
    @NonNull
    public final Ia a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C0293l0 c0293l0) {
        return new C0604xc();
    }

    @Override // io.appmetrica.analytics.impl.Sa
    @NonNull
    public final Ua a(@NonNull AppMetricaConfig appMetricaConfig) {
        return new C0209hi();
    }
}
