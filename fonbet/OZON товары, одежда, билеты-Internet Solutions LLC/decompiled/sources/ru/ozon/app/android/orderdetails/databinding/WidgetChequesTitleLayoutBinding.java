package ru.ozon.app.android.orderdetails.databinding;

import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes13.dex */
public final class WidgetChequesTitleLayoutBinding implements a {

    @NonNull
    public final TextView chequesTitleTv;

    @NonNull
    private final TextView rootView;

    private WidgetChequesTitleLayoutBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.chequesTitleTv = textView2;
    }

    @NonNull
    public static WidgetChequesTitleLayoutBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new WidgetChequesTitleLayoutBinding(textView, textView);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
