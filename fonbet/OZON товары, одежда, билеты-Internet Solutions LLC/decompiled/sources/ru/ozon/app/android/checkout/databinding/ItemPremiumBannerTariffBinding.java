package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class ItemPremiumBannerTariffBinding implements a {

    @NonNull
    public final TextView badgeTv;

    @NonNull
    public final FrameAtomsLayout benefitsFAL;

    @NonNull
    public final FrameAtomsLayout buttonFAL;

    @NonNull
    public final View premiumBodyBgV;

    @NonNull
    public final View premiumHeaderBgV;

    @NonNull
    public final ImageView premiumLogoIv;

    @NonNull
    public final PriceView recurrentPriceFAL;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final VerticalAtomsLayout subtitlesVAL;

    @NonNull
    public final PriceView totalPriceFAL;

    private ItemPremiumBannerTariffBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull FrameAtomsLayout frameAtomsLayout, @NonNull FrameAtomsLayout frameAtomsLayout2, @NonNull View view, @NonNull View view2, @NonNull ImageView imageView, @NonNull PriceView priceView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull PriceView priceView2) {
        this.rootView = constraintLayout;
        this.badgeTv = textView;
        this.benefitsFAL = frameAtomsLayout;
        this.buttonFAL = frameAtomsLayout2;
        this.premiumBodyBgV = view;
        this.premiumHeaderBgV = view2;
        this.premiumLogoIv = imageView;
        this.recurrentPriceFAL = priceView;
        this.subtitlesVAL = verticalAtomsLayout;
        this.totalPriceFAL = priceView2;
    }

    @NonNull
    public static ItemPremiumBannerTariffBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.badgeTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.benefitsFAL;
            FrameAtomsLayout frameAtomsLayout = (FrameAtomsLayout) C2548q.d(i11, view);
            if (frameAtomsLayout != null) {
                i11 = R$id.buttonFAL;
                FrameAtomsLayout frameAtomsLayout2 = (FrameAtomsLayout) C2548q.d(i11, view);
                if (frameAtomsLayout2 != null && (d11 = C2548q.d((i11 = R$id.premiumBodyBgV), view)) != null && (d12 = C2548q.d((i11 = R$id.premiumHeaderBgV), view)) != null) {
                    i11 = R$id.premiumLogoIv;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.recurrentPriceFAL;
                        PriceView priceView = (PriceView) C2548q.d(i11, view);
                        if (priceView != null) {
                            i11 = R$id.subtitlesVAL;
                            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                            if (verticalAtomsLayout != null) {
                                i11 = R$id.totalPriceFAL;
                                PriceView priceView2 = (PriceView) C2548q.d(i11, view);
                                if (priceView2 != null) {
                                    return new ItemPremiumBannerTariffBinding((ConstraintLayout) view, textView, frameAtomsLayout, frameAtomsLayout2, d11, d12, imageView, priceView, verticalAtomsLayout, priceView2);
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
    public static ItemPremiumBannerTariffBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_premium_banner_tariff, viewGroup, false);
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
