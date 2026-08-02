package ru.ozon.app.android.travel.feature.general.services.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.travel.feature.general.services.R$id;
import ru.ozon.app.android.travel.feature.general.services.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ItemAdditionalServicesOfferBinding implements a {

    @NonNull
    public final BadgeView additionalServicesOfferBadgeBV;

    @NonNull
    public final AppCompatImageView additionalServicesOfferDirectIconIV;

    @NonNull
    public final ShapeableImageView additionalServicesOfferImageIV;

    @NonNull
    public final TextAtomView additionalServicesOfferSubtitleTAV;

    @NonNull
    public final TextAtomView additionalServicesOfferTitleTAV;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemAdditionalServicesOfferBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull AppCompatImageView appCompatImageView, @NonNull ShapeableImageView shapeableImageView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.additionalServicesOfferBadgeBV = badgeView;
        this.additionalServicesOfferDirectIconIV = appCompatImageView;
        this.additionalServicesOfferImageIV = shapeableImageView;
        this.additionalServicesOfferSubtitleTAV = textAtomView;
        this.additionalServicesOfferTitleTAV = textAtomView2;
    }

    @NonNull
    public static ItemAdditionalServicesOfferBinding bind(@NonNull View view) {
        int i11 = R$id.additionalServicesOfferBadgeBV;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.additionalServicesOfferDirectIconIV;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.additionalServicesOfferImageIV;
                ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
                if (shapeableImageView != null) {
                    i11 = R$id.additionalServicesOfferSubtitleTAV;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.additionalServicesOfferTitleTAV;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            return new ItemAdditionalServicesOfferBinding((ConstraintLayout) view, badgeView, appCompatImageView, shapeableImageView, textAtomView, textAtomView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemAdditionalServicesOfferBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_additional_services_offer, viewGroup, false);
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
