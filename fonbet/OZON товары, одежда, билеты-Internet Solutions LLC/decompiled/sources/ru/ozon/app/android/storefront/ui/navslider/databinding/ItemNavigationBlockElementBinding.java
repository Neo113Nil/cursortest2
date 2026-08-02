package ru.ozon.app.android.storefront.ui.navslider.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.ui.navslider.R$id;

/* loaded from: classes2.dex */
public final class ItemNavigationBlockElementBinding implements a {

    @NonNull
    public final ImageView adultEyeLogoIv;

    @NonNull
    public final ImageView backgroundIv;

    @NonNull
    public final ConstraintLayout categoryCl;

    @NonNull
    public final ImageView categoryIv;

    @NonNull
    public final View overlayView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private ItemNavigationBlockElementBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView3, @NonNull View view, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.adultEyeLogoIv = imageView;
        this.backgroundIv = imageView2;
        this.categoryCl = constraintLayout2;
        this.categoryIv = imageView3;
        this.overlayView = view;
        this.titleTv = textView;
    }

    @NonNull
    public static ItemNavigationBlockElementBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.adultEyeLogoIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.backgroundIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.categoryIv;
                ImageView imageView3 = (ImageView) C2548q.d(i11, view);
                if (imageView3 != null && (d11 = C2548q.d((i11 = R$id.overlayView), view)) != null) {
                    i11 = R$id.titleTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new ItemNavigationBlockElementBinding(constraintLayout, imageView, imageView2, constraintLayout, imageView3, d11, textView);
                    }
                }
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
