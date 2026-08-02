package com.vk.ecomm.market.goodpreview.presentation;

import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.mvi.androidx.MviImplFragment;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.asu0;
import xsna.ay00;
import xsna.b7u;
import xsna.bpn0;
import xsna.c5f;
import xsna.d7u;
import xsna.eph;
import xsna.f5z;
import xsna.fpf0;
import xsna.fy00;
import xsna.gm50;
import xsna.gmj;
import xsna.i7u;
import xsna.iid0;
import xsna.j7u;
import xsna.j9k;
import xsna.jrh;
import xsna.k6u;
import xsna.km50;
import xsna.l6u;
import xsna.m5u;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.myh;
import xsna.mzp0;
import xsna.n1d;
import xsna.nw00;
import xsna.oz50;
import xsna.pwk;
import xsna.rzp0;
import xsna.sop;
import xsna.u4e;
import xsna.vk50;
import xsna.wv0;
import xsna.x8;
import xsna.xcd;
import xsna.zqf;

/* compiled from: GoodPreviewFragment.kt */
/* loaded from: classes18.dex */
public final class GoodPreviewFragment extends MviImplFragment<k6u, j7u, m5u> {
    public static final /* synthetic */ int X = 0;
    public i7u Q;
    public final Object R;
    public final Object S;
    public final bpn0 T;
    public final bpn0 U;
    public final bpn0 V;
    public c W;

    /* compiled from: GoodPreviewFragment.kt */
    public static final class a extends oz50 {
    }

    public GoodPreviewFragment() {
        c5f c5fVar = new c5f(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, c5fVar);
        this.S = msy.a(lazyThreadSafetyMode, new jrh(this, 14));
        this.T = new bpn0(new myh(this, 20));
        this.U = new bpn0(new zqf(this, 28));
        this.V = new bpn0(new wv0(18));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MARKET_GOOD_PREVIEW, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context requireContext = requireContext();
        f5z viewLifecycleOwner = getViewLifecycleOwner();
        i7u i7uVar = new i7u(requireContext, new sop(this, 12), new u4e(this, 24), this.J, viewLifecycleOwner);
        this.Q = i7uVar;
        return new mk50.c(i7uVar.f);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        j7u j7uVar = (j7u) ao50Var;
        i7u i7uVar = this.Q;
        if (i7uVar == null) {
            i7uVar = null;
        }
        i7uVar.getClass();
        gm50.a.b(i7uVar, j7uVar.a, new j9k(i7uVar, 17));
        gm50.a.b(i7uVar, j7uVar.b, new n1d(i7uVar, 21));
        gm50.a.b(i7uVar, j7uVar.c, new gmj(i7uVar, 16));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((Boolean) this.V.getValue()).booleanValue()) {
            c cVar = this.W;
            if (cVar != null) {
                cVar.dispose();
            }
            q<ay00> a2 = ((fy00) this.T.getValue()).a();
            asu0 asu0Var = asu0.a;
            this.W = a2.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new x8(new xcd(this, 24), 22));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (((Boolean) this.V.getValue()).booleanValue()) {
            c cVar = this.W;
            if (cVar != null) {
                cVar.dispose();
            }
            this.W = null;
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getFeature().j.a(new eph(this, 22), getViewLifecycleOwner());
        getFeature().k.a(new pwk(this, 16), getViewLifecycleOwner());
        getFeature().l.a(new l6u(this, 0), getViewLifecycleOwner());
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        b7u b7uVar = new b7u(new d7u(5));
        UserId userId = (UserId) requireArguments().getParcelable("owner_id");
        if (userId == null) {
            userId = UserId.d;
        }
        UserId userId2 = userId;
        return new k6u(b7uVar, new m5u.k(requireArguments().getInt("item_position"), requireArguments().getLong("good_id"), userId2, requireArguments().getString("item_track_code")), new nw00(), new iid0(), ((MarketComponent) m7m.d(this).a(fpf0.a(MarketComponent.class))).Y4(), this.J);
    }
}
