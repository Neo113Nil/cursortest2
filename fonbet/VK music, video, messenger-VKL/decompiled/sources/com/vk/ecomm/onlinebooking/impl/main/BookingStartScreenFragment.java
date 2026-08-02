package com.vk.ecomm.onlinebooking.impl.main;

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
import xsna.fpf0;
import xsna.kai;
import xsna.msy;
import xsna.mzp0;
import xsna.nzw;
import xsna.o54;
import xsna.oz50;
import xsna.qc;
import xsna.qcy;
import xsna.rzp0;
import xsna.s200;
import xsna.s5;
import xsna.t5;
import xsna.vq;
import xsna.yw90;
import xsna.yz7;
import xsna.zrd0;

/* compiled from: BookingStartScreenFragment.kt */
/* loaded from: classes.dex */
public final class BookingStartScreenFragment extends FragmentImpl implements bs7 {
    public static final /* synthetic */ qcy<Object>[] S;
    public final b.e N;
    public final bpn0 O;
    public final Object P;
    public final nzw Q;
    public final bpn0 R;

    /* compiled from: BookingStartScreenFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BookingStartScreenFragment.class, "bookingStartStore", "getBookingStartStore()Lcom/vk/ecomm/onlinebooking/impl/main/presentation/mvi2/BookingStartScreenStore;", 0);
        fpf0.a.getClass();
        S = new qcy[]{propertyReference1Impl};
    }

    public BookingStartScreenFragment() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MARKET_ONLINE_BOOKING_MENU, null, false, 62).g();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.MARKET_ONLINE_BOOKING_MENU).j();
        yw90Var.init();
        this.L = yw90Var;
        this.N = b.e.b;
        this.O = new bpn0(new qc(this, 6));
        int i = 11;
        this.P = msy.a(LazyThreadSafetyMode.NONE, new s5(this, i));
        this.Q = s200.M(this, fpf0.d(yz7.class).toString(), new t5(this, 12));
        this.R = new bpn0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, i));
    }

    @Override // xsna.bs7
    public final b X9() {
        return this.N;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        vq.b(-1, -1, composeView);
        composeView.setContent(kai.b(-1670005600, new o54(this, this.J, On())));
        return composeView;
    }
}
