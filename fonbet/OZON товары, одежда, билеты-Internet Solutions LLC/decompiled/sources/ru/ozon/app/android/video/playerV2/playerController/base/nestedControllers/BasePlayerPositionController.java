package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerPositionController;", "", "seekTo", "", "position", "", "getCurrentPosition", "seekToStartAndReplay", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BasePlayerPositionController {
    long getCurrentPosition();

    void seekTo(long position);

    void seekToStartAndReplay();
}
