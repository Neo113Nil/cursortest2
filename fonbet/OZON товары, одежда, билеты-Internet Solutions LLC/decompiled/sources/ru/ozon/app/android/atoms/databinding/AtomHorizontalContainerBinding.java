package ru.ozon.app.android.atoms.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;

/* loaded from: classes11.dex */
public final class AtomHorizontalContainerBinding implements a {

    @NonNull
    public final HorizontalAtomsLayout itemsHAL;

    @NonNull
    private final HorizontalAtomsLayout rootView;

    private AtomHorizontalContainerBinding(@NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull HorizontalAtomsLayout horizontalAtomsLayout2) {
        this.rootView = horizontalAtomsLayout;
        this.itemsHAL = horizontalAtomsLayout2;
    }

    @NonNull
    public static AtomHorizontalContainerBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) view;
        return new AtomHorizontalContainerBinding(horizontalAtomsLayout, horizontalAtomsLayout);
    }

    @Override // X4.a
    @NonNull
    public HorizontalAtomsLayout getRoot() {
        return this.rootView;
    }
}
