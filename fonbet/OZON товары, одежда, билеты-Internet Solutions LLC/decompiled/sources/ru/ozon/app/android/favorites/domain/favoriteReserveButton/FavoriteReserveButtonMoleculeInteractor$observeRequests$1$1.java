package ru.ozon.app.android.favorites.domain.favoriteReserveButton;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.model.FavoriteReservedChangeResult;
import ru.ozon.app.android.favorites.domain.favoriteReserveButton.FavoriteReserveButtonMoleculeInteractor;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReservedChangeResult;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReservedChangeResult;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.domain.favoriteReserveButton.FavoriteReserveButtonMoleculeInteractor$observeRequests$1$1", f = "FavoriteReserveButtonMoleculeInteractor.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteReserveButtonMoleculeInteractor$observeRequests$1$1 extends j implements Function2<M, d<? super FavoriteReservedChangeResult>, Object> {
    final /* synthetic */ FavoriteReserveButtonMoleculeInteractor.FavoriteReservedChangeData $it;
    int label;
    final /* synthetic */ FavoriteReserveButtonMoleculeInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteReserveButtonMoleculeInteractor$observeRequests$1$1(FavoriteReserveButtonMoleculeInteractor favoriteReserveButtonMoleculeInteractor, FavoriteReserveButtonMoleculeInteractor.FavoriteReservedChangeData favoriteReservedChangeData, d<? super FavoriteReserveButtonMoleculeInteractor$observeRequests$1$1> dVar) {
        super(2, dVar);
        this.this$0 = favoriteReserveButtonMoleculeInteractor;
        this.$it = favoriteReservedChangeData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FavoriteReserveButtonMoleculeInteractor$observeRequests$1$1(this.this$0, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object onFavoriteReservedChanged;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        FavoriteReserveButtonMoleculeInteractor favoriteReserveButtonMoleculeInteractor = this.this$0;
        FavoriteReserveButtonMoleculeInteractor.FavoriteReservedChangeData favoriteReservedChangeData = this.$it;
        this.label = 1;
        onFavoriteReservedChanged = favoriteReserveButtonMoleculeInteractor.onFavoriteReservedChanged(favoriteReservedChangeData, this);
        return onFavoriteReservedChanged == aVar ? aVar : onFavoriteReservedChanged;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super FavoriteReservedChangeResult> dVar) {
        return ((FavoriteReserveButtonMoleculeInteractor$observeRequests$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
