package ru.ozon.app.android.map.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.map.R$id;
import ru.ozon.app.android.map.R$layout;

/* loaded from: classes12.dex */
public final class ItemFormBlockFieldChipsBinding implements a {

    @NonNull
    public final TextInputEditText addressNameEt;

    @NonNull
    public final TextInputLayout addressNameTil;

    @NonNull
    public final HorizontalAtomsLayout chipsHAL;

    @NonNull
    private final LinearLayout rootView;

    private ItemFormBlockFieldChipsBinding(@NonNull LinearLayout linearLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull HorizontalAtomsLayout horizontalAtomsLayout) {
        this.rootView = linearLayout;
        this.addressNameEt = textInputEditText;
        this.addressNameTil = textInputLayout;
        this.chipsHAL = horizontalAtomsLayout;
    }

    @NonNull
    public static ItemFormBlockFieldChipsBinding bind(@NonNull View view) {
        int i11 = R$id.addressNameEt;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText != null) {
            i11 = R$id.addressNameTil;
            TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
            if (textInputLayout != null) {
                i11 = R$id.chipsHAL;
                HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
                if (horizontalAtomsLayout != null) {
                    return new ItemFormBlockFieldChipsBinding((LinearLayout) view, textInputEditText, textInputLayout, horizontalAtomsLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemFormBlockFieldChipsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_form_block_field_chips, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
