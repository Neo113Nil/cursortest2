package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.StickyTotalPDPCountPickerBinder;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class StickyTotalPDPViewHolder$bindControlOrGone$1 extends C7735q implements Function2<Integer, StickyTotalPDPCountPickerBinder.PickerActionType, Unit> {
    StickyTotalPDPViewHolder$bindControlOrGone$1(Object obj) {
        super(2, obj, StickyTotalPDPViewHolder.class, "countPickerUpdate", "countPickerUpdate(ILru/ozon/app/android/fresh/cart/widgets/stickyTotal/StickyTotalPDPCountPickerBinder$PickerActionType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, StickyTotalPDPCountPickerBinder.PickerActionType pickerActionType) {
        invoke(num.intValue(), pickerActionType);
        return Unit.f71690a;
    }

    public final void invoke(int i11, StickyTotalPDPCountPickerBinder.PickerActionType p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((StickyTotalPDPViewHolder) this.receiver).countPickerUpdate(i11, p12);
    }
}
