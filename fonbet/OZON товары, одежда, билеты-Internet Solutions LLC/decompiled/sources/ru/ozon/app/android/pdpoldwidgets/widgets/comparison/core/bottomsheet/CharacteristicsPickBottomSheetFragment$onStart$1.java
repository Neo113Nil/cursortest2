package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick.CharacteristicsPickVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "items", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$CellDataValue;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CharacteristicsPickBottomSheetFragment$onStart$1 extends AbstractC7737t implements Function1<List<? extends CharacteristicsPickVO.CellData.CellDataValue>, Unit> {
    final /* synthetic */ CharacteristicsPickBottomSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CharacteristicsPickBottomSheetFragment$onStart$1(CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment) {
        super(1);
        this.this$0 = characteristicsPickBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends CharacteristicsPickVO.CellData.CellDataValue> list) {
        invoke2((List<CharacteristicsPickVO.CellData.CellDataValue>) list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<CharacteristicsPickVO.CellData.CellDataValue> items) {
        CharacteristicsFilterAdapter characteristicsFilterAdapter;
        Intrinsics.checkNotNullParameter(items, "items");
        characteristicsFilterAdapter = this.this$0.adapter;
        characteristicsFilterAdapter.submitList(C7714v.U0(items));
    }
}
