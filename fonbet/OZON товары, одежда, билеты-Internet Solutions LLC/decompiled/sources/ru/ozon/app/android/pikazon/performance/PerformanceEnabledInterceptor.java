package ru.ozon.app.android.pikazon.performance;

import Qj0.C3889i;
import Qj0.InterfaceC3888h;
import Sg.a;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pikazon/performance/PerformanceEnabledInterceptor;", "LQj0/h;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "applicationAnalyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;LSg/a;)V", "LQj0/i;", "requestMeta", "", "intercept", "(LQj0/i;)Z", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "LSg/a;", "pikazon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PerformanceEnabledInterceptor implements InterfaceC3888h {

    @NotNull
    private final a applicationAnalyticsScreenStorage;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    public PerformanceEnabledInterceptor(@NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull a applicationAnalyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.applicationAnalyticsScreenStorage = applicationAnalyticsScreenStorage;
    }

    @Override // Qj0.InterfaceC3888h
    public boolean intercept(@NotNull C3889i requestMeta) {
        boolean isSupported;
        Intrinsics.checkNotNullParameter(requestMeta, "requestMeta");
        PerformanceTrackerDelegate performanceTrackerDelegate = this.performanceTrackerDelegate;
        Rg.a a11 = this.applicationAnalyticsScreenStorage.a();
        String f7 = a11 != null ? a11.f() : null;
        if (f7 == null) {
            f7 = "";
        }
        isSupported = performanceTrackerDelegate.isSupported(f7, ObjectTypes.IMAGE, U.c());
        return !isSupported;
    }
}
