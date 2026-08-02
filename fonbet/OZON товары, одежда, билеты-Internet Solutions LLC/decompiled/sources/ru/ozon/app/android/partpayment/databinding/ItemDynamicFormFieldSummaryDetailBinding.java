package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldSummaryDetailBinding implements a {

    @NonNull
    public final TextView hintTv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView valueTv;

    private ItemDynamicFormFieldSummaryDetailBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.hintTv = textView;
        this.valueTv = textView2;
    }

    @NonNull
    public static ItemDynamicFormFieldSummaryDetailBinding bind(@NonNull View view) {
        int i11 = R$id.hintTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.valueTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                return new ItemDynamicFormFieldSummaryDetailBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
