package ru.ozon.app.android.composer.tracker;

import Ih.d;
import Qj0.InterfaceC3896p;
import Qj0.U;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/tracker/BxPerformanceTraceHandler;", "LIh/d;", "LQj0/p;", "performanceTracker", "<init>", "(LQj0/p;)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "LQj0/U;", "beginTrace", "(Ljava/lang/String;)LQj0/U;", "", "endTrace", "(Ljava/lang/String;)V", "", "hasTrace", "(Ljava/lang/String;)Z", "removeTrace", "LQj0/p;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BxPerformanceTraceHandler implements d {

    @NotNull
    private final InterfaceC3896p performanceTracker;

    public BxPerformanceTraceHandler(@NotNull InterfaceC3896p performanceTracker) {
        Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
        this.performanceTracker = performanceTracker;
    }

    @Override // Ih.d
    @NotNull
    public U beginTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.performanceTracker.beginTrace(name);
    }

    @Override // Ih.d
    public void endTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.performanceTracker.endTrace(name, kotlin.collections.U.c());
    }

    @Override // Ih.d
    public boolean hasTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.performanceTracker.hasTrace(name);
    }

    @Override // Ih.d
    public U removeTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.performanceTracker.removeTrace(name);
    }
}
