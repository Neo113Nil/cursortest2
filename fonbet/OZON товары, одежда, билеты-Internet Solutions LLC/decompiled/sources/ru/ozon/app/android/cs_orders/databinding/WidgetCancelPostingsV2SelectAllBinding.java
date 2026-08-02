package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.cs_orders.R$id;

/* loaded from: classes11.dex */
public final class WidgetCancelPostingsV2SelectAllBinding implements a {

    @NonNull
    public final View checkboxV;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatTextView titleTv;

    private WidgetCancelPostingsV2SelectAllBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.checkboxV = view;
        this.titleTv = appCompatTextView;
    }

    @NonNull
    public static WidgetCancelPostingsV2SelectAllBinding bind(@NonNull View view) {
        int i11 = R$id.checkboxV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.titleTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                return new WidgetCancelPostingsV2SelectAllBinding((LinearLayout) view, d11, appCompatTextView);
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
