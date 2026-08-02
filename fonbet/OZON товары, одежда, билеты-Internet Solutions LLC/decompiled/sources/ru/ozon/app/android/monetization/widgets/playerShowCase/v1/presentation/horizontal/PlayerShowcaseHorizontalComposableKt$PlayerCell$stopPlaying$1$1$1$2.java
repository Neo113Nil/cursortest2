package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseHorizontalComposableKt$PlayerCell$stopPlaying$1$1$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ InterfaceC3978p0<PlayerListenersContainer> $currentListener$delegate;
    final /* synthetic */ InterfaceC3978p0<PoolPlayerController> $playerController$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseHorizontalComposableKt$PlayerCell$stopPlaying$1$1$1$2(InterfaceC3978p0<PoolPlayerController> interfaceC3978p0, InterfaceC3978p0<PlayerListenersContainer> interfaceC3978p02) {
        super(0);
        this.$playerController$delegate = interfaceC3978p0;
        this.$currentListener$delegate = interfaceC3978p02;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$playerController$delegate.setValue(null);
        this.$currentListener$delegate.setValue(null);
    }
}
