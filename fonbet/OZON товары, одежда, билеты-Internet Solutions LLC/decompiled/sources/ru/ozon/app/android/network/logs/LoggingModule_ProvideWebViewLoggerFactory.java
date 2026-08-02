package ru.ozon.app.android.network.logs;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import sj.d;

/* loaded from: classes12.dex */
public final class LoggingModule_ProvideWebViewLoggerFactory implements e<WebViewErrorLogger> {
    public static WebViewErrorLogger provideWebViewLogger(LoggingModule loggingModule, FeatureService featureService, FeatureChecker featureChecker, d dVar) {
        WebViewErrorLogger provideWebViewLogger = loggingModule.provideWebViewLogger(featureService, featureChecker, dVar);
        j.d(provideWebViewLogger);
        return provideWebViewLogger;
    }
}
