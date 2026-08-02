package com.sofascore.results.event.graphs.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.ironsource.C4018c8;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.setting.i;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.BallDetails;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.CricketPlayerInfo;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.task.g;
import defpackage.ao2;
import defpackage.av8;
import defpackage.bv1;
import defpackage.dla;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.gv9;
import defpackage.hl6;
import defpackage.hz3;
import defpackage.iz3;
import defpackage.jz3;
import defpackage.k13;
import defpackage.km5;
import defpackage.kq9;
import defpackage.kz3;
import defpackage.l6g;
import defpackage.ljg;
import defpackage.lqb;
import defpackage.lz;
import defpackage.m14;
import defpackage.mz3;
import defpackage.n8g;
import defpackage.nf3;
import defpackage.nq8;
import defpackage.nz3;
import defpackage.o8;
import defpackage.of3;
import defpackage.ok3;
import defpackage.oxh;
import defpackage.oz3;
import defpackage.pxh;
import defpackage.r4a;
import defpackage.s6a;
import defpackage.sub;
import defpackage.t3e;
import defpackage.tba;
import defpackage.tc3;
import defpackage.tl3;
import defpackage.utc;
import defpackage.wb3;
import defpackage.yhk;
import defpackage.yqo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003$%&J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R/\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R/\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/sofascore/results/event/graphs/view/CricketBowlerView;", "Lo8;", "", "getLayoutId", "()I", "", C4018c8.k, "", "setEmptyStateVisibility", "(Z)V", "", "Lcom/sofascore/model/mvvm/model/Player;", "<set-?>", g.e, "Le1d;", "getPlayerList", "()Ljava/util/List;", "setPlayerList", "(Ljava/util/List;)V", "playerList", h.b, "getSelectedPlayer", "()Lcom/sofascore/model/mvvm/model/Player;", "setSelectedPlayer", "(Lcom/sofascore/model/mvvm/model/Player;)V", "selectedPlayer", i.a, "getCurrentBowlerId", "()Ljava/lang/Integer;", "setCurrentBowlerId", "(Ljava/lang/Integer;)V", "currentBowlerId", "Lcom/sofascore/model/TeamSelection;", "getSelectedTeam", "()Lcom/sofascore/model/TeamSelection;", "selectedTeam", "mz3", "oz3", "nz3", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CricketBowlerView extends o8 {
    public static final /* synthetic */ int n = 0;
    public final bv1 d;
    public CricketEvent e;
    public final LinkedHashMap f;

    /* renamed from: g, reason: from kotlin metadata */
    public final e1d playerList;

    /* renamed from: h, reason: from kotlin metadata */
    public final e1d selectedPlayer;

    /* renamed from: i, reason: from kotlin metadata */
    public final e1d currentBowlerId;
    public int j;
    public boolean k;
    public boolean l;
    public final int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CricketBowlerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.batter_graph_left;
        View B = nq8.B(R.id.batter_graph_left, root);
        if (B != null) {
            hz3 a = hz3.a(B);
            i = R.id.batter_graph_right;
            View B2 = nq8.B(R.id.batter_graph_right, root);
            if (B2 != null) {
                hz3 a2 = hz3.a(B2);
                i = R.id.empty_state;
                GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_state, root);
                if (graphicLarge != null) {
                    i = R.id.legend_ball;
                    View B3 = nq8.B(R.id.legend_ball, root);
                    if (B3 != null) {
                        i = R.id.legend_ball_hit;
                        View B4 = nq8.B(R.id.legend_ball_hit, root);
                        if (B4 != null) {
                            i = R.id.legend_ball_hit_text;
                            if (((TextView) nq8.B(R.id.legend_ball_hit_text, root)) != null) {
                                i = R.id.legend_ball_text;
                                if (((TextView) nq8.B(R.id.legend_ball_text, root)) != null) {
                                    i = R.id.non_empty_state_views;
                                    Group group = (Group) nq8.B(R.id.non_empty_state_views, root);
                                    if (group != null) {
                                        i = R.id.spinner;
                                        ComposeView composeView = (ComposeView) nq8.B(R.id.spinner, root);
                                        if (composeView != null) {
                                            i = R.id.team_selector;
                                            SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.team_selector, root);
                                            if (segmentedButtonsView != null) {
                                                i = R.id.title_header;
                                                View B5 = nq8.B(R.id.title_header, root);
                                                if (B5 != null) {
                                                    this.d = new bv1((ConstraintLayout) root, a, a2, graphicLarge, B3, B4, group, composeView, segmentedButtonsView, lqb.a(B5));
                                                    this.f = new LinkedHashMap();
                                                    this.playerList = e.f(km5.a);
                                                    this.selectedPlayer = e.f(null);
                                                    this.currentBowlerId = e.f(null);
                                                    this.k = true;
                                                    this.m = ao2.s(260, context);
                                                    setVisibility(8);
                                                    composeView.setContent(new tc3(305747674, new iz3(this, 0), true));
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final Integer getCurrentBowlerId() {
        return (Integer) ((eoh) this.currentBowlerId).getValue();
    }

    private final List<Player> getPlayerList() {
        return (List) ((eoh) this.playerList).getValue();
    }

    private final Player getSelectedPlayer() {
        return (Player) ((eoh) this.selectedPlayer).getValue();
    }

    private final TeamSelection getSelectedTeam() {
        String selectedItem = ((SegmentedButtonsView) this.d.h).getSelectedItem();
        if (selectedItem != null) {
            return TeamSelection.valueOf(selectedItem);
        }
        return null;
    }

    public static final Unit j(CricketBowlerView cricketBowlerView, of3 of3Var, int i) {
        Object obj;
        int i2 = 0;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            av8Var.d0(1765741024);
            List<Player> playerList = cricketBowlerView.getPlayerList();
            ArrayList arrayList = new ArrayList(k13.r(playerList, 10));
            for (Player player : playerList) {
                arrayList.add(new oxh(player, tba.t(player), yqo.H(20499938, av8Var, new jz3(player, i2)), null, new pxh(yqo.H(1208881981, av8Var, new hl6(22, player, cricketBowlerView)), false), false, 232));
            }
            av8Var.s(false);
            gv9 W = l6g.W(arrayList);
            Iterator<E> it = W.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((oxh) obj).a, cricketBowlerView.getSelectedPlayer())) {
                    break;
                }
            }
            oxh oxhVar = (oxh) obj;
            boolean i3 = av8Var.i(cricketBowlerView);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new kz3(cricketBowlerView, 0);
                av8Var.n0(O);
            }
            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit o(Player player, CricketBowlerView cricketBowlerView, n8g n8gVar, of3 of3Var, int i) {
        n8gVar.getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 17) != 16)) {
            int id = player.getId();
            Integer currentBowlerId = cricketBowlerView.getCurrentBowlerId();
            if (currentBowlerId != null && id == currentBowlerId.intValue()) {
                av8Var.d0(502396761);
                utc utcVar = utc.a;
                kq9.b(s6a.N(R.drawable.ic_cricket_ball, 6, av8Var), null, ljg.i(utcVar, 8.0f, av8Var, utcVar, 16.0f), lz.D(R.color.live, av8Var), av8Var, 432, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(502838821);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit p(CricketBowlerView cricketBowlerView, Player player) {
        player.getClass();
        cricketBowlerView.setSelectedPlayer(player);
        cricketBowlerView.u();
        return Unit.a;
    }

    private final void setCurrentBowlerId(Integer num) {
        ((eoh) this.currentBowlerId).setValue(num);
    }

    private final void setEmptyStateVisibility(boolean isVisible) {
        bv1 bv1Var = this.d;
        ((GraphicLarge) bv1Var.i).setVisibility(isVisible ? 0 : 8);
        ((Group) bv1Var.g).setVisibility(isVisible ? 8 : 0);
    }

    private final void setPlayerList(List<Player> list) {
        ((eoh) this.playerList).setValue(list);
    }

    private final void setSelectedPlayer(Player player) {
        ((eoh) this.selectedPlayer).setValue(player);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.cricket_bowler_view;
    }

    public final String l(oz3 oz3Var) {
        int i = oz3Var.a;
        int i2 = oz3Var.b;
        Locale d = dla.d();
        String quantityString = getContext().getResources().getQuantityString(R.plurals.cricket_delivery, i);
        quantityString.getClass();
        return String.format(d, quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
    }

    public final void n(ArrayList arrayList, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nz3 nz3Var = (nz3) it.next();
            Point2D point2D = nz3Var.b;
            if (point2D.getY() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && point2D.getY() <= 5.4f) {
                arrayList2.add(nz3Var);
            } else if (point2D.getY() > 5.4f && point2D.getY() <= 16.2f) {
                arrayList3.add(nz3Var);
            } else if (point2D.getY() <= 16.2f || point2D.getY() > 21.6f) {
                arrayList5.add(nz3Var);
            } else {
                arrayList4.add(nz3Var);
            }
        }
        int size = arrayList2.size();
        if (arrayList2.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = arrayList2.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((nz3) it2.next()).a && (i = i + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        oz3 oz3Var = new oz3(size, i);
        int size2 = arrayList3.size();
        if (arrayList3.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it3 = arrayList3.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                if (((nz3) it3.next()).a && (i2 = i2 + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        oz3 oz3Var2 = new oz3(size2, i2);
        int size3 = arrayList4.size();
        if (arrayList4.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it4 = arrayList4.iterator();
            i3 = 0;
            while (it4.hasNext()) {
                if (((nz3) it4.next()).a && (i3 = i3 + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        oz3 oz3Var3 = new oz3(size3, i3);
        int size4 = arrayList5.size();
        if (arrayList5.isEmpty()) {
            i4 = 0;
        } else {
            Iterator it5 = arrayList5.iterator();
            i4 = 0;
            while (it5.hasNext()) {
                if (((nz3) it5.next()).a && (i4 = i4 + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        List j = b.j(oz3Var, oz3Var2, oz3Var3, new oz3(size4, i4));
        bv1 bv1Var = this.d;
        hz3 hz3Var = (hz3) (z ? bv1Var.f : bv1Var.e);
        hz3Var.j.d.setText(l((oz3) j.get(0)));
        hz3Var.e.d.setText(l((oz3) j.get(1)));
        hz3Var.f.d.setText(l((oz3) j.get(2)));
        hz3Var.g.d.setText(l((oz3) j.get(3)));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((hz3) this.d.e).a.post(new wb3(this, 4));
    }

    public final void q(CricketEvent cricketEvent, List list) {
        Collection collection;
        String str;
        Integer winnerCode$default;
        int i;
        Integer winnerCode$default2;
        this.e = cricketEvent;
        ArrayList arrayList = new ArrayList();
        List B0 = CollectionsKt.B0(list);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = B0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Incident.CricketIncident cricketIncident = (Incident.CricketIncident) next;
            if (cricketIncident.getBatsman() != null && cricketIncident.getBowler() != null) {
                BallDetails ballDetails = cricketIncident.getBallDetails();
                if ((ballDetails != null ? ballDetails.getPitchHit() : null) != null) {
                    arrayList2.add(next);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Boolean valueOf = Boolean.valueOf(((Incident.CricketIncident) next2).getBattingTeamId() == Event.getHomeTeam$default(cricketEvent, null, 1, null).getId());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(next2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((Boolean) entry.getKey()).booleanValue() ? TeamSelection.Second : TeamSelection.First, entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(sub.c(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Object obj2 : iterable) {
                Player bowler = ((Incident.CricketIncident) obj2).getBowler();
                Integer valueOf2 = bowler != null ? Integer.valueOf(bowler.getId()) : null;
                Object obj3 = linkedHashMap4.get(valueOf2);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap4.put(valueOf2, obj3);
                }
                ((List) obj3).add(obj2);
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap4.size());
            for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                boolean z = (entry2.getKey() == TeamSelection.First && (winnerCode$default2 = Event.getWinnerCode$default(cricketEvent, null, 1, null)) != null && winnerCode$default2.intValue() == 1) || (entry2.getKey() == TeamSelection.Second && (winnerCode$default = Event.getWinnerCode$default(cricketEvent, null, 1, null)) != null && winnerCode$default.intValue() == 2);
                if (this.k && ok3.C(cricketEvent) && z) {
                    Iterable iterable2 = (Iterable) entry3.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it3 = iterable2.iterator();
                        i = 0;
                        while (it3.hasNext()) {
                            if (Intrinsics.c(((Incident.CricketIncident) it3.next()).getWicket(), Boolean.TRUE) && (i = i + 1) < 0) {
                                b.p();
                                throw null;
                            }
                        }
                    }
                    arrayList.add(Integer.valueOf(i));
                }
                Player bowler2 = ((Incident.CricketIncident) CollectionsKt.Y((List) entry3.getValue())).getBowler();
                bowler2.getClass();
                arrayList3.add(new mz3(bowler2, (List) entry3.getValue()));
            }
            linkedHashMap3.put(key, arrayList3);
        }
        if (ok3.C(cricketEvent) && this.k && !arrayList.isEmpty()) {
            int indexOf = arrayList.indexOf((Integer) CollectionsKt.k0(arrayList));
            Integer valueOf3 = Integer.valueOf(indexOf);
            if (indexOf < 0) {
                valueOf3 = null;
            }
            this.j = valueOf3 != null ? valueOf3.intValue() : 0;
        }
        LinkedHashMap linkedHashMap5 = this.f;
        linkedHashMap5.clear();
        linkedHashMap5.putAll(linkedHashMap3);
        if (!this.k) {
            t(false);
        } else if ((!linkedHashMap5.isEmpty() ? linkedHashMap5 : null) != null) {
            CricketEvent cricketEvent2 = this.e;
            if (cricketEvent2 == null) {
                Intrinsics.i("event");
                throw null;
            }
            String statusType = cricketEvent2.getStatusType();
            if (Intrinsics.c(statusType, StatusKt.STATUS_IN_PROGRESS)) {
                CricketEvent cricketEvent3 = this.e;
                if (cricketEvent3 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                Integer currentBattingTeamId = cricketEvent3.getCurrentBattingTeamId();
                CricketEvent cricketEvent4 = this.e;
                if (cricketEvent4 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                int id = Event.getHomeTeam$default(cricketEvent4, null, 1, null).getId();
                if (currentBattingTeamId == null || currentBattingTeamId.intValue() != id) {
                    CricketEvent cricketEvent5 = this.e;
                    if (cricketEvent5 == null) {
                        Intrinsics.i("event");
                        throw null;
                    }
                    int id2 = Event.getAwayTeam$default(cricketEvent5, null, 1, null).getId();
                    if (currentBattingTeamId != null && currentBattingTeamId.intValue() == id2) {
                        str = "First";
                        r(str);
                    }
                }
                str = "Second";
                r(str);
            } else if (Intrinsics.c(statusType, StatusKt.STATUS_FINISHED)) {
                CricketEvent cricketEvent6 = this.e;
                if (cricketEvent6 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                Integer winnerCode$default3 = Event.getWinnerCode$default(cricketEvent6, null, 1, null);
                r((winnerCode$default3 != null && winnerCode$default3.intValue() == 1) ? "First" : "Second");
            }
        }
        if (this.k && ((collection = (Collection) linkedHashMap5.get(getSelectedTeam())) == null || collection.isEmpty())) {
            Collection collection2 = (Collection) linkedHashMap5.get(TeamSelection.Second);
            if (collection2 == null || collection2.isEmpty()) {
                r("First");
            } else {
                r("Second");
            }
        }
        this.k = false;
        setVisibility(0);
        requestLayout();
        invalidate();
    }

    public final void r(String str) {
        ((SegmentedButtonsView) this.d.h).q(str, false);
        Collection collection = (Collection) this.f.get(getSelectedTeam());
        if (collection == null || collection.isEmpty()) {
            setEmptyStateVisibility(true);
        } else {
            setEmptyStateVisibility(false);
            t(true);
        }
    }

    public final void s(boolean z) {
        bv1 bv1Var = this.d;
        int width = ((hz3) bv1Var.f).b.getWidth();
        hz3 hz3Var = (hz3) bv1Var.e;
        int width2 = hz3Var.b.getWidth();
        hz3 hz3Var2 = (hz3) bv1Var.f;
        int width3 = hz3Var2.d.getWidth();
        int width4 = hz3Var.d.getWidth();
        int i = this.m;
        if (z) {
            CricketBowlerGraphView cricketBowlerGraphView = hz3Var2.b;
            ViewGroup.LayoutParams layoutParams = cricketBowlerGraphView.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            tl3 tl3Var = (tl3) layoutParams;
            tl3Var.P = i;
            cricketBowlerGraphView.setLayoutParams(tl3Var);
            CricketBowlerGraphView cricketBowlerGraphView2 = hz3Var.b;
            ViewGroup.LayoutParams layoutParams2 = cricketBowlerGraphView2.getLayoutParams();
            if (layoutParams2 == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            } else {
                tl3 tl3Var2 = (tl3) layoutParams2;
                tl3Var2.P = i;
                cricketBowlerGraphView2.setLayoutParams(tl3Var2);
            }
        }
        Integer valueOf = width3 == width4 ? Integer.valueOf(i) : width != width2 ? Integer.valueOf(Math.min(width, width2)) : null;
        if (valueOf != null) {
            CricketBowlerGraphView cricketBowlerGraphView3 = hz3Var2.b;
            ViewGroup.LayoutParams layoutParams3 = cricketBowlerGraphView3.getLayoutParams();
            if (layoutParams3 == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            tl3 tl3Var3 = (tl3) layoutParams3;
            tl3Var3.P = valueOf.intValue();
            cricketBowlerGraphView3.setLayoutParams(tl3Var3);
            CricketBowlerGraphView cricketBowlerGraphView4 = hz3Var.b;
            ViewGroup.LayoutParams layoutParams4 = cricketBowlerGraphView4.getLayoutParams();
            if (layoutParams4 == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            tl3 tl3Var4 = (tl3) layoutParams4;
            tl3Var4.P = valueOf.intValue();
            cricketBowlerGraphView4.setLayoutParams(tl3Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.sofascore.results.event.graphs.view.CricketBowlerView] */
    public final void t(boolean z) {
        ?? r3;
        Player player;
        CricketEvent cricketEvent = this.e;
        Player player2 = null;
        if (cricketEvent == null) {
            Intrinsics.i("event");
            throw null;
        }
        setCurrentBowlerId(cricketEvent.getCurrentBowlerId());
        List list = (List) this.f.get(getSelectedTeam());
        if (list != null) {
            r3 = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r3.add(((mz3) it.next()).a);
            }
        } else {
            r3 = 0;
        }
        if (r3 == 0) {
            r3 = km5.a;
        }
        setPlayerList(r3);
        if (z) {
            if (this.k) {
                CricketEvent cricketEvent2 = this.e;
                if (cricketEvent2 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                if (ok3.C(cricketEvent2)) {
                    player = (Player) CollectionsKt.a0(this.j, getPlayerList());
                    setSelectedPlayer(player);
                }
            }
            Iterator it2 = getPlayerList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ?? next = it2.next();
                int id = ((Player) next).getId();
                Integer currentBowlerId = getCurrentBowlerId();
                if (currentBowlerId != null && id == currentBowlerId.intValue()) {
                    player2 = next;
                    break;
                }
            }
            player = player2;
            if (player == null) {
                player = (Player) CollectionsKt.firstOrNull(getPlayerList());
            }
            setSelectedPlayer(player);
        }
        u();
    }

    public final void u() {
        mz3 mz3Var;
        ArrayList arrayList;
        List list;
        Point2D pitchHit;
        Point2D pitchHit2;
        CricketPlayerInfo cricketPlayerInfo;
        List list2;
        Point2D pitchHit3;
        Point2D pitchHit4;
        CricketPlayerInfo cricketPlayerInfo2;
        List<Player> playerList = getPlayerList();
        playerList.getClass();
        Iterator<Player> it = playerList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Player next = it.next();
            next.getClass();
            Player selectedPlayer = getSelectedPlayer();
            if (selectedPlayer != null && next.getId() == selectedPlayer.getId()) {
                break;
            } else {
                i++;
            }
        }
        ArrayList arrayList2 = null;
        Integer valueOf = i == -1 ? null : Integer.valueOf(i);
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            List list3 = (List) this.f.get(getSelectedTeam());
            if (list3 == null) {
                mz3Var = null;
            } else if (intValue < 0 || intValue >= list3.size()) {
                return;
            } else {
                mz3Var = (mz3) list3.get(intValue);
            }
            if (mz3Var == null || (list2 = mz3Var.b) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list2) {
                    Player batsman = ((Incident.CricketIncident) obj).getBatsman();
                    String batting = (batsman == null || (cricketPlayerInfo2 = batsman.getCricketPlayerInfo()) == null) ? null : cricketPlayerInfo2.getBatting();
                    m14[] m14VarArr = m14.a;
                    if (Intrinsics.c(batting, PlayerKt.PREFERRED_FOOT_RIGHT)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList(k13.r(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Incident.CricketIncident cricketIncident = (Incident.CricketIncident) it2.next();
                    boolean c = Intrinsics.c(cricketIncident.getWicket(), Boolean.TRUE);
                    BallDetails ballDetails = cricketIncident.getBallDetails();
                    float x = (ballDetails == null || (pitchHit4 = ballDetails.getPitchHit()) == null) ? 0.0f : pitchHit4.getX();
                    BallDetails ballDetails2 = cricketIncident.getBallDetails();
                    arrayList.add(new nz3(c, new Point2D(x, ((ballDetails2 == null || (pitchHit3 = ballDetails2.getPitchHit()) == null) ? 0.0f : pitchHit3.getY()) - 16.0f)));
                }
            }
            if (mz3Var != null && (list = mz3Var.b) != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list) {
                    Player batsman2 = ((Incident.CricketIncident) obj2).getBatsman();
                    String batting2 = (batsman2 == null || (cricketPlayerInfo = batsman2.getCricketPlayerInfo()) == null) ? null : cricketPlayerInfo.getBatting();
                    m14[] m14VarArr2 = m14.a;
                    if (Intrinsics.c(batting2, PlayerKt.PREFERRED_FOOT_LEFT)) {
                        arrayList4.add(obj2);
                    }
                }
                arrayList2 = new ArrayList(k13.r(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    Incident.CricketIncident cricketIncident2 = (Incident.CricketIncident) it3.next();
                    boolean c2 = Intrinsics.c(cricketIncident2.getWicket(), Boolean.TRUE);
                    BallDetails ballDetails3 = cricketIncident2.getBallDetails();
                    float x2 = (ballDetails3 == null || (pitchHit2 = ballDetails3.getPitchHit()) == null) ? 0.0f : pitchHit2.getX();
                    BallDetails ballDetails4 = cricketIncident2.getBallDetails();
                    arrayList2.add(new nz3(c2, new Point2D(x2, ((ballDetails4 == null || (pitchHit = ballDetails4.getPitchHit()) == null) ? 0.0f : pitchHit.getY()) - 16.0f)));
                }
            }
            bv1 bv1Var = this.d;
            if (arrayList != null) {
                n(arrayList, true);
                CricketBowlerGraphView cricketBowlerGraphView = ((hz3) bv1Var.f).b;
                ArrayList arrayList5 = cricketBowlerGraphView.j;
                arrayList5.clear();
                arrayList5.addAll(arrayList);
                cricketBowlerGraphView.invalidate();
            }
            if (arrayList2 != null) {
                n(arrayList2, false);
                CricketBowlerGraphView cricketBowlerGraphView2 = ((hz3) bv1Var.e).b;
                ArrayList arrayList6 = cricketBowlerGraphView2.j;
                arrayList6.clear();
                arrayList6.addAll(arrayList2);
                cricketBowlerGraphView2.invalidate();
            }
        }
    }
}
