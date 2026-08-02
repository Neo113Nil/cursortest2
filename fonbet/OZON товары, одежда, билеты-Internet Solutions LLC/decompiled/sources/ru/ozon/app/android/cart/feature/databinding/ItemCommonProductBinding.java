package ru.ozon.app.android.cart.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;

/* loaded from: classes11.dex */
public final class ItemCommonProductBinding implements a {

    @NonNull
    public final BadgeView badgeV;

    @NonNull
    public final ImageView imageIV;

    @NonNull
    public final RecyclerView productDynamicElementsRv;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemCommonProductBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.badgeV = badgeView;
        this.imageIV = imageView;
        this.productDynamicElementsRv = recyclerView;
    }

    @NonNull
    public static ItemCommonProductBinding bind(@NonNull View view) {
        int i11 = R$id.badgeV;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.imageIV;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.productDynamicElementsRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    return new ItemCommonProductBinding((ConstraintLayout) view, badgeView, imageView, recyclerView);
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
