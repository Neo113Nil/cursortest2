package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.HistoricalSeasonComparisonResponse;
import com.sofascore.model.newNetwork.SeasonHighlightedComparison;
import com.sofascore.model.newNetwork.UniqueTournamentRoundsResponse;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aya {
    public final Context a;
    public final w3b b;

    public aya(Context context, w3b w3bVar) {
        w3bVar.getClass();
        this.a = context;
        this.b = w3bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        if (r15 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004b, code lost:
    
        if (r15 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, sq3 sq3Var) {
        txa txaVar;
        txa txaVar2;
        Object obj;
        int i3;
        int i4;
        List<Round> rounds;
        Round round;
        Integer round2;
        List<Event> events;
        Event event;
        if (sq3Var instanceof txa) {
            txaVar = (txa) sq3Var;
            int i5 = txaVar.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                txaVar.v = i5 - Integer.MIN_VALUE;
                txaVar2 = txaVar;
                obj = txaVar2.t;
                lu3 lu3Var = lu3.a;
                i3 = txaVar2.v;
                if (i3 != 0) {
                    y6a.M(obj);
                    txaVar2.r = i;
                    txaVar2.s = i2;
                    txaVar2.v = 1;
                    obj = this.b.C0(i, i2, txaVar2);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        EventListResponse eventListResponse = (EventListResponse) obj;
                        if (eventListResponse != null && (events = eventListResponse.getEvents()) != null && (event = (Event) CollectionsKt.firstOrNull(events)) != null) {
                            Integer winnerCode$default = Event.getWinnerCode$default(event, null, 1, null);
                            Context context = this.a;
                            return new ec9(tba.p(context, (winnerCode$default != null && winnerCode$default.intValue() == 1) ? Event.getHomeTeam$default(event, null, 1, null) : Event.getAwayTeam$default(event, null, 1, null)), sha.H(context, event));
                        }
                        return null;
                    }
                    i2 = txaVar2.s;
                    i = txaVar2.r;
                    y6a.M(obj);
                }
                i4 = i2;
                UniqueTournamentRoundsResponse uniqueTournamentRoundsResponse = (UniqueTournamentRoundsResponse) obj;
                rounds = uniqueTournamentRoundsResponse == null ? uniqueTournamentRoundsResponse.getRounds() : null;
                if (rounds != null && (round = (Round) CollectionsKt.j0(rounds)) != null && (round2 = round.getRound()) != null) {
                    int intValue = round2.intValue();
                    String slug = round.getSlug();
                    String t6eVar = t6e.a.toString();
                    txaVar2.r = i;
                    txaVar2.s = i4;
                    txaVar2.v = 2;
                    obj = this.b.B0(i, i4, intValue, slug, null, t6eVar, 0, txaVar2);
                }
                return null;
            }
        }
        txaVar = new txa(this, sq3Var);
        txaVar2 = txaVar;
        obj = txaVar2.t;
        lu3 lu3Var2 = lu3.a;
        i3 = txaVar2.v;
        if (i3 != 0) {
        }
        i4 = i2;
        UniqueTournamentRoundsResponse uniqueTournamentRoundsResponse2 = (UniqueTournamentRoundsResponse) obj;
        if (uniqueTournamentRoundsResponse2 == null) {
        }
        if (rounds != null) {
            int intValue2 = round2.intValue();
            String slug2 = round.getSlug();
            String t6eVar2 = t6e.a.toString();
            txaVar2.r = i;
            txaVar2.s = i4;
            txaVar2.v = 2;
            obj = this.b.B0(i, i4, intValue2, slug2, null, t6eVar2, 0, txaVar2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0051, code lost:
    
        if (r2 == r4) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, sq3 sq3Var) {
        uxa uxaVar;
        lu3 lu3Var;
        int i2;
        List<SeasonHighlightedComparison> comparisons;
        List<SeasonHighlightedComparison> M0;
        List B0;
        gv9 W;
        vt2 vt2Var;
        rxa rxaVar;
        Object r;
        int i3;
        gv9 gv9Var;
        gv9 gv9Var2;
        int i4 = i;
        if (sq3Var instanceof uxa) {
            uxaVar = (uxa) sq3Var;
            int i5 = uxaVar.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                uxaVar.v = i5 - Integer.MIN_VALUE;
                Object obj = uxaVar.t;
                lu3Var = lu3.a;
                i2 = uxaVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    uxaVar.r = i4;
                    uxaVar.v = 1;
                    obj = this.b.e(i4, uxaVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i6 = uxaVar.r;
                        gv9 gv9Var3 = uxaVar.s;
                        y6a.M(obj);
                        i3 = i6;
                        gv9Var = gv9Var3;
                        gv9Var2 = (gv9) obj;
                        if (gv9Var2 != null) {
                            vt2 vt2Var2 = (vt2) CollectionsKt.firstOrNull(gv9Var);
                            return new sxa(i3, gv9Var, gv9Var2, vt2Var2 != null ? (rxa) vt2Var2.a : null, (ec9) null, 48);
                        }
                        return null;
                    }
                    i4 = uxaVar.r;
                    y6a.M(obj);
                }
                HistoricalSeasonComparisonResponse historicalSeasonComparisonResponse = (HistoricalSeasonComparisonResponse) obj;
                comparisons = historicalSeasonComparisonResponse == null ? historicalSeasonComparisonResponse.getComparisons() : null;
                if (comparisons != null && (M0 = CollectionsKt.M0(9, comparisons)) != null) {
                    ArrayList arrayList = new ArrayList(k13.r(M0, 10));
                    for (SeasonHighlightedComparison seasonHighlightedComparison : M0) {
                        rxa rxaVar2 = new rxa(seasonHighlightedComparison.getSeason().getId(), seasonHighlightedComparison.getSeason().isAllTimeSeason());
                        String string = seasonHighlightedComparison.getSeason().isAllTimeSeason() ? this.a.getString(R.string.all_time_filter) : seasonHighlightedComparison.getSeason().getYear();
                        string.getClass();
                        arrayList.add(new vt2(rxaVar2, string, false, null, null, null, null, 252));
                    }
                    B0 = CollectionsKt.B0(arrayList);
                    if (B0 != null && (W = l6g.W(B0)) != null && (vt2Var = (vt2) CollectionsKt.firstOrNull(W)) != null && (rxaVar = (rxa) vt2Var.a) != null) {
                        uxaVar.s = W;
                        uxaVar.r = i4;
                        uxaVar.v = 2;
                        r = s9a.r(new xxa(i4, null, rxaVar, this), uxaVar);
                        if (r != lu3Var) {
                            i3 = i4;
                            gv9Var = W;
                            obj = r;
                            gv9Var2 = (gv9) obj;
                            if (gv9Var2 != null) {
                            }
                        }
                        return lu3Var;
                    }
                }
                return null;
            }
        }
        uxaVar = new uxa(this, sq3Var);
        Object obj2 = uxaVar.t;
        lu3Var = lu3.a;
        i2 = uxaVar.v;
        if (i2 != 0) {
        }
        HistoricalSeasonComparisonResponse historicalSeasonComparisonResponse2 = (HistoricalSeasonComparisonResponse) obj2;
        if (historicalSeasonComparisonResponse2 == null) {
        }
        if (comparisons != null) {
            ArrayList arrayList2 = new ArrayList(k13.r(M0, 10));
            while (r2.hasNext()) {
            }
            B0 = CollectionsKt.B0(arrayList2);
            if (B0 != null) {
                uxaVar.s = W;
                uxaVar.r = i4;
                uxaVar.v = 2;
                r = s9a.r(new xxa(i4, null, rxaVar, this), uxaVar);
                if (r != lu3Var) {
                }
                return lu3Var;
            }
        }
        return null;
    }
}
