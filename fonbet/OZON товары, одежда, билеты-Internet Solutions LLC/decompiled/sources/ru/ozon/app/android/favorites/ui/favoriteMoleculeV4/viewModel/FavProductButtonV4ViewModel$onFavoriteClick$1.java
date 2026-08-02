package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel;

import Sc.s;
import WZ.l;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavProductButtonV4ViewModel$onFavoriteClick$1", f = "FavProductButtonV4ViewModel.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavProductButtonV4ViewModel$onFavoriteClick$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ FavoriteProductModel $molecule;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavProductButtonV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavProductButtonV4ViewModel$onFavoriteClick$1(FavProductButtonV4ViewModel favProductButtonV4ViewModel, FavoriteProductModel favoriteProductModel, d<? super FavProductButtonV4ViewModel$onFavoriteClick$1> dVar) {
        super(2, dVar);
        this.this$0 = favProductButtonV4ViewModel;
        this.$molecule = favoriteProductModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FavProductButtonV4ViewModel$onFavoriteClick$1 favProductButtonV4ViewModel$onFavoriteClick$1 = new FavProductButtonV4ViewModel$onFavoriteClick$1(this.this$0, this.$molecule, dVar);
        favProductButtonV4ViewModel$onFavoriteClick$1.L$0 = obj;
        return favProductButtonV4ViewModel$onFavoriteClick$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FavoriteProductMoleculeV4Interactor favoriteProductMoleculeV4Interactor;
        l lVar;
        AnalyticData analyticData;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            favoriteProductMoleculeV4Interactor = this.this$0.favoriteProductInteractor;
            FavoriteProductModel copy$default = FavoriteProductModel.copy$default(this.$molecule, 0L, false, null, null, null, new Integer(m11.hashCode()), 31, null);
            lVar = this.this$0.tokenizedAnalytics;
            analyticData = this.this$0.analyticData;
            this.label = 1;
            if (favoriteProductMoleculeV4Interactor.addFavoriteChangeRequest(copy$default, lVar, analyticData, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FavProductButtonV4ViewModel$onFavoriteClick$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
