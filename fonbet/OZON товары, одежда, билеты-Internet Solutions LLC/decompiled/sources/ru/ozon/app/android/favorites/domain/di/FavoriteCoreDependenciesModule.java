package ru.ozon.app.android.favorites.domain.di;

import Ve.C4598rp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.favorites.data.api.FavoriteApi;
import ru.ozon.app.android.favorites.data.shoppinglists.FavoritesListsApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/favorites/domain/di/FavoriteCoreDependenciesModule;", "", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FavoriteCoreDependenciesModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/favorites/domain/di/FavoriteCoreDependenciesModule$Companion;", "", "<init>", "()V", "provideFavoritesListsApi", "Lru/ozon/app/android/favorites/data/shoppinglists/FavoritesListsApi;", "retrofit", "Lretrofit2/Retrofit;", "provideFavoriteApi", "Lru/ozon/app/android/favorites/data/api/FavoriteApi;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final FavoriteApi provideFavoriteApi(@NotNull Retrofit retrofit) {
            return (FavoriteApi) C4598rp.b(retrofit, "retrofit", FavoriteApi.class, "create(...)");
        }

        @NotNull
        public final FavoritesListsApi provideFavoritesListsApi(@NotNull Retrofit retrofit) {
            return (FavoritesListsApi) C4598rp.b(retrofit, "retrofit", FavoritesListsApi.class, "create(...)");
        }
    }
}
