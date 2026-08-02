package defpackage;

import com.ironsource.W3;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.player.statistics.regular.PlayerSeasonStatisticsFragment;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class dwe implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerSeasonStatisticsFragment b;

    public /* synthetic */ dwe(PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment, int i) {
        this.a = i;
        this.b = playerSeasonStatisticsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i = this.a;
        a99 a99Var = nf3.a;
        oxh oxhVar = null;
        int i2 = 1;
        PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    av8Var.d0(-88120726);
                    List<UniqueTournament> list = (List) ((eoh) playerSeasonStatisticsFragment.K).getValue();
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    for (UniqueTournament uniqueTournament : list) {
                        arrayList.add(new oxh(uniqueTournament, tba.x(uniqueTournament), yqo.H(-1403082916, av8Var, new fwe(uniqueTournament, 0)), null, null, false, 248));
                    }
                    av8Var.s(false);
                    gv9 W = l6g.W(arrayList);
                    Iterator<E> it = W.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj3 = it.next();
                            if (Intrinsics.c(((oxh) obj3).a, (UniqueTournament) ((eoh) playerSeasonStatisticsFragment.M).getValue())) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    oxh oxhVar2 = (oxh) obj3;
                    if (oxhVar2 == null) {
                        av8Var.d0(1563818720);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1563818721);
                        oxhVar = oxh.a(oxhVar2, null, null, yqo.H(-828678805, av8Var, new ewe(playerSeasonStatisticsFragment, i2)), 247);
                        av8Var.s(false);
                    }
                    oxh oxhVar3 = oxhVar;
                    boolean i3 = av8Var.i(playerSeasonStatisticsFragment);
                    Object O = av8Var.O();
                    if (i3 || O == a99Var) {
                        O = new bwe(playerSeasonStatisticsFragment, 4);
                        av8Var.n0(O);
                    }
                    r4a.j(W, oxhVar3, (Function1) O, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, W3.l);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    List<Season> list2 = (List) ((eoh) playerSeasonStatisticsFragment.L).getValue();
                    ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                    for (Season season : list2) {
                        arrayList2.add(new oxh(season, season.getYear(), null, null, null, false, 252));
                    }
                    gv9 W2 = l6g.W(arrayList2);
                    Iterator<E> it2 = W2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (Intrinsics.c(((oxh) next).a, playerSeasonStatisticsFragment.F())) {
                                oxhVar = next;
                            }
                        }
                    }
                    oxh oxhVar4 = oxhVar;
                    boolean i4 = av8Var2.i(playerSeasonStatisticsFragment);
                    Object O2 = av8Var2.O();
                    if (i4 || O2 == a99Var) {
                        O2 = new bwe(playerSeasonStatisticsFragment, 6);
                        av8Var2.n0(O2);
                    }
                    r4a.j(W2, oxhVar4, (Function1) O2, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, W3.l);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                String str = (String) obj;
                ((Integer) obj2).getClass();
                str.getClass();
                playerSeasonStatisticsFragment.Q = str;
                playerSeasonStatisticsFragment.u();
                ((ple) playerSeasonStatisticsFragment.s.getValue()).o = playerSeasonStatisticsFragment.Q;
                break;
        }
        return Unit.a;
    }
}
