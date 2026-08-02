package ru.ozon.app.android.favorites.domain.favorite;

import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "", "", "productId", "Lio/reactivex/b;", "addToFavorite", "(J)Lio/reactivex/b;", "Lio/reactivex/p;", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "favoriteChangeEvents", "()Lio/reactivex/p;", "Lio/reactivex/y;", "", "isFavorite", "(J)Lio/reactivex/y;", "addOrRemoveFavorite", "(JZ)Lio/reactivex/b;", "sku", "", "shareFavoriteState", "(JZ)V", "checkAndAddToFavorite", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FavoriteInteractor {
    @NotNull
    AbstractC7094b addOrRemoveFavorite(long productId, boolean isFavorite);

    @NotNull
    AbstractC7094b addToFavorite(long productId);

    @NotNull
    AbstractC7094b checkAndAddToFavorite(long productId);

    @NotNull
    p<FavoriteEvent> favoriteChangeEvents();

    @NotNull
    y<Boolean> isFavorite(long productId);

    void shareFavoriteState(long sku, boolean isFavorite);
}
