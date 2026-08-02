package ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation;

import B0.C2454a;
import Ge.f;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.m;
import io.reactivex.AbstractC7094b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data.AddToCartButtonDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder$setOnClickListener$1$onPlusButtonClicked$1", f = "AddToCartButtonBinder.kt", l = {m.e.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddToCartButtonBinder$setOnClickListener$1$onPlusButtonClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AddToCartButtonDTO $buttonDTO;
    final /* synthetic */ int $currentCount;
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;
    final /* synthetic */ AddToCartButtonDTO.QuantityButton.UpdateCartAction $updateCartAction;
    final /* synthetic */ Long $widgetId;
    int label;
    final /* synthetic */ AddToCartButtonBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartButtonBinder$setOnClickListener$1$onPlusButtonClicked$1(AddToCartButtonDTO addToCartButtonDTO, int i11, AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction, AddToCartButtonBinder addToCartButtonBinder, Map<String, TokenizedTrackingInfo> map, Long l11, d<? super AddToCartButtonBinder$setOnClickListener$1$onPlusButtonClicked$1> dVar) {
        super(2, dVar);
        this.$buttonDTO = addToCartButtonDTO;
        this.$currentCount = i11;
        this.$updateCartAction = updateCartAction;
        this.this$0 = addToCartButtonBinder;
        this.$trackingInfo = map;
        this.$widgetId = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddToCartButtonBinder$setOnClickListener$1$onPlusButtonClicked$1(this.$buttonDTO, this.$currentCount, this.$updateCartAction, this.this$0, this.$trackingInfo, this.$widgetId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$buttonDTO.getQuantityButton() == null) {
                return Unit.f71690a;
            }
            int plusCount = QuantityChangeExtensionsKt.plusCount(this.$currentCount, this.$buttonDTO.getQuantityButton().getMaxItems(), this.$updateCartAction, this.$buttonDTO.getQuantityButton().getQuantSize());
            cartService = this.this$0.cartService;
            String id2 = this.$updateCartAction.getId();
            Long selectedDeliverySchema = this.$updateCartAction.getSelectedDeliverySchema();
            Map<String, TokenizedTrackingInfo> map = this.$trackingInfo;
            Long l11 = this.$widgetId;
            String str = this.$currentCount == 0 ? "" : "plusButtonClick";
            AddToCartButtonDTO.Extend extend = this.$buttonDTO.getExtend();
            AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService, id2, plusCount, selectedDeliverySchema, map, l11, str, null, null, null, extend != null ? C2454a.b("enum", extend.toString()) : null, 448, null);
            this.label = 1;
            if (f.a(addProductToCart$default, this) == aVar) {
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
        return ((AddToCartButtonBinder$setOnClickListener$1$onPlusButtonClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
