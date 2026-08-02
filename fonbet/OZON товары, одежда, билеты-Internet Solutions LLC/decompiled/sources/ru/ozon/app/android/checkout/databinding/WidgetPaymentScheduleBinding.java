package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.checkout.R$id;

/* loaded from: classes11.dex */
public final class WidgetPaymentScheduleBinding implements a {

    @NonNull
    public final ConstraintLayout headerCl;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final TextView paymentScheduleTitleTv;

    @NonNull
    public final RecyclerView paymentsRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    private WidgetPaymentScheduleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.headerCl = constraintLayout2;
        this.iconIv = imageView;
        this.paymentScheduleTitleTv = textView;
        this.paymentsRv = recyclerView;
        this.subtitleTv = textView2;
    }

    @NonNull
    public static WidgetPaymentScheduleBinding bind(@NonNull View view) {
        int i11 = R$id.headerCl;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null) {
            i11 = R$id.iconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.paymentScheduleTitleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.paymentsRv;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.subtitleTv;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            return new WidgetPaymentScheduleBinding((ConstraintLayout) view, constraintLayout, imageView, textView, recyclerView, textView2);
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
