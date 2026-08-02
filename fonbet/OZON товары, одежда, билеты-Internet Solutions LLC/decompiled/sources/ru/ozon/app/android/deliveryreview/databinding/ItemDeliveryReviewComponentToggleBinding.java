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
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleToggleView;

/* loaded from: classes11.dex */
public final class ItemDeliveryReviewComponentToggleBinding implements a {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final CellWithSubtitleToggleView toggleV;

    private ItemDeliveryReviewComponentToggleBinding(@NonNull FrameLayout frameLayout, @NonNull CellWithSubtitleToggleView cellWithSubtitleToggleView) {
        this.rootView = frameLayout;
        this.toggleV = cellWithSubtitleToggleView;
    }

    @NonNull
    public static ItemDeliveryReviewComponentToggleBinding bind(@NonNull View view) {
        int i11 = R$id.toggleV;
        CellWithSubtitleToggleView cellWithSubtitleToggleView = (CellWithSubtitleToggleView) C2548q.d(i11, view);
        if (cellWithSubtitleToggleView != null) {
            return new ItemDeliveryReviewComponentToggleBinding((FrameLayout) view, cellWithSubtitleToggleView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemDeliveryReviewComponentToggleBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_component_toggle, viewGroup, false);
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
