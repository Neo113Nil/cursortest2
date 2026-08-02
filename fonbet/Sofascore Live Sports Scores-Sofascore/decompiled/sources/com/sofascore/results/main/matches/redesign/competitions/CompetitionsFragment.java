package com.sofascore.results.main.matches.redesign.competitions;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import com.sofascore.results.main.tutorial.CompetitionsIntroModal;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a5f;
import defpackage.ad2;
import defpackage.ao2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.ca3;
import defpackage.csk;
import defpackage.duf;
import defpackage.e52;
import defpackage.e6b;
import defpackage.ea3;
import defpackage.eca;
import defpackage.fa3;
import defpackage.ha3;
import defpackage.hkg;
import defpackage.i1g;
import defpackage.j63;
import defpackage.jk;
import defpackage.joa;
import defpackage.k43;
import defpackage.krk;
import defpackage.la3;
import defpackage.mqi;
import defpackage.nl2;
import defpackage.oo8;
import defpackage.otk;
import defpackage.qrf;
import defpackage.qv5;
import defpackage.r1;
import defpackage.rq3;
import defpackage.u1;
import defpackage.u6b;
import defpackage.uic;
import defpackage.un0;
import defpackage.wca;
import defpackage.x1;
import defpackage.xw3;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/competitions/CompetitionsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompetitionsFragment extends Hilt_CompetitionsFragment<oo8> {
    public final otk r;
    public final mqi s;
    public final mqi t;
    public final eca u;
    public final joa v;

    public CompetitionsFragment() {
        final int i = 1;
        j63 j63Var = new j63(this, i);
        ysa ysaVar = ysa.c;
        final int i2 = 2;
        joa a = ypa.a(ysaVar, new j63(j63Var, i2));
        this.r = new otk(duf.a.getOrCreateKotlinClass(la3.class), new x1(a, 27), new y1(20, this, a), new x1(a, 28));
        final int i3 = 0;
        this.s = ypa.b(new Function0(this) { // from class: da3
            public final /* synthetic */ CompetitionsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                CompetitionsFragment competitionsFragment = this.b;
                switch (i4) {
                    case 0:
                        Calendar calendar = ke0.a;
                        Context requireContext = competitionsFragment.requireContext();
                        requireContext.getClass();
                        return ke0.b(requireContext);
                    case 1:
                        Context requireContext2 = competitionsFragment.requireContext();
                        requireContext2.getClass();
                        ca3 ca3Var = new ca3(requireContext2, new i43(1, competitionsFragment.D(), la3.class, "pinnedLeagueInteraction", "pinnedLeagueInteraction(IIZ)V", 0, 2), new ox1(competitionsFragment, 24));
                        ca3Var.a.d = new hl6(20, ca3Var, competitionsFragment);
                        ca3Var.N(0);
                        return ca3Var;
                    default:
                        int i5 = i1g.b;
                        Context requireContext3 = competitionsFragment.requireContext();
                        requireContext3.getClass();
                        Context applicationContext = requireContext3.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = requireContext3.getResources();
                        i1g i1gVar = new i1g(applicationContext);
                        i1gVar.a = resources;
                        return i1gVar;
                }
            }
        });
        this.t = ypa.b(new Function0(this) { // from class: da3
            public final /* synthetic */ CompetitionsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                CompetitionsFragment competitionsFragment = this.b;
                switch (i4) {
                    case 0:
                        Calendar calendar = ke0.a;
                        Context requireContext = competitionsFragment.requireContext();
                        requireContext.getClass();
                        return ke0.b(requireContext);
                    case 1:
                        Context requireContext2 = competitionsFragment.requireContext();
                        requireContext2.getClass();
                        ca3 ca3Var = new ca3(requireContext2, new i43(1, competitionsFragment.D(), la3.class, "pinnedLeagueInteraction", "pinnedLeagueInteraction(IIZ)V", 0, 2), new ox1(competitionsFragment, 24));
                        ca3Var.a.d = new hl6(20, ca3Var, competitionsFragment);
                        ca3Var.N(0);
                        return ca3Var;
                    default:
                        int i5 = i1g.b;
                        Context requireContext3 = competitionsFragment.requireContext();
                        requireContext3.getClass();
                        Context applicationContext = requireContext3.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = requireContext3.getResources();
                        i1g i1gVar = new i1g(applicationContext);
                        i1gVar.a = resources;
                        return i1gVar;
                }
            }
        });
        this.u = new eca(new ea3(this));
        this.v = ypa.a(ysaVar, new Function0(this) { // from class: da3
            public final /* synthetic */ CompetitionsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                CompetitionsFragment competitionsFragment = this.b;
                switch (i4) {
                    case 0:
                        Calendar calendar = ke0.a;
                        Context requireContext = competitionsFragment.requireContext();
                        requireContext.getClass();
                        return ke0.b(requireContext);
                    case 1:
                        Context requireContext2 = competitionsFragment.requireContext();
                        requireContext2.getClass();
                        ca3 ca3Var = new ca3(requireContext2, new i43(1, competitionsFragment.D(), la3.class, "pinnedLeagueInteraction", "pinnedLeagueInteraction(IIZ)V", 0, 2), new ox1(competitionsFragment, 24));
                        ca3Var.a.d = new hl6(20, ca3Var, competitionsFragment);
                        ca3Var.N(0);
                        return ca3Var;
                    default:
                        int i5 = i1g.b;
                        Context requireContext3 = competitionsFragment.requireContext();
                        requireContext3.getClass();
                        Context applicationContext = requireContext3.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = requireContext3.getResources();
                        i1g i1gVar = new i1g(applicationContext);
                        i1gVar.a = resources;
                        return i1gVar;
                }
            }
        });
    }

    public final ca3 C() {
        return (ca3) this.t.getValue();
    }

    public final la3 D() {
        return (la3) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((i1g) this.v.getValue()).a = null;
        super.onDestroyView();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        SharedPreferences d;
        super.onResume();
        Context requireContext = requireContext();
        requireContext.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = requireContext.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        if (sharedPreferences.getBoolean("PREF_SHOW_LEAGUES_INTRO_BOTTOM_SHEET", true)) {
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            CompetitionsIntroModal competitionsIntroModal = new CompetitionsIntroModal();
            if (requireContext2 instanceof csk) {
                requireContext2 = ((csk) requireContext2).getBaseContext();
            }
            rq3 rq3Var = null;
            AppCompatActivity appCompatActivity = requireContext2 instanceof AppCompatActivity ? (AppCompatActivity) requireContext2 : null;
            if (appCompatActivity != null) {
                wca.x(appCompatActivity.getLifecycle()).b(new r1(competitionsIntroModal, appCompatActivity, rq3Var, 3));
            }
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "LeaguesNestedTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        this.i.b = (String) this.s.getValue();
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(e52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        int i = 0;
        rq3 rq3Var = null;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new u1(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this), 3);
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((oo8) krkVar2).c.setVisibility(0);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        final RecyclerView recyclerView = ((oo8) krkVar3).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(8, requireContext2), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment$onViewCreate$2$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            public final void smoothScrollToPosition(RecyclerView recyclerView2, qrf qrfVar, int i2) {
                recyclerView2.getClass();
                qrfVar.getClass();
                nl2 nl2Var = new nl2(RecyclerView.this.getContext(), 2);
                nl2Var.setTargetPosition(i2);
                startSmoothScroll(nl2Var);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            public final boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        hkg.t(54, recyclerView);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((oo8) krkVar4).d.setAdapter(C());
        krk krkVar5 = this.l;
        krkVar5.getClass();
        this.u.f(((oo8) krkVar5).d);
        C().w = new k43(1, this.u, eca.class, "startDrag", "startDrag(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", 0, 7);
        z8e.y(this, D().l, new fa3(this, rq3Var, i));
        z8e.v(this, D().n, new fa3(this, rq3Var, 1));
        z8e.y(this, D().p, new fa3(this, rq3Var, 2));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        if (((ha3) D().l.a.getValue()).a) {
            n();
            return;
        }
        la3 D = D();
        String str = (String) this.s.getValue();
        i1g i1gVar = (i1g) this.v.getValue();
        str.getClass();
        i1gVar.getClass();
        D.j = str;
        xw3.L(un0.z(D), null, null, new jk(D, i1gVar, str, (rq3) null, 3), 3);
    }
}
