package ru.ozon.app.android.pdp.actionHandlers.addToCartWithRedirect;

import Ge.f;
import Sc.s;
import Wc.a;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.actionHandlers.addToCartWithRedirect.AddToCartWithRedirectActionHandler$processAction$1$1$1", f = "AddToCartWithRedirectActionHandler.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddToCartWithRedirectActionHandler$processAction$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ int $quantity;
    final /* synthetic */ Long $selectedDeliverySchema;
    final /* synthetic */ String $sku;
    final /* synthetic */ Boolean $wholeQuant;
    int label;
    final /* synthetic */ AddToCartWithRedirectActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartWithRedirectActionHandler$processAction$1$1$1(AddToCartWithRedirectActionHandler addToCartWithRedirectActionHandler, String str, int i11, Long l11, CustomActionHandler.HandlerReferences handlerReferences, Boolean bool, AtomAction atomAction, d<? super AddToCartWithRedirectActionHandler$processAction$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = addToCartWithRedirectActionHandler;
        this.$sku = str;
        this.$quantity = i11;
        this.$selectedDeliverySchema = l11;
        this.$handlerRefs = handlerReferences;
        this.$wholeQuant = bool;
        this.$action = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddToCartWithRedirectActionHandler$processAction$1$1$1(this.this$0, this.$sku, this.$quantity, this.$selectedDeliverySchema, this.$handlerRefs, this.$wholeQuant, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        Object b11;
        String link;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            cartService = this.this$0.cartService;
            y addProductToCartWithResponseResult$default = CartService.DefaultImpls.addProductToCartWithResponseResult$default(cartService, this.$sku, this.$quantity, this.$selectedDeliverySchema, null, this.$handlerRefs.getVoId(), null, null, null, this.$wholeQuant, null, null, 1760, null);
            this.label = 1;
            b11 = f.b(addProductToCartWithResponseResult$default, this);
            if (b11 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            b11 = obj;
        }
        if (((CartAddItemDTO) b11).getSuccess() && (link = ((AtomAction.Click) this.$action).getLink()) != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.$handlerRefs.getRefs().getNavigator(), link, null, 2, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddToCartWithRedirectActionHandler$processAction$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
