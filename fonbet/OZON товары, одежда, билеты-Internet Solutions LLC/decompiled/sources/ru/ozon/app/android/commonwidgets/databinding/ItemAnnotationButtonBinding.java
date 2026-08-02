package ru.ozon.app.android.commonwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;

/* loaded from: classes11.dex */
public final class ItemAnnotationButtonBinding implements a {

    @NonNull
    public final ButtonAtom buttonBa;

    @NonNull
    private final ButtonAtom rootView;

    private ItemAnnotationButtonBinding(@NonNull ButtonAtom buttonAtom, @NonNull ButtonAtom buttonAtom2) {
        this.rootView = buttonAtom;
        this.buttonBa = buttonAtom2;
    }

    @NonNull
    public static ItemAnnotationButtonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ButtonAtom buttonAtom = (ButtonAtom) view;
        return new ItemAnnotationButtonBinding(buttonAtom, buttonAtom);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ButtonAtom getConstraintLayout() {
        return this.rootView;
    }
}
