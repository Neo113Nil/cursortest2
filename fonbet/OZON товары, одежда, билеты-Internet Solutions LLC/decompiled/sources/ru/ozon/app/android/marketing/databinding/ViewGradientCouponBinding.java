package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class ViewGradientCouponBinding implements a {

    @NonNull
    public final TextAtomView gradientCouponApplyTV;

    @NonNull
    public final TextAtomView gradientCouponCodeTV;

    @NonNull
    public final TextAtomView gradientCouponSubtitleTV;

    @NonNull
    private final View rootView;

    private ViewGradientCouponBinding(@NonNull View view, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = view;
        this.gradientCouponApplyTV = textAtomView;
        this.gradientCouponCodeTV = textAtomView2;
        this.gradientCouponSubtitleTV = textAtomView3;
    }

    @NonNull
    public static ViewGradientCouponBinding bind(@NonNull View view) {
        int i11 = R$id.gradientCouponApplyTV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.gradientCouponCodeTV;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.gradientCouponSubtitleTV;
                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView3 != null) {
                    return new ViewGradientCouponBinding(view, textAtomView, textAtomView2, textAtomView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewGradientCouponBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_gradient_coupon, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
