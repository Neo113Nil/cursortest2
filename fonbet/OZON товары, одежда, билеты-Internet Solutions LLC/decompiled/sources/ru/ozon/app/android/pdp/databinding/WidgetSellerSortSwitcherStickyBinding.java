package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;

/* loaded from: classes13.dex */
public final class WidgetSellerSortSwitcherStickyBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout sellerSortSwitcherStickyCl;

    @NonNull
    public final ImageView sellerSortSwitcherStickyIv;

    @NonNull
    public final TextView sellerSortSwitcherStickyTv;

    private WidgetSellerSortSwitcherStickyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.sellerSortSwitcherStickyCl = constraintLayout2;
        this.sellerSortSwitcherStickyIv = imageView;
        this.sellerSortSwitcherStickyTv = textView;
    }

    @NonNull
    public static WidgetSellerSortSwitcherStickyBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.sellerSortSwitcherStickyIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.sellerSortSwitcherStickyTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new WidgetSellerSortSwitcherStickyBinding(constraintLayout, constraintLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
