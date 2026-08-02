package ru.ozon.app.android.autopicker.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class WidgetProductPickerResetButtonBinding implements a {

    @NonNull
    public final VerticalAtomsLayout atomsVal;

    @NonNull
    private final VerticalAtomsLayout rootView;

    private WidgetProductPickerResetButtonBinding(@NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout2) {
        this.rootView = verticalAtomsLayout;
        this.atomsVal = verticalAtomsLayout2;
    }

    @NonNull
    public static WidgetProductPickerResetButtonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) view;
        return new WidgetProductPickerResetButtonBinding(verticalAtomsLayout, verticalAtomsLayout);
    }

    @Override // X4.a
    @NonNull
    public VerticalAtomsLayout getRoot() {
        return this.rootView;
    }
}
