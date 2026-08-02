package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewMapper;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cscore.orderdetails.molecule.media.presentation.ProductMediaImageMapperKt;
import ru.ozon.app.android.orderdetails.productsToPay.data.ProductCounterDto;
import ru.ozon.app.android.orderdetails.productsToPay.data.ProductDTO;
import ru.ozon.app.android.orderdetails.productsToPay.data.ProductImageDTO;
import ru.ozon.app.android.orderdetails.productsToPay.data.ProductPriceDTO;
import ru.ozon.app.android.orderdetails.productsToPay.data.VerticalPadding;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewItem.ProductsToPayVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u000f\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0013J\u0013\u0010\u000f\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u000f\u0010\u0016J\u0013\u0010\u000f\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u000f\u0010\u0019J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewMapper/ProductsToPayMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/orderdetails/productsToPay/data/ProductDTO;J)Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO;", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductImageDTO;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductImageVO;", "toVO", "(Lru/ozon/app/android/orderdetails/productsToPay/data/ProductImageDTO;)Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductImageVO;", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductPriceDTO;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductPriceVO;", "(Lru/ozon/app/android/orderdetails/productsToPay/data/ProductPriceDTO;)Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductPriceVO;", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductCounterDto;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductCounterVO;", "(Lru/ozon/app/android/orderdetails/productsToPay/data/ProductCounterDto;)Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductCounterVO;", "Lru/ozon/app/android/orderdetails/productsToPay/data/VerticalPadding;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$VerticalPadding;", "(Lru/ozon/app/android/orderdetails/productsToPay/data/VerticalPadding;)Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$VerticalPadding;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orderdetails/productsToPay/data/ProductDTO;Ll20/d;)Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductsToPayMapper implements Function2<ProductDTO, d, List<? extends ProductsToPayVO>> {
    private final ProductsToPayVO.ProductImageVO toVO(ProductImageDTO productImageDTO) {
        return new ProductsToPayVO.ProductImageVO(productImageDTO.getImage(), productImageDTO.getCounter(), productImageDTO.isAdult(), false, 8, null);
    }

    private final ProductsToPayVO toVo(ProductDTO productDTO, long j11) {
        ProductsToPayVO.ProductsToPayImage vo;
        if (productDTO.getProductMediaImage() != null) {
            vo = new ProductsToPayVO.ProductToPayMediaImage(ProductMediaImageMapperKt.toVO(productDTO.getProductMediaImage()));
        } else {
            if (productDTO.getProductImage() == null) {
                throw new IllegalArgumentException("productMediaImage or productImage is required");
            }
            vo = toVO(productDTO.getProductImage());
        }
        ProductsToPayVO.ProductsToPayImage productsToPayImage = vo;
        CheckBoxDTO checkbox = productDTO.getCheckbox();
        ProductPriceDTO productPrice = productDTO.getProductPrice();
        ProductsToPayVO.ProductPriceVO vo2 = productPrice != null ? toVO(productPrice) : null;
        ProductCounterDto productCounter = productDTO.getProductCounter();
        ProductsToPayVO.ProductCounterVO vo3 = productCounter != null ? toVO(productCounter) : null;
        TextDTO title = productDTO.getTitle();
        TextDTO subtitle = productDTO.getSubtitle();
        BadgeDTO badge = productDTO.getBadge();
        CommonControlSettings common = productDTO.getCommon();
        boolean disableSeparator = productDTO.getDisableSeparator();
        String state = productDTO.getState();
        VerticalPadding verticalPadding = productDTO.getVerticalPadding();
        return new ProductsToPayVO(j11, checkbox, productsToPayImage, vo2, vo3, title, subtitle, badge, common, disableSeparator, state, verticalPadding != null ? toVO(verticalPadding) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProductsToPayVO> invoke(@NotNull ProductDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        return C7714v.a0(toVo(state, (d11 + "_" + state).hashCode()));
    }

    private final ProductsToPayVO.ProductPriceVO toVO(ProductPriceDTO productPriceDTO) {
        return new ProductsToPayVO.ProductPriceVO(productPriceDTO.getPrice(), productPriceDTO.getBadge());
    }

    private final ProductsToPayVO.ProductCounterVO toVO(ProductCounterDto productCounterDto) {
        String id2 = productCounterDto.getId();
        IconButtonV3DTO plusButton = productCounterDto.getPlusButton();
        IconButtonV3DTO minusButton = productCounterDto.getMinusButton();
        TextDTO countValue = productCounterDto.getCountValue();
        Integer maxValue = productCounterDto.getMaxValue();
        int intValue = maxValue != null ? maxValue.intValue() : Integer.MAX_VALUE;
        Integer minValue = productCounterDto.getMinValue();
        int intValue2 = minValue != null ? minValue.intValue() : 1;
        Map<String, TokenizedTrackingInfo> trackingInfo = productCounterDto.getTrackingInfo();
        if (trackingInfo == null) {
            trackingInfo = U.c();
        }
        return new ProductsToPayVO.ProductCounterVO(id2, plusButton, minusButton, countValue, intValue, intValue2, trackingInfo);
    }

    private final ProductsToPayVO.VerticalPadding toVO(VerticalPadding verticalPadding) {
        return new ProductsToPayVO.VerticalPadding(verticalPadding.getTop().getCellLayoutPadding(), verticalPadding.getBottom().getCellLayoutPadding());
    }
}
