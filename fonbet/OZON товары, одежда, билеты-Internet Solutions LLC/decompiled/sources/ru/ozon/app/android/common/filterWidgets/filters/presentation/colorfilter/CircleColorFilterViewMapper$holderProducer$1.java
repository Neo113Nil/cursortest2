package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.CustomRefreshHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors.CircleColorsAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersColorFilterBinding;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorFilterViewHolder;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/CircleColorsAdapter;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CircleColorFilterViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ColorFilterViewHolder<CircleColorsAdapter>> {
    final /* synthetic */ CircleColorFilterViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CircleColorFilterViewMapper$holderProducer$1(CircleColorFilterViewMapper circleColorFilterViewMapper) {
        super(2);
        this.this$0 = circleColorFilterViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ColorFilterViewHolder<CircleColorsAdapter> invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        CustomRefreshHandler customRefreshHandler = new CustomRefreshHandler(refs);
        Context context = this.this$0.component().getContext();
        WidgetFiltersColorFilterBinding bind = WidgetFiltersColorFilterBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new ColorFilterViewHolder<>(bind, refs, customRefreshHandler, new CircleColorsFilterAdapterDelegate(customRefreshHandler, context), this.this$0.component().getHandlersInhibitor());
    }
}
