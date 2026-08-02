package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "selectedChip", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TouristCountSelectorV3ChildFormView$chipsAdapter$1 extends AbstractC7737t implements Function1<ChipDTO, Unit> {
    final /* synthetic */ TouristCountSelectorV3ChildFormView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorV3ChildFormView$chipsAdapter$1(TouristCountSelectorV3ChildFormView touristCountSelectorV3ChildFormView) {
        super(1);
        this.this$0 = touristCountSelectorV3ChildFormView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChipDTO chipDTO) {
        invoke2(chipDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ChipDTO selectedChip) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(selectedChip, "selectedChip");
        function1 = this.this$0.onChildAgeSelected;
        if (function1 != null) {
            function1.invoke(selectedChip);
        }
    }
}
