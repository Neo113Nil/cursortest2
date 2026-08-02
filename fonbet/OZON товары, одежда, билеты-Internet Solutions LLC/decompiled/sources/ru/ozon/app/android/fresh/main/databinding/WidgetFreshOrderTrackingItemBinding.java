package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation.SquircleConstraintLayout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetFreshOrderTrackingItemBinding implements a {

    @NonNull
    public final ImageView orderTrackingArrowIv;

    @NonNull
    public final BadgeView orderTrackingBadgeView;

    @NonNull
    public final ImageView orderTrackingIV;

    @NonNull
    public final SquircleConstraintLayout orderTrackingItemContainer;

    @NonNull
    public final TextAtomView orderTrackingSubtitleTA;

    @NonNull
    public final TextAtomView orderTrackingTitleTA;

    @NonNull
    private final SquircleConstraintLayout rootView;

    private WidgetFreshOrderTrackingItemBinding(@NonNull SquircleConstraintLayout squircleConstraintLayout, @NonNull ImageView imageView, @NonNull BadgeView badgeView, @NonNull ImageView imageView2, @NonNull SquircleConstraintLayout squircleConstraintLayout2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = squircleConstraintLayout;
        this.orderTrackingArrowIv = imageView;
        this.orderTrackingBadgeView = badgeView;
        this.orderTrackingIV = imageView2;
        this.orderTrackingItemContainer = squircleConstraintLayout2;
        this.orderTrackingSubtitleTA = textAtomView;
        this.orderTrackingTitleTA = textAtomView2;
    }

    @NonNull
    public static WidgetFreshOrderTrackingItemBinding bind(@NonNull View view) {
        int i11 = R$id.orderTrackingArrowIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.orderTrackingBadgeView;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null) {
                i11 = R$id.orderTrackingIV;
                ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                if (imageView2 != null) {
                    SquircleConstraintLayout squircleConstraintLayout = (SquircleConstraintLayout) view;
                    i11 = R$id.orderTrackingSubtitleTA;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.orderTrackingTitleTA;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            return new WidgetFreshOrderTrackingItemBinding(squircleConstraintLayout, imageView, badgeView, imageView2, squircleConstraintLayout, textAtomView, textAtomView2);
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
    public SquircleConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
