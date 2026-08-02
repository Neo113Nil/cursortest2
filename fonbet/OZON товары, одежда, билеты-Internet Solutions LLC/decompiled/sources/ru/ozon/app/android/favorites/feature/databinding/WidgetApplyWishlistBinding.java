package ru.ozon.app.android.favorites.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.favorites.feature.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetApplyWishlistBinding implements a {

    @NonNull
    public final VerticalAtomsLayout cellsVAL;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ButtonV3View saveButton;

    @NonNull
    public final TextAtomV2View subtitleTav;

    @NonNull
    public final TextInputEditText titleEt;

    @NonNull
    public final TextAtomV2View titleTav;

    @NonNull
    public final TextInputLayout titleTil;

    private WidgetApplyWishlistBinding(@NonNull LinearLayout linearLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull ButtonV3View buttonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull TextInputEditText textInputEditText, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextInputLayout textInputLayout) {
        this.rootView = linearLayout;
        this.cellsVAL = verticalAtomsLayout;
        this.saveButton = buttonV3View;
        this.subtitleTav = textAtomV2View;
        this.titleEt = textInputEditText;
        this.titleTav = textAtomV2View2;
        this.titleTil = textInputLayout;
    }

    @NonNull
    public static WidgetApplyWishlistBinding bind(@NonNull View view) {
        int i11 = R$id.cellsVAL;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.saveButton;
            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View != null) {
                i11 = R$id.subtitleTav;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.titleEt;
                    TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
                    if (textInputEditText != null) {
                        i11 = R$id.titleTav;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            i11 = R$id.titleTil;
                            TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
                            if (textInputLayout != null) {
                                return new WidgetApplyWishlistBinding((LinearLayout) view, verticalAtomsLayout, buttonV3View, textAtomV2View, textInputEditText, textAtomV2View2, textInputLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
