package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.OpenRangeFilterView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FiltersSectionComponentView$openRangeFilterORF$2 extends AbstractC7737t implements Function0<OpenRangeFilterView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ FiltersSectionComponentView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FiltersSectionComponentView$openRangeFilterORF$2(Context context, FiltersSectionComponentView filtersSectionComponentView) {
        super(0);
        this.$context = context;
        this.this$0 = filtersSectionComponentView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OpenRangeFilterView invoke() {
        OpenRangeFilterView openRangeFilterView = new OpenRangeFilterView(this.$context, null, 0, 6, null);
        openRangeFilterView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ViewExtKt.gone(openRangeFilterView);
        this.this$0.addView(openRangeFilterView);
        return openRangeFilterView;
    }
}
