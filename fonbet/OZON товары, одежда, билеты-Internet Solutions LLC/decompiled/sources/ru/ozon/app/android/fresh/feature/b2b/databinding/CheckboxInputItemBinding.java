package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class CheckboxInputItemBinding implements a {

    @NonNull
    public final AppCompatCheckBox radioButtonView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View subtitleTav;

    private CheckboxInputItemBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.radioButtonView = appCompatCheckBox;
        this.subtitleTav = textAtomV2View;
    }

    @NonNull
    public static CheckboxInputItemBinding bind(@NonNull View view) {
        int i11 = R$id.radioButtonView;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) C2548q.d(i11, view);
        if (appCompatCheckBox != null) {
            i11 = R$id.subtitleTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new CheckboxInputItemBinding((LinearLayout) view, appCompatCheckBox, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static CheckboxInputItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.checkbox_input_item, viewGroup, false);
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
