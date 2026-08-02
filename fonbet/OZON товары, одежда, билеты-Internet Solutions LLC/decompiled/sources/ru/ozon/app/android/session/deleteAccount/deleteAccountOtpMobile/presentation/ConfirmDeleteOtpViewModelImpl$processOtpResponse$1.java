package ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$Action;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApiResponse;)Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ConfirmDeleteOtpViewModelImpl$processOtpResponse$1 extends AbstractC7737t implements Function1<DeleteAccountApiResponse, ConfirmDeleteOtpViewModel.Action> {
    final /* synthetic */ ConfirmDeleteOtpViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmDeleteOtpViewModelImpl$processOtpResponse$1(ConfirmDeleteOtpViewModelImpl confirmDeleteOtpViewModelImpl) {
        super(1);
        this.this$0 = confirmDeleteOtpViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ConfirmDeleteOtpViewModel.Action invoke(DeleteAccountApiResponse it) {
        ConfirmDeleteOtpViewModel.Action action;
        Intrinsics.checkNotNullParameter(it, "it");
        action = this.this$0.toAction(it);
        return action;
    }
}
