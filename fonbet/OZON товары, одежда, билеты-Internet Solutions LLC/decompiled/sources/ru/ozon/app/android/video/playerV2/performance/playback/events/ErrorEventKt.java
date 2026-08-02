package ru.ozon.app.android.video.playerV2.performance.playback.events;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import ru.ozon.app.android.video.playerV2.performance.playback.events.ErrorEvent;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0002\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¨\u0006\u0011"}, d2 = {"getTypedError", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent$FatalErrorEvent;", "loadingStartTime", "", "isPlayerActive", "", "currentUrl", "", "errorEventUrl", "isAllowedToCheckLoadError", "onAddFatalErrorLoadingTime", "Lkotlin/Function1;", "", "(Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent$FatalErrorEvent;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "isLoadErrorHandleAllowed", "eventUrl", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorEventKt {
    @NotNull
    public static final VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType getTypedError(@NotNull ErrorEvent.FatalErrorEvent fatalErrorEvent, Long l11, boolean z11, @NotNull String currentUrl, @NotNull String errorEventUrl, boolean z12, @NotNull Function1<? super Long, Unit> onAddFatalErrorLoadingTime) {
        Intrinsics.checkNotNullParameter(fatalErrorEvent, "<this>");
        Intrinsics.checkNotNullParameter(currentUrl, "currentUrl");
        Intrinsics.checkNotNullParameter(errorEventUrl, "errorEventUrl");
        Intrinsics.checkNotNullParameter(onAddFatalErrorLoadingTime, "onAddFatalErrorLoadingTime");
        int i11 = fatalErrorEvent.getError().f69342a;
        if (2001 <= i11 && i11 < 2005) {
            return VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType.NETWORK_ERROR;
        }
        if (3000 > i11 || i11 >= 5000) {
            return VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType.OTHER_ERROR;
        }
        if (z11 && l11 != null && isLoadErrorHandleAllowed(currentUrl, errorEventUrl, z12)) {
            onAddFatalErrorLoadingTime.invoke(Long.valueOf(SystemClock.elapsedRealtime() - l11.longValue()));
        }
        return VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType.DECODING_ERROR;
    }

    private static final boolean isLoadErrorHandleAllowed(String str, String str2, boolean z11) {
        if (z11) {
            return str == null || str.length() == 0 || Intrinsics.d(str2, str);
        }
        return false;
    }
}
