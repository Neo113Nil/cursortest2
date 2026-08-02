package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.MessengerProductFavoriteButtonViewHolder;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.MessengerFavoriteDelegateImpl$subscribeToRemoveFromFavoritesEvent$2", f = "MessengerFavoriteDelegateImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MessengerFavoriteDelegateImpl$subscribeToRemoveFromFavoritesEvent$2 extends j implements Function2<Long, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ MessengerFavoriteDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessengerFavoriteDelegateImpl$subscribeToRemoveFromFavoritesEvent$2(MessengerFavoriteDelegateImpl messengerFavoriteDelegateImpl, d<? super MessengerFavoriteDelegateImpl$subscribeToRemoveFromFavoritesEvent$2> dVar) {
        super(2, dVar);
        this.this$0 = messengerFavoriteDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MessengerFavoriteDelegateImpl$subscribeToRemoveFromFavoritesEvent$2(this.this$0, dVar);
    }

    public final Object invoke(long j11, d<? super Unit> dVar) {
        return ((MessengerFavoriteDelegateImpl$subscribeToRemoveFromFavoritesEvent$2) create(Long.valueOf(j11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FavoriteProductMolecule favoriteProductMolecule;
        MessengerProductFavoriteButtonViewHolder favButtonViewHolder;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        favoriteProductMolecule = this.this$0.moleculeLink;
        if (favoriteProductMolecule == null) {
            return Unit.f71690a;
        }
        favButtonViewHolder = this.this$0.getFavButtonViewHolder();
        favButtonViewHolder.changeButton(favoriteProductMolecule);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l11, d<? super Unit> dVar) {
        return invoke(l11.longValue(), dVar);
    }
}
