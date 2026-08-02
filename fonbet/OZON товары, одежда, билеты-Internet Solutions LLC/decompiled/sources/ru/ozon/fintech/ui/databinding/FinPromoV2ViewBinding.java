package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class FinPromoV2ViewBinding implements a {

    @NonNull
    public final FrameLayout finIconDigitFrame;

    @NonNull
    public final ImageView finPromoV2ChevronImageView;

    @NonNull
    public final TextAtomView finPromoV2IconDigit;

    @NonNull
    public final ImageView finPromoV2ImageView;

    @NonNull
    public final ConstraintLayout finPromoV2Root;

    @NonNull
    public final TextAtomView finPromoV2Subtitle;

    @NonNull
    public final TextAtomView finPromoV2Title;

    @NonNull
    private final ConstraintLayout rootView;

    private FinPromoV2ViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.finIconDigitFrame = frameLayout;
        this.finPromoV2ChevronImageView = imageView;
        this.finPromoV2IconDigit = textAtomView;
        this.finPromoV2ImageView = imageView2;
        this.finPromoV2Root = constraintLayout2;
        this.finPromoV2Subtitle = textAtomView2;
        this.finPromoV2Title = textAtomView3;
    }

    @NonNull
    public static FinPromoV2ViewBinding bind(@NonNull View view) {
        int i11 = R.id.fin_icon_digit_frame;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.fin_icon_digit_frame, view);
        if (frameLayout != null) {
            i11 = R.id.fin_promo_v2_chevron_image_view;
            ImageView imageView = (ImageView) C2548q.d(R.id.fin_promo_v2_chevron_image_view, view);
            if (imageView != null) {
                i11 = R.id.fin_promo_v2_icon_digit;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(R.id.fin_promo_v2_icon_digit, view);
                if (textAtomView != null) {
                    i11 = R.id.fin_promo_v2_image_view;
                    ImageView imageView2 = (ImageView) C2548q.d(R.id.fin_promo_v2_image_view, view);
                    if (imageView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R.id.fin_promo_v2_subtitle;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(R.id.fin_promo_v2_subtitle, view);
                        if (textAtomView2 != null) {
                            i11 = R.id.fin_promo_v2_title;
                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(R.id.fin_promo_v2_title, view);
                            if (textAtomView3 != null) {
                                return new FinPromoV2ViewBinding(constraintLayout, frameLayout, imageView, textAtomView, imageView2, constraintLayout, textAtomView2, textAtomView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FinPromoV2ViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FinPromoV2ViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fin_promo_v2_view, viewGroup, false);
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
