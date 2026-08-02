package ru.ozon.app.android.product.addToCart.presentation;

import Sc.s;
import io.reactivex.y;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import qc.g;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.product.utils.AddToCartButtonExtKt;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1", f = "AddToCartButtonsBinder.kt", l = {237, 255}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AddToCartButtonDTO $buttonDTO;
    final /* synthetic */ int $currentCount;
    final /* synthetic */ Function0<Unit> $onPlusClicked;
    final /* synthetic */ Function1<Map<String, String>, Unit> $onSuccess;
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;
    final /* synthetic */ AddToCartButtonDTO.QuantityButton.UpdateCartAction $updateCartAction;
    final /* synthetic */ Long $widgetId;
    int label;
    final /* synthetic */ AddToCartButtonsBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1(int i11, Long l11, AddToCartButtonsBinder addToCartButtonsBinder, AddToCartButtonDTO addToCartButtonDTO, Function0<Unit> function0, AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction, Map<String, TokenizedTrackingInfo> map, Function1<? super Map<String, String>, Unit> function1, d<? super AddToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1> dVar) {
        super(2, dVar);
        this.$currentCount = i11;
        this.$widgetId = l11;
        this.this$0 = addToCartButtonsBinder;
        this.$buttonDTO = addToCartButtonDTO;
        this.$onPlusClicked = function0;
        this.$updateCartAction = updateCartAction;
        this.$trackingInfo = map;
        this.$onSuccess = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1(this.$currentCount, this.$widgetId, this.this$0, this.$buttonDTO, this.$onPlusClicked, this.$updateCartAction, this.$trackingInfo, this.$onSuccess, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        if (Ge.f.b(r4, r21) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        if (r2.addRecShelfToProductCard(r5, r6, r7, r21) == r1) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WeakReference weakReference;
        CartService cartService;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$currentCount == 0) {
                RecommendationViewController recommendationViewController = RecommendationViewController.INSTANCE;
                Long l11 = this.$widgetId;
                AtomActionDTO recShelfAction = this.this$0.getRecShelfAction();
                weakReference = this.this$0.composerContainer;
                i iVar = weakReference != null ? (i) weakReference.get() : null;
                this.label = 1;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        if (this.$buttonDTO.getQuantityButton() != null) {
            Function0<Unit> function0 = this.$onPlusClicked;
            int i12 = this.$currentCount;
            AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction = this.$updateCartAction;
            AddToCartButtonsBinder addToCartButtonsBinder = this.this$0;
            Map<String, TokenizedTrackingInfo> map = this.$trackingInfo;
            Long l12 = this.$widgetId;
            AddToCartButtonDTO addToCartButtonDTO = this.$buttonDTO;
            Function1<Map<String, String>, Unit> function1 = this.$onSuccess;
            if (function0 != null) {
                function0.invoke();
            }
            int quantity = updateCartAction.getQuantity() + i12;
            cartService = addToCartButtonsBinder.cartService;
            y addProductToCartWithResponseResult$default = CartService.DefaultImpls.addProductToCartWithResponseResult$default(cartService, updateCartAction.getId(), quantity, updateCartAction.getSelectedDeliverySchema(), map, l12, i12 == 0 ? "" : "plusButtonClick", null, null, null, AddToCartButtonExtKt.getParams(addToCartButtonDTO), null, 1472, null);
            final AddToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1$1$1 addToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1$1$1 = new AddToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1$1$1(function1);
            g gVar = new g() { // from class: ru.ozon.app.android.product.addToCart.presentation.a
                @Override // qc.g
                public final void accept(Object obj2) {
                    Function1.this.invoke(obj2);
                }
            };
            addProductToCartWithResponseResult$default.getClass();
            Bc.j jVar = new Bc.j(addProductToCartWithResponseResult$default, gVar);
            Intrinsics.checkNotNullExpressionValue(jVar, "doOnSuccess(...)");
            this.label = 2;
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
