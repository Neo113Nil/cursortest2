package ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.featureChecker.FailedExternalLinkRetryFeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/di/FailedExternalLinkRetryModule;", "", "Companion", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FailedExternalLinkRetryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/di/FailedExternalLinkRetryModule$Companion;", "", "<init>", "()V", "provideFailedExternalLinkRetryFeatureChecker", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/featureChecker/FailedExternalLinkRetryFeatureChecker;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "appType", "Lru/ozon/app/android/utils/AppType;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final FailedExternalLinkRetryFeatureChecker provideFailedExternalLinkRetryFeatureChecker(@NotNull FeatureService featureService, @NotNull AppType appType) {
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new FailedExternalLinkRetryFeatureChecker(featureService, appType);
        }
    }
}
