package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.CareerHistory;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class psb extends g7 {
    @Override // defpackage.g7
    public final void F(List list) {
        list.getClass();
        xbb b = a.b();
        b.add(1);
        b.addAll(list);
        super.F(a.a(b));
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        Team team;
        if (!(obj instanceof CareerHistory)) {
            return false;
        }
        CareerHistory careerHistory = (CareerHistory) obj;
        return (careerHistory.getTeam() == null || (team = careerHistory.getTeam()) == null || team.getDisabled()) ? false : true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj.equals(1)) {
            return 1;
        }
        if (obj instanceof CareerHistory) {
            return 2;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = this.b;
        if (i == 1) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.list_header_subtitle, viewGroup, false);
            if (((TextView) nq8.B(R.id.manager_career_ppm, inflate)) != null) {
                return new ja9(new hcb(0, (RelativeLayout) inflate));
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.manager_career_ppm)));
            return null;
        }
        if (i != 2) {
            ilg.c();
            return null;
        }
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.manager_history_row, viewGroup, false);
        int i2 = R.id.bottom_divider;
        SofaDivider sofaDivider = (SofaDivider) nq8.B(R.id.bottom_divider, inflate2);
        if (sofaDivider != null) {
            i2 = R.id.manager_history_dates;
            TextView textView = (TextView) nq8.B(R.id.manager_history_dates, inflate2);
            if (textView != null) {
                i2 = R.id.manager_history_draws;
                TextView textView2 = (TextView) nq8.B(R.id.manager_history_draws, inflate2);
                if (textView2 != null) {
                    i2 = R.id.manager_history_games;
                    TextView textView3 = (TextView) nq8.B(R.id.manager_history_games, inflate2);
                    if (textView3 != null) {
                        i2 = R.id.manager_history_losses;
                        TextView textView4 = (TextView) nq8.B(R.id.manager_history_losses, inflate2);
                        if (textView4 != null) {
                            i2 = R.id.manager_history_ppg;
                            TextView textView5 = (TextView) nq8.B(R.id.manager_history_ppg, inflate2);
                            if (textView5 != null) {
                                i2 = R.id.manager_history_team_logo;
                                ImageView imageView = (ImageView) nq8.B(R.id.manager_history_team_logo, inflate2);
                                if (imageView != null) {
                                    i2 = R.id.manager_history_team_name;
                                    TextView textView6 = (TextView) nq8.B(R.id.manager_history_team_name, inflate2);
                                    if (textView6 != null) {
                                        i2 = R.id.manager_history_wins;
                                        TextView textView7 = (TextView) nq8.B(R.id.manager_history_wins, inflate2);
                                        if (textView7 != null) {
                                            return new wh(new bu1((ConstraintLayout) inflate2, sofaDivider, textView, textView2, textView3, textView4, textView5, imageView, textView6, textView7));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
        return null;
    }
}
