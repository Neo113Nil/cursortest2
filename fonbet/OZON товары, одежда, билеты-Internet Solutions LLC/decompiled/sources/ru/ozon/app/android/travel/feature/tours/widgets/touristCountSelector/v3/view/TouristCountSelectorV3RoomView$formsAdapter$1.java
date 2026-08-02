package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "position", "", "chip", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TouristCountSelectorV3RoomView$formsAdapter$1 extends AbstractC7737t implements Function2<Integer, ChipDTO, Unit> {
    final /* synthetic */ TouristCountSelectorV3RoomView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorV3RoomView$formsAdapter$1(TouristCountSelectorV3RoomView touristCountSelectorV3RoomView) {
        super(2);
        this.this$0 = touristCountSelectorV3RoomView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, ChipDTO chipDTO) {
        invoke(num.intValue(), chipDTO);
        return Unit.f71690a;
    }

    public final void invoke(int i11, ChipDTO chip) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(chip, "chip");
        function2 = this.this$0.onChildAgeSelected;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i11), chip);
        }
    }
}
