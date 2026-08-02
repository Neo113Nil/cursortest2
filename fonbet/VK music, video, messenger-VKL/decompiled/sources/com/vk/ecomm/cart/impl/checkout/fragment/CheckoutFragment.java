package com.vk.ecomm.cart.impl.checkout.fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.View;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.checkout.feature.state.f;
import com.vk.ecomm.cart.impl.common.models.CourierAddress;
import com.vk.mvi.androidx.MviImplFragment;
import defpackage.g;
import defpackage.h;
import defpackage.i;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.bo8;
import xsna.ic;
import xsna.k3c;
import xsna.km50;
import xsna.m7c;
import xsna.mk50;
import xsna.msy;
import xsna.mz;
import xsna.mzp0;
import xsna.nz;
import xsna.o9c;
import xsna.oz50;
import xsna.ptb;
import xsna.q5c;
import xsna.r2c;
import xsna.r4c;
import xsna.rzp0;
import xsna.vk50;
import xsna.w7c;
import xsna.w8c;
import xsna.xn50;
import xsna.yh;
import xsna.z4c;

/* compiled from: CheckoutFragment.kt */
/* loaded from: classes18.dex */
public final class CheckoutFragment extends MviImplFragment<z4c, o9c, r2c> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final Object R;
    public final Object S;

    /* compiled from: CheckoutFragment.kt */
    public static final class a extends oz50 {
    }

    public CheckoutFragment() {
        int i = 18;
        g gVar = new g(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, gVar);
        this.R = msy.a(lazyThreadSafetyMode, new h(this, 12));
        this.S = msy.a(lazyThreadSafetyMode, new i(this, i));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MARKET_CHECKOUT, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.c(((k3c) this.S.getValue()).d);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((k3c) this.S.getValue()).f((o9c) ao50Var, new mz(this, 24));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((z4c) vk50Var).g.a(new ptb(1, (q5c) this.R.getValue(), q5c.class, "applyNavigationPatch", "applyNavigationPatch(Lcom/vk/ecomm/cart/impl/checkout/feature/patch/CheckoutNavigationPatch;)V", 0, 1), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        Parcelable parcelable;
        Object parcelable2;
        Bundle bundleExtra2;
        Parcelable parcelable3;
        Object parcelable4;
        q5c q5cVar = (q5c) this.R.getValue();
        nz nzVar = q5cVar.b;
        r4c r4cVar = q5cVar.c;
        if (((m7c) r4cVar.e.getValue()).c(i)) {
            if (i2 == -1) {
                ((m7c) r4cVar.e.getValue()).b(i, intent, new yh(q5cVar, 20), new ic(q5cVar, 19), new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(q5cVar, 21));
                return;
            } else {
                nzVar.a(new r2c.x(false));
                return;
            }
        }
        if (i == 526) {
            if (i2 != -1 || intent == null || (bundleExtra2 = intent.getBundleExtra("delivery_point_extra")) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = bundleExtra2.getParcelable("delivery_point_id_key", DeliveryPoint.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                Parcelable parcelable5 = bundleExtra2.getParcelable("delivery_point_id_key");
                parcelable3 = (DeliveryPoint) (parcelable5 instanceof DeliveryPoint ? parcelable5 : null);
            }
            DeliveryPoint deliveryPoint = (DeliveryPoint) parcelable3;
            if (deliveryPoint != null) {
                nzVar.a(new r2c.q(deliveryPoint));
                return;
            }
            return;
        }
        if (i != 527 || i2 != -1 || intent == null || (bundleExtra = intent.getBundleExtra("courier_address_extra")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundleExtra.getParcelable("courier_address_key", CourierAddress.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable6 = bundleExtra.getParcelable("courier_address_key");
            parcelable = (CourierAddress) (parcelable6 instanceof CourierAddress ? parcelable6 : null);
        }
        CourierAddress courierAddress = (CourierAddress) parcelable;
        if (courierAddress != null) {
            nzVar.a(new r2c.o(courierAddress));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, r2c.r.b);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("group_id", UserId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("group_id");
            if (!(parcelable3 instanceof UserId)) {
                parcelable3 = null;
            }
            parcelable = (UserId) parcelable3;
        }
        UserId userId = (UserId) parcelable;
        Long e = bo8.e(requireArguments(), "item_id");
        w8c w8cVar = km50Var instanceof w8c ? (w8c) km50Var : null;
        if (w8cVar == null) {
            w8cVar = new w8c(userId, e, null, false, false, new f(), false, null, null);
        }
        return new z4c(new w7c(w8cVar, (r4c) this.Q.getValue()), this.J);
    }
}
