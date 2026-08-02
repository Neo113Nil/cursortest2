package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.presentation.DotWithCircleView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes11.dex */
public final class WidgetEnableNotificationWithReplacementButtonBinding implements a {

    @NonNull
    public final DotWithCircleView notificationDot;

    @NonNull
    public final SmallIconButtonView notificationIconButton;

    @NonNull
    private final FrameLayout rootView;

    private WidgetEnableNotificationWithReplacementButtonBinding(@NonNull FrameLayout frameLayout, @NonNull DotWithCircleView dotWithCircleView, @NonNull SmallIconButtonView smallIconButtonView) {
        this.rootView = frameLayout;
        this.notificationDot = dotWithCircleView;
        this.notificationIconButton = smallIconButtonView;
    }

    @NonNull
    public static WidgetEnableNotificationWithReplacementButtonBinding bind(@NonNull View view) {
        int i11 = R$id.notificationDot;
        DotWithCircleView dotWithCircleView = (DotWithCircleView) C2548q.d(i11, view);
        if (dotWithCircleView != null) {
            i11 = R$id.notificationIconButton;
            SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
            if (smallIconButtonView != null) {
                return new WidgetEnableNotificationWithReplacementButtonBinding((FrameLayout) view, dotWithCircleView, smallIconButtonView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
