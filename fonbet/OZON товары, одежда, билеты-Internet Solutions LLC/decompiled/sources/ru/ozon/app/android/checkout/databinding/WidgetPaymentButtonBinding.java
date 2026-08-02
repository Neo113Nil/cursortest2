package ru.ozon.app.android.checkout.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes11.dex */
public final class WidgetPaymentButtonBinding implements a {

    @NonNull
    public final SingleAtom paymentBtn;

    @NonNull
    private final SingleAtom rootView;

    private WidgetPaymentButtonBinding(@NonNull SingleAtom singleAtom, @NonNull SingleAtom singleAtom2) {
        this.rootView = singleAtom;
        this.paymentBtn = singleAtom2;
    }

    @NonNull
    public static WidgetPaymentButtonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SingleAtom singleAtom = (SingleAtom) view;
        return new WidgetPaymentButtonBinding(singleAtom, singleAtom);
    }

    @Override // X4.a
    @NonNull
    public SingleAtom getRoot() {
        return this.rootView;
    }
}
