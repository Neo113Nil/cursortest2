package ru.ozon.app.android.partpayment.databinding;

import X4.a;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;

/* loaded from: classes13.dex */
public final class WidgetContractBtnBinding implements a {

    @NonNull
    public final Button partPaymentBtn;

    @NonNull
    private final Button rootView;

    private WidgetContractBtnBinding(@NonNull Button button, @NonNull Button button2) {
        this.rootView = button;
        this.partPaymentBtn = button2;
    }

    @NonNull
    public static WidgetContractBtnBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Button button = (Button) view;
        return new WidgetContractBtnBinding(button, button);
    }

    @Override // X4.a
    @NonNull
    public Button getRoot() {
        return this.rootView;
    }
}
