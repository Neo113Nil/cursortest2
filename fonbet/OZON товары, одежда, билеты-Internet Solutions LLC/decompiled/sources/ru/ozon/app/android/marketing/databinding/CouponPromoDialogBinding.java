package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.R$layout;

/* loaded from: classes12.dex */
public final class CouponPromoDialogBinding implements a {

    @NonNull
    public final Button actionBtn;

    @NonNull
    public final FrameLayout buttonContainer;

    @NonNull
    public final ImageView navigationUpIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView stepsTv;

    @NonNull
    public final Toolbar toolbar;

    private CouponPromoDialogBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.actionBtn = button;
        this.buttonContainer = frameLayout;
        this.navigationUpIv = imageView;
        this.stepsTv = textView;
        this.toolbar = toolbar;
    }

    @NonNull
    public static CouponPromoDialogBinding bind(@NonNull View view) {
        int i11 = R$id.actionBtn;
        Button button = (Button) C2548q.d(i11, view);
        if (button != null) {
            i11 = R$id.buttonContainer;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null) {
                i11 = R$id.navigationUpIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.stepsTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        i11 = R$id.toolbar;
                        Toolbar toolbar = (Toolbar) C2548q.d(i11, view);
                        if (toolbar != null) {
                            return new CouponPromoDialogBinding((ConstraintLayout) view, button, frameLayout, imageView, textView, toolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static CouponPromoDialogBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.coupon_promo_dialog, viewGroup, false);
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
