package ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.logs.PlayerLogger;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.factory.PoolPlayerFactory;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/ReviewsOnlyPlayerStorage;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PlayerPoolStorageImpl$reviewsOnlyPlayerStorage$2 extends AbstractC7737t implements Function0<ReviewsOnlyPlayerStorage> {
    final /* synthetic */ PlayerPoolStorageImpl this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorageImpl$reviewsOnlyPlayerStorage$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<PlayerPoolStorage> {
        final /* synthetic */ PlayerPoolStorageImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PlayerPoolStorageImpl playerPoolStorageImpl) {
            super(0);
            this.this$0 = playerPoolStorageImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PlayerPoolStorage invoke() {
            return this.this$0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerPoolStorageImpl$reviewsOnlyPlayerStorage$2(PlayerPoolStorageImpl playerPoolStorageImpl) {
        super(0);
        this.this$0 = playerPoolStorageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ReviewsOnlyPlayerStorage invoke() {
        PoolPlayerFactory poolPlayerFactory;
        FeatureService featureService;
        PlayerLogger playerLogger;
        poolPlayerFactory = this.this$0.poolPlayerFactory;
        featureService = this.this$0.featureService;
        playerLogger = this.this$0.playerLogger;
        return new ReviewsOnlyPlayerStorage(poolPlayerFactory, featureService, playerLogger, new AnonymousClass1(this.this$0));
    }
}
