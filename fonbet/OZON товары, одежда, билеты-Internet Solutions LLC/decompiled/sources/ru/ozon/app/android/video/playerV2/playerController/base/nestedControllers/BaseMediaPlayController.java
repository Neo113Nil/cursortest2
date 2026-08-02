package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import u3.InterfaceC9928b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001JS\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H&¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H&¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H&¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0006H&¢\u0006\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseMediaPlayController;", "", "", "videoUrl", "Lru/ozon/app/android/video/manager/ExoManager;", "exoManager", "", "playWhenReady", "repeat", "mute", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lu3/b;", "analyticsListener", "", "position", "", "prepareMediaToPlay", "(Ljava/lang/String;Lru/ozon/app/android/video/manager/ExoManager;ZZZLru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;Lu3/b;Ljava/lang/Long;)V", "resume", "()V", "pause", "retryLoadMedia", "isRepeatModeEnabled", "updateRepeatMode", "(Z)V", "isPlaying", "()Z", "isReadyToPlayAndPaused", "isPlayerActive", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BaseMediaPlayController {
    boolean isPlayerActive();

    boolean isPlaying();

    boolean isReadyToPlayAndPaused();

    void pause();

    void prepareMediaToPlay(@NotNull String videoUrl, @NotNull ExoManager exoManager, boolean playWhenReady, boolean repeat, boolean mute, @NotNull PlayerListenersContainer listener, InterfaceC9928b analyticsListener, Long position);

    void resume();

    void retryLoadMedia();

    void updateRepeatMode(boolean isRepeatModeEnabled);
}
