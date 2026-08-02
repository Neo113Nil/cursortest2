package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class ReturnCreationDeliveryGroupBinding implements a {

    @NonNull
    public final CheckBoxView checkboxCbv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View titleTa;

    private ReturnCreationDeliveryGroupBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CheckBoxView checkBoxView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.checkboxCbv = checkBoxView;
        this.titleTa = textAtomV2View;
    }

    @NonNull
    public static ReturnCreationDeliveryGroupBinding bind(@NonNull View view) {
        int i11 = R$id.checkboxCbv;
        CheckBoxView checkBoxView = (CheckBoxView) C2548q.d(i11, view);
        if (checkBoxView != null) {
            i11 = R$id.titleTa;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new ReturnCreationDeliveryGroupBinding((ConstraintLayout) view, checkBoxView, textAtomV2View);
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
