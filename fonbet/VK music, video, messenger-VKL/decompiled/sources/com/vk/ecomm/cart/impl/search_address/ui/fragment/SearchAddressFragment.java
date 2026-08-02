package com.vk.ecomm.cart.impl.search_address.ui.fragment;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.mvi.androidx.MviImplFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.dmh0;
import xsna.emh0;
import xsna.fpf0;
import xsna.gl6;
import xsna.gmh0;
import xsna.izs;
import xsna.jmh0;
import xsna.km50;
import xsna.lmh0;
import xsna.mk50;
import xsna.mx4;
import xsna.nf3;
import xsna.omh0;
import xsna.oz50;
import xsna.qcy;
import xsna.rmh0;
import xsna.s3q0;
import xsna.vk50;
import xsna.w8i;
import xsna.xn50;
import xsna.zlh0;

/* compiled from: SearchAddressFragment.kt */
/* loaded from: classes18.dex */
public final class SearchAddressFragment extends MviImplFragment<dmh0, rmh0, zlh0> implements w8i {
    public static final /* synthetic */ qcy<Object>[] S;
    public final nf3 Q = new nf3();
    public final jmh0 R = new jmh0(new b(1, this, SearchAddressFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));

    /* compiled from: SearchAddressFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: SearchAddressFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<zlh0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(zlh0 zlh0Var) {
            SearchAddressFragment searchAddressFragment = (SearchAddressFragment) this.receiver;
            searchAddressFragment.getClass();
            xn50.a.c(searchAddressFragment, zlh0Var);
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SearchAddressFragment.class, "contentView", "getContentView()Lcom/vk/ecomm/cart/impl/search_address/ui/fragment/SearchAddressMviView;", 0);
        fpf0.a.getClass();
        S = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        gmh0 gmh0Var = new gmh0(requireContext(), this);
        qcy<Object> qcyVar = S[0];
        nf3 nf3Var = this.Q;
        nf3Var.c = gmh0Var;
        return new mk50.c(((gmh0) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((gmh0) this.Q.getValue(this, S[0])).f((rmh0) ao50Var, new gl6(1, this, SearchAddressFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 9));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        dmh0 dmh0Var = (dmh0) vk50Var;
        dmh0Var.i.a(new emh0(this, 0), this);
        dmh0Var.j.a(new mx4(1, this, SearchAddressFragment.class, "onAddressPicked", "onAddressPicked(Lcom/vk/ecomm/cart/impl/search_address/model/SearchAddressResult;)V", 0, 6), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, zlh0.f.b);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        String string = requireArguments().getString("QUERY_KEY_ARG");
        if (string == null) {
            string = "";
        }
        boolean z = requireArguments().getBoolean("IS_CUSTOM_ADDRESS_ENABLED", false);
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("COORDINATES_KEY_ARG", Coordinates.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("COORDINATES_KEY_ARG");
            if (!(parcelable3 instanceof Coordinates)) {
                parcelable3 = null;
            }
            parcelable = (Coordinates) parcelable3;
        }
        return new dmh0(new lmh0(new omh0(string, (Coordinates) parcelable, z, 52)));
    }
}
