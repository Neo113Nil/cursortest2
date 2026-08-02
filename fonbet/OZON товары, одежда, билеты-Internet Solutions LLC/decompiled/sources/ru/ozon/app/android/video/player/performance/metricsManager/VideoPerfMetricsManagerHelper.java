package ru.ozon.app.android.video.player.performance.metricsManager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\n\u0010\u0007\u001a\u00060\u0005j\u0002`\bH&J.\u0010\t\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\n\u0010\u0007\u001a\u00060\u0005j\u0002`\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH&J\u0014\u0010\f\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "", "addVideoUrlToActive", "", "videoUrl", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "widgetName", "Lru/ozon/app/android/video/player/performance/metricsManager/WidgetName;", "removeVideoUrlFromActive", "onRemovedCallback", "Lkotlin/Function0;", "isUrlActive", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VideoPerfMetricsManagerHelper {
    void addVideoUrlToActive(@NotNull String videoUrl, @NotNull String widgetName);

    boolean isUrlActive(@NotNull String videoUrl);

    void removeVideoUrlFromActive(@NotNull String videoUrl, @NotNull String widgetName, @NotNull Function0<Unit> onRemovedCallback);
}
