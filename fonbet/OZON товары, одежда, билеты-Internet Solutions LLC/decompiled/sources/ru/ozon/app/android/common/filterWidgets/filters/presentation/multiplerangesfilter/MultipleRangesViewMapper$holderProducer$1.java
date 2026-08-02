package ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.CustomRefreshHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.RangeFilterComposerActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersRangeFilterBinding;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersTagFilterBinding;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetMultipleRangesFilterBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/multiplerangesfilter/MultipleRangesFilterViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MultipleRangesViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, MultipleRangesFilterViewHolder> {
    final /* synthetic */ MultipleRangesViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleRangesViewMapper$holderProducer$1(MultipleRangesViewMapper multipleRangesViewMapper) {
        super(2);
        this.this$0 = multipleRangesViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MultipleRangesFilterViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetMultipleRangesFilterBinding bind = WidgetMultipleRangesFilterBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        WidgetFiltersTagFilterBinding bind2 = WidgetFiltersTagFilterBinding.bind(bind.tagsContainer.getConstraintLayout());
        Intrinsics.checkNotNullExpressionValue(bind2, "bind(...)");
        WidgetFiltersRangeFilterBinding bind3 = WidgetFiltersRangeFilterBinding.bind(bind.rangeContainer.getConstraintLayout());
        Intrinsics.checkNotNullExpressionValue(bind3, "bind(...)");
        return new MultipleRangesFilterViewHolder(bind, bind2, bind3, new CustomRefreshHandler(refs), new RangeFilterComposerActionHandler(refs), refs, this.this$0.component().getKeyboardVisibilityActionHolder(), this.this$0.component().getFeatureChecker());
    }
}
