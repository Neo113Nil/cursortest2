package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c75 implements krk {
    public final ConstraintLayout a;
    public final SwitchCompat b;
    public final TextView c;
    public final TextView d;

    public c75(ConstraintLayout constraintLayout, SwitchCompat switchCompat, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = switchCompat;
        this.c = textView;
        this.d = textView2;
    }

    public static c75 a(View view) {
        int i = R.id.lineups_switcher;
        SwitchCompat switchCompat = (SwitchCompat) nq8.B(R.id.lineups_switcher, view);
        if (switchCompat != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.lineups_switcher_subtitle;
            TextView textView = (TextView) nq8.B(R.id.lineups_switcher_subtitle, view);
            if (textView != null) {
                i2 = R.id.lineups_switcher_title;
                TextView textView2 = (TextView) nq8.B(R.id.lineups_switcher_title, view);
                if (textView2 != null) {
                    return new c75(constraintLayout, switchCompat, textView, textView2);
                }
            }
            i = i2;
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
