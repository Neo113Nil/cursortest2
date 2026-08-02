package ru.ozon.app.android.ugc.core.widgets.singlereview.otherReviewButton;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/otherReviewButton/OtherReviewButtonDO;", "dto", "Ll20/d;", "<unused var>", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/otherReviewButton/OtherReviewButtonVO;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/otherReviewButton/OtherReviewButtonDO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class OtherReviewButtonViewMapper$mapper$1 extends AbstractC7737t implements Function2<OtherReviewButtonDO, d, List<? extends OtherReviewButtonVO>> {
    public static final OtherReviewButtonViewMapper$mapper$1 INSTANCE = new OtherReviewButtonViewMapper$mapper$1();

    OtherReviewButtonViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<OtherReviewButtonVO> invoke(OtherReviewButtonDO dto, d dVar) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
        return C7714v.a0(new OtherReviewButtonVO(c.a(dto.getUuid(), "_otherReviews"), dto.getShowOtherReviewsButton(), dto.getHasItems()));
    }
}
