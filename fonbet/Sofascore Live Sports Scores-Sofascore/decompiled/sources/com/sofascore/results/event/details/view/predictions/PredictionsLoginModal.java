package com.sofascore.results.event.details.view.predictions;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.cne;
import defpackage.nq8;
import defpackage.yhk;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/details/view/predictions/PredictionsLoginModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PredictionsLoginModal extends BaseModalBottomSheetDialog {
    public final boolean w = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.modal_predictions_login, (ViewGroup) v().l, false);
        int i = R.id.button_signin;
        MaterialButton materialButton = (MaterialButton) nq8.B(R.id.button_signin, inflate);
        if (materialButton != null) {
            i = R.id.point_1;
            TextView textView = (TextView) nq8.B(R.id.point_1, inflate);
            if (textView != null) {
                i = R.id.point_2;
                TextView textView2 = (TextView) nq8.B(R.id.point_2, inflate);
                if (textView2 != null) {
                    i = R.id.point_3;
                    TextView textView3 = (TextView) nq8.B(R.id.point_3, inflate);
                    if (textView3 != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        textView.setText(String.format("•  %s", Arrays.copyOf(new Object[]{textView.getText()}, 1)));
                        textView2.setText(String.format("•  %s", Arrays.copyOf(new Object[]{textView2.getText()}, 1)));
                        textView3.setText(String.format("•  %s", Arrays.copyOf(new Object[]{textView3.getText()}, 1)));
                        materialButton.setOnClickListener(new cne(this, 6));
                        linearLayout.getClass();
                        return linearLayout;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "LoginModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.predictions_bottom_sheet_header);
        string.getClass();
        return string;
    }
}
