package ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.ui.switchingbutton.delegates.RemoveFromFavoritesSwitchingButtonDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonAddToFavoriteActionDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonComposerActionWithRedirectDelegate;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;

/* loaded from: classes2.dex */
public final class SwitchingButtonSingleAtomDelegate_Factory implements e<SwitchingButtonSingleAtomDelegate> {
    private final a<SwitchingButtonComposerActionWithRedirectDelegate> composerActionWithRedirectDelegateProvider;
    private final a<SwitchingButtonAddToFavoriteActionDelegate> favActionDelegateProvider;
    private final a<FavoriteManager> favoriteManagerProvider;
    private final a<SwitchingButtonStateStorage> stateStorageProvider;
    private final a<RemoveFromFavoritesSwitchingButtonDelegate> unFavActionDelegateProvider;

    public SwitchingButtonSingleAtomDelegate_Factory(a<SwitchingButtonStateStorage> aVar, a<FavoriteManager> aVar2, a<SwitchingButtonAddToFavoriteActionDelegate> aVar3, a<RemoveFromFavoritesSwitchingButtonDelegate> aVar4, a<SwitchingButtonComposerActionWithRedirectDelegate> aVar5) {
        this.stateStorageProvider = aVar;
        this.favoriteManagerProvider = aVar2;
        this.favActionDelegateProvider = aVar3;
        this.unFavActionDelegateProvider = aVar4;
        this.composerActionWithRedirectDelegateProvider = aVar5;
    }

    public static SwitchingButtonSingleAtomDelegate_Factory create(a<SwitchingButtonStateStorage> aVar, a<FavoriteManager> aVar2, a<SwitchingButtonAddToFavoriteActionDelegate> aVar3, a<RemoveFromFavoritesSwitchingButtonDelegate> aVar4, a<SwitchingButtonComposerActionWithRedirectDelegate> aVar5) {
        return new SwitchingButtonSingleAtomDelegate_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static SwitchingButtonSingleAtomDelegate newInstance(SwitchingButtonStateStorage switchingButtonStateStorage, FavoriteManager favoriteManager, SwitchingButtonAddToFavoriteActionDelegate switchingButtonAddToFavoriteActionDelegate, RemoveFromFavoritesSwitchingButtonDelegate removeFromFavoritesSwitchingButtonDelegate, SwitchingButtonComposerActionWithRedirectDelegate switchingButtonComposerActionWithRedirectDelegate) {
        return new SwitchingButtonSingleAtomDelegate(switchingButtonStateStorage, favoriteManager, switchingButtonAddToFavoriteActionDelegate, removeFromFavoritesSwitchingButtonDelegate, switchingButtonComposerActionWithRedirectDelegate);
    }

    @Override // Pc.a
    public SwitchingButtonSingleAtomDelegate get() {
        return newInstance(this.stateStorageProvider.get(), this.favoriteManagerProvider.get(), this.favActionDelegateProvider.get(), this.unFavActionDelegateProvider.get(), this.composerActionWithRedirectDelegateProvider.get());
    }
}
