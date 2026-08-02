package defpackage;

import android.content.Context;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.util.MonthWithYear;
import com.sofascore.results.event.boxscoreAnimation.EventBoxScoreFragmentNew;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.event.odds.additionalodds.AdditionalOddsFragment;
import com.sofascore.results.event.odds.eventrecomended.EventRecommendedOddsFragment;
import com.sofascore.results.event.odds.oddscomparison.AdditionalOddsComparisonFragment;
import com.sofascore.results.main.matches.StageSeriesWeekFragment;
import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import com.sofascore.results.main.matches.redesign.livematches.LiveMatchesFragment;
import com.sofascore.results.mma.organisation.events.MmaOrganisationEventsFragment;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.service.InstallReferrerWorker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oi implements Function1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ oi() {
        this.a = 16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                nc4 nc4Var = (nc4) obj;
                nc4Var.getClass();
                return (ltk) nc4Var.a((ddi) ((mr5) ((AdditionalOddsComparisonFragment) this.b).r.getValue()).P.getValue());
            case 1:
                nc4 nc4Var2 = (nc4) obj;
                nc4Var2.getClass();
                return (ltk) nc4Var2.a((ddi) ((mr5) ((AdditionalOddsFragment) this.b).r.getValue()).P.getValue());
            case 2:
                ((qj2) this.b).cancel();
                return Unit.a;
            case 3:
                Date date = (Date) obj;
                date.getClass();
                return ((SimpleDateFormat) this.b).format(date);
            case 4:
                ((View) obj).getClass();
                DateMatchesFragment dateMatchesFragment = (DateMatchesFragment) this.b;
                if (dateMatchesFragment.v == null) {
                    int i = jx4.d;
                    Context requireContext = dateMatchesFragment.requireContext();
                    requireContext.getClass();
                    if (rfo.L(requireContext)) {
                        Context requireContext2 = dateMatchesFragment.requireContext();
                        requireContext2.getClass();
                        jx4 jx4Var = new jx4(requireContext2);
                        g7.o(dateMatchesFragment.E(), jx4Var, 6);
                        dateMatchesFragment.v = jx4Var;
                    }
                }
                if (zu3.V.hasMcc(Integer.valueOf(ke0.c)) && dateMatchesFragment.w == null) {
                    Context requireContext3 = dateMatchesFragment.requireContext();
                    requireContext3.getClass();
                    s9d s9dVar = new s9d(requireContext3);
                    g7.o(dateMatchesFragment.E(), s9dVar, 6);
                    dateMatchesFragment.w = s9dVar;
                }
                return Unit.a;
            case 5:
                nc4 nc4Var3 = (nc4) obj;
                nc4Var3.getClass();
                return (ltk) nc4Var3.a((ddi) ((mr5) ((EventBoxScoreFragmentNew) this.b).r.getValue()).P.getValue());
            case 6:
                nc4 nc4Var4 = (nc4) obj;
                nc4Var4.getClass();
                return (ltk) nc4Var4.a((ddi) ((mr5) ((EventMatchesFragment) this.b).r.getValue()).P.getValue());
            case 7:
                nc4 nc4Var5 = (nc4) obj;
                nc4Var5.getClass();
                return (ltk) nc4Var5.a((ddi) ((mr5) ((EventRecommendedOddsFragment) this.b).r.getValue()).P.getValue());
            case 8:
                try {
                    InstallReferrerClient installReferrerClient = ((InstallReferrerWorker) this.b).a;
                    if (installReferrerClient != null) {
                        installReferrerClient.endConnection();
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                }
                return Unit.a;
            case 9:
                ((View) obj).getClass();
                LiveMatchesFragment liveMatchesFragment = (LiveMatchesFragment) this.b;
                if (liveMatchesFragment.v == null) {
                    int i2 = jx4.d;
                    Context requireContext4 = liveMatchesFragment.requireContext();
                    requireContext4.getClass();
                    if (rfo.L(requireContext4)) {
                        Context requireContext5 = liveMatchesFragment.requireContext();
                        requireContext5.getClass();
                        jx4 jx4Var2 = new jx4(requireContext5);
                        g7.o(liveMatchesFragment.C(), jx4Var2, 6);
                        liveMatchesFragment.v = jx4Var2;
                    }
                }
                if (liveMatchesFragment.w == null && zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                    Context requireContext6 = liveMatchesFragment.requireContext();
                    requireContext6.getClass();
                    s9d s9dVar2 = new s9d(requireContext6);
                    g7.o(liveMatchesFragment.C(), s9dVar2, 6);
                    liveMatchesFragment.w = s9dVar2;
                }
                return Unit.a;
            case 10:
                ((Boolean) obj).getClass();
                ((LoginScreenActivity) this.b).finish();
                return Unit.a;
            case 11:
                MonthWithYear monthWithYear = (MonthWithYear) obj;
                monthWithYear.getClass();
                MmaOrganisationEventsFragment mmaOrganisationEventsFragment = (MmaOrganisationEventsFragment) this.b;
                vpc D = mmaOrganisationEventsFragment.D();
                UniqueTournament uniqueTournament = mmaOrganisationEventsFragment.u;
                rq3 rq3Var = null;
                if (uniqueTournament == null) {
                    Intrinsics.i(SearchResponseKt.LEAGUE_ENTITY);
                    throw null;
                }
                int id = uniqueTournament.getId();
                g9i g9iVar = D.k;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                D.k = xw3.L(un0.z(D), null, null, new anc(D, id, monthWithYear, rq3Var, 2), 3);
                return Unit.a;
            case 12:
                ((Function0) this.b).invoke();
                return Unit.a;
            case 13:
                return (Map) this.b;
            case 14:
                Object obj2 = ((fsf) this.b).a;
                if (obj2 != null) {
                    ((qse) obj2).d.set(true);
                    return Unit.a;
                }
                Intrinsics.i("listener");
                throw null;
            case 15:
                lj2 lj2Var = (lj2) this.b;
                p2g p2gVar = w2g.b;
                Unit unit = Unit.a;
                lj2Var.resumeWith(unit);
                return unit;
            case 16:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                tze tzeVar = (tze) this.b;
                if (tzeVar != null) {
                    tzeVar.c = booleanValue;
                }
                return Unit.a;
            case 17:
                ((View) obj).getClass();
                x6i C = ((StageSeriesWeekFragment) this.b).C();
                C.getClass();
                Iterator it = c.I(C.i, d7i.class).iterator();
                while (it.hasNext()) {
                    C.w(it.next());
                }
                return Unit.a;
            case 18:
                float[] fArr = ((xzb) obj).a;
                dma dmaVar = (dma) this.b;
                if (dmaVar.f()) {
                    o6a.y(dmaVar).d(dmaVar, fArr);
                }
                return Unit.a;
            default:
                ((q55) this.b).d();
                return Unit.a;
        }
    }

    public /* synthetic */ oi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
