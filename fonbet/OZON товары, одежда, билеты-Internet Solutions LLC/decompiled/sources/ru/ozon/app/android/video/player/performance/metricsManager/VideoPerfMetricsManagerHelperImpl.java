package ru.ozon.app.android.video.player.performance.metricsManager;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\n\u0010\n\u001a\u00060\u0006j\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0010\u001a\u00020\u000b2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\n\u0010\n\u001a\u00060\u0006j\u0002`\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0016\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\b\u0012\u00060\u0006j\u0002`\t0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelperImpl;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "videoUrl", "Lru/ozon/app/android/video/player/performance/metricsManager/WidgetName;", "widgetName", "", "addVideoUrlToActive", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function0;", "onRemovedCallback", "removeVideoUrlFromActive", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "isUrlActive", "(Ljava/lang/String;)Z", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "Ljava/util/concurrent/ConcurrentHashMap;", "activeVideoUrlsMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoPerfMetricsManagerHelperImpl implements VideoPerfMetricsManagerHelper {

    @NotNull
    private final ConcurrentHashMap<String, String> activeVideoUrlsMap;

    @NotNull
    private final FeatureChecker featureChecker;
    public static final int $stable = 8;

    public VideoPerfMetricsManagerHelperImpl(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
        this.activeVideoUrlsMap = new ConcurrentHashMap<>();
    }

    @Override // ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper
    public void addVideoUrlToActive(@NotNull String videoUrl, @NotNull String widgetName) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        this.activeVideoUrlsMap.put(VideoAsset.INSTANCE.castToBaseUrl$video_prodGoogleAllVendorsRelease(videoUrl), widgetName);
    }

    @Override // ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper
    public boolean isUrlActive(@NotNull String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        return this.activeVideoUrlsMap.containsKey(VideoAsset.INSTANCE.castToBaseUrl$video_prodGoogleAllVendorsRelease(videoUrl));
    }

    @Override // ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper
    public void removeVideoUrlFromActive(@NotNull String videoUrl, @NotNull String widgetName, @NotNull Function0<Unit> onRemovedCallback) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(onRemovedCallback, "onRemovedCallback");
        String castToBaseUrl$video_prodGoogleAllVendorsRelease = VideoAsset.INSTANCE.castToBaseUrl$video_prodGoogleAllVendorsRelease(videoUrl);
        String str = this.activeVideoUrlsMap.get(castToBaseUrl$video_prodGoogleAllVendorsRelease);
        if (Intrinsics.d(str, widgetName) || Intrinsics.d(str, "UNSPECIFIED")) {
            this.activeVideoUrlsMap.remove(castToBaseUrl$video_prodGoogleAllVendorsRelease);
            onRemovedCallback.invoke();
        }
    }
}
