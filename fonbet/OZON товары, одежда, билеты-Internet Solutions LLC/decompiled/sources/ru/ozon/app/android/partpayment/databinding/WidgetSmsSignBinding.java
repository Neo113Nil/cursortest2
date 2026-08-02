package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.partpayment.R$id;
import ru.ozon.app.android.uikit.view.input.MobilizationSmsCodeEditText;

/* loaded from: classes13.dex */
public final class WidgetSmsSignBinding implements a {

    @NonNull
    public final TextView messageTv;

    @NonNull
    public final MobilizationSmsCodeEditText pinEt;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subMessageTv;

    @NonNull
    public final TextView titleTv;

    private WidgetSmsSignBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull MobilizationSmsCodeEditText mobilizationSmsCodeEditText, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.messageTv = textView;
        this.pinEt = mobilizationSmsCodeEditText;
        this.subMessageTv = textView2;
        this.titleTv = textView3;
    }

    @NonNull
    public static WidgetSmsSignBinding bind(@NonNull View view) {
        int i11 = R$id.messageTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.pinEt;
            MobilizationSmsCodeEditText mobilizationSmsCodeEditText = (MobilizationSmsCodeEditText) C2548q.d(i11, view);
            if (mobilizationSmsCodeEditText != null) {
                i11 = R$id.subMessageTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.titleTv;
                    TextView textView3 = (TextView) C2548q.d(i11, view);
                    if (textView3 != null) {
                        return new WidgetSmsSignBinding((ConstraintLayout) view, textView, mobilizationSmsCodeEditText, textView2, textView3);
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
