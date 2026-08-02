package com.sofascore.results.venue.matches;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.VenueResponse;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.venue.matches.VenueMatchesFragment;
import defpackage.a52;
import defpackage.a70;
import defpackage.ad2;
import defpackage.anc;
import defpackage.ao2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.d3k;
import defpackage.dnk;
import defpackage.duf;
import defpackage.e6b;
import defpackage.fuf;
import defpackage.hnk;
import defpackage.ilj;
import defpackage.ioe;
import defpackage.joa;
import defpackage.jr5;
import defpackage.krk;
import defpackage.kuj;
import defpackage.lnk;
import defpackage.onk;
import defpackage.oo8;
import defpackage.otk;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.s2j;
import defpackage.u6b;
import defpackage.u6e;
import defpackage.un0;
import defpackage.wca;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/venue/matches/VenueMatchesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VenueMatchesFragment extends Hilt_VenueMatchesFragment<oo8> {
    public final otk r;
    public final otk s;
    public final joa t;
    public boolean u;
    public final joa v;

    public VenueMatchesFragment() {
        lnk lnkVar = new lnk(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new s2j(lnkVar, 18));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(onk.class), new d3k(a, 3), new ilj(7, this, a), new d3k(a, 4));
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(dnk.class);
        final int i = 0;
        final int i2 = 1;
        this.s = new otk(orCreateKotlinClass, new lnk(this, 0), new lnk(this, 2), new lnk(this, 1));
        this.t = ypa.a(ysaVar, new Function0(this) { // from class: ink
            public final /* synthetic */ VenueMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                VenueMatchesFragment venueMatchesFragment = this.b;
                switch (i3) {
                    case 0:
                        FragmentActivity requireActivity = venueMatchesFragment.requireActivity();
                        requireActivity.getClass();
                        return new hnk(requireActivity);
                    default:
                        return new u6e(venueMatchesFragment.C(), false, new uri(venueMatchesFragment, 17));
                }
            }
        });
        this.u = true;
        this.v = ypa.a(ysaVar, new Function0(this) { // from class: ink
            public final /* synthetic */ VenueMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                VenueMatchesFragment venueMatchesFragment = this.b;
                switch (i3) {
                    case 0:
                        FragmentActivity requireActivity = venueMatchesFragment.requireActivity();
                        requireActivity.getClass();
                        return new hnk(requireActivity);
                    default:
                        return new u6e(venueMatchesFragment.C(), false, new uri(venueMatchesFragment, 17));
                }
            }
        });
    }

    public final hnk C() {
        return (hnk) this.t.getValue();
    }

    public final int D() {
        Object d = ((dnk) this.s.getValue()).f.d();
        if (d != null) {
            return ((VenueResponse) d).getVenue().getId();
        }
        a70.r("Required value was null.");
        return 0;
    }

    public final onk E() {
        return (onk) this.r.getValue();
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
        rq3 rq3Var = null;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 4);
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        final int i = 0;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new kuj(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this), 3);
        E().g.e(getViewLifecycleOwner(), new ioe(27, new Function1(this) { // from class: jnk
            public final /* synthetic */ VenueMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                VenueMatchesFragment venueMatchesFragment = this.b;
                List<String> list = (List) obj2;
                switch (i2) {
                    case 0:
                        kda.p(wca.x(venueMatchesFragment.getLifecycle()), new knk(venueMatchesFragment, list, null, 0), new mwj(20, venueMatchesFragment, list));
                        break;
                    default:
                        if (list.size() > 1) {
                            String string = venueMatchesFragment.getString(R.string.all_sports);
                            string.getClass();
                            vt2 vt2Var = new vt2(Season.YEAR_ALL_TIME, string, false, null, null, null, null, 252);
                            ArrayList arrayList = new ArrayList(k13.r(list, 10));
                            for (String str : list) {
                                Context requireContext = venueMatchesFragment.requireContext();
                                requireContext.getClass();
                                arrayList.add(new vt2(str, wyh.c(requireContext, str), false, new tc3(647218371, new fj4(str, 3), true), null, null, null, 244));
                            }
                            krk krkVar2 = venueMatchesFragment.l;
                            krkVar2.getClass();
                            g5k g5kVar = new g5k(((oo8) krkVar2).f);
                            g5kVar.b = CollectionsKt.w0(arrayList, a.c(vt2Var));
                            g5kVar.m = new ur1(venueMatchesFragment, 25);
                            g5kVar.b();
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i2 = 1;
        E().i.e(getViewLifecycleOwner(), new ioe(27, new Function1(this) { // from class: jnk
            public final /* synthetic */ VenueMatchesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                VenueMatchesFragment venueMatchesFragment = this.b;
                List<String> list = (List) obj2;
                switch (i22) {
                    case 0:
                        kda.p(wca.x(venueMatchesFragment.getLifecycle()), new knk(venueMatchesFragment, list, null, 0), new mwj(20, venueMatchesFragment, list));
                        break;
                    default:
                        if (list.size() > 1) {
                            String string = venueMatchesFragment.getString(R.string.all_sports);
                            string.getClass();
                            vt2 vt2Var = new vt2(Season.YEAR_ALL_TIME, string, false, null, null, null, null, 252);
                            ArrayList arrayList = new ArrayList(k13.r(list, 10));
                            for (String str : list) {
                                Context requireContext = venueMatchesFragment.requireContext();
                                requireContext.getClass();
                                arrayList.add(new vt2(str, wyh.c(requireContext, str), false, new tc3(647218371, new fj4(str, 3), true), null, null, null, 244));
                            }
                            krk krkVar2 = venueMatchesFragment.l;
                            krkVar2.getClass();
                            g5k g5kVar = new g5k(((oo8) krkVar2).f);
                            g5kVar.b = CollectionsKt.w0(arrayList, a.c(vt2Var));
                            g5kVar.m = new ur1(venueMatchesFragment, 25);
                            g5kVar.b();
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        z8e.b0(recyclerView, requireContext2, false, false, null, 30);
        recyclerView.setAdapter(C());
        recyclerView.addOnScrollListener((u6e) this.v.getValue());
        onk E = E();
        xw3.L(un0.z(E), null, null, new anc(E, D(), rq3Var, 20), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        onk E = E();
        int D = D();
        String str = E.j;
        str.getClass();
        E.j = str;
        xw3.L(un0.z(E), null, null, new jr5(E, D, str, (rq3) null), 3);
    }
}
