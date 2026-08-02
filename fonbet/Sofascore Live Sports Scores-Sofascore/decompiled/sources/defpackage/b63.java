package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b63 extends p8 {
    public final /* synthetic */ int c;
    public final dk2 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b63(dk2 dk2Var, int i) {
        super(r2);
        this.c = i;
        switch (i) {
            case 1:
                LinearLayout linearLayout = dk2Var.b;
                linearLayout.getClass();
                super(linearLayout);
                this.d = dk2Var;
                break;
            default:
                LinearLayout linearLayout2 = dk2Var.b;
                linearLayout2.getClass();
                this.d = dk2Var;
                linearLayout2.setBackground(null);
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3 = this.c;
        int i4 = R.string.recent;
        dk2 dk2Var = this.d;
        Context context = this.b;
        switch (i3) {
            case 0:
                String str = (String) obj;
                str.getClass();
                TextView textView = dk2Var.c;
                if (!str.equals("recent")) {
                    i4 = R.string.suggested;
                }
                textView.setText(context.getString(i4));
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                dk2Var.c.setText(str2.equals("recent") ? context.getString(R.string.recent) : str2.equals("suggestion") ? context.getString(R.string.popular) : "");
                break;
        }
    }
}
