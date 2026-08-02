package ru.ozon.app.android.analytics.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import ru.ozon.app.android.analytics.startup.OpenGlVersionProvider;

/* loaded from: classes6.dex */
public final class AnalyticsModule_Companion_ProvideOpenGlVersionProviderFactory implements e<OpenGlVersionProvider> {
    public static OpenGlVersionProvider provideOpenGlVersionProvider(Context context) {
        OpenGlVersionProvider provideOpenGlVersionProvider = AnalyticsModule.INSTANCE.provideOpenGlVersionProvider(context);
        j.d(provideOpenGlVersionProvider);
        return provideOpenGlVersionProvider;
    }
}
