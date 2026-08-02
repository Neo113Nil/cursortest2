package ru.ozon.app.android.product.addToCart.presentation.likezone;

import Sc.s;
import com.google.android.gms.wallet.WalletConstants;
import io.reactivex.AbstractC7094b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$handleMinusButtonClicked$1", f = "AddToCartContainerBinder.kt", l = {398, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddToCartContainerBinder$handleMinusButtonClicked$1 extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ int $nextCount;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ boolean $shouldDecrement;
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;
    final /* synthetic */ String $updateCartActionId;
    final /* synthetic */ Long $updateCartActionSelectedDeliverySchema;
    int label;
    final /* synthetic */ AddToCartContainerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartContainerBinder$handleMinusButtonClicked$1(boolean z11, AddToCartContainerBinder addToCartContainerBinder, String str, int i11, Long l11, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2, kotlin.coroutines.d<? super AddToCartContainerBinder$handleMinusButtonClicked$1> dVar) {
        super(2, dVar);
        this.$shouldDecrement = z11;
        this.this$0 = addToCartContainerBinder;
        this.$updateCartActionId = str;
        this.$nextCount = i11;
        this.$updateCartActionSelectedDeliverySchema = l11;
        this.$trackingInfo = map;
        this.$params = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new AddToCartContainerBinder$handleMinusButtonClicked$1(this.$shouldDecrement, this.this$0, this.$updateCartActionId, this.$nextCount, this.$updateCartActionSelectedDeliverySchema, this.$trackingInfo, this.$params, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (Ge.f.a(r2, r18) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (Ge.f.a(r2, r18) == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        Long l11;
        CartService cartService2;
        Long l12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$shouldDecrement) {
                cartService2 = this.this$0.cartService;
                String str = this.$updateCartActionId;
                int i12 = this.$nextCount;
                Long l13 = this.$updateCartActionSelectedDeliverySchema;
                Map<String, TokenizedTrackingInfo> map = this.$trackingInfo;
                l12 = this.this$0.containerWidgetId;
                AbstractC7094b addProductToCart$default = CartService.DefaultImpls.addProductToCart$default(cartService2, str, i12, l13, map, l12, "minusButtonClick", null, null, null, this.$params, 448, null);
                this.label = 1;
            } else {
                cartService = this.this$0.cartService;
                String str2 = this.$updateCartActionId;
                Long l14 = this.$updateCartActionSelectedDeliverySchema;
                Map<String, TokenizedTrackingInfo> map2 = this.$trackingInfo;
                l11 = this.this$0.containerWidgetId;
                AbstractC7094b removeProductFromCart$default = CartService.DefaultImpls.removeProductFromCart$default(cartService, str2, 0, l14, map2, l11, null, this.$params, 32, null);
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
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((AddToCartContainerBinder$handleMinusButtonClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
