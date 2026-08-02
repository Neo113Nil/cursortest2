package com.vk.geo.impl.presentation;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.unity3d.services.UnityAdsConstants;
import com.vk.geo.api.GeoFragmentOptions;
import com.vk.geo.api.di.GeoComponent;
import com.vk.geo.impl.di.GeoComponentImpl;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.ZoomLevel;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.geo.impl.presentation.a;
import com.vk.geo.impl.presentation.h;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.aiz;
import xsna.ao50;
import xsna.aw50;
import xsna.ayo;
import xsna.b1j;
import xsna.bb0;
import xsna.biz;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cil;
import xsna.cnt;
import xsna.d6l;
import xsna.dhr0;
import xsna.dnh;
import xsna.dnt;
import xsna.do00;
import xsna.e3m;
import xsna.efz;
import xsna.ent;
import xsna.eo9;
import xsna.eoz0;
import xsna.epx;
import xsna.f4m;
import xsna.f5z;
import xsna.fbh;
import xsna.fes;
import xsna.fnt;
import xsna.fpf0;
import xsna.frg;
import xsna.g780;
import xsna.gl00;
import xsna.gm50;
import xsna.gnt;
import xsna.h7u0;
import xsna.hb0;
import xsna.hj7;
import xsna.hnt;
import xsna.hyk0;
import xsna.ifg;
import xsna.ioz0;
import xsna.jjc;
import xsna.km00;
import xsna.km50;
import xsna.l4z;
import xsna.lwh;
import xsna.m2g;
import xsna.m7m;
import xsna.mk50;
import xsna.mm00;
import xsna.msy;
import xsna.nv;
import xsna.okt;
import xsna.ont;
import xsna.pff;
import xsna.pkt;
import xsna.q7o;
import xsna.qcy;
import xsna.rkt;
import xsna.rpv;
import xsna.s9u;
import xsna.sds;
import xsna.skt;
import xsna.swe0;
import xsna.tkt;
import xsna.tnf;
import xsna.tpv;
import xsna.twz0;
import xsna.vds;
import xsna.vk50;
import xsna.wje;
import xsna.wq70;
import xsna.xa4;
import xsna.xds;
import xsna.xn50;
import xsna.yl00;
import xsna.yqf;
import xsna.yv50;
import xsna.z1z;
import xsna.zhy0;

/* compiled from: GeoFragment.kt */
/* loaded from: classes2.dex */
public final class GeoFragment extends MviImplFragment<b, j, com.vk.geo.impl.presentation.a> implements xds, fes, sds, vds, tkt.b {
    public static final /* synthetic */ qcy<Object>[] c0;
    public final bpn0 Q = new bpn0(new rkt(this, 0));
    public final bpn0 R = new bpn0(new pff(this, 27));
    public final Object S;
    public final bpn0 T;
    public final Object U;
    public final Object V;
    public final hb0<String[]> W;
    public tkt.a X;
    public hyk0.a Y;
    public final bpn0 Z;
    public final a a0;
    public yl00 b0;

    /* compiled from: Delegates.kt */
    public static final class a extends wq70<gl00> {
        public final /* synthetic */ GeoFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cil cilVar, GeoFragment geoFragment) {
            super(cilVar);
            this.b = geoFragment;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, gl00 gl00Var, gl00 gl00Var2) {
            GeoFragment geoFragment = this.b;
            gl00 gl00Var3 = gl00Var2;
            try {
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                if (geoFragment.fo().b != null) {
                    cil go = geoFragment.go();
                    go.c.setValue(go, cil.f[0], gl00Var3);
                    geoFragment.fo().l = geoFragment.go();
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(GeoFragment.class, "listener", "getListener()Lcom/vk/geo/api/MapEventListener;", 0);
        fpf0.a.getClass();
        c0 = new qcy[]{mutablePropertyReference1Impl};
    }

    public GeoFragment() {
        m2g m2gVar = new m2g(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, m2gVar);
        this.T = new bpn0(new fbh(this, 20));
        this.U = msy.a(lazyThreadSafetyMode, new dnh(this, 24));
        this.V = msy.a(lazyThreadSafetyMode, new yqf(this, 20));
        this.W = registerForActivityResult(new bb0(), new pkt(this, 0));
        this.Z = new bpn0(new b1j(this, 20));
        this.a0 = new a(go(), this);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.geo_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        j jVar = (j) ao50Var;
        gm50.a.b(this, jVar.b, new frg(this, 18));
        gm50.a.b(this, jVar.c, new d(this));
        getFeature().f.a(new wje(this, 23), getViewLifecycleOwner());
        fnt fntVar = getFeature().f;
        f5z viewLifecycleOwner = getViewLifecycleOwner();
        skt sktVar = new skt(this);
        fntVar.getClass();
        if (viewLifecycleOwner.getLifecycle().getCurrentState().a(Lifecycle.State.INITIALIZED)) {
            fntVar.b.c.set(sktVar);
            viewLifecycleOwner.getLifecycle().addObserver(new gnt(new hnt(fntVar), 0));
        }
    }

    @Override // xsna.tkt.b
    public final void Lk(int i, boolean z) {
        yv50 fo = fo();
        tnf tnfVar = fo.z;
        int i2 = fo.n;
        View view = fo.b;
        if (view != null) {
            fo.m = i;
            int height = fo.k().getHeight() + fo.m().getHeight() + i2;
            if (view.getHeight() - height <= i) {
                float f = swe0.f((view.getHeight() - i) / height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                fo.m().setAlpha(f);
                fo.k().setAlpha(f);
            } else {
                fo.m().setAlpha(1.0f);
                fo.k().setAlpha(1.0f);
            }
            if (((view.getHeight() - fo.o) - height) - fo.q > i) {
                int i3 = fo.p + i;
                int top = fo.k().getTop();
                ViewGroup.LayoutParams layoutParams = fo.k().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i4 = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
                f4m.q(i3, fo.k());
                int i5 = i3 - i4;
                if (fo.m().isLaidOut()) {
                    int i6 = (top - i5) - i2;
                    View m = fo.m();
                    qcy<Object>[] qcyVarArr = bwt0.a;
                    int M = bwt0.M(m) + m.getBottom();
                    if (i6 <= M) {
                        fo.m().setY(i6 - fo.m().getHeight());
                    } else {
                        fo.m().setY(view.getHeight() - M);
                    }
                }
            }
        }
        if (z) {
            int g = swe0.g(i, 0, fo.B().getHeight() / 2);
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{efz.a(i, g, "h = ", ", finalHeight = ")});
            }
            fo.I = g;
            s9u s9uVar = fo.F;
            if (s9uVar != null) {
                try {
                    s9uVar.a.u(g);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
        }
        View view2 = fo.b;
        if (view2 != null) {
            view2.removeCallbacks(tnfVar);
        }
        View view3 = fo.b;
        if (view3 != null) {
            view3.postDelayed(tnfVar, 100L);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final int Pn() {
        return 48;
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // xsna.tkt.b
    public final void Wk() {
        getFeature().W();
    }

    @Override // xsna.fes
    public final boolean df() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final yv50 fo() {
        return (yv50) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sds
    public final int getBottomMargin() {
        return ((Number) this.V.getValue()).intValue();
    }

    public final cil go() {
        return (cil) this.Z.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ho(h hVar) {
        float f;
        Float f2 = null;
        if (hVar instanceof h.f) {
            h.f fVar = (h.f) hVar;
            ZoomLevel zoomLevel = fVar.b;
            yv50 fo = fo();
            long j = fVar.a;
            boolean z = fVar.c;
            long j2 = fVar.d;
            if (zoomLevel == null) {
                ZoomLevel z2 = fo.z();
                if (z2 != null) {
                    f = z2.b;
                }
                fo.getClass();
                LatLng latLng = new LatLng(Coordinate.e(j), Coordinate.f(j));
                fo.C(f2 == null ? xa4.F(latLng, f2.floatValue()) : xa4.D(latLng), z, j2);
                return;
            }
            fo.getClass();
            f = zoomLevel.b;
            f2 = Float.valueOf(f);
            fo.getClass();
            LatLng latLng2 = new LatLng(Coordinate.e(j), Coordinate.f(j));
            fo.C(f2 == null ? xa4.F(latLng2, f2.floatValue()) : xa4.D(latLng2), z, j2);
            return;
        }
        boolean z3 = false;
        if (hVar instanceof h.e) {
            yv50 fo2 = fo();
            h.e eVar = (h.e) hVar;
            BoundingBox boundingBox = eVar.a;
            long j3 = eVar.b;
            fo2.getClass();
            eo9 E = xa4.E(new LatLngBounds(new LatLng(boundingBox.R(), boundingBox.Z()), new LatLng(boundingBox.G(), boundingBox.D())), 0);
            q7o.k(boundingBox);
            fo2.C(E, false, j3);
            return;
        }
        int i = 1;
        if (epx.f(hVar, dnt.a)) {
            L.e(new Object[0]);
            PermissionHelper.a.getClass();
            String[] strArr = PermissionHelper.i;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (kn().shouldShowRequestPermissionRationale(strArr[i2])) {
                    z3 = true;
                    break;
                }
                i2++;
            }
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{zhy0.a("shouldShowRationale=", z3)});
            }
            if (z3) {
                io();
                return;
            }
            yl00 yl00Var = this.b0;
            if (yl00Var != null) {
                yl00Var.a();
            }
            this.W.a(strArr);
            return;
        }
        if (epx.f(hVar, ent.a)) {
            Context requireContext = requireContext();
            new AlertDialog.Builder(requireContext).setTitle(R.string.location_disabled_title).setMessage(R.string.location_disabled).setPositiveButton(R.string.open_settings, new hj7(i, requireContext, f2)).setNegativeButton(R.string.cancel, new z1z(f2, i)).show();
            return;
        }
        if (hVar instanceof cnt) {
            Context requireContext2 = requireContext();
            LocationCommon.a.getClass();
            boolean b = LocationCommon.b(requireContext2);
            yv50 fo3 = fo();
            if (((cnt) hVar).a && b) {
                z3 = true;
            }
            fo3.v(z3);
            return;
        }
        if (hVar instanceof h.g) {
            yv50 fo4 = fo();
            h.g gVar = (h.g) hVar;
            do00 do00Var = gVar.a;
            int i3 = gVar.b;
            mm00.a aVar = mm00.A;
            fo4.w(do00Var, i3, true);
            return;
        }
        if (!(hVar instanceof h.a)) {
            if (hVar instanceof h.d) {
                yv50 fo5 = fo();
                ((h.d) hVar).getClass();
                fo5.getClass();
                L l2 = L.a;
                l2.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l2, L.LogType.d, new Object[]{"zoom = null, bbox = null"});
                return;
            }
            if (hVar instanceof h.b) {
                yv50 fo6 = fo();
                ((h.b) hVar).getClass();
                fo6.getClass();
                return;
            } else {
                if (!(hVar instanceof h.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                fo();
                throw null;
            }
        }
        yv50 fo7 = fo();
        ((h.a) hVar).getClass();
        fo7.r.clear();
        s9u s9uVar = fo7.F;
        if (s9uVar != null) {
            fo7.v = null;
            try {
                s9uVar.a.clear();
                long j4 = fo7.x;
                if (Coordinate.g(j4) && Coordinate.g(j4)) {
                    fo7.x = j4;
                    if (fo7.v == 0) {
                        aw50 x = fo7.x(fo7.y(j4));
                        if (x != null) {
                            fo7.v = x;
                        }
                    } else {
                        fo7.F(j4);
                    }
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        fo7.t.clear();
        fo7.s.clear();
        fo7.u.clear();
    }

    public final void io() {
        int i = h7u0.p;
        h7u0.a a2 = h7u0.b.a(requireContext());
        a2.g0(R.string.geo_loc_perm_open_settings_dialog_title);
        a2.U(R.string.geo_loc_perm_open_settings_dialog_message);
        a2.c0(R.string.vk_permissions_go_to_settings_positive, new nv(this, 3));
        a2.W(R.string.vk_permissions_go_to_settings_negative, new d6l(this, 1));
        a2.a.n = new DialogInterface.OnCancelListener() { // from class: xsna.qkt
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                a.h.c cVar = new a.h.c(false);
                GeoFragment geoFragment = GeoFragment.this;
                geoFragment.getClass();
                xn50.a.c(geoFragment, cVar);
            }
        };
        a2.m();
    }

    @Override // xsna.tkt.b
    public final void jc(String str) {
        getFeature().C(new a.c(str, true));
    }

    @Override // xsna.xoo0
    public final int l2() {
        return 0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        L.e(Integer.valueOf(i));
        if (i != 101) {
            return;
        }
        getFeature().C(a.h.C1081a.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (fo().b != null) {
            twz0 twz0Var = fo().B().b;
            l4z l4zVar = twz0Var.a;
            if (l4zVar != null) {
                l4zVar.onDestroy();
            } else {
                twz0Var.c(1);
            }
        }
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.X = null;
        this.a0.setValue(this, c0[0], null);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        l4z l4zVar = fo().B().b.a;
        if (l4zVar != null) {
            l4zVar.onLowMemory();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        twz0 twz0Var = fo().B().b;
        l4z l4zVar = twz0Var.a;
        if (l4zVar != null) {
            l4zVar.onPause();
        } else {
            twz0Var.c(5);
        }
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        twz0 twz0Var = fo().B().b;
        twz0Var.getClass();
        twz0Var.d(null, new ioz0(twz0Var));
        getFeature().C(a.h.C1081a.b);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        twz0 twz0Var = fo().B().b;
        twz0Var.getClass();
        twz0Var.d(null, new eoz0(twz0Var));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        twz0 twz0Var = fo().B().b;
        l4z l4zVar = twz0Var.a;
        if (l4zVar != null) {
            l4zVar.onStop();
        } else {
            twz0Var.c(4);
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        yv50 fo = fo();
        fo.getClass();
        View requireView = requireView();
        f5z viewLifecycleOwner = getViewLifecycleOwner();
        fo.b = requireView;
        viewLifecycleOwner.getLifecycle().addObserver(new biz(fo));
        fo.getClass();
        km00 km00Var = new km00(fo.b.getContext());
        km00Var.setId(R.id.geo_map_view);
        km00Var.setImportantForAccessibility(2);
        bwt0.Z(R.attr.vk_ui_background_content, km00Var);
        boolean z = false;
        ((CoordinatorLayout) requireView).addView(km00Var, 0, new CoordinatorLayout.f(-1, -1));
        fo.E(dhr0.C().b);
        View view2 = fo.b;
        if (view2 != null) {
            dhr0.W(view2);
        }
        dhr0.f(fo.y);
        fo.q = e3m.a(R.dimen.geo_map_controls_size, fo.b.getContext());
        ((ViewGroup) requireView).addView(fo.A(), -1, -1);
        super.onViewCreated(view, bundle);
        qcy<?>[] qcyVarArr = c0;
        qcy<?> qcyVar = qcyVarArr[0];
        a aVar = this.a0;
        if (aVar.getValue(this, qcyVar) != go()) {
            cil go = go();
            go.c.setValue(go, cil.f[0], aVar.getValue(this, qcyVarArr[0]));
        }
        rpv X = getFeature().X();
        X.getClass();
        getLifecycle().addObserver(new tpv(X));
        final yv50 fo2 = fo();
        aiz.a aVar2 = fo2.i;
        qcy<?>[] qcyVarArr2 = mm00.B;
        jjc.g((ImageButton) aVar2.getValue(fo2, qcyVarArr2[1]), new ayo(fo2, 7));
        jjc.g((ImageButton) fo2.j.getValue(fo2, qcyVarArr2[2]), new ifg(fo2, 21));
        ImageButton k = fo2.k();
        GeoFragmentOptions geoFragmentOptions = (GeoFragmentOptions) this.Q.getValue();
        k.setVisibility(geoFragmentOptions != null ? geoFragmentOptions.b : false ? 8 : 0);
        jjc.g(fo2.k(), new lwh(this, 14));
        fo2.B().i(bundle);
        fo2.B().h(new g780() { // from class: xsna.wv50
            @Override // xsna.g780
            public final void a(s9u s9uVar) {
                dnv dnvVar = s9uVar.a;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"getMapAsync finish!"});
                }
                yv50 yv50Var = yv50.this;
                yv50Var.F = s9uVar;
                com.vk.geo.impl.presentation.b bVar = yv50Var.d;
                s9uVar.i(yv50Var);
                bVar.C(a.e.b);
                try {
                    dnvVar.u(yv50Var.I);
                    bVar.C(new a.d(y8x.a(yv50Var.B().getWidth(), yv50Var.B().getHeight())));
                    yv50Var.E(dhr0.C().b);
                    try {
                        dnvVar.x1();
                        try {
                            dnvVar.r0();
                            b1y f = s9uVar.f();
                            f.getClass();
                            try {
                                ((yov) f.c).t0();
                                b1y f2 = s9uVar.f();
                                f2.getClass();
                                try {
                                    ((yov) f2.c).J0();
                                    b1y f3 = s9uVar.f();
                                    f3.getClass();
                                    try {
                                        ((yov) f3.c).B1();
                                        s9uVar.h(new i630(yv50Var, 4));
                                        s9uVar.j(yv50Var);
                                        View view3 = yv50Var.b;
                                        if (view3 != null) {
                                            view3.postDelayed(yv50Var.J, 1000L);
                                        }
                                    } catch (RemoteException e) {
                                        throw new RuntimeRemoteException(e);
                                    }
                                } catch (RemoteException e2) {
                                    throw new RuntimeRemoteException(e2);
                                }
                            } catch (RemoteException e3) {
                                throw new RuntimeRemoteException(e3);
                            }
                        } catch (RemoteException e4) {
                            throw new RuntimeRemoteException(e4);
                        }
                    } catch (RemoteException e5) {
                        throw new RuntimeRemoteException(e5);
                    }
                } catch (RemoteException e6) {
                    throw new RuntimeRemoteException(e6);
                }
            }
        });
        PermissionHelper permissionHelper = PermissionHelper.a;
        FragmentActivity kn = kn();
        String[] strArr = PermissionHelper.i;
        permissionHelper.getClass();
        boolean b = PermissionHelper.b(kn, strArr);
        yv50 fo3 = fo();
        if (b) {
            Context requireContext = requireContext();
            LocationCommon.a.getClass();
            if (LocationCommon.b(requireContext)) {
                z = true;
            }
        }
        fo3.v(z);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        hyk0.a aVar = this.Y;
        return new b(new okt(kn().getApplication(), (GeoComponentImpl) m7m.d(this).mo408a(fpf0.a(GeoComponent.class)), (GeoFragmentOptions) this.Q.getValue(), aVar instanceof ont ? (ont) aVar : null, this.X, (BoundingBox) this.R.getValue()));
    }

    @Override // xsna.tkt.b
    public final GeoFragment Kh() {
        return this;
    }
}
