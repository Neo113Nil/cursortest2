package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal;

import S0.InterfaceC3978p0;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.data.PlayerShowcaseDTO;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "controller", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseHorizontalComposableKt$PlayerCell$startPlaying$1$1 extends AbstractC7737t implements Function1<PoolPlayerController, PoolPlayerController> {
    final /* synthetic */ PlayerShowcaseComponent $component;
    final /* synthetic */ InterfaceC3978p0<PlayerListenersContainer> $currentListener$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $showLoader$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $showPreview$delegate;
    final /* synthetic */ String $url;
    final /* synthetic */ PlayerShowcaseDTO.VideoFormat $videoFormat;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerShowcaseDTO.VideoFormat.values().length];
            try {
                iArr[PlayerShowcaseDTO.VideoFormat.MP4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerShowcaseDTO.VideoFormat.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseHorizontalComposableKt$PlayerCell$startPlaying$1$1(PlayerShowcaseDTO.VideoFormat videoFormat, PlayerShowcaseComponent playerShowcaseComponent, String str, InterfaceC3978p0<Boolean> interfaceC3978p0, InterfaceC3978p0<Boolean> interfaceC3978p02, InterfaceC3978p0<PlayerListenersContainer> interfaceC3978p03) {
        super(1);
        this.$videoFormat = videoFormat;
        this.$component = playerShowcaseComponent;
        this.$url = str;
        this.$showPreview$delegate = interfaceC3978p0;
        this.$showLoader$delegate = interfaceC3978p02;
        this.$currentListener$delegate = interfaceC3978p03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$3$lambda$2(InterfaceC3978p0 interfaceC3978p0, PlayerState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerShowcaseHorizontalComposableKt.PlayerCell$lambda$11(interfaceC3978p0, false);
    }

    @Override // kotlin.jvm.functions.Function1
    public final PoolPlayerController invoke(PoolPlayerController controller) {
        ExoManager progressiveExoManager;
        Intrinsics.checkNotNullParameter(controller, "controller");
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        final InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$showPreview$delegate;
        final InterfaceC3978p0<Boolean> interfaceC3978p02 = this.$showLoader$delegate;
        builder.onRenderedFirstFrame(new OnRenderedFirstFramePlayerControllerListener() { // from class: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal.a
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
            public final void onRenderedFirstFrame() {
                PlayerShowcaseHorizontalComposableKt.access$PlayerCell$lambda$14(InterfaceC3978p0.this, false);
            }
        });
        builder.onBuffer(new OnBufferPlayerControllerListener() { // from class: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal.b
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener
            public final void onBuffer() {
                PlayerShowcaseHorizontalComposableKt.access$PlayerCell$lambda$11(InterfaceC3978p0.this, true);
            }
        });
        builder.onReady(new OnReadyPlayerControllerListener() { // from class: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal.c
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
            public final void onReady(PlayerState playerState) {
                PlayerShowcaseHorizontalComposableKt$PlayerCell$startPlaying$1$1.invoke$lambda$3$lambda$2(InterfaceC3978p0.this, playerState);
            }
        });
        PlayerListenersContainer build = builder.build();
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.$videoFormat.ordinal()];
        if (i11 == 1) {
            progressiveExoManager = this.$component.getProgressiveExoManager();
        } else {
            if (i11 != 2) {
                throw new o();
            }
            progressiveExoManager = this.$component.getExoManagerLive();
        }
        ExoManager exoManager = progressiveExoManager;
        this.$currentListener$delegate.setValue(build);
        controller.mediaPlayController().prepareMediaToPlay(this.$url, exoManager, true, true, true, build, null, null);
        return controller;
    }
}
