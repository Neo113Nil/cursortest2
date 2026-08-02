package ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.featureChecker.FailedExternalLinkRetryFeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class FailedExternalLinkRetryModule_Companion_ProvideFailedExternalLinkRetryFeatureCheckerFactory implements e<FailedExternalLinkRetryFeatureChecker> {
    public static FailedExternalLinkRetryFeatureChecker provideFailedExternalLinkRetryFeatureChecker(FeatureService featureService, AppType appType) {
        FailedExternalLinkRetryFeatureChecker provideFailedExternalLinkRetryFeatureChecker = FailedExternalLinkRetryModule.INSTANCE.provideFailedExternalLinkRetryFeatureChecker(featureService, appType);
        j.d(provideFailedExternalLinkRetryFeatureChecker);
        return provideFailedExternalLinkRetryFeatureChecker;
    }
}
