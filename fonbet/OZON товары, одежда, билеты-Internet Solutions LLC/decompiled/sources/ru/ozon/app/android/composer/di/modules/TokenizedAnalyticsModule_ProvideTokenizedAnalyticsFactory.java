package ru.ozon.app.android.composer.di.modules;

import Jb.e;
import Jb.j;
import Sg.a;
import WZ.l;
import ei0.InterfaceC6369b;
import java.util.Set;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor;

/* loaded from: classes6.dex */
public final class TokenizedAnalyticsModule_ProvideTokenizedAnalyticsFactory implements e<l> {
    public static l provideTokenizedAnalytics(InterfaceC6369b interfaceC6369b, AnalyticsEventExecutor analyticsEventExecutor, a aVar, a aVar2, VZ.a aVar3, ZZ.a aVar4, Set<YZ.a> set) {
        l provideTokenizedAnalytics = TokenizedAnalyticsModule.INSTANCE.provideTokenizedAnalytics(interfaceC6369b, analyticsEventExecutor, aVar, aVar2, aVar3, aVar4, set);
        j.d(provideTokenizedAnalytics);
        return provideTokenizedAnalytics;
    }
}
