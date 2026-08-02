package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yk extends Dialog {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(Context context) {
        super(context);
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.ad_loading_overlay, (ViewGroup) null, false);
        int i = R.id.button_cancel;
        MaterialButton materialButton = (MaterialButton) nq8.B(R.id.button_cancel, inflate);
        if (materialButton != null) {
            i = R.id.progress_bar;
            if (((ProgressBar) nq8.B(R.id.progress_bar, inflate)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                Window window = getWindow();
                if (window != null) {
                    window.requestFeature(1);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                setCanceledOnTouchOutside(false);
                setCancelable(false);
                materialButton.setOnClickListener(new s0(this, 4));
                setContentView(constraintLayout);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }
}
