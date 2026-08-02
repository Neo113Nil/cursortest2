package ru.ozon.app.android.orderdetails.cancelReasons.presentation.reasons;

import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "", "", "before", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SelectCancelReasonViewHolder$initTextWatcher$1 extends AbstractC7737t implements InterfaceC6512o<CharSequence, Integer, Integer, Integer, Unit> {
    final /* synthetic */ SelectCancelReasonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectCancelReasonViewHolder$initTextWatcher$1(SelectCancelReasonViewHolder selectCancelReasonViewHolder) {
        super(4);
        this.this$0 = selectCancelReasonViewHolder;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return Unit.f71690a;
    }

    public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
        boolean isKeyboardVisible;
        isKeyboardVisible = this.this$0.isKeyboardVisible();
        if (isKeyboardVisible || i12 <= 0) {
            return;
        }
        this.this$0.sendCommentAction();
    }
}
