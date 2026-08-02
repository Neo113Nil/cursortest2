package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yn6 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ yn6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                mp6 mp6Var = (mp6) obj;
                mp6Var.getClass();
                return ljg.j(mp6Var.a, "competition_upcoming_");
            case 1:
                ((mp6) obj).getClass();
                return "competition_card";
            case 2:
                ((kpa) obj).getClass();
                return new o39(waa.b(kpa.c));
            case 3:
                ((kpa) obj).getClass();
                return new o39(waa.b(kpa.c));
            case 4:
                mp6 mp6Var2 = (mp6) obj;
                mp6Var2.getClass();
                return ljg.j(mp6Var2.a, "competition_active_");
            case 5:
                ((mp6) obj).getClass();
                return "competition_card";
            case 6:
                ((kpa) obj).getClass();
                return new o39(waa.b(kpa.c));
            case 7:
                mp6 mp6Var3 = (mp6) obj;
                mp6Var3.getClass();
                return Integer.valueOf(mp6Var3.a);
            case 8:
                qpb qpbVar = (qpb) obj;
                qpbVar.getClass();
                return qpbVar.getClass().getName();
            case 9:
                return ((s37) obj).a;
            case 10:
                ((r60) obj).getClass();
                cp4 cp4Var = jg5.d;
                return l98.l0(uo5.e(s02.h0(150, 0, cp4Var, 2), 2), uo5.f(s02.h0(150, 0, cp4Var, 2), 2));
            case 11:
                ev6 ev6Var = (ev6) obj;
                ev6Var.getClass();
                return Integer.valueOf(ev6Var.w ? R.string.overview : R.string.home_tab_name);
            case 12:
                ((ev6) obj).getClass();
                return Integer.valueOf(R.string.fixtures);
            case 13:
                ev6 ev6Var2 = (ev6) obj;
                ev6Var2.getClass();
                return Boolean.valueOf(ev6Var2.d == FantasyCompetitionType.SEASON);
            case 14:
                ((ev6) obj).getClass();
                return Integer.valueOf(R.string.drawer_leagues);
            case 15:
                ((ev6) obj).getClass();
                return Boolean.TRUE;
            case 16:
                ev6 ev6Var3 = (ev6) obj;
                ev6Var3.getClass();
                return Boolean.valueOf(ev6Var3.d == FantasyCompetitionType.SEASON);
            case 17:
                ((ev6) obj).getClass();
                return Integer.valueOf(R.string.statistics);
            case 18:
                ev6 ev6Var4 = (ev6) obj;
                ev6Var4.getClass();
                return Boolean.valueOf(ev6Var4.d == FantasyCompetitionType.SEASON);
            case 19:
                ((ev6) obj).getClass();
                return Integer.valueOf(R.string.my_team);
            case 20:
                ((ev6) obj).getClass();
                return Boolean.valueOf(!r4.w);
            case 21:
                ((ev6) obj).getClass();
                return Integer.valueOf(R.string.leaderboard);
            case 22:
                ev6 ev6Var5 = (ev6) obj;
                ev6Var5.getClass();
                return Boolean.valueOf(ev6Var5.d == FantasyCompetitionType.WEEKLY);
            case 23:
                ((ev6) obj).getClass();
                return Integer.valueOf(R.string.chat);
            case 24:
                ev6 ev6Var6 = (ev6) obj;
                ev6Var6.getClass();
                return Boolean.valueOf(ev6Var6.d == FantasyCompetitionType.WEEKLY && ev6Var6.B != null);
            case 25:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("SELECT id FROM fantasy_competition_table");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 26:
                fo7 fo7Var = (fo7) obj;
                fo7Var.getClass();
                return fo7Var.a;
            case 27:
                fo7 fo7Var2 = (fo7) obj;
                fo7Var2.getClass();
                return fo7Var2.a;
            case 28:
                fo7 fo7Var3 = (fo7) obj;
                fo7Var3.getClass();
                return fo7Var3.a;
            default:
                return ((fo7) obj).a;
        }
    }
}
