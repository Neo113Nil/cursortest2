package com.sofascore.results.main.matches.redesign.chronologicalmatches;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.common.SwipeRefreshLayoutFixed;
import com.sofascore.results.R;
import com.sofascore.results.main.matches.redesign.chronologicalmatches.ChronologicalMatchesFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import defpackage.a52;
import defpackage.ad2;
import defpackage.au2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.bu2;
import defpackage.du2;
import defpackage.duf;
import defpackage.e52;
import defpackage.e6b;
import defpackage.fc6;
import defpackage.fuf;
import defpackage.g9i;
import defpackage.hkg;
import defpackage.hy1;
import defpackage.joa;
import defpackage.krk;
import defpackage.ku2;
import defpackage.lu2;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.otk;
import defpackage.ox1;
import defpackage.qv5;
import defpackage.r1;
import defpackage.rq3;
import defpackage.u6b;
import defpackage.un0;
import defpackage.w1;
import defpackage.wca;
import defpackage.wt2;
import defpackage.x1;
import defpackage.xw3;
import defpackage.y1;
import defpackage.y7;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zn8;
import defpackage.zqb;
import java.time.Instant;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/chronologicalmatches/ChronologicalMatchesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lzn8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChronologicalMatchesFragment extends Hilt_ChronologicalMatchesFragment<zn8> {
    public final otk r;
    public final otk s;
    public final mqi t;
    public final mqi u;
    public boolean v;

    public ChronologicalMatchesFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        this.r = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new bu2(this, 0), new bu2(this, 2), new bu2(this, 1));
        joa a = ypa.a(ysa.c, new w1(new bu2(this, 3), 25));
        this.s = new otk(fufVar.getOrCreateKotlinClass(ku2.class), new x1(a, 19), new y1(16, this, a), new x1(a, 20));
        this.t = ypa.b(new Function0(this) { // from class: xt2
            public final /* synthetic */ ChronologicalMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                ChronologicalMatchesFragment chronologicalMatchesFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = chronologicalMatchesFragment.requireContext();
                        requireContext.getClass();
                        wt2 wt2Var = new wt2(requireContext);
                        wt2Var.a.d = new kr1(wt2Var, 19);
                        return wt2Var;
                    default:
                        return new lu2(new t21(chronologicalMatchesFragment, 29));
                }
            }
        });
        this.u = ypa.b(new Function0(this) { // from class: xt2
            public final /* synthetic */ ChronologicalMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ChronologicalMatchesFragment chronologicalMatchesFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = chronologicalMatchesFragment.requireContext();
                        requireContext.getClass();
                        wt2 wt2Var = new wt2(requireContext);
                        wt2Var.a.d = new kr1(wt2Var, 19);
                        return wt2Var;
                    default:
                        return new lu2(new t21(chronologicalMatchesFragment, 29));
                }
            }
        });
    }

    public final wt2 C() {
        return (wt2) this.t.getValue();
    }

    public final lu2 D() {
        return (lu2) this.u.getValue();
    }

    public final ku2 E() {
        return (ku2) this.s.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_chronological_matches, (ViewGroup) null, false);
        int i = R.id.chronological_matches_list;
        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.chronological_matches_list, inflate);
        if (recyclerView != null) {
            i = R.id.empty_state;
            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_state, inflate);
            if (graphicLarge != null) {
                i = R.id.progress_section;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) nq8.B(R.id.progress_section, inflate);
                if (circularProgressIndicator != null) {
                    SwipeRefreshLayoutFixed swipeRefreshLayoutFixed = (SwipeRefreshLayoutFixed) inflate;
                    return new zn8(recyclerView, circularProgressIndicator, swipeRefreshLayoutFixed, swipeRefreshLayoutFixed, graphicLarge);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MatchesNotLiveDateNestedTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        this.i.c = "chronological";
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayoutFixed swipeRefreshLayoutFixed = ((zn8) krkVar).e;
        swipeRefreshLayoutFixed.getClass();
        rq3 rq3Var = null;
        AbstractFragment.v(this, swipeRefreshLayoutFixed, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((zn8) krkVar2).c.setVisibility(8);
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(e52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        int i = 7;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new au2(viewLifecycleOwner, (b1d) obj, this, null, this, 0), 3);
        e6b e6bVar2 = e6b.a;
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(a52.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(viewLifecycleOwner2.getLifecycle()), null, null, new au2(viewLifecycleOwner2, (b1d) obj2, this, null, this, 1), 3);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView = ((zn8) krkVar3).b;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 22);
        hkg.t(48, recyclerView);
        recyclerView.setAdapter(C());
        recyclerView.addOnScrollListener(D());
        ((zqb) this.r.getValue()).m.e(getViewLifecycleOwner(), new y7(9, new ox1(this, 18)));
        z8e.y(this, E().r, new r1(this, rq3Var, i));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        n();
        if (((du2) E().r.a.getValue()).a && fc6.B(fc6.t(Instant.ofEpochSecond(E().h)))) {
            ku2 E = E();
            g9i g9iVar = E.v;
            rq3 rq3Var = null;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            E.v = xw3.L(un0.z(E), null, null, new hy1(E, rq3Var, 13), 3);
        }
    }
}
