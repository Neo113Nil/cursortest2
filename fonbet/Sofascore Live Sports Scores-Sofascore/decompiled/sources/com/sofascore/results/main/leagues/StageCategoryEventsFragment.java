package com.sofascore.results.main.leagues;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.results.R;
import com.sofascore.results.main.leagues.StageCategoryEventsFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.a52;
import defpackage.ad2;
import defpackage.ao2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.bte;
import defpackage.d89;
import defpackage.duf;
import defpackage.e1d;
import defpackage.e52;
import defpackage.e6b;
import defpackage.fuf;
import defpackage.fvg;
import defpackage.hkg;
import defpackage.i1i;
import defpackage.ioe;
import defpackage.joa;
import defpackage.km5;
import defpackage.krk;
import defpackage.l5i;
import defpackage.m1i;
import defpackage.n1i;
import defpackage.o1i;
import defpackage.otk;
import defpackage.pte;
import defpackage.qv5;
import defpackage.r1i;
import defpackage.s7i;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.wca;
import defpackage.wsf;
import defpackage.xq8;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zqb;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/leagues/StageCategoryEventsFragment;", "Lcom/sofascore/results/main/AbstractFadingFragment;", "Lxq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageCategoryEventsFragment extends Hilt_StageCategoryEventsFragment<xq8> {
    public final otk t;
    public final otk u;
    public final joa v;
    public final joa w;
    public final e1d x;
    public final e1d y;

    public StageCategoryEventsFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        this.t = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new n1i(this, 0), new n1i(this, 2), new n1i(this, 1));
        n1i n1iVar = new n1i(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(n1iVar, 0));
        this.u = new otk(fufVar.getOrCreateKotlinClass(r1i.class), new wsf(a, 7), new bte(this, a, 11), new wsf(a, 8));
        this.v = ypa.a(ysaVar, new Function0(this) { // from class: j1i
            public final /* synthetic */ StageCategoryEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                StageCategoryEventsFragment stageCategoryEventsFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = stageCategoryEventsFragment.requireContext();
                        requireContext.getClass();
                        return new s7i(requireContext);
                    default:
                        LayoutInflater layoutInflater = stageCategoryEventsFragment.getLayoutInflater();
                        krk krkVar = stageCategoryEventsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_category_events, (ViewGroup) ((xq8) krkVar).b, false);
                        int i4 = R.id.seasons_spinner;
                        ComposeView composeView = (ComposeView) nq8.B(R.id.seasons_spinner, inflate);
                        if (composeView != null) {
                            i4 = R.id.unique_stage_picker;
                            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.unique_stage_picker, inflate);
                            if (typeHeaderView != null) {
                                d89 d89Var = new d89((ConstraintLayout) inflate, composeView, typeHeaderView);
                                g5k g5kVar = new g5k(typeHeaderView);
                                g5kVar.m = new ur1(stageCategoryEventsFragment, 20);
                                g5kVar.b();
                                return d89Var;
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                }
            }
        });
        this.w = ypa.a(ysaVar, new Function0(this) { // from class: j1i
            public final /* synthetic */ StageCategoryEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                StageCategoryEventsFragment stageCategoryEventsFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = stageCategoryEventsFragment.requireContext();
                        requireContext.getClass();
                        return new s7i(requireContext);
                    default:
                        LayoutInflater layoutInflater = stageCategoryEventsFragment.getLayoutInflater();
                        krk krkVar = stageCategoryEventsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_category_events, (ViewGroup) ((xq8) krkVar).b, false);
                        int i4 = R.id.seasons_spinner;
                        ComposeView composeView = (ComposeView) nq8.B(R.id.seasons_spinner, inflate);
                        if (composeView != null) {
                            i4 = R.id.unique_stage_picker;
                            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.unique_stage_picker, inflate);
                            if (typeHeaderView != null) {
                                d89 d89Var = new d89((ConstraintLayout) inflate, composeView, typeHeaderView);
                                g5k g5kVar = new g5k(typeHeaderView);
                                g5kVar.m = new ur1(stageCategoryEventsFragment, 20);
                                g5kVar.b();
                                return d89Var;
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                }
            }
        });
        this.x = e.f(km5.a);
        this.y = e.f(null);
    }

    public final s7i D() {
        return (s7i) this.v.getValue();
    }

    public final String E(UniqueStage uniqueStage) {
        int id = uniqueStage.getId();
        if (id == 9) {
            return getString(R.string.men_category);
        }
        if (id != 94) {
            return null;
        }
        return getString(R.string.women_category);
    }

    public final r1i F() {
        return (r1i) this.u.getValue();
    }

    public final void G(List list) {
        if (list != null) {
            joa joaVar = l5i.a;
            Stage e = l5i.e(list);
            Integer num = null;
            if (e != null) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    Stage stage = (Stage) it.next();
                    stage.getClass();
                    if (stage.getId() == e.getId()) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    num = Integer.valueOf(i);
                }
            }
            if (num != null) {
                krk krkVar = this.l;
                krkVar.getClass();
                int measuredHeight = ((xq8) krkVar).c.getMeasuredHeight() / 2;
                Context requireContext = requireContext();
                requireContext.getClass();
                int s = measuredHeight - ao2.s(PsExtractor.AUDIO_STREAM, requireContext);
                krk krkVar2 = this.l;
                krkVar2.getClass();
                n layoutManager = ((xq8) krkVar2).c.getLayoutManager();
                layoutManager.getClass();
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(num.intValue(), s);
            }
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return xq8.a(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MatchesNestedTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((xq8) krkVar).d;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        AppBarLayout appBarLayout = ((xq8) krkVar2).b;
        joa joaVar = this.w;
        Object value = joaVar.getValue();
        value.getClass();
        ConstraintLayout constraintLayout = ((d89) value).a;
        constraintLayout.getClass();
        int i = 0;
        z8e.r(appBarLayout, constraintLayout, false);
        this.i.b = (String) F().g.getValue();
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
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new m1i(viewLifecycleOwner, (b1d) obj, this, null, this, 0), 3);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView = ((xq8) krkVar3).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        hkg.t(48, ((xq8) krkVar4).c);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((xq8) krkVar5).c.setAdapter(D());
        Object value2 = joaVar.getValue();
        value2.getClass();
        ((d89) value2).b.setContent(new tc3(1742281666, new fvg(this, 20), true));
        s7i D = D();
        pte pteVar = new pte(this, 22);
        D.getClass();
        D.a.d = pteVar;
        ((zqb) this.t.getValue()).E.e(getViewLifecycleOwner(), new ioe(7, new i1i(this, i)));
        F().k.e(getViewLifecycleOwner(), new ioe(7, new i1i(this, 1)));
        F().m.e(getViewLifecycleOwner(), new ioe(7, new i1i(this, 2)));
        F().o.e(getViewLifecycleOwner(), new ioe(7, new i1i(this, 3)));
        e6b e6bVar2 = e6b.a;
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(a52.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(viewLifecycleOwner2.getLifecycle()), null, null, new m1i(viewLifecycleOwner2, (b1d) obj2, this, null, this, 1), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        F().l();
    }
}
