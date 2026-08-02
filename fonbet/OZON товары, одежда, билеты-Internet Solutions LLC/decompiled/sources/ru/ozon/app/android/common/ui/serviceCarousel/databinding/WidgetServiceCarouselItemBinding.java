package ru.ozon.app.android.common.ui.serviceCarousel.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.common.ui.serviceCarousel.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetServiceCarouselItemBinding implements a {

    @NonNull
    public final BadgeView badge;

    @NonNull
    public final View imageBackground;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    public final CardView root;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView tvNewBadge;

    @NonNull
    public final TextAtomView tvTitle;

    private WidgetServiceCarouselItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull View view, @NonNull ImageView imageView, @NonNull CardView cardView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.badge = badgeView;
        this.imageBackground = view;
        this.imageIv = imageView;
        this.root = cardView;
        this.tvNewBadge = textAtomView;
        this.tvTitle = textAtomView2;
    }

    @NonNull
    public static WidgetServiceCarouselItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null && (d11 = C2548q.d((i11 = R$id.imageBackground), view)) != null) {
            i11 = R$id.imageIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.root;
                CardView cardView = (CardView) C2548q.d(i11, view);
                if (cardView != null) {
                    i11 = R$id.tvNewBadge;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.tvTitle;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            return new WidgetServiceCarouselItemBinding((ConstraintLayout) view, badgeView, d11, imageView, cardView, textAtomView, textAtomView2);
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
