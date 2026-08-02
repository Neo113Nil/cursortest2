package com.sofascore.results.referee.events;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.referee.events.RefereeEventsFragment;
import defpackage.a52;
import defpackage.ad2;
import defpackage.ao2;
import defpackage.b1d;
import defpackage.b7e;
import defpackage.beh;
import defpackage.bte;
import defpackage.cce;
import defpackage.duf;
import defpackage.e6b;
import defpackage.eqb;
import defpackage.joa;
import defpackage.krk;
import defpackage.mj5;
import defpackage.mqi;
import defpackage.oo8;
import defpackage.otk;
import defpackage.pte;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.tsf;
import defpackage.u6b;
import defpackage.u6e;
import defpackage.un0;
import defpackage.vce;
import defpackage.wca;
import defpackage.wsf;
import defpackage.x2e;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zsf;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/referee/events/RefereeEventsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefereeEventsFragment extends Hilt_RefereeEventsFragment<oo8> {
    public final mqi r;
    public final otk s;
    public final mqi t;
    public boolean u;

    public RefereeEventsFragment() {
        final int i = 0;
        this.r = ypa.b(new Function0(this) { // from class: ssf
            public final /* synthetic */ RefereeEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RefereeEventsFragment refereeEventsFragment = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = refereeEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "REFEREE", Referee.class);
                        if (M != null) {
                            return (Referee) M;
                        }
                        a70.p("Serializable REFEREE not found");
                        return null;
                    default:
                        Context requireContext = refereeEventsFragment.requireContext();
                        requireContext.getClass();
                        b7e b7eVar = new b7e(requireContext);
                        b7eVar.a.d = new yya(17, refereeEventsFragment, b7eVar);
                        return b7eVar;
                }
            }
        });
        joa a = ypa.a(ysa.c, new vce(new vce(this, 24), 25));
        this.s = new otk(duf.a.getOrCreateKotlinClass(zsf.class), new x2e(a, 29), new bte(this, a, 7), new wsf(a, 0));
        final int i2 = 1;
        this.t = ypa.b(new Function0(this) { // from class: ssf
            public final /* synthetic */ RefereeEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RefereeEventsFragment refereeEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = refereeEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "REFEREE", Referee.class);
                        if (M != null) {
                            return (Referee) M;
                        }
                        a70.p("Serializable REFEREE not found");
                        return null;
                    default:
                        Context requireContext = refereeEventsFragment.requireContext();
                        requireContext.getClass();
                        b7e b7eVar = new b7e(requireContext);
                        b7eVar.a.d = new yya(17, refereeEventsFragment, b7eVar);
                        return b7eVar;
                }
            }
        });
        this.u = true;
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
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new cce(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this), 3);
        mqi mqiVar = this.t;
        u6e u6eVar = new u6e((b7e) mqiVar.getValue(), false, new pte(this, 12));
        ((zsf) this.s.getValue()).g.e(getViewLifecycleOwner(), new eqb(21, new tsf(this, u6eVar, i)));
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext2), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        recyclerView.setAdapter((b7e) mqiVar.getValue());
        recyclerView.addOnScrollListener(u6eVar);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        zsf zsfVar = (zsf) this.s.getValue();
        xw3.L(un0.z(zsfVar), null, null, new mj5(zsfVar, ((Referee) this.r.getValue()).getId(), (rq3) null, 10), 3);
    }
}
