package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateItemsV2View$7$removed$1 extends AbstractC7737t implements Function1<RateItemsV2VO.RateItemVO, Boolean> {
    final /* synthetic */ Long $productId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2View$7$removed$1(Long l11) {
        super(1);
        this.$productId = l11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(RateItemsV2VO.RateItemVO it) {
        String sku;
        Intrinsics.checkNotNullParameter(it, "it");
        Long l11 = null;
        RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO = it instanceof RateItemsV2VO.RateItemVO.RateProductItemVO ? (RateItemsV2VO.RateItemVO.RateProductItemVO) it : null;
        if (rateProductItemVO != null && (sku = rateProductItemVO.getSku()) != null) {
            l11 = h.y0(sku);
        }
        return Boolean.valueOf(Intrinsics.d(l11, this.$productId));
    }
}
