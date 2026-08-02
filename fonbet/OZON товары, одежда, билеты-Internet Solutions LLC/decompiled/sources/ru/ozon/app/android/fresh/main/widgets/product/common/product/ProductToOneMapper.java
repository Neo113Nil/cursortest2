package ru.ozon.app.android.fresh.main.widgets.product.common.product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.product.common.ProductWidgetDTO;
import ru.ozon.app.android.fresh.main.widgets.product.common.ProductWidgetVO;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductContainerDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u0005*\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductToOneMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductExpressMapper;", "commonMapper", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductExpressMapper;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetDTO;Ll20/d;)Ljava/util/List;", "toVo", "(Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetDTO;Ll20/d;)Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO;", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductExpressMapper;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductToOneMapper implements Function2<ProductWidgetDTO, d, List<? extends ProductWidgetVO>> {

    @NotNull
    private final ProductExpressMapper commonMapper;

    public ProductToOneMapper(@NotNull ProductExpressMapper commonMapper) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        this.commonMapper = commonMapper;
    }

    @NotNull
    public final ProductWidgetVO toVo(@NotNull ProductWidgetDTO productWidgetDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(productWidgetDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<ProductDTO> products = productWidgetDTO.getProductContainer().getProducts();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            d dVar = widgetInfo;
            ProductVO productDtoToVo$default = ProductExpressMapper.productDtoToVo$default(this.commonMapper, (ProductDTO) it.next(), productWidgetDTO.getProductContainer().getOptions(), dVar, false, 8, null);
            if (productDtoToVo$default != null) {
                arrayList.add(productDtoToVo$default);
            }
            widgetInfo = dVar;
        }
        ProductContainerDTO.Options options = productWidgetDTO.getProductContainer().getOptions();
        return new ProductWidgetVO(hashCode, arrayList, options != null ? new ProductWidgetVO.Options(options.getImageGrey(), options.getItemsAreFaded()) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProductWidgetVO> invoke(@NotNull ProductWidgetDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo));
    }
}
