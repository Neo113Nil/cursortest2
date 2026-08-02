package ru.ozon.app.android.pikazon.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.logging.error.PikazonErrorsLogger;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pikazon/internal/DisabledPerformanceAvailabilityChecker;", "Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "<init>", "()V", "isPerformanceAnalyticsEnabled", "", "isImagePlaceholderAnalyticsEnabled", "isLoadCancellingAnalyticsEnabled", "isImageErrorsAnalyticsEnabled", "analyticsPlatform", "Lru/ozon/app/android/pikazon/logging/error/PikazonErrorsLogger$AnalyticsPlatform;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DisabledPerformanceAvailabilityChecker implements PikazonPerformanceAvailabilityChecker {
    @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
    public boolean isImageErrorsAnalyticsEnabled(@NotNull PikazonErrorsLogger.AnalyticsPlatform analyticsPlatform) {
        Intrinsics.checkNotNullParameter(analyticsPlatform, "analyticsPlatform");
        return false;
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
    public boolean isImagePlaceholderAnalyticsEnabled() {
        return false;
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
    public boolean isLoadCancellingAnalyticsEnabled() {
        return false;
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
    public boolean isPerformanceAnalyticsEnabled() {
        return false;
    }
}
