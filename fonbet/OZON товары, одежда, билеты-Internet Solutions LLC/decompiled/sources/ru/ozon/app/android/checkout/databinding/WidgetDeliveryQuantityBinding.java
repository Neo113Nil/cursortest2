package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.presentation.DeliverySwitchButtonsLayout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class WidgetDeliveryQuantityBinding implements a {

    @NonNull
    public final ConstraintLayout containerCl;

    @NonNull
    public final SingleAtom deliveryIconSAL;

    @NonNull
    public final ImageView deliveryMessageIconIv;

    @NonNull
    public final LinearLayout deliveryMessageLL;

    @NonNull
    public final SingleAtom deliveryMessageSAL;

    @NonNull
    public final DeliverySwitchButtonsLayout deliverySelectorLL;

    @NonNull
    public final SingleAtom deliveryTitleSAL;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetDeliveryQuantityBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull SingleAtom singleAtom, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull SingleAtom singleAtom2, @NonNull DeliverySwitchButtonsLayout deliverySwitchButtonsLayout, @NonNull SingleAtom singleAtom3) {
        this.rootView = constraintLayout;
        this.containerCl = constraintLayout2;
        this.deliveryIconSAL = singleAtom;
        this.deliveryMessageIconIv = imageView;
        this.deliveryMessageLL = linearLayout;
        this.deliveryMessageSAL = singleAtom2;
        this.deliverySelectorLL = deliverySwitchButtonsLayout;
        this.deliveryTitleSAL = singleAtom3;
    }

    @NonNull
    public static WidgetDeliveryQuantityBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.deliveryIconSAL;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.deliveryMessageIconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.deliveryMessageLL;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout != null) {
                    i11 = R$id.deliveryMessageSAL;
                    SingleAtom singleAtom2 = (SingleAtom) C2548q.d(i11, view);
                    if (singleAtom2 != null) {
                        i11 = R$id.deliverySelectorLL;
                        DeliverySwitchButtonsLayout deliverySwitchButtonsLayout = (DeliverySwitchButtonsLayout) C2548q.d(i11, view);
                        if (deliverySwitchButtonsLayout != null) {
                            i11 = R$id.deliveryTitleSAL;
                            SingleAtom singleAtom3 = (SingleAtom) C2548q.d(i11, view);
                            if (singleAtom3 != null) {
                                return new WidgetDeliveryQuantityBinding(constraintLayout, constraintLayout, singleAtom, imageView, linearLayout, singleAtom2, deliverySwitchButtonsLayout, singleAtom3);
                            }
                        }
                    }
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
