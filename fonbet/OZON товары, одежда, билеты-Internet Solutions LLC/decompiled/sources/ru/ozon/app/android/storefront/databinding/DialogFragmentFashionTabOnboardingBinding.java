package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.R$layout;

/* loaded from: classes2.dex */
public final class DialogFragmentFashionTabOnboardingBinding implements a {

    @NonNull
    public final ImageView fakeFashionTab;

    @NonNull
    public final FrameLayout fakeTabContainer;

    @NonNull
    public final ConstraintLayout fashionTabOnboardingRoot;

    @NonNull
    public final ImageView onBoardingCloseIcon;

    @NonNull
    public final TextView onBoardingDescription;

    @NonNull
    public final ImageView onBoardingImage;

    @NonNull
    public final TextView onBoardingTitle;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout tooltipContainer;

    private DialogFragmentFashionTabOnboardingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout3) {
        this.rootView = constraintLayout;
        this.fakeFashionTab = imageView;
        this.fakeTabContainer = frameLayout;
        this.fashionTabOnboardingRoot = constraintLayout2;
        this.onBoardingCloseIcon = imageView2;
        this.onBoardingDescription = textView;
        this.onBoardingImage = imageView3;
        this.onBoardingTitle = textView2;
        this.tooltipContainer = constraintLayout3;
    }

    @NonNull
    public static DialogFragmentFashionTabOnboardingBinding bind(@NonNull View view) {
        int i11 = R$id.fakeFashionTab;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.fakeTabContainer;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null) {
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
                                i11 = R$id.tooltipContainer;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C2548q.d(i11, view);
                                if (constraintLayout2 != null) {
                                    return new DialogFragmentFashionTabOnboardingBinding(constraintLayout, imageView, frameLayout, constraintLayout, imageView2, textView, imageView3, textView2, constraintLayout2);
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
    public static DialogFragmentFashionTabOnboardingBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.dialog_fragment_fashion_tab_onboarding, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
