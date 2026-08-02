package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteButtonV4ViewHolder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteButtonV4ViewHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteProductV4DelegateImpl$favButtonViewHolder$2 extends AbstractC7737t implements Function0<ProductFavoriteButtonV4ViewHolder> {
    final /* synthetic */ FavoriteProductV4DelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteProductV4DelegateImpl$favButtonViewHolder$2(FavoriteProductV4DelegateImpl favoriteProductV4DelegateImpl) {
        super(0);
        this.this$0 = favoriteProductV4DelegateImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProductFavoriteButtonV4ViewHolder invoke() {
        AdultHandler adultHandler;
        ComposerReferences composerReferences;
        adultHandler = this.this$0.adultHandler;
        composerReferences = this.this$0.composerReferences;
        return new ProductFavoriteButtonV4ViewHolder(adultHandler, composerReferences);
    }
}
