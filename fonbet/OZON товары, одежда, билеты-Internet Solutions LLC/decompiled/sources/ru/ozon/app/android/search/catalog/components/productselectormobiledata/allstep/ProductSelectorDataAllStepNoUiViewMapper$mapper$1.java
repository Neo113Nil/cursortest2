package ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.model.ProductSelectorMobileDataAllStepVO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.MapperKt;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/model/ProductSelectorMobileDataAllStepVO;", "invoke", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ProductSelectorDataAllStepNoUiViewMapper$mapper$1 extends AbstractC7737t implements Function2<ProductSelectorMobileDataDTO, d, List<? extends ProductSelectorMobileDataAllStepVO>> {
    public static final ProductSelectorDataAllStepNoUiViewMapper$mapper$1 INSTANCE = new ProductSelectorDataAllStepNoUiViewMapper$mapper$1();

    ProductSelectorDataAllStepNoUiViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<ProductSelectorMobileDataAllStepVO> invoke(ProductSelectorMobileDataDTO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return MapperKt.toAllStepVO(dto);
    }
}
