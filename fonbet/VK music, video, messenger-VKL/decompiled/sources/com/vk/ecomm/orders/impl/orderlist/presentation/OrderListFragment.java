package com.vk.ecomm.orders.impl.orderlist.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.ecomm.orders.api.model.ReviewSuggestion;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ag20;
import xsna.ew80;
import xsna.fpf0;
import xsna.hq5;
import xsna.hv80;
import xsna.kai;
import xsna.m1y;
import xsna.msy;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.s200;
import xsna.yu60;

/* compiled from: OrderListFragment.kt */
/* loaded from: classes.dex */
public final class OrderListFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] Q;
    public final nzw N = s200.M(this, fpf0.d(ew80.class).toString(), new ag20(this, 17));
    public final Object O;
    public final Object P;

    /* compiled from: OrderListFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
        public /* synthetic */ a() {
            this(null);
        }

        public a(ReviewSuggestion reviewSuggestion) {
            super(OrderListFragment.class, null, null);
            this.j.putParcelable("review_suggestion_arg", reviewSuggestion);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(OrderListFragment.class, "orderListStore", "getOrderListStore()Lcom/vk/ecomm/orders/impl/orderlist/presentation/mvi/OrderListStore;", 0);
        fpf0.a.getClass();
        Q = new qcy[]{propertyReference1Impl};
    }

    public OrderListFragment() {
        yu60 yu60Var = new yu60(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.O = msy.a(lazyThreadSafetyMode, yu60Var);
        this.P = msy.a(lazyThreadSafetyMode, new m1y(this, 22));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((hv80) this.O.getValue()).a(i, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(kai.b(-1587130430, new hq5(this, 12)));
        return composeView;
    }
}
