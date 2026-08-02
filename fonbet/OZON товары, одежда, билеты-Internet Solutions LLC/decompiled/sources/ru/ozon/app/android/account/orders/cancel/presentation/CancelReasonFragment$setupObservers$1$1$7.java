package ru.ozon.app.android.account.orders.cancel.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.ConfirmingCancellationPopover;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class CancelReasonFragment$setupObservers$1$1$7 extends C7735q implements Function1<ConfirmingCancellationPopover, Unit> {
    CancelReasonFragment$setupObservers$1$1$7(Object obj) {
        super(1, obj, CancelReasonFragment.class, "showDialogFragment", "showDialogFragment(Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConfirmingCancellationPopover confirmingCancellationPopover) {
        invoke2(confirmingCancellationPopover);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConfirmingCancellationPopover confirmingCancellationPopover) {
        ((CancelReasonFragment) this.receiver).showDialogFragment(confirmingCancellationPopover);
    }
}
