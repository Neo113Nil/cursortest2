package ru.ozon.app.android.video.playerV2.utils;

import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.collect.AbstractC5880y;
import j3.C7256L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestService;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lj3/L;", "", "hasAudioInTracks", "(Lj3/L;)Z", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "", "requestAudioFocusForPlayer", "(Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;Landroidx/media3/exoplayer/ExoPlayer;)V", "abandonAudioFocusRequestForPlayer", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AudioUtilsKt {
    public static final void abandonAudioFocusRequestForPlayer(@NotNull AudioRequestService audioRequestService, @NotNull ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(audioRequestService, "<this>");
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        audioRequestService.abandonAudioFocusRequest(exoPlayer.hashCode());
    }

    public static final boolean hasAudioInTracks(@NotNull C7256L c7256l) {
        Intrinsics.checkNotNullParameter(c7256l, "<this>");
        AbstractC5880y<C7256L.a> a11 = c7256l.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getGroups(...)");
        for (C7256L.a aVar : a11) {
            int i11 = aVar.f69035a;
            for (int i12 = 0; i12 < i11; i12++) {
                String str = aVar.a().a(i12).f69127o;
                if (str != null && h.t(str, "audio", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void requestAudioFocusForPlayer(@NotNull AudioRequestService audioRequestService, @NotNull ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(audioRequestService, "<this>");
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        audioRequestService.requestAudioFocus(exoPlayer.hashCode());
    }
}
