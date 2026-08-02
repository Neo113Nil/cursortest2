package ru.ozon.app.android.ugc.widgets.productVariant.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.widgets.productVariant.data.ProductVariantDTO;
import ru.ozon.app.android.ugc.widgets.productVariant.presentation.ProductVariantVO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productVariant/core/ProductVariantMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/productVariant/data/ProductVariantDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVo", "(Lru/ozon/app/android/ugc/widgets/productVariant/data/ProductVariantDTO;J)Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO;", "Lru/ozon/app/android/ugc/widgets/productVariant/data/ProductVariantDTO$ChangeVariantButtonDTO;", "Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO$ChangeVariantButton;", "toChangeVariantButton", "(Lru/ozon/app/android/ugc/widgets/productVariant/data/ProductVariantDTO$ChangeVariantButtonDTO;)Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO$ChangeVariantButton;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/productVariant/data/ProductVariantDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductVariantMapper implements Function2<ProductVariantDTO, d, List<? extends ProductVariantVO>> {
    private final ProductVariantVO.ChangeVariantButton toChangeVariantButton(ProductVariantDTO.ChangeVariantButtonDTO changeVariantButtonDTO) {
        return new ProductVariantVO.ChangeVariantButton(TextDTO.copy$default(changeVariantButtonDTO.getChangeVariantText(), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null), changeVariantButtonDTO.getAction(), changeVariantButtonDTO.getTrackingInfo());
    }

    private final ProductVariantVO toVo(ProductVariantDTO productVariantDTO, long j11) {
        TextDTO productName = productVariantDTO.getProductName();
        TextDTO productDescription = productVariantDTO.getProductDescription();
        String productImage = productVariantDTO.getProductImage();
        ProductVariantDTO.ChangeVariantButtonDTO changeVariantButton = productVariantDTO.getChangeVariantButton();
        ProductVariantVO.ChangeVariantButton changeVariantButton2 = changeVariantButton != null ? toChangeVariantButton(changeVariantButton) : null;
        String backgroundColor = productVariantDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_SECONDARY.getToken();
        }
        String str = backgroundColor;
        Map<String, TokenizedTrackingInfo> trackingInfo = productVariantDTO.getTrackingInfo();
        return new ProductVariantVO(j11, productName, productDescription, productImage, changeVariantButton2, str, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProductVariantVO> invoke(@NotNull ProductVariantDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
