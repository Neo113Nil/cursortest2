package ru.ozon.app.android.favorites.data.service;

import io.reactivex.y;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;", "", "", "id", "Lio/reactivex/y;", "Lru/ozon/app/android/favorites/data/service/ChangeFavoriteAnalyticsData;", "addFavorite", "(J)Lio/reactivex/y;", "removeFromFavorites", "", "checkFavorite", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FavoritesServiceProvider {
    @NotNull
    y<ChangeFavoriteAnalyticsData> addFavorite(long id2);

    @NotNull
    y<List<Long>> checkFavorite(long id2);

    @NotNull
    y<ChangeFavoriteAnalyticsData> removeFromFavorites(long id2);
}
