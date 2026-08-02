package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.deliveryreview.R$id;
import ru.ozon.app.android.deliveryreview.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;

/* loaded from: classes11.dex */
public final class ItemDeliveryReviewComponentGalleryBinding implements a {

    @NonNull
    public final LargeBorderlessButtonView galleryBtn;

    @NonNull
    private final FrameLayout rootView;

    private ItemDeliveryReviewComponentGalleryBinding(@NonNull FrameLayout frameLayout, @NonNull LargeBorderlessButtonView largeBorderlessButtonView) {
        this.rootView = frameLayout;
        this.galleryBtn = largeBorderlessButtonView;
    }

    @NonNull
    public static ItemDeliveryReviewComponentGalleryBinding bind(@NonNull View view) {
        int i11 = R$id.galleryBtn;
        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
        if (largeBorderlessButtonView != null) {
            return new ItemDeliveryReviewComponentGalleryBinding((FrameLayout) view, largeBorderlessButtonView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemDeliveryReviewComponentGalleryBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_component_gallery, viewGroup, false);
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
