package ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/pool/nestedControllers/PoolMediaPlayController;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseMediaPlayController;", "Lkotlin/Function0;", "", "releasePlayerLinksCallback", "stopAndReturnToFreePool", "(Lkotlin/jvm/functions/Function0;)V", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PoolMediaPlayController extends BaseMediaPlayController {
    void stopAndReturnToFreePool(@NotNull Function0<Unit> releasePlayerLinksCallback);
}
