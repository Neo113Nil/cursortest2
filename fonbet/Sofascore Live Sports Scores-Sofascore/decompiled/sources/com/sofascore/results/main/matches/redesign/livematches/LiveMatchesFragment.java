package com.sofascore.results.main.matches.redesign.livematches;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a16;
import defpackage.a52;
import defpackage.a8p;
import defpackage.ad2;
import defpackage.afb;
import defpackage.b1d;
import defpackage.beh;
import defpackage.dmi;
import defpackage.duf;
import defpackage.e52;
import defpackage.e6b;
import defpackage.fcp;
import defpackage.fuf;
import defpackage.hkg;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.j8c;
import defpackage.joa;
import defpackage.jx4;
import defpackage.krk;
import defpackage.mqi;
import defpackage.neb;
import defpackage.nq8;
import defpackage.oeb;
import defpackage.otk;
import defpackage.p42;
import defpackage.q42;
import defpackage.qv5;
import defpackage.reb;
import defpackage.ro8;
import defpackage.rq3;
import defpackage.s5d;
import defpackage.s9d;
import defpackage.seb;
import defpackage.u6b;
import defpackage.v98;
import defpackage.wca;
import defpackage.wya;
import defpackage.xeb;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.yqo;
import defpackage.ysa;
import defpackage.yso;
import defpackage.z1;
import defpackage.z8e;
import defpackage.zqb;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/livematches/LiveMatchesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lro8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LiveMatchesFragment extends Hilt_LiveMatchesFragment<ro8> {
    public s5d r;
    public final otk s;
    public final otk t;
    public final mqi u;
    public jx4 v;
    public s9d w;
    public final mqi x;

    public LiveMatchesFragment() {
        fuf fufVar = duf.a;
        int i = 1;
        int i2 = 2;
        this.s = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new seb(this, 0), new seb(this, i2), new seb(this, i));
        int i3 = 3;
        joa a = ypa.a(ysa.c, new hv7(new seb(this, i3), 20));
        this.t = new otk(fufVar.getOrCreateKotlinClass(xeb.class), new ix7(a, 19), new wya(i3, this, a), new ix7(a, 20));
        this.u = ypa.b(new neb(this, i));
        this.x = ypa.b(new neb(this, i2));
    }

    public final afb C() {
        return (afb) this.x.getValue();
    }

    public final xeb D() {
        return (xeb) this.t.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_live_layout, (ViewGroup) null, false);
        int i = R.id.back_to_live_button;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) nq8.B(R.id.back_to_live_button, inflate);
        if (extendedFloatingActionButton != null) {
            i = R.id.progress_section;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) nq8.B(R.id.progress_section, inflate);
            if (circularProgressIndicator != null) {
                i = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                if (recyclerView != null) {
                    i = R.id.switch_amateur;
                    if (((SwitchCompat) nq8.B(R.id.switch_amateur, inflate)) != null) {
                        i = R.id.switch_holder;
                        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.switch_holder, inflate);
                        if (frameLayout != null) {
                            return new ro8((SwipeRefreshLayout) inflate, extendedFloatingActionButton, circularProgressIndicator, recyclerView, frameLayout);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ad2 ad2Var = qv5.a;
        qv5.a(p42.a);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ad2 ad2Var = qv5.a;
        qv5.a(q42.a);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MatchesLiveNestedTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((ro8) krkVar).a;
        swipeRefreshLayout.getClass();
        rq3 rq3Var = null;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        mqi mqiVar = this.u;
        this.i.b = (String) mqiVar.getValue();
        krk krkVar2 = this.l;
        krkVar2.getClass();
        int i = 1;
        ((ro8) krkVar2).b.y(1);
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        int i2 = 0;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new reb(viewLifecycleOwner, (b1d) obj, this, null, this, 1), 3);
        e6b e6bVar2 = e6b.e;
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(e52.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(viewLifecycleOwner2.getLifecycle()), null, null, new reb(viewLifecycleOwner2, (b1d) obj2, this, null, this, 0), 3);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        hkg.s(24, ((ro8) krkVar3).b);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        RecyclerView recyclerView = ((ro8) krkVar4).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        recyclerView.setAdapter(C());
        recyclerView.setClipToPadding(false);
        if (recyclerView.isAttachedToWindow()) {
            recyclerView.post(new a8p(15, recyclerView, recyclerView));
        } else {
            recyclerView.addOnAttachStateChangeListener(new a16(recyclerView, 4, recyclerView));
        }
        s5d s5dVar = this.r;
        if (s5dVar == null) {
            Intrinsics.i("natsSocket");
            throw null;
        }
        u6b viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        String q = dmi.q("sport.", (String) mqiVar.getValue());
        afb C = C();
        C.getClass();
        fcp.m0(yqo.B(new v98(yso.q(new j8c(s5dVar, q, rq3Var, 12)), new j8c(C, s5dVar, rq3Var, 11), 3), viewLifecycleOwner3.getLifecycle(), e6bVar2), wca.x(viewLifecycleOwner3.getLifecycle()));
        xeb D = D();
        u6b viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        D.g(viewLifecycleOwner4, new neb(this, i2));
        D().m.e(getViewLifecycleOwner(), new z1(20, new oeb(this, i2)));
        ((zqb) this.s.getValue()).m.e(getViewLifecycleOwner(), new z1(20, new oeb(this, i)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        xeb.k(D(), (String) this.u.getValue(), CollectionsKt.S0(C().i));
    }
}
