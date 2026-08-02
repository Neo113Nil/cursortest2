package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetAdditionalLuggageV2Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2WidgetViewHolder$bind$5$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AdditionalLuggageV2VO.LuggageContent $this_with;
    final /* synthetic */ AdditionalLuggageV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalLuggageV2WidgetViewHolder$bind$5$1(AdditionalLuggageV2WidgetViewHolder additionalLuggageV2WidgetViewHolder, AdditionalLuggageV2VO.LuggageContent luggageContent) {
        super(0);
        this.this$0 = additionalLuggageV2WidgetViewHolder;
        this.$this_with = luggageContent;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WidgetAdditionalLuggageV2Binding widgetAdditionalLuggageV2Binding;
        widgetAdditionalLuggageV2Binding = this.this$0.binding;
        widgetAdditionalLuggageV2Binding.additionalLuggageV2FlightsRecyclerView.scrollToPosition(this.$this_with.getSelectedTabPosition());
        this.this$0.checkAppBarElevation(this.$this_with.getSelectedTabPosition());
    }
}
