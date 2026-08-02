package ru.ozon.app.android.video.player.performance.metricsManager;

import T7.P;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap;", "", "", "isAllFilesRead", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap$GeneralVideoInfo;", "generalVideoInfoOptional", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap$VideoPerfMetricsSet;", "videoAssetMetricsMap", "<init>", "(ZLru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap$GeneralVideoInfo;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap$GeneralVideoInfo;", "getGeneralVideoInfoOptional", "()Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap$GeneralVideoInfo;", "Ljava/util/Map;", "getVideoAssetMetricsMap", "()Ljava/util/Map;", "VideoPerfMetricsSet", "GeneralVideoInfo", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VideoAssetMap {
    private final GeneralVideoInfo generalVideoInfoOptional;
    private final boolean isAllFilesRead;

    @NotNull
    private final Map<VideoAsset, VideoPerfMetricsSet> videoAssetMetricsMap;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap$GeneralVideoInfo;", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$SendMetricsAction;", "sendMetricsActionInfo", "", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "cacheVideoUrls", "<init>", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$SendMetricsAction;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$SendMetricsAction;", "getSendMetricsActionInfo", "()Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$SendMetricsAction;", "Ljava/util/Set;", "getCacheVideoUrls", "()Ljava/util/Set;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class GeneralVideoInfo {

        @NotNull
        private final Set<String> cacheVideoUrls;

        @NotNull
        private final VideoPerfMetricAction.SendMetricsAction sendMetricsActionInfo;

        public GeneralVideoInfo(@NotNull VideoPerfMetricAction.SendMetricsAction sendMetricsActionInfo, @NotNull Set<String> cacheVideoUrls) {
            Intrinsics.checkNotNullParameter(sendMetricsActionInfo, "sendMetricsActionInfo");
            Intrinsics.checkNotNullParameter(cacheVideoUrls, "cacheVideoUrls");
            this.sendMetricsActionInfo = sendMetricsActionInfo;
            this.cacheVideoUrls = cacheVideoUrls;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GeneralVideoInfo)) {
                return false;
            }
            GeneralVideoInfo generalVideoInfo = (GeneralVideoInfo) other;
            return Intrinsics.d(this.sendMetricsActionInfo, generalVideoInfo.sendMetricsActionInfo) && Intrinsics.d(this.cacheVideoUrls, generalVideoInfo.cacheVideoUrls);
        }

        @NotNull
        public final Set<String> getCacheVideoUrls() {
            return this.cacheVideoUrls;
        }

        @NotNull
        public final VideoPerfMetricAction.SendMetricsAction getSendMetricsActionInfo() {
            return this.sendMetricsActionInfo;
        }

        public int hashCode() {
            return this.cacheVideoUrls.hashCode() + (this.sendMetricsActionInfo.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "GeneralVideoInfo(sendMetricsActionInfo=" + this.sendMetricsActionInfo + ", cacheVideoUrls=" + this.cacheVideoUrls + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap$VideoPerfMetricsSet;", "", "", "isFileRead", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;", "videoPerfMetricsSet", "<init>", "(ZLjava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/util/Set;", "getVideoPerfMetricsSet", "()Ljava/util/Set;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoPerfMetricsSet {
        private final boolean isFileRead;

        @NotNull
        private final Set<VideoPerfMetricAction> videoPerfMetricsSet;

        public VideoPerfMetricsSet(boolean z11, @NotNull Set<VideoPerfMetricAction> videoPerfMetricsSet) {
            Intrinsics.checkNotNullParameter(videoPerfMetricsSet, "videoPerfMetricsSet");
            this.isFileRead = z11;
            this.videoPerfMetricsSet = videoPerfMetricsSet;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoPerfMetricsSet)) {
                return false;
            }
            VideoPerfMetricsSet videoPerfMetricsSet = (VideoPerfMetricsSet) other;
            return this.isFileRead == videoPerfMetricsSet.isFileRead && Intrinsics.d(this.videoPerfMetricsSet, videoPerfMetricsSet.videoPerfMetricsSet);
        }

        @NotNull
        public final Set<VideoPerfMetricAction> getVideoPerfMetricsSet() {
            return this.videoPerfMetricsSet;
        }

        public int hashCode() {
            return this.videoPerfMetricsSet.hashCode() + (Boolean.hashCode(this.isFileRead) * 31);
        }

        /* renamed from: isFileRead, reason: from getter */
        public final boolean getIsFileRead() {
            return this.isFileRead;
        }

        @NotNull
        public String toString() {
            return "VideoPerfMetricsSet(isFileRead=" + this.isFileRead + ", videoPerfMetricsSet=" + this.videoPerfMetricsSet + ")";
        }
    }

    public VideoAssetMap(boolean z11, GeneralVideoInfo generalVideoInfo, @NotNull Map<VideoAsset, VideoPerfMetricsSet> videoAssetMetricsMap) {
        Intrinsics.checkNotNullParameter(videoAssetMetricsMap, "videoAssetMetricsMap");
        this.isAllFilesRead = z11;
        this.generalVideoInfoOptional = generalVideoInfo;
        this.videoAssetMetricsMap = videoAssetMetricsMap;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoAssetMap)) {
            return false;
        }
        VideoAssetMap videoAssetMap = (VideoAssetMap) other;
        return this.isAllFilesRead == videoAssetMap.isAllFilesRead && Intrinsics.d(this.generalVideoInfoOptional, videoAssetMap.generalVideoInfoOptional) && Intrinsics.d(this.videoAssetMetricsMap, videoAssetMap.videoAssetMetricsMap);
    }

    public final GeneralVideoInfo getGeneralVideoInfoOptional() {
        return this.generalVideoInfoOptional;
    }

    @NotNull
    public final Map<VideoAsset, VideoPerfMetricsSet> getVideoAssetMetricsMap() {
        return this.videoAssetMetricsMap;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isAllFilesRead) * 31;
        GeneralVideoInfo generalVideoInfo = this.generalVideoInfoOptional;
        return this.videoAssetMetricsMap.hashCode() + ((hashCode + (generalVideoInfo == null ? 0 : generalVideoInfo.hashCode())) * 31);
    }

    /* renamed from: isAllFilesRead, reason: from getter */
    public final boolean getIsAllFilesRead() {
        return this.isAllFilesRead;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isAllFilesRead;
        GeneralVideoInfo generalVideoInfo = this.generalVideoInfoOptional;
        Map<VideoAsset, VideoPerfMetricsSet> map = this.videoAssetMetricsMap;
        StringBuilder sb2 = new StringBuilder("VideoAssetMap(isAllFilesRead=");
        sb2.append(z11);
        sb2.append(", generalVideoInfoOptional=");
        sb2.append(generalVideoInfo);
        sb2.append(", videoAssetMetricsMap=");
        return P.f(sb2, map, ")");
    }
}
