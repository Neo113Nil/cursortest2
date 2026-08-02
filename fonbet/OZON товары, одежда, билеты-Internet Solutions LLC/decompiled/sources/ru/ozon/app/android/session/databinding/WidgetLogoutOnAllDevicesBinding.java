package ru.ozon.app.android.session.databinding;

import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class WidgetLogoutOnAllDevicesBinding implements a {

    @NonNull
    public final TextView logoutOnAllDevicesTv;

    @NonNull
    private final TextView rootView;

    private WidgetLogoutOnAllDevicesBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.logoutOnAllDevicesTv = textView2;
    }

    @NonNull
    public static WidgetLogoutOnAllDevicesBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new WidgetLogoutOnAllDevicesBinding(textView, textView);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
