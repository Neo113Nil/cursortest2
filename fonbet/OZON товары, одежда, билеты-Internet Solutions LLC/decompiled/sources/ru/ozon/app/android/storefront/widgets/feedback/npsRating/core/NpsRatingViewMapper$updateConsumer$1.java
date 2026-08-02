package ru.ozon.app.android.storefront.widgets.feedback.npsRating.core;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation.NpsRatingVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO;)Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class NpsRatingViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, NpsRatingVO, NpsRatingVO> {
    public static final NpsRatingViewMapper$updateConsumer$1 INSTANCE = new NpsRatingViewMapper$updateConsumer$1();

    NpsRatingViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final NpsRatingVO invoke(a.J.InterfaceC0007a update, NpsRatingVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (update instanceof NpsRatingSelectorUpdate) {
            oldVO.getBody().getSelector().setCurrentProgress(Integer.valueOf(((NpsRatingSelectorUpdate) update).getRating()));
        }
        return oldVO;
    }
}
