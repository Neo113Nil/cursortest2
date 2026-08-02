package ru.ozon.app.android.bank.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.app.android.bank.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes11.dex */
public final class WidgetInstallmentPaymentScheduleItemBinding implements a {

    @NonNull
    public final TextAtomV2View amount;

    @NonNull
    public final TextAtomV2View date;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetInstallmentPaymentScheduleItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.amount = textAtomV2View;
        this.date = textAtomV2View2;
    }

    @NonNull
    public static WidgetInstallmentPaymentScheduleItemBinding bind(@NonNull View view) {
        int i11 = R$id.amount;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.date;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                return new WidgetInstallmentPaymentScheduleItemBinding((ConstraintLayout) view, textAtomV2View, textAtomV2View2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetInstallmentPaymentScheduleItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_installment_payment_schedule_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
