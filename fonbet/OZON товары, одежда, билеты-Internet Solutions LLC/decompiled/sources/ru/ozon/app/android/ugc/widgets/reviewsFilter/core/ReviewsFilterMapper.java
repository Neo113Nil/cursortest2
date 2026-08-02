package ru.ozon.app.android.ugc.widgets.reviewsFilter.core;

import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.data.ReviewsFilterDTO;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/core/ReviewsFilterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterDTO$ReviewsFilterItemDTO;", "", "index", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;", "toVO", "(Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterDTO$ReviewsFilterItemDTO;I)Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsFilterMapper implements Function2<ReviewsFilterDTO, d, List<? extends ReviewsFilterVO>> {
    private final ReviewsFilterVO.ReviewsFilterItemVO toVO(ReviewsFilterDTO.ReviewsFilterItemDTO reviewsFilterItemDTO, int i11) {
        long hashCode = (i11 + " " + reviewsFilterItemDTO.getContent()).hashCode();
        return (reviewsFilterItemDTO.getContent().getTitle() == null || reviewsFilterItemDTO.getContent().getProduct() != null) ? (reviewsFilterItemDTO.getContent().getProduct() == null || reviewsFilterItemDTO.getContent().getTitle() != null) ? new ReviewsFilterVO.ReviewsFilterItemVO.Item(hashCode, reviewsFilterItemDTO.getAspect(), reviewsFilterItemDTO.getContent().getProduct(), reviewsFilterItemDTO.getContent().getTitle()) : new ReviewsFilterVO.ReviewsFilterItemVO.Image(hashCode, reviewsFilterItemDTO.getAspect(), reviewsFilterItemDTO.getContent().getProduct()) : new ReviewsFilterVO.ReviewsFilterItemVO.Title(hashCode, reviewsFilterItemDTO.getAspect(), reviewsFilterItemDTO.getContent().getTitle());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewsFilterVO> invoke(@NotNull ReviewsFilterDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<ReviewsFilterDTO.ReviewsFilterItemDTO> filters = state.getFilters();
        ArrayList arrayList = new ArrayList(C7714v.z(filters, 10));
        Iterator<T> it = filters.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                OnBoardingDTO onboarding = state.getOnboarding();
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return C7714v.a0(new ReviewsFilterVO(hashCode, arrayList, onboarding, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, null));
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((ReviewsFilterDTO.ReviewsFilterItemDTO) next, i11));
            i11 = i12;
        }
    }
}
