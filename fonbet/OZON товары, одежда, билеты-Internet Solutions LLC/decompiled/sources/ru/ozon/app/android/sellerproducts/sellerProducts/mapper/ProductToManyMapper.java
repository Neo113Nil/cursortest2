package ru.ozon.app.android.sellerproducts.sellerProducts.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductDTO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductWidgetDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u00182*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0018B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductToManyMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductCommonMapper;", "commonMapper", "Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/TextMeasurer;", "textMeasurer", "<init>", "(Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductCommonMapper;Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/TextMeasurer;)V", "", "heights", "rowSize", "modifyHeights", "(Ljava/util/List;I)Ljava/util/List;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductWidgetDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductCommonMapper;", "Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/TextMeasurer;", "Companion", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductToManyMapper implements Function2<ProductWidgetDTO, d, List<? extends ProductVO>> {

    @NotNull
    private final ProductCommonMapper commonMapper;

    @NotNull
    private final TextMeasurer textMeasurer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductVO.Type.values().length];
            try {
                iArr[ProductVO.Type.GRID2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductVO.Type.GRID3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProductToManyMapper(@NotNull ProductCommonMapper commonMapper, @NotNull TextMeasurer textMeasurer) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        this.commonMapper = commonMapper;
        this.textMeasurer = textMeasurer;
    }

    private final List<Integer> modifyHeights(List<Integer> heights, int rowSize) {
        ArrayList y11 = C7714v.y(heights, rowSize);
        ArrayList arrayList = new ArrayList(C7714v.z(y11, 10));
        Iterator it = y11.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            Integer num = (Integer) C7714v.d0(list);
            int intValue = num != null ? num.intValue() : 0;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((Number) it2.next()).intValue();
                arrayList2.add(Integer.valueOf(intValue));
            }
            arrayList.add(arrayList2);
        }
        return C7714v.N(arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProductVO> invoke(@NotNull ProductWidgetDTO state, @NotNull d widgetInfo) {
        ProductCommonMapper productCommonMapper;
        ProductContainerDTO.Options options;
        boolean z11;
        Intrinsics.checkNotNullParameter(state, "state");
        d widgetInfo2 = widgetInfo;
        Intrinsics.checkNotNullParameter(widgetInfo2, "widgetInfo");
        TextMeasurer textMeasurer = this.textMeasurer;
        List<ProductDTO> products = state.getProductContainer().getProducts();
        ArrayList arrayList = new ArrayList(C7714v.z(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductDTO) it.next()).getButtonSubtitle());
        }
        List<Integer> calculateButtonSubtitleHeights = TextMeasurerKt.calculateButtonSubtitleHeights(textMeasurer, arrayList);
        int i11 = WhenMappings.$EnumSwitchMapping$0[ProductVO.Type.INSTANCE.fromString(widgetInfo2.c().b()).ordinal()];
        if (i11 == 1) {
            calculateButtonSubtitleHeights = modifyHeights(calculateButtonSubtitleHeights, 2);
        } else if (i11 == 2) {
            calculateButtonSubtitleHeights = modifyHeights(calculateButtonSubtitleHeights, 3);
        }
        List<ProductDTO> products2 = state.getProductContainer().getProducts();
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        for (Object obj : products2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            ProductDTO productDTO = (ProductDTO) obj;
            ProductCommonMapper productCommonMapper2 = this.commonMapper;
            ProductContainerDTO.Options options2 = state.getProductContainer().getOptions();
            if (i12 == C7714v.P(state.getProductContainer().getProducts())) {
                productCommonMapper = productCommonMapper2;
                options = options2;
                z11 = true;
            } else {
                productCommonMapper = productCommonMapper2;
                options = options2;
                z11 = false;
            }
            ProductVO productDtoToVo$default = ProductCommonMapper.productDtoToVo$default(productCommonMapper, productDTO, options, widgetInfo2, z11, calculateButtonSubtitleHeights.get(i12).intValue(), 0, null, 96, null);
            if (productDtoToVo$default != null) {
                arrayList2.add(productDtoToVo$default);
            }
            widgetInfo2 = widgetInfo;
            i12 = i13;
        }
        return arrayList2;
    }
}
