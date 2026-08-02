package ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation;

import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.h;
import ru.ozon.uni.android.textArea.TextAreaView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "text", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class InputFormView$1$1 extends AbstractC7737t implements InterfaceC6512o<CharSequence, Integer, Integer, Integer, Unit> {
    final /* synthetic */ TextAreaView $this_apply;
    final /* synthetic */ InputFormView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputFormView$1$1(TextAreaView textAreaView, InputFormView inputFormView) {
        super(4);
        this.$this_apply = textAreaView;
        this.this$0 = inputFormView;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return Unit.f71690a;
    }

    public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
        boolean z11;
        this.$this_apply.setStatus(TextAreaView.Status.NEUTRAL);
        this.$this_apply.setCaption("");
        if (charSequence != null) {
            z11 = this.this$0.isCodeInput;
            if (z11 && h.t(charSequence, "\n", false)) {
                TextAreaView textAreaView = this.$this_apply;
                String inputText = textAreaView.getInputText();
                textAreaView.setInputText(inputText != null ? h.X(inputText, "\n", "", false) : null);
            }
        }
    }
}
