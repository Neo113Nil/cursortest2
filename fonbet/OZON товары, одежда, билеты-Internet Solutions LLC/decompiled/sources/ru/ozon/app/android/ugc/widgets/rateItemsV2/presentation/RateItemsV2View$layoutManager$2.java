package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.databinding.WidgetRateItemsV2Binding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/LinearLayoutManager;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateItemsV2View$layoutManager$2 extends AbstractC7737t implements Function0<LinearLayoutManager> {
    final /* synthetic */ RateItemsV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2View$layoutManager$2(RateItemsV2View rateItemsV2View) {
        super(0);
        this.this$0 = rateItemsV2View;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayoutManager invoke() {
        WidgetRateItemsV2Binding widgetRateItemsV2Binding;
        widgetRateItemsV2Binding = this.this$0.binding;
        return new LinearLayoutManager(widgetRateItemsV2Binding.getConstraintLayout().getContext(), 0, false);
    }
}
