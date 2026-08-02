package ru.ozon.app.android.video.playerV2.playerController.base;

import Sc.InterfaceC4008j;
import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestService;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.utils.ExoPlayerUtilsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/media3/exoplayer/ExoPlayer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BasePlayerControllerImpl$exoPlayerCreationDelegate$1 extends AbstractC7737t implements Function0<ExoPlayer> {
    final /* synthetic */ BasePlayerControllerImpl this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerControllerImpl$exoPlayerCreationDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<PlayerListenersContainer> {
        final /* synthetic */ BasePlayerControllerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BasePlayerControllerImpl basePlayerControllerImpl) {
            super(0);
            this.this$0 = basePlayerControllerImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PlayerListenersContainer invoke() {
            BasePlayerListenersController basePlayerListenersController;
            basePlayerListenersController = this.this$0.getBasePlayerListenersController();
            return basePlayerListenersController.getPlayerListener();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePlayerControllerImpl$exoPlayerCreationDelegate$1(BasePlayerControllerImpl basePlayerControllerImpl) {
        super(0);
        this.this$0 = basePlayerControllerImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ExoPlayer invoke() {
        Context context;
        PlayerConfigAlias playerConfigAlias;
        FeatureService featureService;
        InterfaceC4008j interfaceC4008j;
        AudioRequestService audioRequestService;
        context = this.this$0.context;
        playerConfigAlias = this.this$0.playerConfigAlias;
        featureService = this.this$0.featureService;
        interfaceC4008j = this.this$0.playbackAnalyticsListenerDelegate;
        audioRequestService = this.this$0.audioRequestService;
        return ExoPlayerUtilsKt.getExoPlayer(context, playerConfigAlias, featureService, interfaceC4008j, audioRequestService, new AnonymousClass1(this.this$0));
    }
}
