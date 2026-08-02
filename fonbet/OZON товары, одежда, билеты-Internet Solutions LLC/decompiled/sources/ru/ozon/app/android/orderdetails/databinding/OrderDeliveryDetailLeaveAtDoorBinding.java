package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.v3.molecules.list.GalleryView;
import ru.ozon.app.android.orderdetails.R$id;

/* loaded from: classes13.dex */
public final class OrderDeliveryDetailLeaveAtDoorBinding implements a {

    @NonNull
    public final ImageView checkMarkIcon;

    @NonNull
    public final GalleryView gallery;

    @NonNull
    public final TextView leaveAtDoorLabel;

    @NonNull
    private final ConstraintLayout rootView;

    private OrderDeliveryDetailLeaveAtDoorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull GalleryView galleryView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.checkMarkIcon = imageView;
        this.gallery = galleryView;
        this.leaveAtDoorLabel = textView;
    }

    @NonNull
    public static OrderDeliveryDetailLeaveAtDoorBinding bind(@NonNull View view) {
        int i11 = R$id.checkMarkIcon;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.gallery;
            GalleryView galleryView = (GalleryView) C2548q.d(i11, view);
            if (galleryView != null) {
                i11 = R$id.leaveAtDoorLabel;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new OrderDeliveryDetailLeaveAtDoorBinding((ConstraintLayout) view, imageView, galleryView, textView);
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
