package ru.ozon.app.android.storefront.domain.onboarding.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.domain.onboarding.R$id;
import ru.ozon.app.android.storefront.domain.onboarding.R$layout;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingBannerView;

/* loaded from: classes2.dex */
public final class StorefrontLayoutOnboardingBinding implements a {

    @NonNull
    public final OnboardingBannerView bannerObv;

    @NonNull
    public final ImageView cutDetailIv;

    @NonNull
    public final FrameLayout rootFl;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ImageView triangleIv;

    private StorefrontLayoutOnboardingBinding(@NonNull FrameLayout frameLayout, @NonNull OnboardingBannerView onboardingBannerView, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView2) {
        this.rootView = frameLayout;
        this.bannerObv = onboardingBannerView;
        this.cutDetailIv = imageView;
        this.rootFl = frameLayout2;
        this.triangleIv = imageView2;
    }

    @NonNull
    public static StorefrontLayoutOnboardingBinding bind(@NonNull View view) {
        int i11 = R$id.bannerObv;
        OnboardingBannerView onboardingBannerView = (OnboardingBannerView) C2548q.d(i11, view);
        if (onboardingBannerView != null) {
            i11 = R$id.cutDetailIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i11 = R$id.triangleIv;
                ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                if (imageView2 != null) {
                    return new StorefrontLayoutOnboardingBinding(frameLayout, onboardingBannerView, imageView, frameLayout, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static StorefrontLayoutOnboardingBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.storefront_layout_onboarding, viewGroup, false);
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
