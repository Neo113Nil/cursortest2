package defpackage;

import android.content.Context;
import com.ironsource.W3;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class eme implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerCareerStatisticsFragment b;

    public /* synthetic */ eme(PlayerCareerStatisticsFragment playerCareerStatisticsFragment, int i) {
        this.a = i;
        this.b = playerCareerStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        String x;
        String str3;
        String string;
        int i = this.a;
        int i2 = 6;
        str = "";
        a99 a99Var = nf3.a;
        Object obj3 = null;
        Object obj4 = null;
        int i3 = 1;
        PlayerCareerStatisticsFragment playerCareerStatisticsFragment = this.b;
        switch (i) {
            case 0:
                String str4 = (String) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                str4.getClass();
                playerCareerStatisticsFragment.N().j.put(str4, bool);
                String K = playerCareerStatisticsFragment.K();
                if (K != null) {
                    ome N = playerCareerStatisticsFragment.N();
                    TypeHeaderView D = playerCareerStatisticsFragment.D();
                    String selectedItem = D != null ? D.getSelectedItem() : null;
                    CareerStatsFilterModal.CareerStatsFilterData E = playerCareerStatisticsFragment.E();
                    PickerItem.Tournament H = playerCareerStatisticsFragment.H();
                    Player player = playerCareerStatisticsFragment.C().l;
                    String position = player != null ? player.getPosition() : null;
                    cme cmeVar = new cme(playerCareerStatisticsFragment, 8);
                    Player player2 = playerCareerStatisticsFragment.C().l;
                    N.m(selectedItem, E, K, H, position, cmeVar, player2 != null ? player2.getGender() : null);
                }
                break;
            case 1:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    List<Season.SubSeasonType> list = (List) ((eoh) playerCareerStatisticsFragment.I).getValue();
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    for (Season.SubSeasonType subSeasonType : list) {
                        Set set = f5k.a;
                        Context requireContext = playerCareerStatisticsFragment.requireContext();
                        requireContext.getClass();
                        arrayList.add(new oxh(subSeasonType, f5k.b(requireContext, subSeasonType.getLabel(), playerCareerStatisticsFragment.K()), null, null, null, false, 252));
                    }
                    gv9 W = l6g.W(arrayList);
                    Iterator<E> it = W.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((oxh) next).a == ((Season.SubSeasonType) ((eoh) playerCareerStatisticsFragment.K).getValue())) {
                                obj4 = next;
                            }
                        }
                    }
                    oxh oxhVar = (oxh) obj4;
                    boolean i4 = av8Var.i(playerCareerStatisticsFragment);
                    Object O = av8Var.O();
                    if (i4 || O == a99Var) {
                        O = new cme(playerCareerStatisticsFragment, 4);
                        av8Var.n0(O);
                    }
                    r4a.j(W, oxhVar, (Function1) O, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, W3.l);
                } else {
                    av8Var.W();
                }
                break;
            case 2:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    PickerItem.Tournament H2 = playerCareerStatisticsFragment.H();
                    PickerItem.Tournament H3 = playerCareerStatisticsFragment.H();
                    if (H3 != null) {
                        Context requireContext2 = playerCareerStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        UniqueTournament uniqueTournament = H3.b;
                        if (uniqueTournament == null || (x = tba.x(uniqueTournament)) == null) {
                            wk2 wk2Var = H3.a;
                            String string2 = wk2Var != null ? requireContext2.getString(wk2Var.c) : null;
                            if (string2 != null) {
                                str = string2;
                            }
                        } else {
                            str = x;
                        }
                        str2 = str;
                    } else {
                        str2 = null;
                    }
                    oxh oxhVar2 = new oxh(H2, str2, yqo.H(-1394243901, av8Var2, new fme(playerCareerStatisticsFragment, i3)), null, null, false, 248);
                    boolean i5 = av8Var2.i(playerCareerStatisticsFragment);
                    Object O2 = av8Var2.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new dme(playerCareerStatisticsFragment, i2);
                        av8Var2.n0(O2);
                    }
                    r4a.k(oxhVar2, (Function0) O2, null, null, playerCareerStatisticsFragment.M().size() > 1, null, av8Var2, 0, 44);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(1 & intValue3, (intValue3 & 3) != 2)) {
                    av8Var3.d0(1464307045);
                    xbb b = a.b();
                    Set set2 = wyh.a;
                    String K2 = playerCareerStatisticsFragment.K();
                    if (wyh.o.contains(K2 != null ? K2 : "")) {
                        b.add(new PickerItem.Tournament(wk2.g, null, null));
                    }
                    List<UniqueTournament> M = playerCareerStatisticsFragment.M();
                    ArrayList arrayList2 = new ArrayList(k13.r(M, 10));
                    for (UniqueTournament uniqueTournament2 : M) {
                        uniqueTournament2.getClass();
                        arrayList2.add(new PickerItem.Tournament(null, uniqueTournament2, null));
                    }
                    b.addAll(arrayList2);
                    xbb a = a.a(b);
                    ArrayList arrayList3 = new ArrayList(k13.r(a, 10));
                    ListIterator listIterator = a.listIterator(0);
                    while (true) {
                        hc9 hc9Var = (hc9) listIterator;
                        if (hc9Var.hasNext()) {
                            PickerItem.Tournament tournament = (PickerItem.Tournament) hc9Var.next();
                            UniqueTournament uniqueTournament3 = tournament.b;
                            if (uniqueTournament3 != null) {
                                string = tba.x(uniqueTournament3);
                            } else {
                                wk2 wk2Var2 = tournament.a;
                                if (wk2Var2 != null) {
                                    string = playerCareerStatisticsFragment.requireContext().getString(wk2Var2.c);
                                } else {
                                    str3 = null;
                                    arrayList3.add(new oxh(tournament, str3, yqo.H(-789389018, av8Var3, new bba(tournament, 23)), null, null, false, 248));
                                }
                            }
                            str3 = string;
                            arrayList3.add(new oxh(tournament, str3, yqo.H(-789389018, av8Var3, new bba(tournament, 23)), null, null, false, 248));
                        } else {
                            av8Var3.s(false);
                            gv9 W2 = l6g.W(arrayList3);
                            Iterator<E> it2 = W2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (Intrinsics.c(((oxh) next2).a, playerCareerStatisticsFragment.H())) {
                                        obj3 = next2;
                                    }
                                }
                            }
                            oxh oxhVar3 = (oxh) obj3;
                            boolean i6 = av8Var3.i(playerCareerStatisticsFragment);
                            Object O3 = av8Var3.O();
                            if (i6 || O3 == a99Var) {
                                O3 = new cme(playerCareerStatisticsFragment, i2);
                                av8Var3.n0(O3);
                            }
                            r4a.j(W2, oxhVar3, (Function1) O3, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 0, W3.l);
                        }
                    }
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
