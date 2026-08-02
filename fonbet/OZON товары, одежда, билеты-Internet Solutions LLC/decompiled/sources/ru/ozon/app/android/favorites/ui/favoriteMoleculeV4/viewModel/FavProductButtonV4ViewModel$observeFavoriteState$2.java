package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel;

import Ae.x0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate.ProductFavoriteEvent;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavMoleculeUIState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/sharedfavoritestate/ProductFavoriteEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavProductButtonV4ViewModel$observeFavoriteState$2", f = "FavProductButtonV4ViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavProductButtonV4ViewModel$observeFavoriteState$2 extends j implements Function2<ProductFavoriteEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavProductButtonV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavProductButtonV4ViewModel$observeFavoriteState$2(FavProductButtonV4ViewModel favProductButtonV4ViewModel, d<? super FavProductButtonV4ViewModel$observeFavoriteState$2> dVar) {
        super(2, dVar);
        this.this$0 = favProductButtonV4ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FavProductButtonV4ViewModel$observeFavoriteState$2 favProductButtonV4ViewModel$observeFavoriteState$2 = new FavProductButtonV4ViewModel$observeFavoriteState$2(this.this$0, dVar);
        favProductButtonV4ViewModel$observeFavoriteState$2.L$0 = obj;
        return favProductButtonV4ViewModel$observeFavoriteState$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r5.this$0.model;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FavoriteProductModel favoriteProductModel;
        FavoriteProductModel favoriteProductModel2;
        FavoriteProductModel favoriteProductModel3;
        x0 x0Var;
        FavoriteProductModel favoriteProductModel4;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ProductFavoriteEvent productFavoriteEvent = (ProductFavoriteEvent) this.L$0;
        boolean z11 = productFavoriteEvent instanceof ProductFavoriteEvent.AddToFavorite;
        favoriteProductModel = this.this$0.model;
        if ((favoriteProductModel == null || favoriteProductModel.getIsFavorite() != z11) && favoriteProductModel2 != null && favoriteProductModel2.getSku() == productFavoriteEvent.getSku()) {
            favoriteProductModel3 = this.this$0.model;
            if (favoriteProductModel3 != null) {
                favoriteProductModel3.setFavorite(z11);
            }
            x0Var = this.this$0._favState;
            favoriteProductModel4 = this.this$0.model;
            x0Var.setValue(new FavMoleculeUIState.Success(favoriteProductModel4));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProductFavoriteEvent productFavoriteEvent, d<? super Unit> dVar) {
        return ((FavProductButtonV4ViewModel$observeFavoriteState$2) create(productFavoriteEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
