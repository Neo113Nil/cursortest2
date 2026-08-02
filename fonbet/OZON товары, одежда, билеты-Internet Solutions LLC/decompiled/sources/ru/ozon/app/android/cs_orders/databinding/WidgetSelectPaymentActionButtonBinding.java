package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class WidgetSelectPaymentActionButtonBinding implements a {

    @NonNull
    public final FrameLayout csmaButtonContainerFl;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final SingleAtom selectPaymentLbv;

    private WidgetSelectPaymentActionButtonBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull SingleAtom singleAtom) {
        this.rootView = frameLayout;
        this.csmaButtonContainerFl = frameLayout2;
        this.selectPaymentLbv = singleAtom;
    }

    @NonNull
    public static WidgetSelectPaymentActionButtonBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.selectPaymentLbv;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            return new WidgetSelectPaymentActionButtonBinding(frameLayout, frameLayout, singleAtom);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
