package ru.ozon.app.android.cart.common.presentation.addToCart;

import Bc.r;
import Sc.v;
import io.reactivex.C;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qc.o;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.CartTypeKt;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartParams;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0086\u0001\u0012<\b\u0001\u00128\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \b*\u001b\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004 \b*B\u0012<\b\u0001\u00128\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \b*\u001b\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartParams;", "Lkotlin/jvm/internal/EnhancedNullability;", "params", "Lio/reactivex/C;", "LSc/v;", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "", "Lru/ozon/app/android/cart/common/domain/CartType;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartParams;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AddToCartViewModel$addToCart$3 extends AbstractC7737t implements Function1<AddToCartParams, C<? extends v<? extends CartAddItemDTO, ? extends Boolean, ? extends CartType>>> {
    final /* synthetic */ Long $widgetId;
    final /* synthetic */ AddToCartViewModel this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a8\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u001b\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "result", "LSc/v;", "", "Lru/ozon/app/android/cart/common/domain/CartType;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/data/CartAddItemDTO;)LSc/v;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel$addToCart$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CartAddItemDTO, v<? extends CartAddItemDTO, ? extends Boolean, ? extends CartType>> {
        final /* synthetic */ CartType $cartType;
        final /* synthetic */ boolean $refreshCartPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z11, CartType cartType) {
            super(1);
            this.$refreshCartPage = z11;
            this.$cartType = cartType;
        }

        @Override // kotlin.jvm.functions.Function1
        public final v<CartAddItemDTO, Boolean, CartType> invoke(CartAddItemDTO result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new v<>(result, Boolean.valueOf(this.$refreshCartPage), this.$cartType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartViewModel$addToCart$3(AddToCartViewModel addToCartViewModel, Long l11) {
        super(1);
        this.this$0 = addToCartViewModel;
        this.$widgetId = l11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v invoke$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (v) function1.invoke(p02);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends v<CartAddItemDTO, Boolean, CartType>> invoke(AddToCartParams params) {
        CartService cartService;
        Intrinsics.checkNotNullParameter(params, "params");
        AddToCartParams.Settings settings = params.getSettings();
        boolean d11 = settings != null ? Intrinsics.d(settings.getRefreshCartPage(), Boolean.TRUE) : false;
        CartType cartType = CartTypeKt.getCartType(params.getProduct().getParams());
        cartService = this.this$0.cartService;
        String id2 = params.getProduct().getId();
        int quantity = params.getProduct().getQuantity();
        Map<String, TokenizedTrackingInfo> tracking = params.getTracking();
        Long selectedDeliverySchema = params.getProduct().getSelectedDeliverySchema();
        Long sortAfterSku = params.getProduct().getSortAfterSku();
        Map<String, String> params2 = params.getProduct().getParams();
        Boolean forStars = params.getProduct().getForStars();
        AddToCartParams.Settings settings2 = params.getSettings();
        y addProductToCartWithResponseResult$default = CartService.DefaultImpls.addProductToCartWithResponseResult$default(cartService, id2, quantity, selectedDeliverySchema, tracking, this.$widgetId, "plusButtonClick", sortAfterSku, forStars, null, params2, settings2 != null ? settings2.getShowErrorNotification() : null, 256, null);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(d11, cartType);
        o oVar = new o() { // from class: ru.ozon.app.android.cart.common.presentation.addToCart.a
            @Override // qc.o
            public final Object apply(Object obj) {
                v invoke$lambda$0;
                invoke$lambda$0 = AddToCartViewModel$addToCart$3.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        };
        addProductToCartWithResponseResult$default.getClass();
        return new r(addProductToCartWithResponseResult$default, oVar);
    }
}
