package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes2.dex */
public final class WidgetEditUserFullNameBinding implements a {

    @NonNull
    public final LinearLayout inputsLl;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LargeButtonView submitButtonView;

    @NonNull
    public final TextView titleTv;

    private WidgetEditUserFullNameBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LargeButtonView largeButtonView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.inputsLl = linearLayout2;
        this.submitButtonView = largeButtonView;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetEditUserFullNameBinding bind(@NonNull View view) {
        int i11 = R$id.inputsLl;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.submitButtonView;
            LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
            if (largeButtonView != null) {
                i11 = R$id.titleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new WidgetEditUserFullNameBinding((LinearLayout) view, linearLayout, largeButtonView, textView);
                }
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
