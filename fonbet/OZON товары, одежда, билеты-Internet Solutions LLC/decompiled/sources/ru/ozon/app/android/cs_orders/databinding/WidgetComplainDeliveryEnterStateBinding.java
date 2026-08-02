package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.cs_orders.R$id;

/* loaded from: classes11.dex */
public final class WidgetComplainDeliveryEnterStateBinding implements a {

    @NonNull
    public final TextInputEditText complainInput;

    @NonNull
    public final TextView complainInputDescription;

    @NonNull
    public final TextInputLayout enterComplainLayout;

    @NonNull
    public final LinearLayout enterComplainStateContainer;

    @NonNull
    private final LinearLayout rootView;

    private WidgetComplainDeliveryEnterStateBinding(@NonNull LinearLayout linearLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.complainInput = textInputEditText;
        this.complainInputDescription = textView;
        this.enterComplainLayout = textInputLayout;
        this.enterComplainStateContainer = linearLayout2;
    }

    @NonNull
    public static WidgetComplainDeliveryEnterStateBinding bind(@NonNull View view) {
        int i11 = R$id.complainInput;
        TextInputEditText textInputEditText = (TextInputEditText) C2548q.d(i11, view);
        if (textInputEditText != null) {
            i11 = R$id.complainInputDescription;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.enterComplainLayout;
                TextInputLayout textInputLayout = (TextInputLayout) C2548q.d(i11, view);
                if (textInputLayout != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new WidgetComplainDeliveryEnterStateBinding(linearLayout, textInputEditText, textView, textInputLayout, linearLayout);
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
