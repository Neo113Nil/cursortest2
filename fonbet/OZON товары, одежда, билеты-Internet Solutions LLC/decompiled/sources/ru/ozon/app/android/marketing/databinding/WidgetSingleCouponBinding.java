package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.CouponView;

/* loaded from: classes12.dex */
public final class WidgetSingleCouponBinding implements a {

    @NonNull
    public final CouponView rootCv;

    @NonNull
    public final FrameLayout rootFl;

    @NonNull
    private final FrameLayout rootView;

    private WidgetSingleCouponBinding(@NonNull FrameLayout frameLayout, @NonNull CouponView couponView, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.rootCv = couponView;
        this.rootFl = frameLayout2;
    }

    @NonNull
    public static WidgetSingleCouponBinding bind(@NonNull View view) {
        int i11 = R$id.rootCv;
        CouponView couponView = (CouponView) C2548q.d(i11, view);
        if (couponView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new WidgetSingleCouponBinding(frameLayout, couponView, frameLayout);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
