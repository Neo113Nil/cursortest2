package ru.ozon.app.android.video.playerV2.playerController.pool;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "getPlayerUrl", "()Ljava/lang/String;", "", "isControllerPlayerActive", "()Z", "", "returnToPoolOrRelease", "()V", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PoolPlayerControllerInternal extends PoolPlayerController {
    String getPlayerUrl();

    boolean isControllerPlayerActive();

    void returnToPoolOrRelease();
}
