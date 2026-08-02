package ru.ozon.app.android.bank.widgets.productStarsTile.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.bank.widgets.productStarsTile.data.ProductStarsTileDTO;
import ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/bank/widgets/productStarsTile/core/ProductStarsTileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileDTO$BlockDTO;", "Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileVO$BlockVO;", "toVO", "(Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileDTO$BlockDTO;)Lru/ozon/app/android/bank/widgets/productStarsTile/presentation/ProductStarsTileVO$BlockVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileDTO;Ll20/d;)Ljava/util/List;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductStarsTileMapper implements Function2<ProductStarsTileDTO, d, List<? extends ProductStarsTileVO>> {
    private final ProductStarsTileVO.BlockVO toVO(ProductStarsTileDTO.BlockDTO blockDTO) {
        return new ProductStarsTileVO.BlockVO(blockDTO.getTitle(), blockDTO.getSubtitle(), blockDTO.getBackgroundColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProductStarsTileVO> invoke(@NotNull ProductStarsTileDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        ProductStarsTileVO.BlockVO vo = toVO(state.getFirstBlock());
        ProductStarsTileVO.BlockVO vo2 = toVO(state.getSecondBlock());
        String backgroundColor = state.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new ProductStarsTileVO(hashCode, vo, vo2, backgroundColor, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
