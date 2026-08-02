package ru.ozon.app.android.sentry.sentryFlags;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.flags.SentryAppLifecycleEventsBreadcrumbsEnabledFlag;
import ru.ozon.app.android.csma.flags.SentrySystemEventsBreadcrumbsEnabledFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/sentry/sentryFlags/SentryFlagsRepositoryImpl;", "Lru/ozon/app/android/sentry/sentryFlags/SentryFlagsRepository;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "sentryFlagsStorage", "Lru/ozon/app/android/sentry/sentryFlags/SentryFlagsStorage;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/sentry/sentryFlags/SentryFlagsStorage;)V", "storeAllFlags", "", "sentry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SentryFlagsRepositoryImpl implements SentryFlagsRepository {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final SentryFlagsStorage sentryFlagsStorage;

    public SentryFlagsRepositoryImpl(@NotNull FeatureChecker featureChecker, @NotNull SentryFlagsStorage sentryFlagsStorage) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(sentryFlagsStorage, "sentryFlagsStorage");
        this.featureChecker = featureChecker;
        this.sentryFlagsStorage = sentryFlagsStorage;
    }

    @Override // ru.ozon.app.android.sentry.sentryFlags.SentryFlagsRepository
    public void storeAllFlags() {
        this.sentryFlagsStorage.setEnableSystemEventBreadcrumbs(this.featureChecker.isEnabled(SentrySystemEventsBreadcrumbsEnabledFlag.INSTANCE));
        this.sentryFlagsStorage.setEnableAppLifecycleBreadcrumbs(this.featureChecker.isEnabled(SentryAppLifecycleEventsBreadcrumbsEnabledFlag.INSTANCE));
    }
}
