package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormCell;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormCell/ReviewFormCellVO;", "", "reviewFormCellWidget", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormCellWidgetKt {
    public static final void reviewFormCellWidget(@NotNull j<Object, ReviewFormCellVO> jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        C7475g widgetComponentStorage = jVar.getWidgetComponentStorage();
        jVar.i(ReviewFormCellWidgetKt$reviewFormCellWidget$1.INSTANCE, ReviewFormCellWidgetKt$reviewFormCellWidget$2.INSTANCE);
        jVar.G(new ReviewFormCellWidgetKt$reviewFormCellWidget$3(widgetComponentStorage));
    }
}
