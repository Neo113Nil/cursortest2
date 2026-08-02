package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.StageSportDriverSeasonData;
import com.sofascore.model.newNetwork.StageSportDriverTeamData;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k8i extends g7 {
    public final LayoutInflater l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8i(Context context) {
        super(context);
        context.getClass();
        this.l = LayoutInflater.from(context);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return (obj instanceof StageSportDriverTeamData) && cga.z(((StageSportDriverTeamData) obj).getStage().getUniqueStage());
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof StageSportDriverTeamData) {
            return 1;
        }
        if (obj instanceof StageSportDriverSeasonData) {
            return 2;
        }
        a70.p(mz1.m(obj, "Illegal item="));
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = R.id.wins;
        LayoutInflater layoutInflater = this.l;
        if (i != 1) {
            if (i != 2) {
                a70.p(ljg.j(i, "Illegal viewType="));
                return null;
            }
            View inflate = layoutInflater.inflate(R.layout.driver_career_team_season_data, viewGroup, false);
            TextView textView = (TextView) nq8.B(R.id.podiums, inflate);
            if (textView != null) {
                TextView textView2 = (TextView) nq8.B(R.id.poles, inflate);
                if (textView2 != null) {
                    TextView textView3 = (TextView) nq8.B(R.id.races, inflate);
                    if (textView3 != null) {
                        TextView textView4 = (TextView) nq8.B(R.id.season_name_and_ranking, inflate);
                        if (textView4 != null) {
                            TextView textView5 = (TextView) nq8.B(R.id.wins, inflate);
                            if (textView5 != null) {
                                return new j8i(new z82((ViewGroup) inflate, textView, (Object) textView2, (Object) textView3, (Object) textView4, (Object) textView5, 11));
                            }
                        } else {
                            i2 = R.id.season_name_and_ranking;
                        }
                    } else {
                        i2 = R.id.races;
                    }
                } else {
                    i2 = R.id.poles;
                }
            } else {
                i2 = R.id.podiums;
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        View inflate2 = layoutInflater.inflate(R.layout.driver_career_team_header_data, viewGroup, false);
        TextView textView6 = (TextView) nq8.B(R.id.podiums, inflate2);
        if (textView6 != null) {
            TextView textView7 = (TextView) nq8.B(R.id.poles, inflate2);
            if (textView7 != null) {
                TextView textView8 = (TextView) nq8.B(R.id.races, inflate2);
                if (textView8 != null) {
                    int i3 = R.id.team_logo;
                    ImageView imageView = (ImageView) nq8.B(R.id.team_logo, inflate2);
                    if (imageView != null) {
                        i3 = R.id.team_name;
                        TextView textView9 = (TextView) nq8.B(R.id.team_name, inflate2);
                        if (textView9 != null) {
                            i3 = R.id.team_years;
                            TextView textView10 = (TextView) nq8.B(R.id.team_years, inflate2);
                            if (textView10 != null) {
                                TextView textView11 = (TextView) nq8.B(R.id.wins, inflate2);
                                if (textView11 != null) {
                                    return new j8i(new nr1((ConstraintLayout) inflate2, textView6, textView7, textView8, imageView, textView9, textView10, textView11));
                                }
                            }
                        }
                    }
                    i2 = i3;
                } else {
                    i2 = R.id.races;
                }
            } else {
                i2 = R.id.poles;
            }
        } else {
            i2 = R.id.podiums;
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
        return null;
    }
}
