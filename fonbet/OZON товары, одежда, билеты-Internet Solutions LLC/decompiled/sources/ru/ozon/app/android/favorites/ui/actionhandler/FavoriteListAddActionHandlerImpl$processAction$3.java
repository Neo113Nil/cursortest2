package ru.ozon.app.android.favorites.ui.actionhandler;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemAdd;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemAdd;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListAddActionHandlerImpl$processAction$3", f = "FavoriteListAddActionHandlerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteListAddActionHandlerImpl$processAction$3 extends j implements Function2<WishlistItemAdd, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavoriteListAddActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteListAddActionHandlerImpl$processAction$3(FavoriteListAddActionHandlerImpl favoriteListAddActionHandlerImpl, CustomActionHandler.HandlerReferences handlerReferences, d<? super FavoriteListAddActionHandlerImpl$processAction$3> dVar) {
        super(2, dVar);
        this.this$0 = favoriteListAddActionHandlerImpl;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FavoriteListAddActionHandlerImpl$processAction$3 favoriteListAddActionHandlerImpl$processAction$3 = new FavoriteListAddActionHandlerImpl$processAction$3(this.this$0, this.$handlerRefs, dVar);
        favoriteListAddActionHandlerImpl$processAction$3.L$0 = obj;
        return favoriteListAddActionHandlerImpl$processAction$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.handleUpdate(this.$handlerRefs, (WishlistItemAdd) this.L$0);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WishlistItemAdd wishlistItemAdd, d<? super Unit> dVar) {
        return ((FavoriteListAddActionHandlerImpl$processAction$3) create(wishlistItemAdd, dVar)).invokeSuspend(Unit.f71690a);
    }
}
