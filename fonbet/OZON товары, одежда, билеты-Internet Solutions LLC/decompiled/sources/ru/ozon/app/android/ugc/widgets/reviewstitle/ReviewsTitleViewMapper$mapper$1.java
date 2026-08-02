package ru.ozon.app.android.ugc.widgets.reviewstitle;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewstitle/ReviewsTitleDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/ugc/widgets/reviewstitle/ReviewsTitleVO;", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewstitle/ReviewsTitleDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ReviewsTitleViewMapper$mapper$1 extends AbstractC7737t implements Function2<ReviewsTitleDTO, d, List<? extends ReviewsTitleVO>> {
    public static final ReviewsTitleViewMapper$mapper$1 INSTANCE = new ReviewsTitleViewMapper$mapper$1();

    ReviewsTitleViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<ReviewsTitleVO> invoke(ReviewsTitleDTO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        String title = dto.getTitle();
        String subtitle = dto.getSubtitle();
        Integer count = dto.getCount();
        String deeplink = dto.getDeeplink();
        Label label = dto.getLabel();
        Button linkButton = dto.getLinkButton();
        Button copy$default = linkButton != null ? Button.copy$default(linkButton, null, null, Button.Style.BORDERLESS, null, null, null, null, 123, null) : null;
        Button writeReviewButton = dto.getWriteReviewButton();
        return C7714v.a0(new ReviewsTitleVO(hashCode, title, subtitle, count, deeplink, label, copy$default, writeReviewButton != null ? Button.copy$default(writeReviewButton, null, null, Button.Style.SECONDARY, null, null, null, null, 123, null) : null));
    }
}
