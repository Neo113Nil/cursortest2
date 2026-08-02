package ru.ozon.app.android.orderdetails.databinding;

import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes13.dex */
public final class ItemOrderShipmentLayoutTextBinding implements a {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView textTv;

    private ItemOrderShipmentLayoutTextBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.textTv = textView2;
    }

    @NonNull
    public static ItemOrderShipmentLayoutTextBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ItemOrderShipmentLayoutTextBinding(textView, textView);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
