package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2DTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/title/CartSplitV2TitleVO;", "invoke", "(Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CartSplitV2TitleViewMapper$mapper$1 extends AbstractC7737t implements Function2<CartSplitV2DTO, d, List<? extends CartSplitV2TitleVO>> {
    final /* synthetic */ CartSplitV2TitleViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2TitleViewMapper$mapper$1(CartSplitV2TitleViewMapper cartSplitV2TitleViewMapper) {
        super(2);
        this.this$0 = cartSplitV2TitleViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CartSplitV2TitleVO> invoke(CartSplitV2DTO dto, d info) {
        CartSplitV2TitleVO vo;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        vo = this.this$0.toVO(dto, info.d());
        List<CartSplitV2TitleVO> a02 = C7714v.a0(vo);
        this.this$0.itemSeparatorConfig = dto.getItemSeparatorConfig();
        return a02;
    }
}
