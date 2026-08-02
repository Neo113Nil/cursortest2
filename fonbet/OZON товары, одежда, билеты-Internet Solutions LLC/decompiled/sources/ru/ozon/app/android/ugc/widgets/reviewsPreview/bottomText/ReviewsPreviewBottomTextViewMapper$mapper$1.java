package ru.ozon.app.android.ugc.widgets.reviewsPreview.bottomText;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewBottomTextVO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewBottomTextVO;", "state", "Ll20/d;", "<unused var>", "", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewBottomTextVO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ReviewsPreviewBottomTextViewMapper$mapper$1 extends AbstractC7737t implements Function2<ReviewsPreviewBottomTextVO, d, List<? extends ReviewsPreviewBottomTextVO>> {
    public static final ReviewsPreviewBottomTextViewMapper$mapper$1 INSTANCE = new ReviewsPreviewBottomTextViewMapper$mapper$1();

    ReviewsPreviewBottomTextViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<ReviewsPreviewBottomTextVO> invoke(ReviewsPreviewBottomTextVO state, d dVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
        return C7714v.a0(state);
    }
}
