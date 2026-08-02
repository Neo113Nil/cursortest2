package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldCheckerItemBinding implements a {

    @NonNull
    public final ImageView paymentIconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ImageView selectorIv;

    @NonNull
    public final View separator;

    @NonNull
    public final TextView titleTv;

    private ItemDynamicFormFieldCheckerItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.paymentIconIv = imageView;
        this.selectorIv = imageView2;
        this.separator = view;
        this.titleTv = textView;
    }

    @NonNull
    public static ItemDynamicFormFieldCheckerItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.paymentIconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.selectorIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                i11 = R$id.titleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new ItemDynamicFormFieldCheckerItemBinding((ConstraintLayout) view, imageView, imageView2, d11, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
