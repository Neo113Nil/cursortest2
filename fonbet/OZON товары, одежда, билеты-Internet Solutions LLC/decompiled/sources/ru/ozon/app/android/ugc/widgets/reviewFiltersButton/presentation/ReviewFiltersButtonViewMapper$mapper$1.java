package ru.ozon.app.android.ugc.widgets.reviewFiltersButton.presentation;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.reviewFiltersButton.data.ReviewFiltersButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFiltersButton/data/ReviewFiltersButtonDTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/ugc/widgets/reviewFiltersButton/presentation/ReviewFiltersButtonVO;", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewFiltersButton/data/ReviewFiltersButtonDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ReviewFiltersButtonViewMapper$mapper$1 extends AbstractC7737t implements Function2<ReviewFiltersButtonDTO, d, List<? extends ReviewFiltersButtonVO>> {
    public static final ReviewFiltersButtonViewMapper$mapper$1 INSTANCE = new ReviewFiltersButtonViewMapper$mapper$1();

    ReviewFiltersButtonViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<ReviewFiltersButtonVO> invoke(ReviewFiltersButtonDTO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        IconButtonV3DTO iconButton = dto.getIconButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new ReviewFiltersButtonVO(hashCode, iconButton, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null));
    }
}
