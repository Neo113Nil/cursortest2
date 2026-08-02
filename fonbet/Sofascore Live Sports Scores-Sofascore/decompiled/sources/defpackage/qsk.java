package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qsk implements krk {
    public final LinearLayout a;
    public final LinearLayout b;
    public final LinearLayout c;

    public qsk(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = linearLayout3;
    }

    public static qsk a(View view) {
        int i = R.id.first_player_score_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.first_player_score_container, view);
        if (linearLayout != null) {
            i = R.id.second_player_score_container;
            LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.second_player_score_container, view);
            if (linearLayout2 != null) {
                return new qsk((LinearLayout) view, linearLayout, linearLayout2);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
