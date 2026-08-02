package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.GridItem;
import com.sofascore.model.Money;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.newNetwork.SeasonInfo;
import com.sofascore.results.R;
import com.sofascore.results.team.details.view.PieChartView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tua extends o8 {
    public final mqi d;
    public boolean e;
    public final ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tua(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = ypa.b(new sr8(this, 19));
        this.f = new ArrayList();
        getBinding().j.c.setText(getResources().getString(R.string.upper_division));
        getBinding().g.c.setText(getResources().getString(R.string.newcomers_upper));
        getBinding().i.c.setText(getResources().getString(R.string.lower_division));
        getBinding().e.c.setText(getResources().getString(R.string.newcomers_lower));
        getBinding().f.c.setText(getResources().getString(R.string.newcomers_other));
        getBinding().h.c.setText(context.getString(R.string.related_competitions));
        getBinding().b.c.setText(getResources().getString(R.string.statistics_overview));
        getBinding().d.c.setText(getResources().getString(R.string.host));
        getBinding().j.b.setVisibility(8);
        getBinding().g.b.setVisibility(8);
        getBinding().i.b.setVisibility(8);
        getBinding().e.b.setVisibility(8);
        getBinding().f.b.setVisibility(8);
        getBinding().h.b.setVisibility(8);
        getBinding().b.b.setVisibility(8);
        getBinding().d.b.setVisibility(8);
    }

    private final qua getBinding() {
        return (qua) this.d.getValue();
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.league_details_footer;
    }

    public final void j(Activity activity, List list, cva cvaVar) {
        LinearLayout linearLayout = cvaVar.b;
        if (list == null || list.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UniqueTournament uniqueTournament = (UniqueTournament) it.next();
            Context context = getContext();
            context.getClass();
            sua suaVar = new sua(context);
            uniqueTournament.getClass();
            Integer valueOf = Integer.valueOf(uniqueTournament.getId());
            Context context2 = suaVar.getContext();
            context2.getClass();
            String I = pco.I(0, valueOf, hkg.b0(context2));
            Drawable drawable = suaVar.getContext().getDrawable(R.drawable.ic_info);
            if (drawable != null) {
                v9g.K(drawable.mutate(), suaVar.getContext().getColor(R.color.n_lv_1));
                ImageView imageView = suaVar.j().b;
                apf a = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = I;
                vt9.f(ht9Var, imageView);
                ht9Var.n = new yx7(rfo.u(drawable), 28);
                ht9Var.q = jrg.b;
                a.a(ht9Var.a());
            }
            suaVar.j().c.setText(tba.x(uniqueTournament));
            cvaVar.d.addView(suaVar);
            suaVar.setOnClickListener(new au7(17, activity, uniqueTournament));
        }
    }

    public final void l(Activity activity, List list, cva cvaVar) {
        LinearLayout linearLayout = cvaVar.b;
        if (list == null || list.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Context context = getContext();
            context.getClass();
            sua suaVar = new sua(context);
            Team team = (Team) list.get(i);
            team.getClass();
            as9.o(suaVar.j().b, team.getId());
            TextView textView = suaVar.j().c;
            Context context2 = suaVar.getContext();
            context2.getClass();
            textView.setText(tba.p(context2, team));
            cvaVar.d.addView(suaVar);
            if (team.getDisabled()) {
                suaVar.setBackground(null);
            } else {
                suaVar.setOnClickListener(new au7(16, activity, team));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x045f, code lost:
    
        if ((r2 != null ? r2.getNumberOfCompetitors() : r9) != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05e4 A[LOOP:1: B:87:0x05de->B:89:0x05e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0645  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(FragmentActivity fragmentActivity, eva evaVar, boolean z, boolean z2) {
        Integer num;
        int i;
        Integer numberOfSets;
        int i2;
        Team titleHolder;
        fragmentActivity.getClass();
        UniqueTournamentDetails uniqueTournamentDetails = evaVar.a;
        if (this.e || uniqueTournamentDetails == null) {
            return;
        }
        this.e = true;
        j(fragmentActivity, uniqueTournamentDetails.getUpperDivisions(), getBinding().j);
        SeasonInfo seasonInfo = evaVar.j;
        if (seasonInfo != null) {
            l(fragmentActivity, seasonInfo.getNewcomersUpperDivision(), getBinding().g);
        }
        j(fragmentActivity, uniqueTournamentDetails.getLowerDivisions(), getBinding().i);
        if (seasonInfo != null) {
            l(fragmentActivity, seasonInfo.getNewcomersLowerDivision(), getBinding().e);
            l(fragmentActivity, seasonInfo.getNewcomersOther(), getBinding().f);
        }
        List<UniqueTournament> linkedUniqueTournaments = uniqueTournamentDetails.getLinkedUniqueTournaments();
        if (!linkedUniqueTournaments.isEmpty()) {
            getBinding().h.b.setVisibility(0);
            for (UniqueTournament uniqueTournament : linkedUniqueTournaments) {
                Context context = getContext();
                context.getClass();
                sua suaVar = new sua(context);
                uniqueTournament.getClass();
                as9.q(suaVar.j().b, Integer.valueOf(uniqueTournament.getId()), 0, null);
                suaVar.j().c.setText(tba.x(uniqueTournament));
                suaVar.setOnClickListener(new au7(14, this, uniqueTournament));
                getBinding().h.d.addView(suaVar);
            }
        }
        if (seasonInfo != null) {
            List<String> hostCities = seasonInfo.getHostCities();
            if (hostCities == null) {
                hostCities = km5.a;
            }
            List<String> list = hostCities;
            List<String> hostCountries = seasonInfo.getHostCountries();
            if (list.isEmpty() && hostCountries.isEmpty()) {
                getBinding().d.b.setVisibility(8);
                getBinding().d.d.setVisibility(8);
            } else {
                getBinding().d.b.setVisibility(0);
                if (!list.isEmpty()) {
                    Context context2 = getContext();
                    context2.getClass();
                    vm6 vm6Var = new vm6(context2);
                    if (list.size() > 1) {
                        String string = vm6Var.getResources().getString(R.string.cities);
                        string.getClass();
                        vm6Var.j(string, null, true);
                    } else {
                        String string2 = vm6Var.getResources().getString(R.string.city);
                        string2.getClass();
                        vm6Var.j(string2, null, true);
                    }
                    vm6Var.setLabelValue(CollectionsKt.f0(list, ", ", null, null, null, 62));
                    getBinding().d.d.addView(vm6Var);
                }
                if (!hostCountries.isEmpty()) {
                    Context context3 = getContext();
                    context3.getClass();
                    vm6 vm6Var2 = new vm6(context3);
                    if (hostCountries.size() > 1) {
                        String string3 = vm6Var2.getResources().getString(R.string.countries);
                        string3.getClass();
                        vm6Var2.j(string3, null, true);
                    } else {
                        String string4 = vm6Var2.getResources().getString(R.string.country);
                        string4.getClass();
                        vm6Var2.j(string4, null, true);
                    }
                    vm6Var2.setLabelValue(CollectionsKt.f0(hostCountries, ", ", null, null, null, 62));
                    getBinding().d.d.addView(vm6Var2);
                }
            }
            getBinding().b.b.setVisibility(8);
            String tier = seasonInfo.getTier();
            if (tier != null) {
                getBinding().b.b.setVisibility(0);
                Context context4 = getContext();
                context4.getClass();
                vm6 vm6Var3 = new vm6(context4);
                String string5 = vm6Var3.getContext().getString(R.string.division_level);
                string5.getClass();
                vm6Var3.j(string5, null, true);
                vm6Var3.setLabelValue(tier);
                getBinding().b.d.addView(vm6Var3);
            }
            Integer numberOfRounds = seasonInfo.getNumberOfRounds();
            if (numberOfRounds != null) {
                getBinding().b.b.setVisibility(0);
                Context context5 = getContext();
                context5.getClass();
                vm6 vm6Var4 = new vm6(context5);
                String string6 = vm6Var4.getContext().getString(R.string.number_rounds);
                string6.getClass();
                vm6Var4.j(string6, null, true);
                vm6Var4.setLabelValue(String.valueOf(numberOfRounds.intValue()));
                getBinding().b.d.addView(vm6Var4);
            }
            Integer goals = seasonInfo.getGoals();
            Integer homeTeamWins = seasonInfo.getHomeTeamWins();
            Integer draws = seasonInfo.getDraws();
            Integer awayTeamWins = seasonInfo.getAwayTeamWins();
            Integer yellowCards = seasonInfo.getYellowCards();
            Integer redCards = seasonInfo.getRedCards();
            if (goals != null && homeTeamWins != null && draws != null && awayTeamWins != null) {
                int intValue = awayTeamWins.intValue() + draws.intValue() + homeTeamWins.intValue();
                getBinding().b.b.setVisibility(0);
                double d = intValue;
                double intValue2 = goals.intValue() / d;
                Context context6 = getContext();
                context6.getClass();
                vm6 vm6Var5 = new vm6(context6);
                String string7 = vm6Var5.getContext().getString(R.string.football_avg_goals);
                string7.getClass();
                vm6Var5.j(string7, null, true);
                String format = new DecimalFormat("#0.00", new DecimalFormatSymbols(dla.d())).format(intValue2);
                format.getClass();
                vm6Var5.setLabelValue(format);
                getBinding().b.d.addView(vm6Var5);
                int a = wzb.a((homeTeamWins.intValue() * 100.0d) / d);
                int a2 = wzb.a((awayTeamWins.intValue() * 100.0d) / d);
                int i3 = (100 - a) - a2;
                Context context7 = getContext();
                context7.getClass();
                vm6 vm6Var6 = new vm6(context7);
                String string8 = vm6Var6.getContext().getString(R.string.home_team_wins);
                string8.getClass();
                vm6Var6.j(string8, null, true);
                vm6Var6.setLabelValue(String.format(dla.d(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(a)}, 1)));
                getBinding().b.d.addView(vm6Var6);
                Context context8 = getContext();
                context8.getClass();
                vm6 vm6Var7 = new vm6(context8);
                String string9 = vm6Var7.getContext().getString(R.string.draws);
                string9.getClass();
                vm6Var7.j(string9, null, true);
                vm6Var7.setLabelValue(String.format(dla.d(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
                getBinding().b.d.addView(vm6Var7);
                Context context9 = getContext();
                context9.getClass();
                vm6 vm6Var8 = new vm6(context9);
                String string10 = vm6Var8.getContext().getString(R.string.away_team_wins);
                string10.getClass();
                vm6Var8.j(string10, null, true);
                vm6Var8.setLabelValue(String.format(dla.d(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(a2)}, 1)));
                getBinding().b.d.addView(vm6Var8);
                if (yellowCards == null || redCards == null) {
                    num = null;
                } else {
                    Context context10 = getContext();
                    context10.getClass();
                    vm6 vm6Var9 = new vm6(context10);
                    String string11 = vm6Var9.getContext().getString(R.string.football_yellow_cards);
                    string11.getClass();
                    vm6Var9.j(string11, null, true);
                    String format2 = new DecimalFormat("#0.00", new DecimalFormatSymbols(dla.d())).format(yellowCards.intValue() / d);
                    format2.getClass();
                    vm6Var9.setLabelValue(format2);
                    getBinding().b.d.addView(vm6Var9);
                    Context context11 = getContext();
                    context11.getClass();
                    vm6 vm6Var10 = new vm6(context11);
                    String string12 = vm6Var10.getContext().getString(R.string.football_red_cards);
                    string12.getClass();
                    num = null;
                    vm6Var10.j(string12, null, true);
                    String format3 = new DecimalFormat("#0.00", new DecimalFormatSymbols(dla.d())).format(redCards.intValue() / d);
                    format3.getClass();
                    vm6Var10.setLabelValue(format3);
                    getBinding().b.d.addView(vm6Var10);
                }
                ArrayList arrayList = this.f;
                arrayList.clear();
                LinearLayout linearLayout = (LinearLayout) getBinding().c.c;
                if (z) {
                    if (uniqueTournamentDetails.getNumberOfSets() == null) {
                        if ((seasonInfo != null ? seasonInfo.getTotalPrizeMoneyRaw() : num) == null) {
                        }
                    }
                    i = 0;
                    linearLayout.setVisibility(i);
                    numberOfSets = uniqueTournamentDetails.getNumberOfSets();
                    if (numberOfSets != null) {
                        int intValue3 = numberOfSets.intValue();
                        t22 c = t22.c(LayoutInflater.from(getContext()), (LinearLayout) getBinding().c.c);
                        c.d.setText(fragmentActivity.getString(R.string.number_of_sets));
                        c.c.setText(String.valueOf(intValue3));
                    }
                    if (seasonInfo != null) {
                        Money totalPrizeMoneyRaw = seasonInfo.getTotalPrizeMoneyRaw();
                        if (totalPrizeMoneyRaw != null) {
                            String string13 = fragmentActivity.getString(R.string.total_prize_money);
                            string13.getClass();
                            t22 c2 = t22.c(LayoutInflater.from(getContext()), (LinearLayout) getBinding().c.c);
                            c2.d.setText(string13);
                            long intValue4 = uniqueTournamentDetails.getEndDateTimestamp() != null ? r6.intValue() : 0L;
                            Set set = o84.a;
                            Context context12 = getContext();
                            context12.getClass();
                            i2 = 8;
                            c2.c.setText(o84.a(context12, totalPrizeMoneyRaw, intValue4, 8));
                        } else {
                            i2 = 8;
                        }
                        Integer numberOfCompetitors = seasonInfo.getNumberOfCompetitors();
                        if (numberOfCompetitors != null) {
                            int intValue5 = numberOfCompetitors.intValue();
                            t22 c3 = t22.c(LayoutInflater.from(getContext()), (LinearLayout) getBinding().c.c);
                            c3.d.setText(fragmentActivity.getString(R.string.number_of_competitors));
                            c3.c.setText(String.valueOf(intValue5));
                        }
                    } else {
                        i2 = 8;
                    }
                    ((GridLayout) getBinding().c.d).setVisibility((z || (uniqueTournamentDetails.getTitleHolder() == null && uniqueTournamentDetails.getMostTitlesTeams().isEmpty())) ? i2 : 0);
                    ((LinearLayout) getBinding().c.b).setVisibility((!(((LinearLayout) getBinding().c.c).getVisibility() == 0 || ((GridLayout) getBinding().c.d).getVisibility() == 0) || z2) ? i2 : 0);
                    titleHolder = uniqueTournamentDetails.getTitleHolder();
                    if (titleHolder != null) {
                        String string14 = getResources().getString(R.string.title_holder);
                        string14.getClass();
                        if (uniqueTournamentDetails.getTitleHolderTitles() != null) {
                            string14 = string14 + " (" + uniqueTournamentDetails.getTitleHolderTitles() + ")";
                        }
                        GridItem gridItem = new GridItem(GridItem.Type.BIG_IMAGE, string14);
                        Context context13 = getContext();
                        context13.getClass();
                        gridItem.setFirst(tba.A(context13, titleHolder));
                        gridItem.setTeam(titleHolder);
                        gridItem.setIsEnabled(!titleHolder.getDisabled());
                        arrayList.add(gridItem);
                    }
                    for (Team team : uniqueTournamentDetails.getMostTitlesTeams()) {
                        GridItem gridItem2 = new GridItem(GridItem.Type.BIG_IMAGE, getResources().getString(R.string.most_titles) + " (" + uniqueTournamentDetails.getMostTitles() + ")");
                        Context context14 = getContext();
                        context14.getClass();
                        gridItem2.setFirst(tba.A(context14, team));
                        gridItem2.setTeam(team);
                        gridItem2.setIsEnabled(team.getDisabled() ^ true);
                        arrayList.add(gridItem2);
                    }
                    for (GridItem gridItem3 : CollectionsKt.L0(arrayList, 9)) {
                        LayoutInflater from = LayoutInflater.from(getContext());
                        GridLayout gridLayout = (GridLayout) getBinding().c.d;
                        View inflate = from.inflate(R.layout.chart_item_layout, (ViewGroup) gridLayout, false);
                        gridLayout.addView(inflate);
                        int i4 = R.id.chart_item_description;
                        TextView textView = (TextView) nq8.B(R.id.chart_item_description, inflate);
                        if (textView != null) {
                            i4 = R.id.chart_item_icon;
                            PieChartView pieChartView = (PieChartView) nq8.B(R.id.chart_item_icon, inflate);
                            if (pieChartView != null) {
                                i4 = R.id.chart_item_value;
                                TextView textView2 = (TextView) nq8.B(R.id.chart_item_value, inflate);
                                if (textView2 != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                                    GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                                    layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                                    layoutParams.width = -2;
                                    layoutParams.height = -2;
                                    linearLayout2.setLayoutParams(layoutParams);
                                    Team team2 = gridItem3.getTeam();
                                    if (team2 != null) {
                                        String R = pco.R(team2.getId());
                                        apf a3 = ajh.a(pieChartView.getContext());
                                        ht9 ht9Var = new ht9(pieChartView.getContext());
                                        ht9Var.c = R;
                                        vt9.f(ht9Var, pieChartView);
                                        vt9.e(ht9Var, R.drawable.team_logo_placeholder);
                                        ht9Var.q = jrg.b;
                                        a3.a(ht9Var.a());
                                        linearLayout2.setOnClickListener(new au7(15, this, team2));
                                    }
                                    textView2.setText(gridItem3.getFirst());
                                    textView.setText(gridItem3.getDescription());
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return;
                    }
                }
                i = 8;
                linearLayout.setVisibility(i);
                numberOfSets = uniqueTournamentDetails.getNumberOfSets();
                if (numberOfSets != null) {
                }
                if (seasonInfo != null) {
                }
                ((GridLayout) getBinding().c.d).setVisibility((z || (uniqueTournamentDetails.getTitleHolder() == null && uniqueTournamentDetails.getMostTitlesTeams().isEmpty())) ? i2 : 0);
                if (((LinearLayout) getBinding().c.c).getVisibility() == 0) {
                    ((LinearLayout) getBinding().c.b).setVisibility((!(((LinearLayout) getBinding().c.c).getVisibility() == 0 || ((GridLayout) getBinding().c.d).getVisibility() == 0) || z2) ? i2 : 0);
                    titleHolder = uniqueTournamentDetails.getTitleHolder();
                    if (titleHolder != null) {
                    }
                    while (r1.hasNext()) {
                    }
                    while (r1.hasNext()) {
                    }
                }
                ((LinearLayout) getBinding().c.b).setVisibility((!(((LinearLayout) getBinding().c.c).getVisibility() == 0 || ((GridLayout) getBinding().c.d).getVisibility() == 0) || z2) ? i2 : 0);
                titleHolder = uniqueTournamentDetails.getTitleHolder();
                if (titleHolder != null) {
                }
                while (r1.hasNext()) {
                }
                while (r1.hasNext()) {
                }
            }
        }
        num = null;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        LinearLayout linearLayout3 = (LinearLayout) getBinding().c.c;
        if (z) {
        }
        i = 8;
        linearLayout3.setVisibility(i);
        numberOfSets = uniqueTournamentDetails.getNumberOfSets();
        if (numberOfSets != null) {
        }
        if (seasonInfo != null) {
        }
        ((GridLayout) getBinding().c.d).setVisibility((z || (uniqueTournamentDetails.getTitleHolder() == null && uniqueTournamentDetails.getMostTitlesTeams().isEmpty())) ? i2 : 0);
        ((LinearLayout) getBinding().c.b).setVisibility((!(((LinearLayout) getBinding().c.c).getVisibility() == 0 || ((GridLayout) getBinding().c.d).getVisibility() == 0) || z2) ? i2 : 0);
        titleHolder = uniqueTournamentDetails.getTitleHolder();
        if (titleHolder != null) {
        }
        while (r1.hasNext()) {
        }
        while (r1.hasNext()) {
        }
    }
}
