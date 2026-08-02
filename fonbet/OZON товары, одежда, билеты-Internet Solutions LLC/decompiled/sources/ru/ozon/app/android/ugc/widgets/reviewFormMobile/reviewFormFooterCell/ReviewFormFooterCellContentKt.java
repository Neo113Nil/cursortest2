package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormFooterCell/ReviewFormFooterCellVO;", "", "reviewFormFooterCellContent", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "", "tooltipClosed", "isTooltipVisible", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormFooterCellContentKt {
    public static final void reviewFormFooterCellContent(@NotNull e<Object, ReviewFormFooterCellVO> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        ReviewFormComponent reviewFormComponent = (ReviewFormComponent) eVar.getWidgetComponentStorage().getComponent(ReviewFormComponent.class);
        eVar.i(ReviewFormFooterCellContentKt$reviewFormFooterCellContent$1.INSTANCE, new ReviewFormFooterCellContentKt$reviewFormFooterCellContent$2(reviewFormComponent));
        eVar.s(d.a.f94674b, new ReviewFormFooterCellContentKt$reviewFormFooterCellContent$3(eVar, reviewFormComponent));
    }
}
