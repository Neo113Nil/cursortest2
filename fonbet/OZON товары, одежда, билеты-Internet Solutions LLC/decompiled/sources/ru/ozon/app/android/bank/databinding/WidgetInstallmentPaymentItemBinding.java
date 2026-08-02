package ru.ozon.app.android.bank.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetInstallmentPaymentItemBinding implements a {

    @NonNull
    public final TextAtomView amountTv;

    @NonNull
    public final TextAtomView dateTv;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetInstallmentPaymentItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.amountTv = textAtomView;
        this.dateTv = textAtomView2;
    }

    @NonNull
    public static WidgetInstallmentPaymentItemBinding bind(@NonNull View view) {
        int i11 = R$id.amountTv;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.dateTv;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                return new WidgetInstallmentPaymentItemBinding((ConstraintLayout) view, textAtomView, textAtomView2);
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
