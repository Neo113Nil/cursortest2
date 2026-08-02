package com.vk.ecomm.onlinebooking.impl.preloader.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.bs7;
import xsna.fpf0;
import xsna.jai;
import xsna.msy;
import xsna.nw6;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.u40;
import xsna.us7;
import xsna.v40;
import xsna.w40;
import xsna.xs6;

/* compiled from: BookingPreloaderFragment.kt */
/* loaded from: classes18.dex */
public final class BookingPreloaderFragment extends FragmentImpl implements bs7 {
    public static final /* synthetic */ qcy<Object>[] S;
    public final bpn0 N = new bpn0(new u40(this, 7));
    public final Object O = msy.a(LazyThreadSafetyMode.NONE, new v40(this, 8));
    public final b.g P = b.g.b;
    public final nzw Q = new nzw(fpf0.d(us7.class).toString(), this, new w40(this, 13));
    public final bpn0 R = new bpn0(new xs6(1));

    /* compiled from: BookingPreloaderFragment.kt */
    public static final class a extends oz50 {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BookingPreloaderFragment.class, "bookingPreloaderStore", "getBookingPreloaderStore()Lcom/vk/ecomm/onlinebooking/impl/preloader/presentation/BookingPreloaderStore;", 0);
        fpf0.a.getClass();
        S = new qcy[]{propertyReference1Impl};
    }

    @Override // xsna.bs7
    public final b X9() {
        return this.P;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(22948205, new nw6(this, 1), true));
        return composeView;
    }
}
