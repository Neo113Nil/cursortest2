package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cs_orders.R$id;

/* loaded from: classes11.dex */
public final class WidgetSelectPaymentLayoutBinding implements a {

    @NonNull
    public final View checkboxV;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetSelectPaymentLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.checkboxV = view;
        this.iconIv = imageView;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetSelectPaymentLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.checkboxV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.iconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.titleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new WidgetSelectPaymentLayoutBinding((ConstraintLayout) view, d11, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
