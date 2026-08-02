package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m9g extends p8 {
    public final /* synthetic */ int c;
    public final zxd d;
    public final DecimalFormat e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m9g(zxd zxdVar, int i) {
        super(r4);
        this.c = i;
        switch (i) {
            case 1:
                ConstraintLayout constraintLayout = zxdVar.b;
                constraintLayout.getClass();
                super(constraintLayout);
                this.d = zxdVar;
                this.e = new DecimalFormat("0.000", new DecimalFormatSymbols(dla.d()));
                break;
            case 2:
                ConstraintLayout constraintLayout2 = zxdVar.b;
                constraintLayout2.getClass();
                super(constraintLayout2);
                this.d = zxdVar;
                this.e = new DecimalFormat("0.000", new DecimalFormatSymbols(dla.d()));
                break;
            default:
                ConstraintLayout constraintLayout3 = zxdVar.b;
                constraintLayout3.getClass();
                this.d = zxdVar;
                this.e = new DecimalFormat("0.00", new DecimalFormatSymbols(dla.d()));
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        String alpha2;
        Country country;
        String name;
        Country country2;
        String alpha22;
        Category category;
        int i3 = this.c;
        DecimalFormat decimalFormat = this.e;
        zxd zxdVar = this.d;
        Context context = this.b;
        switch (i3) {
            case 0:
                xlf xlfVar = (xlf) obj;
                Float valueOf = Float.valueOf(1.0f);
                xlfVar.getClass();
                RankingRow rankingRow = xlfVar.a;
                TextView textView = zxdVar.f;
                TextView textView2 = zxdVar.d;
                ImageView imageView = zxdVar.e;
                textView.setText(String.valueOf(rankingRow.getPosition()));
                haa.n(rankingRow, zxdVar.g);
                Country country3 = rankingRow.getCountry();
                if (country3 != null && (alpha2 = country3.getAlpha2()) != null) {
                    as9.c(imageView, alpha2, false, null, 6);
                }
                Country country4 = rankingRow.getCountry();
                textView2.setText(tv3.c(context, country4 != null ? country4.getName() : null));
                zxdVar.c.setVisibility(8);
                Float f = rankingRow.getTeam() != null ? valueOf : null;
                imageView.setAlpha(f != null ? f.floatValue() : 0.5f);
                if (rankingRow.getTeam() == null) {
                    valueOf = null;
                }
                textView2.setAlpha(valueOf != null ? valueOf.floatValue() : 0.5f);
                zxdVar.i.setVisibility(8);
                Double points = rankingRow.getPoints();
                haa.N(zxdVar.j, points != null ? decimalFormat.format(points.doubleValue()) : null);
                break;
            case 1:
                xlf xlfVar2 = (xlf) obj;
                xlfVar2.getClass();
                RankingRow rankingRow2 = xlfVar2.a;
                zxdVar.f.setText(String.valueOf(rankingRow2.getPosition()));
                ImageView imageView2 = zxdVar.e;
                Team team = rankingRow2.getTeam();
                as9.o(imageView2, team != null ? team.getId() : 0);
                TextView textView3 = zxdVar.d;
                Team team2 = rankingRow2.getTeam();
                textView3.setText(team2 != null ? tba.p(context, team2) : null);
                Team team3 = rankingRow2.getTeam();
                if (team3 != null && (country2 = team3.getCountry()) != null && (alpha22 = country2.getAlpha2()) != null) {
                    as9.c(zxdVar.h, alpha22, false, null, 6);
                }
                Team team4 = rankingRow2.getTeam();
                haa.N(zxdVar.c, (team4 == null || (country = team4.getCountry()) == null || (name = country.getName()) == null) ? null : tv3.c(context, name));
                zxdVar.i.setVisibility(8);
                Double points2 = rankingRow2.getPoints();
                haa.N(zxdVar.j, points2 != null ? decimalFormat.format(points2.doubleValue()) : null);
                break;
            default:
                xlf xlfVar3 = (xlf) obj;
                xlfVar3.getClass();
                RankingRow rankingRow3 = xlfVar3.a;
                TextView textView4 = zxdVar.f;
                TextView textView5 = zxdVar.j;
                ImageView imageView3 = zxdVar.h;
                textView4.setText(String.valueOf(rankingRow3.getPosition()));
                UniqueTournament uniqueTournament = rankingRow3.getUniqueTournament();
                if (uniqueTournament != null && (category = uniqueTournament.getCategory()) != null) {
                    as9.b(zxdVar.e, Integer.valueOf(category.getId()), null);
                }
                TextView textView6 = zxdVar.d;
                Country country5 = rankingRow3.getCountry();
                textView6.setText(tv3.c(context, country5 != null ? country5.getName() : null));
                UniqueTournament uniqueTournament2 = rankingRow3.getUniqueTournament();
                haa.N(zxdVar.c, uniqueTournament2 != null ? tba.x(uniqueTournament2) : null);
                imageView3.setVisibility(uniqueTournament2 != null ? 0 : 8);
                if (uniqueTournament2 != null) {
                    as9.q(imageView3, Integer.valueOf(uniqueTournament2.getId()), 0, null);
                }
                String format = String.format(dla.d(), "%d/%d", Arrays.copyOf(new Object[]{rankingRow3.getPlayingTeams(), rankingRow3.getTotalTeams()}, 2));
                if (rankingRow3.getPlayingTeams() == null || rankingRow3.getTotalTeams() == null) {
                    format = null;
                }
                haa.N(zxdVar.i, format);
                Double points3 = rankingRow3.getPoints();
                textView5.setText(points3 != null ? decimalFormat.format(points3.doubleValue()) : null);
                textView5.setMinWidth(ao2.s(42, context));
                break;
        }
    }
}
