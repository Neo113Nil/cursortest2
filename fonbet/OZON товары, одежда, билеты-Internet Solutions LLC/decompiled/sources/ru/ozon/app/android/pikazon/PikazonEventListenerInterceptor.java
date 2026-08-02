package ru.ozon.app.android.pikazon;

import Qj0.C3889i;
import Qj0.InterfaceC3888h;
import Sg.a;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.pikazon.performance.PerformanceEnabledInterceptor;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0001\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pikazon/PikazonEventListenerInterceptor;", "LQj0/h;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "applicationAnalyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;LSg/a;)V", "LQj0/i;", "requestMeta", "", "intercept", "(LQj0/i;)Z", "", "eventInterceptors", "Ljava/util/Set;", "pikazon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonEventListenerInterceptor implements InterfaceC3888h {

    @NotNull
    private final Set<InterfaceC3888h> eventInterceptors;

    public PikazonEventListenerInterceptor(@NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull a applicationAnalyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        this.eventInterceptors = e0.a(new PerformanceEnabledInterceptor(performanceTrackerDelegate, applicationAnalyticsScreenStorage));
    }

    @Override // Qj0.InterfaceC3888h
    public boolean intercept(@NotNull C3889i requestMeta) {
        Intrinsics.checkNotNullParameter(requestMeta, "requestMeta");
        Iterator<T> it = this.eventInterceptors.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            boolean intercept = ((InterfaceC3888h) it.next()).intercept(requestMeta);
            if (intercept) {
                z11 = intercept;
            }
        }
        return z11;
    }
}
