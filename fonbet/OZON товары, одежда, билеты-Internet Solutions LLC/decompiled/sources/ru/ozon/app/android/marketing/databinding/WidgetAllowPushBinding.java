package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.view.EnableNotificationsSuccessView;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.view.EnableNotificationsView;

/* loaded from: classes12.dex */
public final class WidgetAllowPushBinding implements a {

    @NonNull
    public final EnableNotificationsView allowPushApiView;

    @NonNull
    public final EnableNotificationsSuccessView allowPushSuccessView;

    @NonNull
    public final EnableNotificationsView allowPushSystemView;

    @NonNull
    private final FrameLayout rootView;

    private WidgetAllowPushBinding(@NonNull FrameLayout frameLayout, @NonNull EnableNotificationsView enableNotificationsView, @NonNull EnableNotificationsSuccessView enableNotificationsSuccessView, @NonNull EnableNotificationsView enableNotificationsView2) {
        this.rootView = frameLayout;
        this.allowPushApiView = enableNotificationsView;
        this.allowPushSuccessView = enableNotificationsSuccessView;
        this.allowPushSystemView = enableNotificationsView2;
    }

    @NonNull
    public static WidgetAllowPushBinding bind(@NonNull View view) {
        int i11 = R$id.allowPushApiView;
        EnableNotificationsView enableNotificationsView = (EnableNotificationsView) C2548q.d(i11, view);
        if (enableNotificationsView != null) {
            i11 = R$id.allowPushSuccessView;
            EnableNotificationsSuccessView enableNotificationsSuccessView = (EnableNotificationsSuccessView) C2548q.d(i11, view);
            if (enableNotificationsSuccessView != null) {
                i11 = R$id.allowPushSystemView;
                EnableNotificationsView enableNotificationsView2 = (EnableNotificationsView) C2548q.d(i11, view);
                if (enableNotificationsView2 != null) {
                    return new WidgetAllowPushBinding((FrameLayout) view, enableNotificationsView, enableNotificationsSuccessView, enableNotificationsView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
