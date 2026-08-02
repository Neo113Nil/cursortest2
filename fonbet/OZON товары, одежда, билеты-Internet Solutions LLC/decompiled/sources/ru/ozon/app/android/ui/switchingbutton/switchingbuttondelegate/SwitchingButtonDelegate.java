package ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.atoms.v3.holders.switchingButton.SwitchingButtonView;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.ui.switchingbutton.delegates.RemoveFromFavoritesSwitchingButtonDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonAddToFavoriteActionDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonComposerActionWithRedirectDelegate;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0002X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;", "Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/BaseSwitchingButtonDelegate;", "Lru/ozon/app/android/atoms/v3/holders/switchingButton/SwitchingButtonView;", "stateStorage", "Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;", "favoriteManager", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favActionDelegate", "Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonAddToFavoriteActionDelegate;", "unFavActionDelegate", "Lru/ozon/app/android/ui/switchingbutton/delegates/RemoveFromFavoritesSwitchingButtonDelegate;", "composerActionWithRedirectDelegate", "Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonComposerActionWithRedirectDelegate;", "<init>", "(Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonAddToFavoriteActionDelegate;Lru/ozon/app/android/ui/switchingbutton/delegates/RemoveFromFavoritesSwitchingButtonDelegate;Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonComposerActionWithRedirectDelegate;)V", "atomView", "getAtomView", "()Lru/ozon/app/android/atoms/v3/holders/switchingButton/SwitchingButtonView;", "setAtomView", "(Lru/ozon/app/android/atoms/v3/holders/switchingButton/SwitchingButtonView;)V", "bind", "", "buttonAtom", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "forceChange", "", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchingButtonDelegate extends BaseSwitchingButtonDelegate<SwitchingButtonView> {
    private SwitchingButtonView atomView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchingButtonDelegate(@NotNull SwitchingButtonStateStorage stateStorage, @NotNull FavoriteManager favoriteManager, @NotNull SwitchingButtonAddToFavoriteActionDelegate favActionDelegate, @NotNull RemoveFromFavoritesSwitchingButtonDelegate unFavActionDelegate, @NotNull SwitchingButtonComposerActionWithRedirectDelegate composerActionWithRedirectDelegate) {
        super(stateStorage, favoriteManager, favActionDelegate, unFavActionDelegate, composerActionWithRedirectDelegate);
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(favActionDelegate, "favActionDelegate");
        Intrinsics.checkNotNullParameter(unFavActionDelegate, "unFavActionDelegate");
        Intrinsics.checkNotNullParameter(composerActionWithRedirectDelegate, "composerActionWithRedirectDelegate");
    }

    @Override // ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.BaseSwitchingButtonDelegate
    public void bind(SwitchingButton buttonAtom, @NotNull SwitchingButtonView atomView, boolean forceChange) {
        Intrinsics.checkNotNullParameter(atomView, "atomView");
        setAtomView(atomView);
        setAtomModel(buttonAtom);
        atomView.setButtonChanged(new SwitchingButtonDelegate$bind$1(this));
        atomView.bindOrGone(buttonAtom);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.BaseSwitchingButtonDelegate
    public SwitchingButtonView getAtomView() {
        return this.atomView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.BaseSwitchingButtonDelegate
    public void setAtomView(SwitchingButtonView switchingButtonView) {
        this.atomView = switchingButtonView;
    }
}
