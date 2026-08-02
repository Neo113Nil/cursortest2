package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.team.standings.TeamStandingsFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class i2j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamStandingsFragment b;

    public /* synthetic */ i2j(TeamStandingsFragment teamStandingsFragment, int i) {
        this.a = i;
        this.b = teamStandingsFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r8 == null) goto L13;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        Set keySet;
        List list;
        Object obj3;
        Set keySet2;
        int i = this.a;
        TeamStandingsFragment teamStandingsFragment = this.b;
        switch (i) {
            case 0:
                e1d e1dVar = teamStandingsFragment.y;
                UniqueTournament uniqueTournament = (UniqueTournament) obj;
                uniqueTournament.getClass();
                ((eoh) teamStandingsFragment.z).setValue(uniqueTournament);
                Map map = (Map) teamStandingsFragment.w.get(uniqueTournament);
                if (map == null || (keySet = map.keySet()) == null || (obj2 = CollectionsKt.S0(keySet)) == null) {
                    obj2 = km5.a;
                }
                ((eoh) e1dVar).setValue(obj2);
                ((eoh) teamStandingsFragment.A).setValue((Season) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue()));
                teamStandingsFragment.E().j = new q9i(rv8.b);
                teamStandingsFragment.F();
                break;
            case 1:
                Season season = (Season) obj;
                season.getClass();
                ((eoh) teamStandingsFragment.A).setValue(season);
                teamStandingsFragment.E().j = new q9i(rv8.b);
                teamStandingsFragment.F();
                break;
            case 2:
                r9i r9iVar = (r9i) obj;
                r9iVar.getClass();
                teamStandingsFragment.E().j = r9iVar;
                if (r9iVar instanceof q9i) {
                    teamStandingsFragment.u();
                } else {
                    teamStandingsFragment.E().n();
                }
                break;
            case 3:
                List list2 = (List) obj;
                teamStandingsFragment.n();
                if (list2 == null) {
                    teamStandingsFragment.E().j = new q9i(rv8.b);
                    teamStandingsFragment.C().s();
                    teamStandingsFragment.u();
                } else {
                    teamStandingsFragment.C().F(list2);
                }
                break;
            default:
                e1d e1dVar2 = teamStandingsFragment.y;
                e1d e1dVar3 = teamStandingsFragment.z;
                e1d e1dVar4 = teamStandingsFragment.x;
                Map map2 = (Map) obj;
                teamStandingsFragment.n();
                map2.getClass();
                teamStandingsFragment.w = map2;
                Set keySet3 = map2.keySet();
                Object obj4 = null;
                if (keySet3 != null && (list = CollectionsKt.S0(keySet3)) != null) {
                    if (list.isEmpty()) {
                        list = null;
                        break;
                    }
                }
                list = km5.a;
                ((eoh) e1dVar4).setValue(list);
                Iterator it = ((List) ((eoh) e1dVar4).getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((UniqueTournament) next).getId() == ((Number) teamStandingsFragment.u.getValue()).intValue()) {
                            obj4 = next;
                        }
                    }
                }
                UniqueTournament uniqueTournament2 = (UniqueTournament) obj4;
                if (uniqueTournament2 == null) {
                    uniqueTournament2 = (UniqueTournament) CollectionsKt.firstOrNull((List) ((eoh) e1dVar4).getValue());
                }
                ((eoh) e1dVar3).setValue(uniqueTournament2);
                Map map3 = (Map) teamStandingsFragment.w.get((UniqueTournament) ((eoh) e1dVar3).getValue());
                if (map3 == null || (keySet2 = map3.keySet()) == null || (obj3 = CollectionsKt.S0(keySet2)) == null) {
                    obj3 = km5.a;
                }
                ((eoh) e1dVar2).setValue(obj3);
                ((eoh) teamStandingsFragment.A).setValue((Season) CollectionsKt.firstOrNull((List) ((eoh) e1dVar2).getValue()));
                teamStandingsFragment.F();
                break;
        }
        return Unit.a;
    }
}
