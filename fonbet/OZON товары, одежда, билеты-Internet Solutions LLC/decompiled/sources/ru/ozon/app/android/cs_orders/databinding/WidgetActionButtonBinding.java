package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;

/* loaded from: classes11.dex */
public final class WidgetActionButtonBinding implements a {

    @NonNull
    public final TextView csmaActionTv;

    @NonNull
    public final FrameLayout csmaButtonContainerFl;

    @NonNull
    private final FrameLayout rootView;

    private WidgetActionButtonBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.csmaActionTv = textView;
        this.csmaButtonContainerFl = frameLayout2;
    }

    @NonNull
    public static WidgetActionButtonBinding bind(@NonNull View view) {
        int i11 = R$id.csmaActionTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new WidgetActionButtonBinding(frameLayout, textView, frameLayout);
    }

    @NonNull
    public static WidgetActionButtonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_action_button, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
