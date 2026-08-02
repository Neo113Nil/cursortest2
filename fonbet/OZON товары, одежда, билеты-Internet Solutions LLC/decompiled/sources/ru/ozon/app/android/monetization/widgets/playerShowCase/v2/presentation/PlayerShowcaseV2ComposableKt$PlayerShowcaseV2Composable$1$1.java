package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import S0.M;
import S0.N;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$1$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ ExoManager $exoManager;
    final /* synthetic */ PlayerShowcaseV2VI $item;
    final /* synthetic */ SingleInstancePlayerController $playerController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$1$1(SingleInstancePlayerController singleInstancePlayerController, PlayerShowcaseV2VI playerShowcaseV2VI, ExoManager exoManager) {
        super(1);
        this.$playerController = singleInstancePlayerController;
        this.$item = playerShowcaseV2VI;
        this.$exoManager = exoManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        this.$playerController.mediaPlayController().prepareMediaToPlay(this.$item.getVideoUrl(), this.$exoManager, true, true, false, new PlayerListenersContainer.Builder().build(), null, null);
        final SingleInstancePlayerController singleInstancePlayerController = this.$playerController;
        return new M() { // from class: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$1$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                SingleInstancePlayerController.this.mediaPlayController().release(PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$1$1$1$1.INSTANCE);
            }
        };
    }
}
