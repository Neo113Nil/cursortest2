package ru.ozon.app.android.analytics.di.module;

import Jb.e;
import Jb.j;
import Qj0.InterfaceC3896p;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;

/* loaded from: classes6.dex */
public final class AnalyticsModule_Companion_BindPerformanceTrackerDelegateFactory implements e<PerformanceTrackerDelegate> {
    public static PerformanceTrackerDelegate bindPerformanceTrackerDelegate(InterfaceC3896p interfaceC3896p) {
        PerformanceTrackerDelegate bindPerformanceTrackerDelegate = AnalyticsModule.INSTANCE.bindPerformanceTrackerDelegate(interfaceC3896p);
        j.d(bindPerformanceTrackerDelegate);
        return bindPerformanceTrackerDelegate;
    }
}
