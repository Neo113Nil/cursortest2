package com.vk.ecomm.onlinebooking.impl.services.presentation.ui;

import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.d;
import com.vk.ecomm.onlinebooking.impl.utils.Entrypoint;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.arm0;
import xsna.b3;
import xsna.bpn0;
import xsna.bs7;
import xsna.bu00;
import xsna.c5g;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.ka0;
import xsna.kai;
import xsna.msy;
import xsna.mzp0;
import xsna.na;
import xsna.nx7;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.r04;
import xsna.rzp0;
import xsna.s200;
import xsna.umk;
import xsna.up2;
import xsna.vf0;
import xsna.ww7;

/* compiled from: BookingServicesScreenFragment.kt */
/* loaded from: classes.dex */
public final class BookingServicesScreenFragment extends FragmentImpl implements bs7 {
    public static final /* synthetic */ qcy<Object>[] S;
    public final b.j N = new b.j(0);
    public final bpn0 O;
    public final bpn0 P;
    public final Object Q;
    public final nzw R;

    /* compiled from: BookingServicesScreenFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BookingServicesScreenFragment.class, X3.i.U, "getStore()Lcom/vk/ecomm/onlinebooking/impl/services/presentation/BookingServiceScreenStore;", 0);
        fpf0.a.getClass();
        S = new qcy[]{propertyReference1Impl};
    }

    public BookingServicesScreenFragment() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MARKET_ONLINE_BOOKING_SERVICES, null, false, 62).g();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        this.O = new bpn0(new ka0(this, 8));
        int i = 11;
        this.P = new bpn0(new vf0(this, i));
        this.Q = msy.a(LazyThreadSafetyMode.NONE, new b3(this, i));
        this.R = s200.M(this, fpf0.d(ww7.class).toString(), new na(this, 12));
    }

    @Override // xsna.bs7
    public final b X9() {
        return this.N;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        qcy<Object> qcyVar = S[0];
        ((ww7) bu00.k(this.R)).b(a.d.b);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final OnlineBookingInternalComponent eo() {
        return (OnlineBookingInternalComponent) this.Q.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r2 != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r04 fo(BookingScreenParams bookingScreenParams) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str = bookingScreenParams.d().get("entrypoint");
        String l = up2.l(requireContext(), str);
        List<BookingServiceModel> e = bookingScreenParams.e();
        ArrayList arrayList3 = new ArrayList(c5g.u(e, 10));
        Iterator it = e.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((BookingServiceModel) it.next()).getId()));
        }
        boolean isEmpty = arrayList3.isEmpty();
        if (!epx.f(str, Entrypoint.STORIES.i()) || l == null || l.length() == 0) {
            if (isEmpty) {
                return null;
            }
            umk Gf = eo().Gf();
            String string = getResources().getString(R.string.your_booking_record);
            Gf.getClass();
            return umk.a(arrayList3, arrayList3, string);
        }
        umk Gf2 = eo().Gf();
        String str2 = bookingScreenParams.d().get("services_yc_ids");
        if (str2 != null) {
            List c0 = drm0.c0(str2, new String[]{StringUtils.COMMA}, 0, 6);
            arrayList = new ArrayList();
            Iterator it2 = c0.iterator();
            while (it2.hasNext()) {
                Integer m = arm0.m(10, (String) it2.next());
                if (m != null) {
                    arrayList.add(m);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            boolean isEmpty2 = arrayList.isEmpty();
            arrayList2 = arrayList;
        }
        String str3 = bookingScreenParams.d().get("selected_service_yc_id");
        arrayList2 = e43.m(str3 != null ? arm0.m(10, str3) : null);
        return umk.b(Gf2, arrayList2, l);
    }

    public final BookingScreenParams go() {
        return (BookingScreenParams) this.O.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(kai.b(2136581833, new nx7(this, 0)));
        return composeView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        ((d) this.P.getValue()).a();
        super.onStop();
    }
}
