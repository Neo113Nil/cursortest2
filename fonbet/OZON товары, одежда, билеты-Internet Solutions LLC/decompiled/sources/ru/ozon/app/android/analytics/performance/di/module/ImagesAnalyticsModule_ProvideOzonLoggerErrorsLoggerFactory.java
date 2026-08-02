package ru.ozon.app.android.analytics.performance.di.module;

import Eg0.b;
import Jb.e;
import Jb.j;
import ru.ozon.app.android.analytics.performance.WidgetsNamesProvider;

/* loaded from: classes6.dex */
public final class ImagesAnalyticsModule_ProvideOzonLoggerErrorsLoggerFactory implements e<b> {
    public static b provideOzonLoggerErrorsLogger(WidgetsNamesProvider widgetsNamesProvider) {
        b provideOzonLoggerErrorsLogger = ImagesAnalyticsModule.INSTANCE.provideOzonLoggerErrorsLogger(widgetsNamesProvider);
        j.d(provideOzonLoggerErrorsLogger);
        return provideOzonLoggerErrorsLogger;
    }
}
