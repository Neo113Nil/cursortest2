package defpackage;

import com.sofascore.model.fantasy.FantasyFixtureFDRView;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lr3 extends hoi implements et8 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public /* synthetic */ Object t;
    public /* synthetic */ Object u;
    public final /* synthetic */ q8 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr3(q8 q8Var, rq3 rq3Var, int i) {
        super(4, rq3Var);
        this.r = i;
        this.v = q8Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.r;
        q8 q8Var = this.v;
        switch (i) {
            case 0:
                lr3 lr3Var = new lr3((tr3) q8Var, (rq3) obj4, 0);
                lr3Var.s = (h38) obj;
                lr3Var.t = (g0a) obj2;
                lr3Var.u = (fci) obj3;
                return lr3Var.invokeSuspend(Unit.a);
            case 1:
                lr3 lr3Var2 = new lr3((gk7) q8Var, (rq3) obj4, 1);
                lr3Var2.s = (Map) obj;
                lr3Var2.t = (List) obj2;
                lr3Var2.u = (List) obj3;
                return lr3Var2.invokeSuspend(Unit.a);
            default:
                lr3 lr3Var3 = new lr3((bxg) q8Var, (rq3) obj4, 2);
                lr3Var3.s = (String) obj;
                lr3Var3.t = (hwg) obj2;
                lr3Var3.u = (List) obj3;
                return lr3Var3.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f6, code lost:
    
        if (r7 == null) goto L24;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        gv9 gv9Var;
        Object value;
        FantasyRoundPlayerUiModel b;
        boolean contains;
        gv9 gv9Var2;
        int i = this.r;
        q8 q8Var = this.v;
        switch (i) {
            case 0:
                h38 h38Var = (h38) this.s;
                g0a g0aVar = (g0a) this.t;
                fci fciVar = (fci) this.u;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (g0aVar == null || (gv9Var = g0aVar.a()) == null) {
                    gv9Var = rlh.b;
                }
                return new i64(fciVar, h38Var, gv9Var, ((tr3) q8Var).l);
            case 1:
                Map map = (Map) this.s;
                List list = (List) this.t;
                List list2 = (List) this.u;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                gk7 gk7Var = (gk7) q8Var;
                fdi fdiVar = gk7Var.z;
                do {
                    value = fdiVar.getValue();
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = gk7Var.u;
                    b = FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel, null, 0, false, false, false, null, list2 != null ? l6g.W(list2) : null, 469762047);
                    contains = list.contains(new Integer(fantasyRoundPlayerUiModel.a));
                    List<List> list3 = (List) me4.f(fantasyRoundPlayerUiModel.h, map);
                    if (list3 != null) {
                        ArrayList arrayList = new ArrayList(k13.r(list3, 10));
                        for (List<FantasyFixtureFDRView> list4 : list3) {
                            ArrayList arrayList2 = new ArrayList(k13.r(list4, 10));
                            for (FantasyFixtureFDRView fantasyFixtureFDRView : list4) {
                                int eventId = fantasyFixtureFDRView.getEventId();
                                int opponentTeamId = fantasyFixtureFDRView.getOpponentTeamId();
                                hjg hjgVar = o68.b;
                                String fixtureDifficulty = fantasyFixtureFDRView.getFixtureDifficulty();
                                hjgVar.getClass();
                                o68 q = hjg.q(fixtureDifficulty);
                                kpg kpgVar = p68.b;
                                String locationType = fantasyFixtureFDRView.getLocationType();
                                kpgVar.getClass();
                                arrayList2.add(new ux6(eventId, opponentTeamId, q, kpg.s(locationType), null));
                            }
                            arrayList.add(new tx6(l6g.W(arrayList2)));
                        }
                        gv9Var2 = l6g.W(arrayList);
                        break;
                    }
                    gv9Var2 = rlh.b;
                } while (!fdiVar.k(value, new q67(b, gv9Var2, contains)));
                return Unit.a;
            default:
                String str = (String) this.s;
                hwg hwgVar = (hwg) this.t;
                List list5 = (List) this.u;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                return new g5e(new k9(50, 58), new m61((bxg) q8Var, list5, str, hwgVar, 19));
        }
    }
}
