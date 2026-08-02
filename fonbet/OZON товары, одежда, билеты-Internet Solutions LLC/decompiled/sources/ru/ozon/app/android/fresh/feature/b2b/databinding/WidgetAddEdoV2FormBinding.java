package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellView;

/* loaded from: classes12.dex */
public final class WidgetAddEdoV2FormBinding implements a {

    @NonNull
    public final DisclaimerContainer addEdoAnnotation;

    @NonNull
    public final TextFieldCellView addEdoTextFieldCellView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetAddEdoV2FormBinding(@NonNull LinearLayout linearLayout, @NonNull DisclaimerContainer disclaimerContainer, @NonNull TextFieldCellView textFieldCellView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.addEdoAnnotation = disclaimerContainer;
        this.addEdoTextFieldCellView = textFieldCellView;
        this.title = textAtomV2View;
    }

    @NonNull
    public static WidgetAddEdoV2FormBinding bind(@NonNull View view) {
        int i11 = R$id.addEdoAnnotation;
        DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
        if (disclaimerContainer != null) {
            i11 = R$id.addEdoTextFieldCellView;
            TextFieldCellView textFieldCellView = (TextFieldCellView) C2548q.d(i11, view);
            if (textFieldCellView != null) {
                i11 = R$id.title;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new WidgetAddEdoV2FormBinding((LinearLayout) view, disclaimerContainer, textFieldCellView, textAtomV2View);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
