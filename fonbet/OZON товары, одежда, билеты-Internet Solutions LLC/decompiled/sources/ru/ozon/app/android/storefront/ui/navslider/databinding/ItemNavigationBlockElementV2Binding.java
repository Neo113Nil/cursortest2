package ru.ozon.app.android.storefront.ui.navslider.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.ui.navslider.R$id;

/* loaded from: classes7.dex */
public final class ItemNavigationBlockElementV2Binding implements a {

    @NonNull
    public final ConstraintLayout categoryCl;

    @NonNull
    public final ImageView categoryIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private ItemNavigationBlockElementV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.categoryCl = constraintLayout2;
        this.categoryIv = imageView;
        this.titleTv = textView;
    }

    @NonNull
    public static ItemNavigationBlockElementV2Binding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.categoryIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemNavigationBlockElementV2Binding(constraintLayout, constraintLayout, imageView, textView);
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
