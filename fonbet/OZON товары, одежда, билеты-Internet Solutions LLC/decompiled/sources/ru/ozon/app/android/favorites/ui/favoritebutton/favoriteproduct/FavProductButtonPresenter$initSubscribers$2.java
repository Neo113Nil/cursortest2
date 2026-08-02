package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate.ProductFavoriteEvent;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/sharedfavoritestate/ProductFavoriteEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/sharedfavoritestate/ProductFavoriteEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FavProductButtonPresenter$initSubscribers$2 extends AbstractC7737t implements Function1<ProductFavoriteEvent, Unit> {
    final /* synthetic */ FavProductButtonPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavProductButtonPresenter$initSubscribers$2(FavProductButtonPresenter favProductButtonPresenter) {
        super(1);
        this.this$0 = favProductButtonPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductFavoriteEvent productFavoriteEvent) {
        invoke2(productFavoriteEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductFavoriteEvent productFavoriteEvent) {
        WeakReference weakReference;
        FavProductButtonView favProductButtonView;
        weakReference = this.this$0.view;
        if (weakReference == null || (favProductButtonView = (FavProductButtonView) weakReference.get()) == null) {
            return;
        }
        favProductButtonView.handleMoleculeStateUpdate(productFavoriteEvent.getSku(), productFavoriteEvent instanceof ProductFavoriteEvent.AddToFavorite);
    }
}
