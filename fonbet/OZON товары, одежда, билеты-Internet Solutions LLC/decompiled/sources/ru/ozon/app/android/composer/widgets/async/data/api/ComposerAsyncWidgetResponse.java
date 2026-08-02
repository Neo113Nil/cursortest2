package ru.ozon.app.android.composer.widgets.async.data.api;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.metrics.client.MetricsResponse;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "T", "", "state", "", "", "trackingPayloads", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "metrics", "<init>", "(Ljava/lang/Object;Ljava/util/Map;Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getState", "()Ljava/lang/Object;", "Ljava/util/Map;", "getTrackingPayloads", "()Ljava/util/Map;", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "getMetrics", "()Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "composer-async-widget_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComposerAsyncWidgetResponse<T> {

    @NotNull
    private final MetricsResponse.Metrics metrics;
    private final T state;
    private final Map<String, String> trackingPayloads;

    public ComposerAsyncWidgetResponse(T t2, Map<String, String> map, @NotNull MetricsResponse.Metrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.state = t2;
        this.trackingPayloads = map;
        this.metrics = metrics;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposerAsyncWidgetResponse)) {
            return false;
        }
        ComposerAsyncWidgetResponse composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) other;
        return Intrinsics.d(this.state, composerAsyncWidgetResponse.state) && Intrinsics.d(this.trackingPayloads, composerAsyncWidgetResponse.trackingPayloads) && Intrinsics.d(this.metrics, composerAsyncWidgetResponse.metrics);
    }

    @NotNull
    public final MetricsResponse.Metrics getMetrics() {
        return this.metrics;
    }

    public final T getState() {
        return this.state;
    }

    public final Map<String, String> getTrackingPayloads() {
        return this.trackingPayloads;
    }

    public int hashCode() {
        T t2 = this.state;
        int hashCode = (t2 == null ? 0 : t2.hashCode()) * 31;
        Map<String, String> map = this.trackingPayloads;
        return this.metrics.hashCode() + ((hashCode + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ComposerAsyncWidgetResponse(state=" + this.state + ", trackingPayloads=" + this.trackingPayloads + ", metrics=" + this.metrics + ")";
    }
}
