package ru.ozon.app.android.ugc.core.widgets.listreviews.core.more;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.ugc.core.widgets.listreviews.data.ListReviewsDTO;
import ru.ozon.app.android.ugc.core.widgets.listreviews.presentation.more.ListReviewsMoreVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO$MoreReviews;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/more/ListReviewsMoreVO;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO$MoreReviews;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ListReviewsMoreViewMapper$mapper$1 extends AbstractC7737t implements Function2<ListReviewsDTO.MoreReviews, d, List<? extends ListReviewsMoreVO>> {
    public static final ListReviewsMoreViewMapper$mapper$1 INSTANCE = new ListReviewsMoreViewMapper$mapper$1();

    ListReviewsMoreViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<ListReviewsMoreVO> invoke(ListReviewsDTO.MoreReviews dto, d widgetInfo) {
        Label label;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), ".more");
        String title = dto.getTitle();
        Label badge = dto.getBadge();
        if (badge != null) {
            String backgroundColor = dto.getBadge().getBackgroundColor();
            if (backgroundColor == null) {
                backgroundColor = UniColors.GRAPHIC_NEUTRAL_ON_LIGHT.getToken();
            }
            String str = backgroundColor;
            String textColor = dto.getBadge().getTextColor();
            if (textColor == null) {
                textColor = UniColors.GRAPHIC_SOLID_NEUTRAL.getToken();
            }
            label = Label.copy$default(badge, null, null, null, null, null, textColor, null, null, str, null, 735, null);
        } else {
            label = null;
        }
        AtomActionDTO action = dto.getAction();
        return C7714v.a0(new ListReviewsMoreVO(a11, title, label, action != null ? AtomActionMapperKt.toAtomAction(action, dto.getTrackingInfo()) : null));
    }
}
