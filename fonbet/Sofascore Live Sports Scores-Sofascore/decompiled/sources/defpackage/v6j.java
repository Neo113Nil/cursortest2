package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.sofascore.model.Money;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.newNetwork.SeasonInfo;
import com.sofascore.results.R;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v6j extends o8 {
    public final vy1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6j(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = vy1.a(getRoot());
        setVisibility(8);
    }

    private final void setNumberOfCompetitors(SeasonInfo seasonInfo) {
        Integer numberOfCompetitors;
        if (seasonInfo == null || (numberOfCompetitors = seasonInfo.getNumberOfCompetitors()) == null) {
            return;
        }
        int intValue = numberOfCompetitors.intValue();
        Context context = getContext();
        context.getClass();
        vm6 vm6Var = new vm6(context);
        String string = vm6Var.getContext().getString(R.string.number_of_competitors);
        string.getClass();
        vm6Var.j(string, null, true);
        vm6Var.setLabelValue(String.valueOf(intValue));
        this.d.b.addView(vm6Var);
    }

    private final void setNumberOfSets(UniqueTournamentDetails uniqueTournamentDetails) {
        Integer numberOfSets;
        if (uniqueTournamentDetails == null || (numberOfSets = uniqueTournamentDetails.getNumberOfSets()) == null) {
            return;
        }
        int intValue = numberOfSets.intValue();
        Context context = getContext();
        context.getClass();
        vm6 vm6Var = new vm6(context);
        String string = vm6Var.getContext().getString(R.string.number_of_sets);
        string.getClass();
        vm6Var.j(string, null, true);
        vm6Var.setLabelValue(String.valueOf(intValue));
        this.d.b.addView(vm6Var);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.summary_info_layout;
    }

    public final void j(UniqueTournamentDetails uniqueTournamentDetails, SeasonInfo seasonInfo) {
        Money totalPrizeMoneyRaw;
        if (getVisibility() == 0) {
            return;
        }
        if (uniqueTournamentDetails == null && seasonInfo == null) {
            return;
        }
        setVisibility(0);
        LayoutInflater from = LayoutInflater.from(getContext());
        vy1 vy1Var = this.d;
        LinearLayout linearLayout = vy1Var.b;
        LinearLayout linearLayout2 = vy1Var.b;
        kqb d = kqb.d(from, linearLayout, true);
        d.b.setBackground(null);
        d.d.setText(getResources().getString(R.string.info));
        setNumberOfSets(uniqueTournamentDetails);
        if (uniqueTournamentDetails != null && seasonInfo != null && (totalPrizeMoneyRaw = seasonInfo.getTotalPrizeMoneyRaw()) != null) {
            int id = uniqueTournamentDetails.getId();
            Regex regex = yid.a;
            boolean z = id == 2363 || id == 2480 || id == 2361 || id == 2449 || id == 2571 || id == 2577 || id == 2600 || id == 2601;
            long n = yid.n(uniqueTournamentDetails.getEndDateTimestamp() != null ? Long.valueOf(r14.intValue()) : null);
            Context context = getContext();
            context.getClass();
            vm6 vm6Var = new vm6(context);
            if (z) {
                String string = vm6Var.getContext().getString(R.string.total_prize_pool);
                string.getClass();
                vm6Var.j(string, new w1i(vm6Var, 14), false);
            } else {
                String string2 = vm6Var.getContext().getString(R.string.total_prize_money);
                string2.getClass();
                vm6Var.j(string2, null, true);
            }
            Set set = o84.a;
            Context context2 = vm6Var.getContext();
            context2.getClass();
            vm6Var.setLabelValue(o84.a(context2, totalPrizeMoneyRaw, n, 8));
            linearLayout2.addView(vm6Var);
        }
        setNumberOfCompetitors(seasonInfo);
        List<String> hostCities = seasonInfo != null ? seasonInfo.getHostCities() : null;
        if (hostCities == null) {
            hostCities = km5.a;
        }
        List<String> list = hostCities;
        List<String> hostCountries = seasonInfo != null ? seasonInfo.getHostCountries() : null;
        if (hostCountries == null) {
            hostCountries = km5.a;
        }
        if (list.isEmpty() && hostCountries.isEmpty()) {
            return;
        }
        if (!list.isEmpty()) {
            Context context3 = getContext();
            context3.getClass();
            vm6 vm6Var2 = new vm6(context3);
            if (list.size() > 1) {
                String string3 = vm6Var2.getResources().getString(R.string.cities);
                string3.getClass();
                vm6Var2.j(string3, null, true);
            } else {
                String string4 = vm6Var2.getResources().getString(R.string.city);
                string4.getClass();
                vm6Var2.j(string4, null, true);
            }
            vm6Var2.setLabelValue(CollectionsKt.f0(list, ", ", null, null, null, 62));
            linearLayout2.addView(vm6Var2);
        }
        if (hostCountries.isEmpty()) {
            return;
        }
        Context context4 = getContext();
        context4.getClass();
        vm6 vm6Var3 = new vm6(context4);
        if (hostCountries.size() > 1) {
            String string5 = vm6Var3.getResources().getString(R.string.countries);
            string5.getClass();
            vm6Var3.j(string5, null, true);
        } else {
            String string6 = vm6Var3.getResources().getString(R.string.country);
            string6.getClass();
            vm6Var3.j(string6, null, true);
        }
        vm6Var3.setLabelValue(CollectionsKt.f0(hostCountries, ", ", null, null, null, 62));
        linearLayout2.addView(vm6Var3);
    }
}
