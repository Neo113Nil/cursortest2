package ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data.ConfirmDeleteOtpDTO;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ConfirmDeleteOtpViewModelImpl$setTimer$3 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ int $duration;
    final /* synthetic */ String $repeatMsg;
    final /* synthetic */ ConfirmDeleteOtpDTO.Timer $timer;
    final /* synthetic */ ConfirmDeleteOtpViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmDeleteOtpViewModelImpl$setTimer$3(ConfirmDeleteOtpViewModelImpl confirmDeleteOtpViewModelImpl, ConfirmDeleteOtpDTO.Timer timer, int i11, String str) {
        super(1);
        this.this$0 = confirmDeleteOtpViewModelImpl;
        this.$timer = timer;
        this.$duration = i11;
        this.$repeatMsg = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke2(l11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Long l11) {
        SingleLiveEvent<ConfirmDeleteOtpViewModel.Action> action = this.this$0.getAction();
        String messageFormat = this.$timer.getMessageFormat();
        long j11 = this.$duration;
        Intrinsics.f(l11);
        action.setValue(new ConfirmDeleteOtpViewModel.Action.UpdateTimer(false, messageFormat, this.$repeatMsg, Integer.valueOf((int) (j11 - l11.longValue()))));
    }
}
