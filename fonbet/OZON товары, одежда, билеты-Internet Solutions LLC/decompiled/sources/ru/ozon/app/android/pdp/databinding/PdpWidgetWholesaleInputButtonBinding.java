package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.textArea.TextAreaView;

/* loaded from: classes13.dex */
public final class PdpWidgetWholesaleInputButtonBinding implements a {

    @NonNull
    public final ButtonV3View buttonV3V;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAreaView textInput;

    private PdpWidgetWholesaleInputButtonBinding(@NonNull LinearLayout linearLayout, @NonNull ButtonV3View buttonV3View, @NonNull TextAreaView textAreaView) {
        this.rootView = linearLayout;
        this.buttonV3V = buttonV3View;
        this.textInput = textAreaView;
    }

    @NonNull
    public static PdpWidgetWholesaleInputButtonBinding bind(@NonNull View view) {
        int i11 = R$id.buttonV3V;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.textInput;
            TextAreaView textAreaView = (TextAreaView) C2548q.d(i11, view);
            if (textAreaView != null) {
                return new PdpWidgetWholesaleInputButtonBinding((LinearLayout) view, buttonV3View, textAreaView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
