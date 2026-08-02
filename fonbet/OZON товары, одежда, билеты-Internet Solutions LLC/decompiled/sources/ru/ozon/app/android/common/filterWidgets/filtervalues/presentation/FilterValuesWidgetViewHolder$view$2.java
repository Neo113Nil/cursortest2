package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.storefront.filterWidgets.R$layout;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FilterValuesWidgetViewHolder$view$2 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ FilterValuesWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterValuesWidgetViewHolder$view$2(FilterValuesWidgetViewHolder filterValuesWidgetViewHolder) {
        super(0);
        this.this$0 = filterValuesWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return ViewGroupExtKt.inflate(ComposerViewExtensionKt.composerTopContainer(this.this$0.containerView), this.this$0.isSelectFilterValues() ? R$layout.select_filter_values_search_bar : R$layout.filter_values_search_bar, false);
    }
}
