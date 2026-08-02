package ru.ozon.app.android.sentry.di.module;

import Jb.e;
import Jb.j;
import android.content.SharedPreferences;
import ru.ozon.app.android.sentry.sentryFlags.SentryFlagsStorage;

/* loaded from: classes7.dex */
public final class SentryApiModule_ProvideSentryFlagsStorageFactory implements e<SentryFlagsStorage> {
    public static SentryFlagsStorage provideSentryFlagsStorage(SentryApiModule sentryApiModule, SharedPreferences sharedPreferences) {
        SentryFlagsStorage provideSentryFlagsStorage = sentryApiModule.provideSentryFlagsStorage(sharedPreferences);
        j.d(provideSentryFlagsStorage);
        return provideSentryFlagsStorage;
    }
}
