package com.sofascore.results.event.mmastatistics;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.sofascore.results.event.mmastatistics.EventMmaStatisticsFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.a70;
import defpackage.ce4;
import defpackage.d46;
import defpackage.duf;
import defpackage.fuf;
import defpackage.jk;
import defpackage.joa;
import defpackage.jrc;
import defpackage.knc;
import defpackage.krk;
import defpackage.mqi;
import defpackage.mr5;
import defpackage.n9e;
import defpackage.nq8;
import defpackage.otk;
import defpackage.ph0;
import defpackage.rq3;
import defpackage.un0;
import defpackage.w36;
import defpackage.x36;
import defpackage.xw3;
import defpackage.y7;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z36;
import defpackage.zic;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/mmastatistics/EventMmaStatisticsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lknc;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventMmaStatisticsFragment extends Hilt_EventMmaStatisticsFragment<knc> {
    public final otk r;
    public final otk s;
    public jrc t;
    public final mqi u;
    public final mqi v;
    public final joa w;

    public EventMmaStatisticsFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.r = new otk(fufVar.getOrCreateKotlinClass(d46.class), new z36(this, i), new z36(this, i3), new z36(this, i2));
        final int i4 = 3;
        this.s = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new z36(this, i4), new z36(this, 5), new z36(this, 4));
        this.u = ypa.b(new Function0(this) { // from class: y36
            public final /* synthetic */ EventMmaStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                EventMmaStatisticsFragment eventMmaStatisticsFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = eventMmaStatisticsFragment.requireContext();
                        requireContext.getClass();
                        MmaEvent C = eventMmaStatisticsFragment.C();
                        krk krkVar = eventMmaStatisticsFragment.l;
                        krkVar.getClass();
                        return new jnc(requireContext, C, ((knc) krkVar).e);
                    case 1:
                        Context requireContext2 = eventMmaStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(2013078957, new fv2(eventMmaStatisticsFragment, 20), true));
                        return composeView;
                    case 2:
                        return Boolean.valueOf(eventMmaStatisticsFragment.D() == jrc.c);
                    default:
                        Context requireContext3 = eventMmaStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.a();
                        g5kVar.d = new x36(eventMmaStatisticsFragment, 2);
                        g5kVar.m = new ur1(eventMmaStatisticsFragment, 4);
                        g5kVar.g = new tc3(-658774606, new s16(eventMmaStatisticsFragment, 1), true);
                        g5kVar.b();
                        return typeHeaderView;
                }
            }
        });
        this.v = ypa.b(new Function0(this) { // from class: y36
            public final /* synthetic */ EventMmaStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                EventMmaStatisticsFragment eventMmaStatisticsFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = eventMmaStatisticsFragment.requireContext();
                        requireContext.getClass();
                        MmaEvent C = eventMmaStatisticsFragment.C();
                        krk krkVar = eventMmaStatisticsFragment.l;
                        krkVar.getClass();
                        return new jnc(requireContext, C, ((knc) krkVar).e);
                    case 1:
                        Context requireContext2 = eventMmaStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(2013078957, new fv2(eventMmaStatisticsFragment, 20), true));
                        return composeView;
                    case 2:
                        return Boolean.valueOf(eventMmaStatisticsFragment.D() == jrc.c);
                    default:
                        Context requireContext3 = eventMmaStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.a();
                        g5kVar.d = new x36(eventMmaStatisticsFragment, 2);
                        g5kVar.m = new ur1(eventMmaStatisticsFragment, 4);
                        g5kVar.g = new tc3(-658774606, new s16(eventMmaStatisticsFragment, 1), true);
                        g5kVar.b();
                        return typeHeaderView;
                }
            }
        });
        this.w = n9e.M(new Function0(this) { // from class: y36
            public final /* synthetic */ EventMmaStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                EventMmaStatisticsFragment eventMmaStatisticsFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = eventMmaStatisticsFragment.requireContext();
                        requireContext.getClass();
                        MmaEvent C = eventMmaStatisticsFragment.C();
                        krk krkVar = eventMmaStatisticsFragment.l;
                        krkVar.getClass();
                        return new jnc(requireContext, C, ((knc) krkVar).e);
                    case 1:
                        Context requireContext2 = eventMmaStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(2013078957, new fv2(eventMmaStatisticsFragment, 20), true));
                        return composeView;
                    case 2:
                        return Boolean.valueOf(eventMmaStatisticsFragment.D() == jrc.c);
                    default:
                        Context requireContext3 = eventMmaStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.a();
                        g5kVar.d = new x36(eventMmaStatisticsFragment, 2);
                        g5kVar.m = new ur1(eventMmaStatisticsFragment, 4);
                        g5kVar.g = new tc3(-658774606, new s16(eventMmaStatisticsFragment, 1), true);
                        g5kVar.b();
                        return typeHeaderView;
                }
            }
        }, new Function0(this) { // from class: y36
            public final /* synthetic */ EventMmaStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                EventMmaStatisticsFragment eventMmaStatisticsFragment = this.b;
                switch (i5) {
                    case 0:
                        Context requireContext = eventMmaStatisticsFragment.requireContext();
                        requireContext.getClass();
                        MmaEvent C = eventMmaStatisticsFragment.C();
                        krk krkVar = eventMmaStatisticsFragment.l;
                        krkVar.getClass();
                        return new jnc(requireContext, C, ((knc) krkVar).e);
                    case 1:
                        Context requireContext2 = eventMmaStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(2013078957, new fv2(eventMmaStatisticsFragment, 20), true));
                        return composeView;
                    case 2:
                        return Boolean.valueOf(eventMmaStatisticsFragment.D() == jrc.c);
                    default:
                        Context requireContext3 = eventMmaStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext3, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.a();
                        g5kVar.d = new x36(eventMmaStatisticsFragment, 2);
                        g5kVar.m = new ur1(eventMmaStatisticsFragment, 4);
                        g5kVar.g = new tc3(-658774606, new s16(eventMmaStatisticsFragment, 1), true);
                        g5kVar.b();
                        return typeHeaderView;
                }
            }
        });
    }

    public final MmaEvent C() {
        Object d = ((mr5) this.s.getValue()).v.d();
        if (d == null) {
            a70.r("Required value was null.");
            return null;
        }
        Event event = (Event) d;
        if (event instanceof MmaEvent) {
            return (MmaEvent) event;
        }
        a70.p("Failed requirement.");
        return null;
    }

    public final jrc D() {
        zic zicVar = jrc.a;
        Status status = C().getStatus();
        zicVar.getClass();
        status.getClass();
        return ph0.a0(new String[]{StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_WILL_CONTINUE, StatusKt.STATUS_FINISHED, StatusKt.STATUS_INTERRUPTED}).contains(status.getType()) ? jrc.c : jrc.b;
    }

    public final void E() {
        if (D() != this.t) {
            this.t = D();
            krk krkVar = this.l;
            krkVar.getClass();
            ((knc) krkVar).b.removeAllViews();
            if (D() == jrc.b) {
                krk krkVar2 = this.l;
                krkVar2.getClass();
                ((knc) krkVar2).b.addView((ComposeView) this.v.getValue());
            } else {
                TypeHeaderView typeHeaderView = (TypeHeaderView) this.w.getValue();
                if (typeHeaderView != null) {
                    krk krkVar3 = this.l;
                    krkVar3.getClass();
                    ((knc) krkVar3).b.addView(typeHeaderView);
                }
            }
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.mma_fight_statistics_fragment_layout, (ViewGroup) null, false);
        int i = R.id.header;
        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.header, inflate);
        if (frameLayout != null) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
            i = R.id.scroll_view;
            NestedScrollView nestedScrollView = (NestedScrollView) nq8.B(R.id.scroll_view, inflate);
            if (nestedScrollView != null) {
                i = R.id.stats_container;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.stats_container, inflate);
                if (linearLayout != null) {
                    return new knc(swipeRefreshLayout, frameLayout, swipeRefreshLayout, nestedScrollView, linearLayout);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "StatisticsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        ((knc) krkVar).e.getLayoutTransition().setAnimateParentHierarchy(false);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((knc) krkVar2).e.getLayoutTransition().enableTransitionType(4);
        float dimension = getResources().getDimension(R.dimen.header_elevation);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((knc) krkVar3).d.setOnScrollChangeListener(new w36(dimension, this));
        ((d46) this.r.getValue()).h.e(getViewLifecycleOwner(), new y7(18, new x36(this, 1)));
        krk krkVar4 = this.l;
        krkVar4.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((knc) krkVar4).c;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        E();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        jrc D = D();
        jrc jrcVar = jrc.c;
        rq3 rq3Var = null;
        otk otkVar = this.r;
        if (D == jrcVar) {
            d46 d46Var = (d46) otkVar.getValue();
            xw3.L(un0.z(d46Var), null, null, new ce4(d46Var, C(), rq3Var, 16), 3);
        } else {
            if (((d46) otkVar.getValue()).h.d() != null) {
                n();
                return;
            }
            d46 d46Var2 = (d46) otkVar.getValue();
            xw3.L(un0.z(d46Var2), null, null, new jk(d46Var2, C(), rq3Var, 7), 3);
        }
    }
}
