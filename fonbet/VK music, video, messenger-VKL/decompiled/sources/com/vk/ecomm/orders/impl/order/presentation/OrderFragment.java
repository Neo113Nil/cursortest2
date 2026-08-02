package com.vk.ecomm.orders.impl.order.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b010;
import xsna.bi80;
import xsna.bpn0;
import xsna.c950;
import xsna.cf00;
import xsna.dj60;
import xsna.f540;
import xsna.fpf0;
import xsna.hvz;
import xsna.ix80;
import xsna.jai;
import xsna.jkg;
import xsna.nef;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.ru80;
import xsna.sim;
import xsna.su80;
import xsna.tu80;
import xsna.u110;
import xsna.w8i;
import xsna.wm80;
import xsna.x550;

/* compiled from: OrderFragment.kt */
/* loaded from: classes18.dex */
public final class OrderFragment extends FragmentImpl implements w8i {
    public static final /* synthetic */ qcy<Object>[] Y;
    public final bpn0 N = new bpn0(new su80(this, 0));
    public final bpn0 O = new bpn0(new c950(this, 10));
    public final bpn0 P = new bpn0(new nef(this, 28));
    public final bpn0 Q = new bpn0(new sim(this, 29));
    public final bpn0 R = new bpn0(new tu80(this, 0));
    public final bpn0 S = new bpn0(new dj60(this, 4));
    public final bpn0 T = new bpn0(new bi80(this, 2));
    public final bpn0 U = new bpn0(new b010(this, 21));
    public final nzw V = new nzw(fpf0.d(ix80.class).toString(), this, new cf00(this, 13));
    public final bpn0 W = new bpn0(new u110(this, 6));
    public final bpn0 X = new bpn0(new wm80(this, 1));

    /* compiled from: OrderFragment.kt */
    public static final class a extends oz50 {
        public a(OrderArguments orderArguments) {
            super(OrderFragment.class, null, null);
            Bundle bundle = this.j;
            bundle.putParcelable("group_id", orderArguments.b);
            bundle.putInt("order_id", orderArguments.c);
            bundle.putString("displayed_id", orderArguments.d);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(OrderFragment.class, "orderStore", "getOrderStore()Lcom/vk/ecomm/orders/impl/order/presentation/mvi/OrderStore;", 0);
        fpf0.a.getClass();
        Y = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ru80 ru80Var = (ru80) this.X.getValue();
        ru80Var.b.b(i, intent, new hvz(ru80Var, 19), new f540(ru80Var, 9), new x550(ru80Var, 10));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(-732787488, new jkg(this, 9), true));
        return composeView;
    }
}
