package defpackage;

import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.PlayerItem;
import com.sofascore.model.newNetwork.TeamPlayersResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o56 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ fp4 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o56(fp4 fp4Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = fp4Var;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        fp4 fp4Var = this.t;
        switch (i) {
            case 0:
                return new o56(fp4Var, i2, rq3Var, 0);
            case 1:
                return new o56(fp4Var, i2, rq3Var, 1);
            default:
                return new o56(fp4Var, i2, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((o56) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Lineups awayLineups$default;
        List<PlayerData> players;
        Lineups homeLineups$default;
        List<PlayerData> players2;
        List<PlayerItem> players3;
        int i = this.r;
        int i2 = this.u;
        fp4 fp4Var = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    s96 s96Var = (s96) fp4Var.b;
                    this.s = 1;
                    obj = s96Var.o(i2, null, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                LineupsResponse lineupsResponse = (LineupsResponse) obj;
                if (lineupsResponse == null || (awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)) == null || (players = awayLineups$default.getPlayers()) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(k13.r(players, 10));
                Iterator<T> it = players.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PlayerData) it.next()).getPlayer());
                }
                return arrayList;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    s96 s96Var2 = (s96) fp4Var.b;
                    this.s = 1;
                    obj = s96Var2.o(i2, null, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                LineupsResponse lineupsResponse2 = (LineupsResponse) obj;
                if (lineupsResponse2 == null || (homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse2, null, 1, null)) == null || (players2 = homeLineups$default.getPlayers()) == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(k13.r(players2, 10));
                Iterator<T> it2 = players2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((PlayerData) it2.next()).getPlayer());
                }
                return arrayList2;
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = (j0j) fp4Var.c;
                    this.s = 1;
                    j0jVar.getClass();
                    obj = yaa.P(new azi(j0jVar, i2, rq3Var, 13), this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                TeamPlayersResponse teamPlayersResponse = (TeamPlayersResponse) yaa.x((x2g) obj);
                if (teamPlayersResponse == null || (players3 = teamPlayersResponse.getPlayers()) == null) {
                    return km5.a;
                }
                ArrayList arrayList3 = new ArrayList(k13.r(players3, 10));
                Iterator<T> it3 = players3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((PlayerItem) it3.next()).getPlayer());
                }
                return arrayList3;
        }
    }
}
