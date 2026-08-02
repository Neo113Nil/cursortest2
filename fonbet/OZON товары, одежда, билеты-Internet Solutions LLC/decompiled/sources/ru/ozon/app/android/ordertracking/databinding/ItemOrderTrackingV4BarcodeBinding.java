package ru.ozon.app.android.ordertracking.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.ordertracking.R$id;
import ru.ozon.app.android.ordertracking.R$layout;
import ru.ozon.app.android.ordertracking.v4.presentation.view.StretchFrameLayout;

/* loaded from: classes13.dex */
public final class ItemOrderTrackingV4BarcodeBinding implements a {

    @NonNull
    public final AppCompatImageView barcodeBtn;

    @NonNull
    private final StretchFrameLayout rootView;

    private ItemOrderTrackingV4BarcodeBinding(@NonNull StretchFrameLayout stretchFrameLayout, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = stretchFrameLayout;
        this.barcodeBtn = appCompatImageView;
    }

    @NonNull
    public static ItemOrderTrackingV4BarcodeBinding bind(@NonNull View view) {
        int i11 = R$id.barcodeBtn;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            return new ItemOrderTrackingV4BarcodeBinding((StretchFrameLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemOrderTrackingV4BarcodeBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_order_tracking_v4_barcode, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public StretchFrameLayout getRoot() {
        return this.rootView;
    }
}
