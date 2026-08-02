package ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating;

import Kk.c;
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
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "getReviewHeaderVO", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoDO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoDO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewHeaderInfoMapper implements Function2<SingleReviewHeaderInfoDO, d, List<? extends SingleReviewHeaderInfoVO>> {
    private final SingleReviewHeaderInfoVO getReviewHeaderVO(SingleReviewHeaderInfoDO singleReviewHeaderInfoDO) {
        Integer rating;
        long hashCode = singleReviewHeaderInfoDO.getUuid().hashCode();
        long a11 = c.a(singleReviewHeaderInfoDO.getUuid(), "_headerInfo");
        SingleReviewDTO.HeaderDTO header = singleReviewHeaderInfoDO.getHeader();
        Float valueOf = (header == null || (rating = header.getRating()) == null) ? null : Float.valueOf(rating.intValue());
        SingleReviewDTO.HeaderDTO header2 = singleReviewHeaderInfoDO.getHeader();
        String subtitle = header2 != null ? header2.getSubtitle() : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = singleReviewHeaderInfoDO.getTrackingInfo();
        return new SingleReviewHeaderInfoVO(a11, valueOf, subtitle, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SingleReviewHeaderInfoVO> invoke(@NotNull SingleReviewHeaderInfoDO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(getReviewHeaderVO(state));
    }
}
