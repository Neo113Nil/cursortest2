package cc0;

import android.text.Editable;
import android.text.Selection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OzonTextInput f56900b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CharSequence f56901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(OzonTextInput ozonTextInput, CharSequence charSequence) {
        super(0);
        this.f56900b = ozonTextInput;
        this.f56901c = charSequence;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OzonTextInput ozonTextInput = this.f56900b;
        Editable text = ozonTextInput.getText();
        CharSequence charSequence = this.f56901c;
        if (text != null) {
            text.replace(0, text.length(), charSequence);
        } else {
            ozonTextInput.setText(charSequence);
        }
        int selectionEnd = Selection.getSelectionEnd(charSequence);
        Integer valueOf = Integer.valueOf(selectionEnd);
        if (selectionEnd <= 0) {
            valueOf = null;
        }
        ozonTextInput.setSelection(valueOf != null ? valueOf.intValue() : charSequence.length());
        return Unit.f71690a;
    }
}
