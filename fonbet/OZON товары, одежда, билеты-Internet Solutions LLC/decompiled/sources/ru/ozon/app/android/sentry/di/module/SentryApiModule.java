package ru.ozon.app.android.sentry.di.module;

import Ld0.c;
import android.content.SharedPreferences;
import hg0.InterfaceC6951a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.flags.OzonSentryHelperEnabledFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.sentry.sentryFlags.SentryFlagsRepository;
import ru.ozon.app.android.sentry.sentryFlags.SentryFlagsRepositoryImpl;
import ru.ozon.app.android.sentry.sentryFlags.SentryFlagsStorage;
import ru.ozon.app.android.sentry.sentryFlags.SentryFlagsStorageImpl;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/sentry/di/module/SentryApiModule;", "", "<init>", "()V", "LLd0/c;", "ozonLimbDiStore", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lhg0/a;", "provideSentryHelperBaseApi", "(LLd0/c;Lru/ozon/app/android/network/abtool/FeatureChecker;)Lhg0/a;", "Landroid/content/SharedPreferences;", "preferences", "Lru/ozon/app/android/sentry/sentryFlags/SentryFlagsStorage;", "provideSentryFlagsStorage", "(Landroid/content/SharedPreferences;)Lru/ozon/app/android/sentry/sentryFlags/SentryFlagsStorage;", "sentryFlagsStorage", "Lru/ozon/app/android/sentry/sentryFlags/SentryFlagsRepository;", "provideSentryFlagsRepository", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/sentry/sentryFlags/SentryFlagsStorage;)Lru/ozon/app/android/sentry/sentryFlags/SentryFlagsRepository;", "sentry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SentryApiModule {
    @NotNull
    public final SentryFlagsRepository provideSentryFlagsRepository(@NotNull FeatureChecker featureChecker, @NotNull SentryFlagsStorage sentryFlagsStorage) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(sentryFlagsStorage, "sentryFlagsStorage");
        return new SentryFlagsRepositoryImpl(featureChecker, sentryFlagsStorage);
    }

    @NotNull
    public final SentryFlagsStorage provideSentryFlagsStorage(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new SentryFlagsStorageImpl(preferences);
    }

    @NotNull
    public final InterfaceC6951a provideSentryHelperBaseApi(@NotNull c ozonLimbDiStore, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        return featureChecker.isEnabled(OzonSentryHelperEnabledFlag.INSTANCE) ? (InterfaceC6951a) ozonLimbDiStore.e(InterfaceC6951a.class) : new InterfaceC6951a() { // from class: ru.ozon.app.android.sentry.di.module.SentryApiModule$provideSentryHelperBaseApi$1
            @Override // Ld0.e
            public void onInstantPluginsCreated() {
            }

            @Override // hg0.InterfaceC6951a
            public void setupContextInfo() {
            }
        };
    }
}
