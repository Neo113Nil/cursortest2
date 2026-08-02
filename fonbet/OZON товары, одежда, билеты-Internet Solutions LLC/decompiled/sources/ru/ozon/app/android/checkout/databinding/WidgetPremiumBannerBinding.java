package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class WidgetPremiumBannerBinding implements a {

    @NonNull
    public final ImageView backgroundIv;

    @NonNull
    public final ImageView bannerIv;

    @NonNull
    public final VerticalAtomsLayout benefitsVal;

    @NonNull
    public final FrameAtomsLayout buttonFAL;

    @NonNull
    public final ConstraintLayout premiumBannerView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separatorV;

    private WidgetPremiumBannerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull FrameAtomsLayout frameAtomsLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull View view) {
        this.rootView = constraintLayout;
        this.backgroundIv = imageView;
        this.bannerIv = imageView2;
        this.benefitsVal = verticalAtomsLayout;
        this.buttonFAL = frameAtomsLayout;
        this.premiumBannerView = constraintLayout2;
        this.separatorV = view;
    }

    @NonNull
    public static WidgetPremiumBannerBinding bind(@NonNull View view) {
        int i11 = R$id.backgroundIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.bannerIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.benefitsVal;
                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                if (verticalAtomsLayout != null) {
                    i11 = R$id.buttonFAL;
                    FrameAtomsLayout frameAtomsLayout = (FrameAtomsLayout) C2548q.d(i11, view);
                    if (frameAtomsLayout != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R$id.separatorV;
                        View d11 = C2548q.d(i11, view);
                        if (d11 != null) {
                            return new WidgetPremiumBannerBinding(constraintLayout, imageView, imageView2, verticalAtomsLayout, frameAtomsLayout, constraintLayout, d11);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
