package com.sofascore.results.main.matches.redesign.datematches;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.common.SwipeRefreshLayoutFixed;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import defpackage.ad2;
import defpackage.ai4;
import defpackage.ao2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.ch4;
import defpackage.ci6;
import defpackage.ddd;
import defpackage.do8;
import defpackage.duf;
import defpackage.e52;
import defpackage.e6b;
import defpackage.eh4;
import defpackage.ehe;
import defpackage.fuf;
import defpackage.gi6;
import defpackage.hh4;
import defpackage.hkg;
import defpackage.j63;
import defpackage.joa;
import defpackage.jx4;
import defpackage.krk;
import defpackage.lec;
import defpackage.nh3;
import defpackage.nl2;
import defpackage.nq8;
import defpackage.otk;
import defpackage.p24;
import defpackage.qrf;
import defpackage.qv5;
import defpackage.r1;
import defpackage.rq3;
import defpackage.s9d;
import defpackage.sh4;
import defpackage.th4;
import defpackage.u42;
import defpackage.u6b;
import defpackage.ug5;
import defpackage.un0;
import defpackage.v42;
import defpackage.waa;
import defpackage.wca;
import defpackage.xw3;
import defpackage.y1;
import defpackage.yg4;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yzc;
import defpackage.z1;
import defpackage.z8e;
import defpackage.zqb;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/datematches/DateMatchesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Ldo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateMatchesFragment extends Hilt_DateMatchesFragment<do8> {
    public final joa r;
    public final otk s;
    public final otk t;
    public ddd u;
    public jx4 v;
    public s9d w;
    public final joa x;
    public final joa y;
    public final joa z;

    public DateMatchesFragment() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: zg4
            public final /* synthetic */ DateMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DateMatchesFragment dateMatchesFragment = this.b;
                switch (i2) {
                    case 0:
                        Calendar calendar = ke0.a;
                        Context requireContext = dateMatchesFragment.requireContext();
                        requireContext.getClass();
                        return ke0.b(requireContext);
                    case 1:
                        Context requireContext2 = dateMatchesFragment.requireContext();
                        requireContext2.getClass();
                        int s = ao2.s(8, requireContext2);
                        Context requireContext3 = dateMatchesFragment.requireContext();
                        requireContext3.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext3, null, 6);
                        adBannerView.setPaddingRelative(adBannerView.getPaddingStart(), s, adBannerView.getPaddingEnd(), s);
                        adBannerView.setAdType(AdType.Banner.MainScreenBig);
                        adBannerView.setCustomTargeting(sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, (String) dateMatchesFragment.r.getValue())));
                        return adBannerView;
                    case 2:
                        Context requireContext4 = dateMatchesFragment.requireContext();
                        requireContext4.getClass();
                        ehe eheVar = new ehe(requireContext4);
                        eheVar.a.d = new hl6(28, dateMatchesFragment, eheVar);
                        return eheVar;
                    default:
                        FragmentActivity requireActivity = dateMatchesFragment.requireActivity();
                        requireActivity.getClass();
                        gi6 gi6Var = new gi6(requireActivity);
                        gi6Var.a.d = new hl6(29, dateMatchesFragment, gi6Var);
                        return gi6Var;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.r = ypa.a(ysaVar, function0);
        final int i2 = 3;
        joa a = ypa.a(ysaVar, new j63(new eh4(this, i2), 8));
        fuf fufVar = duf.a;
        this.s = new otk(fufVar.getOrCreateKotlinClass(ai4.class), new p24(a, 5), new y1(24, this, a), new p24(a, 6));
        final int i3 = 1;
        final int i4 = 2;
        this.t = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new eh4(this, i), new eh4(this, i4), new eh4(this, i3));
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: zg4
            public final /* synthetic */ DateMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DateMatchesFragment dateMatchesFragment = this.b;
                switch (i22) {
                    case 0:
                        Calendar calendar = ke0.a;
                        Context requireContext = dateMatchesFragment.requireContext();
                        requireContext.getClass();
                        return ke0.b(requireContext);
                    case 1:
                        Context requireContext2 = dateMatchesFragment.requireContext();
                        requireContext2.getClass();
                        int s = ao2.s(8, requireContext2);
                        Context requireContext3 = dateMatchesFragment.requireContext();
                        requireContext3.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext3, null, 6);
                        adBannerView.setPaddingRelative(adBannerView.getPaddingStart(), s, adBannerView.getPaddingEnd(), s);
                        adBannerView.setAdType(AdType.Banner.MainScreenBig);
                        adBannerView.setCustomTargeting(sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, (String) dateMatchesFragment.r.getValue())));
                        return adBannerView;
                    case 2:
                        Context requireContext4 = dateMatchesFragment.requireContext();
                        requireContext4.getClass();
                        ehe eheVar = new ehe(requireContext4);
                        eheVar.a.d = new hl6(28, dateMatchesFragment, eheVar);
                        return eheVar;
                    default:
                        FragmentActivity requireActivity = dateMatchesFragment.requireActivity();
                        requireActivity.getClass();
                        gi6 gi6Var = new gi6(requireActivity);
                        gi6Var.a.d = new hl6(29, dateMatchesFragment, gi6Var);
                        return gi6Var;
                }
            }
        });
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: zg4
            public final /* synthetic */ DateMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                DateMatchesFragment dateMatchesFragment = this.b;
                switch (i22) {
                    case 0:
                        Calendar calendar = ke0.a;
                        Context requireContext = dateMatchesFragment.requireContext();
                        requireContext.getClass();
                        return ke0.b(requireContext);
                    case 1:
                        Context requireContext2 = dateMatchesFragment.requireContext();
                        requireContext2.getClass();
                        int s = ao2.s(8, requireContext2);
                        Context requireContext3 = dateMatchesFragment.requireContext();
                        requireContext3.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext3, null, 6);
                        adBannerView.setPaddingRelative(adBannerView.getPaddingStart(), s, adBannerView.getPaddingEnd(), s);
                        adBannerView.setAdType(AdType.Banner.MainScreenBig);
                        adBannerView.setCustomTargeting(sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, (String) dateMatchesFragment.r.getValue())));
                        return adBannerView;
                    case 2:
                        Context requireContext4 = dateMatchesFragment.requireContext();
                        requireContext4.getClass();
                        ehe eheVar = new ehe(requireContext4);
                        eheVar.a.d = new hl6(28, dateMatchesFragment, eheVar);
                        return eheVar;
                    default:
                        FragmentActivity requireActivity = dateMatchesFragment.requireActivity();
                        requireActivity.getClass();
                        gi6 gi6Var = new gi6(requireActivity);
                        gi6Var.a.d = new hl6(29, dateMatchesFragment, gi6Var);
                        return gi6Var;
                }
            }
        });
        this.z = ypa.a(ysaVar, new Function0(this) { // from class: zg4
            public final /* synthetic */ DateMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DateMatchesFragment dateMatchesFragment = this.b;
                switch (i22) {
                    case 0:
                        Calendar calendar = ke0.a;
                        Context requireContext = dateMatchesFragment.requireContext();
                        requireContext.getClass();
                        return ke0.b(requireContext);
                    case 1:
                        Context requireContext2 = dateMatchesFragment.requireContext();
                        requireContext2.getClass();
                        int s = ao2.s(8, requireContext2);
                        Context requireContext3 = dateMatchesFragment.requireContext();
                        requireContext3.getClass();
                        AdBannerView adBannerView = new AdBannerView(requireContext3, null, 6);
                        adBannerView.setPaddingRelative(adBannerView.getPaddingStart(), s, adBannerView.getPaddingEnd(), s);
                        adBannerView.setAdType(AdType.Banner.MainScreenBig);
                        adBannerView.setCustomTargeting(sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, (String) dateMatchesFragment.r.getValue())));
                        return adBannerView;
                    case 2:
                        Context requireContext4 = dateMatchesFragment.requireContext();
                        requireContext4.getClass();
                        ehe eheVar = new ehe(requireContext4);
                        eheVar.a.d = new hl6(28, dateMatchesFragment, eheVar);
                        return eheVar;
                    default:
                        FragmentActivity requireActivity = dateMatchesFragment.requireActivity();
                        requireActivity.getClass();
                        gi6 gi6Var = new gi6(requireActivity);
                        gi6Var.a.d = new hl6(29, dateMatchesFragment, gi6Var);
                        return gi6Var;
                }
            }
        });
    }

    public final boolean C() {
        return ug5.w(H().h) || ug5.u(H().h) || ug5.v(H().h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(ci6 ci6Var, boolean z) {
        Object[] objArr = 0;
        if (z) {
            gi6 E = E();
            E.getClass();
            int indexOf = E.i.indexOf(ci6Var);
            Integer valueOf = Integer.valueOf(indexOf);
            if (indexOf < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                krk krkVar = this.l;
                krkVar.getClass();
                ((do8) krkVar).c.smoothScrollToPosition(G().getItemCount() + intValue);
            }
        }
        ai4 H = H();
        Category category = ci6Var.b;
        HashMap hashMap = H.t;
        if (!hashMap.containsKey(Integer.valueOf(category.getId()))) {
            hashMap.put(Integer.valueOf(category.getId()), new yzc());
        }
        xw3.L(un0.z(H), null, null, new sh4(H, ci6Var, objArr == true ? 1 : 0, 0), 3);
        yzc yzcVar = (yzc) H().t.get(Integer.valueOf(category.getId()));
        lec w = yzcVar != null ? waa.w(yzcVar) : null;
        if (w != null) {
            w.e(getViewLifecycleOwner(), new z1(4, new yg4(this, 1)));
        }
    }

    public final gi6 E() {
        return (gi6) this.z.getValue();
    }

    public final zqb F() {
        return (zqb) this.t.getValue();
    }

    public final ehe G() {
        return (ehe) this.y.getValue();
    }

    public final ai4 H() {
        return (ai4) this.s.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_date_matches, (ViewGroup) null, false);
        int i = R.id.empty_state;
        GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_state, inflate);
        if (graphicLarge != null) {
            i = R.id.expandable_matches_list;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.expandable_matches_list, inflate);
            if (recyclerView != null) {
                i = R.id.progress_section;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) nq8.B(R.id.progress_section, inflate);
                if (circularProgressIndicator != null) {
                    SwipeRefreshLayoutFixed swipeRefreshLayoutFixed = (SwipeRefreshLayoutFixed) inflate;
                    return new do8(recyclerView, circularProgressIndicator, swipeRefreshLayoutFixed, swipeRefreshLayoutFixed, graphicLarge);
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
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayoutFixed swipeRefreshLayoutFixed = ((do8) krkVar).e;
        swipeRefreshLayoutFixed.getClass();
        rq3 rq3Var = null;
        int i = 6;
        AbstractFragment.v(this, swipeRefreshLayoutFixed, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        SwipeRefreshLayoutFixed swipeRefreshLayoutFixed2 = ((do8) krkVar2).e;
        Context requireContext = requireContext();
        requireContext.getClass();
        int s = ao2.s(48, requireContext);
        swipeRefreshLayoutFixed2.getClass();
        int i2 = 0;
        swipeRefreshLayoutFixed2.w = 0;
        swipeRefreshLayoutFixed2.x = s;
        swipeRefreshLayoutFixed2.G = true;
        swipeRefreshLayoutFixed2.l();
        swipeRefreshLayoutFixed2.c = false;
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((do8) krkVar3).b.setVisibility(8);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        hkg.s(0, ((do8) krkVar4).b);
        this.i.b = (String) this.r.getValue();
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(e52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        int i3 = 3;
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new ch4(viewLifecycleOwner, (b1d) obj, this, null, this, 0), 3);
        e6b e6bVar2 = e6b.a;
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(u42.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(viewLifecycleOwner2.getLifecycle()), null, null, new ch4(viewLifecycleOwner2, (b1d) obj2, this, null, this, 1), 3);
        u6b viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(v42.class);
        Object obj3 = linkedHashMap.get(orCreateKotlinClass3);
        if (obj3 == null) {
            obj3 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass3, obj3);
        }
        xw3.L(wca.x(viewLifecycleOwner3.getLifecycle()), null, null, new ch4(viewLifecycleOwner3, (b1d) obj3, this, null, this, 2), 3);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        final RecyclerView recyclerView = ((do8) krkVar5).c;
        hkg.t(96, recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setDescendantFocusability(131072);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment$onViewCreate$4$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            public final void smoothScrollToPosition(RecyclerView recyclerView2, qrf qrfVar, int i4) {
                recyclerView2.getClass();
                qrfVar.getClass();
                nl2 nl2Var = new nl2(RecyclerView.this.getContext(), 3);
                nl2Var.setTargetPosition(i4);
                startSmoothScroll(nl2Var);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
            /* renamed from: supportsPredictiveItemAnimations */
            public final boolean getA() {
                return false;
            }
        });
        recyclerView.setAdapter(new nh3(new l[]{G(), E()}));
        H().p.e(getViewLifecycleOwner(), new z1(4, new yg4(this, i2)));
        H().r.e(getViewLifecycleOwner(), new z1(4, new yg4(this, 2)));
        F().i0.e(getViewLifecycleOwner(), new z1(4, new yg4(this, i3)));
        F().w.e(getViewLifecycleOwner(), new z1(4, new yg4(this, 4)));
        F().y.e(getViewLifecycleOwner(), new z1(4, new yg4(this, 5)));
        F().m.e(getViewLifecycleOwner(), new z1(4, new yg4(this, i)));
        z8e.y(this, H().n, new r1(this, rq3Var, 15));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        n();
        Boolean bool = (Boolean) F().i0.d();
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.c(bool, bool2) && !C()) {
            zqb F = F();
            if (F.g0) {
                F.g0 = false;
                F.h0.j(bool2);
                return;
            }
            return;
        }
        if (!((hh4) H().n.a.getValue()).a) {
            H().o((String) this.r.getValue());
            return;
        }
        ArrayList arrayList = E().i;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof ci6) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((ci6) next2).d) {
                arrayList3.add(next2);
            }
        }
        ai4 H = H();
        xw3.L(un0.z(H), null, null, new th4(H, arrayList3, (rq3) null), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final boolean w() {
        return !Intrinsics.c((Boolean) F().w.d(), Boolean.TRUE);
    }
}
