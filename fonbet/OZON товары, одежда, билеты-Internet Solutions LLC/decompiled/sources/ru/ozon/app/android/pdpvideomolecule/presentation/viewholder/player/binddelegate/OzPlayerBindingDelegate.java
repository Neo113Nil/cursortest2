package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0013J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegate;", "", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "getPlayerController", "()Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "setPlayerController", "(Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;)V", "bind", "", "videoMoleculeView", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "playInfo", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/PlayInfo;", "factory", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegate$PlayerFactory;", "rebindAndRetry", "nonRebindAction", "Lkotlin/Function0;", "PlayerFactory", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface OzPlayerBindingDelegate {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegate$PlayerFactory;", "", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PlayerFactory {
    }

    void bind(@NotNull VideoMoleculeApi videoMoleculeView, @NotNull PlayInfo playInfo, @NotNull PlayerFactory factory);

    BasePlayerController getPlayerController();

    void rebindAndRetry(@NotNull Function0<Unit> nonRebindAction);

    void setPlayerController(BasePlayerController basePlayerController);
}
