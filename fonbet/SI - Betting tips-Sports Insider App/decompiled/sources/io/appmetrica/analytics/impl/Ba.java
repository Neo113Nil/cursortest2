package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface Ba {
    C0117e4 a();

    void a(AppMetricaConfig appMetricaConfig, Ta ta2);

    Handler b();

    S1 c();

    C0279kb d();

    ICommonExecutor getDefaultExecutor();
}
