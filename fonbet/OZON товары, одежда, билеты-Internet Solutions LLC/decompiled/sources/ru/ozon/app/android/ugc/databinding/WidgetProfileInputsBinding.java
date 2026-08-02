package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes2.dex */
public final class WidgetProfileInputsBinding implements a {

    @NonNull
    public final ButtonV3View profileInputSubmitButton;

    @NonNull
    public final TextFieldCellView profileInputView;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetProfileInputsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull TextFieldCellView textFieldCellView) {
        this.rootView = constraintLayout;
        this.profileInputSubmitButton = buttonV3View;
        this.profileInputView = textFieldCellView;
    }

    @NonNull
    public static WidgetProfileInputsBinding bind(@NonNull View view) {
        int i11 = R$id.profileInputSubmitButton;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.profileInputView;
            TextFieldCellView textFieldCellView = (TextFieldCellView) C2548q.d(i11, view);
            if (textFieldCellView != null) {
                return new WidgetProfileInputsBinding((ConstraintLayout) view, buttonV3View, textFieldCellView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
