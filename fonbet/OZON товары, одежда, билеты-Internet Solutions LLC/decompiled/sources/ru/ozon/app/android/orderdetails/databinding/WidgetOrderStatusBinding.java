package ru.ozon.app.android.orderdetails.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.android.atom.badge.BadgeView;

/* loaded from: classes13.dex */
public final class WidgetOrderStatusBinding implements a {

    @NonNull
    public final BadgeView orderStatusTv;

    @NonNull
    private final BadgeView rootView;

    private WidgetOrderStatusBinding(@NonNull BadgeView badgeView, @NonNull BadgeView badgeView2) {
        this.rootView = badgeView;
        this.orderStatusTv = badgeView2;
    }

    @NonNull
    public static WidgetOrderStatusBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BadgeView badgeView = (BadgeView) view;
        return new WidgetOrderStatusBinding(badgeView, badgeView);
    }

    @Override // X4.a
    @NonNull
    public BadgeView getRoot() {
        return this.rootView;
    }
}
