package ru.ozon.app.android.sentry.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.sentry.sentryFlags.SentryFlagsRepository;
import ru.ozon.app.android.sentry.sentryFlags.SentryFlagsStorage;

/* loaded from: classes7.dex */
public final class SentryApiModule_ProvideSentryFlagsRepositoryFactory implements e<SentryFlagsRepository> {
    public static SentryFlagsRepository provideSentryFlagsRepository(SentryApiModule sentryApiModule, FeatureChecker featureChecker, SentryFlagsStorage sentryFlagsStorage) {
        SentryFlagsRepository provideSentryFlagsRepository = sentryApiModule.provideSentryFlagsRepository(featureChecker, sentryFlagsStorage);
        j.d(provideSentryFlagsRepository);
        return provideSentryFlagsRepository;
    }
}
