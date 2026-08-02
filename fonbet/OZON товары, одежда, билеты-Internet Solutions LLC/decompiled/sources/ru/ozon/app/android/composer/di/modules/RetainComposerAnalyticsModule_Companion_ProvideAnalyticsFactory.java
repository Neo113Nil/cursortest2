package ru.ozon.app.android.composer.di.modules;

import Jb.e;
import Jb.j;
import RZ.a;
import ei0.InterfaceC6369b;
import java.util.Set;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor;
import ru.ozon.app.android.network.abtool.FeatureService;

/* loaded from: classes6.dex */
public final class RetainComposerAnalyticsModule_Companion_ProvideAnalyticsFactory implements e<a> {
    public static a provideAnalytics(InterfaceC6369b interfaceC6369b, AnalyticsEventExecutor analyticsEventExecutor, Sg.a aVar, Sg.a aVar2, VZ.a aVar3, ZZ.a aVar4, Set<YZ.a> set, boolean z11, FeatureService featureService) {
        a provideAnalytics = RetainComposerAnalyticsModule.INSTANCE.provideAnalytics(interfaceC6369b, analyticsEventExecutor, aVar, aVar2, aVar3, aVar4, set, z11, featureService);
        j.d(provideAnalytics);
        return provideAnalytics;
    }
}
