package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class LayoutCouponGoalV2Binding implements a {

    @NonNull
    public final TextAtomV2View actionText;

    @NonNull
    public final BadgeView couponBadge;

    @NonNull
    public final ConstraintLayout couponContainer;

    @NonNull
    public final TextAtomV2View couponDescription;

    @NonNull
    public final Image couponIv;

    @NonNull
    public final ProgressBar couponProgress;

    @NonNull
    public final TextAtomV2View couponTitle;

    @NonNull
    public final Guideline perforationGuideline;

    @NonNull
    private final ConstraintLayout rootView;

    private LayoutCouponGoalV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull BadgeView badgeView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View2, @NonNull Image image, @NonNull ProgressBar progressBar, @NonNull TextAtomV2View textAtomV2View3, @NonNull Guideline guideline) {
        this.rootView = constraintLayout;
        this.actionText = textAtomV2View;
        this.couponBadge = badgeView;
        this.couponContainer = constraintLayout2;
        this.couponDescription = textAtomV2View2;
        this.couponIv = image;
        this.couponProgress = progressBar;
        this.couponTitle = textAtomV2View3;
        this.perforationGuideline = guideline;
    }

    @NonNull
    public static LayoutCouponGoalV2Binding bind(@NonNull View view) {
        int i11 = R$id.actionText;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.couponBadge;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.couponDescription;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    i11 = R$id.couponIv;
                    Image image = (Image) C2548q.d(i11, view);
                    if (image != null) {
                        i11 = R$id.couponProgress;
                        ProgressBar progressBar = (ProgressBar) C2548q.d(i11, view);
                        if (progressBar != null) {
                            i11 = R$id.couponTitle;
                            TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View3 != null) {
                                i11 = R$id.perforationGuideline;
                                Guideline guideline = (Guideline) C2548q.d(i11, view);
                                if (guideline != null) {
                                    return new LayoutCouponGoalV2Binding(constraintLayout, textAtomV2View, badgeView, constraintLayout, textAtomV2View2, image, progressBar, textAtomV2View3, guideline);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static LayoutCouponGoalV2Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.layout_coupon_goal_v2, viewGroup, false);
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
