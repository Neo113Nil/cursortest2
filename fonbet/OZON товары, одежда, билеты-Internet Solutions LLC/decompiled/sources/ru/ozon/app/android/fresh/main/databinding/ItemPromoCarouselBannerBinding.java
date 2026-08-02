package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;

/* loaded from: classes12.dex */
public final class ItemPromoCarouselBannerBinding implements a {

    @NonNull
    public final BadgeView advBadgeV2;

    @NonNull
    public final ConstraintLayout promoCarouselBannerContainer;

    @NonNull
    public final ImageView promoCarouselBannerImage;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemPromoCarouselBannerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView) {
        this.rootView = constraintLayout;
        this.advBadgeV2 = badgeView;
        this.promoCarouselBannerContainer = constraintLayout2;
        this.promoCarouselBannerImage = imageView;
    }

    @NonNull
    public static ItemPromoCarouselBannerBinding bind(@NonNull View view) {
        int i11 = R$id.advBadgeV2;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i12 = R$id.promoCarouselBannerImage;
            ImageView imageView = (ImageView) C2548q.d(i12, view);
            if (imageView != null) {
                return new ItemPromoCarouselBannerBinding(constraintLayout, badgeView, constraintLayout, imageView);
            }
            i11 = i12;
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
