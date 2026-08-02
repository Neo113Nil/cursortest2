package ru.ozon.app.android.analytics.eventstorage;

import P4.f;
import Qj0.Q;
import java.util.NavigableSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.Metric;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/analytics/eventstorage/ExpirableMetrics;", "", "Ljava/util/NavigableSet;", "Lru/ozon/tracker/performance/Metric;", "metrics", "LQj0/Q;", "statusCode", "", "creationTime", "<init>", "(Ljava/util/NavigableSet;LQj0/Q;J)V", "copy", "(Ljava/util/NavigableSet;LQj0/Q;J)Lru/ozon/app/android/analytics/eventstorage/ExpirableMetrics;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/NavigableSet;", "getMetrics", "()Ljava/util/NavigableSet;", "LQj0/Q;", "getStatusCode", "()LQj0/Q;", "J", "getCreationTime", "()J", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ExpirableMetrics {
    private final long creationTime;

    @NotNull
    private final NavigableSet<Metric> metrics;
    private final Q statusCode;

    public ExpirableMetrics(@NotNull NavigableSet<Metric> metrics, Q q11, long j11) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.metrics = metrics;
        this.statusCode = q11;
        this.creationTime = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpirableMetrics copy$default(ExpirableMetrics expirableMetrics, NavigableSet navigableSet, Q q11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            navigableSet = expirableMetrics.metrics;
        }
        if ((i11 & 2) != 0) {
            q11 = expirableMetrics.statusCode;
        }
        if ((i11 & 4) != 0) {
            j11 = expirableMetrics.creationTime;
        }
        return expirableMetrics.copy(navigableSet, q11, j11);
    }

    @NotNull
    public final ExpirableMetrics copy(@NotNull NavigableSet<Metric> metrics, Q statusCode, long creationTime) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return new ExpirableMetrics(metrics, statusCode, creationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpirableMetrics)) {
            return false;
        }
        ExpirableMetrics expirableMetrics = (ExpirableMetrics) other;
        return Intrinsics.d(this.metrics, expirableMetrics.metrics) && Intrinsics.d(this.statusCode, expirableMetrics.statusCode) && this.creationTime == expirableMetrics.creationTime;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    @NotNull
    public final NavigableSet<Metric> getMetrics() {
        return this.metrics;
    }

    public final Q getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int hashCode = this.metrics.hashCode() * 31;
        Q q11 = this.statusCode;
        return Long.hashCode(this.creationTime) + ((hashCode + (q11 == null ? 0 : q11.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        NavigableSet<Metric> navigableSet = this.metrics;
        Q q11 = this.statusCode;
        long j11 = this.creationTime;
        StringBuilder sb2 = new StringBuilder("ExpirableMetrics(metrics=");
        sb2.append(navigableSet);
        sb2.append(", statusCode=");
        sb2.append(q11);
        sb2.append(", creationTime=");
        return f.a(j11, ")", sb2);
    }

    public /* synthetic */ ExpirableMetrics(NavigableSet navigableSet, Q q11, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(navigableSet, (i11 & 2) != 0 ? null : q11, (i11 & 4) != 0 ? System.currentTimeMillis() : j11);
    }
}
