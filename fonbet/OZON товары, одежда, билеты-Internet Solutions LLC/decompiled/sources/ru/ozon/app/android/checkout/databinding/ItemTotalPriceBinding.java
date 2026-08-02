package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class ItemTotalPriceBinding implements a {

    @NonNull
    public final TextAtomView paymentTotalAmountTv;

    @NonNull
    public final TextAtomView paymentTotalSubtitleTv;

    @NonNull
    public final TextAtomView paymentTotalTv;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemTotalPriceBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.paymentTotalAmountTv = textAtomView;
        this.paymentTotalSubtitleTv = textAtomView2;
        this.paymentTotalTv = textAtomView3;
    }

    @NonNull
    public static ItemTotalPriceBinding bind(@NonNull View view) {
        int i11 = R$id.paymentTotalAmountTv;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.paymentTotalSubtitleTv;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.paymentTotalTv;
                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView3 != null) {
                    return new ItemTotalPriceBinding((ConstraintLayout) view, textAtomView, textAtomView2, textAtomView3);
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
