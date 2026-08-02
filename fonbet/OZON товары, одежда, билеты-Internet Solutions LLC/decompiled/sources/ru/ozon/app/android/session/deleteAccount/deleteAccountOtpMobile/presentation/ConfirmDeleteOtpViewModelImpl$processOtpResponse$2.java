package ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation;

import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.OrdersCountStorage;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$Action;", "Lkotlin/jvm/internal/EnhancedNullability;", "response", "Lio/reactivex/C;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$Action;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ConfirmDeleteOtpViewModelImpl$processOtpResponse$2 extends AbstractC7737t implements Function1<ConfirmDeleteOtpViewModel.Action, C<? extends ConfirmDeleteOtpViewModel.Action>> {
    final /* synthetic */ ConfirmDeleteOtpViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmDeleteOtpViewModelImpl$processOtpResponse$2(ConfirmDeleteOtpViewModelImpl confirmDeleteOtpViewModelImpl) {
        super(1);
        this.this$0 = confirmDeleteOtpViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends ConfirmDeleteOtpViewModel.Action> invoke(ConfirmDeleteOtpViewModel.Action response) {
        OrdersCountStorage ordersCountStorage;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response instanceof ConfirmDeleteOtpViewModel.Action.Complete) {
            ordersCountStorage = this.this$0.ordersCountStorage;
            ordersCountStorage.clearOrdersAndNotificationsCount();
        }
        return y.f(response);
    }
}
