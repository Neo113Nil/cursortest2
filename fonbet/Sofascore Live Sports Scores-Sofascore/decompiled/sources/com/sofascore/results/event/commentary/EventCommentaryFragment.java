package com.sofascore.results.event.commentary;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.model.newNetwork.commentary.CommentaryResponse;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import defpackage.a70;
import defpackage.asf;
import defpackage.aw5;
import defpackage.bw5;
import defpackage.c9h;
import defpackage.duf;
import defpackage.ew5;
import defpackage.f5k;
import defpackage.f8h;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.fv2;
import defpackage.gw5;
import defpackage.h43;
import defpackage.hw5;
import defpackage.j63;
import defpackage.jle;
import defpackage.joa;
import defpackage.jpe;
import defpackage.k13;
import defpackage.km5;
import defpackage.kr1;
import defpackage.krk;
import defpackage.kz3;
import defpackage.lm5;
import defpackage.me4;
import defpackage.mqi;
import defpackage.mr5;
import defpackage.nl2;
import defpackage.ok3;
import defpackage.otk;
import defpackage.p24;
import defpackage.qrf;
import defpackage.r82;
import defpackage.rlh;
import defpackage.s1h;
import defpackage.tv5;
import defpackage.u6b;
import defpackage.un0;
import defpackage.uv5;
import defpackage.v1h;
import defpackage.vv5;
import defpackage.w9h;
import defpackage.wca;
import defpackage.wrf;
import defpackage.wv5;
import defpackage.xbb;
import defpackage.xw3;
import defpackage.y7;
import defpackage.ypa;
import defpackage.yq8;
import defpackage.ysa;
import defpackage.z1h;
import defpackage.z33;
import defpackage.z8e;
import defpackage.zl9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/commentary/EventCommentaryFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lyq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventCommentaryFragment extends Hilt_EventCommentaryFragment<yq8> {
    public final otk r;
    public final otk s;
    public final mqi t;
    public SegmentedButtonsView u;
    public final mqi v;
    public String w;
    public ew5 x;
    public final LinkedHashMap y;
    public final mqi z;

    public EventCommentaryFragment() {
        int i = 3;
        joa a = ypa.a(ysa.c, new j63(new wv5(this, i), 23));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(hw5.class), new p24(a, 23), new fi5(this, a, i), new p24(a, 24));
        int i2 = 1;
        int i3 = 2;
        this.s = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new wv5(this, 0), new wv5(this, i3), new wv5(this, i2));
        this.t = ypa.b(new uv5(this, i2));
        this.v = ypa.b(new uv5(this, i3));
        this.w = "ALL_PERIODS";
        this.x = bw5.a;
        this.y = new LinkedHashMap();
        this.z = ypa.b(new uv5(this, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029c  */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I(EventCommentaryFragment eventCommentaryFragment, boolean z, z33 z33Var, int i) {
        boolean z2;
        Iterator it;
        Object obj;
        Comment comment;
        Long l;
        Long lastPeriodEndTimestamp;
        Object obj2;
        List list;
        Object obj3;
        Object obj4;
        mqi mqiVar = eventCommentaryFragment.z;
        boolean z3 = (i & 1) == 0;
        boolean z4 = (i & 2) != 0 ? false : z;
        z33 z33Var2 = (i & 4) != 0 ? null : z33Var;
        LinkedHashMap linkedHashMap = eventCommentaryFragment.y;
        aw5 C = eventCommentaryFragment.C();
        CommentaryResponse commentaryResponse = (CommentaryResponse) eventCommentaryFragment.F().g.d();
        C.p = commentaryResponse != null ? commentaryResponse.getHomeShirtColors() : null;
        aw5 C2 = eventCommentaryFragment.C();
        CommentaryResponse commentaryResponse2 = (CommentaryResponse) eventCommentaryFragment.F().g.d();
        C2.q = commentaryResponse2 != null ? commentaryResponse2.getAwayShirtColors() : null;
        if (Intrinsics.c(ok3.s(eventCommentaryFragment.E()), Sports.AMERICAN_FOOTBALL) || Intrinsics.c(ok3.s(eventCommentaryFragment.E()), Sports.BASKETBALL)) {
            List B0 = CollectionsKt.B0(eventCommentaryFragment.D());
            ArrayList arrayList = new ArrayList();
            Iterator it2 = B0.iterator();
            while (it2.hasNext()) {
                String periodName = ((Comment) it2.next()).getPeriodName();
                if (periodName != null) {
                    arrayList.add(periodName);
                }
            }
            ArrayList U0 = CollectionsKt.U0(CollectionsKt.S0(CollectionsKt.V0(arrayList)));
            if (!U0.isEmpty()) {
                if (eventCommentaryFragment.u == null) {
                    Context requireContext = eventCommentaryFragment.requireContext();
                    requireContext.getClass();
                    SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext, null, 6);
                    Boolean bool = Boolean.FALSE;
                    Pair pair = new Pair(bool, bool);
                    segmentedButtonsView.k = new fv2(eventCommentaryFragment, 16);
                    segmentedButtonsView.g = false;
                    segmentedButtonsView.h = pair;
                    segmentedButtonsView.j = v1h.f;
                    segmentedButtonsView.i = new z1h(0);
                    rlh rlhVar = rlh.b;
                    if (!rlhVar.isEmpty()) {
                        SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                    }
                    eventCommentaryFragment.u = segmentedButtonsView;
                    krk krkVar = eventCommentaryFragment.l;
                    krkVar.getClass();
                    ((yq8) krkVar).b.addView(eventCommentaryFragment.u);
                }
                SegmentedButtonsView segmentedButtonsView2 = eventCommentaryFragment.u;
                if (!U0.equals(segmentedButtonsView2 != null ? segmentedButtonsView2.getHeaderTypes() : null)) {
                    if (Intrinsics.c(ok3.s(eventCommentaryFragment.E()), Sports.BASKETBALL)) {
                        SegmentedButtonsView segmentedButtonsView3 = eventCommentaryFragment.u;
                        if ((segmentedButtonsView3 != null ? segmentedButtonsView3.getSelectedItem() : null) == null) {
                            eventCommentaryFragment.w = (String) CollectionsKt.h0(U0);
                        }
                    } else {
                        U0.add(0, "ALL_PERIODS");
                    }
                    SegmentedButtonsView segmentedButtonsView4 = eventCommentaryFragment.u;
                    if (segmentedButtonsView4 != null) {
                        ArrayList arrayList2 = new ArrayList(k13.r(U0, 10));
                        Iterator it3 = U0.iterator();
                        while (it3.hasNext()) {
                            String str = (String) it3.next();
                            Set set = f5k.a;
                            Context requireContext2 = eventCommentaryFragment.requireContext();
                            requireContext2.getClass();
                            arrayList2.add(new s1h(str, f5k.a(requireContext2, str, ok3.s(eventCommentaryFragment.E())), true));
                        }
                        z2 = true;
                        SegmentedButtonsView.t(segmentedButtonsView4, arrayList2, eventCommentaryFragment.w, 4);
                        if (ok3.D(eventCommentaryFragment.E()) || !Intrinsics.c(ok3.s(eventCommentaryFragment.E()), Sports.BASEBALL)) {
                            it = eventCommentaryFragment.D().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = it.next();
                                    if (((Comment) obj).getGroupId() != null) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            comment = (Comment) obj;
                        } else {
                            List D = eventCommentaryFragment.D();
                            ListIterator listIterator = D.listIterator(D.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    obj4 = listIterator.previous();
                                    if (((Comment) obj4).getGroupId() != null) {
                                        break;
                                    }
                                } else {
                                    obj4 = null;
                                    break;
                                }
                            }
                            comment = (Comment) obj4;
                        }
                        if (comment != null) {
                            Iterator it4 = eventCommentaryFragment.F().h.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it4.next();
                                int id = ((zl9) obj3).getId();
                                Integer groupId = comment.getGroupId();
                                if (groupId != null && id == groupId.intValue()) {
                                    break;
                                }
                            }
                            zl9 zl9Var = (zl9) obj3;
                            if (zl9Var != null) {
                                String key = eventCommentaryFragment.x.getKey();
                                Object obj5 = linkedHashMap.get(key);
                                if (obj5 == null) {
                                    obj5 = new LinkedHashMap();
                                    linkedHashMap.put(key, obj5);
                                }
                                Map map = (Map) obj5;
                                if (map.isEmpty()) {
                                    if (Intrinsics.c(eventCommentaryFragment.x, bw5.a)) {
                                        map.put(Integer.valueOf(zl9Var.getId()), Boolean.TRUE);
                                    } else {
                                        Iterator it5 = eventCommentaryFragment.F().h.iterator();
                                        while (it5.hasNext()) {
                                            map.put(Integer.valueOf(((zl9) it5.next()).getId()), Boolean.TRUE);
                                        }
                                    }
                                }
                            }
                        }
                        List D2 = eventCommentaryFragment.D();
                        ?? arrayList3 = new ArrayList();
                        for (Object obj6 : D2) {
                            Comment comment2 = (Comment) obj6;
                            if (eventCommentaryFragment.x.a(comment2) && (Intrinsics.c(eventCommentaryFragment.w, "ALL_PERIODS") || Intrinsics.c(comment2.getPeriodName(), eventCommentaryFragment.w))) {
                                arrayList3.add(obj6);
                            }
                        }
                        List list2 = arrayList3;
                        if (eventCommentaryFragment.G()) {
                            c9h c9hVar = new c9h();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Iterator it6 = arrayList3.iterator();
                            while (it6.hasNext()) {
                                Object next = it6.next();
                                Integer groupId2 = ((Comment) next).getGroupId();
                                Object obj7 = linkedHashMap2.get(groupId2);
                                if (obj7 == null) {
                                    ArrayList arrayList4 = new ArrayList();
                                    linkedHashMap2.put(groupId2, arrayList4);
                                    obj7 = arrayList4;
                                }
                                ((List) obj7).add(next);
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            if (!ok3.D(eventCommentaryFragment.E()) || !Intrinsics.c(ok3.s(eventCommentaryFragment.E()), Sports.BASEBALL)) {
                                z2 = false;
                            }
                            if (z2) {
                                arrayList3 = CollectionsKt.B0(arrayList3);
                            }
                            for (Comment comment3 : arrayList3) {
                                Integer groupId3 = comment3.getGroupId();
                                if (groupId3 != null) {
                                    int intValue = groupId3.intValue();
                                    if (!linkedHashSet.contains(Integer.valueOf(intValue))) {
                                        String key2 = eventCommentaryFragment.x.getKey();
                                        lm5 lm5Var = lm5.a;
                                        lm5Var.getClass();
                                        boolean c = Intrinsics.c((Boolean) ((Map) linkedHashMap.getOrDefault(key2, lm5Var)).get(Integer.valueOf(intValue)), Boolean.TRUE);
                                        Iterator it7 = eventCommentaryFragment.F().h.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                obj2 = it7.next();
                                                if (((zl9) obj2).getId() == intValue) {
                                                    break;
                                                }
                                            } else {
                                                obj2 = null;
                                                break;
                                            }
                                        }
                                        zl9 zl9Var2 = (zl9) obj2;
                                        if (zl9Var2 != null) {
                                            c9hVar.add(new z33(zl9Var2, c));
                                        }
                                        if (c && (list = (List) linkedHashMap2.get(Integer.valueOf(intValue))) != null) {
                                            if (z2) {
                                                list = CollectionsKt.B0(list);
                                            }
                                            c9hVar.addAll(list);
                                        }
                                        linkedHashSet.add(Integer.valueOf(intValue));
                                    }
                                } else {
                                    c9hVar.add(comment3);
                                }
                            }
                            list2 = CollectionsKt.S0(w9h.a(c9hVar));
                        }
                        Event E = eventCommentaryFragment.E();
                        Time time = E.getTime();
                        l = (time == null && (lastPeriodEndTimestamp = time.getLastPeriodEndTimestamp()) != null && Intrinsics.c(E.getSportSlug(), Sports.FOOTBALL) && E.getStatus().getCode() == 31 && me4.t(StatusKt.STATUS_IN_PROGRESS, E)) ? lastPeriodEndTimestamp : null;
                        if (l != null) {
                            long longValue = l.longValue();
                            xbb b = a.b();
                            b.add(new h43(longValue));
                            b.addAll(list2);
                            xbb a = a.a(b);
                            if (a != null) {
                                list2 = a;
                            }
                        }
                        krk krkVar2 = eventCommentaryFragment.l;
                        krkVar2.getClass();
                        n layoutManager = ((yq8) krkVar2).c.getLayoutManager();
                        layoutManager.getClass();
                        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                        eventCommentaryFragment.C().n = eventCommentaryFragment.G();
                        eventCommentaryFragment.C().F(list2);
                        Unit unit = Unit.a;
                        if (!z4) {
                            eventCommentaryFragment.C().notifyDataSetChanged();
                            return;
                        }
                        if (z3) {
                            krk krkVar3 = eventCommentaryFragment.l;
                            krkVar3.getClass();
                            ((yq8) krkVar3).c.scrollToPosition(0);
                            krk krkVar4 = eventCommentaryFragment.l;
                            krkVar4.getClass();
                            ((yq8) krkVar4).c.scrollBy(0, 0);
                            return;
                        }
                        if (z33Var2 == null) {
                            if (findFirstVisibleItemPosition == 0) {
                                krk krkVar5 = eventCommentaryFragment.l;
                                krkVar5.getClass();
                                ((yq8) krkVar5).c.smoothScrollToPosition(0);
                                return;
                            }
                            return;
                        }
                        Integer M = z8e.M(list2, new kz3(z33Var2, 21));
                        if (M != null) {
                            ((vv5) mqiVar.getValue()).setTargetPosition(eventCommentaryFragment.C().g.size() + M.intValue());
                            krk krkVar6 = eventCommentaryFragment.l;
                            krkVar6.getClass();
                            n layoutManager2 = ((yq8) krkVar6).c.getLayoutManager();
                            if (layoutManager2 != null) {
                                layoutManager2.startSmoothScroll((vv5) mqiVar.getValue());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
        z2 = true;
        if (ok3.D(eventCommentaryFragment.E())) {
        }
        it = eventCommentaryFragment.D().iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        comment = (Comment) obj;
        if (comment != null) {
        }
        List D22 = eventCommentaryFragment.D();
        ?? arrayList32 = new ArrayList();
        while (r3.hasNext()) {
        }
        List list22 = arrayList32;
        if (eventCommentaryFragment.G()) {
        }
        Event E2 = eventCommentaryFragment.E();
        Time time2 = E2.getTime();
        if (time2 == null) {
        }
        if (l != null) {
        }
        krk krkVar22 = eventCommentaryFragment.l;
        krkVar22.getClass();
        n layoutManager3 = ((yq8) krkVar22).c.getLayoutManager();
        layoutManager3.getClass();
        int findFirstVisibleItemPosition2 = ((LinearLayoutManager) layoutManager3).findFirstVisibleItemPosition();
        eventCommentaryFragment.C().n = eventCommentaryFragment.G();
        eventCommentaryFragment.C().F(list22);
        Unit unit2 = Unit.a;
        if (!z4) {
        }
    }

    public final aw5 C() {
        return (aw5) this.t.getValue();
    }

    public final List D() {
        List<Comment> comments;
        CommentaryResponse commentaryResponse = (CommentaryResponse) F().g.d();
        return (commentaryResponse == null || (comments = commentaryResponse.getComments()) == null) ? km5.a : comments;
    }

    public final Event E() {
        Object d = ((mr5) this.s.getValue()).v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    public final hw5 F() {
        return (hw5) this.r.getValue();
    }

    public final boolean G() {
        if (Intrinsics.c(ok3.s(E()), Sports.BASEBALL)) {
            return true;
        }
        return Intrinsics.c(this.x, bw5.a) && Intrinsics.c(ok3.s(E()), Sports.AMERICAN_FOOTBALL);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Player player, boolean z) {
        Object obj;
        Boolean isHome$default;
        Team awayTeam$default;
        int i;
        Lineups awayLineups$default;
        PlayerData playerData;
        Double d;
        Double avgRating;
        FragmentActivity activity;
        PlayerEventStatistics statistics;
        List<PlayerData> players;
        Object obj2;
        Player playerIn;
        Player playerOut;
        if (!Intrinsics.c(E().getHasEventPlayerStatistics(), Boolean.TRUE)) {
            int i2 = PlayerActivity.Z;
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getClass();
            int id = getId();
            UniqueTournament uniqueTournament = E().getTournament().getUniqueTournament();
            jle.q(requireActivity, id, uniqueTournament != null ? uniqueTournament.getId() : 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
            return;
        }
        Iterator it = D().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Comment comment = (Comment) obj;
            Player player2 = comment.getPlayer();
            if ((player2 != null && player2.getId() == player.getId()) || (((playerIn = comment.getPlayerIn()) != null && playerIn.getId() == player.getId()) || ((playerOut = comment.getPlayerOut()) != null && playerOut.getId() == player.getId()))) {
                break;
            }
        }
        Comment comment2 = (Comment) obj;
        if (comment2 == null || (isHome$default = Comment.getIsHome$default(comment2, null, 1, null)) == null) {
            return;
        }
        if (z ^ isHome$default.booleanValue()) {
            awayTeam$default = Event.getHomeTeam$default(E(), null, 1, null);
            i = 1;
        } else {
            awayTeam$default = Event.getAwayTeam$default(E(), null, 1, null);
            i = 2;
        }
        Team team = awayTeam$default;
        hw5 F = F();
        int id2 = player.getId();
        int i3 = team.getId() == Event.getHomeTeam$default(E(), null, 1, null).getId() ? 1 : 0;
        LineupsResponse lineupsResponse = F.i;
        if (i3 != 0) {
            if (lineupsResponse != null) {
                awayLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null);
            }
            awayLineups$default = null;
        } else {
            if (lineupsResponse != null) {
                awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null);
            }
            awayLineups$default = null;
        }
        if (awayLineups$default == null || (players = awayLineups$default.getPlayers()) == null) {
            playerData = null;
        } else {
            Iterator<T> it2 = players.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (((PlayerData) obj2).getPlayer().getId() == id2) {
                        break;
                    }
                }
            }
            playerData = (PlayerData) obj2;
        }
        if (playerData == null || (statistics = playerData.getStatistics()) == null || (avgRating = statistics.getRating()) == null) {
            if (playerData == null) {
                d = null;
                activity = getActivity();
                if (activity == null) {
                    PlayerEventStatisticsModal c = jpe.c(f8h.i(E(), player, team, i, d, 96), null);
                    AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                    if (appCompatActivity != null) {
                        me4.n(c, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                        return;
                    }
                    return;
                }
                return;
            }
            avgRating = playerData.getAvgRating();
        }
        d = avgRating;
        activity = getActivity();
        if (activity == null) {
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return yq8.a(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "CommentaryTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((yq8) krkVar).d;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        final RecyclerView recyclerView = ((yq8) krkVar2).c;
        recyclerView.setAdapter(C());
        aw5 C = C();
        int i = 27;
        kr1 kr1Var = new kr1(this, i);
        C.getClass();
        C.a.d = kr1Var;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 22);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        wrf.a(recyclerView, new tv5(this, 0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.sofascore.results.event.commentary.EventCommentaryFragment$onViewCreate$1$2$2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            public final void smoothScrollToPosition(RecyclerView recyclerView2, qrf qrfVar, int i2) {
                recyclerView2.getClass();
                qrfVar.getClass();
                nl2 nl2Var = new nl2(RecyclerView.this.getContext(), 4);
                nl2Var.setTargetPosition(i2);
                startSmoothScroll(nl2Var);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            /* renamed from: supportsPredictiveItemAnimations */
            public final boolean getA() {
                return false;
            }
        });
        int i2 = 14;
        F().g.e(getViewLifecycleOwner(), new y7(i2, new r82(i, new asf(), this)));
        hw5 F = F();
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        F.g(viewLifecycleOwner, new uv5(this, 0));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        hw5 F = F();
        xw3.L(un0.z(F), null, null, new gw5(E(), F, null), 3);
    }
}
