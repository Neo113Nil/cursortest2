package ru.ozon.app.android.analytics.performance.di.module;

import Fg0.a;
import Gg0.c;
import Gg0.f;
import Jb.e;
import Jb.j;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;

/* loaded from: classes6.dex */
public final class ImagesAnalyticsModule_ProvidePlaceholderTimeHandlerFactory implements e<f> {
    public static f providePlaceholderTimeHandler(PikazonPerformanceAvailabilityChecker pikazonPerformanceAvailabilityChecker, PerformanceTrackerDelegate performanceTrackerDelegate, c cVar, a aVar, Sg.a aVar2, C9067a c9067a) {
        f providePlaceholderTimeHandler = ImagesAnalyticsModule.INSTANCE.providePlaceholderTimeHandler(pikazonPerformanceAvailabilityChecker, performanceTrackerDelegate, cVar, aVar, aVar2, c9067a);
        j.d(providePlaceholderTimeHandler);
        return providePlaceholderTimeHandler;
    }
}
