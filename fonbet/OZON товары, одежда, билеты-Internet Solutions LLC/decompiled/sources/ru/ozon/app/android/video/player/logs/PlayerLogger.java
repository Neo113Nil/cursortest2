package ru.ozon.app.android.video.player.logs;

import j3.w;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\tJ9\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/video/player/logs/PlayerLogger;", "", "Lj3/w;", "error", "", "videoUrl", "widgetName", "", "logFatalPlayerError", "(Lj3/w;Ljava/lang/String;Ljava/lang/String;)V", "nonFatalReason", "errorMessage", "errorCause", "logNonFatalPlayerError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerLogger {
    void logFatalPlayerError(@NotNull w error, @NotNull String videoUrl, String widgetName);

    void logNonFatalPlayerError(@NotNull String nonFatalReason, @NotNull String videoUrl, @NotNull String errorMessage, @NotNull String errorCause, String widgetName);
}
