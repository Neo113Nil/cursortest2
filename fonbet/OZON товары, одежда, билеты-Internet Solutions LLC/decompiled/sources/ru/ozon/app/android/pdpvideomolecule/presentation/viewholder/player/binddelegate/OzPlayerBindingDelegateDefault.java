package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegate;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegate;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import sF.C9638a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegateDefault;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegate;", "<init>", "()V", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "getPlayerController", "()Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "setPlayerController", "(Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;)V", "bind", "", "videoMoleculeView", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "playInfo", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/PlayInfo;", "factory", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegate$PlayerFactory;", "rebindAndRetry", "nonRebindAction", "Lkotlin/Function0;", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public class OzPlayerBindingDelegateDefault implements OzPlayerBindingDelegate {
    private BasePlayerController playerController;

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegate
    public void bind(@NotNull VideoMoleculeApi videoMoleculeView, @NotNull PlayInfo playInfo, @NotNull OzPlayerBindingDelegate.PlayerFactory factory) {
        BasePlayerViewController playerViewController;
        BasePlayerController bind$lambda$0;
        Intrinsics.checkNotNullParameter(videoMoleculeView, "videoMoleculeView");
        Intrinsics.checkNotNullParameter(playInfo, "playInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        if (getPlayerController() == null) {
            C9638a c9638a = (C9638a) factory;
            bind$lambda$0 = VideoMoleculePlayerDelegate.bind$lambda$0(c9638a.f98401a, c9638a.f98402b, c9638a.f98403c, c9638a.f98404d);
            setPlayerController(bind$lambda$0);
        }
        BasePlayerController playerController = getPlayerController();
        if (playerController != null && (playerViewController = playerController.playerViewController()) != null) {
            BasePlayerViewController.DefaultImpls.bindPlayerView$default(playerViewController, videoMoleculeView.getPlayerView(), null, 2, null);
        }
        videoMoleculeView.getPlayerControllerView().A(videoMoleculeView.getPlayerView().s());
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegate
    public BasePlayerController getPlayerController() {
        return this.playerController;
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegate
    public void rebindAndRetry(@NotNull Function0<Unit> nonRebindAction) {
        Intrinsics.checkNotNullParameter(nonRebindAction, "nonRebindAction");
        nonRebindAction.invoke();
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegate
    public void setPlayerController(BasePlayerController basePlayerController) {
        this.playerController = basePlayerController;
    }
}
