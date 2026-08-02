package ru.ozon.app.android.product.addToCart.presentation.likezone;

import Sc.s;
import io.reactivex.y;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import qc.g;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.product.addToCart.presentation.RecommendationViewController;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$handlePlusButtonClicked$1", f = "AddToCartContainerBinder.kt", l = {425, 444}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddToCartContainerBinder$handlePlusButtonClicked$1 extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ int $currentCount;
    final /* synthetic */ boolean $isQuantityButtonProvided;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;
    final /* synthetic */ String $updateCartActionId;
    final /* synthetic */ int $updateCartActionQuantity;
    final /* synthetic */ Long $updateCartActionSelectedDeliverySchema;
    int label;
    final /* synthetic */ AddToCartContainerBinder this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/data/CartAddItemDTO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$handlePlusButtonClicked$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CartAddItemDTO, Unit> {
        final /* synthetic */ AddToCartContainerBinder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AddToCartContainerBinder addToCartContainerBinder) {
            super(1);
            this.this$0 = addToCartContainerBinder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CartAddItemDTO cartAddItemDTO) {
            invoke2(cartAddItemDTO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CartAddItemDTO cartAddItemDTO) {
            Function1 function1;
            function1 = this.this$0.onSuccess;
            if (function1 != null) {
                function1.invoke(cartAddItemDTO.getParams());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartContainerBinder$handlePlusButtonClicked$1(int i11, AddToCartContainerBinder addToCartContainerBinder, boolean z11, int i12, String str, Long l11, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2, kotlin.coroutines.d<? super AddToCartContainerBinder$handlePlusButtonClicked$1> dVar) {
        super(2, dVar);
        this.$currentCount = i11;
        this.this$0 = addToCartContainerBinder;
        this.$isQuantityButtonProvided = z11;
        this.$updateCartActionQuantity = i12;
        this.$updateCartActionId = str;
        this.$updateCartActionSelectedDeliverySchema = l11;
        this.$trackingInfo = map;
        this.$params = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new AddToCartContainerBinder$handlePlusButtonClicked$1(this.$currentCount, this.this$0, this.$isQuantityButtonProvided, this.$updateCartActionQuantity, this.$updateCartActionId, this.$updateCartActionSelectedDeliverySchema, this.$trackingInfo, this.$params, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (Ge.f.b(r4, r19) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004a, code lost:
    
        if (r2.addRecShelfToProductCard(r5, r6, r7, r19) == r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long l11;
        WeakReference weakReference;
        Function0 function0;
        CartService cartService;
        Long l12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$currentCount == 0) {
                RecommendationViewController recommendationViewController = RecommendationViewController.INSTANCE;
                l11 = this.this$0.containerWidgetId;
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
        if (!this.$isQuantityButtonProvided) {
            return Unit.f71690a;
        }
        function0 = this.this$0.onPlusClicked;
        if (function0 != null) {
            function0.invoke();
        }
        int i12 = this.$currentCount + this.$updateCartActionQuantity;
        cartService = this.this$0.cartService;
        String str = this.$updateCartActionId;
        Long l13 = this.$updateCartActionSelectedDeliverySchema;
        Map<String, TokenizedTrackingInfo> map = this.$trackingInfo;
        l12 = this.this$0.containerWidgetId;
        y addProductToCartWithResponseResult$default = CartService.DefaultImpls.addProductToCartWithResponseResult$default(cartService, str, i12, l13, map, l12, this.$currentCount == 0 ? "" : "plusButtonClick", null, null, null, this.$params, null, 1472, null);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        g gVar = new g() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.a
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((AddToCartContainerBinder$handlePlusButtonClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
