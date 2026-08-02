package ru.ozon.app.android.analytics.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import ru.ozon.app.android.analytics.startup.FontScaleProvider;

/* loaded from: classes6.dex */
public final class AnalyticsModule_Companion_ProvideFontScaleProviderFactory implements e<FontScaleProvider> {
    public static FontScaleProvider provideFontScaleProvider(Context context) {
        FontScaleProvider provideFontScaleProvider = AnalyticsModule.INSTANCE.provideFontScaleProvider(context);
        j.d(provideFontScaleProvider);
        return provideFontScaleProvider;
    }
}
