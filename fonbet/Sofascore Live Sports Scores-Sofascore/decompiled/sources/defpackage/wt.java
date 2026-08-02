package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.PlayerTransferFilterData;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import com.sofascore.results.event.commentary.EventCommentaryFragment;
import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import com.sofascore.results.player.statistics.career.modal.CareerStatsTournamentPickerModal;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.sofascore.results.transfers.PlayerTransfersActivity;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class wt implements d5k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wt(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5k
    public final void a(int i, String str) {
        SharedPreferences d;
        int i2 = 0;
        r1 = false;
        boolean z = false;
        Object obj = null;
        switch (this.a) {
            case 0:
                xt xtVar = (xt) this.b;
                Context context = (Context) this.c;
                str.getClass();
                ut.b.getClass();
                xtVar.i = q1f.q(str);
                Event event = xtVar.j;
                if (event == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                xtVar.l(event, xtVar.k, xtVar.l, xtVar.m);
                ut utVar = xtVar.i;
                if (utVar == null) {
                    Intrinsics.i("currentGraphType");
                    throw null;
                }
                String name = utVar.name();
                context.getClass();
                name.getClass();
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
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putString("PREF_AM_FOOTBALL_DETAILS_GRAPH", name);
                Unit unit = Unit.a;
                edit.apply();
                return;
            case 1:
                CareerStatsTournamentPickerModal careerStatsTournamentPickerModal = (CareerStatsTournamentPickerModal) this.b;
                il2 il2Var = (il2) this.c;
                str.getClass();
                xk2 valueOf = xk2.valueOf(str);
                careerStatsTournamentPickerModal.B = valueOf;
                valueOf.getClass();
                xk2 xk2Var = il2Var.c;
                xk2 xk2Var2 = xk2.c;
                if ((xk2Var == xk2Var2) == (valueOf == xk2Var2 ? 1 : null)) {
                    return;
                }
                il2Var.c = valueOf;
                il2Var.notifyDataSetChanged();
                return;
            case 2:
                EventBoxScoreFragment eventBoxScoreFragment = (EventBoxScoreFragment) this.b;
                List list = (List) this.c;
                str.getClass();
                eventBoxScoreFragment.t.j(new hf9());
                kv5 G = eventBoxScoreFragment.G();
                b0i b0iVar = (b0i) list.get(i);
                b0iVar.getClass();
                G.n = b0iVar;
                G.u();
                krk krkVar = eventBoxScoreFragment.l;
                krkVar.getClass();
                eventBoxScoreFragment.t(((a22) krkVar).f, new nt5(eventBoxScoreFragment, 2));
                return;
            case 3:
                List<ew5> list2 = (List) this.b;
                EventCommentaryFragment eventCommentaryFragment = (EventCommentaryFragment) this.c;
                str.getClass();
                for (ew5 ew5Var : list2) {
                    if (ew5Var.getKey().equals(str)) {
                        if (Intrinsics.c(ok3.s(eventCommentaryFragment.E()), Sports.AMERICAN_FOOTBALL) && !Intrinsics.c(eventCommentaryFragment.x, ew5Var)) {
                            z = true;
                        }
                        eventCommentaryFragment.x = ew5Var;
                        EventCommentaryFragment.I(eventCommentaryFragment, z, null, 4);
                        return;
                    }
                }
                ogj.m("Collection contains no element matching the predicate.");
                return;
            case 4:
                wk8.j((wk8) this.b, (Context) this.c, str, i);
                return;
            case 5:
                PlayerCareerStatisticsFragment playerCareerStatisticsFragment = (PlayerCareerStatisticsFragment) this.b;
                TypeHeaderView typeHeaderView = (TypeHeaderView) this.c;
                str.getClass();
                playerCareerStatisticsFragment.N = true;
                if (!playerCareerStatisticsFragment.P()) {
                    playerCareerStatisticsFragment.S((PlayerCareerStatistics) playerCareerStatisticsFragment.N().g.d());
                    return;
                }
                playerCareerStatisticsFragment.T(vj1.valueOf(str));
                nme nmeVar = (nme) playerCareerStatisticsFragment.N().i.d();
                List list3 = nmeVar != null ? nmeVar.c : null;
                if (list3 == null) {
                    list3 = km5.a;
                }
                Iterator it = CollectionsKt.L0(list3, i).iterator();
                while (it.hasNext()) {
                    i2 += ((nk2) it.next()).g().size();
                }
                Regex regex = yid.a;
                int intValue = ((Number) playerCareerStatisticsFragment.M.getValue()).intValue() * i2;
                tug tugVar = playerCareerStatisticsFragment.L().o;
                Context context2 = typeHeaderView.getContext();
                context2.getClass();
                if (hkg.c0(context2)) {
                    ScrollInterceptorHorizontalScrollView b = playerCareerStatisticsFragment.L().o.b();
                    intValue = yid.m(b != null ? Integer.valueOf(b.getMaxScrollDistance()) : null) - intValue;
                }
                tugVar.f(intValue);
                return;
            case 6:
                y34 y34Var = (y34) this.b;
                TeamEventsFragment teamEventsFragment = (TeamEventsFragment) this.c;
                str.getClass();
                y34Var.invoke();
                xwi E = teamEventsFragment.E();
                g9i g9iVar = E.s;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                g9i g9iVar2 = E.t;
                if (g9iVar2 != null) {
                    g9iVar2.e(null);
                }
                g9i g9iVar3 = E.u;
                if (g9iVar3 != null) {
                    g9iVar3.e(null);
                }
                teamEventsFragment.D().s();
                xwi E2 = teamEventsFragment.E();
                yyi.c.getClass();
                Iterator<E> it2 = yyi.h.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((yyi) next).a.equals(str)) {
                            obj = next;
                        }
                    }
                }
                yyi yyiVar = (yyi) obj;
                if (yyiVar == null) {
                    yyiVar = yyi.d;
                }
                E2.r = yyiVar;
                E2.l();
                return;
            default:
                PlayerTransferFilterData playerTransferFilterData = (PlayerTransferFilterData) this.b;
                dvj dvjVar = (dvj) this.c;
                str.getClass();
                PlayerTransferFilterData resetFilterAtPosition = playerTransferFilterData.resetFilterAtPosition(i);
                FragmentActivity fragmentActivity = dvjVar.d;
                fragmentActivity.getClass();
                n9e.u(fragmentActivity, new qdj(resetFilterAtPosition, 7));
                PlayerTransfersActivity playerTransfersActivity = (PlayerTransfersActivity) dvjVar.e.b;
                int i3 = PlayerTransfersActivity.R;
                playerTransfersActivity.Q(resetFilterAtPosition);
                return;
        }
    }
}
