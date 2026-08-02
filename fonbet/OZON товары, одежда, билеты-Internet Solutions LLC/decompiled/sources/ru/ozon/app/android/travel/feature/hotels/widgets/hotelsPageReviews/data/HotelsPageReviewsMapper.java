package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageReviews.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.hotels.shared.review.data.MapperExtKt;
import ru.ozon.app.android.travel.feature.hotels.shared.review.data.ReviewDTO;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.ReviewVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageReviews.presentation.HotelsPageReviewsVO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageReviews/data/HotelsPageReviewsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageReviews/data/HotelsPageReviewsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageReviews/presentation/HotelsPageReviewsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;", "reviews", "findTallestReview", "(Ljava/util/List;)Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageReviews/data/HotelsPageReviewsDTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageReviewsMapper implements Function2<HotelsPageReviewsDTO, d, List<? extends HotelsPageReviewsVO>> {
    private final ReviewVO findTallestReview(List<ReviewVO> reviews) {
        if (reviews.size() <= 2) {
            return null;
        }
        Iterator<ReviewVO> it = reviews.iterator();
        ReviewVO next = it.next();
        int size = next.getReviewBlocks().size();
        Iterator<T> it2 = next.getReviewBlocks().iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            i11 += ((ReviewVO.ReviewBlockVO) it2.next()).getText().length();
        }
        while (it.hasNext()) {
            ReviewVO next2 = it.next();
            int size2 = next2.getReviewBlocks().size();
            Iterator<T> it3 = next2.getReviewBlocks().iterator();
            int i12 = 0;
            while (it3.hasNext()) {
                i12 += ((ReviewVO.ReviewBlockVO) it3.next()).getText().length();
            }
            if (size2 > size || (size2 == size && i12 > i11)) {
                next = next2;
                size = size2;
                i11 = i12;
            }
        }
        return next;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsPageReviewsVO> invoke(@NotNull HotelsPageReviewsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        Badge rating = state.getRating();
        List<ReviewDTO> reviewCards = state.getReviewCards();
        ArrayList arrayList = new ArrayList(C7714v.z(reviewCards, 10));
        Iterator<T> it = reviewCards.iterator();
        while (it.hasNext()) {
            arrayList.add(MapperExtKt.toVO((ReviewDTO) it.next(), UniColors.BG_SECONDARY.getToken(), -1, hashCode));
        }
        ReviewVO findTallestReview = findTallestReview(arrayList);
        Unit unit = Unit.f71690a;
        ButtonV3Atom.LargeButton showMoreButton = state.getShowMoreButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new HotelsPageReviewsVO(hashCode, title, rating, arrayList, findTallestReview, showMoreButton, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
