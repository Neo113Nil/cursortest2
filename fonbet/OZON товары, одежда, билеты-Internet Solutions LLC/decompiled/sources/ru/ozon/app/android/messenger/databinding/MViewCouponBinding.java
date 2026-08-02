package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class MViewCouponBinding implements a {

    @NonNull
    public final TextAtomView couponApply;

    @NonNull
    public final ImageView couponImage;

    @NonNull
    public final ConstraintLayout couponLeft;

    @NonNull
    public final TextAtomView couponSubtitle;

    @NonNull
    public final TextAtomView couponTitle;

    @NonNull
    private final View rootView;

    private MViewCouponBinding(@NonNull View view, @NonNull TextAtomView textAtomView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = view;
        this.couponApply = textAtomView;
        this.couponImage = imageView;
        this.couponLeft = constraintLayout;
        this.couponSubtitle = textAtomView2;
        this.couponTitle = textAtomView3;
    }

    @NonNull
    public static MViewCouponBinding bind(@NonNull View view) {
        int i11 = R$id.couponApply;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.couponImage;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.couponLeft;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    i11 = R$id.couponSubtitle;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        i11 = R$id.couponTitle;
                        TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView3 != null) {
                            return new MViewCouponBinding(view, textAtomView, imageView, constraintLayout, textAtomView2, textAtomView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MViewCouponBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.m_view_coupon, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
