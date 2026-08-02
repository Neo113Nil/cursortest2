package ru.ozon.app.android.atoms.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class AtomBulletElementsBinding implements a {

    @NonNull
    public final VerticalAtomsLayout itemsVAL;

    @NonNull
    private final VerticalAtomsLayout rootView;

    private AtomBulletElementsBinding(@NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout2) {
        this.rootView = verticalAtomsLayout;
        this.itemsVAL = verticalAtomsLayout2;
    }

    @NonNull
    public static AtomBulletElementsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) view;
        return new AtomBulletElementsBinding(verticalAtomsLayout, verticalAtomsLayout);
    }

    @Override // X4.a
    @NonNull
    public VerticalAtomsLayout getRoot() {
        return this.rootView;
    }
}
