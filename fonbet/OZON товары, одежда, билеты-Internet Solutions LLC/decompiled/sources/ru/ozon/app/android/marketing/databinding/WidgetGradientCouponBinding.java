package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.common.view.GradientCouponView;

/* loaded from: classes12.dex */
public final class WidgetGradientCouponBinding implements a {

    @NonNull
    public final GradientCouponView couponView;

    @NonNull
    private final FrameLayout rootView;

    private WidgetGradientCouponBinding(@NonNull FrameLayout frameLayout, @NonNull GradientCouponView gradientCouponView) {
        this.rootView = frameLayout;
        this.couponView = gradientCouponView;
    }

    @NonNull
    public static WidgetGradientCouponBinding bind(@NonNull View view) {
        int i11 = R$id.couponView;
        GradientCouponView gradientCouponView = (GradientCouponView) C2548q.d(i11, view);
        if (gradientCouponView != null) {
            return new WidgetGradientCouponBinding((FrameLayout) view, gradientCouponView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
