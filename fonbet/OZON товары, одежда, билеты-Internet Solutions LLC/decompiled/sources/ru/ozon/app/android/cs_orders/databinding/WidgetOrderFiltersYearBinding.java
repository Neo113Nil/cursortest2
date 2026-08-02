package ru.ozon.app.android.cs_orders.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cs_orders.R$layout;

/* loaded from: classes11.dex */
public final class WidgetOrderFiltersYearBinding implements a {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView yearTv;

    private WidgetOrderFiltersYearBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.yearTv = textView2;
    }

    @NonNull
    public static WidgetOrderFiltersYearBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new WidgetOrderFiltersYearBinding(textView, textView);
    }

    @NonNull
    public static WidgetOrderFiltersYearBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_order_filters_year, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
