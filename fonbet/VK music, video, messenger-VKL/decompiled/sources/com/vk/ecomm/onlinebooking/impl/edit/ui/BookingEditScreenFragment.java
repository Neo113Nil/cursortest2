package com.vk.ecomm.onlinebooking.impl.edit.ui;

import android.os.Bundle;
import android.view.View;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import com.vk.mvi.androidx.MviImplFragment;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.ap7;
import xsna.bpn0;
import xsna.bs7;
import xsna.cmv;
import xsna.dmv;
import xsna.fpf0;
import xsna.g5z;
import xsna.g76;
import xsna.gl6;
import xsna.hq7;
import xsna.i50;
import xsna.ikv0;
import xsna.ka;
import xsna.ka0;
import xsna.km50;
import xsna.mk50;
import xsna.msy;
import xsna.nf3;
import xsna.oz50;
import xsna.qcy;
import xsna.vf0;
import xsna.vk50;
import xsna.xm1;
import xsna.yp7;

/* compiled from: BookingEditScreenFragment.kt */
/* loaded from: classes.dex */
public final class BookingEditScreenFragment extends MviImplFragment<com.vk.ecomm.onlinebooking.impl.edit.b, hq7, com.vk.ecomm.onlinebooking.impl.edit.a> implements bs7 {
    public static final /* synthetic */ qcy<Object>[] W;
    public ikv0 S;
    public final Object U;
    public final Object V;
    public final b.C0978b Q = new b.C0978b(3);
    public final nf3 R = new nf3();
    public final bpn0 T = new bpn0(new xm1(this, 7));

    /* compiled from: BookingEditScreenFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
    }

    /* compiled from: BookingEditScreenFragment.kt */
    /* loaded from: classes18.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingServiceType.values().length];
            try {
                iArr[BookingServiceType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingServiceType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(BookingEditScreenFragment.class, "contentView", "getContentView()Lcom/vk/ecomm/onlinebooking/impl/edit/ui/BookingEditScreenMviView;", 0);
        fpf0.a.getClass();
        W = new qcy[]{mutablePropertyReference1Impl};
    }

    public BookingEditScreenFragment() {
        ka0 ka0Var = new ka0(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, ka0Var);
        this.V = msy.a(lazyThreadSafetyMode, new vf0(this, 10));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        yp7 yp7Var = new yp7(requireContext(), getViewLifecycleOwner());
        qcy<Object> qcyVar = W[0];
        nf3 nf3Var = this.R;
        nf3Var.c = yp7Var;
        return new mk50.c(((yp7) nf3Var.getValue(this, qcyVar)).getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((yp7) this.R.getValue(this, W[0])).f((hq7) ao50Var, new gl6(this));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        com.vk.ecomm.onlinebooking.impl.edit.b bVar = (com.vk.ecomm.onlinebooking.impl.edit.b) vk50Var;
        bVar.W().a(new ka(this, 8), this);
        bVar.V().a(new com.vk.voip.ui.menu.feature.a(this, 7), this);
        bVar.U().a(new i50(this, 7), this);
    }

    @Override // xsna.bs7
    public final com.vk.ecomm.onlinebooking.impl.navhostfragment.b X9() {
        return this.Q;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        getFeature().C(a.g.c.b);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        ikv0 ikv0Var = this.S;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        dmv a2;
        boolean z = bundle.getBoolean("isRescheduling");
        boolean z2 = bundle.getBoolean("isRebooking");
        BookingEditModel.EditMode editMode = z ? BookingEditModel.EditMode.Reschedule : BookingEditModel.EditMode.Edit;
        ?? r0 = this.U;
        ap7 Hf = ((OnlineBookingInternalComponent) r0.getValue()).Hf();
        bpn0 bpn0Var = this.T;
        g76 a3 = Hf.a(((BookingScreenParams) bpn0Var.getValue()).f());
        int i = b.$EnumSwitchMapping$0[((BookingScreenParams) bpn0Var.getValue()).f().ordinal()];
        if (i == 1) {
            a2 = ((OnlineBookingInternalComponent) r0.getValue()).Lf().a(null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a2 = ((OnlineBookingInternalComponent) r0.getValue()).If().a(null);
        }
        return new com.vk.ecomm.onlinebooking.impl.edit.b((BookingScreenParams) bpn0Var.getValue(), g5z.a(this), new cmv.b((BookingScreenParams) bpn0Var.getValue(), editMode, z2), a3, ((OnlineBookingInternalComponent) r0.getValue()).Mf(), a2, ((LinksBridgeComponent) this.V.getValue()).p().a());
    }
}
