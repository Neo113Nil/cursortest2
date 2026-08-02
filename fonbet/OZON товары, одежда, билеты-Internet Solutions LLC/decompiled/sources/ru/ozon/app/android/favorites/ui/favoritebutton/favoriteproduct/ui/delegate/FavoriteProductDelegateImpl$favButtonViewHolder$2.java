package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteButtonViewHolder;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteButtonViewHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FavoriteProductDelegateImpl$favButtonViewHolder$2 extends AbstractC7737t implements Function0<ProductFavoriteButtonViewHolder> {
    final /* synthetic */ FavoriteProductDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteProductDelegateImpl$favButtonViewHolder$2(FavoriteProductDelegateImpl favoriteProductDelegateImpl) {
        super(0);
        this.this$0 = favoriteProductDelegateImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProductFavoriteButtonViewHolder invoke() {
        AdultHandler adultHandler;
        ComposerReferences composerReferences;
        AppType appType;
        adultHandler = this.this$0.adultHandler;
        composerReferences = this.this$0.composerReferences;
        appType = this.this$0.appType;
        return new ProductFavoriteButtonViewHolder(adultHandler, composerReferences, appType);
    }
}
