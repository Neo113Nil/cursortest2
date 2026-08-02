package ru.ozon.app.android.favorites.domain.favoritemanager.eventmap;

import io.reactivex.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritemanager/eventmap/FavoriteEventMap;", "", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "event", "", "addEvent", "(Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;)V", "", "favoriteId", "Lio/reactivex/p;", "observeEvents", "(J)Lio/reactivex/p;", "", "getCurrentFavState", "(J)Ljava/lang/Boolean;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FavoriteEventMap {
    void addEvent(@NotNull FavoriteEvent event);

    Boolean getCurrentFavState(long favoriteId);

    @NotNull
    p<FavoriteEvent> observeEvents(long favoriteId);
}
