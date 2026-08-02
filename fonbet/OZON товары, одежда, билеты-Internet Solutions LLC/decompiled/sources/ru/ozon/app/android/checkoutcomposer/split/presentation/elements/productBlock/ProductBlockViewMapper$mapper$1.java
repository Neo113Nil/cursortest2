package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.productBlock;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductsBlockVO;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ProductBlockViewMapper$mapper$1 extends AbstractC7737t implements Function2<SplitElementDTO.SplitProductsBlockDTO, d, List<? extends ProductsBlockVO>> {
    public static final ProductBlockViewMapper$mapper$1 INSTANCE = new ProductBlockViewMapper$mapper$1();

    ProductBlockViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<ProductsBlockVO> invoke(SplitElementDTO.SplitProductsBlockDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = (widgetInfo.d() + dto.getIndex()).hashCode();
        TextDTO title = dto.getTitle();
        TextDTO subtitle = dto.getSubtitle();
        BadgeDTO badge = dto.getBadge();
        List<SplitElementDTO.SplitProductsBlockDTO.PromotedProduct> promotedProducts = dto.getPromotedProducts();
        if (promotedProducts == null) {
            promotedProducts = K.f71697a;
        }
        List<SplitElementDTO.SplitProductsBlockDTO.PromotedProduct> list = promotedProducts;
        AtomActionDTO action = dto.getAction();
        return C7714v.a0(new ProductsBlockVO(hashCode, title, subtitle, badge, list, dto.getButton(), action != null ? AtomActionMapperKt.toAtomAction(action, dto.getTrackingInfo()) : null, dto.getTrackingInfo(), dto.getPaddings()));
    }
}
