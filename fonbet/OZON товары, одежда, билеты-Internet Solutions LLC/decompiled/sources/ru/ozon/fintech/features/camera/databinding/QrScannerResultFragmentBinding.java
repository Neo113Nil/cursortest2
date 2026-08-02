package ru.ozon.fintech.features.camera.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class QrScannerResultFragmentBinding implements a {

    @NonNull
    public final Button negativeBtn;

    @NonNull
    public final Button positiveBtn;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView rulesWebBankText;

    private QrScannerResultFragmentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.negativeBtn = button;
        this.positiveBtn = button2;
        this.rulesWebBankText = textView;
    }

    @NonNull
    public static QrScannerResultFragmentBinding bind(@NonNull View view) {
        int i11 = R.id.negative_btn;
        Button button = (Button) C2548q.d(R.id.negative_btn, view);
        if (button != null) {
            i11 = R.id.positive_btn;
            Button button2 = (Button) C2548q.d(R.id.positive_btn, view);
            if (button2 != null) {
                i11 = R.id.rules_web_bank_text;
                TextView textView = (TextView) C2548q.d(R.id.rules_web_bank_text, view);
                if (textView != null) {
                    return new QrScannerResultFragmentBinding((ConstraintLayout) view, button, button2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static QrScannerResultFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static QrScannerResultFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.qr_scanner_result_fragment, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
