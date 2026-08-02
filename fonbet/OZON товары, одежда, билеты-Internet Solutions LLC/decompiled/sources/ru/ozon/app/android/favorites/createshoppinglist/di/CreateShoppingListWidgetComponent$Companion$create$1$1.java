package ru.ozon.app.android.favorites.createshoppinglist.di;

import Pc.a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.favorites.createshoppinglist.di.CreateShoppingListWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSaveButtonMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSuggestItemMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSuggestTitleMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListTitleMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoritesUIComponentApi;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/favorites/createshoppinglist/di/CreateShoppingListWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/favorites/createshoppinglist/di/CreateShoppingListWidgetComponent;", "LPc/a;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListTitleMapper;", "getCreateShoppingListTitleMapper", "()Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListTitleMapper;", "createShoppingListTitleMapper", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSaveButtonMapper;", "getCreateShoppingListSaveButtonMapper", "()Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSaveButtonMapper;", "createShoppingListSaveButtonMapper", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSuggestTitleMapper;", "getCreateShoppingListSuggestTitleMapper", "()Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSuggestTitleMapper;", "createShoppingListSuggestTitleMapper", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSuggestItemMapper;", "getCreateShoppingListSuggestItemMapper", "()Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSuggestItemMapper;", "createShoppingListSuggestItemMapper", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateShoppingListWidgetComponent$Companion$create$1$1 implements CreateShoppingListWidgetComponent {
    private final a<CreateShoppingListViewModel> viewModelProvider;

    CreateShoppingListWidgetComponent$Companion$create$1$1(final C7475g c7475g) {
        this.viewModelProvider = new a() { // from class: Ys.a
            @Override // Pc.a
            public final Object get() {
                CreateShoppingListViewModel viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = CreateShoppingListWidgetComponent$Companion$create$1$1.viewModelProvider$lambda$0(C7475g.this);
                return viewModelProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateShoppingListViewModel viewModelProvider$lambda$0(C7475g c7475g) {
        return new CreateShoppingListViewModel(((FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class)).getFavoritesListsInteractor(), ((FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class)).getFavoriteManager(), ((FavoritesUIComponentApi) c7475g.getComponent(FavoritesUIComponentApi.class)).getFavoritesListsEventsManager());
    }

    @Override // ru.ozon.app.android.favorites.createshoppinglist.di.CreateShoppingListWidgetComponent
    public CreateShoppingListSaveButtonMapper getCreateShoppingListSaveButtonMapper() {
        return new CreateShoppingListSaveButtonMapper();
    }

    @Override // ru.ozon.app.android.favorites.createshoppinglist.di.CreateShoppingListWidgetComponent
    public CreateShoppingListSuggestItemMapper getCreateShoppingListSuggestItemMapper() {
        return new CreateShoppingListSuggestItemMapper();
    }

    @Override // ru.ozon.app.android.favorites.createshoppinglist.di.CreateShoppingListWidgetComponent
    public CreateShoppingListSuggestTitleMapper getCreateShoppingListSuggestTitleMapper() {
        return new CreateShoppingListSuggestTitleMapper();
    }

    @Override // ru.ozon.app.android.favorites.createshoppinglist.di.CreateShoppingListWidgetComponent
    public CreateShoppingListTitleMapper getCreateShoppingListTitleMapper() {
        return new CreateShoppingListTitleMapper();
    }

    @Override // ru.ozon.app.android.favorites.createshoppinglist.di.CreateShoppingListWidgetComponent
    public a<CreateShoppingListViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
