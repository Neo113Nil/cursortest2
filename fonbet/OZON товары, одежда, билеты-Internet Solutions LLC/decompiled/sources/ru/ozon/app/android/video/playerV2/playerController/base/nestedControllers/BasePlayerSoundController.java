package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerSoundController;", "", "switchMute", "", "setMute", "isMuted", "setVolume", "", "volume", "", "getVolume", "checkHasAudio", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BasePlayerSoundController {
    void checkHasAudio();

    float getVolume();

    boolean setMute(boolean isMuted);

    void setVolume(float volume);

    boolean switchMute();
}
