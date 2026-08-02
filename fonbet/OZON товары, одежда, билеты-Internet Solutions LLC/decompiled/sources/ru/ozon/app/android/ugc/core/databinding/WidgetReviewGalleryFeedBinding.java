package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;

/* loaded from: classes2.dex */
public final class WidgetReviewGalleryFeedBinding implements a {

    @NonNull
    public final BadgeView reviewFeedBadge;

    @NonNull
    public final IconView reviewFeedIcon;

    @NonNull
    public final Image reviewFeedImage;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetReviewGalleryFeedBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull IconView iconView, @NonNull Image image) {
        this.rootView = constraintLayout;
        this.reviewFeedBadge = badgeView;
        this.reviewFeedIcon = iconView;
        this.reviewFeedImage = image;
    }

    @NonNull
    public static WidgetReviewGalleryFeedBinding bind(@NonNull View view) {
        int i11 = R$id.reviewFeedBadge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.reviewFeedIcon;
            IconView iconView = (IconView) C2548q.d(i11, view);
            if (iconView != null) {
                i11 = R$id.reviewFeedImage;
                Image image = (Image) C2548q.d(i11, view);
                if (image != null) {
                    return new WidgetReviewGalleryFeedBinding((ConstraintLayout) view, badgeView, iconView, image);
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
