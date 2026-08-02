package ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.ProductWidgetDTO;
import ru.ozon.app.android.product.common.ProductWidgetVO;
import ru.ozon.app.android.product.common.product.ProductDTO;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.videocover.UtilsKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B!\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u0005*\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductToOneMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/product/common/ProductWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/product/common/ProductWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductCommonMapper;", "commonMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/TextMeasurer;", "textMeasurer", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/StateMeasurer;", "stateMeasurer", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductCommonMapper;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/TextMeasurer;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/StateMeasurer;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/product/common/ProductWidgetDTO;Ll20/d;)Ljava/util/List;", "toVo", "(Lru/ozon/app/android/product/common/ProductWidgetDTO;Ll20/d;)Lru/ozon/app/android/product/common/ProductWidgetVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductCommonMapper;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/TextMeasurer;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/StateMeasurer;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductToOneMapper implements Function2<ProductWidgetDTO, d, List<? extends ProductWidgetVO>> {

    @NotNull
    private final ProductCommonMapper commonMapper;

    @NotNull
    private final StateMeasurer stateMeasurer;

    @NotNull
    private final TextMeasurer textMeasurer;

    public ProductToOneMapper(@NotNull ProductCommonMapper commonMapper, @NotNull TextMeasurer textMeasurer, @NotNull StateMeasurer stateMeasurer) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(stateMeasurer, "stateMeasurer");
        this.commonMapper = commonMapper;
        this.textMeasurer = textMeasurer;
        this.stateMeasurer = stateMeasurer;
    }

    @NotNull
    public final ProductWidgetVO toVo(@NotNull ProductWidgetDTO productWidgetDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(productWidgetDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        StateMeasurer stateMeasurer = this.stateMeasurer;
        List<ProductDTO> products = productWidgetDTO.getProductContainer().getProducts();
        ArrayList arrayList = new ArrayList(C7714v.z(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductDTO) it.next()).getState());
        }
        int measure = stateMeasurer.measure(arrayList);
        int fixButtonSubtitleMaxLines = this.commonMapper.fixButtonSubtitleMaxLines(productWidgetDTO.getProductContainer());
        TextMeasurer textMeasurer = this.textMeasurer;
        List<ProductDTO> products2 = productWidgetDTO.getProductContainer().getProducts();
        ArrayList arrayList2 = new ArrayList(C7714v.z(products2, 10));
        Iterator<T> it2 = products2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ProductDTO) it2.next()).getButtonSubtitle());
        }
        Integer num = (Integer) C7714v.d0(TextMeasurerKt.calculateButtonSubtitleHeights(textMeasurer, arrayList2, fixButtonSubtitleMaxLines));
        int intValue = num != null ? num.intValue() : 0;
        long hashCode = widgetInfo.d().hashCode();
        List<ProductDTO> products3 = productWidgetDTO.getProductContainer().getProducts();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = products3.iterator();
        boolean z11 = false;
        while (it3.hasNext()) {
            ArrayList arrayList4 = arrayList3;
            int i11 = fixButtonSubtitleMaxLines;
            ProductVO productDtoToVo$default = ProductCommonMapper.productDtoToVo$default(this.commonMapper, (ProductDTO) it3.next(), productWidgetDTO.getProductContainer().getOptions(), widgetInfo.c().b(), productWidgetDTO.getTestInfo(), false, intValue, measure, Long.valueOf(hashCode), i11, 16, null);
            if (!z11) {
                z11 = productDtoToVo$default != null ? UtilsKt.hasVideoCover(productDtoToVo$default) : false;
            }
            if (productDtoToVo$default != null) {
                arrayList4.add(productDtoToVo$default);
            }
            arrayList3 = arrayList4;
            fixButtonSubtitleMaxLines = i11;
        }
        return new ProductWidgetVO(hashCode, arrayList3, productWidgetDTO.getTestInfo(), null, z11, 8, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProductWidgetVO> invoke(@NotNull ProductWidgetDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo));
    }
}
