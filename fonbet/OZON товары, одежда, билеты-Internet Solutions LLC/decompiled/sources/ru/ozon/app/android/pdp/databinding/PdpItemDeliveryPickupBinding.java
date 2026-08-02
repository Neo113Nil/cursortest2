package ru.ozon.app.android.pdp.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.PickupButtonView;

/* loaded from: classes13.dex */
public final class PdpItemDeliveryPickupBinding implements a {

    @NonNull
    public final PickupButtonView pickupBtnCardView;

    @NonNull
    private final PickupButtonView rootView;

    private PdpItemDeliveryPickupBinding(@NonNull PickupButtonView pickupButtonView, @NonNull PickupButtonView pickupButtonView2) {
        this.rootView = pickupButtonView;
        this.pickupBtnCardView = pickupButtonView2;
    }

    @NonNull
    public static PdpItemDeliveryPickupBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        PickupButtonView pickupButtonView = (PickupButtonView) view;
        return new PdpItemDeliveryPickupBinding(pickupButtonView, pickupButtonView);
    }

    @Override // X4.a
    @NonNull
    public PickupButtonView getRoot() {
        return this.rootView;
    }
}
