package ru.ozon.app.android.analytics.performance;

import Qj0.InterfaceC3896p;
import Qj0.U;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u0011J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u0012J,\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0012J4\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u0013H\u0096\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegateImpl;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "LQj0/p;", "tracker", "<init>", "(LQj0/p;)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/Function1;", "LQj0/U;", "", "block", "runTrace", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "beginTrace", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)LQj0/U;", "trace", "(LQj0/U;)LQj0/U;", "(Ljava/lang/String;)LQj0/U;", "", "", "properties", "endTrace", "(Ljava/lang/String;Ljava/util/Map;)V", "", "hasTrace", "(Ljava/lang/String;)Z", "removeTrace", "page", "Lru/ozon/tracker/performance/ObjectTypes;", "objectType", "isSupported", "(Ljava/lang/String;Lru/ozon/tracker/performance/ObjectTypes;Ljava/util/Map;)Z", "LQj0/p;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PerformanceTrackerDelegateImpl implements PerformanceTrackerDelegate, InterfaceC3896p {

    @NotNull
    private final InterfaceC3896p tracker;

    public PerformanceTrackerDelegateImpl(@NotNull InterfaceC3896p tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
    }

    @Override // Qj0.InterfaceC3896p
    @NotNull
    public U beginTrace(@NotNull U trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return this.tracker.beginTrace(trace);
    }

    @Override // Qj0.InterfaceC3896p
    public void endTrace(@NotNull String name, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.tracker.endTrace(name, properties);
    }

    @Override // Qj0.InterfaceC3896p
    public boolean hasTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.tracker.hasTrace(name);
    }

    @Override // Qj0.InterfaceC3896p
    public boolean isSupported(@NotNull String page, @NotNull ObjectTypes objectType, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return this.tracker.isSupported(page, objectType, properties);
    }

    @Override // Qj0.InterfaceC3896p
    public U removeTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.tracker.removeTrace(name);
    }

    @Override // ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate
    public void runTrace(@NotNull String name, Function1<? super U, Unit> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        InterfaceC3896p interfaceC3896p = this.tracker;
        if (block == null) {
            block = PerformanceTrackerDelegateImpl$runTrace$1.INSTANCE;
        }
        block.invoke(interfaceC3896p.beginTrace(name));
        interfaceC3896p.endTrace(name, kotlin.collections.U.c());
    }

    @Override // Qj0.InterfaceC3896p
    @NotNull
    public U beginTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.tracker.beginTrace(name);
    }

    @Override // ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate
    @NotNull
    public U beginTrace(@NotNull String name, Function1<? super U, Unit> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        InterfaceC3896p interfaceC3896p = this.tracker;
        if (block == null) {
            block = PerformanceTrackerDelegateImpl$beginTrace$1.INSTANCE;
        }
        U beginTrace = interfaceC3896p.beginTrace(name);
        block.invoke(beginTrace);
        return beginTrace;
    }
}
