package ru.ozon.app.android.map.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.map.R$layout;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class ItemFormBlockFieldAtomsBinding implements a {

    @NonNull
    public final VerticalAtomsLayout atomsVAL;

    @NonNull
    private final VerticalAtomsLayout rootView;

    private ItemFormBlockFieldAtomsBinding(@NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout2) {
        this.rootView = verticalAtomsLayout;
        this.atomsVAL = verticalAtomsLayout2;
    }

    @NonNull
    public static ItemFormBlockFieldAtomsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) view;
        return new ItemFormBlockFieldAtomsBinding(verticalAtomsLayout, verticalAtomsLayout);
    }

    @NonNull
    public static ItemFormBlockFieldAtomsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_form_block_field_atoms, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public VerticalAtomsLayout getRoot() {
        return this.rootView;
    }
}
