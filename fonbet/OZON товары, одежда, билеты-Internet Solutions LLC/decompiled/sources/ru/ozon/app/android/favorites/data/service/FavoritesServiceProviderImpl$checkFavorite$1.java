package ru.ozon.app.android.favorites.data.service;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.api.FavoriteResponse;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/api/FavoriteResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoritesServiceProviderImpl$checkFavorite$1 extends AbstractC7737t implements Function1<ActionV2Response<FavoriteResponse>, List<? extends Long>> {
    public static final FavoritesServiceProviderImpl$checkFavorite$1 INSTANCE = new FavoritesServiceProviderImpl$checkFavorite$1();

    FavoritesServiceProviderImpl$checkFavorite$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<Long> invoke(ActionV2Response<FavoriteResponse> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FavoriteResponse data = it.getData();
        if (data != null) {
            return data.getSkus();
        }
        return null;
    }
}
