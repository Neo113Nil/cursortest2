package ru.ozon.app.android.video.playerV2.performance.playback.playbackData;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"mapToStartupFailedCase", "Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackStatsData;", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlaybackStatsDataKt {
    @NotNull
    public static final PlaybackStatsData mapToStartupFailedCase(@NotNull PlaybackStatsData playbackStatsData) {
        Intrinsics.checkNotNullParameter(playbackStatsData, "<this>");
        return PlaybackStatsData.copy$default(playbackStatsData, 0L, 0, 0, 0L, 3, null);
    }
}
