package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical;

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
final class PlayerShowcaseVerticalComposableKt$PlayerCell$stopPlaying$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ PlayerShowcaseComponent $component;
    final /* synthetic */ InterfaceC3978p0<PlayerListenersContainer> $currentListener$delegate;
    final /* synthetic */ InterfaceC3978p0<PoolPlayerController> $playerController$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $showLoader$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $showPreview$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseVerticalComposableKt$PlayerCell$stopPlaying$1$1(InterfaceC3978p0<PoolPlayerController> interfaceC3978p0, PlayerShowcaseComponent playerShowcaseComponent, InterfaceC3978p0<PlayerListenersContainer> interfaceC3978p02, InterfaceC3978p0<Boolean> interfaceC3978p03, InterfaceC3978p0<Boolean> interfaceC3978p04) {
        super(0);
        this.$playerController$delegate = interfaceC3978p0;
        this.$component = playerShowcaseComponent;
        this.$currentListener$delegate = interfaceC3978p02;
        this.$showPreview$delegate = interfaceC3978p03;
        this.$showLoader$delegate = interfaceC3978p04;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PoolPlayerController PlayerCell$lambda$6;
        PlayerListenersContainer PlayerCell$lambda$9;
        PlayerCell$lambda$6 = PlayerShowcaseVerticalComposableKt.PlayerCell$lambda$6(this.$playerController$delegate);
        if (PlayerCell$lambda$6 == null) {
            return null;
        }
        PlayerShowcaseComponent playerShowcaseComponent = this.$component;
        InterfaceC3978p0<PlayerListenersContainer> interfaceC3978p0 = this.$currentListener$delegate;
        InterfaceC3978p0<PoolPlayerController> interfaceC3978p02 = this.$playerController$delegate;
        InterfaceC3978p0<Boolean> interfaceC3978p03 = this.$showPreview$delegate;
        InterfaceC3978p0<Boolean> interfaceC3978p04 = this.$showLoader$delegate;
        PlayerCell$lambda$9 = PlayerShowcaseVerticalComposableKt.PlayerCell$lambda$9(interfaceC3978p0);
        if (PlayerCell$lambda$9 != null) {
            PlayerCell$lambda$6.listenersController().removePlayerListener(PlayerCell$lambda$9);
        }
        PlayerCell$lambda$6.mediaPlayController().stopAndReturnToFreePool(new PlayerShowcaseVerticalComposableKt$PlayerCell$stopPlaying$1$1$1$2(interfaceC3978p02, interfaceC3978p0));
        playerShowcaseComponent.getPoolCapacityManager().onPlayerStopped();
        PlayerShowcaseVerticalComposableKt.PlayerCell$lambda$16(interfaceC3978p03, true);
        PlayerShowcaseVerticalComposableKt.PlayerCell$lambda$13(interfaceC3978p04, false);
        return Unit.f71690a;
    }
}
