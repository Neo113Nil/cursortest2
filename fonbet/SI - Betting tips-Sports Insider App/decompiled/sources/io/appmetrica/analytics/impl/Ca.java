package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface Ca extends Hc, A6, Ta {
    @NonNull
    /* synthetic */ Sa a();

    /* synthetic */ void a(int i5, @NonNull Bundle bundle);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(Location location);

    void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig);

    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    void a(@NonNull ReporterConfig reporterConfig);

    void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(boolean z5);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(boolean z5, boolean z7);

    void b(@NonNull AppMetricaConfig appMetricaConfig);

    @NonNull
    Ra c(@NonNull ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void clearAppEnvironment();

    @NonNull
    X9 d();

    String e();

    Map<String, String> g();

    @NonNull
    AdvIdentifiersResult h();

    C0254jc i();

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void setDataSendingEnabled(boolean z5);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void setUserProfileID(String str);
}
