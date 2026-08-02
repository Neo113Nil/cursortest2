package com.sofascore.results.mma.organisation.events;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.util.MonthWithYear;
import com.sofascore.results.R;
import com.sofascore.results.mma.organisation.events.MmaOrganisationEventsFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.ao2;
import defpackage.bmc;
import defpackage.duf;
import defpackage.fpc;
import defpackage.fuf;
import defpackage.g5k;
import defpackage.gz8;
import defpackage.jmc;
import defpackage.joa;
import defpackage.krk;
import defpackage.llc;
import defpackage.mpc;
import defpackage.mqi;
import defpackage.oi;
import defpackage.opc;
import defpackage.otk;
import defpackage.ta0;
import defpackage.tpc;
import defpackage.un0;
import defpackage.ur1;
import defpackage.vpc;
import defpackage.wya;
import defpackage.xq8;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1;
import defpackage.z8e;
import defpackage.zoc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/organisation/events/MmaOrganisationEventsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lxq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaOrganisationEventsFragment extends Hilt_MmaOrganisationEventsFragment<xq8> {
    public final otk r;
    public final otk s;
    public final mqi t;
    public UniqueTournament u;
    public MonthWithYear v;
    public final joa w;
    public final joa x;
    public final oi y;
    public boolean z;

    public MmaOrganisationEventsFragment() {
        opc opcVar = new opc(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new jmc(opcVar, 12));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(vpc.class), new llc(a, 15), new wya(16, this, a), new llc(a, 16));
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.s = new otk(fufVar.getOrCreateKotlinClass(fpc.class), new opc(this, 0), new opc(this, 2), new opc(this, 1));
        this.t = ypa.b(new Function0(this) { // from class: lpc
            public final /* synthetic */ MmaOrganisationEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                MmaOrganisationEventsFragment mmaOrganisationEventsFragment = this.b;
                switch (i4) {
                    case 0:
                        Context requireContext = mmaOrganisationEventsFragment.requireContext();
                        requireContext.getClass();
                        return new bmc(requireContext, fmc.a, 4);
                    case 1:
                        Context requireContext2 = mmaOrganisationEventsFragment.requireContext();
                        requireContext2.getClass();
                        return new zoc(requireContext2);
                    default:
                        Context requireContext3 = mmaOrganisationEventsFragment.requireContext();
                        requireContext3.getClass();
                        return new TypeHeaderView(requireContext3, null, 6);
                }
            }
        });
        this.w = ypa.a(ysaVar, new Function0(this) { // from class: lpc
            public final /* synthetic */ MmaOrganisationEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                MmaOrganisationEventsFragment mmaOrganisationEventsFragment = this.b;
                switch (i4) {
                    case 0:
                        Context requireContext = mmaOrganisationEventsFragment.requireContext();
                        requireContext.getClass();
                        return new bmc(requireContext, fmc.a, 4);
                    case 1:
                        Context requireContext2 = mmaOrganisationEventsFragment.requireContext();
                        requireContext2.getClass();
                        return new zoc(requireContext2);
                    default:
                        Context requireContext3 = mmaOrganisationEventsFragment.requireContext();
                        requireContext3.getClass();
                        return new TypeHeaderView(requireContext3, null, 6);
                }
            }
        });
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: lpc
            public final /* synthetic */ MmaOrganisationEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                MmaOrganisationEventsFragment mmaOrganisationEventsFragment = this.b;
                switch (i4) {
                    case 0:
                        Context requireContext = mmaOrganisationEventsFragment.requireContext();
                        requireContext.getClass();
                        return new bmc(requireContext, fmc.a, 4);
                    case 1:
                        Context requireContext2 = mmaOrganisationEventsFragment.requireContext();
                        requireContext2.getClass();
                        return new zoc(requireContext2);
                    default:
                        Context requireContext3 = mmaOrganisationEventsFragment.requireContext();
                        requireContext3.getClass();
                        return new TypeHeaderView(requireContext3, null, 6);
                }
            }
        });
        this.y = new oi(this, 11);
        this.z = true;
    }

    public final bmc C() {
        return (bmc) this.t.getValue();
    }

    public final vpc D() {
        return (vpc) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return xq8.a(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "EventsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((xq8) krkVar).d;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 4);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Serializable M = gz8.M(requireArguments, "ORGANISATION_DATA", UniqueTournament.class);
        if (M == null) {
            a70.p("Serializable ORGANISATION_DATA not found");
            return;
        }
        this.u = (UniqueTournament) M;
        joa joaVar = this.x;
        TypeHeaderView typeHeaderView = (TypeHeaderView) joaVar.getValue();
        typeHeaderView.getClass();
        g5k g5kVar = new g5k(typeHeaderView);
        g5kVar.a();
        g5kVar.m = new ur1(this, 14);
        g5kVar.b();
        krk krkVar2 = this.l;
        krkVar2.getClass();
        AppBarLayout appBarLayout = ((xq8) krkVar2).b;
        appBarLayout.addView((TypeHeaderView) joaVar.getValue());
        joa joaVar2 = this.w;
        appBarLayout.addView((zoc) joaVar2.getValue());
        Unit unit = Unit.a;
        zoc zocVar = (zoc) joaVar2.getValue();
        ViewGroup.LayoutParams layoutParams = zocVar.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            return;
        }
        ta0 ta0Var = (ta0) layoutParams;
        final int i = 0;
        ta0Var.a = 0;
        zocVar.setLayoutParams(ta0Var);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView = ((xq8) krkVar3).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        RecyclerView recyclerView2 = ((xq8) krkVar4).c;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView2.setPaddingRelative(recyclerView2.getPaddingStart(), ao2.s(4, requireContext2), recyclerView2.getPaddingEnd(), recyclerView2.getPaddingBottom());
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((xq8) krkVar5).c.setAdapter(C());
        bmc C = C();
        mpc mpcVar = new mpc(this, i);
        C.getClass();
        C.a.d = mpcVar;
        D().i.e(getViewLifecycleOwner(), new z1(27, new Function1(this) { // from class: npc
            public final /* synthetic */ MmaOrganisationEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                String y;
                List list;
                int i2 = i;
                MmaOrganisationEventsFragment mmaOrganisationEventsFragment = this.b;
                switch (i2) {
                    case 0:
                        List list2 = (List) obj;
                        if (list2 != null) {
                            ((zoc) mmaOrganisationEventsFragment.w.getValue()).l(list2, mmaOrganisationEventsFragment.y);
                        }
                        break;
                    default:
                        joa joaVar3 = mmaOrganisationEventsFragment.x;
                        qpc qpcVar = (qpc) obj;
                        mmaOrganisationEventsFragment.n();
                        Map map = qpcVar.a;
                        MonthWithYear monthWithYear = qpcVar.b;
                        List S0 = CollectionsKt.S0(map.keySet());
                        if (S0.isEmpty()) {
                            break;
                        } else {
                            TypeHeaderView typeHeaderView2 = (TypeHeaderView) joaVar3.getValue();
                            kp5 kp5Var = rpc.e;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : kp5Var) {
                                if (S0.contains((rpc) obj2)) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((rpc) it.next()).name());
                            }
                            ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                Integer num = null;
                                if (!it2.hasNext()) {
                                    TypeHeaderView.x(typeHeaderView2, arrayList3, null, 6);
                                    if (!Intrinsics.c(mmaOrganisationEventsFragment.v, monthWithYear)) {
                                        mmaOrganisationEventsFragment.C().s();
                                        mmaOrganisationEventsFragment.v = monthWithYear;
                                    }
                                    rpc rpcVar = (rpc) S0.get(((TypeHeaderView) joaVar3.getValue()).getSelectedIndex());
                                    bmc C2 = mmaOrganisationEventsFragment.C();
                                    List list3 = (List) qpcVar.a.get(rpcVar);
                                    if (list3 == null) {
                                        list3 = km5.a;
                                    }
                                    C2.H(list3);
                                    if (mmaOrganisationEventsFragment.z) {
                                        krk krkVar6 = mmaOrganisationEventsFragment.l;
                                        krkVar6.getClass();
                                        ((xq8) krkVar6).b.requestLayout();
                                        ((zoc) mmaOrganisationEventsFragment.w.getValue()).setVisibility(rpcVar == rpc.c ? 0 : 8);
                                        mmaOrganisationEventsFragment.z = false;
                                    }
                                    break;
                                } else {
                                    String str = (String) it2.next();
                                    int hashCode = str.hashCode();
                                    if (hashCode != 2337004) {
                                        if (hashCode != 108966002) {
                                            if (hashCode == 2089318684 && str.equals("UPCOMING")) {
                                                y = mmaOrganisationEventsFragment.getString(R.string.upcoming);
                                                y.getClass();
                                                arrayList3.add(new vt2(str, y, false, null, null, str.equals("LIVE") ? krh.m : hrh.m, null, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
                                            }
                                        } else if (str.equals("FINISHED")) {
                                            y = mmaOrganisationEventsFragment.getString(R.string.finished);
                                            y.getClass();
                                            arrayList3.add(new vt2(str, y, false, null, null, str.equals("LIVE") ? krh.m : hrh.m, null, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
                                        }
                                    } else if (str.equals("LIVE")) {
                                        qpc qpcVar2 = (qpc) mmaOrganisationEventsFragment.D().g.d();
                                        if (qpcVar2 != null && (list = (List) qpcVar2.a.get(rpc.a)) != null) {
                                            num = Integer.valueOf(list.size());
                                        }
                                        y = dmi.y(mmaOrganisationEventsFragment.getString(R.string.menu_live), num != null ? lnb.k(num.intValue(), " (", ")") : "");
                                        arrayList3.add(new vt2(str, y, false, null, null, str.equals("LIVE") ? krh.m : hrh.m, null, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
                                    }
                                }
                            }
                            ilg.c();
                            break;
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i2 = 1;
        D().g.e(getViewLifecycleOwner(), new z1(27, new Function1(this) { // from class: npc
            public final /* synthetic */ MmaOrganisationEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                String y;
                List list;
                int i22 = i2;
                MmaOrganisationEventsFragment mmaOrganisationEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        List list2 = (List) obj;
                        if (list2 != null) {
                            ((zoc) mmaOrganisationEventsFragment.w.getValue()).l(list2, mmaOrganisationEventsFragment.y);
                        }
                        break;
                    default:
                        joa joaVar3 = mmaOrganisationEventsFragment.x;
                        qpc qpcVar = (qpc) obj;
                        mmaOrganisationEventsFragment.n();
                        Map map = qpcVar.a;
                        MonthWithYear monthWithYear = qpcVar.b;
                        List S0 = CollectionsKt.S0(map.keySet());
                        if (S0.isEmpty()) {
                            break;
                        } else {
                            TypeHeaderView typeHeaderView2 = (TypeHeaderView) joaVar3.getValue();
                            kp5 kp5Var = rpc.e;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : kp5Var) {
                                if (S0.contains((rpc) obj2)) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((rpc) it.next()).name());
                            }
                            ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                Integer num = null;
                                if (!it2.hasNext()) {
                                    TypeHeaderView.x(typeHeaderView2, arrayList3, null, 6);
                                    if (!Intrinsics.c(mmaOrganisationEventsFragment.v, monthWithYear)) {
                                        mmaOrganisationEventsFragment.C().s();
                                        mmaOrganisationEventsFragment.v = monthWithYear;
                                    }
                                    rpc rpcVar = (rpc) S0.get(((TypeHeaderView) joaVar3.getValue()).getSelectedIndex());
                                    bmc C2 = mmaOrganisationEventsFragment.C();
                                    List list3 = (List) qpcVar.a.get(rpcVar);
                                    if (list3 == null) {
                                        list3 = km5.a;
                                    }
                                    C2.H(list3);
                                    if (mmaOrganisationEventsFragment.z) {
                                        krk krkVar6 = mmaOrganisationEventsFragment.l;
                                        krkVar6.getClass();
                                        ((xq8) krkVar6).b.requestLayout();
                                        ((zoc) mmaOrganisationEventsFragment.w.getValue()).setVisibility(rpcVar == rpc.c ? 0 : 8);
                                        mmaOrganisationEventsFragment.z = false;
                                    }
                                    break;
                                } else {
                                    String str = (String) it2.next();
                                    int hashCode = str.hashCode();
                                    if (hashCode != 2337004) {
                                        if (hashCode != 108966002) {
                                            if (hashCode == 2089318684 && str.equals("UPCOMING")) {
                                                y = mmaOrganisationEventsFragment.getString(R.string.upcoming);
                                                y.getClass();
                                                arrayList3.add(new vt2(str, y, false, null, null, str.equals("LIVE") ? krh.m : hrh.m, null, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
                                            }
                                        } else if (str.equals("FINISHED")) {
                                            y = mmaOrganisationEventsFragment.getString(R.string.finished);
                                            y.getClass();
                                            arrayList3.add(new vt2(str, y, false, null, null, str.equals("LIVE") ? krh.m : hrh.m, null, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
                                        }
                                    } else if (str.equals("LIVE")) {
                                        qpc qpcVar2 = (qpc) mmaOrganisationEventsFragment.D().g.d();
                                        if (qpcVar2 != null && (list = (List) qpcVar2.a.get(rpc.a)) != null) {
                                            num = Integer.valueOf(list.size());
                                        }
                                        y = dmi.y(mmaOrganisationEventsFragment.getString(R.string.menu_live), num != null ? lnb.k(num.intValue(), " (", ")") : "");
                                        arrayList3.add(new vt2(str, y, false, null, null, str.equals("LIVE") ? krh.m : hrh.m, null, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
                                    }
                                }
                            }
                            ilg.c();
                            break;
                        }
                        break;
                }
                return Unit.a;
            }
        }));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        vpc D = D();
        UniqueTournament uniqueTournament = this.u;
        if (uniqueTournament == null) {
            Intrinsics.i(SearchResponseKt.LEAGUE_ENTITY);
            throw null;
        }
        int id = uniqueTournament.getId();
        xw3.L(un0.z(D), null, null, new tpc(this.v, D, id, null), 3);
    }
}
