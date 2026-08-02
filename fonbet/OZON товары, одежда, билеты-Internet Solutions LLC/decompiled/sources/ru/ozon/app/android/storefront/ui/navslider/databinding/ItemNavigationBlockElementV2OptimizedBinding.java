package ru.ozon.app.android.storefront.ui.navslider.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.ui.navslider.R$id;

/* loaded from: classes2.dex */
public final class ItemNavigationBlockElementV2OptimizedBinding implements a {

    @NonNull
    public final LinearLayout categoryCl;

    @NonNull
    public final ImageView categoryIv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private ItemNavigationBlockElementV2OptimizedBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.categoryCl = linearLayout2;
        this.categoryIv = imageView;
        this.titleTv = textView;
    }

    @NonNull
    public static ItemNavigationBlockElementV2OptimizedBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.categoryIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemNavigationBlockElementV2OptimizedBinding(linearLayout, linearLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
