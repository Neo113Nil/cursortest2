package ru.ozon.app.android.common.commonwidgets.databinding;

import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public final class WidgetPageHeaderLayoutBinding implements a {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView text;

    private WidgetPageHeaderLayoutBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.text = textView2;
    }

    @NonNull
    public static WidgetPageHeaderLayoutBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new WidgetPageHeaderLayoutBinding(textView, textView);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
