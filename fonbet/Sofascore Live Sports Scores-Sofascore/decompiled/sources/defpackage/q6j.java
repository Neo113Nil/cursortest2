package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.results.R;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q6j extends j8i {
    public final bu1 e;
    public final int f;

    public q6j(bu1 bu1Var) {
        super(bu1Var);
        this.e = bu1Var;
        this.f = this.b.getColor(R.color.live);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    @Override // defpackage.j8i, defpackage.p8
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, xlf xlfVar) {
        String str;
        Double nextWinPoints;
        String str2;
        Double maxPoints;
        String str3;
        Team team;
        Team team2;
        Country country;
        String name;
        Country country2;
        String alpha2;
        xlfVar.getClass();
        super.b(i, i2, xlfVar);
        RankingRow rankingRow = xlfVar.a;
        bu1 bu1Var = this.e;
        TextView textView = (TextView) bu1Var.i;
        TextView textView2 = (TextView) bu1Var.h;
        textView2.setTextColor(this.f);
        Double points = rankingRow.getPoints();
        String str4 = null;
        if (points != null) {
            int a = wzb.a(points.doubleValue());
            Integer valueOf = Integer.valueOf(a);
            if (a <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                str = String.valueOf(valueOf.intValue());
                Regex regex = yid.a;
                if (str == null) {
                    str = "-";
                }
                textView2.setText(str);
                nextWinPoints = rankingRow.getNextWinPoints();
                if (nextWinPoints != null) {
                    int a2 = wzb.a(nextWinPoints.doubleValue());
                    Integer valueOf2 = Integer.valueOf(a2);
                    if (a2 <= 0) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        str2 = String.valueOf(valueOf2.intValue());
                        if (str2 == null) {
                            str2 = "-";
                        }
                        textView.setText(str2);
                        TextView textView3 = (TextView) bu1Var.k;
                        maxPoints = rankingRow.getMaxPoints();
                        if (maxPoints != null) {
                            int a3 = wzb.a(maxPoints.doubleValue());
                            Integer valueOf3 = Integer.valueOf(a3);
                            if (a3 <= 0) {
                                valueOf3 = null;
                            }
                            if (valueOf3 != null) {
                                str3 = String.valueOf(valueOf3.intValue());
                                textView3.setText(str3 != null ? str3 : "-");
                                textView2.setVisibility(yid.k(rankingRow.getPoints()) <= 0.0d ? 0 : 8);
                                textView.setVisibility(yid.k(rankingRow.getPoints()) > 0.0d ? 0 : 8);
                                haa.n(rankingRow, (TextView) bu1Var.f);
                                team = rankingRow.getTeam();
                                if (team != null && (country2 = team.getCountry()) != null && (alpha2 = country2.getAlpha2()) != null) {
                                    as9.c((ImageView) bu1Var.j, alpha2, false, null, 6);
                                }
                                team2 = rankingRow.getTeam();
                                if (team2 != null && (country = team2.getCountry()) != null && (name = country.getName()) != null) {
                                    str4 = tv3.c(this.b, name);
                                }
                                ((TextView) bu1Var.e).setText(str4);
                            }
                        }
                        str3 = null;
                        textView3.setText(str3 != null ? str3 : "-");
                        textView2.setVisibility(yid.k(rankingRow.getPoints()) <= 0.0d ? 0 : 8);
                        textView.setVisibility(yid.k(rankingRow.getPoints()) > 0.0d ? 0 : 8);
                        haa.n(rankingRow, (TextView) bu1Var.f);
                        team = rankingRow.getTeam();
                        if (team != null) {
                            as9.c((ImageView) bu1Var.j, alpha2, false, null, 6);
                        }
                        team2 = rankingRow.getTeam();
                        if (team2 != null) {
                            str4 = tv3.c(this.b, name);
                        }
                        ((TextView) bu1Var.e).setText(str4);
                    }
                }
                str2 = null;
                if (str2 == null) {
                }
                textView.setText(str2);
                TextView textView32 = (TextView) bu1Var.k;
                maxPoints = rankingRow.getMaxPoints();
                if (maxPoints != null) {
                }
                str3 = null;
                textView32.setText(str3 != null ? str3 : "-");
                textView2.setVisibility(yid.k(rankingRow.getPoints()) <= 0.0d ? 0 : 8);
                textView.setVisibility(yid.k(rankingRow.getPoints()) > 0.0d ? 0 : 8);
                haa.n(rankingRow, (TextView) bu1Var.f);
                team = rankingRow.getTeam();
                if (team != null) {
                }
                team2 = rankingRow.getTeam();
                if (team2 != null) {
                }
                ((TextView) bu1Var.e).setText(str4);
            }
        }
        str = null;
        Regex regex2 = yid.a;
        if (str == null) {
        }
        textView2.setText(str);
        nextWinPoints = rankingRow.getNextWinPoints();
        if (nextWinPoints != null) {
        }
        str2 = null;
        if (str2 == null) {
        }
        textView.setText(str2);
        TextView textView322 = (TextView) bu1Var.k;
        maxPoints = rankingRow.getMaxPoints();
        if (maxPoints != null) {
        }
        str3 = null;
        textView322.setText(str3 != null ? str3 : "-");
        textView2.setVisibility(yid.k(rankingRow.getPoints()) <= 0.0d ? 0 : 8);
        textView.setVisibility(yid.k(rankingRow.getPoints()) > 0.0d ? 0 : 8);
        haa.n(rankingRow, (TextView) bu1Var.f);
        team = rankingRow.getTeam();
        if (team != null) {
        }
        team2 = rankingRow.getTeam();
        if (team2 != null) {
        }
        ((TextView) bu1Var.e).setText(str4);
    }
}
