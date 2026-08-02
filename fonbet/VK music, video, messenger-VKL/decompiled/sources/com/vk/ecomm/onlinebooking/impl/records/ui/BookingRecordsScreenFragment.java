package com.vk.ecomm.onlinebooking.impl.records.ui;

import android.os.Bundle;
import android.view.View;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import com.vk.movika.sdk.base.observable.w;
import com.vk.mvi.androidx.MviImplFragment;
import defpackage.i;
import defpackage.j;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.bpn0;
import xsna.bs7;
import xsna.dv7;
import xsna.e5;
import xsna.ev7;
import xsna.fpf0;
import xsna.g5z;
import xsna.hv7;
import xsna.ikv0;
import xsna.km50;
import xsna.mk50;
import xsna.msy;
import xsna.nf3;
import xsna.nv7;
import xsna.nw7;
import xsna.oz50;
import xsna.qcy;
import xsna.vk50;
import xsna.w8;

/* compiled from: BookingRecordsScreenFragment.kt */
/* loaded from: classes.dex */
public final class BookingRecordsScreenFragment extends MviImplFragment<ev7, nw7, dv7> implements bs7 {
    public static final /* synthetic */ qcy<Object>[] V;
    public final b.d Q = b.d.b;
    public final nf3 R = new nf3();
    public final bpn0 S = new bpn0(new i(this, 9));
    public final Object T = msy.a(LazyThreadSafetyMode.NONE, new j(this, 10));
    public ikv0 U;

    /* compiled from: BookingRecordsScreenFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(BookingRecordsScreenFragment.class, "contentView", "getContentView()Lcom/vk/ecomm/onlinebooking/impl/records/ui/BookingRecordsScreenMviView;", 0);
        fpf0.a.getClass();
        V = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        nv7 nv7Var = new nv7(requireContext(), getViewLifecycleOwner());
        qcy<Object> qcyVar = V[0];
        nf3 nf3Var = this.R;
        nf3Var.c = nv7Var;
        return new mk50.c(((nv7) nf3Var.getValue(this, qcyVar)).getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((nv7) this.R.getValue(this, V[0])).f((nw7) ao50Var, new hv7(this));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ev7 ev7Var = (ev7) vk50Var;
        ev7Var.W().a(new w8(this, 12), this);
        ev7Var.V().a(new e5(this, 11), this);
        ev7Var.U().a(new w(this, 9), this);
    }

    @Override // xsna.bs7
    public final b X9() {
        return this.Q;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        getFeature().C(dv7.e.b);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        ikv0 ikv0Var = this.U;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new ev7(new dv7.f((BookingScreenParams) this.S.getValue()), g5z.a(this), ((OnlineBookingInternalComponent) this.T.getValue()).Kf());
    }
}
