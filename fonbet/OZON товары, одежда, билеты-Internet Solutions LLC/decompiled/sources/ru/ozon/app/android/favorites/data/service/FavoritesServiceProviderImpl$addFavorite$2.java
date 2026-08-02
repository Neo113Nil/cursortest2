package ru.ozon.app.android.favorites.data.service;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.api.ChangeFavoriteStateResponse;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FavoritesServiceProviderImpl$addFavorite$2 extends C7735q implements Function1<ChangeFavoriteStateResponse, ChangeFavoriteAnalyticsData> {
    FavoritesServiceProviderImpl$addFavorite$2(Object obj) {
        super(1, obj, FavoritesServiceProviderImpl.class, "toChangeFavoriteStateResult", "toChangeFavoriteStateResult(Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse;)Lru/ozon/app/android/favorites/data/service/ChangeFavoriteAnalyticsData;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChangeFavoriteAnalyticsData invoke(ChangeFavoriteStateResponse p02) {
        ChangeFavoriteAnalyticsData changeFavoriteStateResult;
        Intrinsics.checkNotNullParameter(p02, "p0");
        changeFavoriteStateResult = ((FavoritesServiceProviderImpl) this.receiver).toChangeFavoriteStateResult(p02);
        return changeFavoriteStateResult;
    }
}
