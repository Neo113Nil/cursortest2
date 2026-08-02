package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.textArea.TextAreaView;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<unused var>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class InputFieldView$textArea$1$1$1 extends AbstractC7737t implements InterfaceC6512o<CharSequence, Integer, Integer, Integer, Unit> {
    final /* synthetic */ TextAreaView $this_apply;
    final /* synthetic */ InputFieldView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputFieldView$textArea$1$1$1(InputFieldView inputFieldView, TextAreaView textAreaView) {
        super(4);
        this.this$0 = inputFieldView;
        this.$this_apply = textAreaView;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return Unit.f71690a;
    }

    public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
        this.this$0.hideError(this.$this_apply);
    }
}
