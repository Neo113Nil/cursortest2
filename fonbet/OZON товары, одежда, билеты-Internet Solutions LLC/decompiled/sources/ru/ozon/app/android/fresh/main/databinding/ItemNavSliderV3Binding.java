package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class ItemNavSliderV3Binding implements a {

    @NonNull
    public final BadgeView advBadgeV2;

    @NonNull
    public final AspectRatioImageView backgroundIv;

    @NonNull
    public final CardView itemContainer;

    @NonNull
    public final Guideline rightIndent;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final TextAtomView titleTv;

    private ItemNavSliderV3Binding(@NonNull CardView cardView, @NonNull BadgeView badgeView, @NonNull AspectRatioImageView aspectRatioImageView, @NonNull CardView cardView2, @NonNull Guideline guideline, @NonNull TextAtomView textAtomView) {
        this.rootView = cardView;
        this.advBadgeV2 = badgeView;
        this.backgroundIv = aspectRatioImageView;
        this.itemContainer = cardView2;
        this.rightIndent = guideline;
        this.titleTv = textAtomView;
    }

    @NonNull
    public static ItemNavSliderV3Binding bind(@NonNull View view) {
        int i11 = R$id.advBadgeV2;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.backgroundIv;
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) C2548q.d(i11, view);
            if (aspectRatioImageView != null) {
                CardView cardView = (CardView) view;
                i11 = R$id.rightIndent;
                Guideline guideline = (Guideline) C2548q.d(i11, view);
                if (guideline != null) {
                    i11 = R$id.titleTv;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        return new ItemNavSliderV3Binding(cardView, badgeView, aspectRatioImageView, cardView, guideline, textAtomView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemNavSliderV3Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_nav_slider_v3, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CardView getConstraintLayout() {
        return this.rootView;
    }
}
