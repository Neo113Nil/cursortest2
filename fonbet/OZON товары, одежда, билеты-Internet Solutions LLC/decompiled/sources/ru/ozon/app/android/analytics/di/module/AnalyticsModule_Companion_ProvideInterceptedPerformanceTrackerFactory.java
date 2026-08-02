package ru.ozon.app.android.analytics.di.module;

import Jb.e;
import Jb.j;
import Qj0.I;
import Qj0.InterfaceC3896p;
import ei0.InterfaceC6369b;
import java.util.List;

/* loaded from: classes6.dex */
public final class AnalyticsModule_Companion_ProvideInterceptedPerformanceTrackerFactory implements e<InterfaceC3896p> {
    public static InterfaceC3896p provideInterceptedPerformanceTracker(InterfaceC6369b interfaceC6369b, List<I> list) {
        InterfaceC3896p provideInterceptedPerformanceTracker = AnalyticsModule.INSTANCE.provideInterceptedPerformanceTracker(interfaceC6369b, list);
        j.d(provideInterceptedPerformanceTracker);
        return provideInterceptedPerformanceTracker;
    }
}
