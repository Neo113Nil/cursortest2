package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.messenger.blocks.coupon.presentation.CouponView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockCouponBinding implements a {

    @NonNull
    public final ImageView banner;

    @NonNull
    public final ConstraintLayout buttonsContainerLL;

    @NonNull
    public final CouponView couponView;

    @NonNull
    private final ConstraintLayout rootView;

    private MBlockCouponBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull CouponView couponView) {
        this.rootView = constraintLayout;
        this.banner = imageView;
        this.buttonsContainerLL = constraintLayout2;
        this.couponView = couponView;
    }

    @NonNull
    public static MBlockCouponBinding bind(@NonNull View view) {
        int i11 = R$id.banner;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i12 = R$id.couponView;
            CouponView couponView = (CouponView) C2548q.d(i12, view);
            if (couponView != null) {
                return new MBlockCouponBinding(constraintLayout, imageView, constraintLayout, couponView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockCouponBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_coupon, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
