package com.sofascore.results.event.graphs;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView;
import com.sofascore.results.event.graphs.view.CricketBowlerView;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import defpackage.a70;
import defpackage.ay5;
import defpackage.b7;
import defpackage.bv1;
import defpackage.duf;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.hfe;
import defpackage.hz3;
import defpackage.iz3;
import defpackage.joa;
import defpackage.ju1;
import defpackage.krk;
import defpackage.kz3;
import defpackage.lqb;
import defpackage.mo8;
import defpackage.mr5;
import defpackage.nq8;
import defpackage.o13;
import defpackage.otk;
import defpackage.ph0;
import defpackage.pz3;
import defpackage.r1h;
import defpackage.rlh;
import defpackage.s06;
import defpackage.t06;
import defpackage.t1h;
import defpackage.tc3;
import defpackage.un0;
import defpackage.v06;
import defpackage.v1h;
import defpackage.w06;
import defpackage.xw3;
import defpackage.y7;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1h;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/graphs/EventGraphsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lmo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventGraphsFragment extends Hilt_EventGraphsFragment<mo8> {
    public final otk r;
    public final otk s;

    public EventGraphsFragment() {
        joa a = ypa.a(ysa.c, new t06(new s06(this, 3), 0));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(w06.class), new ay5(a, 5), new fi5(this, a, 6), new ay5(a, 6));
        this.s = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new s06(this, 0), new s06(this, 2), new s06(this, 1));
    }

    public final CricketEvent C() {
        Object d = ((mr5) this.s.getValue()).v.d();
        if (d == null) {
            a70.r("Required value was null.");
            return null;
        }
        Event event = (Event) d;
        if (event instanceof CricketEvent) {
            return (CricketEvent) event;
        }
        a70.p("Failed requirement.");
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_graphs_layout, (ViewGroup) null, false);
        int i = R.id.bowler_graph_view;
        CricketBowlerView cricketBowlerView = (CricketBowlerView) nq8.B(R.id.bowler_graph_view, inflate);
        if (cricketBowlerView != null) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
            CricketWagonWheelView cricketWagonWheelView = (CricketWagonWheelView) nq8.B(R.id.wagon_wheel_view, inflate);
            if (cricketWagonWheelView != null) {
                return new mo8(swipeRefreshLayout, cricketBowlerView, swipeRefreshLayout, cricketWagonWheelView);
            }
            i = R.id.wagon_wheel_view;
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "GraphsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((mo8) krkVar).c;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((mo8) krkVar2).d.l(C());
        krk krkVar3 = this.l;
        krkVar3.getClass();
        final CricketBowlerView cricketBowlerView = ((mo8) krkVar3).b;
        CricketEvent C = C();
        cricketBowlerView.e = C;
        bv1 bv1Var = cricketBowlerView.d;
        ((ConstraintLayout) bv1Var.b).setClipToOutline(true);
        lqb lqbVar = (lqb) bv1Var.j;
        lqbVar.c.setText(cricketBowlerView.getContext().getString(R.string.bowler_graph));
        ImageView imageView = lqbVar.b;
        final int i = 0;
        imageView.setVisibility(0);
        imageView.setColorFilter(imageView.getContext().getColor(R.color.n_lv_1));
        imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_info));
        z8e.a0(imageView, 1000L, new ju1(imageView, 1));
        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) bv1Var.h;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        iz3 iz3Var = new iz3(cricketBowlerView, 1);
        t1h[] t1hVarArr = {new r1h("First", new tc3(-2086800183, new pz3(C, 0), true)), new r1h("Second", new tc3(872793384, new pz3(C, 1), true))};
        rlh rlhVar = rlh.b;
        rlhVar.getClass();
        hfe d = rlhVar.d();
        o13.w(d, t1hVarArr);
        b7 d2 = d.d();
        segmentedButtonsView.k = iz3Var;
        segmentedButtonsView.g = false;
        segmentedButtonsView.h = pair;
        segmentedButtonsView.j = v1h.f;
        segmentedButtonsView.i = new z1h(0);
        if (d2 == null) {
            d2 = rlh.b;
        }
        if (!d2.isEmpty()) {
            SegmentedButtonsView.t(segmentedButtonsView, d2, null, 6);
        }
        hz3 hz3Var = (hz3) bv1Var.f;
        hz3Var.d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: lz3
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = i;
                CricketBowlerView cricketBowlerView2 = cricketBowlerView;
                switch (i10) {
                    case 0:
                        int i11 = CricketBowlerView.n;
                        if (view2.getWidth() != i8 - i6) {
                            cricketBowlerView2.l = true;
                            break;
                        }
                        break;
                    default:
                        int i12 = CricketBowlerView.n;
                        if (view2.getWidth() != i8 - i6 || cricketBowlerView2.l) {
                            cricketBowlerView2.s(false);
                            cricketBowlerView2.l = false;
                            break;
                        }
                        break;
                }
            }
        });
        hz3 hz3Var2 = (hz3) bv1Var.e;
        hz3Var2.d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: lz3
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = r2;
                CricketBowlerView cricketBowlerView2 = cricketBowlerView;
                switch (i10) {
                    case 0:
                        int i11 = CricketBowlerView.n;
                        if (view2.getWidth() != i8 - i6) {
                            cricketBowlerView2.l = true;
                            break;
                        }
                        break;
                    default:
                        int i12 = CricketBowlerView.n;
                        if (view2.getWidth() != i8 - i6 || cricketBowlerView2.l) {
                            cricketBowlerView2.s(false);
                            cricketBowlerView2.l = false;
                            break;
                        }
                        break;
                }
            }
        });
        r4 = cricketBowlerView.getResources().getConfiguration().getLayoutDirection() != 1 ? 0 : 1;
        String string = cricketBowlerView.getContext().getString(R.string.bowler_graph_off);
        string.getClass();
        String string2 = cricketBowlerView.getContext().getString(R.string.bowler_graph_leg);
        string2.getClass();
        hz3Var.h.setText(r4 != 0 ? string2 : string);
        hz3Var.i.setText(r4 != 0 ? string : string2);
        hz3Var2.h.setText(r4 != 0 ? string : string2);
        TextView textView = hz3Var2.i;
        if (r4 != 0) {
            string = string2;
        }
        textView.setText(string);
        for (hz3 hz3Var3 : ph0.a0(new hz3[]{hz3Var, hz3Var2})) {
            hz3Var3.j.c.setText(cricketBowlerView.getContext().getString(R.string.cricket_yorker));
            hz3Var3.e.c.setText(cricketBowlerView.getContext().getString(R.string.cricket_full));
            hz3Var3.f.c.setText(cricketBowlerView.getContext().getString(R.string.cricket_good));
            hz3Var3.g.c.setText(cricketBowlerView.getContext().getString(R.string.cricket_short));
        }
        ((w06) this.r.getValue()).g.e(getViewLifecycleOwner(), new y7(16, new kz3(this, 29)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        w06 w06Var = (w06) this.r.getValue();
        xw3.L(un0.z(w06Var), null, null, new v06(w06Var, C(), null), 3);
    }
}
