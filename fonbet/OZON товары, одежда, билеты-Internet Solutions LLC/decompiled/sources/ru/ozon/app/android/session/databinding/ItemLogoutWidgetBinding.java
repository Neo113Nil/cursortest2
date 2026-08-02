package ru.ozon.app.android.session.databinding;

import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class ItemLogoutWidgetBinding implements a {

    @NonNull
    public final TextView logoutTv;

    @NonNull
    private final TextView rootView;

    private ItemLogoutWidgetBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.logoutTv = textView2;
    }

    @NonNull
    public static ItemLogoutWidgetBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ItemLogoutWidgetBinding(textView, textView);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
