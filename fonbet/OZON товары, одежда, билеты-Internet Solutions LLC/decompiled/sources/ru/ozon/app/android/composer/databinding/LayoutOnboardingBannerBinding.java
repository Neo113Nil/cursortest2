package ru.ozon.app.android.composer.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.R$layout;
import ru.ozon.uni.android.cell.image.ImageTitleSubtitleCellV2View;
import ru.ozon.uni.android.controls.button.IconButtonView;

/* loaded from: classes11.dex */
public final class LayoutOnboardingBannerBinding implements a {

    @NonNull
    public final ImageTitleSubtitleCellV2View bannerItscv;

    @NonNull
    public final IconButtonView closeButtonIb;

    @NonNull
    private final FrameLayout rootView;

    private LayoutOnboardingBannerBinding(@NonNull FrameLayout frameLayout, @NonNull ImageTitleSubtitleCellV2View imageTitleSubtitleCellV2View, @NonNull IconButtonView iconButtonView) {
        this.rootView = frameLayout;
        this.bannerItscv = imageTitleSubtitleCellV2View;
        this.closeButtonIb = iconButtonView;
    }

    @NonNull
    public static LayoutOnboardingBannerBinding bind(@NonNull View view) {
        int i11 = R$id.bannerItscv;
        ImageTitleSubtitleCellV2View imageTitleSubtitleCellV2View = (ImageTitleSubtitleCellV2View) C2548q.d(i11, view);
        if (imageTitleSubtitleCellV2View != null) {
            i11 = R$id.closeButtonIb;
            IconButtonView iconButtonView = (IconButtonView) C2548q.d(i11, view);
            if (iconButtonView != null) {
                return new LayoutOnboardingBannerBinding((FrameLayout) view, imageTitleSubtitleCellV2View, iconButtonView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static LayoutOnboardingBannerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.layout_onboarding_banner, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
