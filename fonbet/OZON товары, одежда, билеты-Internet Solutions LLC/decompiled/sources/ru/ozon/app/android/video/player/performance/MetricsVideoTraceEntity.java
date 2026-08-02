package ru.ozon.app.android.video.player.performance;

import G.g;
import Qj0.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/video/player/performance/MetricsVideoTraceEntity;", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;", "putVideoPlaybackMetricAction", "", "LQj0/z0$b;", "manifestsMetricsList", "filesMetricsList", "Lru/ozon/app/android/video/player/performance/VideoTraceEntity;", "videoTraceEntity", "<init>", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/video/player/performance/VideoTraceEntity;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;", "getPutVideoPlaybackMetricAction", "()Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;", "Ljava/util/List;", "getManifestsMetricsList", "()Ljava/util/List;", "getFilesMetricsList", "Lru/ozon/app/android/video/player/performance/VideoTraceEntity;", "getVideoTraceEntity", "()Lru/ozon/app/android/video/player/performance/VideoTraceEntity;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MetricsVideoTraceEntity {

    @NotNull
    private final List<z0.b> filesMetricsList;

    @NotNull
    private final List<z0.b> manifestsMetricsList;

    @NotNull
    private final VideoPerfMetricAction.PutVideoPlaybackMetricAction putVideoPlaybackMetricAction;

    @NotNull
    private final VideoTraceEntity videoTraceEntity;

    public MetricsVideoTraceEntity(@NotNull VideoPerfMetricAction.PutVideoPlaybackMetricAction putVideoPlaybackMetricAction, @NotNull List<z0.b> manifestsMetricsList, @NotNull List<z0.b> filesMetricsList, @NotNull VideoTraceEntity videoTraceEntity) {
        Intrinsics.checkNotNullParameter(putVideoPlaybackMetricAction, "putVideoPlaybackMetricAction");
        Intrinsics.checkNotNullParameter(manifestsMetricsList, "manifestsMetricsList");
        Intrinsics.checkNotNullParameter(filesMetricsList, "filesMetricsList");
        Intrinsics.checkNotNullParameter(videoTraceEntity, "videoTraceEntity");
        this.putVideoPlaybackMetricAction = putVideoPlaybackMetricAction;
        this.manifestsMetricsList = manifestsMetricsList;
        this.filesMetricsList = filesMetricsList;
        this.videoTraceEntity = videoTraceEntity;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricsVideoTraceEntity)) {
            return false;
        }
        MetricsVideoTraceEntity metricsVideoTraceEntity = (MetricsVideoTraceEntity) other;
        return Intrinsics.d(this.putVideoPlaybackMetricAction, metricsVideoTraceEntity.putVideoPlaybackMetricAction) && Intrinsics.d(this.manifestsMetricsList, metricsVideoTraceEntity.manifestsMetricsList) && Intrinsics.d(this.filesMetricsList, metricsVideoTraceEntity.filesMetricsList) && Intrinsics.d(this.videoTraceEntity, metricsVideoTraceEntity.videoTraceEntity);
    }

    @NotNull
    public final List<z0.b> getFilesMetricsList() {
        return this.filesMetricsList;
    }

    @NotNull
    public final List<z0.b> getManifestsMetricsList() {
        return this.manifestsMetricsList;
    }

    @NotNull
    public final VideoPerfMetricAction.PutVideoPlaybackMetricAction getPutVideoPlaybackMetricAction() {
        return this.putVideoPlaybackMetricAction;
    }

    @NotNull
    public final VideoTraceEntity getVideoTraceEntity() {
        return this.videoTraceEntity;
    }

    public int hashCode() {
        return this.videoTraceEntity.hashCode() + g.b(g.b(this.putVideoPlaybackMetricAction.hashCode() * 31, 31, this.manifestsMetricsList), 31, this.filesMetricsList);
    }

    @NotNull
    public String toString() {
        return "MetricsVideoTraceEntity(putVideoPlaybackMetricAction=" + this.putVideoPlaybackMetricAction + ", manifestsMetricsList=" + this.manifestsMetricsList + ", filesMetricsList=" + this.filesMetricsList + ", videoTraceEntity=" + this.videoTraceEntity + ")";
    }
}
