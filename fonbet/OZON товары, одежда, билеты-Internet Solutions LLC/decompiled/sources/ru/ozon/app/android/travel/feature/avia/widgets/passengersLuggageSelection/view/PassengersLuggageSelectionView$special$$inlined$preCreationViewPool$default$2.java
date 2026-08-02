package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.view;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
public final class PassengersLuggageSelectionView$special$$inlined$preCreationViewPool$default$2 extends AbstractC7737t implements Function1<CellView, Unit> {
    public PassengersLuggageSelectionView$special$$inlined$preCreationViewPool$default$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CellView cellView) {
        invoke(cellView);
        return Unit.f71690a;
    }

    public final void invoke(CellView PreCreationViewPoolDelegate) {
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        CellView cellView = PreCreationViewPoolDelegate;
        cellView.setId(R$id.passengersLuggageSelectionCell);
        cellView.setLayoutParams(new ConstraintLayout.b(0, -2));
    }
}
