package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wpd extends p8 {
    public final /* synthetic */ int c;
    public final vz9 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wpd(vz9 vz9Var, int i) {
        super(r2);
        this.c = i;
        switch (i) {
            case 1:
                ConstraintLayout constraintLayout = vz9Var.a;
                constraintLayout.getClass();
                super(constraintLayout);
                this.d = vz9Var;
                break;
            case 2:
                vz9Var.getClass();
                ConstraintLayout constraintLayout2 = vz9Var.a;
                constraintLayout2.getClass();
                super(constraintLayout2);
                this.d = vz9Var;
                break;
            default:
                vz9Var.getClass();
                ConstraintLayout constraintLayout3 = vz9Var.a;
                constraintLayout3.getClass();
                this.d = vz9Var;
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3 = this.c;
        vz9 vz9Var = this.d;
        switch (i3) {
            case 0:
                ((dz9) obj).getClass();
                TextView textView = vz9Var.g;
                textView.setText(textView.getContext().getString(R.string.on_bench));
                haa.D(textView);
                ConstraintLayout constraintLayout = vz9Var.a;
                constraintLayout.getClass();
                sea.v(constraintLayout, i == 0, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 1:
                ez9 ez9Var = (ez9) obj;
                ez9Var.getClass();
                TextView textView2 = vz9Var.g;
                String string = this.b.getString(R.string.overtimeN, StringsKt.h0(ez9Var.c, PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_TACKLE));
                string.getClass();
                textView2.setText(string);
                ConstraintLayout constraintLayout2 = vz9Var.a;
                constraintLayout2.getClass();
                sea.v(constraintLayout2, ez9Var.a, ez9Var.b, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            default:
                ((hz9) obj).getClass();
                TextView textView3 = vz9Var.g;
                textView3.setText(textView3.getContext().getString(R.string.time_unknown));
                haa.D(textView3);
                ConstraintLayout constraintLayout3 = vz9Var.a;
                constraintLayout3.getClass();
                sea.v(constraintLayout3, i == 0, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
        }
    }
}
