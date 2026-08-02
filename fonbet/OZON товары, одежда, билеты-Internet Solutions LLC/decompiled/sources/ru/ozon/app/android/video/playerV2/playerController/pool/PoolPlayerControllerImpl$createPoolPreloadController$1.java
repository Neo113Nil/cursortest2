package ru.ozon.app.android.video.playerV2.playerController.pool;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolMediaPlayControllerImpl;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "preloadVideoUrl", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PoolPlayerControllerImpl$createPoolPreloadController$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ PoolPlayerControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PoolPlayerControllerImpl$createPoolPreloadController$1(PoolPlayerControllerImpl poolPlayerControllerImpl) {
        super(1);
        this.this$0 = poolPlayerControllerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String preloadVideoUrl) {
        PlayerPoolStorage playerPoolStorage;
        PlayerConfigAlias playerConfigAlias;
        PoolMediaPlayControllerImpl poolMediaPlayController;
        Intrinsics.checkNotNullParameter(preloadVideoUrl, "preloadVideoUrl");
        playerPoolStorage = this.this$0.playerPoolStorage;
        PoolPlayerControllerImpl poolPlayerControllerImpl = this.this$0;
        playerConfigAlias = poolPlayerControllerImpl.playerConfigAlias;
        playerPoolStorage.storePreloadedPlayer(preloadVideoUrl, poolPlayerControllerImpl, playerConfigAlias);
        poolMediaPlayController = this.this$0.getPoolMediaPlayController();
        poolMediaPlayController.playerPreloaded();
    }
}
