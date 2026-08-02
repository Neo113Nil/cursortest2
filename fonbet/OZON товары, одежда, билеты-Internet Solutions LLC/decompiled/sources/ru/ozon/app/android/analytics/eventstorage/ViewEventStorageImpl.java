package ru.ozon.app.android.analytics.eventstorage;

import He.b;
import Qj0.AbstractC3880a;
import Qj0.Q;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.Metric;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\tR \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/analytics/eventstorage/ViewEventStorageImpl;", "Lru/ozon/app/android/analytics/eventstorage/ViewEventStorage;", "<init>", "()V", "", "scheduleExpiredCacheTracesCleaning", "", "uuid", "putKey", "(Ljava/lang/String;)V", "Ljava/util/NavigableSet;", "Lru/ozon/tracker/performance/Metric;", "metrics", "LQj0/a;", "attribute", "putValue", "(Ljava/lang/String;Ljava/util/NavigableSet;LQj0/a;)V", "Lru/ozon/app/android/analytics/eventstorage/ExpirableMetrics;", "getValue", "(Ljava/lang/String;)Lru/ozon/app/android/analytics/eventstorage/ExpirableMetrics;", "removeEntry", "Ljava/util/concurrent/ConcurrentHashMap;", "traces", "Ljava/util/concurrent/ConcurrentHashMap;", "Lxe/M;", "coroutineScope", "Lxe/M;", "Companion", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewEventStorageImpl implements ViewEventStorage {

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final ConcurrentHashMap<String, ExpirableMetrics> traces = new ConcurrentHashMap<>();

    public ViewEventStorageImpl() {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        Intrinsics.checkNotNullExpressionValue("ViewEventStorageImpl", "getSimpleName(...)");
        this.coroutineScope = N.a(d11.plus(new L("ViewEventStorageImpl")).plus(new ViewEventStorageImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        scheduleExpiredCacheTracesCleaning();
    }

    private final void scheduleExpiredCacheTracesCleaning() {
        C10727i.c(this.coroutineScope, null, null, new ViewEventStorageImpl$scheduleExpiredCacheTracesCleaning$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.analytics.eventstorage.ViewEventStorage
    public ExpirableMetrics getValue(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return this.traces.get(uuid);
    }

    @Override // ru.ozon.app.android.analytics.eventstorage.ViewEventStorage
    public void putKey(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (this.traces.get(uuid) == null) {
            this.traces.put(uuid, new ExpirableMetrics(e0.j(new Metric[0]), null, 0L, 6, null));
        }
    }

    @Override // ru.ozon.app.android.analytics.eventstorage.ViewEventStorage
    public void putValue(@NotNull String uuid, @NotNull NavigableSet<Metric> metrics, AbstractC3880a attribute) {
        NavigableSet<Metric> navigableSet;
        ExpirableMetrics expirableMetrics;
        NavigableSet<Metric> metrics2;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        ExpirableMetrics expirableMetrics2 = this.traces.get(uuid);
        if (expirableMetrics2 != null) {
            navigableSet = metrics;
            this.traces.put(uuid, ExpirableMetrics.copy$default(expirableMetrics2, navigableSet, attribute instanceof Q ? (Q) attribute : null, 0L, 4, null));
        } else {
            navigableSet = metrics;
        }
        if (!this.traces.containsKey(uuid) || (expirableMetrics = this.traces.get(uuid)) == null || (metrics2 = expirableMetrics.getMetrics()) == null) {
            return;
        }
        metrics2.addAll(navigableSet);
    }

    @Override // ru.ozon.app.android.analytics.eventstorage.ViewEventStorage
    public void removeEntry(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.traces.remove(uuid);
    }
}
