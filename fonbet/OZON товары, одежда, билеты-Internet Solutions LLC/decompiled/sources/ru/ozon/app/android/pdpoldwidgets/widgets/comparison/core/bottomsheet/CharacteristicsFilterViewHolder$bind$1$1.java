package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.NonViewFilter;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick.CharacteristicsPickVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isSelected", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CharacteristicsFilterViewHolder$bind$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ CharacteristicsPickVO.CellData.CellDataValue $item;
    final /* synthetic */ CharacteristicsFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CharacteristicsFilterViewHolder$bind$1$1(CharacteristicsFilterViewHolder characteristicsFilterViewHolder, CharacteristicsPickVO.CellData.CellDataValue cellDataValue) {
        super(1);
        this.this$0 = characteristicsFilterViewHolder;
        this.$item = cellDataValue;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ComparisonBottomSheetViewModel comparisonBottomSheetViewModel;
        Function2 function2;
        comparisonBottomSheetViewModel = this.this$0.viewModel;
        if (comparisonBottomSheetViewModel != null) {
            comparisonBottomSheetViewModel.setSelection(this.$item.getId(), z11);
        }
        function2 = this.this$0.senderAnalytics;
        function2.invoke(z11 ? this.$item.getTokenizedSelectEvent() : this.$item.getTokenizedUnselectEvent(), NonViewFilter.INSTANCE);
    }
}
