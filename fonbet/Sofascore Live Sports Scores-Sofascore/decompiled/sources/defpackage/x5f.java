package defpackage;

import android.content.Context;
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
public final class x5f extends g7 {
    public final LayoutInflater l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5f(Context context) {
        super(context);
        context.getClass();
        this.l = LayoutInflater.from(context);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((w5f) obj).getClass();
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 1) {
            a70.p(ljg.j(i, "Illegal viewType="));
            return null;
        }
        View inflate = this.l.inflate(R.layout.prematch_h2h_event_item, viewGroup, false);
        int i2 = R.id.logo_away_team;
        ImageView imageView = (ImageView) nq8.B(R.id.logo_away_team, inflate);
        if (imageView != null) {
            i2 = R.id.logo_home_team;
            ImageView imageView2 = (ImageView) nq8.B(R.id.logo_home_team, inflate);
            if (imageView2 != null) {
                i2 = R.id.score_away_team;
                TextView textView = (TextView) nq8.B(R.id.score_away_team, inflate);
                if (textView != null) {
                    i2 = R.id.score_home_team;
                    TextView textView2 = (TextView) nq8.B(R.id.score_home_team, inflate);
                    if (textView2 != null) {
                        return new ja9(new av1((LinearLayout) inflate, imageView, imageView2, textView, textView2, 1));
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
