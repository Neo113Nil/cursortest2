package com.sofascore.results.event.games;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.ESportMap;
import com.sofascore.model.newNetwork.EsportsGame;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.ajh;
import defpackage.apf;
import defpackage.as9;
import defpackage.awj;
import defpackage.ay5;
import defpackage.bg5;
import defpackage.ce4;
import defpackage.cg5;
import defpackage.dg5;
import defpackage.duf;
import defpackage.fg5;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.fv2;
import defpackage.fz5;
import defpackage.g7;
import defpackage.gg5;
import defpackage.gz5;
import defpackage.ht9;
import defpackage.hz5;
import defpackage.iz5;
import defpackage.j63;
import defpackage.joa;
import defpackage.km5;
import defpackage.krk;
import defpackage.mqi;
import defpackage.mr5;
import defpackage.nd2;
import defpackage.nt9;
import defpackage.nz5;
import defpackage.oo8;
import defpackage.otk;
import defpackage.p12;
import defpackage.pco;
import defpackage.ph0;
import defpackage.rfo;
import defpackage.rlh;
import defpackage.rq3;
import defpackage.sl6;
import defpackage.st9;
import defpackage.tol;
import defpackage.u6b;
import defpackage.un0;
import defpackage.v1h;
import defpackage.v82;
import defpackage.vqg;
import defpackage.vt9;
import defpackage.vu2;
import defpackage.wnn;
import defpackage.wt9;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/games/EventEsportsGamesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventEsportsGamesFragment extends Hilt_EventEsportsGamesFragment<oo8> {
    public final otk r;
    public final otk s;
    public final mqi t;
    public final mqi u;
    public final mqi v;
    public final mqi w;
    public final mqi x;
    public final mqi y;
    public final mqi z;

    public EventEsportsGamesFragment() {
        joa a = ypa.a(ysa.c, new j63(new iz5(this, 3), 29));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(nz5.class), new ay5(a, 3), new fi5(this, a, 5), new ay5(a, 4));
        this.s = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new iz5(this, 0), new iz5(this, 2), new iz5(this, 1));
        this.t = ypa.b(new gz5(this, 2));
        this.u = ypa.b(new gz5(this, 3));
        this.v = ypa.b(new gz5(this, 4));
        this.w = ypa.b(new gz5(this, 5));
        this.x = ypa.b(new gz5(this, 6));
        this.y = ypa.b(new gz5(this, 7));
        this.z = ypa.b(new gz5(this, 0));
    }

    public final fz5 C() {
        return (fz5) this.t.getValue();
    }

    public final Event D() {
        Object d = ((mr5) this.s.getValue()).v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    public final EsportsGame E() {
        List list = (List) G().h.d();
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int id = ((EsportsGame) next).getId();
            Integer num = ((mr5) this.s.getValue()).L;
            if (num != null && id == num.intValue()) {
                obj = next;
                break;
            }
        }
        return (EsportsGame) obj;
    }

    public final int F() {
        Integer M;
        List list = (List) G().h.d();
        int i = 0;
        if (list != null && (M = z8e.M(list, new hz5(this, i))) != null) {
            return M.intValue();
        }
        if (((List) G().h.d()) != null) {
            return r3.size() - 1;
        }
        return 0;
    }

    public final nz5 G() {
        return (nz5) this.r.getValue();
    }

    public final void H(int i) {
        EsportsGame esportsGame;
        boolean z;
        String str;
        nt9 a;
        nt9 a2;
        List list = (List) G().h.d();
        if (list == null || (esportsGame = (EsportsGame) CollectionsKt.a0(i, list)) == null) {
            return;
        }
        ((mr5) this.s.getValue()).L = Integer.valueOf(esportsGame.getId());
        ((GraphicLarge) this.z.getValue()).setVisibility(8);
        ArrayList arrayList = C().g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(((View) next) instanceof SegmentedButtonsView)) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(8);
        }
        Iterator it3 = C().h.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setVisibility(8);
        }
        C().F(km5.a);
        fg5 fg5Var = (fg5) this.v.getValue();
        final Event D = D();
        fg5Var.getClass();
        Integer valueOf = Integer.valueOf(R.color.neutral_default);
        fg5Var.g = D;
        fg5Var.h = esportsGame;
        p12 p12Var = fg5Var.d;
        final ImageView imageView = (ImageView) p12Var.e;
        ConstraintLayout constraintLayout = (ConstraintLayout) p12Var.b;
        ImageView imageView2 = (ImageView) p12Var.d;
        final int i2 = 1;
        String R = pco.R(Event.getHomeTeam$default(D, null, 1, null).getId());
        apf a3 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = R;
        vt9.f(ht9Var, imageView);
        awj[] awjVarArr = {new vu2()};
        sl6 sl6Var = st9.a;
        st9.b(ht9Var, ph0.X(awjVarArr));
        Context context = imageView.getContext();
        context.getClass();
        wt9 I = rfo.I(imageView);
        z8e.Q(ht9Var, context, R.drawable.team_logo_placeholder, (I == null || (a2 = I.a()) == null) ? null : a2.e, valueOf);
        a3.a(ht9Var.a());
        if (!Event.getHomeTeam$default(D, null, 1, null).getDisabled()) {
            final int i3 = 0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: eg5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i3;
                    Event event = D;
                    ImageView imageView3 = imageView;
                    switch (i4) {
                        case 0:
                            int i5 = TeamActivity.Z;
                            Context context2 = imageView3.getContext();
                            context2.getClass();
                            jle.r(context2, Event.getHomeTeam$default(event, null, 1, null).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            break;
                        default:
                            int i6 = TeamActivity.Z;
                            Context context3 = imageView3.getContext();
                            context3.getClass();
                            jle.r(context3, Event.getAwayTeam$default(event, null, 1, null).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            break;
                    }
                }
            });
        }
        final ImageView imageView3 = (ImageView) p12Var.k;
        String R2 = pco.R(Event.getAwayTeam$default(D, null, 1, null).getId());
        apf a4 = ajh.a(imageView3.getContext());
        ht9 ht9Var2 = new ht9(imageView3.getContext());
        ht9Var2.c = R2;
        vt9.f(ht9Var2, imageView3);
        st9.b(ht9Var2, ph0.X(new awj[]{new vu2()}));
        Context context2 = imageView3.getContext();
        context2.getClass();
        wt9 I2 = rfo.I(imageView3);
        z8e.Q(ht9Var2, context2, R.drawable.team_logo_placeholder, (I2 == null || (a = I2.a()) == null) ? null : a.e, valueOf);
        a4.a(ht9Var2.a());
        if (!Event.getAwayTeam$default(D, null, 1, null).getDisabled()) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: eg5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i2;
                    Event event = D;
                    ImageView imageView32 = imageView3;
                    switch (i4) {
                        case 0:
                            int i5 = TeamActivity.Z;
                            Context context22 = imageView32.getContext();
                            context22.getClass();
                            jle.r(context22, Event.getHomeTeam$default(event, null, 1, null).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            break;
                        default:
                            int i6 = TeamActivity.Z;
                            Context context3 = imageView32.getContext();
                            context3.getClass();
                            jle.r(context3, Event.getAwayTeam$default(event, null, 1, null).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            break;
                    }
                }
            });
        }
        View view = p12Var.g;
        Context context3 = fg5Var.getContext();
        context3.getClass();
        Integer F = wnn.F(esportsGame, context3);
        view.setBackgroundColor(F != null ? F.intValue() : 0);
        View view2 = (View) p12Var.l;
        Context context4 = fg5Var.getContext();
        context4.getClass();
        Integer D2 = wnn.D(esportsGame, context4);
        view2.setBackgroundColor(D2 != null ? D2.intValue() : 0);
        switch (D.getTournament().getCategory().getId()) {
            case 1570:
                z = false;
                as9.h(imageView2, R.drawable.dota_map);
                break;
            case 1571:
                z = false;
                as9.h(imageView2, R.drawable.lol_map);
                break;
            case 1572:
                ESportMap map = esportsGame.getMap();
                if (map != null) {
                    int id = map.getId();
                    constraintLayout.getLayoutParams().height = fg5Var.f;
                    as9.i(imageView2, pco.F() + "map/" + id + "/image");
                } else {
                    constraintLayout.getLayoutParams().height = fg5Var.e;
                    as9.i(imageView2, gg5.a);
                }
                if (EsportsGame.getHomeTeamStartingSide$default(esportsGame, null, 1, null) != null) {
                    TextView textView = (TextView) p12Var.c;
                    textView.setVisibility(0);
                    Drawable mutate = textView.getBackground().mutate();
                    Context context5 = textView.getContext();
                    context5.getClass();
                    Integer F2 = wnn.F(esportsGame, context5);
                    mutate.setTint(F2 != null ? F2.intValue() : textView.getContext().getColor(R.color.n_lv_1));
                    Integer homeTeamStartingSide$default = EsportsGame.getHomeTeamStartingSide$default(esportsGame, null, 1, null);
                    String str2 = "";
                    if (homeTeamStartingSide$default != null) {
                        int intValue = homeTeamStartingSide$default.intValue();
                        bg5[] bg5VarArr = bg5.c;
                        str = intValue == 4 ? "T" : "CT";
                    } else {
                        str = "";
                    }
                    textView.setText(str);
                    TextView textView2 = (TextView) p12Var.j;
                    z = false;
                    textView2.setVisibility(0);
                    Drawable mutate2 = textView2.getBackground().mutate();
                    Context context6 = textView2.getContext();
                    context6.getClass();
                    Integer D3 = wnn.D(esportsGame, context6);
                    mutate2.setTint(D3 != null ? D3.intValue() : textView2.getContext().getColor(R.color.n_lv_1));
                    Integer homeTeamStartingSide$default2 = EsportsGame.getHomeTeamStartingSide$default(esportsGame, null, 1, null);
                    if (homeTeamStartingSide$default2 != null) {
                        int intValue2 = homeTeamStartingSide$default2.intValue();
                        bg5[] bg5VarArr2 = bg5.c;
                        str2 = intValue2 == 4 ? "CT" : "T";
                    }
                    textView2.setText(str2);
                    break;
                }
            default:
                z = false;
                break;
        }
        v82 v82Var = (v82) p12Var.h;
        Context context7 = fg5Var.getContext();
        context7.getClass();
        tol.x(v82Var, context7, esportsGame, D.getTournament().getCategory().getId() == 1572 ? true : z, true);
        G().k(esportsGame);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int F = F();
        mqi mqiVar = this.u;
        if (((SegmentedButtonsView) mqiVar.getValue()).getSelectedIndex() != F) {
            ((SegmentedButtonsView) mqiVar.getValue()).setSelectedIndex(F);
            H(F);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "GamesTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        int i = 1;
        recyclerView.setHasFixedSize(true);
        mqi mqiVar = this.u;
        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) mqiVar.getValue();
        segmentedButtonsView.getClass();
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        vqg vqgVar = new vqg(29);
        segmentedButtonsView.k = new fv2(this, 18);
        segmentedButtonsView.g = false;
        segmentedButtonsView.h = pair;
        segmentedButtonsView.j = v1h.f;
        segmentedButtonsView.i = vqgVar;
        rlh rlhVar = rlh.b;
        if (!rlhVar.isEmpty()) {
            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
        }
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((oo8) krkVar3).d.setAdapter(C());
        r9.p(C().g.size(), (SegmentedButtonsView) mqiVar.getValue());
        r8.p(C().g.size(), (fg5) this.v.getValue());
        r8.p(C().g.size(), (nd2) this.w.getValue());
        r8.p(C().g.size(), (dg5) this.x.getValue());
        g7.o(C(), (cg5) this.y.getValue(), 6);
        g7.o(C(), (GraphicLarge) this.z.getValue(), 6);
        nz5 G = G();
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        G.g(viewLifecycleOwner, new gz5(this, 1));
        G().h.e(getViewLifecycleOwner(), new z1(10, new hz5(this, i)));
        G().j.e(getViewLifecycleOwner(), new z1(10, new hz5(this, 2)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        nz5 G = G();
        xw3.L(un0.z(G), null, null, new ce4(G, D(), (rq3) null, 13), 3);
        EsportsGame E = E();
        if (E != null) {
            G().k(E);
        }
    }
}
