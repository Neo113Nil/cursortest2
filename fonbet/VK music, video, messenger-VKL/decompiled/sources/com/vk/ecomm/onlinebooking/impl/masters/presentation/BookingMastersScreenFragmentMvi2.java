package com.vk.ecomm.onlinebooking.impl.masters.presentation;

import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.bs7;
import xsna.cr7;
import xsna.fpf0;
import xsna.in0;
import xsna.ji0;
import xsna.kai;
import xsna.msy;
import xsna.mzp0;
import xsna.nzw;
import xsna.or7;
import xsna.oz50;
import xsna.qcy;
import xsna.ry0;
import xsna.rzp0;
import xsna.s200;
import xsna.s4;
import xsna.vq;
import xsna.yw90;
import xsna.zrd0;

/* compiled from: BookingMastersScreenFragmentMvi2.kt */
/* loaded from: classes.dex */
public final class BookingMastersScreenFragmentMvi2 extends FragmentImpl implements bs7 {
    public static final /* synthetic */ qcy<Object>[] S;
    public final bpn0 N = new bpn0(new s4(this, 12));
    public final Object O = msy.a(LazyThreadSafetyMode.NONE, new ry0(this, 9));
    public final b.d P;
    public final nzw Q;
    public final bpn0 R;

    /* compiled from: BookingMastersScreenFragmentMvi2.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BookingMastersScreenFragmentMvi2.class, "bookingMastersStore", "getBookingMastersStore()Lcom/vk/ecomm/onlinebooking/impl/masters/presentation/mvi2/BookingMastersScreenStore;", 0);
        fpf0.a.getClass();
        S = new qcy[]{propertyReference1Impl};
    }

    public BookingMastersScreenFragmentMvi2() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MARKET_ONLINE_BOOKING_MASTERS, null, false, 62).g();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.MARKET_ONLINE_BOOKING_MASTERS).j();
        yw90Var.init();
        this.L = yw90Var;
        this.P = b.d.b;
        this.Q = s200.M(this, fpf0.d(or7.class).toString(), new ji0(this, 10));
        this.R = new bpn0(new in0(this, 11));
    }

    @Override // xsna.bs7
    public final b X9() {
        return this.P;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        vq.b(-1, -1, composeView);
        composeView.setContent(kai.b(179436386, new cr7(this, this.J, On(), 0)));
        return composeView;
    }
}
