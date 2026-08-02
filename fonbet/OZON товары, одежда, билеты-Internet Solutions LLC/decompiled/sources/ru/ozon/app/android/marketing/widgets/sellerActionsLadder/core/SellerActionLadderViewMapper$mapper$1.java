package ru.ozon.app.android.marketing.widgets.sellerActionsLadder.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.sellerActionsLadder.data.SellerActionsLadderDTO;
import ru.ozon.app.android.marketing.widgets.sellerActionsLadder.presentation.SellerActionsLadderVO;
import ru.ozon.app.android.seller.molecule.progressLadder.data.ProgressLadderDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsLadder/data/SellerActionsLadderDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/marketing/widgets/sellerActionsLadder/presentation/SellerActionsLadderVO;", "invoke", "(Lru/ozon/app/android/marketing/widgets/sellerActionsLadder/data/SellerActionsLadderDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class SellerActionLadderViewMapper$mapper$1 extends AbstractC7737t implements Function2<SellerActionsLadderDTO, d, List<? extends SellerActionsLadderVO>> {
    public static final SellerActionLadderViewMapper$mapper$1 INSTANCE = new SellerActionLadderViewMapper$mapper$1();

    SellerActionLadderViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<SellerActionsLadderVO> invoke(SellerActionsLadderDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        ProgressLadderDTO progressLadder = dto.getProgressLadder();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new SellerActionsLadderVO(hashCode, progressLadder, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
