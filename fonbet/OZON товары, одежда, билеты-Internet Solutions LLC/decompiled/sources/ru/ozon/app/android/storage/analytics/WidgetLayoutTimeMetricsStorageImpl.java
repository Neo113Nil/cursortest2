package ru.ozon.app.android.storage.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorageImpl;", "Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;", "<init>", "()V", "", "traceId", "Lru/ozon/app/android/storage/analytics/LayoutTimeMetrics;", "metrics", "", "saveMetrics", "(Ljava/lang/String;Lru/ozon/app/android/storage/analytics/LayoutTimeMetrics;)V", "getAndRemoveLayoutTimeMetrics", "(Ljava/lang/String;)Lru/ozon/app/android/storage/analytics/LayoutTimeMetrics;", "", "layoutMetricsStorage", "Ljava/util/Map;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WidgetLayoutTimeMetricsStorageImpl implements WidgetLayoutTimeMetricsStorage {

    @NotNull
    private final Map<String, LayoutTimeMetrics> layoutMetricsStorage = new LinkedHashMap();

    @Override // ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorage
    public LayoutTimeMetrics getAndRemoveLayoutTimeMetrics(@NotNull String traceId) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        return this.layoutMetricsStorage.remove(traceId);
    }

    @Override // ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorage
    public void saveMetrics(@NotNull String traceId, @NotNull LayoutTimeMetrics metrics) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.layoutMetricsStorage.put(traceId, metrics);
    }
}
