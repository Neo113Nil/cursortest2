package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import Sc.o;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolMediaPlayController;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "<unused var>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2PlayerBinder$renderPlayerState$1 extends AbstractC7737t implements Function2<AsyncFrameLayout, View, Unit> {
    final /* synthetic */ AdvBannerVideoV2VO $item;
    final /* synthetic */ AdvVideoBannerV2ViewModelNew.State $state;
    final /* synthetic */ AdvVideoBannerV2PlayerBinder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvVideoBannerV2ViewModelNew.PlayerState.values().length];
            try {
                iArr[AdvVideoBannerV2ViewModelNew.PlayerState.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvVideoBannerV2ViewModelNew.PlayerState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvVideoBannerV2ViewModelNew.PlayerState.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvVideoBannerV2ViewModelNew.PlayerState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2PlayerBinder$renderPlayerState$1(AdvVideoBannerV2ViewModelNew.State state, AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder, AdvBannerVideoV2VO advBannerVideoV2VO) {
        super(2);
        this.$state = state;
        this.this$0 = advVideoBannerV2PlayerBinder;
        this.$item = advBannerVideoV2VO;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AsyncFrameLayout asyncFrameLayout, View view) {
        invoke2(asyncFrameLayout, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AsyncFrameLayout invokeWhenInflated, View view) {
        PoolPlayerController poolPlayerController;
        PoolMediaPlayController mediaPlayController;
        PoolPlayerController poolPlayerController2;
        AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew;
        BasePlayerSoundController soundController;
        Intrinsics.checkNotNullParameter(invokeWhenInflated, "$this$invokeWhenInflated");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.$state.getPlayerState().ordinal()];
        if (i11 == 1) {
            poolPlayerController = this.this$0.playerController;
            if (poolPlayerController == null || (mediaPlayController = poolPlayerController.mediaPlayController()) == null || !mediaPlayController.isReadyToPlayAndPaused()) {
                this.this$0.playVideo(this.$item, this.$state.getVolumeOn());
            } else {
                this.this$0.resumePlayerIfNeeded();
            }
        } else if (i11 == 2) {
            this.this$0.pausePlayer(this.$item, this.$state.getWasFinished());
        } else if (i11 == 3) {
            this.this$0.stopPlayer();
            this.this$0.showPreview(this.$item);
        } else if (i11 != 4) {
            throw new o();
        }
        this.this$0.setVolumeIcon(this.$state.getVolumeOn());
        poolPlayerController2 = this.this$0.playerController;
        if (poolPlayerController2 != null && (soundController = poolPlayerController2.soundController()) != null) {
            soundController.setVolume(this.$state.getVolumeOn() ? this.$item.getInitialVolume() : 0.0f);
        }
        this.this$0.getVoId();
        AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder = this.this$0;
        AdvBannerVideoV2VO advBannerVideoV2VO = this.$item;
        advVideoBannerV2ViewModelNew = advVideoBannerV2PlayerBinder.viewModel;
        advVideoBannerV2ViewModelNew.blockSoundEventSending(advBannerVideoV2VO.getId(), true);
        this.this$0.renderProductState(this.$item, this.$state.getProductState());
    }
}
