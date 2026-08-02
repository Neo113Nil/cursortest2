package ru.ozon.app.android.favorites.buttonStack.di;

import Pc.a;
import Vg.d;
import Vs.C4829a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoritesUIComponentApi;
import ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"ru/ozon/app/android/favorites/buttonStack/di/ButtonStackWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/favorites/buttonStack/di/ButtonStackWidgetComponent;", "LPc/a;", "Lru/ozon/app/android/favorites/ui/wishlists/DeleteWishlistViewModel;", "kotlin.jvm.PlatformType", "deleteWishlistViewModelProvider", "LPc/a;", "getDeleteWishlistViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ButtonStackWidgetComponent$Companion$create$1$1 implements ButtonStackWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final a<DeleteWishlistViewModel> deleteWishlistViewModelProvider;
    private final ComposerNavigator navigator;

    ButtonStackWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.deleteWishlistViewModelProvider = new C4829a(c7475g, 0);
        this.navigator = ((ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class)).getComposerNavigator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeleteWishlistViewModel deleteWishlistViewModelProvider$lambda$0(C7475g c7475g) {
        return new DeleteWishlistViewModel(((FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class)).getWishlistsInteractor(), ((FavoritesUIComponentApi) c7475g.getComponent(FavoritesUIComponentApi.class)).getFavoritesListsEventsManager());
    }

    @Override // ru.ozon.app.android.favorites.buttonStack.di.ButtonStackWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.favorites.buttonStack.di.ButtonStackWidgetComponent
    public a<DeleteWishlistViewModel> getDeleteWishlistViewModelProvider() {
        return this.deleteWishlistViewModelProvider;
    }

    @Override // ru.ozon.app.android.favorites.buttonStack.di.ButtonStackWidgetComponent
    public ComposerNavigator getNavigator() {
        return this.navigator;
    }
}
