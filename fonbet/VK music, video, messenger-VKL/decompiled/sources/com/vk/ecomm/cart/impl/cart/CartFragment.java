package com.vk.ecomm.cart.impl.cart;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.movika.sdk.base.observable.p;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.subscription.api.di.SubscriptionComponent;
import com.vkontakte.android.R;
import defpackage.e;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.cy9;
import xsna.d990;
import xsna.dx90;
import xsna.dy9;
import xsna.e43;
import xsna.efs;
import xsna.ew9;
import xsna.fkq0;
import xsna.fpf0;
import xsna.in0;
import xsna.izs;
import xsna.ji0;
import xsna.k7m;
import xsna.km50;
import xsna.m7m;
import xsna.mh;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.nf3;
import xsna.ow4;
import xsna.ow90;
import xsna.oy9;
import xsna.oz50;
import xsna.qcy;
import xsna.qdz;
import xsna.r8;
import xsna.rv9;
import xsna.rx9;
import xsna.ry0;
import xsna.rzp0;
import xsna.s3q0;
import xsna.s8;
import xsna.vk50;
import xsna.vw9;
import xsna.w8i;
import xsna.xn50;
import xsna.yw9;
import xsna.yw90;
import xsna.z4;
import xsna.zrd0;

/* compiled from: CartFragment.kt */
/* loaded from: classes18.dex */
public final class CartFragment extends MviImplFragment<vw9, com.vk.ecomm.cart.impl.cart.a, rv9> implements w8i {
    public static final /* synthetic */ qcy<Object>[] Y;
    public final UUID Q;
    public final Object R;
    public final Object S;
    public final nf3 T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;

    /* compiled from: CartFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, CartCounterState cartCounterState) {
            super(CartFragment.class, null, null);
            if (userId != null) {
                this.j.putParcelable("group_id", userId);
            }
            if (cartCounterState != null) {
                this.j.putParcelable("ARG_KEY_CART_COUNTER", new CartCounterState(cartCounterState.b));
            }
        }
    }

    /* compiled from: CartFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<rv9, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(rv9 rv9Var) {
            CartFragment cartFragment = (CartFragment) this.receiver;
            cartFragment.getClass();
            xn50.a.c(cartFragment, rv9Var);
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(CartFragment.class, "mviComposeView", "getMviComposeView()Lcom/vk/ecomm/cart/impl/cart/ui/compose/CartComposeView;", 0);
        fpf0.a.getClass();
        Y = new qcy[]{mutablePropertyReference1Impl};
    }

    public CartFragment() {
        ry0 ry0Var = new ry0(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, ry0Var);
        this.S = msy.a(lazyThreadSafetyMode, new ji0(this, 12));
        this.T = new nf3();
        this.U = msy.a(lazyThreadSafetyMode, new in0(this, 13));
        this.V = msy.a(lazyThreadSafetyMode, new z4(this, 16));
        this.W = msy.a(lazyThreadSafetyMode, new mh(this, 15));
        this.X = msy.a(lazyThreadSafetyMode, new e(this, 12));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        Pair c = rzp0.c(UiMeasuringScreen.MARKET_CARTS_LIST, null, false, 62);
        UUID uuid = (UUID) c.d();
        mzp0 mzp0Var = (mzp0) c.g();
        this.J = mzp0Var;
        this.Q = uuid;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.MARKET_CARTS_LIST).j();
        yw90Var.init();
        this.L = yw90Var;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.cart_fragment);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        com.vk.ecomm.cart.impl.cart.a aVar = (com.vk.ecomm.cart.impl.cart.a) ao50Var;
        ew9 ew9Var = new ew9(this, requireContext(), this.J, On(), new dy9(this, e43.l(aVar.a, aVar.b, aVar.d, aVar.c), new p(this, 15)), (ComposeView) this.R.getValue());
        qcy<Object> qcyVar = Y[0];
        nf3 nf3Var = this.T;
        nf3Var.c = ew9Var;
        ((ew9) nf3Var.getValue(this, qcyVar)).f(aVar, new ow4(1, this, CartFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        vw9 vw9Var = (vw9) vk50Var;
        vw9Var.g.a(new r8(1, (yw9) this.V.getValue(), yw9.class, "applyNavigationPatch", "applyNavigationPatch(Lcom/vk/ecomm/cart/impl/cart/feature/patch/CartNavigationPatch;)V", 0, 3), this);
        vw9Var.h.a(new s8(1, (rx9) this.X.getValue(), rx9.class, "send", "send(Lcom/vk/ecomm/cart/impl/cart/feature/patch/CartProductChangesPatch;)V", 0, 3), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, rv9.c.b);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ow90 ow90Var = ow90.a;
        ((efs) ow90.n.getValue()).b(kn(), this.D, ScrollScreenType.MARKET_CART, dx90.V);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Object parcelable3;
        Object parcelable4;
        oy9 oy9Var = km50Var instanceof oy9 ? (oy9) km50Var : null;
        oy9 oy9Var2 = oy9Var == null ? new oy9(null, new LinkedHashMap(), new d990(false, 0, 15), null, false, false, false, null, null, null, true) : oy9Var;
        Bundle requireArguments = requireArguments();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable4 = requireArguments.getParcelable("group_id", UserId.class);
            parcelable = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable5 = requireArguments.getParcelable("group_id");
            if (!(parcelable5 instanceof UserId)) {
                parcelable5 = null;
            }
            parcelable = (UserId) parcelable5;
        }
        UserId userId = (UserId) parcelable;
        Bundle requireArguments2 = requireArguments();
        if (i >= 33) {
            parcelable3 = requireArguments2.getParcelable("ARG_KEY_CART_COUNTER", CartCounterState.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable6 = requireArguments2.getParcelable("ARG_KEY_CART_COUNTER");
            if (!(parcelable6 instanceof CartCounterState)) {
                parcelable6 = null;
            }
            parcelable2 = (CartCounterState) parcelable6;
        }
        return new vw9(new cy9(oy9.a(oy9Var2, userId != null ? fkq0.a(userId) : null, null, null, null, false, false, false, null, null, (CartCounterState) parcelable2, false, 1534), ((qdz) this.W.getValue()).a()), ((SubscriptionComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(SubscriptionComponent.class))).T(), this.J);
    }
}
