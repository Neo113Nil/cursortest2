package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mwi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamEventsFragment b;
    public final /* synthetic */ u6e c;

    public /* synthetic */ mwi(TeamEventsFragment teamEventsFragment, u6e u6eVar, int i) {
        this.a = i;
        this.b = teamEventsFragment;
        this.c = u6eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.a;
        rq3 rq3Var = null;
        u6e u6eVar = this.c;
        TeamEventsFragment teamEventsFragment = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                joa joaVar = teamEventsFragment.t;
                List list = (List) obj;
                list.getClass();
                boolean isEmpty = teamEventsFragment.D().i.isEmpty();
                if (teamEventsFragment.u) {
                    teamEventsFragment.u = false;
                    teamEventsFragment.D().F(list);
                    if (!list.isEmpty()) {
                        teamEventsFragment.F(list);
                    }
                } else {
                    teamEventsFragment.D().X(list);
                }
                if (isEmpty) {
                    u6eVar.e = true;
                    u6eVar.f = true;
                }
                if (teamEventsFragment.D().i.isEmpty()) {
                    r1.p(teamEventsFragment.D().g.size(), (GraphicLarge) joaVar.getValue());
                } else {
                    teamEventsFragment.D().C((GraphicLarge) joaVar.getValue());
                }
                krk krkVar = teamEventsFragment.l;
                krkVar.getClass();
                teamEventsFragment.t(((dq8) krkVar).h, new g2i(teamEventsFragment, 19));
                break;
            case 1:
                uwi uwiVar = (uwi) obj;
                List<yyi> list2 = uwiVar.a;
                List list3 = uwiVar.b;
                u6e u6eVar2 = this.c;
                y34 y34Var = new y34(0, u6eVar2, u6e.class, "reset", "reset(ZZ)V", 0, 3);
                krk krkVar2 = teamEventsFragment.l;
                krkVar2.getClass();
                g5k g5kVar = new g5k(((dq8) krkVar2).j);
                ArrayList arrayList = new ArrayList(k13.r(list2, 10));
                for (yyi yyiVar : list2) {
                    String str = yyiVar.a;
                    String string = teamEventsFragment.getString(yyiVar.b);
                    string.getClass();
                    arrayList.add(new vt2(str, string, false, null, null, null, null, 252));
                }
                g5kVar.b = arrayList;
                g5kVar.m = new wt(6, y34Var, teamEventsFragment);
                e2f e2fVar = yyi.c;
                g5kVar.c = Season.YEAR_ALL_TIME;
                g5kVar.b();
                Integer num = teamEventsFragment.x;
                if (num != null) {
                    int intValue = num.intValue();
                    if (list3 != null) {
                        Iterator it = list3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((UniqueTournament) obj2).getId() == intValue) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        UniqueTournament uniqueTournament = (UniqueTournament) obj2;
                        if (uniqueTournament != null) {
                            teamEventsFragment.u = true;
                            u6eVar2.e = true;
                            u6eVar2.f = true;
                            u6eVar2.g = 1;
                            u6eVar2.h = 1;
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
                            ((eoh) E.q).setValue(uniqueTournament);
                            E.l();
                            teamEventsFragment.x = null;
                        }
                    }
                }
                if (list3 != null) {
                    if (list3.size() <= 1) {
                        list3 = null;
                    }
                    if (list3 != null) {
                        boolean z = teamEventsFragment.E().h;
                        w1i w1iVar = new w1i(u6eVar2, 9);
                        krk krkVar3 = teamEventsFragment.l;
                        krkVar3.getClass();
                        ((dq8) krkVar3).e.setVisibility(0);
                        if (z) {
                            krk krkVar4 = teamEventsFragment.l;
                            krkVar4.getClass();
                            ((dq8) krkVar4).e.setBackground(null);
                        }
                        krk krkVar5 = teamEventsFragment.l;
                        krkVar5.getClass();
                        ((dq8) krkVar5).f.setContent(new tc3(1255633477, new p81(z, teamEventsFragment, w1iVar, list3), true));
                    }
                }
                break;
            default:
                kda.p(wca.x(teamEventsFragment.getLifecycle()), new qwi(teamEventsFragment, (List) obj, rq3Var, i2), new mwi(teamEventsFragment, u6eVar, i2));
                break;
        }
        return Unit.a;
    }
}
