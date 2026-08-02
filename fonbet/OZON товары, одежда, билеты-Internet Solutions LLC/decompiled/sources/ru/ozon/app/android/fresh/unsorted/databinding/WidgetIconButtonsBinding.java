package ru.ozon.app.android.fresh.unsorted.databinding;

import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* loaded from: classes12.dex */
public final class WidgetIconButtonsBinding implements a {

    @NonNull
    public final LinearLayout iconButtonsContainer;

    @NonNull
    private final LinearLayout rootView;

    private WidgetIconButtonsBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.iconButtonsContainer = linearLayout2;
    }

    @NonNull
    public static WidgetIconButtonsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new WidgetIconButtonsBinding(linearLayout, linearLayout);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
