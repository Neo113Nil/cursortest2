package com.vk.attachpicker.impl.location;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.fragments.BaseFragment;
import com.vk.dto.attaches.AttachMap;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;
import java.util.List;
import xsna.bwt0;
import xsna.de4;
import xsna.dhr0;
import xsna.e3m;
import xsna.ebs;
import xsna.epx;
import xsna.ey90;
import xsna.f44;
import xsna.g0k0;
import xsna.g3p0;
import xsna.iin0;
import xsna.kn4;
import xsna.krv0;
import xsna.l0i0;
import xsna.m2j;
import xsna.mhy;
import xsna.nds;
import xsna.nht;
import xsna.nxz;
import xsna.s8g0;
import xsna.sp;
import xsna.tvo;
import xsna.wvv;
import xsna.yx90;

/* compiled from: LocationFragment.kt */
/* loaded from: classes15.dex */
public final class LocationFragment extends BaseFragment implements tvo.a, nht, iin0, nds, g0k0 {
    public static final /* synthetic */ int h0 = 0;
    public nxz S;
    public l0i0 U;
    public Toolbar V;
    public AppBarLayout W;
    public FrameLayout X;
    public FrameLayout Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public s8g0 d0;
    public a e0;
    public float f0;
    public final int T = R.layout.fragment_attach_location;
    public String c0 = "";
    public final b g0 = new b();

    /* compiled from: LocationFragment.kt */
    public interface a {
        void N();
    }

    /* compiled from: LocationFragment.kt */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LocationFragment locationFragment = LocationFragment.this;
            nxz nxzVar = locationFragment.S;
            if (nxzVar != null) {
                nxzVar.k.c(locationFragment.f0);
            }
        }
    }

    /* compiled from: LocationFragment.kt */
    public final class d implements l0i0.b {
        public d() {
        }

        @Override // xsna.l0i0.b
        public final void a(String str) {
            if (str == null || str.length() == 0) {
                LocationFragment.io(LocationFragment.this, "");
            }
        }

        @Override // xsna.l0i0.b
        public final void b(String str) {
            if (str == null) {
                str = "";
            }
            LocationFragment.io(LocationFragment.this, str);
        }

        @Override // xsna.l0i0.b
        public final void c(String str) {
            if (str == null) {
                str = "";
            }
            LocationFragment.io(LocationFragment.this, str);
        }
    }

    public static final void io(LocationFragment locationFragment, String str) {
        if (epx.f(locationFragment.c0, str)) {
            return;
        }
        locationFragment.c0 = str;
        nxz nxzVar = locationFragment.S;
        if (nxzVar != null) {
            nxzVar.d1(str);
        }
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        s8g0 s8g0Var = this.d0;
        if (s8g0Var != null) {
            s8g0Var.K0(i, strArr);
        }
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        Toolbar toolbar = this.V;
        if (toolbar != null) {
            g3p0.c(toolbar);
        }
        return this.W;
    }

    public final void jo() {
        if (this.Z) {
            return;
        }
        s8g0 s8g0Var = this.d0;
        if (s8g0Var == null) {
            this.a0 = true;
        } else {
            this.Z = true;
            s8g0Var.c(false);
        }
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return krv0.l(R.attr.vk_ui_background_modal);
    }

    @Override // xsna.g0k0
    public final void n0(float f) {
        this.f0 = f;
        nxz nxzVar = this.S;
        if (nxzVar != null) {
            nxzVar.k.c(f);
        }
        mhy.b(mo2getContext());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        s8g0 s8g0Var = this.d0;
        if (s8g0Var != null) {
            s8g0Var.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.b0 = context instanceof f44;
        if (context instanceof a) {
            this.e0 = (a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Menu menu2;
        Toolbar toolbar = this.V;
        if (toolbar != null && (menu2 = toolbar.getMenu()) != null) {
            menu2.clear();
        }
        l0i0 l0i0Var = this.U;
        if (l0i0Var != null) {
            Toolbar toolbar2 = this.V;
            l0i0Var.a(toolbar2 != null ? toolbar2.getMenu() : null, menuInflater);
        }
        l0i0 l0i0Var2 = this.U;
        if (l0i0Var2 != null) {
            l0i0Var2.c.setVisible(GooglePlayServicesUtil.isGooglePlayServicesAvailable(requireContext()) == 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.T, viewGroup, false);
        this.W = (AppBarLayout) inflate.findViewById(R.id.attach_appbar_layout);
        this.V = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.X = (FrameLayout) inflate.findViewById(R.id.attach_content);
        this.Y = (FrameLayout) inflate.findViewById(R.id.permissions_stub);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.e0 = null;
        wvv wvvVar = wvv.a;
        wvv.a(this.g0);
        nxz nxzVar = this.S;
        if (nxzVar != null) {
            nxzVar.H0();
        }
        this.S = null;
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        s8g0 s8g0Var = this.d0;
        if (s8g0Var != null) {
            s8g0Var.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            appCompatActivity.setSupportActionBar(this.V);
        }
        AppBarLayout appBarLayout = this.W;
        if (appBarLayout != null) {
            bwt0.p0(appBarLayout, !this.b0);
        }
        sp.u(view, dhr0.L() && !this.b0);
        ((AppCompatActivity) getActivity()).setTitle(R.string.check_in_title);
        this.U = new l0i0((Activity) getActivity(), (l0i0.b) new d());
        setHasOptionsMenu(true);
        Toolbar toolbar = this.V;
        Menu menu = toolbar != null ? toolbar.getMenu() : null;
        FragmentActivity activity2 = getActivity();
        onCreateOptionsMenu(menu, activity2 != null ? activity2.getMenuInflater() : null);
        ebs c2 = kn4.c(this);
        FrameLayout frameLayout = this.Y;
        dhr0.a.getClass();
        Context E = dhr0.E();
        ey90 ey90Var = new ey90(e3m.f(R.attr.vk_ui_background_content, E), e3m.f(R.attr.vk_ui_text_subhead, E));
        PermissionHelper.a.getClass();
        this.d0 = new s8g0(c2, frameLayout, ey90Var, new yx90(R.string.vk_permissions_location, 14, PermissionHelper.h, PermissionHelper.i, true), new m2j(this, 23), new de4(19), null, null, null, null);
        if (this.a0) {
            jo();
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        s8g0 s8g0Var = this.d0;
        if (s8g0Var != null) {
            s8g0Var.pc(i, list);
        }
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        s8g0 s8g0Var = this.d0;
        if (s8g0Var != null) {
            s8g0Var.wi(i, list);
        }
    }

    /* compiled from: LocationFragment.kt */
    public final class c implements nxz.a {
        public c() {
        }

        @Override // xsna.nxz.a
        public final void N() {
            a aVar = LocationFragment.this.e0;
            if (aVar != null) {
                aVar.N();
            }
        }

        @Override // xsna.nxz.a
        public final void f(AttachMap attachMap) {
            GeoAttachment geoAttachment = new GeoAttachment();
            geoAttachment.f = attachMap.e;
            geoAttachment.g = attachMap.f;
            geoAttachment.i = attachMap.g;
            LocationFragment.this.Mf(-1, new Intent().putExtra("point", geoAttachment));
        }

        @Override // xsna.nxz.a
        public final void b() {
        }

        @Override // xsna.nxz.a
        public final void c() {
        }

        @Override // xsna.nxz.a
        public final void e() {
        }

        @Override // xsna.nxz.a
        public final void d(AttachMap attachMap, View view) {
        }
    }
}
