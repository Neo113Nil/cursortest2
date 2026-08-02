package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "vo", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateItemsV2View$markItemRated$update$1 extends AbstractC7737t implements Function1<RateItemsV2VO.RateItemVO, RateItemsV2VO.RateItemVO> {
    final /* synthetic */ int $rating;
    final /* synthetic */ String $sku;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2View$markItemRated$update$1(String str, int i11) {
        super(1);
        this.$sku = str;
        this.$rating = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final RateItemsV2VO.RateItemVO invoke(RateItemsV2VO.RateItemVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        if (!(vo instanceof RateItemsV2VO.RateItemVO.RateProductItemVO)) {
            return vo;
        }
        RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO = (RateItemsV2VO.RateItemVO.RateProductItemVO) vo;
        return Intrinsics.d(rateProductItemVO.getSku(), this.$sku) ? RateItemsV2VO.RateItemVO.RateProductItemVO.copy$default(rateProductItemVO, null, RatingDTO.copy$default(rateProductItemVO.getRating(), null, null, null, null, Float.valueOf(this.$rating), null, null, 111, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, 131069, null) : vo;
    }
}
