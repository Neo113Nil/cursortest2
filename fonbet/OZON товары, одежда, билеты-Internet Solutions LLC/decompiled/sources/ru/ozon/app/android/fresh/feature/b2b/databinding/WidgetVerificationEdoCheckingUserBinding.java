package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetVerificationEdoCheckingUserBinding implements a {

    @NonNull
    public final ButtonV3View button;

    @NonNull
    public final LinearLayout inputFieldsContainer;

    @NonNull
    public final TextAtomV2View requisites;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetVerificationEdoCheckingUserBinding(@NonNull LinearLayout linearLayout, @NonNull ButtonV3View buttonV3View, @NonNull LinearLayout linearLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = linearLayout;
        this.button = buttonV3View;
        this.inputFieldsContainer = linearLayout2;
        this.requisites = textAtomV2View;
        this.title = textAtomV2View2;
    }

    @NonNull
    public static WidgetVerificationEdoCheckingUserBinding bind(@NonNull View view) {
        int i11 = R$id.button;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.inputFieldsContainer;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                i11 = R$id.requisites;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.title;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new WidgetVerificationEdoCheckingUserBinding((LinearLayout) view, buttonV3View, linearLayout, textAtomV2View, textAtomV2View2);
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
