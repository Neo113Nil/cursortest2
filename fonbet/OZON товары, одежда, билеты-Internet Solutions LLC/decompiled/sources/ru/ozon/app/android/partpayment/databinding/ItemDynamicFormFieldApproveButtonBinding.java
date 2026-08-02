package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldApproveButtonBinding implements a {

    @NonNull
    public final AppCompatTextView descriptionTv;

    @NonNull
    public final AppCompatTextView errorBtn;

    @NonNull
    public final TextView finishBtn;

    @NonNull
    private final LinearLayout rootView;

    private ItemDynamicFormFieldApproveButtonBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.descriptionTv = appCompatTextView;
        this.errorBtn = appCompatTextView2;
        this.finishBtn = textView;
    }

    @NonNull
    public static ItemDynamicFormFieldApproveButtonBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.errorBtn;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView2 != null) {
                i11 = R$id.finishBtn;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new ItemDynamicFormFieldApproveButtonBinding((LinearLayout) view, appCompatTextView, appCompatTextView2, textView);
                }
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
