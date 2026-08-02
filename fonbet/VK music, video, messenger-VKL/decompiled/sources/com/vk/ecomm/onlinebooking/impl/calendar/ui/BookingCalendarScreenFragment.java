package com.vk.ecomm.onlinebooking.impl.calendar.ui;

import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.ecomm.onlinebooking.impl.calendar.a;
import com.vk.ecomm.onlinebooking.impl.calendar.d;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import com.vk.mvi.androidx.MviImplFragment;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.bmv;
import xsna.bpn0;
import xsna.bs7;
import xsna.fpf0;
import xsna.g5z;
import xsna.km50;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.nf3;
import xsna.no;
import xsna.op1;
import xsna.oz50;
import xsna.pn7;
import xsna.qcy;
import xsna.rj1;
import xsna.rzp0;
import xsna.td5;
import xsna.tn7;
import xsna.vk50;
import xsna.yw90;
import xsna.zrd0;

/* compiled from: BookingCalendarScreenFragment.kt */
/* loaded from: classes.dex */
public final class BookingCalendarScreenFragment extends MviImplFragment<d, tn7, com.vk.ecomm.onlinebooking.impl.calendar.a> implements bs7 {
    public static final /* synthetic */ qcy<Object>[] U;
    public final b.a Q = new b.a(7);
    public final nf3 R = new nf3();
    public final bpn0 S;
    public final Object T;

    /* compiled from: BookingCalendarScreenFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(BookingCalendarScreenFragment.class, "contentView", "getContentView()Lcom/vk/ecomm/onlinebooking/impl/calendar/ui/BookingCalendarScreenMviView;", 0);
        fpf0.a.getClass();
        U = new qcy[]{mutablePropertyReference1Impl};
    }

    public BookingCalendarScreenFragment() {
        int i = 9;
        this.S = new bpn0(new rj1(this, i));
        this.T = msy.a(LazyThreadSafetyMode.NONE, new no(this, i));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MARKET_ONLINE_BOOKING_CALENDAR, null, false, 62).g();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.MARKET_ONLINE_BOOKING_CALENDAR).j();
        yw90Var.init();
        this.L = yw90Var;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        pn7 pn7Var = new pn7(getViewLifecycleOwner(), requireContext(), this.J, On());
        qcy<Object> qcyVar = U[0];
        nf3 nf3Var = this.R;
        nf3Var.c = pn7Var;
        return new mk50.c(((pn7) nf3Var.getValue(this, qcyVar)).getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((pn7) this.R.getValue(this, U[0])).f((tn7) ao50Var, new td5(this));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        d dVar = (d) vk50Var;
        dVar.V().a(new op1(this, 7), this);
        dVar.U().a(new com.vk.movika.sdk.base.logic.interactor.d(this, 15), this);
    }

    @Override // xsna.bs7
    public final b X9() {
        return this.Q;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        getFeature().C(a.b.b);
        return true;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        boolean z = bundle.getBoolean("isMasterChangeable", true);
        bpn0 bpn0Var = this.S;
        return new d(new a.c((BookingScreenParams) bpn0Var.getValue()), g5z.a(this), ((OnlineBookingInternalComponent) this.T.getValue()).Ff().a(((BookingScreenParams) bpn0Var.getValue()).f()), new bmv.a((BookingScreenParams) bpn0Var.getValue(), z && ((BookingScreenParams) bpn0Var.getValue()).f() == BookingServiceType.INDIVIDUAL, bundle.getBoolean("isServiceChangeable", true), bundle.getBoolean("isEmptyDate", false)), this.J);
    }
}
