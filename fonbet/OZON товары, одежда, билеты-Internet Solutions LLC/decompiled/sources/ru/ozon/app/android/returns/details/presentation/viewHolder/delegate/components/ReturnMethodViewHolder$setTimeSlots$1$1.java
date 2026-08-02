package ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.returns.details.presentation.viewModel.ReturnDetailsViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ReturnMethodViewHolder$setTimeSlots$1$1 extends C7735q implements Function1<Integer, Unit> {
    ReturnMethodViewHolder$setTimeSlots$1$1(Object obj) {
        super(1, obj, ReturnDetailsViewModel.class, "onTimeSlotChange", "onTimeSlotChange(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((ReturnDetailsViewModel) this.receiver).onTimeSlotChange(i11);
    }
}
