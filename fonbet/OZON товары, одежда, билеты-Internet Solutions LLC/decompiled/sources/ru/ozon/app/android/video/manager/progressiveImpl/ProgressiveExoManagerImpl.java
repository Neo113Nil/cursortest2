package ru.ozon.app.android.video.manager.progressiveImpl;

import F3.InterfaceC3018x;
import We.E;
import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o3.InterfaceC8635b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementService;
import ru.ozon.app.android.video.manager.CacheTransferInfoProvider;
import ru.ozon.app.android.video.player.VideoLinkReplacementUtilsKt;
import ru.ozon.app.android.video.player.flags.MP4AssetPreferredQualityFlag;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u001f\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/video/manager/progressiveImpl/ProgressiveExoManagerImpl;", "Lru/ozon/app/android/video/manager/progressiveImpl/AbstractProgressiveExoManager;", "Landroid/content/Context;", "context", "Lo3/b;", "databaseProvider", "LWe/E;", "okHttpClient", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;", "cacheTransferListener", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "videoDomainReplacementService", "<init>", "(Landroid/content/Context;Lo3/b;LWe/E;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;)V", "", "videoUrl", "getTransformedUrlByQuality", "(Ljava/lang/String;)Ljava/lang/String;", ImagesContract.URL, "", "cacheBytesSize", "", "startVideoCaching", "(Ljava/lang/String;J)V", "stopVideoCaching", "(Ljava/lang/String;)V", "Lru/ozon/app/android/video/player/performance/PlayerWidgetInfo;", "widgetInfo", "LF3/x;", "getMediaSource", "(Ljava/lang/String;Ljava/lang/String;)LF3/x;", "LWe/E;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProgressiveExoManagerImpl extends AbstractProgressiveExoManager {

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final E okHttpClient;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/video/manager/progressiveImpl/ProgressiveExoManagerImpl$Companion;", "", "<init>", "()V", "CACHE_DIR_NAME", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressiveExoManagerImpl(@NotNull Context context, @NotNull InterfaceC8635b databaseProvider, @NotNull E okHttpClient, @NotNull FeatureService featureService, @NotNull VideoPerfMetricsManager videoPerfMetricsManager, @NotNull CacheTransferInfoProvider cacheTransferListener, @NotNull VideoDomainReplacementService videoDomainReplacementService) {
        super(context, databaseProvider, okHttpClient, featureService, videoPerfMetricsManager, cacheTransferListener, videoDomainReplacementService, "media_social", false, true);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        Intrinsics.checkNotNullParameter(cacheTransferListener, "cacheTransferListener");
        Intrinsics.checkNotNullParameter(videoDomainReplacementService, "videoDomainReplacementService");
        this.okHttpClient = okHttpClient;
        this.featureService = featureService;
    }

    private final String getTransformedUrlByQuality(String videoUrl) {
        int intKey = this.featureService.getIntKey(MP4AssetPreferredQualityFlag.INSTANCE);
        return intKey >= 0 ? VideoLinkReplacementUtilsKt.changeAssetQuality(videoUrl, intKey) : videoUrl;
    }

    @Override // ru.ozon.app.android.video.manager.progressiveImpl.AbstractProgressiveExoManager, ru.ozon.app.android.video.manager.ExoManager
    public InterfaceC3018x getMediaSource(@NotNull String videoUrl, String widgetInfo) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        return super.getMediaSource(getTransformedUrlByQuality(videoUrl), widgetInfo);
    }

    @Override // ru.ozon.app.android.video.manager.progressiveImpl.AbstractProgressiveExoManager, ru.ozon.app.android.video.manager.ProgressiveExoManager
    public void startVideoCaching(@NotNull String url, long cacheBytesSize) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.startVideoCaching(getTransformedUrlByQuality(url), cacheBytesSize);
    }

    @Override // ru.ozon.app.android.video.manager.progressiveImpl.AbstractProgressiveExoManager, ru.ozon.app.android.video.manager.ProgressiveExoManager
    public void stopVideoCaching(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.stopVideoCaching(getTransformedUrlByQuality(url));
    }
}
