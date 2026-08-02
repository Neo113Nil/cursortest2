package ru.ozon.app.android.pdp.widgets.outofstock.presentation;

import A00.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.outofstock.core.OutOfStockViewMapper;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/domain/CartState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OutOfStockViewHolder$onAttach$1 extends AbstractC7737t implements Function1<CartState, Unit> {
    final /* synthetic */ OutOfStockViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutOfStockViewHolder$onAttach$1(OutOfStockViewHolder outOfStockViewHolder) {
        super(1);
        this.this$0 = outOfStockViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartState cartState) {
        invoke2(cartState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartState cartState) {
        OutOfStockVO outOfStockVO;
        ComposerReferences composerReferences;
        Map<Long, CartItemInfo> items = cartState.getItems();
        outOfStockVO = this.this$0.item;
        if (outOfStockVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        a.J.InterfaceC0007a interfaceC0007a = items.containsKey(Long.valueOf(outOfStockVO.getSku())) ? OutOfStockViewMapper.AddToCart.INSTANCE : OutOfStockViewMapper.RemoveFromCart.INSTANCE;
        composerReferences = this.this$0.references;
        composerReferences.getController().update(interfaceC0007a);
    }
}
