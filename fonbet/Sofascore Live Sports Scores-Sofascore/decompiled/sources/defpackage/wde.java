package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wde extends p8 {
    public final vz9 c;
    public final boolean d;
    public final s26 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wde(vz9 vz9Var, boolean z, boolean z2, s26 s26Var) {
        super(r0);
        vz9Var.getClass();
        ConstraintLayout constraintLayout = vz9Var.a;
        constraintLayout.getClass();
        this.c = vz9Var;
        this.d = z2;
        this.e = s26Var;
        vz9Var.b.setVisibility(z ? 0 : 8);
    }

    public static void d(vz9 vz9Var, Context context, int i) {
        int color = context.getColor(i);
        vz9Var.c.setBackgroundColor(color);
        vz9Var.d.setBackgroundColor(color);
        vz9Var.e.setBackgroundColor(color);
        vz9Var.f.setBackgroundColor(color);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        fz9 fz9Var = (fz9) obj;
        fz9Var.getClass();
        Integer num = fz9Var.h;
        Integer num2 = fz9Var.i;
        String str = (String) this.e.invoke(fz9Var);
        boolean z = this.d;
        Context context = this.b;
        vz9 vz9Var = this.c;
        if (z) {
            String m = hkg.c0(context) ? ljg.m(num2, num, " - ") : ljg.m(num, num2, " - ");
            vz9Var.g.setText(str + " \u200e" + m + "\u200e");
        } else {
            vz9Var.g.setText(str);
        }
        if (fz9Var.e) {
            haa.B(vz9Var.g);
            d(vz9Var, context, R.color.live);
        } else {
            if (Intrinsics.c(fz9Var.f, Sports.VOLLEYBALL)) {
                List list = ywk.a;
                if (ywk.a(fz9Var.g)) {
                    TextView textView = vz9Var.g;
                    textView.setTextColor(textView.getContext().getColor(R.color.value));
                    d(vz9Var, context, R.color.value);
                }
            }
            haa.C(vz9Var.g);
            d(vz9Var, context, R.color.n_lv_4);
        }
        vz9Var.b.setScaleY(fz9Var.j ? -1.0f : 1.0f);
        ConstraintLayout constraintLayout = vz9Var.a;
        constraintLayout.getClass();
        sea.v(constraintLayout, fz9Var.a, fz9Var.b, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        vz9Var.h.setVisibility(fz9Var.b ? 0 : 8);
    }
}
