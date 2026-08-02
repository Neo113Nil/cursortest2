package ru.ozon.app.android.map.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.map.R$layout;

/* loaded from: classes12.dex */
public final class ItemFormBlockFieldCheckboxBinding implements a {

    @NonNull
    public final FrameAtomsLayout fieldFAL;

    @NonNull
    private final FrameAtomsLayout rootView;

    private ItemFormBlockFieldCheckboxBinding(@NonNull FrameAtomsLayout frameAtomsLayout, @NonNull FrameAtomsLayout frameAtomsLayout2) {
        this.rootView = frameAtomsLayout;
        this.fieldFAL = frameAtomsLayout2;
    }

    @NonNull
    public static ItemFormBlockFieldCheckboxBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameAtomsLayout frameAtomsLayout = (FrameAtomsLayout) view;
        return new ItemFormBlockFieldCheckboxBinding(frameAtomsLayout, frameAtomsLayout);
    }

    @NonNull
    public static ItemFormBlockFieldCheckboxBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_form_block_field_checkbox, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameAtomsLayout getRoot() {
        return this.rootView;
    }
}
