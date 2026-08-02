package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di;

import Jb.d;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.FavoriteEntityApi;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.FavoriteStateStore;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponent;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes6.dex */
public final class DaggerFavoritesDataComponent {

    private static final class Factory implements FavoritesDataComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponent.Factory
        public FavoritesDataComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new FavoritesDataComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class FavoritesDataComponentImpl implements FavoritesDataComponent {
        private a<FavoriteEventManager> favoriteEventManagerProvider;
        private a<FavoriteStateStore> favoriteStateStoreProvider;
        private final FavoritesDataComponentImpl favoritesDataComponentImpl;
        private final NetworkComponentApi networkComponentApi;
        private a<FavoriteEntityApi> provideFavoriteEntityApiProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final FavoritesDataComponentImpl favoritesDataComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92540id;

            SwitchingProvider(FavoritesDataComponentImpl favoritesDataComponentImpl, int i11) {
                this.favoritesDataComponentImpl = favoritesDataComponentImpl;
                this.f92540id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92540id;
                if (i11 == 0) {
                    return (T) new FavoriteStateStore();
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        return (T) new FavoriteEventManager();
                    }
                    throw new AssertionError(this.f92540id);
                }
                Retrofit retrofit = this.favoritesDataComponentImpl.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return (T) FavoritesDataModule_Companion_ProvideFavoriteEntityApiFactory.provideFavoriteEntityApi(retrofit);
            }
        }

        /* synthetic */ FavoritesDataComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi) {
            this.favoriteStateStoreProvider = d.b(new SwitchingProvider(this.favoritesDataComponentImpl, 0));
            this.provideFavoriteEntityApiProvider = d.b(new SwitchingProvider(this.favoritesDataComponentImpl, 1));
            this.favoriteEventManagerProvider = d.b(new SwitchingProvider(this.favoritesDataComponentImpl, 2));
        }

        @Override // ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi
        public FavoriteEntityInteractor getFavoriteEntityInteractor() {
            return new FavoriteEntityInteractor(this.favoriteStateStoreProvider.get(), this.provideFavoriteEntityApiProvider.get(), this.favoriteEventManagerProvider.get());
        }

        @Override // ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi
        public FavoriteStateStore getFavoriteStateStore() {
            return this.favoriteStateStoreProvider.get();
        }

        private FavoritesDataComponentImpl(NetworkComponentApi networkComponentApi) {
            this.favoritesDataComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            initialize(networkComponentApi);
        }
    }

    public static FavoritesDataComponent.Factory factory() {
        return new Factory(0);
    }
}
