package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel;

import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.v4.FavoriteChangeV4Result;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavMoleculeNotification;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavMoleculeUIState;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/v4/FavoriteChangeV4Result;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavProductButtonV4ViewModel$observeFavoriteState$4", f = "FavProductButtonV4ViewModel.kt", l = {127, 137}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavProductButtonV4ViewModel$observeFavoriteState$4 extends j implements Function2<FavoriteChangeV4Result, d<? super Unit>, Object> {
    final /* synthetic */ FavoriteProductModel $molecule;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavProductButtonV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavProductButtonV4ViewModel$observeFavoriteState$4(FavProductButtonV4ViewModel favProductButtonV4ViewModel, FavoriteProductModel favoriteProductModel, d<? super FavProductButtonV4ViewModel$observeFavoriteState$4> dVar) {
        super(2, dVar);
        this.this$0 = favProductButtonV4ViewModel;
        this.$molecule = favoriteProductModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FavProductButtonV4ViewModel$observeFavoriteState$4 favProductButtonV4ViewModel$observeFavoriteState$4 = new FavProductButtonV4ViewModel$observeFavoriteState$4(this.this$0, this.$molecule, dVar);
        favProductButtonV4ViewModel$observeFavoriteState$4.L$0 = obj;
        return favProductButtonV4ViewModel$observeFavoriteState$4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1.n(r2, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r6.n(r1, r5) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        h hVar;
        FavoriteProductModel favoriteProductModel;
        h hVar2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            FavoriteChangeV4Result favoriteChangeV4Result = (FavoriteChangeV4Result) this.L$0;
            if (favoriteChangeV4Result instanceof FavoriteChangeV4Result.Success) {
                favoriteProductModel = this.this$0.model;
                if (favoriteProductModel != null) {
                    favoriteProductModel.setFavorite(((FavoriteChangeV4Result.Success) favoriteChangeV4Result).getMolecule().getIsFavorite());
                }
                hVar2 = this.this$0.notificationChannel;
                FavoriteChangeV4Result.Success success = (FavoriteChangeV4Result.Success) favoriteChangeV4Result;
                FavMoleculeNotification.Success success2 = new FavMoleculeNotification.Success(success.getNotification(), success.getNotificationPayloads());
                this.label = 1;
            } else {
                if (!(favoriteChangeV4Result instanceof FavoriteChangeV4Result.Failure)) {
                    throw new o();
                }
                x0Var = this.this$0._favState;
                x0Var.setValue(new FavMoleculeUIState.Error(this.$molecule));
                hVar = this.this$0.notificationChannel;
                FavMoleculeNotification.Error error = FavMoleculeNotification.Error.INSTANCE;
                this.label = 2;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FavoriteChangeV4Result favoriteChangeV4Result, d<? super Unit> dVar) {
        return ((FavProductButtonV4ViewModel$observeFavoriteState$4) create(favoriteChangeV4Result, dVar)).invokeSuspend(Unit.f71690a);
    }
}
