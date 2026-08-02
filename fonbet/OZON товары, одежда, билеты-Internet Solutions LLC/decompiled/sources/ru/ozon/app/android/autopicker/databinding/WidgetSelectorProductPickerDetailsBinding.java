package ru.ozon.app.android.autopicker.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.autopicker.R$id;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class WidgetSelectorProductPickerDetailsBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final HorizontalFlexAtomsLayout tagsFal;

    @NonNull
    public final VerticalAtomsLayout textAtomVal;

    private WidgetSelectorProductPickerDetailsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout) {
        this.rootView = constraintLayout;
        this.tagsFal = horizontalFlexAtomsLayout;
        this.textAtomVal = verticalAtomsLayout;
    }

    @NonNull
    public static WidgetSelectorProductPickerDetailsBinding bind(@NonNull View view) {
        int i11 = R$id.tagsFal;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
        if (horizontalFlexAtomsLayout != null) {
            i11 = R$id.textAtomVal;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                return new WidgetSelectorProductPickerDetailsBinding((ConstraintLayout) view, horizontalFlexAtomsLayout, verticalAtomsLayout);
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
