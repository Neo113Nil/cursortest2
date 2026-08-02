package com.sofascore.results.fantasy.competition.fixtures;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a52;
import defpackage.ad2;
import defpackage.ao2;
import defpackage.ay5;
import defpackage.b1d;
import defpackage.beh;
import defpackage.cq6;
import defpackage.duf;
import defpackage.e6b;
import defpackage.fi5;
import defpackage.joa;
import defpackage.k0;
import defpackage.k6b;
import defpackage.krk;
import defpackage.mp1;
import defpackage.nq8;
import defpackage.otk;
import defpackage.qv5;
import defpackage.r1;
import defpackage.r68;
import defpackage.rq3;
import defpackage.s16;
import defpackage.sp6;
import defpackage.t06;
import defpackage.tc3;
import defpackage.tp6;
import defpackage.u1;
import defpackage.u6b;
import defpackage.up6;
import defpackage.wca;
import defpackage.xp6;
import defpackage.xw3;
import defpackage.y7;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yso;
import defpackage.z8e;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\r²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/competition/fixtures/FantasyCompetitionFixturesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lr68;", "<init>", "()V", "Lq68;", "fdrData", "Ls68;", "filters", "Lfo1;", "selectedRound", "Lgy6;", "selectedTab", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyCompetitionFixturesFragment extends Hilt_FantasyCompetitionFixturesFragment<r68> {
    public final otk r;
    public final joa s;
    public final LinkedHashMap t;
    public final joa u;
    public final joa v;
    public final joa w;
    public MenuItem x;
    public boolean y;

    public FantasyCompetitionFixturesFragment() {
        t06 t06Var = new t06(this, 15);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new t06(t06Var, 16));
        this.r = new otk(duf.a.getOrCreateKotlinClass(cq6.class), new ay5(a, 29), new fi5(this, a, 18), new xp6(a, 0));
        this.s = ypa.a(ysaVar, new tp6(this, 0));
        this.t = new LinkedHashMap();
        this.u = ypa.a(ysaVar, new tp6(this, 2));
        this.v = ypa.a(ysaVar, new tp6(this, 3));
        this.w = ypa.a(ysaVar, new tp6(this, 4));
    }

    public final sp6 C() {
        return (sp6) this.s.getValue();
    }

    public final cq6 D() {
        return (cq6) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fixtures_fdr_fragment_layout, (ViewGroup) null, false);
        int i = R.id.compose_view;
        ComposeView composeView = (ComposeView) nq8.B(R.id.compose_view, inflate);
        if (composeView != null) {
            i = R.id.floating_header_container;
            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.floating_header_container, inflate);
            if (frameLayout != null) {
                i = R.id.progress_bar;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) nq8.B(R.id.progress_bar, inflate);
                if (circularProgressIndicator != null) {
                    i = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                    if (recyclerView != null) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                        return new r68(swipeRefreshLayout, composeView, frameLayout, circularProgressIndicator, recyclerView, swipeRefreshLayout);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "FixturesTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        k0 k0Var = new k0(this, 6);
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        requireActivity.addMenuProvider(k0Var, viewLifecycleOwner, e6b.e);
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((r68) krkVar).f;
        swipeRefreshLayout.getClass();
        rq3 rq3Var = null;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        this.i.b = D().h.c.d.getAnalyticsName();
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        final int i = 0;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        k6b x = wca.x(viewLifecycleOwner2.getLifecycle());
        u1 u1Var = new u1(viewLifecycleOwner2, (b1d) obj, this, (rq3) null, this);
        int i2 = 3;
        xw3.L(x, null, null, u1Var, 3);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((r68) krkVar2).e;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        recyclerView.setAdapter(C());
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext2), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        krk krkVar3 = this.l;
        krkVar3.getClass();
        final int i3 = 1;
        ((r68) krkVar3).b.setContent(new tc3(-1159096841, new Function2(this) { // from class: wp6
            public final /* synthetic */ FantasyCompetitionFixturesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i4 = i3;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i4) {
                    case 0:
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = this.b;
                            e1d x2 = rfo.x(fantasyCompetitionFixturesFragment.D().n, av8Var, 0);
                            e1d x3 = rfo.x(fantasyCompetitionFixturesFragment.D().o, av8Var, 0);
                            e1d x4 = rfo.x(fantasyCompetitionFixturesFragment.D().p, av8Var, 0);
                            s68 s68Var = (s68) x2.getValue();
                            if (s68Var == null) {
                                av8Var.d0(-2094785073);
                                av8Var.s(false);
                            } else {
                                av8Var.d0(-2094785072);
                                fo1 fo1Var = (fo1) x3.getValue();
                                if (fo1Var == null) {
                                    av8Var.d0(1879468596);
                                    av8Var.s(false);
                                } else {
                                    av8Var.d0(1879468597);
                                    haa.f(yqo.H(1048476902, av8Var, new ace(fantasyCompetitionFixturesFragment, s68Var, fo1Var, x4, 17)), av8Var, 6);
                                    av8Var.s(false);
                                }
                                av8Var.s(false);
                            }
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        av8 av8Var2 = (av8) of3Var;
                        if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                            FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment2 = this.b;
                            haa.f(yqo.H(2097326492, av8Var2, new vp6(fantasyCompetitionFixturesFragment2, rfo.x(fantasyCompetitionFixturesFragment2.D().l, av8Var2, 0))), av8Var2, 6);
                        } else {
                            av8Var2.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true));
        ComposeView s = yso.s(this, new tc3(1709497065, new Function2(this) { // from class: wp6
            public final /* synthetic */ FantasyCompetitionFixturesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i4 = i;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i4) {
                    case 0:
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = this.b;
                            e1d x2 = rfo.x(fantasyCompetitionFixturesFragment.D().n, av8Var, 0);
                            e1d x3 = rfo.x(fantasyCompetitionFixturesFragment.D().o, av8Var, 0);
                            e1d x4 = rfo.x(fantasyCompetitionFixturesFragment.D().p, av8Var, 0);
                            s68 s68Var = (s68) x2.getValue();
                            if (s68Var == null) {
                                av8Var.d0(-2094785073);
                                av8Var.s(false);
                            } else {
                                av8Var.d0(-2094785072);
                                fo1 fo1Var = (fo1) x3.getValue();
                                if (fo1Var == null) {
                                    av8Var.d0(1879468596);
                                    av8Var.s(false);
                                } else {
                                    av8Var.d0(1879468597);
                                    haa.f(yqo.H(1048476902, av8Var, new ace(fantasyCompetitionFixturesFragment, s68Var, fo1Var, x4, 17)), av8Var, 6);
                                    av8Var.s(false);
                                }
                                av8Var.s(false);
                            }
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        av8 av8Var2 = (av8) of3Var;
                        if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                            FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment2 = this.b;
                            haa.f(yqo.H(2097326492, av8Var2, new vp6(fantasyCompetitionFixturesFragment2, rfo.x(fantasyCompetitionFixturesFragment2.D().l, av8Var2, 0))), av8Var2, 6);
                        } else {
                            av8Var2.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true));
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((r68) krkVar4).c.addView(s);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((r68) krkVar5).c.setElevation(getResources().getDimension(R.dimen.header_elevation));
        sp6 C = C();
        s16 s16Var = new s16(this, 9);
        C.getClass();
        C.a.d = s16Var;
        z8e.y(this, D().p, new r1(this, rq3Var, 25));
        z8e.y(this, D().q, new mp1(this, rq3Var, i2));
        D().j.e(getViewLifecycleOwner(), new y7(24, new up6(this, i2)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        D().m();
    }
}
