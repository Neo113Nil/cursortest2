package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.app.android.travel.feature.b2b.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class ItemPromoBannerB2bBinding implements a {

    @NonNull
    public final TextAtomView bannerDescriptionTAV;

    @NonNull
    public final AppCompatImageView bannerImageAPTV;

    @NonNull
    public final TextAtomView bannerTitleTAV;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemPromoBannerB2bBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.bannerDescriptionTAV = textAtomView;
        this.bannerImageAPTV = appCompatImageView;
        this.bannerTitleTAV = textAtomView2;
    }

    @NonNull
    public static ItemPromoBannerB2bBinding bind(@NonNull View view) {
        int i11 = R$id.bannerDescriptionTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.bannerImageAPTV;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.bannerTitleTAV;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new ItemPromoBannerB2bBinding((ConstraintLayout) view, textAtomView, appCompatImageView, textAtomView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemPromoBannerB2bBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_promo_banner_b2b, viewGroup, false);
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
