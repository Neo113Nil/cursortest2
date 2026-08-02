package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class ItemCatalogShelfBinding implements a {

    @NonNull
    public final BadgeView advBadgeV2;

    @NonNull
    public final View backgroundV;

    @NonNull
    public final Barrier bottomBarrier;

    @NonNull
    public final ImageView productIv;

    @NonNull
    public final TextAtomView productTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final BadgeView soldBadge;

    private ItemCatalogShelfBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull View view, @NonNull Barrier barrier, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView, @NonNull BadgeView badgeView2) {
        this.rootView = constraintLayout;
        this.advBadgeV2 = badgeView;
        this.backgroundV = view;
        this.bottomBarrier = barrier;
        this.productIv = imageView;
        this.productTitleTv = textAtomView;
        this.soldBadge = badgeView2;
    }

    @NonNull
    public static ItemCatalogShelfBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.advBadgeV2;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null && (d11 = C2548q.d((i11 = R$id.backgroundV), view)) != null) {
            i11 = R$id.bottomBarrier;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null) {
                i11 = R$id.productIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.productTitleTv;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.soldBadge;
                        BadgeView badgeView2 = (BadgeView) C2548q.d(i11, view);
                        if (badgeView2 != null) {
                            return new ItemCatalogShelfBinding((ConstraintLayout) view, badgeView, d11, barrier, imageView, textAtomView, badgeView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemCatalogShelfBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_catalog_shelf, viewGroup, false);
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
