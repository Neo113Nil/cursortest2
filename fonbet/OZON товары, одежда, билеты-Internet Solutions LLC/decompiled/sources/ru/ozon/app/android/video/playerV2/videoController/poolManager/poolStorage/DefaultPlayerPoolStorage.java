package ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.logs.PlayerLogger;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.factory.PoolPlayerFactory;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/DefaultPlayerPoolStorage;", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/AbstractPlayerPoolStorage;", "poolPlayerFactory", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/factory/PoolPlayerFactory;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "playerLogger", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "onGetMainPoolStorage", "Lkotlin/Function0;", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/poolManager/factory/PoolPlayerFactory;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/player/logs/PlayerLogger;Lkotlin/jvm/functions/Function0;)V", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultPlayerPoolStorage extends AbstractPlayerPoolStorage {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPlayerPoolStorage(@NotNull PoolPlayerFactory poolPlayerFactory, @NotNull FeatureService featureService, @NotNull PlayerLogger playerLogger, @NotNull Function0<? extends PlayerPoolStorage> onGetMainPoolStorage) {
        super(poolPlayerFactory, featureService, playerLogger, onGetMainPoolStorage);
        Intrinsics.checkNotNullParameter(poolPlayerFactory, "poolPlayerFactory");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(playerLogger, "playerLogger");
        Intrinsics.checkNotNullParameter(onGetMainPoolStorage, "onGetMainPoolStorage");
    }
}
