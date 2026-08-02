package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;

/* loaded from: classes11.dex */
public final class ItemProductBinding implements a {

    @NonNull
    public final BadgeView badgeView;

    @NonNull
    public final View borderV;

    @NonNull
    public final FrameLayout productImageContainer;

    @NonNull
    public final ShapeableImageView productIv;

    @NonNull
    public final IconView promoIconView;

    @NonNull
    public final TextView quantityTv;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemProductBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull IconView iconView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.badgeView = badgeView;
        this.borderV = view;
        this.productImageContainer = frameLayout;
        this.productIv = shapeableImageView;
        this.promoIconView = iconView;
        this.quantityTv = textView;
    }

    @NonNull
    public static ItemProductBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badgeView;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null && (d11 = C2548q.d((i11 = R$id.borderV), view)) != null) {
            i11 = R$id.productImageContainer;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null) {
                i11 = R$id.productIv;
                ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
                if (shapeableImageView != null) {
                    i11 = R$id.promoIconView;
                    IconView iconView = (IconView) C2548q.d(i11, view);
                    if (iconView != null) {
                        i11 = R$id.quantityTv;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            return new ItemProductBinding((ConstraintLayout) view, badgeView, d11, frameLayout, shapeableImageView, iconView, textView);
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
