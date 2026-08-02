package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p2j extends g7 {
    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return !((o2j) obj).a.getTeam().getDisabled();
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 18);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((o2j) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.betting_tips_team_streaks_item, viewGroup, false);
        int i2 = R.id.sport_logo;
        ImageView imageView = (ImageView) nq8.B(R.id.sport_logo, inflate);
        if (imageView != null) {
            i2 = R.id.team_logo;
            ImageView imageView2 = (ImageView) nq8.B(R.id.team_logo, inflate);
            if (imageView2 != null) {
                i2 = R.id.team_name;
                TextView textView = (TextView) nq8.B(R.id.team_name, inflate);
                if (textView != null) {
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    i2 = R.id.wins;
                    TextView textView2 = (TextView) nq8.B(R.id.wins, inflate);
                    if (textView2 != null) {
                        return new j8i(new av1(linearLayout, imageView, imageView2, textView, textView2, 0));
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
