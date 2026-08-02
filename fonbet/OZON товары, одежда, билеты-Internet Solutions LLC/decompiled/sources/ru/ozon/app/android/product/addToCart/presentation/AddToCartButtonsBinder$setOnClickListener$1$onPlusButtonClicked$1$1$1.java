package ru.ozon.app.android.product.addToCart.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/data/CartAddItemDTO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1$1$1 extends AbstractC7737t implements Function1<CartAddItemDTO, Unit> {
    final /* synthetic */ Function1<Map<String, String>, Unit> $onSuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1$1$1(Function1<? super Map<String, String>, Unit> function1) {
        super(1);
        this.$onSuccess = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartAddItemDTO cartAddItemDTO) {
        invoke2(cartAddItemDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartAddItemDTO cartAddItemDTO) {
        Function1<Map<String, String>, Unit> function1 = this.$onSuccess;
        if (function1 != null) {
            function1.invoke(cartAddItemDTO.getParams());
        }
    }
}
