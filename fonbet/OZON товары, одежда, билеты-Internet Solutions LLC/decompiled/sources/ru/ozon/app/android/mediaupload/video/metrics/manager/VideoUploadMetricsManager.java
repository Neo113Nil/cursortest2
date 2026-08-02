package ru.ozon.app.android.mediaupload.video.metrics.manager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;", "", "", "uploadProcessId", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent;", "metricEvent", "", "addMetric", "(Ljava/lang/String;Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onUploadCancelled", "(Ljava/lang/String;)V", "", "isMetricsTrackingEnabled", "()Z", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface VideoUploadMetricsManager {
    Object addMetric(@NotNull String str, @NotNull UploadMetricEvent uploadMetricEvent, @NotNull d<? super Unit> dVar);

    boolean isMetricsTrackingEnabled();

    void onUploadCancelled(@NotNull String uploadProcessId);
}
