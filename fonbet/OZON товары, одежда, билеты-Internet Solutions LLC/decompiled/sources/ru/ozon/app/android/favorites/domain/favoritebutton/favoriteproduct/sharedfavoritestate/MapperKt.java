package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate.ProductFavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteRemove;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toProductFavoriteEvent", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/sharedfavoritestate/ProductFavoriteEvent;", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapperKt {
    @NotNull
    public static final ProductFavoriteEvent toProductFavoriteEvent(@NotNull FavoriteEvent favoriteEvent) {
        Intrinsics.checkNotNullParameter(favoriteEvent, "<this>");
        if (favoriteEvent instanceof FavoriteAdd) {
            FavoriteAdd favoriteAdd = (FavoriteAdd) favoriteEvent;
            return new ProductFavoriteEvent.AddToFavorite(favoriteAdd.getSku(), favoriteAdd.getChangeSourceId());
        }
        if (!(favoriteEvent instanceof FavoriteRemove)) {
            throw new o();
        }
        FavoriteRemove favoriteRemove = (FavoriteRemove) favoriteEvent;
        return new ProductFavoriteEvent.RemoveFromFavorite(favoriteRemove.getSku(), favoriteRemove.getChangeSourceId());
    }
}
