package ru.ozon.app.android.storefront.core.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.atoms.R$layout;

/* loaded from: classes2.dex */
public final class ViewSocialSmallAllProductsBinding implements a {

    @NonNull
    public final TextView countView;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final FrameLayout socialSmallAllProducts;

    @NonNull
    public final TextView titleView;

    private ViewSocialSmallAllProductsBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout2, @NonNull TextView textView2) {
        this.rootView = frameLayout;
        this.countView = textView;
        this.socialSmallAllProducts = frameLayout2;
        this.titleView = textView2;
    }

    @NonNull
    public static ViewSocialSmallAllProductsBinding bind(@NonNull View view) {
        int i11 = R$id.countView;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            int i12 = R$id.titleView;
            TextView textView2 = (TextView) C2548q.d(i12, view);
            if (textView2 != null) {
                return new ViewSocialSmallAllProductsBinding(frameLayout, textView, frameLayout, textView2);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewSocialSmallAllProductsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.view_social_small_all_products, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
