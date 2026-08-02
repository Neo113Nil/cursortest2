package ru.ozon.app.android.cs_orders.databinding;

import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public final class WidgetNavBarItemLayoutBinding implements a {

    @NonNull
    public final FrameLayout buttonFl;

    @NonNull
    private final FrameLayout rootView;

    private WidgetNavBarItemLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.buttonFl = frameLayout2;
    }

    @NonNull
    public static WidgetNavBarItemLayoutBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new WidgetNavBarItemLayoutBinding(frameLayout, frameLayout);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
