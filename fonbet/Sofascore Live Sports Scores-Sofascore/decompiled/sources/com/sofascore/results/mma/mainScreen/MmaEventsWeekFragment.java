package com.sofascore.results.mma.mainScreen;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.mma.mainScreen.MmaEventsWeekFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import defpackage.ad2;
import defpackage.b1c;
import defpackage.b1d;
import defpackage.beh;
import defpackage.dmc;
import defpackage.duf;
import defpackage.e52;
import defpackage.e6b;
import defpackage.emc;
import defpackage.fuf;
import defpackage.g7;
import defpackage.hkg;
import defpackage.imc;
import defpackage.ixa;
import defpackage.j29;
import defpackage.jmc;
import defpackage.joa;
import defpackage.jx4;
import defpackage.krk;
import defpackage.llc;
import defpackage.n9e;
import defpackage.nmc;
import defpackage.otk;
import defpackage.q7c;
import defpackage.qv5;
import defpackage.rp8;
import defpackage.rq3;
import defpackage.s9d;
import defpackage.sub;
import defpackage.u6b;
import defpackage.un0;
import defpackage.va8;
import defpackage.vxd;
import defpackage.wca;
import defpackage.wya;
import defpackage.xw3;
import defpackage.y2g;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1;
import defpackage.z8e;
import defpackage.zqb;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/mma/mainScreen/MmaEventsWeekFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lrp8;", "Ly2g;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaEventsWeekFragment extends Hilt_MmaEventsWeekFragment<rp8> implements y2g {
    public final otk r;
    public final otk s;
    public final otk t;
    public final joa u;
    public final joa v;
    public final joa w;
    public final joa x;

    public MmaEventsWeekFragment() {
        imc imcVar = new imc(this, 6);
        ysa ysaVar = ysa.c;
        final int i = 0;
        joa a = ypa.a(ysaVar, new jmc(imcVar, 0));
        fuf fufVar = duf.a;
        final int i2 = 1;
        final int i3 = 2;
        this.r = new otk(fufVar.getOrCreateKotlinClass(nmc.class), new llc(a, 1), new wya(9, this, a), new llc(a, 2));
        this.s = new otk(fufVar.getOrCreateKotlinClass(emc.class), new imc(this, 0), new imc(this, 2), new imc(this, 1));
        final int i4 = 3;
        this.t = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new imc(this, 3), new imc(this, 5), new imc(this, 4));
        this.u = ypa.a(ysaVar, new Function0(this) { // from class: gmc
            public final /* synthetic */ MmaEventsWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                MmaEventsWeekFragment mmaEventsWeekFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = mmaEventsWeekFragment.requireContext();
                        requireContext.getClass();
                        dmc dmcVar = new dmc(requireContext);
                        dmcVar.a.d = new bba(dmcVar, 12);
                        dmcVar.N(-1);
                        return dmcVar;
                    case 1:
                        int i6 = jx4.d;
                        Context requireContext2 = mmaEventsWeekFragment.requireContext();
                        requireContext2.getClass();
                        return Boolean.valueOf(rfo.L(requireContext2));
                    case 2:
                        Context requireContext3 = mmaEventsWeekFragment.requireContext();
                        requireContext3.getClass();
                        return new jx4(requireContext3);
                    default:
                        Context requireContext4 = mmaEventsWeekFragment.requireContext();
                        requireContext4.getClass();
                        return new s9d(requireContext4);
                }
            }
        });
        this.v = ypa.a(ysaVar, new b1c(22));
        this.w = n9e.M(new Function0(this) { // from class: gmc
            public final /* synthetic */ MmaEventsWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                MmaEventsWeekFragment mmaEventsWeekFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = mmaEventsWeekFragment.requireContext();
                        requireContext.getClass();
                        dmc dmcVar = new dmc(requireContext);
                        dmcVar.a.d = new bba(dmcVar, 12);
                        dmcVar.N(-1);
                        return dmcVar;
                    case 1:
                        int i6 = jx4.d;
                        Context requireContext2 = mmaEventsWeekFragment.requireContext();
                        requireContext2.getClass();
                        return Boolean.valueOf(rfo.L(requireContext2));
                    case 2:
                        Context requireContext3 = mmaEventsWeekFragment.requireContext();
                        requireContext3.getClass();
                        return new jx4(requireContext3);
                    default:
                        Context requireContext4 = mmaEventsWeekFragment.requireContext();
                        requireContext4.getClass();
                        return new s9d(requireContext4);
                }
            }
        }, new Function0(this) { // from class: gmc
            public final /* synthetic */ MmaEventsWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                MmaEventsWeekFragment mmaEventsWeekFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = mmaEventsWeekFragment.requireContext();
                        requireContext.getClass();
                        dmc dmcVar = new dmc(requireContext);
                        dmcVar.a.d = new bba(dmcVar, 12);
                        dmcVar.N(-1);
                        return dmcVar;
                    case 1:
                        int i6 = jx4.d;
                        Context requireContext2 = mmaEventsWeekFragment.requireContext();
                        requireContext2.getClass();
                        return Boolean.valueOf(rfo.L(requireContext2));
                    case 2:
                        Context requireContext3 = mmaEventsWeekFragment.requireContext();
                        requireContext3.getClass();
                        return new jx4(requireContext3);
                    default:
                        Context requireContext4 = mmaEventsWeekFragment.requireContext();
                        requireContext4.getClass();
                        return new s9d(requireContext4);
                }
            }
        });
        this.x = n9e.M(new b1c(23), new Function0(this) { // from class: gmc
            public final /* synthetic */ MmaEventsWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                MmaEventsWeekFragment mmaEventsWeekFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = mmaEventsWeekFragment.requireContext();
                        requireContext.getClass();
                        dmc dmcVar = new dmc(requireContext);
                        dmcVar.a.d = new bba(dmcVar, 12);
                        dmcVar.N(-1);
                        return dmcVar;
                    case 1:
                        int i6 = jx4.d;
                        Context requireContext2 = mmaEventsWeekFragment.requireContext();
                        requireContext2.getClass();
                        return Boolean.valueOf(rfo.L(requireContext2));
                    case 2:
                        Context requireContext3 = mmaEventsWeekFragment.requireContext();
                        requireContext3.getClass();
                        return new jx4(requireContext3);
                    default:
                        Context requireContext4 = mmaEventsWeekFragment.requireContext();
                        requireContext4.getClass();
                        return new s9d(requireContext4);
                }
            }
        });
    }

    public final dmc C() {
        return (dmc) this.u.getValue();
    }

    public final void D(String str, List list) {
        Date parse;
        if (!list.isEmpty()) {
            C().F(list);
            return;
        }
        joa joaVar = this.v;
        if (str != null && (parse = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str)) != null) {
            LocalDate o = vxd.o(parse.toInstant());
            ((j29) joaVar.getValue()).d = Integer.valueOf(R.string.mma_view_previous_events_button);
            ((j29) joaVar.getValue()).f = new ixa(13, this, o);
        }
        C().F(a.c((j29) joaVar.getValue()));
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
        this.i.b = Sports.MMA;
        krk krkVar = this.l;
        krkVar.getClass();
        AbstractFragment.v(this, ((rp8) krkVar).d, null, null, 6);
        otk otkVar = this.r;
        LocalDate localDate = (LocalDate) ((nmc) otkVar.getValue()).h.getValue();
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
        C().K(this, sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.MMA)), true);
        jx4 jx4Var = (jx4) this.w.getValue();
        if (jx4Var != null) {
            g7.o(C(), jx4Var, 6);
        }
        s9d s9dVar = (s9d) this.x.getValue();
        if (s9dVar != null) {
            g7.o(C(), s9dVar, 6);
        }
        final int i2 = 0;
        ((nmc) otkVar.getValue()).j.e(getViewLifecycleOwner(), new z1(24, new Function1(this) { // from class: hmc
            public final /* synthetic */ MmaEventsWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                MmaEventsWeekFragment mmaEventsWeekFragment = this.b;
                switch (i3) {
                    case 0:
                        lmc lmcVar = (lmc) obj;
                        x2g x2gVar = lmcVar.a;
                        String str = lmcVar.b;
                        mmaEventsWeekFragment.n();
                        if (x2gVar instanceof r2g) {
                            mmaEventsWeekFragment.D(str, km5.a);
                        } else {
                            Context requireContext2 = mmaEventsWeekFragment.requireContext();
                            requireContext2.getClass();
                            krk krkVar6 = mmaEventsWeekFragment.l;
                            krkVar6.getClass();
                            GraphicLarge graphicLarge = ((rp8) krkVar6).b;
                            krk krkVar7 = mmaEventsWeekFragment.l;
                            krkVar7.getClass();
                            y2g.d(requireContext2, x2gVar, graphicLarge, a.c(((rp8) krkVar7).c), new lsb(6, mmaEventsWeekFragment, str));
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue() && mmaEventsWeekFragment.C().i.isEmpty()) {
                            mmaEventsWeekFragment.u();
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        ((zqb) this.t.getValue()).i0.e(getViewLifecycleOwner(), new z1(24, new Function1(this) { // from class: hmc
            public final /* synthetic */ MmaEventsWeekFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                MmaEventsWeekFragment mmaEventsWeekFragment = this.b;
                switch (i3) {
                    case 0:
                        lmc lmcVar = (lmc) obj;
                        x2g x2gVar = lmcVar.a;
                        String str = lmcVar.b;
                        mmaEventsWeekFragment.n();
                        if (x2gVar instanceof r2g) {
                            mmaEventsWeekFragment.D(str, km5.a);
                        } else {
                            Context requireContext2 = mmaEventsWeekFragment.requireContext();
                            requireContext2.getClass();
                            krk krkVar6 = mmaEventsWeekFragment.l;
                            krkVar6.getClass();
                            GraphicLarge graphicLarge = ((rp8) krkVar6).b;
                            krk krkVar7 = mmaEventsWeekFragment.l;
                            krkVar7.getClass();
                            y2g.d(requireContext2, x2gVar, graphicLarge, a.c(((rp8) krkVar7).c), new lsb(6, mmaEventsWeekFragment, str));
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue() && mmaEventsWeekFragment.C().i.isEmpty()) {
                            mmaEventsWeekFragment.u();
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
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(e52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new va8(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        otk otkVar = this.t;
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
        nmc nmcVar = (nmc) this.r.getValue();
        LocalDate localDate = (LocalDate) nmcVar.h.getValue();
        if (localDate == null) {
            return;
        }
        xw3.L(un0.z(nmcVar), null, null, new q7c(localDate, nmcVar, (rq3) null, 1), 3);
    }
}
