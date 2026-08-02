package ru.ozon.app.android.travel.feature.oldwidgets.databinding;

import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class WidgetTravelModalPriceDetailInformationHeaderBinding implements a {

    @NonNull
    public final TextView headerTV;

    @NonNull
    private final TextView rootView;

    private WidgetTravelModalPriceDetailInformationHeaderBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.headerTV = textView2;
    }

    @NonNull
    public static WidgetTravelModalPriceDetailInformationHeaderBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new WidgetTravelModalPriceDetailInformationHeaderBinding(textView, textView);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
