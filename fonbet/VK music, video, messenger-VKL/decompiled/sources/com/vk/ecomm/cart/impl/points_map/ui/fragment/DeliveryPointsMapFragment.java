package com.vk.ecomm.cart.impl.points_map.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.location.zzbp;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.geo.City;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.points_map.feature.model.DeliveryPointsMode;
import com.vk.ecomm.cart.impl.search_address.model.SearchAddressResult;
import com.vk.mvi.androidx.MviImplFragment;
import io.reactivex.rxjava3.disposables.c;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.cxl;
import xsna.fpf0;
import xsna.fxl;
import xsna.hxl;
import xsna.hyl;
import xsna.iwl;
import xsna.izs;
import xsna.jdr0;
import xsna.jgp;
import xsna.km50;
import xsna.kyl;
import xsna.l3f;
import xsna.lxl;
import xsna.mk50;
import xsna.mxl;
import xsna.nf3;
import xsna.on00;
import xsna.oxz;
import xsna.oz50;
import xsna.pj1;
import xsna.qcy;
import xsna.rl3;
import xsna.s3q0;
import xsna.vk50;
import xsna.wik;
import xsna.wxl;
import xsna.wyz;
import xsna.xn50;

/* compiled from: DeliveryPointsMapFragment.kt */
/* loaded from: classes18.dex */
public final class DeliveryPointsMapFragment extends MviImplFragment<fxl, kyl, cxl> {
    public static final /* synthetic */ qcy<Object>[] T;
    public boolean R;
    public final nf3 Q = new nf3();
    public final mxl S = new mxl(new b(1, this, DeliveryPointsMapFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0), new wik(this, 1));

    /* compiled from: DeliveryPointsMapFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(DeliveryPointsMapFragment.class, null, null);
        }
    }

    /* compiled from: DeliveryPointsMapFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<cxl, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(cxl cxlVar) {
            DeliveryPointsMapFragment deliveryPointsMapFragment = (DeliveryPointsMapFragment) this.receiver;
            deliveryPointsMapFragment.getClass();
            xn50.a.c(deliveryPointsMapFragment, cxlVar);
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(DeliveryPointsMapFragment.class, "contentView", "getContentView()Lcom/vk/ecomm/cart/impl/points_map/ui/fragment/DeliveryPointsMapMviView;", 0);
        fpf0.a.getClass();
        T = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        lxl lxlVar = new lxl(requireContext(), this);
        qcy<Object> qcyVar = T[0];
        nf3 nf3Var = this.Q;
        nf3Var.c = lxlVar;
        return new mk50.c(((lxl) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((lxl) this.Q.getValue(this, T[0])).f((kyl) ao50Var, new pj1(1, this, DeliveryPointsMapFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 6));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        fxl fxlVar = (fxl) vk50Var;
        fxlVar.f.a(new hxl(this, 0), this);
        fxlVar.g.a(new l3f(1, this, DeliveryPointsMapFragment.class, "onDeliveryPointSelected", "onDeliveryPointSelected(Lcom/vk/ecomm/cart/api/model/DeliveryPoint;)V", 0, 5), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (this.R) {
            return false;
        }
        xn50.a.c(this, cxl.b.b);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        Parcelable parcelable;
        Object parcelable2;
        super.onActivityResult(i, i2, intent);
        if (i != 529 || i2 != -1 || intent == null || (bundleExtra = intent.getBundleExtra("search_found_address_extra")) == null) {
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
            xn50.a.c(this, new cxl.s(searchAddressResult));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Context requireContext = requireContext();
        mxl mxlVar = this.S;
        jdr0 jdr0Var = mxlVar.e;
        if (jdr0Var != null) {
            AtomicReference<Location> atomicReference = oxz.a;
            com.google.android.gms.common.api.a<a.d.c> aVar = wyz.a;
            new zzbp(requireContext).removeLocationUpdates(jdr0Var);
        }
        c cVar = mxlVar.d;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, cxl.k.e.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r10 == null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [android.os.Parcelable] */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId userId;
        DeliveryPoint deliveryPoint;
        City city;
        List list;
        int[] intArray;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        DeliveryPoint deliveryPoint2;
        DeliveryPoint deliveryPoint3;
        Parcelable parcelable5;
        Object parcelable6;
        Parcelable parcelable7;
        Object parcelable8;
        Parcelable parcelable9;
        Object parcelable10;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable10 = arguments.getParcelable("group_id", UserId.class);
                parcelable9 = (Parcelable) parcelable10;
            } else {
                Parcelable parcelable11 = arguments.getParcelable("group_id");
                if (!(parcelable11 instanceof UserId)) {
                    parcelable11 = null;
                }
                parcelable9 = (UserId) parcelable11;
            }
            userId = (UserId) parcelable9;
        }
        userId = UserId.d;
        if (getArguments() != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable8 = arguments2.getParcelable("picked_delivery_point", DeliveryPoint.class);
                    parcelable7 = (Parcelable) parcelable8;
                } else {
                    Parcelable parcelable12 = arguments2.getParcelable("picked_delivery_point");
                    if (!(parcelable12 instanceof DeliveryPoint)) {
                        parcelable12 = null;
                    }
                    parcelable7 = (DeliveryPoint) parcelable12;
                }
                deliveryPoint2 = (DeliveryPoint) parcelable7;
            } else {
                deliveryPoint2 = null;
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable6 = arguments3.getParcelable("selected_delivery_point", DeliveryPoint.class);
                    parcelable5 = (Parcelable) parcelable6;
                } else {
                    Parcelable parcelable13 = arguments3.getParcelable("selected_delivery_point");
                    if (!(parcelable13 instanceof DeliveryPoint)) {
                        parcelable13 = null;
                    }
                    parcelable5 = (DeliveryPoint) parcelable13;
                }
                deliveryPoint3 = (DeliveryPoint) parcelable5;
            } else {
                deliveryPoint3 = null;
            }
            if (deliveryPoint3 != null) {
                deliveryPoint2 = deliveryPoint3;
            }
            deliveryPoint = deliveryPoint2;
        } else {
            deliveryPoint = null;
        }
        Bundle arguments4 = getArguments();
        DeliveryPointsMode deliveryPointsMode = (arguments4 == null || !arguments4.getBoolean("need_to_pick_delivery_point")) ? DeliveryPointsMode.SHOW_DELIVERY_POINT : DeliveryPointsMode.SELECT_DELIVERY_POINT;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = arguments5.getParcelable("city", City.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                Parcelable parcelable14 = arguments5.getParcelable("city");
                if (!(parcelable14 instanceof City)) {
                    parcelable14 = null;
                }
                parcelable3 = (City) parcelable14;
            }
            city = (City) parcelable3;
        } else {
            city = null;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments6.getParcelable("city_coordinates", Coordinates.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable15 = arguments6.getParcelable("city_coordinates");
                parcelable = parcelable15 instanceof Coordinates ? parcelable15 : null;
            }
            r0 = (Coordinates) parcelable;
        }
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (intArray = arguments7.getIntArray("service_ids")) == null || (list = rl3.s0(intArray)) == null) {
            list = EmptyList.b;
        }
        return new fxl(new wxl(new hyl(new hyl.a(userId, city, r0, list), deliveryPointsMode, new hyl.b(deliveryPoint != null ? on00.f(new Pair(iwl.b(deliveryPoint), deliveryPoint)) : jgp.b, 59), deliveryPoint, deliveryPoint != null, 200)));
    }
}
