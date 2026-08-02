package ru.ozon.app.android.fresh.navigation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.fresh.navigation.R$id;

/* loaded from: classes12.dex */
public final class DialogFragmentFreshTabOnboardingBinding implements a {

    @NonNull
    public final ImageView fakeFreshTab;

    @NonNull
    public final ConstraintLayout freshTabOnboardingRoot;

    @NonNull
    public final ImageView onBoardingCloseIcon;

    @NonNull
    public final TextView onBoardingDescription;

    @NonNull
    public final ImageView onBoardingImage;

    @NonNull
    public final TextView onBoardingTitle;

    @NonNull
    public final Guideline realFreshTabMiddle;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout tooltipContainer;

    private DialogFragmentFreshTabOnboardingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout3) {
        this.rootView = constraintLayout;
        this.fakeFreshTab = imageView;
        this.freshTabOnboardingRoot = constraintLayout2;
        this.onBoardingCloseIcon = imageView2;
        this.onBoardingDescription = textView;
        this.onBoardingImage = imageView3;
        this.onBoardingTitle = textView2;
        this.realFreshTabMiddle = guideline;
        this.tooltipContainer = constraintLayout3;
    }

    @NonNull
    public static DialogFragmentFreshTabOnboardingBinding bind(@NonNull View view) {
        int i11 = R$id.fakeFreshTab;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.onBoardingCloseIcon;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.onBoardingDescription;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.onBoardingImage;
                    ImageView imageView3 = (ImageView) C2548q.d(i11, view);
                    if (imageView3 != null) {
                        i11 = R$id.onBoardingTitle;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            i11 = R$id.realFreshTabMiddle;
                            Guideline guideline = (Guideline) C2548q.d(i11, view);
                            if (guideline != null) {
                                i11 = R$id.tooltipContainer;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C2548q.d(i11, view);
                                if (constraintLayout2 != null) {
                                    return new DialogFragmentFreshTabOnboardingBinding(constraintLayout, imageView, constraintLayout, imageView2, textView, imageView3, textView2, guideline, constraintLayout2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
