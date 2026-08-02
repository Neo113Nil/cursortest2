package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResult;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FavoriteProductMoleculeInteractor$observeFavoritesUpdates$1 extends AbstractC7737t implements Function1<FavoriteChangeResult, Boolean> {
    final /* synthetic */ long $sku;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteProductMoleculeInteractor$observeFavoritesUpdates$1(long j11) {
        super(1);
        this.$sku = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FavoriteChangeResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getSku() == this.$sku);
    }
}
