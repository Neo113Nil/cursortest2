package ru.ozon.app.android.videomoleculecompose.interaction;

import S0.InterfaceC3972m0;
import S0.M;
import S0.N;
import j3.C7275q;
import j3.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class VideoMoleculeMediaResetKt$rememberVideoMoleculeMediaResetVersion$1$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ BasePlayerController $playerController;
    final /* synthetic */ InterfaceC3972m0 $resetVersion$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoMoleculeMediaResetKt$rememberVideoMoleculeMediaResetVersion$1$1(BasePlayerController basePlayerController, InterfaceC3972m0 interfaceC3972m0) {
        super(1);
        this.$playerController = basePlayerController;
        this.$resetVersion$delegate = interfaceC3972m0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [j3.y$c, ru.ozon.app.android.videomoleculecompose.interaction.VideoMoleculeMediaResetKt$rememberVideoMoleculeMediaResetVersion$1$1$listener$1] */
    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final InterfaceC3972m0 interfaceC3972m0 = this.$resetVersion$delegate;
        final ?? r32 = new y.c() { // from class: ru.ozon.app.android.videomoleculecompose.interaction.VideoMoleculeMediaResetKt$rememberVideoMoleculeMediaResetVersion$1$1$listener$1
            @Override // j3.y.c
            public void onMediaItemTransition(C7275q mediaItem, int reason) {
                int intValue;
                if (reason != 0) {
                    intValue = InterfaceC3972m0.this.getIntValue();
                    InterfaceC3972m0.this.d(intValue + 1);
                }
            }
        };
        final BasePlayerListenersController listenersController = this.$playerController.listenersController();
        listenersController.addCommonExoplayerListener(r32);
        return new M() { // from class: ru.ozon.app.android.videomoleculecompose.interaction.VideoMoleculeMediaResetKt$rememberVideoMoleculeMediaResetVersion$1$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                BasePlayerListenersController.this.removeCommonExoplayerListener(r32);
            }
        };
    }
}
