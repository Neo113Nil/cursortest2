package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingVO;", "", "reviewFormRatingContent", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "LZ1/h;", "fullScreenHeightDp", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormRatingContentKt {
    public static final void reviewFormRatingContent(@NotNull j<Object, ReviewFormRatingVO> jVar) {
        ReviewFormComponent reviewFormComponent = (ReviewFormComponent) Ek.a.c(jVar, "<this>", ReviewFormComponent.class);
        jVar.i(ReviewFormRatingContentKt$reviewFormRatingContent$1.INSTANCE, new ReviewFormRatingContentKt$reviewFormRatingContent$2(reviewFormComponent));
        jVar.c().put(ProductRateUpdate.class, new c.a() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingContentKt$reviewFormRatingContent$$inlined$update$1
            @Override // ru.ozon.composer.compose.widget.c.a
            public final I handle(a.J.InterfaceC0007a update, I old) {
                Intrinsics.checkNotNullParameter(update, "update");
                Intrinsics.checkNotNullParameter(old, "old");
                ReviewFormRatingVO reviewFormRatingVO = (ReviewFormRatingVO) old;
                return ReviewFormRatingVO.copy$default(reviewFormRatingVO, 0L, null, null, RatingDTO.copy$default(reviewFormRatingVO.getRating(), null, null, null, null, Float.valueOf(((ProductRateUpdate) update).getRate()), null, null, 111, null), false, null, 0, null, null, 487, null);
            }
        });
        jVar.G(new ReviewFormRatingContentKt$reviewFormRatingContent$4(reviewFormComponent));
    }
}
