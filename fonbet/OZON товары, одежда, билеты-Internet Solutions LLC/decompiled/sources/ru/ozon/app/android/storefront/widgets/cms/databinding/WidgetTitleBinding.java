package ru.ozon.app.android.storefront.widgets.cms.databinding;

import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class WidgetTitleBinding implements a {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetTitleBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static WidgetTitleBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new WidgetTitleBinding(textView, textView);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
