package ru.ozon.app.android.storefront.core.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.atoms.R$layout;

/* loaded from: classes2.dex */
public final class ViewSocialLargeAllProductBinding implements a {

    @NonNull
    public final TextView countView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout socialLargeAllProducts;

    @NonNull
    public final TextView titleView;

    private ViewSocialLargeAllProductBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.countView = textView;
        this.socialLargeAllProducts = linearLayout2;
        this.titleView = textView2;
    }

    @NonNull
    public static ViewSocialLargeAllProductBinding bind(@NonNull View view) {
        int i11 = R$id.countView;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i12 = R$id.titleView;
            TextView textView2 = (TextView) C2548q.d(i12, view);
            if (textView2 != null) {
                return new ViewSocialLargeAllProductBinding(linearLayout, textView, linearLayout, textView2);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewSocialLargeAllProductBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.view_social_large_all_product, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
