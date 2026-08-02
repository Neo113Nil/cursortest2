package ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.featureChecker;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.tiles.flags.ExternalLinkRetryLifeTimeHoursFlag;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/featureChecker/FailedExternalLinkRetryFeatureChecker;", "", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "appType", "Lru/ozon/app/android/utils/AppType;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/utils/AppType;)V", "isEnabled", "", "featureFlagEnabled", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FailedExternalLinkRetryFeatureChecker {

    @NotNull
    private final AppType appType;

    @NotNull
    private final FeatureService featureService;

    public FailedExternalLinkRetryFeatureChecker(@NotNull FeatureService featureService, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.featureService = featureService;
        this.appType = appType;
    }

    private final boolean featureFlagEnabled() {
        return this.featureService.getIntKey(ExternalLinkRetryLifeTimeHoursFlag.INSTANCE) > 0;
    }

    public final boolean isEnabled() {
        if (!featureFlagEnabled()) {
            return false;
        }
        AppType appType = this.appType;
        return appType == AppType.SELECT || appType == AppType.f94580BX;
    }
}
