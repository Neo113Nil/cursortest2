package ru.ozon.app.android.button.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.button.R$layout;

/* loaded from: classes11.dex */
public final class ItemButtonBlockBinding implements a {

    @NonNull
    public final ButtonAtom buttonBa;

    @NonNull
    private final ButtonAtom rootView;

    private ItemButtonBlockBinding(@NonNull ButtonAtom buttonAtom, @NonNull ButtonAtom buttonAtom2) {
        this.rootView = buttonAtom;
        this.buttonBa = buttonAtom2;
    }

    @NonNull
    public static ItemButtonBlockBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ButtonAtom buttonAtom = (ButtonAtom) view;
        return new ItemButtonBlockBinding(buttonAtom, buttonAtom);
    }

    @NonNull
    public static ItemButtonBlockBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_button_block, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ButtonAtom getConstraintLayout() {
        return this.rootView;
    }
}
