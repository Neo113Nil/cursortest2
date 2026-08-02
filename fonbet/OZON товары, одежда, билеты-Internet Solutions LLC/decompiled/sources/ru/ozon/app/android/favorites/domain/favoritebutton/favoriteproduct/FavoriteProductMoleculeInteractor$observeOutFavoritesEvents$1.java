package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate.MapperKt;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate.ProductFavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/sharedfavoritestate/ProductFavoriteEvent;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;)Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/sharedfavoritestate/ProductFavoriteEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FavoriteProductMoleculeInteractor$observeOutFavoritesEvents$1 extends AbstractC7737t implements Function1<FavoriteEvent, ProductFavoriteEvent> {
    public static final FavoriteProductMoleculeInteractor$observeOutFavoritesEvents$1 INSTANCE = new FavoriteProductMoleculeInteractor$observeOutFavoritesEvents$1();

    FavoriteProductMoleculeInteractor$observeOutFavoritesEvents$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ProductFavoriteEvent invoke(FavoriteEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MapperKt.toProductFavoriteEvent(it);
    }
}
