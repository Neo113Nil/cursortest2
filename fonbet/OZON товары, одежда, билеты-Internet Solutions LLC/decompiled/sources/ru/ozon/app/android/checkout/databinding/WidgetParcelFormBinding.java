package ru.ozon.app.android.checkout.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class WidgetParcelFormBinding implements a {

    @NonNull
    public final VerticalAtomsLayout itemsVAL;

    @NonNull
    private final VerticalAtomsLayout rootView;

    private WidgetParcelFormBinding(@NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout2) {
        this.rootView = verticalAtomsLayout;
        this.itemsVAL = verticalAtomsLayout2;
    }

    @NonNull
    public static WidgetParcelFormBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) view;
        return new WidgetParcelFormBinding(verticalAtomsLayout, verticalAtomsLayout);
    }

    @Override // X4.a
    @NonNull
    public VerticalAtomsLayout getRoot() {
        return this.rootView;
    }
}
