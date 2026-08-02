package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class MBlockOnboardingBinding implements a {

    @NonNull
    public final Barrier OnboardingBarrier;

    @NonNull
    public final LottieAnimationView onboardingAnimationView;

    @NonNull
    public final ButtonV3View onboardingCancelButton;

    @NonNull
    public final Image onboardingImage;

    @NonNull
    public final TextAtomV2View onboardingSubtitle;

    @NonNull
    public final TextAtomV2View onboardingTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private MBlockOnboardingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull LottieAnimationView lottieAnimationView, @NonNull ButtonV3View buttonV3View, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.OnboardingBarrier = barrier;
        this.onboardingAnimationView = lottieAnimationView;
        this.onboardingCancelButton = buttonV3View;
        this.onboardingImage = image;
        this.onboardingSubtitle = textAtomV2View;
        this.onboardingTitle = textAtomV2View2;
    }

    @NonNull
    public static MBlockOnboardingBinding bind(@NonNull View view) {
        int i11 = R$id._onboarding_barrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.onboarding_animation_view;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C2548q.d(i11, view);
            if (lottieAnimationView != null) {
                i11 = R$id.onboarding_cancel_button;
                ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                if (buttonV3View != null) {
                    i11 = R$id.onboarding_image;
                    Image image = (Image) C2548q.d(i11, view);
                    if (image != null) {
                        i11 = R$id.onboarding_subtitle;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.onboarding_title;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                return new MBlockOnboardingBinding((ConstraintLayout) view, barrier, lottieAnimationView, buttonV3View, image, textAtomV2View, textAtomV2View2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockOnboardingBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_onboarding, viewGroup, false);
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
