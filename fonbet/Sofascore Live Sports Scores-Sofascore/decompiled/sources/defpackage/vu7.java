package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vu7 implements krk {
    public final LinearLayout a;
    public final kqb b;
    public final FrameLayout c;

    public vu7(LinearLayout linearLayout, kqb kqbVar, FrameLayout frameLayout) {
        this.a = linearLayout;
        this.b = kqbVar;
        this.c = frameLayout;
    }

    public static vu7 a(View view) {
        int i = R.id.featured_player_header;
        View B = nq8.B(R.id.featured_player_header, view);
        if (B != null) {
            kqb a = kqb.a(B);
            int i2 = R.id.featured_player_subtitle;
            if (((TextView) nq8.B(R.id.featured_player_subtitle, view)) != null) {
                i2 = R.id.sport_specific_holder;
                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.sport_specific_holder, view);
                if (frameLayout != null) {
                    return new vu7((LinearLayout) view, a, frameLayout);
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
