package ru.ozon.app.android.composer.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.R$layout;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingBannerView;

/* loaded from: classes11.dex */
public final class LayoutOnboardingBinding implements a {

    @NonNull
    public final OnBoardingBannerView bannerObv;

    @NonNull
    public final FrameLayout rootFl;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final View tapOnboardingArea;

    @NonNull
    public final ImageView triangleIv;

    private LayoutOnboardingBinding(@NonNull FrameLayout frameLayout, @NonNull OnBoardingBannerView onBoardingBannerView, @NonNull FrameLayout frameLayout2, @NonNull View view, @NonNull ImageView imageView) {
        this.rootView = frameLayout;
        this.bannerObv = onBoardingBannerView;
        this.rootFl = frameLayout2;
        this.tapOnboardingArea = view;
        this.triangleIv = imageView;
    }

    @NonNull
    public static LayoutOnboardingBinding bind(@NonNull View view) {
        int i11 = R$id.bannerObv;
        OnBoardingBannerView onBoardingBannerView = (OnBoardingBannerView) C2548q.d(i11, view);
        if (onBoardingBannerView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i11 = R$id.tapOnboardingArea;
            View d11 = C2548q.d(i11, view);
            if (d11 != null) {
                i11 = R$id.triangleIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    return new LayoutOnboardingBinding(frameLayout, onBoardingBannerView, frameLayout, d11, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static LayoutOnboardingBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.layout_onboarding, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
