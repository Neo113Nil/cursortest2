package defpackage;

import android.app.Application;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.LineupsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class x21 extends ynb {
    public final l2a l;
    public gv9 m;
    public gv9 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x21(@NotNull Application application) {
        super(application, tnb.a);
        application.getClass();
        this.l = new l2a(12);
        rlh rlhVar = rlh.b;
        this.m = rlhVar;
        this.n = rlhVar;
    }

    public static a1j t(Event event) {
        return new a1j(l6g.K(new r1h(TeamSelection.First, new tc3(1087572789, new v21(0, event), true)), new r1h(TeamSelection.Second, new tc3(-2043813322, new v21(1, event), true))));
    }

    public abstract Object u(Event event, rq3 rq3Var);

    public final void v(Event event, LineupsResponse lineupsResponse) {
        event.getClass();
        l2a l2aVar = this.l;
        l2aVar.getClass();
        l2aVar.c = lineupsResponse;
        l2aVar.d = event;
        ArrayList arrayList = (ArrayList) l2aVar.b;
        arrayList.clear();
        List<PlayerData> players = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers();
        List<PlayerData> players2 = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers();
        String s = ok3.s(event);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : players) {
            PlayerData playerData = (PlayerData) obj;
            Boolean substitute = playerData.getSubstitute();
            boolean E = ok3.E(event);
            boolean hasEventStatistics = playerData.hasEventStatistics(s);
            if (Intrinsics.c(substitute, Boolean.FALSE) && (E || hasEventStatistics)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(l2a.u((PlayerData) it.next(), Event.getHomeTeam$default(event, null, 1, null), 1));
        }
        o13.v(arrayList3, arrayList);
        sxb F = p13.F(players2);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = F.iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((k4g) it2).b;
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            PlayerData playerData2 = (PlayerData) previous;
            Boolean substitute2 = playerData2.getSubstitute();
            boolean E2 = ok3.E(event);
            boolean hasEventStatistics2 = playerData2.hasEventStatistics(s);
            if (Intrinsics.c(substitute2, Boolean.FALSE) && (E2 || hasEventStatistics2)) {
                arrayList4.add(previous);
            }
        }
        ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(l2a.u((PlayerData) it3.next(), Event.getAwayTeam$default(event, null, 1, null), 2));
        }
        o13.v(arrayList5, arrayList);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : players) {
            PlayerData playerData3 = (PlayerData) obj2;
            Boolean substitute3 = playerData3.getSubstitute();
            boolean hasEventStatistics3 = playerData3.hasEventStatistics(s);
            if (Intrinsics.c(substitute3, Boolean.TRUE) && hasEventStatistics3) {
                arrayList6.add(obj2);
            }
        }
        ArrayList arrayList7 = new ArrayList(k13.r(arrayList6, 10));
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            arrayList7.add(l2a.u((PlayerData) it4.next(), Event.getHomeTeam$default(event, null, 1, null), 1));
        }
        o13.v(arrayList7, arrayList);
        ArrayList arrayList8 = new ArrayList();
        for (Object obj3 : players2) {
            PlayerData playerData4 = (PlayerData) obj3;
            Boolean substitute4 = playerData4.getSubstitute();
            boolean hasEventStatistics4 = playerData4.hasEventStatistics(s);
            if (Intrinsics.c(substitute4, Boolean.TRUE) && hasEventStatistics4) {
                arrayList8.add(obj3);
            }
        }
        ArrayList arrayList9 = new ArrayList(k13.r(arrayList8, 10));
        Iterator it5 = arrayList8.iterator();
        while (it5.hasNext()) {
            arrayList9.add(l2a.u((PlayerData) it5.next(), Event.getAwayTeam$default(event, null, 1, null), 2));
        }
        o13.v(arrayList9, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(int i, r8b r8bVar, bnf bnfVar) {
        int i2;
        Object obj;
        Object obj2;
        l2a l2aVar = this.l;
        ArrayList arrayList = (ArrayList) l2aVar.b;
        Event event = (Event) l2aVar.d;
        LineupsResponse lineupsResponse = (LineupsResponse) l2aVar.c;
        r9b r9bVar = null;
        mzd mzdVar = null;
        hzd hzdVar = null;
        r9bVar = null;
        r9bVar = null;
        if (event != null && lineupsResponse != null) {
            Lineups homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null);
            Lineups awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null);
            ArrayList w0 = CollectionsKt.w0(awayLineups$default.getPlayers(), homeLineups$default.getPlayers());
            List<PlayerData> players = homeLineups$default.getPlayers();
            if (players == null || !players.isEmpty()) {
                Iterator<T> it = players.iterator();
                while (it.hasNext()) {
                    if (((PlayerData) it.next()).getPlayer().getId() == i) {
                        i2 = 1;
                        break;
                    }
                }
            }
            i2 = 2;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((xoe) obj).a.getId() == i) {
                        break;
                    }
                }
            }
            xoe xoeVar = (xoe) obj;
            Player player = xoeVar != null ? xoeVar.a : null;
            if (!Intrinsics.c(player != null ? Boolean.valueOf(player.getDisabled()) : null, Boolean.TRUE)) {
                List<MissingPlayerData> missingPlayers = homeLineups$default.getMissingPlayers();
                if (missingPlayers == null) {
                    missingPlayers = km5.a;
                }
                List<MissingPlayerData> missingPlayers2 = awayLineups$default.getMissingPlayers();
                if (missingPlayers2 == null) {
                    missingPlayers2 = km5.a;
                }
                ArrayList w02 = CollectionsKt.w0(missingPlayers2, missingPlayers);
                ArrayList arrayList2 = new ArrayList(k13.r(w02, 10));
                Iterator it3 = w02.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Integer.valueOf(((MissingPlayerData) it3.next()).getPlayer().getId()));
                }
                if (arrayList2.contains(Integer.valueOf(i))) {
                    ArrayList arrayList3 = new ArrayList(k13.r(w0, 10));
                    Iterator it4 = w0.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(Integer.valueOf(((PlayerData) it4.next()).getPlayer().getId()));
                    }
                    if (!arrayList3.contains(Integer.valueOf(i))) {
                        r9bVar = new r9b(null, i, 0);
                    }
                }
                Object[] objArr = player != null;
                ArrayList arrayList4 = new ArrayList();
                if (objArr == true) {
                    arrayList4.addAll(arrayList);
                } else {
                    Iterator it5 = w0.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it5.next();
                            if (((PlayerData) obj2).getPlayer().getId() == i) {
                                break;
                            }
                        }
                    }
                    PlayerData playerData = (PlayerData) obj2;
                    if (playerData != null) {
                        arrayList4.add(new xoe(playerData.getPlayer(), null, null, null, i2 == 1 ? Event.getHomeTeam$default(event, null, 1, null) : Event.getAwayTeam$default(event, null, 1, null), i2, null));
                    }
                }
                boolean E = ok3.E(event);
                Boolean hasEventPlayerStatistics = event.getHasEventPlayerStatistics();
                Boolean bool = Boolean.TRUE;
                if (Boolean.valueOf((Intrinsics.c(hasEventPlayerStatistics, bool) || E) && !arrayList.isEmpty()).equals(bool)) {
                    bnf bnfVar2 = Boolean.valueOf(r8bVar == r8b.b).equals(bool) ? bnfVar : null;
                    int i3 = bnfVar2 == null ? -1 : s9b.a[bnfVar2.ordinal()];
                    if (i3 == 1) {
                        mzdVar = mzd.Shooting;
                    } else if (i3 == 2) {
                        mzdVar = mzd.Passing;
                    } else if (i3 == 3) {
                        mzdVar = mzd.Dribbling;
                    } else if (i3 == 4) {
                        mzdVar = mzd.Defending;
                    } else if (i3 == 5) {
                        mzdVar = mzd.Goalkeeping;
                    }
                    hzdVar = f8h.j(event, arrayList4, i, E, mzdVar, null, 32);
                }
                r9bVar = new r9b(hzdVar, i, yid.m(o3a.F(event.getTournament())));
            }
        }
        if (r9bVar != null) {
            k(new r16(r9bVar));
        }
    }

    public abstract void x(boolean z);
}
