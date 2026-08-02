package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldRadioBinding implements a {

    @NonNull
    public final RadioGroup radioGroup;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private ItemDynamicFormFieldRadioBinding(@NonNull LinearLayout linearLayout, @NonNull RadioGroup radioGroup, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.radioGroup = radioGroup;
        this.titleTv = textView;
    }

    @NonNull
    public static ItemDynamicFormFieldRadioBinding bind(@NonNull View view) {
        int i11 = R$id.radioGroup;
        RadioGroup radioGroup = (RadioGroup) C2548q.d(i11, view);
        if (radioGroup != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemDynamicFormFieldRadioBinding((LinearLayout) view, radioGroup, textView);
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
