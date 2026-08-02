package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import j3.Q;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfo;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseVideoInfoController;", "", "", "index", "", "setVideoIndex", "(I)V", "Lj3/Q;", "videoSize", "()Lj3/Q;", "", "getRelativeViewTime", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfo;", "viewTimeInfo", "(Z)Lru/ozon/app/android/video/playerV2/data/ViewTimeInfo;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BaseVideoInfoController {
    void setVideoIndex(int index);

    @NotNull
    Q videoSize();

    @NotNull
    ViewTimeInfo viewTimeInfo(boolean getRelativeViewTime);
}
