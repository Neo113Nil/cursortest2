package ru.ozon.app.android.autopicker.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class WidgetSectionsProductPickerDetailsBinding implements a {

    @NonNull
    private final VerticalAtomsLayout rootView;

    @NonNull
    public final VerticalAtomsLayout sectionsVal;

    private WidgetSectionsProductPickerDetailsBinding(@NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout2) {
        this.rootView = verticalAtomsLayout;
        this.sectionsVal = verticalAtomsLayout2;
    }

    @NonNull
    public static WidgetSectionsProductPickerDetailsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) view;
        return new WidgetSectionsProductPickerDetailsBinding(verticalAtomsLayout, verticalAtomsLayout);
    }

    @Override // X4.a
    @NonNull
    public VerticalAtomsLayout getRoot() {
        return this.rootView;
    }
}
