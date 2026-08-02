package ru.ozon.app.android.analytics.eventstorage;

import Qj0.AbstractC3880a;
import java.util.NavigableSet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.Metric;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/analytics/eventstorage/ViewEventStorage;", "", "", "uuid", "", "putKey", "(Ljava/lang/String;)V", "Ljava/util/NavigableSet;", "Lru/ozon/tracker/performance/Metric;", "metrics", "LQj0/a;", "attribute", "putValue", "(Ljava/lang/String;Ljava/util/NavigableSet;LQj0/a;)V", "Lru/ozon/app/android/analytics/eventstorage/ExpirableMetrics;", "getValue", "(Ljava/lang/String;)Lru/ozon/app/android/analytics/eventstorage/ExpirableMetrics;", "removeEntry", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ViewEventStorage {
    ExpirableMetrics getValue(@NotNull String uuid);

    void putKey(@NotNull String uuid);

    void putValue(@NotNull String uuid, @NotNull NavigableSet<Metric> metrics, AbstractC3880a attribute);

    void removeEntry(@NotNull String uuid);
}
