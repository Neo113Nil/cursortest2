package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.PlayerHeadFlags;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.SeasonKt;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatisticSeasonRaw;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatisticsResponse;
import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cme implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerCareerStatisticsFragment b;

    public /* synthetic */ cme(PlayerCareerStatisticsFragment playerCareerStatisticsFragment, int i) {
        this.a = i;
        this.b = playerCareerStatisticsFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0411  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List list;
        PickerItem.Tournament tournament;
        PickerItem.Tournament tournament2;
        PickerItem.Tournament tournament3;
        Object obj2;
        PickerItem.Tournament tournament4;
        Object obj3;
        Object obj4;
        PlayerCareerStatisticsResponse careerStatistics;
        List<PlayerCareerStatisticSeasonRaw> seasons;
        PlayerCareerStatisticsResponse careerStatistics2;
        Map<Integer, List<String>> typesMap;
        TextView textView;
        int i = this.a;
        int i2 = 0;
        PlayerCareerStatisticsFragment playerCareerStatisticsFragment = this.b;
        switch (i) {
            case 0:
                joa joaVar = playerCareerStatisticsFragment.u;
                PlayerHeadFlags playerHeadFlags = (PlayerHeadFlags) obj;
                if (playerCareerStatisticsFragment.M().isEmpty()) {
                    if (playerHeadFlags != null && (careerStatistics2 = playerHeadFlags.getCareerStatistics()) != null && (typesMap = careerStatistics2.getTypesMap()) != null) {
                        for (Map.Entry<Integer, List<String>> entry : typesMap.entrySet()) {
                            playerCareerStatisticsFragment.L.put(entry.getKey(), SeasonKt.mapToSubSeasonType(entry.getValue()));
                        }
                    }
                    if (playerHeadFlags == null || (careerStatistics = playerHeadFlags.getCareerStatistics()) == null || (seasons = careerStatistics.getSeasons()) == null) {
                        list = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = seasons.iterator();
                        while (it.hasNext()) {
                            UniqueTournament uniqueTournament = ((PlayerCareerStatisticSeasonRaw) it.next()).getUniqueTournament();
                            if (uniqueTournament != null) {
                                arrayList.add(uniqueTournament);
                            }
                        }
                        list = CollectionsKt.S0(CollectionsKt.V0(arrayList));
                    }
                    if (list == null) {
                        list = km5.a;
                    }
                    ((eoh) playerCareerStatisticsFragment.H).setValue(list);
                    wk2 wk2Var = playerCareerStatisticsFragment.C().k;
                    if (wk2Var != null) {
                        List M = playerCareerStatisticsFragment.M();
                        Function1 function1 = wk2Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : M) {
                            if (((Boolean) function1.invoke(obj5)).booleanValue()) {
                                arrayList2.add(obj5);
                            }
                        }
                        int size = arrayList2.size();
                        if (size != 0) {
                            if (size != 1) {
                                tournament4 = new PickerItem.Tournament(wk2Var, null, null);
                                tournament3 = tournament4;
                                if (tournament3 != null) {
                                    ((eoh) playerCareerStatisticsFragment.J).setValue(tournament3);
                                    playerCareerStatisticsFragment.R();
                                }
                            } else {
                                UniqueTournament uniqueTournament2 = (UniqueTournament) CollectionsKt.Y(arrayList2);
                                uniqueTournament2.getClass();
                                tournament3 = new PickerItem.Tournament(wk2Var, uniqueTournament2, null);
                                if (tournament3 != null) {
                                }
                            }
                        }
                    }
                    if (((Integer) joaVar.getValue()) != null) {
                        Iterator it2 = playerCareerStatisticsFragment.M().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj4 = it2.next();
                                int id = ((UniqueTournament) obj4).getId();
                                Integer num = (Integer) joaVar.getValue();
                                if (num != null && id == num.intValue()) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        UniqueTournament uniqueTournament3 = (UniqueTournament) obj4;
                        if (uniqueTournament3 != null) {
                            tournament4 = new PickerItem.Tournament(null, uniqueTournament3, null);
                            tournament3 = tournament4;
                            if (tournament3 != null) {
                            }
                        }
                    }
                    Set set = wyh.a;
                    String K = playerCareerStatisticsFragment.K();
                    if (K == null) {
                        K = "";
                    }
                    if (wyh.o.contains(K)) {
                        String K2 = playerCareerStatisticsFragment.K();
                        if (Intrinsics.c(K2, Sports.BASKETBALL)) {
                            UniqueTournament uniqueTournament4 = (UniqueTournament) CollectionsKt.firstOrNull(playerCareerStatisticsFragment.M());
                            if (uniqueTournament4 != null) {
                                tournament = new PickerItem.Tournament(null, uniqueTournament4, null);
                                tournament3 = tournament;
                            } else {
                                tournament4 = new PickerItem.Tournament(wk2.g, null, null);
                                tournament3 = tournament4;
                            }
                        } else {
                            if (Intrinsics.c(K2, Sports.FOOTBALL)) {
                                if (playerCareerStatisticsFragment.G() <= 0) {
                                    List M2 = playerCareerStatisticsFragment.M();
                                    if (M2 == null || !M2.isEmpty()) {
                                        Iterator it3 = M2.iterator();
                                        while (it3.hasNext()) {
                                            if (Intrinsics.c(((UniqueTournament) it3.next()).getCompetitionType(), wk2.j.a) && (i2 = i2 + 1) < 0) {
                                                b.p();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i2 > 1) {
                                        tournament4 = new PickerItem.Tournament(wk2.j, null, null);
                                    } else {
                                        Iterator it4 = playerCareerStatisticsFragment.M().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                obj2 = it4.next();
                                                if (Intrinsics.c(((UniqueTournament) obj2).getCompetitionType(), wk2.j.a)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        UniqueTournament uniqueTournament5 = (UniqueTournament) obj2;
                                        if (uniqueTournament5 != null) {
                                            tournament4 = new PickerItem.Tournament(null, uniqueTournament5, null);
                                        } else {
                                            tournament = null;
                                        }
                                    }
                                } else if (playerCareerStatisticsFragment.G() > 1) {
                                    tournament4 = new PickerItem.Tournament(wk2.h, null, null);
                                } else {
                                    Iterator it5 = playerCareerStatisticsFragment.M().iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            obj3 = it5.next();
                                            if (!Intrinsics.c(((UniqueTournament) obj3).getCompetitionType(), wk2.j.a)) {
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    UniqueTournament uniqueTournament6 = (UniqueTournament) obj3;
                                    if (uniqueTournament6 != null) {
                                        tournament4 = new PickerItem.Tournament(null, uniqueTournament6, null);
                                    } else {
                                        tournament3 = null;
                                    }
                                }
                                tournament3 = tournament4;
                            } else {
                                tournament = null;
                                UniqueTournament uniqueTournament7 = (UniqueTournament) CollectionsKt.firstOrNull(playerCareerStatisticsFragment.M());
                                if (uniqueTournament7 != null) {
                                    tournament2 = new PickerItem.Tournament(null, uniqueTournament7, null);
                                    tournament3 = tournament2;
                                }
                            }
                            tournament3 = tournament;
                        }
                    } else {
                        tournament = null;
                        UniqueTournament uniqueTournament8 = (UniqueTournament) CollectionsKt.firstOrNull(playerCareerStatisticsFragment.M());
                        if (uniqueTournament8 != null) {
                            tournament2 = new PickerItem.Tournament(null, uniqueTournament8, null);
                            tournament3 = tournament2;
                        }
                        tournament3 = tournament;
                    }
                    if (tournament3 != null) {
                    }
                }
                return Unit.a;
            case 1:
                PlayerCareerStatistics playerCareerStatistics = (PlayerCareerStatistics) obj;
                playerCareerStatisticsFragment.n();
                if (playerCareerStatistics == null) {
                    playerCareerStatisticsFragment.O(true);
                    return Unit.a;
                }
                playerCareerStatisticsFragment.S(playerCareerStatistics);
                return Unit.a;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                String q = dmi.q("CAREER_STATS_STATISTICS_TYPE_", playerCareerStatisticsFragment.K());
                jpe jpeVar = fzg.c;
                String K3 = playerCareerStatisticsFragment.K();
                jpeVar.getClass();
                return sharedPreferences.getString(q, jpe.a(K3).name());
            case 3:
                int intValue = ((Integer) obj).intValue();
                Context context = playerCareerStatisticsFragment.getContext();
                if (context != null) {
                    return context.getString(intValue);
                }
                return null;
            case 4:
                Season.SubSeasonType subSeasonType = (Season.SubSeasonType) obj;
                subSeasonType.getClass();
                ((eoh) playerCareerStatisticsFragment.K).setValue(subSeasonType);
                playerCareerStatisticsFragment.N = true;
                playerCareerStatisticsFragment.E = false;
                playerCareerStatisticsFragment.u();
                return Unit.a;
            case 5:
                nme nmeVar = (nme) obj;
                nmeVar.getClass();
                vle vleVar = nmeVar.a;
                playerCareerStatisticsFragment.O(vleVar == null);
                if (vleVar != null) {
                    if (!Intrinsics.c(playerCareerStatisticsFragment.B, vleVar)) {
                        playerCareerStatisticsFragment.B = vleVar;
                        kse kseVar = (kse) playerCareerStatisticsFragment.C.getValue();
                        tug tugVar = playerCareerStatisticsFragment.L().o;
                        boolean z = !playerCareerStatisticsFragment.P();
                        kseVar.getClass();
                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = kseVar.e;
                        tugVar.getClass();
                        ArrayList arrayList3 = vleVar.a.b;
                        LinearLayout linearLayout = kseVar.a;
                        LinearLayout linearLayout2 = kseVar.b;
                        tugVar.d(scrollInterceptorHorizontalScrollView);
                        tugVar.a(scrollInterceptorHorizontalScrollView, new mme(kseVar, 0));
                        Iterator it6 = arrayList3.iterator();
                        int i3 = 0;
                        while (it6.hasNext()) {
                            Object next = it6.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                b.q();
                                throw null;
                            }
                            pk2 pk2Var = (pk2) next;
                            if (i3 < linearLayout2.getChildCount()) {
                                View childAt = linearLayout2.getChildAt(i3);
                                if (childAt == null) {
                                    yhk.s("null cannot be cast to non-null type android.widget.TextView");
                                    return null;
                                }
                                textView = (TextView) childAt;
                                textView.setVisibility(0);
                            } else {
                                textView = u22.b(LayoutInflater.from(linearLayout.getContext()), linearLayout2).b;
                                linearLayout2.addView(textView);
                            }
                            r9k r9kVar = pk2Var.a;
                            r9k r9kVar2 = pk2Var.b;
                            textView.setVisibility(0);
                            Context context2 = textView.getContext();
                            context2.getClass();
                            textView.setText(r9kVar.b(context2));
                            textView.setOnClickListener(new eyd(5, textView, r9kVar2));
                            i3 = i4;
                        }
                        z8e.J(linearLayout2, arrayList3.size() - 1);
                        linearLayout.post(new q12(z, tugVar, kseVar, kseVar, 1));
                    }
                    playerCareerStatisticsFragment.L().F(nmeVar.b);
                    if (playerCareerStatisticsFragment.N) {
                        krk krkVar = playerCareerStatisticsFragment.l;
                        krkVar.getClass();
                        ((xq8) krkVar).c.scrollToPosition(0);
                        playerCareerStatisticsFragment.N = false;
                    }
                }
                return Unit.a;
            case 6:
                PickerItem.Tournament tournament5 = (PickerItem.Tournament) obj;
                tournament5.getClass();
                ((eoh) playerCareerStatisticsFragment.J).setValue(tournament5);
                playerCareerStatisticsFragment.R();
                return Unit.a;
            case 7:
                ((View) obj).getClass();
                PlayerCareerStatisticsFragment playerCareerStatisticsFragment2 = this.b;
                playerCareerStatisticsFragment2.L().o.a = new v9b(1, playerCareerStatisticsFragment2, PlayerCareerStatisticsFragment.class, "onHorizontalScrollChanged", "onHorizontalScrollChanged(I)V", 0, 25);
                return Unit.a;
            case 8:
                int intValue2 = ((Integer) obj).intValue();
                Context context3 = playerCareerStatisticsFragment.getContext();
                if (context3 != null) {
                    return context3.getString(intValue2);
                }
                return null;
            default:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putString(dmi.q("CAREER_STATS_STATISTICS_TYPE_", playerCareerStatisticsFragment.K()), playerCareerStatisticsFragment.E().c.name());
                return Unit.a;
        }
    }
}
