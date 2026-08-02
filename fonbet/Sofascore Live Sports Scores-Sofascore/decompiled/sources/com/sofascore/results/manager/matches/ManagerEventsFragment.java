package com.sofascore.results.manager.matches;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.ManagerData;
import com.sofascore.results.R;
import com.sofascore.results.manager.matches.ManagerEventsFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a52;
import defpackage.ad2;
import defpackage.ao2;
import defpackage.b1d;
import defpackage.bba;
import defpackage.beh;
import defpackage.duf;
import defpackage.e6b;
import defpackage.eqb;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.j29;
import defpackage.joa;
import defpackage.jr5;
import defpackage.krk;
import defpackage.ksb;
import defpackage.mqi;
import defpackage.oo8;
import defpackage.osb;
import defpackage.otk;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.sse;
import defpackage.u6b;
import defpackage.u6e;
import defpackage.un0;
import defpackage.va8;
import defpackage.wca;
import defpackage.wya;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/manager/matches/ManagerEventsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ManagerEventsFragment extends Hilt_ManagerEventsFragment<oo8> {
    public final mqi r;
    public final otk s;
    public boolean t;
    public final mqi u;
    public final j29 v;

    public ManagerEventsFragment() {
        final int i = 0;
        this.r = ypa.b(new Function0(this) { // from class: jsb
            public final /* synthetic */ ManagerEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ManagerEventsFragment managerEventsFragment = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = managerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "MANAGER", ManagerData.class);
                        if (M != null) {
                            return (ManagerData) M;
                        }
                        a70.p("Serializable MANAGER not found");
                        return null;
                    default:
                        Context requireContext = managerEventsFragment.requireContext();
                        requireContext.getClass();
                        return new sse(requireContext, null, null, null, true, null);
                }
            }
        });
        joa a = ypa.a(ysa.c, new hv7(new hv7(this, 22), 23));
        this.s = new otk(duf.a.getOrCreateKotlinClass(osb.class), new ix7(a, 21), new wya(4, this, a), new ix7(a, 22));
        final int i2 = 1;
        this.t = true;
        this.u = ypa.b(new Function0(this) { // from class: jsb
            public final /* synthetic */ ManagerEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ManagerEventsFragment managerEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = managerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "MANAGER", ManagerData.class);
                        if (M != null) {
                            return (ManagerData) M;
                        }
                        a70.p("Serializable MANAGER not found");
                        return null;
                    default:
                        Context requireContext = managerEventsFragment.requireContext();
                        requireContext.getClass();
                        return new sse(requireContext, null, null, null, true, null);
                }
            }
        });
        this.v = new j29(Integer.valueOf(R.drawable.no_events_2), Integer.valueOf(R.string.no_games_title), Integer.valueOf(R.string.no_next_games), 497);
    }

    public final sse C() {
        return (sse) this.u.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MatchesTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        int i = 0;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new va8(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this), 3);
        u6e u6eVar = new u6e(C(), false, new bba(this, 9));
        ((osb) this.s.getValue()).g.e(getViewLifecycleOwner(), new eqb(2, new ksb(this, u6eVar, i)));
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        recyclerView.setAdapter(C());
        recyclerView.addOnScrollListener(u6eVar);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext2), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        osb osbVar = (osb) this.s.getValue();
        ManagerData managerData = (ManagerData) this.r.getValue();
        managerData.getClass();
        xw3.L(un0.z(osbVar), null, null, new jr5(osbVar, managerData, managerData.getManager().getId(), (rq3) null, 7), 3);
    }
}
