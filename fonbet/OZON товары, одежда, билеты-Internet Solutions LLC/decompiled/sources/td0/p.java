package td0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;

/* loaded from: classes3.dex */
public final class p {
    public static final void a(@NotNull TextFieldCellView textFieldCellView) {
        Intrinsics.checkNotNullParameter(textFieldCellView, "<this>");
        OzonTextInput inputView = textFieldCellView.getMainView().getInputViewGroup().getInputView();
        Object tag = inputView.getTag(inputView.getId());
        h hVar = tag instanceof h ? (h) tag : null;
        if (hVar == null) {
            return;
        }
        inputView.setTag(inputView.getId(), null);
        inputView.getViewTreeObserver().removeOnGlobalFocusChangeListener(hVar);
    }

    public static final void b(@NotNull TextFieldCellView textFieldCellView, String str, @NotNull Function1<? super String, Unit> trackFocus) {
        Intrinsics.checkNotNullParameter(textFieldCellView, "<this>");
        Intrinsics.checkNotNullParameter(trackFocus, "trackFocus");
        a(textFieldCellView);
        if (str == null) {
            return;
        }
        OzonTextInput inputView = textFieldCellView.getMainView().getInputViewGroup().getInputView();
        h hVar = new h(inputView, str, trackFocus);
        inputView.setTag(inputView.getId(), hVar);
        inputView.getViewTreeObserver().addOnGlobalFocusChangeListener(hVar);
        inputView.addOnAttachStateChangeListener(new o(inputView, hVar));
    }
}
