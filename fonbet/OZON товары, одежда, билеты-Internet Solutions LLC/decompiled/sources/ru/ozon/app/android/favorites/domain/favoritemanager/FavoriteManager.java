package ru.ozon.app.android.favorites.domain.favoritemanager;

import Ae.InterfaceC2395h;
import Sc.InterfaceC3999a;
import io.reactivex.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "", "", "favoriteId", "", "changeSourceId", "", "addFavorite", "(JLjava/lang/Integer;)V", "removeFromFavorites", "Lio/reactivex/p;", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "onFavoriteChange", "()Lio/reactivex/p;", "LAe/h;", "onFavoriteChangeFlow", "()LAe/h;", "(J)Lio/reactivex/p;", "", "getCurrentFavState", "(J)Ljava/lang/Boolean;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FavoriteManager {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void addFavorite$default(FavoriteManager favoriteManager, long j11, Integer num, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFavorite");
            }
            if ((i11 & 2) != 0) {
                num = null;
            }
            favoriteManager.addFavorite(j11, num);
        }

        public static /* synthetic */ void removeFromFavorites$default(FavoriteManager favoriteManager, long j11, Integer num, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeFromFavorites");
            }
            if ((i11 & 2) != 0) {
                num = null;
            }
            favoriteManager.removeFromFavorites(j11, num);
        }
    }

    void addFavorite(long favoriteId, Integer changeSourceId);

    Boolean getCurrentFavState(long favoriteId);

    @InterfaceC3999a
    @NotNull
    p<FavoriteEvent> onFavoriteChange();

    @NotNull
    p<FavoriteEvent> onFavoriteChange(long favoriteId);

    @NotNull
    InterfaceC2395h<FavoriteEvent> onFavoriteChangeFlow();

    void removeFromFavorites(long favoriteId, Integer changeSourceId);
}
