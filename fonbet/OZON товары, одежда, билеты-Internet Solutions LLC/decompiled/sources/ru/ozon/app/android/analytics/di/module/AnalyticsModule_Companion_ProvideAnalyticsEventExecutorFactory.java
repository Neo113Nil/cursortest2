package ru.ozon.app.android.analytics.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor;

/* loaded from: classes6.dex */
public final class AnalyticsModule_Companion_ProvideAnalyticsEventExecutorFactory implements e<AnalyticsEventExecutor> {
    public static AnalyticsEventExecutor provideAnalyticsEventExecutor() {
        AnalyticsEventExecutor provideAnalyticsEventExecutor = AnalyticsModule.INSTANCE.provideAnalyticsEventExecutor();
        j.d(provideAnalyticsEventExecutor);
        return provideAnalyticsEventExecutor;
    }
}
