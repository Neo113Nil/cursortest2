package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.shared.review.data.MapperExtKt;
import ru.ozon.app.android.travel.feature.hotels.shared.review.data.ReviewDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.presentation.HotelsReviewsVO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsReviews/data/HotelsReviewsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsReviews/data/HotelsReviewsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsReviews/presentation/HotelsReviewsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsReviews/data/HotelsReviewsDTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsReviewsMapper implements Function2<HotelsReviewsDTO, d, List<? extends HotelsReviewsVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsReviewsVO> invoke(@NotNull HotelsReviewsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        Badge rating = state.getRating();
        List<ReviewDTO> reviewCards = state.getReviewCards();
        ArrayList arrayList = new ArrayList(C7714v.z(reviewCards, 10));
        Iterator<T> it = reviewCards.iterator();
        while (it.hasNext()) {
            arrayList.add(MapperExtKt.toVO((ReviewDTO) it.next(), UniColors.LAYER_FLOOR_1.getToken(), -2, hashCode));
        }
        String focusedReviewId = state.getFocusedReviewId();
        Integer num = null;
        if (focusedReviewId != null) {
            Iterator<ReviewDTO> it2 = state.getReviewCards().iterator();
            int i11 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (Intrinsics.d(it2.next().getId(), focusedReviewId)) {
                    break;
                }
                i11++;
            }
            Integer valueOf = Integer.valueOf(i11);
            if (i11 > 0) {
                num = valueOf;
            }
        }
        return C7714v.a0(new HotelsReviewsVO(hashCode, title, rating, arrayList, num));
    }
}
