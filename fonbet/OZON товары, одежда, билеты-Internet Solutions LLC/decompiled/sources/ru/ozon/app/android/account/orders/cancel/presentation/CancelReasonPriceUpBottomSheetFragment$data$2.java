package ru.ozon.app.android.account.orders.cancel.presentation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.ConfirmingCancellationPopover;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CancelReasonPriceUpBottomSheetFragment$data$2 extends AbstractC7737t implements Function0<ConfirmingCancellationPopover> {
    final /* synthetic */ CancelReasonPriceUpBottomSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelReasonPriceUpBottomSheetFragment$data$2(CancelReasonPriceUpBottomSheetFragment cancelReasonPriceUpBottomSheetFragment) {
        super(0);
        this.this$0 = cancelReasonPriceUpBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ConfirmingCancellationPopover invoke() {
        Bundle arguments = this.this$0.getArguments();
        if (arguments != null) {
            return (ConfirmingCancellationPopover) arguments.getParcelable("modal_dialog_data");
        }
        return null;
    }
}
