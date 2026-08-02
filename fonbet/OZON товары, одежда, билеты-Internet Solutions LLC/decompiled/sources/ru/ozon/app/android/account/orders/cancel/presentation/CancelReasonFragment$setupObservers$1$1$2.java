package ru.ozon.app.android.account.orders.cancel.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class CancelReasonFragment$setupObservers$1$1$2 extends C7735q implements Function1<CheckboxTitleSubtitleCellDTO, Unit> {
    CancelReasonFragment$setupObservers$1$1$2(Object obj) {
        super(1, obj, CancelReasonFragment.class, "handleCheckbox", "handleCheckbox(Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CheckboxTitleSubtitleCellDTO checkboxTitleSubtitleCellDTO) {
        invoke2(checkboxTitleSubtitleCellDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CheckboxTitleSubtitleCellDTO checkboxTitleSubtitleCellDTO) {
        ((CancelReasonFragment) this.receiver).handleCheckbox(checkboxTitleSubtitleCellDTO);
    }
}
