package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate.ProductFavoriteEvent;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/sharedfavoritestate/ProductFavoriteEvent;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/sharedfavoritestate/ProductFavoriteEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FavProductButtonPresenter$initSubscribers$1 extends AbstractC7737t implements Function1<ProductFavoriteEvent, Boolean> {
    final /* synthetic */ FavProductButtonPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavProductButtonPresenter$initSubscribers$1(FavProductButtonPresenter favProductButtonPresenter) {
        super(1);
        this.this$0 = favProductButtonPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ProductFavoriteEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Integer changeSourceId = it.getChangeSourceId();
        return Boolean.valueOf(changeSourceId == null || changeSourceId.intValue() != this.this$0.hashCode());
    }
}
