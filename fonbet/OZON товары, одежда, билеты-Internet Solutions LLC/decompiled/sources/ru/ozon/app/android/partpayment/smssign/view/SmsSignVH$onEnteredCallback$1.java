package ru.ozon.app.android.partpayment.smssign.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewMapper;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "s", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SmsSignVH$onEnteredCallback$1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
    final /* synthetic */ SmsSignVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmsSignVH$onEnteredCallback$1(SmsSignVH smsSignVH) {
        super(1);
        this.this$0 = smsSignVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence s11) {
        ComposerReferences composerReferences;
        SmsSignVO smsSignVO;
        SmsSignVO smsSignVO2;
        SmsSignViewModel smsSignViewModel;
        Intrinsics.checkNotNullParameter(s11, "s");
        String obj = s11.toString();
        composerReferences = this.this$0.references;
        composerReferences.getController().d(new SmsSignViewMapper.PinUpdate(obj));
        smsSignVO = this.this$0.currentItem;
        if (smsSignVO != null) {
            smsSignVO2 = this.this$0.currentItem;
            if (smsSignVO2 == null || obj.length() != smsSignVO2.getCodeLength()) {
                smsSignVO = null;
            }
            if (smsSignVO != null) {
                smsSignViewModel = this.this$0.viewModel;
                smsSignViewModel.checkPin(smsSignVO.getApproveUrl(), obj);
            }
        }
    }
}
