package ru.ozon.app.android.video.player.performance.metricsManager;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"isFileRead", "", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoPerfMetricsManagerKt {
    public static final boolean isFileRead(@NotNull Set<? extends VideoPerfMetricAction> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int fileReadCompleteMetricListCount = VideoPerfMetricAction.PutAppMetricAction.INSTANCE.getFileReadCompleteMetricListCount();
        int i11 = 0;
        for (VideoPerfMetricAction videoPerfMetricAction : set) {
            if ((videoPerfMetricAction instanceof VideoPerfMetricAction.PutAppMetricAction) && VideoPerfMetricAction.PutAppMetricAction.INSTANCE.getFileReadCompleteMetricList().contains(((VideoPerfMetricAction.PutAppMetricAction) videoPerfMetricAction).getMetricName())) {
                i11++;
            }
        }
        return i11 == fileReadCompleteMetricListCount;
    }
}
