package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonView;

/* loaded from: classes13.dex */
public final class FragmentSingleReviewBottomSheetBinding implements a {

    @NonNull
    public final SocialIconButtonView closeButton;

    @NonNull
    public final TextView headerTV;

    @NonNull
    public final FrameLayout reviewContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout singleReviewBottomSheet;

    private FragmentSingleReviewBottomSheetBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SocialIconButtonView socialIconButtonView, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.closeButton = socialIconButtonView;
        this.headerTV = textView;
        this.reviewContainer = frameLayout;
        this.singleReviewBottomSheet = constraintLayout2;
    }

    @NonNull
    public static FragmentSingleReviewBottomSheetBinding bind(@NonNull View view) {
        int i11 = R$id.closeButton;
        SocialIconButtonView socialIconButtonView = (SocialIconButtonView) C2548q.d(i11, view);
        if (socialIconButtonView != null) {
            i11 = R$id.headerTV;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.reviewContainer;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new FragmentSingleReviewBottomSheetBinding(constraintLayout, socialIconButtonView, textView, frameLayout, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentSingleReviewBottomSheetBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_single_review_bottom_sheet, viewGroup, false);
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
