package ru.ozon.app.android.uikit.view.input;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MobilizationTextInputLayout$passwordToggleView$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ MobilizationTextInputLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobilizationTextInputLayout$passwordToggleView$1$1(MobilizationTextInputLayout mobilizationTextInputLayout) {
        super(1);
        this.this$0 = mobilizationTextInputLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        textView = this.this$0.inputView;
        if (textView == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        int selectionStart = textView.getSelectionStart();
        textView2 = this.this$0.inputView;
        if (textView2 == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        int selectionEnd = textView2.getSelectionEnd();
        textView3 = this.this$0.inputView;
        if (textView3 == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        textView3.setTransformationMethod(z11 ? PasswordTransformationMethod.getInstance() : null);
        textView4 = this.this$0.inputView;
        if (textView4 == null) {
            Intrinsics.n("inputView");
            throw null;
        }
        TextView textView5 = textView4 instanceof EditText ? textView4 : null;
        if (textView5 != null) {
            ((EditText) textView5).setSelection(selectionStart, selectionEnd);
        }
    }
}
