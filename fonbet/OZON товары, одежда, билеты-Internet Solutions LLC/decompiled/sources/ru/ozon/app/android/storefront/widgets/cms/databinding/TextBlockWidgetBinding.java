package ru.ozon.app.android.storefront.widgets.cms.databinding;

import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class TextBlockWidgetBinding implements a {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView textBlockWidgetTv;

    private TextBlockWidgetBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.textBlockWidgetTv = textView2;
    }

    @NonNull
    public static TextBlockWidgetBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new TextBlockWidgetBinding(textView, textView);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
