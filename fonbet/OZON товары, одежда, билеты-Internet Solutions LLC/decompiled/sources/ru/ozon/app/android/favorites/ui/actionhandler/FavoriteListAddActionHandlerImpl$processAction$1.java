package ru.ozon.app.android.favorites.ui.actionhandler;

import Sc.s;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractor;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListAddActionHandlerImpl$processAction$1", f = "FavoriteListAddActionHandlerImpl.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteListAddActionHandlerImpl$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ long $listId;
    final /* synthetic */ long $sku;
    int label;
    final /* synthetic */ FavoriteListAddActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteListAddActionHandlerImpl$processAction$1(FavoriteListAddActionHandlerImpl favoriteListAddActionHandlerImpl, long j11, long j12, AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences, d<? super FavoriteListAddActionHandlerImpl$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = favoriteListAddActionHandlerImpl;
        this.$sku = j11;
        this.$listId = j12;
        this.$action = atomAction;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FavoriteListAddActionHandlerImpl$processAction$1(this.this$0, this.$sku, this.$listId, this.$action, this.$handlerRefs, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WishlistItemsInteractor wishlistItemsInteractor;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            wishlistItemsInteractor = this.this$0.wishlistItemsInteractor;
            Long l11 = new Long(this.$sku);
            long j11 = this.$listId;
            String actionName = ((AtomAction.ComposerAction) this.$action).getActionName();
            c trackingData = this.$handlerRefs.getTrackingData();
            this.label = 1;
            if (WishlistItemsInteractor.DefaultImpls.addWishlistItemChangeRequest$default(wishlistItemsInteractor, l11, j11, null, null, actionName, trackingData, this, 12, null) == aVar) {
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
        return ((FavoriteListAddActionHandlerImpl$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
