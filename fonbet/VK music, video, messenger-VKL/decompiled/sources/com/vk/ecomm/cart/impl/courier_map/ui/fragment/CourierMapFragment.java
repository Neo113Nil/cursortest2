package com.vk.ecomm.cart.impl.courier_map.ui.fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.ecomm.cart.impl.common.models.geo.Address;
import com.vk.ecomm.cart.impl.search_address.model.SearchAddressResult;
import com.vk.mvi.androidx.MviImplFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.czj;
import xsna.epx;
import xsna.fpf0;
import xsna.g0t;
import xsna.izj;
import xsna.izs;
import xsna.jzj;
import xsna.km50;
import xsna.lzj;
import xsna.mk50;
import xsna.nf3;
import xsna.nzj;
import xsna.oz50;
import xsna.qcy;
import xsna.s3q0;
import xsna.tw4;
import xsna.tzj;
import xsna.u4e;
import xsna.uw4;
import xsna.vk50;
import xsna.vzj;
import xsna.w8i;
import xsna.xn50;
import xsna.xyj;
import xsna.xzs;
import xsna.yad;
import xsna.yyj;

/* compiled from: CourierMapFragment.kt */
/* loaded from: classes18.dex */
public final class CourierMapFragment extends MviImplFragment<czj, vzj, xyj> implements w8i {
    public static final /* synthetic */ qcy<Object>[] T;
    public final nf3 Q = new nf3();
    public final lzj R = new lzj(new c(1, this, CourierMapFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
    public final izj S = new izj(new b());

    /* compiled from: CourierMapFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: CourierMapFragment.kt */
    public static final /* synthetic */ class b implements yyj, g0t {
        public b() {
        }

        public final void a(xyj xyjVar) {
            CourierMapFragment courierMapFragment = CourierMapFragment.this;
            courierMapFragment.getClass();
            xn50.a.c(courierMapFragment, xyjVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof yyj) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CourierMapFragment.this, CourierMapFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: CourierMapFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<xyj, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(xyj xyjVar) {
            CourierMapFragment courierMapFragment = (CourierMapFragment) this.receiver;
            courierMapFragment.getClass();
            xn50.a.c(courierMapFragment, xyjVar);
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(CourierMapFragment.class, "contentView", "getContentView()Lcom/vk/ecomm/cart/impl/courier_map/ui/fragment/CourierMapMviView;", 0);
        fpf0.a.getClass();
        T = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        jzj jzjVar = new jzj(requireContext(), this);
        qcy<Object> qcyVar = T[0];
        nf3 nf3Var = this.Q;
        nf3Var.c = jzjVar;
        return new mk50.c(((jzj) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((jzj) this.Q.getValue(this, T[0])).f((vzj) ao50Var, new uw4(1, this, CourierMapFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 7));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        czj czjVar = (czj) vk50Var;
        czjVar.i.a(new u4e(this, 8), this);
        czjVar.j.a(new yad(this, 15), this);
        czjVar.k.a(new tw4(1, this, CourierMapFragment.class, "onAddressPicked", "onAddressPicked(Lcom/vk/ecomm/cart/impl/common/models/CourierAddress;)V", 0, 6), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        Parcelable parcelable;
        Object parcelable2;
        super.onActivityResult(i, i2, intent);
        if (i != 528 || i2 != -1 || intent == null || (bundleExtra = intent.getBundleExtra("search_found_address_extra")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundleExtra.getParcelable("search_found_custom_address_key", SearchAddressResult.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundleExtra.getParcelable("search_found_custom_address_key");
            if (!(parcelable3 instanceof SearchAddressResult)) {
                parcelable3 = null;
            }
            parcelable = (SearchAddressResult) parcelable3;
        }
        SearchAddressResult searchAddressResult = (SearchAddressResult) parcelable;
        if (searchAddressResult != null) {
            xn50.a.c(this, new xyj.g(searchAddressResult));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.S.b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.Parcelable] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        Parcelable parcelable;
        Object parcelable2;
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("ADDRESS_KEY_ARG", Address.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = arguments.getParcelable("ADDRESS_KEY_ARG");
                parcelable = parcelable3 instanceof Address ? parcelable3 : null;
            }
            r1 = (Address) parcelable;
        }
        xn50.a.c(this, new xyj.c.e(r1));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new czj(new nzj(new tzj(0)));
    }
}
