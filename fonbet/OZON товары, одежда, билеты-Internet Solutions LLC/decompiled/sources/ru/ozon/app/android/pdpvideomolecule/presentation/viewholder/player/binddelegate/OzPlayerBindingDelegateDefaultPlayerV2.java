package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegate;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\f\u0010\u0013\u001a\u00020\u000e*\u00020\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegateDefaultPlayerV2;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegateDefault;", "<init>", "()V", "videoMoleculeView", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "playerController", "getPlayerController", "()Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "setPlayerController", "(Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;)V", "bind", "", "playInfo", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/PlayInfo;", "factory", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegate$PlayerFactory;", "unbindPlayer", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OzPlayerBindingDelegateDefaultPlayerV2 extends OzPlayerBindingDelegateDefault {
    private BasePlayerController playerController;
    private VideoMoleculeApi videoMoleculeView;

    private final void unbindPlayer(BasePlayerController basePlayerController) {
        VideoMoleculeApi videoMoleculeApi = this.videoMoleculeView;
        if (videoMoleculeApi != null) {
            videoMoleculeApi.getPlayerControllerView().A(null);
            basePlayerController.playerViewController().unbindPlayerView(videoMoleculeApi.getPlayerView());
        }
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegateDefault, ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegate
    public void bind(@NotNull VideoMoleculeApi videoMoleculeView, @NotNull PlayInfo playInfo, @NotNull OzPlayerBindingDelegate.PlayerFactory factory) {
        Intrinsics.checkNotNullParameter(videoMoleculeView, "videoMoleculeView");
        Intrinsics.checkNotNullParameter(playInfo, "playInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.videoMoleculeView = videoMoleculeView;
        super.bind(videoMoleculeView, playInfo, factory);
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegateDefault, ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegate
    public BasePlayerController getPlayerController() {
        return this.playerController;
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegateDefault, ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegate
    public void setPlayerController(BasePlayerController basePlayerController) {
        BasePlayerController basePlayerController2;
        if (basePlayerController == null && (basePlayerController2 = this.playerController) != null) {
            unbindPlayer(basePlayerController2);
        }
        this.playerController = basePlayerController;
    }
}
