package ru.ozon.app.android.video.preload;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.performance.PlayerNamespace;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/video/preload/PlayerPreloader;", "", "tryToPreloadPdpVideo", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "getLastPreloadedUrl", "", "preCreatePlayer", "preloadVideoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "playerNamespace", "Lru/ozon/app/android/video/player/performance/PlayerNamespace;", "clearPreloadedPlayers", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerPreloader {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void preCreatePlayer$default(PlayerPreloader playerPreloader, PreloadVideoInfo preloadVideoInfo, PlayerNamespace playerNamespace, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preCreatePlayer");
            }
            if ((i11 & 2) != 0) {
                playerNamespace = PlayerNamespace.REVIEW;
            }
            playerPreloader.preCreatePlayer(preloadVideoInfo, playerNamespace);
        }
    }

    void clearPreloadedPlayers();

    String getLastPreloadedUrl();

    void preCreatePlayer(@NotNull PreloadVideoInfo preloadVideoInfo, @NotNull PlayerNamespace playerNamespace);

    void tryToPreloadPdpVideo(@NotNull AtomAction action);
}
