package ru.ozon.app.android.favorites.applyWishlist.di;

import Pc.a;
import Ts.C4048a;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoritesUIComponentApi;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\f\u001a\u00060\bj\u0002`\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"ru/ozon/app/android/favorites/applyWishlist/di/ApplyWishlistWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/favorites/applyWishlist/di/ApplyWishlistWidgetComponent;", "LPc/a;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ApplyWishlistWidgetComponent$Companion$create$1$1 implements ApplyWishlistWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final a<CreateShoppingListViewModel> viewModelProvider;

    ApplyWishlistWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModelProvider = new C4048a(c7475g, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateShoppingListViewModel viewModelProvider$lambda$0(C7475g c7475g) {
        return new CreateShoppingListViewModel(((FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class)).getFavoritesListsInteractor(), ((FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class)).getFavoriteManager(), ((FavoritesUIComponentApi) c7475g.getComponent(FavoritesUIComponentApi.class)).getFavoritesListsEventsManager());
    }

    @Override // ru.ozon.app.android.favorites.applyWishlist.di.ApplyWishlistWidgetComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.favorites.applyWishlist.di.ApplyWishlistWidgetComponent
    public a<CreateShoppingListViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
