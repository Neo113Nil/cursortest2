package com.sofascore.results.main.matches;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.main.matches.StageSeriesWeekFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import defpackage.ad2;
import defpackage.b1d;
import defpackage.b1i;
import defpackage.beh;
import defpackage.bte;
import defpackage.duf;
import defpackage.e52;
import defpackage.e6b;
import defpackage.fuf;
import defpackage.g7;
import defpackage.h4i;
import defpackage.h7i;
import defpackage.hkg;
import defpackage.ioe;
import defpackage.joa;
import defpackage.jx4;
import defpackage.krk;
import defpackage.m7i;
import defpackage.n7i;
import defpackage.n9e;
import defpackage.o1i;
import defpackage.otk;
import defpackage.qv5;
import defpackage.rp8;
import defpackage.rq3;
import defpackage.s9d;
import defpackage.sub;
import defpackage.u6b;
import defpackage.un0;
import defpackage.wca;
import defpackage.wsf;
import defpackage.x42;
import defpackage.x6i;
import defpackage.xw3;
import defpackage.y2g;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z45;
import defpackage.z8e;
import defpackage.zqb;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/main/matches/StageSeriesWeekFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lrp8;", "Ly2g;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageSeriesWeekFragment extends Hilt_StageSeriesWeekFragment<rp8> implements y2g {
    public final otk r;
    public final otk s;
    public final joa t;
    public final joa u;
    public final joa v;

    public StageSeriesWeekFragment() {
        final int i = 3;
        n7i n7iVar = new n7i(this, i);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(n7iVar, 12));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(h7i.class), new wsf(a, 25), new bte(this, a, 20), new wsf(a, 26));
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = 2;
        this.s = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new n7i(this, i2), new n7i(this, i4), new n7i(this, i3));
        this.t = ypa.a(ysaVar, new Function0(this) { // from class: i7i
            public final /* synthetic */ StageSeriesWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                StageSeriesWeekFragment stageSeriesWeekFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = stageSeriesWeekFragment.requireContext();
                        requireContext.getClass();
                        x6i x6iVar = new x6i(requireContext);
                        x6iVar.a.d = new pte(x6iVar, 29);
                        x6iVar.N(-1);
                        return x6iVar;
                    case 1:
                        int i6 = jx4.d;
                        Context requireContext2 = stageSeriesWeekFragment.requireContext();
                        requireContext2.getClass();
                        return Boolean.valueOf(rfo.L(requireContext2));
                    case 2:
                        Context requireContext3 = stageSeriesWeekFragment.requireContext();
                        requireContext3.getClass();
                        return new jx4(requireContext3);
                    default:
                        Context requireContext4 = stageSeriesWeekFragment.requireContext();
                        requireContext4.getClass();
                        return new s9d(requireContext4);
                }
            }
        });
        this.u = n9e.M(new Function0(this) { // from class: i7i
            public final /* synthetic */ StageSeriesWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                StageSeriesWeekFragment stageSeriesWeekFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = stageSeriesWeekFragment.requireContext();
                        requireContext.getClass();
                        x6i x6iVar = new x6i(requireContext);
                        x6iVar.a.d = new pte(x6iVar, 29);
                        x6iVar.N(-1);
                        return x6iVar;
                    case 1:
                        int i6 = jx4.d;
                        Context requireContext2 = stageSeriesWeekFragment.requireContext();
                        requireContext2.getClass();
                        return Boolean.valueOf(rfo.L(requireContext2));
                    case 2:
                        Context requireContext3 = stageSeriesWeekFragment.requireContext();
                        requireContext3.getClass();
                        return new jx4(requireContext3);
                    default:
                        Context requireContext4 = stageSeriesWeekFragment.requireContext();
                        requireContext4.getClass();
                        return new s9d(requireContext4);
                }
            }
        }, new Function0(this) { // from class: i7i
            public final /* synthetic */ StageSeriesWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                StageSeriesWeekFragment stageSeriesWeekFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = stageSeriesWeekFragment.requireContext();
                        requireContext.getClass();
                        x6i x6iVar = new x6i(requireContext);
                        x6iVar.a.d = new pte(x6iVar, 29);
                        x6iVar.N(-1);
                        return x6iVar;
                    case 1:
                        int i6 = jx4.d;
                        Context requireContext2 = stageSeriesWeekFragment.requireContext();
                        requireContext2.getClass();
                        return Boolean.valueOf(rfo.L(requireContext2));
                    case 2:
                        Context requireContext3 = stageSeriesWeekFragment.requireContext();
                        requireContext3.getClass();
                        return new jx4(requireContext3);
                    default:
                        Context requireContext4 = stageSeriesWeekFragment.requireContext();
                        requireContext4.getClass();
                        return new s9d(requireContext4);
                }
            }
        });
        this.v = n9e.M(new b1i(17), new Function0(this) { // from class: i7i
            public final /* synthetic */ StageSeriesWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                StageSeriesWeekFragment stageSeriesWeekFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = stageSeriesWeekFragment.requireContext();
                        requireContext.getClass();
                        x6i x6iVar = new x6i(requireContext);
                        x6iVar.a.d = new pte(x6iVar, 29);
                        x6iVar.N(-1);
                        return x6iVar;
                    case 1:
                        int i6 = jx4.d;
                        Context requireContext2 = stageSeriesWeekFragment.requireContext();
                        requireContext2.getClass();
                        return Boolean.valueOf(rfo.L(requireContext2));
                    case 2:
                        Context requireContext3 = stageSeriesWeekFragment.requireContext();
                        requireContext3.getClass();
                        return new jx4(requireContext3);
                    default:
                        Context requireContext4 = stageSeriesWeekFragment.requireContext();
                        requireContext4.getClass();
                        return new s9d(requireContext4);
                }
            }
        });
    }

    public final x6i C() {
        return (x6i) this.t.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return rp8.a(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MatchesDateNestedTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        this.i.b = Sports.MOTORSPORT;
        krk krkVar = this.l;
        krkVar.getClass();
        AbstractFragment.v(this, ((rp8) krkVar).d, null, null, 6);
        otk otkVar = this.r;
        LocalDate localDate = (LocalDate) ((h7i) otkVar.getValue()).i.getValue();
        if (localDate != null && Math.abs(ChronoUnit.WEEKS.between(localDate, LocalDate.now())) > 1) {
            l();
        }
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((rp8) krkVar2).b.setVisibility(8);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView = ((rp8) krkVar3).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        hkg.t(48, ((rp8) krkVar4).c);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((rp8) krkVar5).c.setAdapter(C());
        final int i = 1;
        C().K(this, sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.MOTORSPORT)), true);
        jx4 jx4Var = (jx4) this.u.getValue();
        if (jx4Var != null) {
            g7.o(C(), jx4Var, 6);
        }
        s9d s9dVar = (s9d) this.v.getValue();
        if (s9dVar != null) {
            g7.o(C(), s9dVar, 6);
        }
        final int i2 = 0;
        ((h7i) otkVar.getValue()).m.e(getViewLifecycleOwner(), new ioe(16, new Function1(this) { // from class: j7i
            public final /* synthetic */ StageSeriesWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        x2g x2gVar = (x2g) obj;
                        StageSeriesWeekFragment stageSeriesWeekFragment = this.b;
                        Context requireContext2 = stageSeriesWeekFragment.requireContext();
                        requireContext2.getClass();
                        x2gVar.getClass();
                        krk krkVar6 = stageSeriesWeekFragment.l;
                        krkVar6.getClass();
                        GraphicLarge graphicLarge = ((rp8) krkVar6).b;
                        krk krkVar7 = stageSeriesWeekFragment.l;
                        krkVar7.getClass();
                        y2g.d(requireContext2, x2gVar, graphicLarge, a.c(((rp8) krkVar7).c), new chf(1, stageSeriesWeekFragment, StageSeriesWeekFragment.class, "onStagesUpdated", "onStagesUpdated(Ljava/util/List;)V", 0, 15));
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            StageSeriesWeekFragment stageSeriesWeekFragment2 = this.b;
                            if (stageSeriesWeekFragment2.C().i.isEmpty()) {
                                stageSeriesWeekFragment2.u();
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        ((zqb) this.s.getValue()).i0.e(getViewLifecycleOwner(), new ioe(16, new Function1(this) { // from class: j7i
            public final /* synthetic */ StageSeriesWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        x2g x2gVar = (x2g) obj;
                        StageSeriesWeekFragment stageSeriesWeekFragment = this.b;
                        Context requireContext2 = stageSeriesWeekFragment.requireContext();
                        requireContext2.getClass();
                        x2gVar.getClass();
                        krk krkVar6 = stageSeriesWeekFragment.l;
                        krkVar6.getClass();
                        GraphicLarge graphicLarge = ((rp8) krkVar6).b;
                        krk krkVar7 = stageSeriesWeekFragment.l;
                        krkVar7.getClass();
                        y2g.d(requireContext2, x2gVar, graphicLarge, a.c(((rp8) krkVar7).c), new chf(1, stageSeriesWeekFragment, StageSeriesWeekFragment.class, "onStagesUpdated", "onStagesUpdated(Ljava/util/List;)V", 0, 15));
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            StageSeriesWeekFragment stageSeriesWeekFragment2 = this.b;
                            if (stageSeriesWeekFragment2.C().i.isEmpty()) {
                                stageSeriesWeekFragment2.u();
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
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(e52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new m7i(viewLifecycleOwner, (b1d) obj, this, null, this, 0), 3);
        e6b e6bVar2 = e6b.a;
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(x42.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(viewLifecycleOwner2.getLifecycle()), null, null, new m7i(viewLifecycleOwner2, (b1d) obj2, this, null, this, 1), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        otk otkVar = this.s;
        Boolean bool = (Boolean) ((zqb) otkVar.getValue()).i0.d();
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.c(bool, bool2)) {
            zqb zqbVar = (zqb) otkVar.getValue();
            if (zqbVar.g0) {
                zqbVar.g0 = false;
                zqbVar.h0.j(bool2);
                return;
            }
            return;
        }
        h7i h7iVar = (h7i) this.r.getValue();
        LocalDate localDate = (LocalDate) h7iVar.i.getValue();
        if (localDate == null) {
            return;
        }
        xw3.L(un0.z(h7iVar), z45.a, null, new h4i(localDate, h7iVar, (rq3) null, 3), 2);
    }
}
