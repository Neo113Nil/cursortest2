package com.sofascore.results.event.details.view.cricket.wagonwheel;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.ironsource.C4018c8;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.setting.i;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.CricketPlayerInfo;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.tennis.SwitchView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.task.g;
import defpackage.a14;
import defpackage.a5f;
import defpackage.ajh;
import defpackage.apf;
import defpackage.av8;
import defpackage.b04;
import defpackage.b7;
import defpackage.d04;
import defpackage.djf;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.f7a;
import defpackage.fc6;
import defpackage.g04;
import defpackage.g31;
import defpackage.g5k;
import defpackage.gh5;
import defpackage.gv9;
import defpackage.hc9;
import defpackage.hfe;
import defpackage.hl6;
import defpackage.ht9;
import defpackage.i14;
import defpackage.inb;
import defpackage.j22;
import defpackage.ju1;
import defpackage.jz3;
import defpackage.k13;
import defpackage.k14;
import defpackage.km5;
import defpackage.kp5;
import defpackage.kq9;
import defpackage.kz3;
import defpackage.l14;
import defpackage.l6g;
import defpackage.ljg;
import defpackage.lqb;
import defpackage.lz;
import defpackage.m14;
import defpackage.n14;
import defpackage.n8g;
import defpackage.nf3;
import defpackage.nq8;
import defpackage.o13;
import defpackage.o14;
import defpackage.o8;
import defpackage.of3;
import defpackage.ok3;
import defpackage.oxh;
import defpackage.p12;
import defpackage.p14;
import defpackage.pxh;
import defpackage.pz3;
import defpackage.q14;
import defpackage.r14;
import defpackage.r1h;
import defpackage.r4a;
import defpackage.r82;
import defpackage.rlh;
import defpackage.s6a;
import defpackage.sub;
import defpackage.t1h;
import defpackage.t3e;
import defpackage.tba;
import defpackage.tc3;
import defpackage.tgj;
import defpackage.tz3;
import defpackage.uic;
import defpackage.ur1;
import defpackage.utc;
import defpackage.v1h;
import defpackage.vt2;
import defpackage.xbb;
import defpackage.yhk;
import defpackage.yqo;
import defpackage.z1h;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0007$%&'()*J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R/\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R/\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/sofascore/results/event/details/view/cricket/wagonwheel/CricketWagonWheelView;", "Lo8;", "", "getLayoutId", "()I", "", C4018c8.k, "", "setEmptyStateVisibility", "(Z)V", "", "Lcom/sofascore/model/mvvm/model/Player;", "<set-?>", g.e, "Le1d;", "getPlayerList", "()Ljava/util/List;", "setPlayerList", "(Ljava/util/List;)V", "playerList", h.b, "getSelectedPlayer", "()Lcom/sofascore/model/mvvm/model/Player;", "setSelectedPlayer", "(Lcom/sofascore/model/mvvm/model/Player;)V", "selectedPlayer", i.a, "getCurrentBatsmanId", "()Ljava/lang/Integer;", "setCurrentBatsmanId", "(Ljava/lang/Integer;)V", "currentBatsmanId", "Lcom/sofascore/model/TeamSelection;", "getSelectedTeam", "()Lcom/sofascore/model/TeamSelection;", "selectedTeam", "l14", "r14", "p14", "n14", "m14", "q14", "o14", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CricketWagonWheelView extends o8 {
    public static final /* synthetic */ int l = 0;
    public final p12 d;
    public CricketEvent e;
    public final LinkedHashMap f;

    /* renamed from: g, reason: from kotlin metadata */
    public final e1d playerList;

    /* renamed from: h, reason: from kotlin metadata */
    public final e1d selectedPlayer;

    /* renamed from: i, reason: from kotlin metadata */
    public final e1d currentBatsmanId;
    public int j;
    public boolean k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CricketWagonWheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, r1, 0);
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        View root = getRoot();
        int i2 = R.id.data_info;
        View B = nq8.B(R.id.data_info, root);
        if (B != null) {
            gh5 c = gh5.c(B);
            i2 = R.id.empty_state;
            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_state, root);
            if (graphicLarge != null) {
                i2 = R.id.graph_top_barrier;
                if (((Barrier) nq8.B(R.id.graph_top_barrier, root)) != null) {
                    i2 = R.id.non_empty_state_views;
                    Group group = (Group) nq8.B(R.id.non_empty_state_views, root);
                    if (group != null) {
                        i2 = R.id.runs_filter;
                        TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.runs_filter, root);
                        if (typeHeaderView != null) {
                            i2 = R.id.spinner;
                            ComposeView composeView = (ComposeView) nq8.B(R.id.spinner, root);
                            if (composeView != null) {
                                i2 = R.id.statistics_container;
                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.statistics_container, root);
                                if (linearLayout != null) {
                                    i2 = R.id.switcher;
                                    SwitchView switchView = (SwitchView) nq8.B(R.id.switcher, root);
                                    if (switchView != null) {
                                        i2 = R.id.team_selector;
                                        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.team_selector, root);
                                        if (segmentedButtonsView != null) {
                                            i2 = R.id.title_header;
                                            View B2 = nq8.B(R.id.title_header, root);
                                            if (B2 != null) {
                                                lqb a = lqb.a(B2);
                                                i2 = R.id.touch_tooltip;
                                                View B3 = nq8.B(R.id.touch_tooltip, root);
                                                if (B3 != null) {
                                                    gh5 c2 = gh5.c(B3);
                                                    i2 = R.id.wagon_wheel;
                                                    CricketWagonWheelGraphView cricketWagonWheelGraphView = (CricketWagonWheelGraphView) nq8.B(R.id.wagon_wheel, root);
                                                    if (cricketWagonWheelGraphView != null) {
                                                        this.d = new p12((ConstraintLayout) root, c, graphicLarge, group, typeHeaderView, composeView, linearLayout, switchView, segmentedButtonsView, a, c2, cricketWagonWheelGraphView);
                                                        this.f = new LinkedHashMap();
                                                        this.playerList = e.f(km5.a);
                                                        this.selectedPlayer = e.f(null);
                                                        this.currentBatsmanId = e.f(null);
                                                        this.k = true;
                                                        setVisibility(8);
                                                        composeView.setContent(new tc3(-828322363, new k14(this, 0), true));
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
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    private final Integer getCurrentBatsmanId() {
        return (Integer) ((eoh) this.currentBatsmanId).getValue();
    }

    private final List<Player> getPlayerList() {
        return (List) ((eoh) this.playerList).getValue();
    }

    private final Player getSelectedPlayer() {
        return (Player) ((eoh) this.selectedPlayer).getValue();
    }

    private final TeamSelection getSelectedTeam() {
        String selectedItem = ((SegmentedButtonsView) this.d.j).getSelectedItem();
        if (selectedItem != null) {
            return TeamSelection.valueOf(selectedItem);
        }
        return null;
    }

    public static final Unit j(CricketWagonWheelView cricketWagonWheelView, of3 of3Var, int i) {
        Object obj;
        int i2 = 1;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            av8Var.d0(-1448838639);
            List<Player> playerList = cricketWagonWheelView.getPlayerList();
            ArrayList arrayList = new ArrayList(k13.r(playerList, 10));
            Iterator<T> it = playerList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Player player = (Player) it.next();
                CricketPlayerInfo cricketPlayerInfo = player.getCricketPlayerInfo();
                obj = cricketPlayerInfo != null ? cricketPlayerInfo.getBatting() : null;
                m14[] m14VarArr = m14.a;
                String string = cricketWagonWheelView.getContext().getString(R.string.player_hand, tba.t(player), cricketWagonWheelView.getContext().getString(Intrinsics.c(obj, PlayerKt.PREFERRED_FOOT_RIGHT) ? R.string.right_hand_short : R.string.left_hand_short));
                string.getClass();
                arrayList.add(new oxh(player, string, yqo.H(-958994227, av8Var, new jz3(player, i2)), null, new pxh(yqo.H(1680402344, av8Var, new hl6(23, player, cricketWagonWheelView)), false), false, 232));
            }
            av8Var.s(false);
            gv9 W = l6g.W(arrayList);
            Iterator<E> it2 = W.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.c(((oxh) next).a, cricketWagonWheelView.getSelectedPlayer())) {
                    obj = next;
                    break;
                }
            }
            oxh oxhVar = (oxh) obj;
            boolean i3 = av8Var.i(cricketWagonWheelView);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new kz3(cricketWagonWheelView, 3);
                av8Var.n0(O);
            }
            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit n(Player player, CricketWagonWheelView cricketWagonWheelView, n8g n8gVar, of3 of3Var, int i) {
        n8gVar.getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 17) != 16)) {
            int id = player.getId();
            Integer currentBatsmanId = cricketWagonWheelView.getCurrentBatsmanId();
            if (currentBatsmanId != null && id == currentBatsmanId.intValue()) {
                av8Var.d0(-1272493361);
                utc utcVar = utc.a;
                kq9.b(s6a.N(R.drawable.ic_cricket_bat, 6, av8Var), null, ljg.i(utcVar, 8.0f, av8Var, utcVar, 16.0f), lz.D(R.color.live, av8Var), av8Var, 432, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(-1272052262);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit o(CricketWagonWheelView cricketWagonWheelView, Player player) {
        player.getClass();
        cricketWagonWheelView.setSelectedPlayer(player);
        cricketWagonWheelView.s();
        return Unit.a;
    }

    private final void setCurrentBatsmanId(Integer num) {
        ((eoh) this.currentBatsmanId).setValue(num);
    }

    private final void setEmptyStateVisibility(boolean isVisible) {
        p12 p12Var = this.d;
        GraphicLarge graphicLarge = (GraphicLarge) p12Var.e;
        CricketWagonWheelGraphView cricketWagonWheelGraphView = (CricketWagonWheelGraphView) p12Var.c;
        int i = 8;
        graphicLarge.setVisibility(isVisible ? 0 : 8);
        ((Group) p12Var.g).setVisibility(!isVisible ? 0 : 8);
        LinearLayout linearLayout = ((gh5) p12Var.d).b;
        linearLayout.getClass();
        CricketEvent cricketEvent = this.e;
        if (cricketEvent == null) {
            Intrinsics.i("event");
            throw null;
        }
        linearLayout.setVisibility((!ok3.D(cricketEvent) || isVisible) ? 8 : 0);
        LinearLayout linearLayout2 = ((gh5) p12Var.l).b;
        linearLayout2.getClass();
        linearLayout2.setVisibility((isVisible || cricketWagonWheelGraphView.getCom.ironsource.U3.a.t java.lang.String() != q14.a) ? 8 : 0);
        TypeHeaderView typeHeaderView = (TypeHeaderView) p12Var.h;
        if (!isVisible && cricketWagonWheelGraphView.getCom.ironsource.U3.a.t java.lang.String() == q14.b) {
            i = 0;
        }
        typeHeaderView.setVisibility(i);
        if (isVisible) {
            cricketWagonWheelGraphView.c();
        }
    }

    private final void setPlayerList(List<Player> list) {
        ((eoh) this.playerList).setValue(list);
    }

    private final void setSelectedPlayer(Player player) {
        ((eoh) this.selectedPlayer).setValue(player);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.cricket_wagon_wheel_view;
    }

    public final void l(CricketEvent cricketEvent) {
        SharedPreferences d;
        this.e = cricketEvent;
        p12 p12Var = this.d;
        int i = 1;
        ((ConstraintLayout) p12Var.b).setClipToOutline(true);
        lqb lqbVar = (lqb) p12Var.k;
        lqbVar.c.setText(getContext().getString(R.string.wagon_wheel));
        ImageView imageView = lqbVar.b;
        imageView.setVisibility(0);
        imageView.setColorFilter(imageView.getContext().getColor(R.color.n_lv_1));
        imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_info));
        int i2 = 2;
        z8e.a0(imageView, 1000L, new ju1(imageView, i2));
        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) p12Var.j;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        k14 k14Var = new k14(this, 1);
        t1h[] t1hVarArr = {new r1h("First", new tc3(-2129144188, new pz3(cricketEvent, i2), true)), new r1h("Second", new tc3(-783389981, new pz3(cricketEvent, 3), true))};
        rlh rlhVar = rlh.b;
        rlhVar.getClass();
        hfe d2 = rlhVar.d();
        o13.w(d2, t1hVarArr);
        b7 d3 = d2.d();
        segmentedButtonsView.k = k14Var;
        segmentedButtonsView.g = false;
        segmentedButtonsView.h = pair;
        segmentedButtonsView.j = v1h.f;
        segmentedButtonsView.i = new z1h(0);
        if (d3 == null) {
            d3 = rlh.b;
        }
        if (!d3.isEmpty()) {
            SegmentedButtonsView.t(segmentedButtonsView, d3, null, 6);
        }
        gh5 gh5Var = (gh5) p12Var.d;
        gh5Var.b.setBackground(null);
        LinearLayout linearLayout = gh5Var.b;
        linearLayout.getClass();
        linearLayout.setVisibility(8);
        gh5Var.d.setText(getContext().getString(R.string.wagon_wheel_data_note));
        gh5Var.c.setVisibility(0);
        gh5 gh5Var2 = (gh5) p12Var.l;
        gh5Var2.b.setBackground(null);
        LinearLayout linearLayout2 = gh5Var2.b;
        linearLayout2.getClass();
        linearLayout2.setVisibility(0);
        gh5Var2.d.setText(getContext().getString(R.string.tap_graph_to_swap));
        gh5Var2.c.setVisibility(0);
        ImageView imageView2 = gh5Var2.c;
        Drawable drawable = getContext().getDrawable(R.drawable.ic_transfer_swap);
        apf a = ajh.a(imageView2.getContext());
        ht9 ht9Var = new ht9(imageView2.getContext());
        ht9Var.c = drawable;
        fc6.w(ht9Var, imageView2, a);
        gh5Var2.c.setColorFilter(getContext().getColor(R.color.secondary_default));
        LinearLayout linearLayout3 = ((gh5) p12Var.l).b;
        linearLayout3.getClass();
        linearLayout3.setVisibility(8);
        kp5<o14> kp5Var = o14.g;
        int i3 = 10;
        ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
        for (o14 o14Var : kp5Var) {
            String str = o14Var.a;
            String string = getContext().getString(o14Var.b);
            string.getClass();
            arrayList.add(new vt2(str, string, false, new tc3(-897510115, new g31(o14Var, i), true), null, null, null, 244));
        }
        g5k g5kVar = new g5k((TypeHeaderView) p12Var.h);
        g5kVar.b = arrayList;
        g5kVar.a();
        g5kVar.m = new ur1(p12Var, i);
        g5kVar.b();
        Context context = getContext();
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        boolean z = sharedPreferences.getBoolean("PREF_WAGON_WHEEL_MODE_DETAILED", false);
        LinearLayout linearLayout4 = ((gh5) p12Var.l).b;
        linearLayout4.getClass();
        linearLayout4.setVisibility(!z ? 0 : 8);
        ((TypeHeaderView) p12Var.h).setVisibility(z ? 0 : 8);
        ((CricketWagonWheelGraphView) p12Var.c).setMode(z ? q14.b : q14.a);
        SwitchView switchView = (SwitchView) p12Var.i;
        switchView.setVisibility(0);
        djf djfVar = switchView.e;
        ((TextView) djfVar.e).setText(switchView.getContext().getString(R.string.cricket_ww_appearance));
        ((TextView) djfVar.g).setText(switchView.getContext().getString(R.string.cricket_ww_detailedgraph));
        djf djfVar2 = switchView.e;
        ((ImageView) djfVar2.d).setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ((ImageView) djfVar2.d).setImageTintList(ColorStateList.valueOf(switchView.getContext().getColor(R.color.surface_2)));
        ((ConstraintLayout) djfVar2.b).setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ((ConstraintLayout) djfVar2.b).setBackgroundTintList(ColorStateList.valueOf(switchView.getContext().getColor(R.color.surface_2)));
        switchView.setSwitchChecked(z);
        switchView.setOnSwitchListener(new r82(i3, switchView, p12Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ff, code lost:
    
        if (r8.intValue() != 1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0275 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Event event, List list) {
        Collection collection;
        String str;
        int i;
        TeamSides teamSides;
        boolean z;
        Integer winnerCode$default;
        l14 l14Var;
        Player batsman;
        Iterator it;
        Iterator it2;
        Object obj;
        String zone;
        list.getClass();
        this.e = (CricketEvent) event;
        ArrayList arrayList = new ArrayList();
        List B0 = CollectionsKt.B0(list);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : B0) {
            Incident.CricketIncident cricketIncident = (Incident.CricketIncident) obj2;
            if (cricketIncident.getBatsman() != null && (zone = cricketIncident.getZone()) != null && zone.length() != 0 && Intrinsics.c(cricketIncident.getScored(), Boolean.TRUE)) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            Boolean valueOf = Boolean.valueOf(((Incident.CricketIncident) next).getBattingTeamId() == Event.getHomeTeam$default(event, null, 1, null).getId());
            Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(valueOf, obj3);
            }
            ((List) obj3).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((Boolean) entry.getKey()).booleanValue() ? TeamSelection.First : TeamSelection.Second, entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(sub.c(linkedHashMap2.size()));
        Iterator it4 = linkedHashMap2.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it4.next();
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Object obj4 : iterable) {
                Player batsman2 = ((Incident.CricketIncident) obj4).getBatsman();
                Integer valueOf2 = Integer.valueOf(batsman2 != null ? batsman2.getId() : -1);
                Object obj5 = linkedHashMap4.get(valueOf2);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap4.put(valueOf2, obj5);
                }
                ((List) obj5).add(obj4);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                kp5 kp5Var = i14.h;
                int c = sub.c(k13.r(kp5Var, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(c);
                for (Object obj6 : kp5Var) {
                    linkedHashMap5.put(obj6, new ArrayList());
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(linkedHashMap5);
                for (Incident.CricketIncident cricketIncident2 : (Iterable) entry3.getValue()) {
                    f7a f7aVar = i14.f;
                    String zone2 = cricketIncident2.getZone();
                    if (zone2 == null) {
                        zone2 = "";
                    }
                    String str2 = zone2;
                    f7aVar.getClass();
                    Iterator<E> it5 = i14.h.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            it2 = it4;
                            obj = null;
                            break;
                        }
                        obj = it5.next();
                        it2 = it4;
                        String lowerCase = ((i14) obj).d.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals(str2)) {
                            break;
                        } else {
                            it4 = it2;
                        }
                    }
                    List list2 = (List) linkedHashMap6.get((i14) obj);
                    if (list2 != null) {
                        list2.add(cricketIncident2);
                    }
                    it4 = it2;
                }
                Iterator it6 = it4;
                if (entry2.getKey() == TeamSelection.First) {
                    i = 1;
                    teamSides = null;
                    Integer winnerCode$default2 = Event.getWinnerCode$default(event, null, 1, null);
                    if (winnerCode$default2 != null) {
                    }
                } else {
                    i = 1;
                    teamSides = null;
                }
                if (entry2.getKey() != TeamSelection.Second || (winnerCode$default = Event.getWinnerCode$default(event, teamSides, i, teamSides)) == null || winnerCode$default.intValue() != 2) {
                    z = false;
                    if (this.k && ok3.C(event) && z) {
                        it = ((Iterable) entry3.getValue()).iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Integer runs = ((Incident.CricketIncident) it.next()).getRuns();
                            i2 += runs != null ? runs.intValue() : 0;
                        }
                        arrayList.add(Integer.valueOf(i2));
                    }
                    Incident.CricketIncident cricketIncident3 = (Incident.CricketIncident) CollectionsKt.firstOrNull((List) entry3.getValue());
                    l14Var = (cricketIncident3 != null || (batsman = cricketIncident3.getBatsman()) == null) ? null : new l14(batsman, linkedHashMap6);
                    if (l14Var == null) {
                        arrayList3.add(l14Var);
                    }
                    it4 = it6;
                }
                z = true;
                if (this.k) {
                    it = ((Iterable) entry3.getValue()).iterator();
                    int i22 = 0;
                    while (it.hasNext()) {
                    }
                    arrayList.add(Integer.valueOf(i22));
                }
                Incident.CricketIncident cricketIncident32 = (Incident.CricketIncident) CollectionsKt.firstOrNull((List) entry3.getValue());
                if (cricketIncident32 != null) {
                }
                if (l14Var == null) {
                }
                it4 = it6;
            }
            linkedHashMap3.put(key, arrayList3);
        }
        if (linkedHashMap3.isEmpty()) {
            return;
        }
        if (ok3.C(event) && this.k && !arrayList.isEmpty()) {
            int indexOf = arrayList.indexOf((Integer) CollectionsKt.k0(arrayList));
            Integer valueOf3 = Integer.valueOf(indexOf);
            if (indexOf < 0) {
                valueOf3 = null;
            }
            this.j = valueOf3 != null ? valueOf3.intValue() : 0;
        }
        LinkedHashMap linkedHashMap7 = this.f;
        linkedHashMap7.clear();
        linkedHashMap7.putAll(linkedHashMap3);
        if (!this.k) {
            r(false);
        } else if ((!linkedHashMap7.isEmpty() ? linkedHashMap7 : null) != null) {
            CricketEvent cricketEvent = this.e;
            if (cricketEvent == null) {
                Intrinsics.i("event");
                throw null;
            }
            String statusType = cricketEvent.getStatusType();
            if (Intrinsics.c(statusType, StatusKt.STATUS_IN_PROGRESS)) {
                CricketEvent cricketEvent2 = this.e;
                if (cricketEvent2 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                Integer currentBattingTeamId = cricketEvent2.getCurrentBattingTeamId();
                CricketEvent cricketEvent3 = this.e;
                if (cricketEvent3 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                int id = Event.getHomeTeam$default(cricketEvent3, null, 1, null).getId();
                if (currentBattingTeamId == null || currentBattingTeamId.intValue() != id) {
                    CricketEvent cricketEvent4 = this.e;
                    if (cricketEvent4 == null) {
                        Intrinsics.i("event");
                        throw null;
                    }
                    int id2 = Event.getAwayTeam$default(cricketEvent4, null, 1, null).getId();
                    if (currentBattingTeamId != null && currentBattingTeamId.intValue() == id2) {
                        str = "Second";
                        q(str);
                    }
                }
                str = "First";
                q(str);
            } else if (Intrinsics.c(statusType, StatusKt.STATUS_FINISHED)) {
                CricketEvent cricketEvent5 = this.e;
                if (cricketEvent5 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                Integer winnerCode$default3 = Event.getWinnerCode$default(cricketEvent5, null, 1, null);
                q(((winnerCode$default3 != null && winnerCode$default3.intValue() == 1) ? TeamSelection.First : TeamSelection.Second).name());
            }
        }
        if (this.k && ((collection = (Collection) linkedHashMap7.get(getSelectedTeam())) == null || collection.isEmpty())) {
            Collection collection2 = (Collection) linkedHashMap7.get(TeamSelection.First);
            if (collection2 == null || collection2.isEmpty()) {
                Collection collection3 = (Collection) linkedHashMap7.get(TeamSelection.Second);
                if (collection3 != null && !collection3.isEmpty()) {
                    q("Second");
                }
            } else {
                q("First");
            }
        }
        this.k = false;
        setVisibility(0);
    }

    public final void q(String str) {
        p12 p12Var = this.d;
        ((SegmentedButtonsView) p12Var.j).q(str, false);
        Collection collection = (Collection) this.f.get(getSelectedTeam());
        if (collection == null || collection.isEmpty()) {
            setEmptyStateVisibility(true);
            ((CricketWagonWheelGraphView) p12Var.c).c();
        } else {
            setEmptyStateVisibility(false);
            r(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView] */
    public final void r(boolean z) {
        ?? r3;
        Player player;
        CricketEvent cricketEvent = this.e;
        Player player2 = null;
        if (cricketEvent == null) {
            Intrinsics.i("event");
            throw null;
        }
        setCurrentBatsmanId(cricketEvent.getCurrentBatsmanId());
        List list = (List) this.f.get(getSelectedTeam());
        if (list != null) {
            r3 = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r3.add(((l14) it.next()).a);
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
                Integer currentBatsmanId = getCurrentBatsmanId();
                if (currentBatsmanId != null && id == currentBatsmanId.intValue()) {
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
        s();
    }

    public final void s() {
        l14 l14Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        String str4;
        List<Player> playerList = getPlayerList();
        playerList.getClass();
        Iterator<Player> it = playerList.iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            Player next = it.next();
            next.getClass();
            Player selectedPlayer = getSelectedPlayer();
            if (selectedPlayer != null && next.getId() == selectedPlayer.getId()) {
                break;
            } else {
                i4++;
            }
        }
        Integer valueOf = i4 == -1 ? null : Integer.valueOf(i4);
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            List list = (List) this.f.get(getSelectedTeam());
            if (list == null) {
                l14Var = null;
            } else if (intValue < 0 || intValue >= list.size()) {
                return;
            } else {
                l14Var = (l14) list.get(intValue);
            }
            if (l14Var != null) {
                LinkedHashMap linkedHashMap = l14Var.b;
                arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    i14 i14Var = (i14) entry.getKey();
                    List<Incident.CricketIncident> list2 = (List) entry.getValue();
                    Iterator it2 = list2.iterator();
                    int i5 = 0;
                    while (it2.hasNext()) {
                        Integer runs = ((Incident.CricketIncident) it2.next()).getRuns();
                        i5 += runs != null ? runs.intValue() : 0;
                    }
                    ArrayList arrayList3 = new ArrayList(k13.r(list2, 10));
                    for (Incident.CricketIncident cricketIncident : list2) {
                        Integer id = cricketIncident.getId();
                        int intValue2 = id != null ? id.intValue() : 0;
                        String incidentClass = cricketIncident.getIncidentClass();
                        if (incidentClass != null) {
                            str4 = incidentClass.toLowerCase(Locale.ROOT);
                            str4.getClass();
                        } else {
                            inb inbVar = o14.d;
                            str4 = "regular";
                        }
                        Integer angle = cricketIncident.getAngle();
                        int intValue3 = angle != null ? angle.intValue() : 0;
                        Integer length = cricketIncident.getLength();
                        arrayList3.add(new n14(intValue2, str4, intValue3, length != null ? length.intValue() : 0));
                    }
                    arrayList.add(new p14(i5, i14Var, arrayList3));
                }
            } else {
                arrayList = null;
            }
            if (l14Var != null) {
                LinkedHashMap linkedHashMap2 = l14Var.b;
                arrayList2 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String n = fc6.n("(", ((i14) entry2.getKey()).d, ") ", ((i14) entry2.getKey()).e);
                    Iterable iterable = (Iterable) entry2.getValue();
                    if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it3 = iterable.iterator();
                        i = 0;
                        while (it3.hasNext()) {
                            String incidentClass2 = ((Incident.CricketIncident) it3.next()).getIncidentClass();
                            inb inbVar2 = o14.d;
                            if (Intrinsics.c(incidentClass2, "4") && (i = i + 1) < 0) {
                                b.p();
                                throw null;
                            }
                        }
                    }
                    Iterable iterable2 = (Iterable) entry2.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator it4 = iterable2.iterator();
                        i2 = 0;
                        while (it4.hasNext()) {
                            String incidentClass3 = ((Incident.CricketIncident) it4.next()).getIncidentClass();
                            inb inbVar3 = o14.d;
                            if (Intrinsics.c(incidentClass3, "6") && (i2 = i2 + 1) < 0) {
                                b.p();
                                throw null;
                            }
                        }
                    }
                    Iterator it5 = ((Iterable) entry2.getValue()).iterator();
                    int i6 = 0;
                    while (it5.hasNext()) {
                        Integer runs2 = ((Incident.CricketIncident) it5.next()).getRuns();
                        i6 += runs2 != null ? runs2.intValue() : 0;
                    }
                    arrayList2.add(new r14(n, i, i2, i6));
                }
            } else {
                arrayList2 = null;
            }
            p12 p12Var = this.d;
            if (arrayList2 != null) {
                LinearLayout linearLayout = (LinearLayout) p12Var.f;
                linearLayout.removeAllViews();
                xbb b = a.b();
                b.addAll(arrayList2);
                Iterator it6 = arrayList2.iterator();
                int i7 = 0;
                while (it6.hasNext()) {
                    i7 += ((r14) it6.next()).b;
                }
                Iterator it7 = arrayList2.iterator();
                int i8 = 0;
                while (it7.hasNext()) {
                    i8 += ((r14) it7.next()).c;
                }
                Iterator it8 = arrayList2.iterator();
                int i9 = 0;
                while (it8.hasNext()) {
                    i9 += ((r14) it8.next()).d;
                }
                b.add(new r14(U3.i.l, i7, i8, i9));
                xbb a = a.a(b);
                List j = b.j(tz3.e, d04.e, b04.e);
                a14 a14Var = new a14(R.string.cricket_zone, null, j);
                p12 d = p12.d(LayoutInflater.from(getContext()), linearLayout);
                ((TextView) d.k).setText(getContext().getString(R.string.cricket_zone));
                TextView textView = (TextView) d.c;
                g04 g04Var = (g04) CollectionsKt.a0(0, j);
                String str5 = "";
                if (g04Var == null || (str = g04Var.a) == null) {
                    str = "";
                }
                textView.setText(str);
                TextView textView2 = (TextView) d.e;
                g04 g04Var2 = (g04) CollectionsKt.a0(1, j);
                if (g04Var2 == null || (str2 = g04Var2.a) == null) {
                    str2 = "";
                }
                textView2.setText(str2);
                TextView textView3 = (TextView) d.f;
                g04 g04Var3 = (g04) CollectionsKt.a0(2, j);
                if (g04Var3 != null && (str3 = g04Var3.a) != null) {
                    str5 = str3;
                }
                textView3.setText(str5);
                TextView[] textViewArr = {(TextView) d.g, (TextView) d.h, (TextView) d.i, (TextView) d.j};
                for (int i10 = 0; i10 < 4; i10++) {
                    TextView textView4 = textViewArr[i10];
                    textView4.getClass();
                    textView4.setVisibility(8);
                }
                linearLayout.addView((ConstraintLayout) d.b);
                ListIterator listIterator = a.listIterator(0);
                while (true) {
                    hc9 hc9Var = (hc9) listIterator;
                    if (!hc9Var.hasNext()) {
                        break;
                    }
                    Object next2 = hc9Var.next();
                    int i11 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw null;
                    }
                    r14 r14Var = (r14) next2;
                    j22 c = j22.c(LayoutInflater.from(getContext()), linearLayout);
                    Context context = getContext();
                    context.getClass();
                    tgj.m(c, context, a14Var);
                    ((TextView) c.p).setText(i3 == a.size() - 1 ? getContext().getString(R.string.total) : r14Var.a);
                    c.d.setText(String.valueOf(r14Var.b));
                    c.e.setText(String.valueOf(r14Var.c));
                    c.f.setText(String.valueOf(r14Var.d));
                    linearLayout.addView(c.b);
                    i3 = i11;
                }
            }
            if (arrayList != null) {
                CricketWagonWheelGraphView cricketWagonWheelGraphView = (CricketWagonWheelGraphView) p12Var.c;
                CricketPlayerInfo cricketPlayerInfo = l14Var.a.getCricketPlayerInfo();
                String batting = cricketPlayerInfo != null ? cricketPlayerInfo.getBatting() : null;
                m14[] m14VarArr = m14.a;
                cricketWagonWheelGraphView.d(arrayList, Intrinsics.c(batting, PlayerKt.PREFERRED_FOOT_RIGHT));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CricketWagonWheelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
