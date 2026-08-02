package com.sofascore.results.stagesport.fragments.category;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.stagesport.fragments.category.StageCategoryRacesFragment;
import defpackage.a52;
import defpackage.ad2;
import defpackage.ao2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.big;
import defpackage.cce;
import defpackage.duf;
import defpackage.e6b;
import defpackage.g1i;
import defpackage.ioe;
import defpackage.krk;
import defpackage.mqi;
import defpackage.oo8;
import defpackage.otk;
import defpackage.pte;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.s7i;
import defpackage.u6b;
import defpackage.un0;
import defpackage.w1i;
import defpackage.wca;
import defpackage.x1i;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.z8e;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/category/StageCategoryRacesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageCategoryRacesFragment extends Hilt_StageCategoryRacesFragment<oo8> {
    public boolean r = true;
    public final otk s;
    public final mqi t;

    public StageCategoryRacesFragment() {
        int i = 0;
        this.s = new otk(duf.a.getOrCreateKotlinClass(g1i.class), new x1i(this, i), new x1i(this, 2), new x1i(this, 1));
        this.t = ypa.b(new w1i(this, i));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "RacesTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar3).d;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        final int i = 0;
        z8e.b0(recyclerView2, requireContext2, false, false, null, 30);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        RecyclerView recyclerView3 = ((oo8) krkVar4).d;
        mqi mqiVar = this.t;
        recyclerView3.setAdapter((s7i) mqiVar.getValue());
        s7i s7iVar = (s7i) mqiVar.getValue();
        pte pteVar = new pte(this, 23);
        s7iVar.getClass();
        s7iVar.a.d = pteVar;
        otk otkVar = this.s;
        ((g1i) otkVar.getValue()).k.e(getViewLifecycleOwner(), new ioe(9, new Function1(this) { // from class: v1i
            public final /* synthetic */ StageCategoryRacesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                StageCategoryRacesFragment stageCategoryRacesFragment = this.b;
                switch (i2) {
                    case 0:
                        g1i g1iVar = (g1i) stageCategoryRacesFragment.s.getValue();
                        StageSeason stageSeason = (StageSeason) g1iVar.k.d();
                        if (stageSeason != null) {
                            xw3.L(un0.z(g1iVar), null, null, new big(g1iVar, stageSeason, null, 17), 3);
                        }
                        break;
                    default:
                        List list = (List) obj;
                        krk krkVar5 = stageCategoryRacesFragment.l;
                        krkVar5.getClass();
                        ((oo8) krkVar5).e.setRefreshing(false);
                        s7i s7iVar2 = (s7i) stageCategoryRacesFragment.t.getValue();
                        list.getClass();
                        s7iVar2.F(list);
                        if (stageCategoryRacesFragment.r) {
                            stageCategoryRacesFragment.r = false;
                            joa joaVar = l5i.a;
                            int indexOf = list.indexOf(l5i.e(list));
                            Integer valueOf = indexOf != -1 ? Integer.valueOf(indexOf) : null;
                            if (valueOf != null) {
                                int intValue = valueOf.intValue();
                                krk krkVar6 = stageCategoryRacesFragment.l;
                                krkVar6.getClass();
                                int measuredHeight = ((oo8) krkVar6).d.getMeasuredHeight() / 2;
                                Context requireContext3 = stageCategoryRacesFragment.requireContext();
                                requireContext3.getClass();
                                int s = measuredHeight - ao2.s(PsExtractor.AUDIO_STREAM, requireContext3);
                                krk krkVar7 = stageCategoryRacesFragment.l;
                                krkVar7.getClass();
                                n layoutManager = ((oo8) krkVar7).d.getLayoutManager();
                                layoutManager.getClass();
                                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(intValue, s);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i2 = 1;
        ((g1i) otkVar.getValue()).o.e(getViewLifecycleOwner(), new ioe(9, new Function1(this) { // from class: v1i
            public final /* synthetic */ StageCategoryRacesFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                StageCategoryRacesFragment stageCategoryRacesFragment = this.b;
                switch (i22) {
                    case 0:
                        g1i g1iVar = (g1i) stageCategoryRacesFragment.s.getValue();
                        StageSeason stageSeason = (StageSeason) g1iVar.k.d();
                        if (stageSeason != null) {
                            xw3.L(un0.z(g1iVar), null, null, new big(g1iVar, stageSeason, null, 17), 3);
                        }
                        break;
                    default:
                        List list = (List) obj;
                        krk krkVar5 = stageCategoryRacesFragment.l;
                        krkVar5.getClass();
                        ((oo8) krkVar5).e.setRefreshing(false);
                        s7i s7iVar2 = (s7i) stageCategoryRacesFragment.t.getValue();
                        list.getClass();
                        s7iVar2.F(list);
                        if (stageCategoryRacesFragment.r) {
                            stageCategoryRacesFragment.r = false;
                            joa joaVar = l5i.a;
                            int indexOf = list.indexOf(l5i.e(list));
                            Integer valueOf = indexOf != -1 ? Integer.valueOf(indexOf) : null;
                            if (valueOf != null) {
                                int intValue = valueOf.intValue();
                                krk krkVar6 = stageCategoryRacesFragment.l;
                                krkVar6.getClass();
                                int measuredHeight = ((oo8) krkVar6).d.getMeasuredHeight() / 2;
                                Context requireContext3 = stageCategoryRacesFragment.requireContext();
                                requireContext3.getClass();
                                int s = measuredHeight - ao2.s(PsExtractor.AUDIO_STREAM, requireContext3);
                                krk krkVar7 = stageCategoryRacesFragment.l;
                                krkVar7.getClass();
                                n layoutManager = ((oo8) krkVar7).d.getLayoutManager();
                                layoutManager.getClass();
                                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(intValue, s);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new cce(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        g1i g1iVar = (g1i) this.s.getValue();
        StageSeason stageSeason = (StageSeason) g1iVar.k.d();
        if (stageSeason == null) {
            return;
        }
        xw3.L(un0.z(g1iVar), null, null, new big(g1iVar, stageSeason, null, 17), 3);
    }
}
