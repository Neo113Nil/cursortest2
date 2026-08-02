package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.ironsource.W3;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.BaseHockeyShotmapItem;
import com.sofascore.model.newNetwork.HockeyEventShotmapItem;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.hockey.HockeyEventMapView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class be9 extends t2 {
    public final Event j;
    public final z82 k;
    public Map l;
    public List m;
    public final e1d n;
    public final e1d o;
    public final e1d p;
    public final e1d q;
    public final Player r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be9(Context context, Event event, ob6 ob6Var, qb6 qb6Var, pb6 pb6Var) {
        super(context);
        context.getClass();
        qb6Var.getClass();
        pb6Var.getClass();
        this.j = event;
        int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.hockey_event_shotmap_collapsable, (ViewGroup) getBinding().a, false);
        int i2 = R.id.arrow;
        ImageView imageView = (ImageView) nq8.B(R.id.arrow, inflate);
        if (imageView != null) {
            i2 = R.id.empty_state;
            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_state, inflate);
            if (graphicLarge != null) {
                i2 = R.id.shotmap;
                HockeyEventMapView hockeyEventMapView = (HockeyEventMapView) nq8.B(R.id.shotmap, inflate);
                if (hockeyEventMapView != null) {
                    i2 = R.id.shotmap_group;
                    Group group = (Group) nq8.B(R.id.shotmap_group, inflate);
                    if (group != null) {
                        i2 = R.id.spinner_players;
                        ComposeView composeView = (ComposeView) nq8.B(R.id.spinner_players, inflate);
                        if (composeView != null) {
                            i2 = R.id.spinner_shot_type;
                            ComposeView composeView2 = (ComposeView) nq8.B(R.id.spinner_shot_type, inflate);
                            if (composeView2 != null) {
                                i2 = R.id.team_selector;
                                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.team_selector, inflate);
                                if (segmentedButtonsView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    this.k = new z82(constraintLayout, imageView, graphicLarge, hockeyEventMapView, group, composeView, composeView2, segmentedButtonsView);
                                    lm5 lm5Var = lm5.a;
                                    lm5Var.getClass();
                                    this.l = lm5Var;
                                    km5 km5Var = km5.a;
                                    this.m = km5Var;
                                    this.n = e.f(km5Var);
                                    this.o = e.f(km5Var);
                                    this.p = e.f(null);
                                    this.q = e.f(he9.g);
                                    setVisibility(8);
                                    if (hkg.c0(context)) {
                                        imageView.setScaleX(-1.0f);
                                    }
                                    Boolean bool = Boolean.FALSE;
                                    Pair pair = new Pair(bool, bool);
                                    yd9 yd9Var = new yd9(context, this);
                                    t1h[] t1hVarArr = {new r1h("First", new tc3(267690253, new ae9(this, i), true)), new r1h("Second", new tc3(-406376532, new ae9(this, 1), true))};
                                    rlh rlhVar = rlh.b;
                                    rlhVar.getClass();
                                    hfe d = rlhVar.d();
                                    o13.w(d, t1hVarArr);
                                    b7 d2 = d.d();
                                    segmentedButtonsView.k = yd9Var;
                                    segmentedButtonsView.g = false;
                                    segmentedButtonsView.h = pair;
                                    segmentedButtonsView.j = v1h.f;
                                    segmentedButtonsView.i = new z1h(0);
                                    d2 = d2 == null ? rlh.b : d2;
                                    int i3 = 6;
                                    if (!d2.isEmpty()) {
                                        SegmentedButtonsView.t(segmentedButtonsView, d2, null, 6);
                                    }
                                    composeView.setContent(new tc3(287652303, new yd9(this, context, 1), true));
                                    composeView2.setContent(new tc3(-1886308040, new yd9(this, context, 2), true));
                                    setBottomDividerVisibility(false);
                                    Integer valueOf = Integer.valueOf(R.drawable.hockey_shotmap_icon);
                                    constraintLayout.getClass();
                                    t2.j(this, R.string.hockey_game_shotmap, valueOf, 0, constraintLayout, false, "HOCKEY_EVENT_SHOTMAP", new uf8(i3, pb6Var, ob6Var), new uj8(4, qb6Var), 42);
                                    setTopDividerVisibility(false);
                                    o8.d(this, 0, 7);
                                    this.r = new Player(-1, "", (String) null, 0L, (Team) null);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final List<BaseHockeyShotmapItem> getFilteredShots() {
        Player selectedPlayer;
        he9 selectedShotType;
        List list = this.m;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            HockeyEventShotmapItem hockeyEventShotmapItem = (HockeyEventShotmapItem) obj;
            Player selectedPlayer2 = getSelectedPlayer();
            boolean z = true;
            boolean z2 = (selectedPlayer2 != null && selectedPlayer2.getId() == -1) || ((selectedPlayer = getSelectedPlayer()) != null && hockeyEventShotmapItem.getPlayer().getId() == selectedPlayer.getId());
            if (getSelectedShotType() != he9.g && ((selectedShotType = getSelectedShotType()) == null || hockeyEventShotmapItem.getType() != selectedShotType.a)) {
                z = false;
            }
            if (z2 && z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<Player> getPlayersList() {
        return (List) ((eoh) this.n).getValue();
    }

    private final Player getSelectedPlayer() {
        return (Player) ((eoh) this.p).getValue();
    }

    private final he9 getSelectedShotType() {
        return (he9) ((eoh) this.q).getValue();
    }

    private final TeamSelection getSelectedTeam() {
        String selectedItem = ((SegmentedButtonsView) this.k.g).getSelectedItem();
        if (selectedItem == null) {
            selectedItem = "First";
        }
        return TeamSelection.valueOf(selectedItem);
    }

    private final List<he9> getShotTypeList() {
        return (List) ((eoh) this.o).getValue();
    }

    public static final Unit n(Context context, be9 be9Var, String str) {
        str.getClass();
        ((ImageView) be9Var.k.e).setScaleX((hkg.c0(context) ^ str.equals("First") ? TeamSelection.First : TeamSelection.Second) == TeamSelection.First ? 1.0f : -1.0f);
        be9Var.setTeamShots((List) be9Var.l.getOrDefault(str, km5.a));
        return Unit.a;
    }

    public static final Unit o(be9 be9Var, Context context, of3 of3Var, int i) {
        Object obj;
        int i2 = 2;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            List c = a.c(new oxh(be9Var.r, context.getString(R.string.all_players), null, null, null, false, 252));
            av8Var.d0(1555964125);
            List<Player> playersList = be9Var.getPlayersList();
            ArrayList arrayList = new ArrayList(k13.r(playersList, 10));
            for (Player player : playersList) {
                arrayList.add(new oxh(player, tba.t(player), yqo.H(-1466227517, av8Var, new jz3(player, i2)), null, null, false, 248));
            }
            av8Var.s(false);
            gv9 W = l6g.W(CollectionsKt.w0(arrayList, c));
            Iterator<E> it = W.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((oxh) obj).a, be9Var.getSelectedPlayer())) {
                    break;
                }
            }
            oxh oxhVar = (oxh) obj;
            boolean i3 = av8Var.i(be9Var);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new zd9(be9Var, 1);
                av8Var.n0(O);
            }
            r4a.j(W, oxhVar, (Function1) O, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, W3.l);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit p(be9 be9Var, Context context, of3 of3Var, int i) {
        Object obj;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            av8Var.d0(-265824105);
            ArrayList w0 = CollectionsKt.w0(be9Var.getShotTypeList(), a.c(he9.g));
            ArrayList arrayList = new ArrayList(k13.r(w0, 10));
            Iterator it = w0.iterator();
            while (it.hasNext()) {
                he9 he9Var = (he9) it.next();
                arrayList.add(new oxh(he9Var, context.getString(he9Var.c), yqo.H(-432784911, av8Var, new s16(he9Var, 28)), null, null, false, 248));
            }
            av8Var.s(false);
            gv9 W = l6g.W(arrayList);
            Iterator<E> it2 = W.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((oxh) obj).a == be9Var.getSelectedShotType()) {
                    break;
                }
            }
            oxh oxhVar = (oxh) obj;
            boolean i2 = av8Var.i(be9Var);
            Object O = av8Var.O();
            if (i2 || O == nf3.a) {
                O = new zd9(be9Var, 0);
                av8Var.n0(O);
            }
            r4a.j(W, oxhVar, (Function1) O, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, W3.l);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit q(be9 be9Var, Player player) {
        player.getClass();
        be9Var.setSelectedPlayer(player);
        be9Var.s();
        return Unit.a;
    }

    public static final Unit r(be9 be9Var, he9 he9Var) {
        he9Var.getClass();
        be9Var.setSelectedShotType(he9Var);
        ((HockeyEventMapView) be9Var.k.d).d(be9Var.getFilteredShots(), be9Var.getSelectedTeam());
        return Unit.a;
    }

    private final void setAllShots(Map<String, ? extends List<HockeyEventShotmapItem>> map) {
        this.l = map;
        List<HockeyEventShotmapItem> orDefault = map.getOrDefault(((SegmentedButtonsView) this.k.g).getSelectedItem(), km5.a);
        setEmptyStateVisibility(orDefault.isEmpty());
        if (orDefault.isEmpty()) {
            return;
        }
        setTeamShots(orDefault);
    }

    private final void setEmptyStateVisibility(boolean z) {
        z82 z82Var = this.k;
        ((GraphicLarge) z82Var.f).setVisibility(z ? 0 : 8);
        ((Group) z82Var.c).setVisibility(z ? 8 : 0);
    }

    private final void setPlayersList(List<Player> list) {
        ((eoh) this.n).setValue(list);
    }

    private final void setSelectedPlayer(Player player) {
        ((eoh) this.p).setValue(player);
    }

    private final void setSelectedShotType(he9 he9Var) {
        ((eoh) this.q).setValue(he9Var);
    }

    private final void setShotTypeList(List<? extends he9> list) {
        ((eoh) this.o).setValue(list);
    }

    private final void setTeamShots(List<HockeyEventShotmapItem> list) {
        this.m = list;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((HockeyEventShotmapItem) it.next()).getPlayer());
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(Integer.valueOf(((Player) obj).getId()))) {
                arrayList2.add(obj);
            }
        }
        setPlayersList(CollectionsKt.H0(arrayList2, new se7(16)));
        setSelectedPlayer(this.r);
        s();
    }

    public final void s() {
        Player selectedPlayer;
        List list = this.m;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            HockeyEventShotmapItem hockeyEventShotmapItem = (HockeyEventShotmapItem) obj;
            Player selectedPlayer2 = getSelectedPlayer();
            if ((selectedPlayer2 != null && selectedPlayer2.getId() == -1) || ((selectedPlayer = getSelectedPlayer()) != null && hockeyEventShotmapItem.getPlayer().getId() == selectedPlayer.getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            HockeyEventShotmapItem hockeyEventShotmapItem2 = (HockeyEventShotmapItem) it.next();
            p4h p4hVar = he9.f;
            int type = hockeyEventShotmapItem2.getType();
            p4hVar.getClass();
            arrayList2.add(p4h.r(type));
        }
        setShotTypeList(CollectionsKt.G0(CollectionsKt.S0(CollectionsKt.V0(arrayList2))));
        if (!CollectionsKt.R(getShotTypeList(), getSelectedShotType())) {
            setSelectedShotType(he9.g);
        }
        ((HockeyEventMapView) this.k.d).d(getFilteredShots(), getSelectedTeam());
    }

    public final void t(List list) {
        setVisibility(0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = Event.getHomeTeam$default(this.j, null, 1, null).getId() == ((HockeyEventShotmapItem) obj).getTeam().getId() ? "First" : "Second";
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = wv8.n(linkedHashMap, str);
            }
            ((List) obj2).add(obj);
        }
        setAllShots(linkedHashMap);
    }
}
