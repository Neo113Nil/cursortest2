package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseHorizontalComposableKt$PlayerCell$stopPlaying$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ PlayerShowcaseComponent $component;
    final /* synthetic */ InterfaceC3978p0<PlayerListenersContainer> $currentListener$delegate;
    final /* synthetic */ InterfaceC3978p0<PoolPlayerController> $playerController$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $showLoader$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $showPreview$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseHorizontalComposableKt$PlayerCell$stopPlaying$1$1(InterfaceC3978p0<PoolPlayerController> interfaceC3978p0, PlayerShowcaseComponent playerShowcaseComponent, InterfaceC3978p0<PlayerListenersContainer> interfaceC3978p02, InterfaceC3978p0<Boolean> interfaceC3978p03, InterfaceC3978p0<Boolean> interfaceC3978p04) {
        super(0);
        this.$playerController$delegate = interfaceC3978p0;
        this.$component = playerShowcaseComponent;
        this.$currentListener$delegate = interfaceC3978p02;
        this.$showPreview$delegate = interfaceC3978p03;
        this.$showLoader$delegate = interfaceC3978p04;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PoolPlayerController PlayerCell$lambda$4;
        PlayerListenersContainer PlayerCell$lambda$7;
        PlayerCell$lambda$4 = PlayerShowcaseHorizontalComposableKt.PlayerCell$lambda$4(this.$playerController$delegate);
        if (PlayerCell$lambda$4 == null) {
            return null;
        }
        PlayerShowcaseComponent playerShowcaseComponent = this.$component;
        InterfaceC3978p0<PlayerListenersContainer> interfaceC3978p0 = this.$currentListener$delegate;
        InterfaceC3978p0<PoolPlayerController> interfaceC3978p02 = this.$playerController$delegate;
        InterfaceC3978p0<Boolean> interfaceC3978p03 = this.$showPreview$delegate;
        InterfaceC3978p0<Boolean> interfaceC3978p04 = this.$showLoader$delegate;
        PlayerCell$lambda$7 = PlayerShowcaseHorizontalComposableKt.PlayerCell$lambda$7(interfaceC3978p0);
        if (PlayerCell$lambda$7 != null) {
            PlayerCell$lambda$4.listenersController().removePlayerListener(PlayerCell$lambda$7);
        }
        PlayerCell$lambda$4.mediaPlayController().stopAndReturnToFreePool(new PlayerShowcaseHorizontalComposableKt$PlayerCell$stopPlaying$1$1$1$2(interfaceC3978p02, interfaceC3978p0));
        playerShowcaseComponent.getPoolCapacityManager().onPlayerStopped();
        PlayerShowcaseHorizontalComposableKt.PlayerCell$lambda$14(interfaceC3978p03, true);
        PlayerShowcaseHorizontalComposableKt.PlayerCell$lambda$11(interfaceC3978p04, false);
        return Unit.f71690a;
    }
}
