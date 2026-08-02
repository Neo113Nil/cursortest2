package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2AccessoriesDTOV2;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2AccessoriesDTOV2;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesVO;", "invoke", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2AccessoriesDTOV2;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CartSplitV2AccessoriesViewMapper$mapper$1 extends AbstractC7737t implements Function2<CartSplitV2AccessoriesDTOV2, d, List<? extends CartSplitV2AccessoriesVO>> {
    final /* synthetic */ CartSplitV2AccessoriesViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2AccessoriesViewMapper$mapper$1(CartSplitV2AccessoriesViewMapper cartSplitV2AccessoriesViewMapper) {
        super(2);
        this.this$0 = cartSplitV2AccessoriesViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CartSplitV2AccessoriesVO> invoke(CartSplitV2AccessoriesDTOV2 dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(new CartSplitV2AccessoriesVO(info.d().hashCode() + dto.getIndex() + this.this$0.getClass().getName().hashCode(), AtomActionMapperKt.toAtomAction(dto.getGetAccessoriesAction(), null)));
    }
}
