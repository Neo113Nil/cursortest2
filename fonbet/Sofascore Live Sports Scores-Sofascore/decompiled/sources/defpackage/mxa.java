package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.SeasonHighlightedComparison;
import com.sofascore.results.R;
import com.sofascore.results.league.historical.LeagueHistoricalDataActivity;
import com.sofascore.results.league.historical.topperformance.HistoricalDataTopPerformanceModal;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mxa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueHistoricalDataActivity b;

    public /* synthetic */ mxa(LeagueHistoricalDataActivity leagueHistoricalDataActivity, int i) {
        this.a = i;
        this.b = leagueHistoricalDataActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cc  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int color;
        String str;
        SharedPreferences d;
        int i = this.a;
        int i2 = 3;
        LeagueHistoricalDataActivity leagueHistoricalDataActivity = this.b;
        switch (i) {
            case 0:
                rlj rljVar = (rlj) obj;
                int i3 = LeagueHistoricalDataActivity.Q;
                if (rljVar != null) {
                    HistoricalDataTopPerformanceModal historicalDataTopPerformanceModal = new HistoricalDataTopPerformanceModal();
                    ulj.b.getClass();
                    ulj uljVar = rljVar instanceof cmj ? ulj.TOP_PLAYERS : rljVar instanceof moj ? ulj.TOP_TEAMS : ulj.TOP_STATS;
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("type", uljVar);
                    bundle.putString("categoryName", rljVar.g0());
                    bundle.putSerializable(InneractiveMediationDefs.KEY_GENDER, null);
                    historicalDataTopPerformanceModal.setArguments(bundle);
                    Unit unit = Unit.a;
                    LeagueHistoricalDataActivity leagueHistoricalDataActivity2 = leagueHistoricalDataActivity instanceof AppCompatActivity ? leagueHistoricalDataActivity : null;
                    if (leagueHistoricalDataActivity2 != null) {
                        wca.x(leagueHistoricalDataActivity2.getLifecycle()).b(new r1(historicalDataTopPerformanceModal, leagueHistoricalDataActivity2, null, 3));
                    }
                }
                return Unit.a;
            case 1:
                cya cyaVar = (cya) obj;
                int i4 = LeagueHistoricalDataActivity.Q;
                UniqueTournament uniqueTournament = cyaVar.a;
                List<Season> list = cyaVar.b;
                w82 w82Var = leagueHistoricalDataActivity.R().c;
                w82Var.d.setText(tba.x(uniqueTournament));
                w82Var.e.setText(R.string.football_historical_data);
                ImageView imageView = w82Var.c;
                as9.q(imageView, Integer.valueOf(((Number) leagueHistoricalDataActivity.K.getValue()).intValue()), 0, null);
                imageView.setImageTintList(ColorStateList.valueOf(leagueHistoricalDataActivity.getColor(R.color.on_color_primary)));
                UniqueTournament uniqueTournament2 = cyaVar.a;
                SwipeRefreshLayout swipeRefreshLayout = leagueHistoricalDataActivity.R().i;
                String secondaryColorHex = uniqueTournament2.getSecondaryColorHex();
                if (secondaryColorHex != null) {
                    if (secondaryColorHex.length() <= 0) {
                        secondaryColorHex = null;
                    }
                    if (secondaryColorHex != null) {
                        color = k53.f0(Color.parseColor(secondaryColorHex), leagueHistoricalDataActivity);
                        z8e.X(swipeRefreshLayout, leagueHistoricalDataActivity, Integer.valueOf(color));
                        swipeRefreshLayout.setOnChildScrollUpCallback(new u8f(3));
                        swipeRefreshLayout.setOnRefreshListener(new kr9(leagueHistoricalDataActivity, 5));
                        TypeHeaderView typeHeaderView = leagueHistoricalDataActivity.R().f;
                        ArrayList arrayList = new ArrayList(k13.r(list, 10));
                        for (Season season : list) {
                            arrayList.add(season.isAllTimeSeason() ? leagueHistoricalDataActivity.getString(R.string.all_time_filter) : season.getYear());
                        }
                        TypeHeaderView.z(typeHeaderView, arrayList, null, 6);
                        if (!list.isEmpty()) {
                            Integer M = z8e.M(list, new mxa(leagueHistoricalDataActivity, i2));
                            int intValue = M != null ? M.intValue() : 0;
                            leagueHistoricalDataActivity.R().f.setSelectedIndex(intValue);
                            leagueHistoricalDataActivity.Q(intValue);
                        }
                        return Unit.a;
                    }
                }
                color = leagueHistoricalDataActivity.getColor(R.color.primary_default);
                z8e.X(swipeRefreshLayout, leagueHistoricalDataActivity, Integer.valueOf(color));
                swipeRefreshLayout.setOnChildScrollUpCallback(new u8f(3));
                swipeRefreshLayout.setOnRefreshListener(new kr9(leagueHistoricalDataActivity, 5));
                TypeHeaderView typeHeaderView2 = leagueHistoricalDataActivity.R().f;
                ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                while (r2.hasNext()) {
                }
                TypeHeaderView.z(typeHeaderView2, arrayList2, null, 6);
                if (!list.isEmpty()) {
                }
                return Unit.a;
            case 2:
                bya byaVar = (bya) obj;
                int i5 = LeagueHistoricalDataActivity.Q;
                vb9 vb9Var = (vb9) leagueHistoricalDataActivity.O.getValue();
                byaVar.getClass();
                vb9Var.getClass();
                xbb b = a.b();
                if (byaVar.b.isAllTimeSeason()) {
                    Context context = vb9Var.b;
                    context.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    if (sharedPreferences.getBoolean("showHistoricalDataInfoBanner", true) && (str = byaVar.g) != null) {
                        b.add(new rb9(str));
                    }
                }
                b.add(new pb9(6, AdType.Banner.MainScreenSmall));
                if (!byaVar.b.isAllTimeSeason()) {
                    b.add(new sb9(byaVar.a, byaVar.b));
                }
                List list2 = byaVar.c;
                if (list2 != null) {
                    b.add(new tb9(0, list2, byaVar.a, byaVar.b));
                }
                SeasonHighlightedComparison seasonHighlightedComparison = byaVar.f;
                if (seasonHighlightedComparison != null) {
                    b.add(new qb9(3, byaVar.a, byaVar.b, seasonHighlightedComparison));
                }
                b.add(new pb9(5, AdType.Banner.MainScreenBig));
                List list3 = byaVar.d;
                if (list3 != null) {
                    b.add(new tb9(1, list3, byaVar.a, byaVar.b));
                }
                SeasonHighlightedComparison seasonHighlightedComparison2 = byaVar.f;
                if (seasonHighlightedComparison2 != null) {
                    b.add(new qb9(4, byaVar.a, byaVar.b, seasonHighlightedComparison2));
                }
                List list4 = byaVar.e;
                if (list4 != null) {
                    b.add(new tb9(2, list4, byaVar.a, byaVar.b));
                }
                vb9Var.F(a.a(b));
                leagueHistoricalDataActivity.R().i.setRefreshing(false);
                return Unit.a;
            default:
                Season season2 = (Season) obj;
                int i6 = LeagueHistoricalDataActivity.Q;
                season2.getClass();
                return Boolean.valueOf(season2.getId() == ((Number) leagueHistoricalDataActivity.L.getValue()).intValue());
        }
    }
}
